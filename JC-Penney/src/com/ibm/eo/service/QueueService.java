// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.service;

import android.os.Handler;
import android.os.Looper;
import com.ibm.eo.EOCore;
import com.ibm.eo.EOLifecycleObject;
import com.ibm.eo.model.EOMessage;
import com.ibm.eo.model.EOMonitoringLevel;
import com.ibm.eo.model.JSONMessage;
import com.ibm.eo.model.MessageFormat;
import com.ibm.eo.model.QueueModel;
import com.ibm.eo.model.Session;
import com.ibm.eo.model.TLFCacheFile;
import com.ibm.eo.util.FileUtil;
import com.ibm.eo.util.LogInternal;
import com.ibm.eo.util.PostTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.service:
//            EnvironmentalDataService

public class QueueService
    implements EOLifecycleObject
{

    private static final int MILLISECOND_MULTIPLIER = 1000;
    private static final int PERCENT = 100;
    private static Boolean _hasBeenPostedInBackground = Boolean.valueOf(false);
    private static int _logLevel;
    private static PostTask _postTask;
    private String _currentSessionId;
    private long _currentSessionStartedDate;
    private Boolean _isEnabled;
    private List _memoryFiles;
    private TimerTask _postTimerTask;
    private QueueModel _sessions;

    public QueueService()
    {
        _isEnabled = Boolean.valueOf(false);
    }

    private Boolean cleanByCacheLevel()
    {
        Iterator iterator = getQueueModel().getSessions().keySet().iterator();
_L6:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_191;
        }
        obj = (String)iterator.next();
        obj = ((LinkedHashMap)getQueueModel().getSessions().get(obj)).values().iterator();
_L4:
        Session session;
        if (!((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        session = (Session)((Iterator) (obj)).next();
        if (session == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj1;
        if (session.getMessages() == null || session.getMessages().size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = session.getMessages();
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((List) (obj1)).iterator();
_L2:
        JSONMessage jsonmessage;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonmessage = (JSONMessage)((Iterator) (obj1)).next();
        } while (jsonmessage == null);
        if (jsonmessage.getLogLevel() > getCacheLevel())
        {
            session.getMessages().remove(jsonmessage);
            getQueueModel().sub(jsonmessage.getSize());
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        LogInternal.logException(exception);
        return Boolean.valueOf(true);
    }

    private Boolean cleanByIdealSize(long l)
    {
        Iterator iterator = getQueueModel().getSessions().keySet().iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj = (String)iterator.next();
        obj = ((LinkedHashMap)getQueueModel().getSessions().get(obj)).values().iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Session session = (Session)((Iterator) (obj)).next();
        if (session == null) goto _L4; else goto _L3
_L3:
        if (session.getMessages() == null || session.getMessages().size() <= 0) goto _L4; else goto _L5
_L5:
        List list = session.getMessages();
        if (list == null) goto _L4; else goto _L6
_L6:
        int i = list.size() - 1;
_L9:
        if (i < 0) goto _L4; else goto _L7
_L7:
        if (getQueueModel().getCurrentBufferSize() <= l) goto _L4; else goto _L8
_L8:
        JSONMessage jsonmessage = (JSONMessage)list.get(i);
        if (jsonmessage == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        session.getMessages().remove(jsonmessage);
        getQueueModel().sub(jsonmessage.getSize());
        i--;
          goto _L9
        Exception exception;
        exception;
        LogInternal.logException(exception);
        return Boolean.valueOf(true);
    }

    private MessageFormat createMessageFormat(String s, String s1)
    {
        Object obj = (Session)((LinkedHashMap)getQueueModel().getSessions().get(s)).get(s1);
        if (((Session) (obj)).getMessages() == null || ((Session) (obj)).getMessages().isEmpty())
        {
            return null;
        }
        obj = new MessageFormat();
        ((MessageFormat) (obj)).setModuleName(s);
        ((MessageFormat) (obj)).setMessageVersion(EOCore.getMessageVersion());
        ((MessageFormat) (obj)).setSerialNumber(((Session)((LinkedHashMap)getQueueModel().getSessions().get(s)).get(s1)).getMessageVersion().intValue());
        ((Session)((LinkedHashMap)getQueueModel().getSessions().get(s)).get(s1)).setMessageVersion(Integer.valueOf(((MessageFormat) (obj)).getSerialNumber() + 1));
        if (((LinkedHashMap)getQueueModel().getSessions().get(s)).get(s1) != null)
        {
            ((Session)((LinkedHashMap)getQueueModel().getSessions().get(s)).get(s1)).setClientEnvironment(EOCore.getEnvironmentalDataService().createClientEnvironment());
            ((MessageFormat) (obj)).setSession((Session)((LinkedHashMap)getQueueModel().getSessions().get(s)).get(s1));
            LogInternal.log((new StringBuilder()).append("MessageFormat created:").append(((MessageFormat) (obj)).getJSON().toString()).toString());
        }
        return ((MessageFormat) (obj));
    }

    private Session createSession(String s)
    {
        saveToCache(Boolean.valueOf(false));
        Session session = new Session();
        session.setSessionStartTime((new Date()).getTime());
        session.setSessionID(s);
        return session;
    }

    private String createSessionId()
    {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase(Locale.ENGLISH);
    }

    private TLFCacheFile createTLFCacheFile(MessageFormat messageformat, String s)
    {
        return new TLFCacheFile(messageformat.getJSON().toString(), messageformat.getSession().getSessionID(), messageformat.getSession().getHasUICData(), messageformat.getModuleName());
    }

    public static int getLogLevel()
    {
        if (_logLevel == EOMonitoringLevel.kEOMonitoringLevelIgnore.getValue())
        {
            return EOMonitoringLevel.kEOMonitoringLevelDebug.getValue();
        } else
        {
            return _logLevel;
        }
    }

    private QueueModel getQueueModel()
    {
        this;
        JVM INSTR monitorenter ;
        QueueModel queuemodel;
        if (_sessions == null)
        {
            _sessions = new QueueModel();
        }
        queuemodel = _sessions;
        this;
        JVM INSTR monitorexit ;
        return queuemodel;
        Exception exception;
        exception;
        throw exception;
    }

    public static void setCurrentLogLevel(Boolean boolean1, Boolean boolean2, Boolean boolean3)
    {
        if (!boolean1.booleanValue())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (!boolean2.booleanValue()) goto _L2; else goto _L1
_L1:
        _logLevel = EOCore.getConfigItemInt("PostMessageLevelWiFi", EOCore.getInstance());
_L4:
        return;
_L2:
        if (!boolean3.booleanValue()) goto _L4; else goto _L3
_L3:
        _logLevel = EOCore.getConfigItemInt("PostMessageLevelCellular", EOCore.getInstance());
        return;
        _logLevel = EOCore.getConfigItemInt("LoggingLevel", EOCore.getInstance());
        return;
    }

    private void setupPostTask()
    {
        this;
        JVM INSTR monitorenter ;
        if (getManualPostEnabled().booleanValue()) goto _L2; else goto _L1
_L1:
        TimerTask timertask = _postTimerTask;
        if (timertask == null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (_postTimerTask != null)
        {
            _postTimerTask.cancel();
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        Timer timer = new Timer();
        _postTimerTask = new _cls1();
        timer.schedule(_postTimerTask, 0L, getPostMessageTimeIntervals());
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final Boolean addToMemoryFiles(TLFCacheFile tlfcachefile)
    {
        return Boolean.valueOf(getMemoryFiles().add(tlfcachefile));
    }

    public final Boolean closePostTask()
    {
        this;
        JVM INSTR monitorenter ;
        if (_postTask != null)
        {
            _postTask = null;
        }
        if (EOCore.isApplicationInBackground().booleanValue())
        {
            EOCore.onPauseNoActivityInForeground();
            _hasBeenPostedInBackground = Boolean.valueOf(true);
        }
        this;
        JVM INSTR monitorexit ;
        return Boolean.valueOf(true);
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean disable()
    {
        _isEnabled = Boolean.valueOf(false);
        return true;
    }

    public final boolean enable()
    {
        setupPostTask();
        _isEnabled = Boolean.valueOf(true);
        return _isEnabled.booleanValue();
    }

    public final Boolean flushQueues()
    {
        saveToCache(Boolean.valueOf(true));
        return Boolean.valueOf(true);
    }

    public final int getBufferPercent()
    {
        return EOCore.getConfigItemInt("BufferPercent", EOCore.getInstance());
    }

    public final int getCacheLevel()
    {
        return EOCore.getConfigItemInt("CachingLevel", EOCore.getInstance());
    }

    public final long getCachedFileMaxBytesSize()
    {
        return EOCore.getConfigItemLong("CachedFileMaxBytesSize", EOCore.getInstance());
    }

    public final String getCurrentSessionId()
    {
        if (_currentSessionId == null)
        {
            setCurrentSessionId(createSessionId());
            LogInternal.log((new StringBuilder()).append("Session id was null will need to autogenerate a new id:").append(getCurrentSessionId()).toString());
        }
        return _currentSessionId;
    }

    public final Boolean getHasToPersistLocalCache()
    {
        return EOCore.getConfigItemBoolean("PersistLocalCache", EOCore.getInstance());
    }

    public final Boolean getManualPostEnabled()
    {
        return EOCore.getConfigItemBoolean("ManualPostEnabled", EOCore.getInstance());
    }

    public final List getMemoryFiles()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        if (_memoryFiles == null)
        {
            _memoryFiles = new CopyOnWriteArrayList();
        }
        list = _memoryFiles;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public final long getPostMessageMaxBytesSize()
    {
        return EOCore.getConfigItemLong("PostMessageMaxBytesSize", EOCore.getInstance());
    }

    public final long getPostMessageTimeIntervals()
    {
        return EOCore.getConfigItemLong("PostMessageTimeInterval", EOCore.getInstance()) * 1000L;
    }

    public final long getTLFCacheFileMaxBytesSize()
    {
        if (getCachedFileMaxBytesSize() > getPostMessageMaxBytesSize())
        {
            return getPostMessageMaxBytesSize();
        } else
        {
            return getCachedFileMaxBytesSize();
        }
    }

    public final Boolean hasBeenPostedInBackground()
    {
        return _hasBeenPostedInBackground;
    }

    public final HashMap httpHeaders()
    {
        return null;
    }

    public final boolean isEnabled()
    {
        return _isEnabled.booleanValue();
    }

    public final List messageFormats()
    {
        Object obj1 = new ArrayList();
        if (!getHasToPersistLocalCache().booleanValue()) goto _L2; else goto _L1
_L1:
        obj1 = FileUtil.getObjects("TLFCache");
_L7:
        if (!((List) (obj1)).isEmpty() || getQueueModel().getMessageCount() <= 0L) goto _L4; else goto _L3
_L3:
        Object obj2 = getQueueModel().getSessions().keySet().iterator();
_L5:
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        String s = (String)((Iterator) (obj2)).next();
        Object obj = null;
        Iterator iterator = ((LinkedHashMap)getQueueModel().getSessions().get(s)).keySet().iterator();
        Exception exception;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MessageFormat messageformat = createMessageFormat(s, (String)iterator.next());
            if (messageformat != null && messageformat.getSession() != null && messageformat.getSession().getSessionID() != null)
            {
                ((List) (obj1)).add(createTLFCacheFile(messageformat, s));
                if (obj == null)
                {
                    obj = messageformat.getSession();
                }
            }
        } while (true);
        if (obj != null)
        {
            ((Session) (obj)).getMessages().clear();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (getMemoryFiles().size() > 0 && getMemoryFiles().size() > 0)
        {
            obj = getMemoryFiles().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                obj2 = (TLFCacheFile)((Iterator) (obj)).next();
                ((List) (obj1)).add(obj2);
                try
                {
                    getMemoryFiles().remove(obj2);
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception)
                {
                    LogInternal.logException(exception);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        return ((List) (obj1));
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final String name()
    {
        return "Queue Service";
    }

    public final boolean onDestroyEO()
    {
        return true;
    }

    public final boolean onLowMemoryEO()
    {
        return true;
    }

    public final boolean onPauseEO()
    {
        return true;
    }

    public final boolean onResumeEO()
    {
        _hasBeenPostedInBackground = Boolean.valueOf(false);
        setupPostTask();
        return true;
    }

    public final boolean onTerminateEO()
    {
        return true;
    }

    public final Boolean postMessage(EOLifecycleObject eolifecycleobject, EOMessage eomessage, String s)
    {
        Object obj;
        Boolean boolean1;
        if (s == null)
        {
            s = createSessionId();
        }
        boolean1 = Boolean.valueOf(false);
        obj = boolean1;
        if (eolifecycleobject != null)
        {
            if (eomessage == null)
            {
                obj = boolean1;
            } else
            {
                JSONMessage jsonmessage = new JSONMessage(eomessage);
                obj = boolean1;
                if (jsonmessage.getJsonData() != null)
                {
                    obj = boolean1;
                    if (!"{}".equals(jsonmessage.getJsonData()))
                    {
                        obj = boolean1;
                        if (eomessage.getLogLevel().intValue() > EOMonitoringLevel.kEOMonitoringLevelIgnore.getValue())
                        {
                            obj = boolean1;
                            if (eomessage.getLogLevel().intValue() <= getLogLevel())
                            {
                                if (getQueueModel().getCurrentBufferSize() >= getTLFCacheFileMaxBytesSize())
                                {
                                    cleanByCacheLevel();
                                    long l = getTLFCacheFileMaxBytesSize() - (getTLFCacheFileMaxBytesSize() * (long)getBufferPercent()) / 100L;
                                    if (getQueueModel().getCurrentBufferSize() > l)
                                    {
                                        cleanByIdealSize(l);
                                    }
                                }
                                long l1 = sizeOfObject(jsonmessage);
                                jsonmessage.setSize(l1);
                                if (getQueueModel().getSessions().get(eolifecycleobject.name()) != null && ((LinkedHashMap)getQueueModel().getSessions().get(eolifecycleobject.name())).get(s) != null && ((Session)((LinkedHashMap)getQueueModel().getSessions().get(eolifecycleobject.name())).get(s)).getMessages() != null)
                                {
                                    eomessage = Boolean.valueOf(((Session)((LinkedHashMap)getQueueModel().getSessions().get(eolifecycleobject.name())).get(s)).getMessages().add(jsonmessage));
                                } else
                                {
                                    eomessage = new LinkedHashMap();
                                    Session session = createSession(s);
                                    boolean flag = session.getMessages().add(jsonmessage);
                                    eomessage.put(s, session);
                                    getQueueModel().getSessions().put(eolifecycleobject.name(), eomessage);
                                    eomessage = Boolean.valueOf(flag);
                                }
                                if (eomessage.booleanValue())
                                {
                                    obj = new StringBuffer("ModuleName:");
                                    ((StringBuffer) (obj)).append(eolifecycleobject.name().toString());
                                    ((StringBuffer) (obj)).append(" SessionId:");
                                    ((StringBuffer) (obj)).append(s.toString());
                                    ((StringBuffer) (obj)).append(" Added:");
                                    ((StringBuffer) (obj)).append(jsonmessage.toString());
                                    LogInternal.log(((StringBuffer) (obj)).toString());
                                    getQueueModel().add(l1);
                                    obj = eomessage;
                                    if (jsonmessage.getHasUICData().booleanValue())
                                    {
                                        ((Session)((LinkedHashMap)getQueueModel().getSessions().get(eolifecycleobject.name())).get(s)).setHasUICData(Boolean.valueOf(true));
                                        return eomessage;
                                    }
                                } else
                                {
                                    LogInternal.log("Has not been added.");
                                    return eomessage;
                                }
                            }
                        }
                    }
                }
            }
        }
        return ((Boolean) (obj));
    }

    public final Boolean saveToCache(Boolean boolean1)
    {
        Object obj = Boolean.valueOf(false);
        if (getQueueModel() != null && getQueueModel().getMessageCount() > 0L) goto _L2; else goto _L1
_L1:
        boolean1 = ((Boolean) (obj));
_L8:
        return boolean1;
_L2:
        Object obj2;
        Iterator iterator = getQueueModel().getSessions().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Iterator iterator1 = ((LinkedHashMap)getQueueModel().getSessions().get(s)).values().iterator();
            Object obj1 = obj;
            do
            {
                obj = obj1;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj = createMessageFormat(s, ((Session)iterator1.next()).getSessionID());
                if (obj != null)
                {
                    obj1 = new Date();
                    obj = createTLFCacheFile(((MessageFormat) (obj)), s);
                    if (getHasToPersistLocalCache().booleanValue())
                    {
                        obj1 = FileUtil.saveObject(obj, "TLFCache", (new StringBuilder()).append("cache_").append(((Date) (obj1)).getTime()).toString());
                    } else
                    {
                        obj1 = addToMemoryFiles(((TLFCacheFile) (obj)));
                    }
                }
            } while (true);
        } while (true);
        obj2 = obj;
        if (!boolean1.booleanValue()) goto _L4; else goto _L3
_L3:
        if (_postTimerTask == null) goto _L6; else goto _L5
_L5:
        _postTimerTask.cancel();
        _postTimerTask = null;
_L9:
        obj2 = Boolean.valueOf(true);
_L4:
        boolean1 = ((Boolean) (obj2));
        if (!((Boolean) (obj2)).booleanValue()) goto _L8; else goto _L7
_L7:
        getQueueModel().clear();
        return ((Boolean) (obj2));
_L6:
        _postTask = new PostTask();
        _postTask.execute(new Void[0]);
        _postTask = null;
          goto _L9
        boolean1;
        LogInternal.logException(boolean1);
        obj2 = obj;
          goto _L4
    }

    public final void setCurrentSessionId(String s)
    {
        _currentSessionId = s;
    }

    public final long sizeOfObject(Object obj)
    {
        int i;
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
            objectoutputstream.writeObject(obj);
            objectoutputstream.flush();
            objectoutputstream.close();
            bytearrayoutputstream.close();
            i = bytearrayoutputstream.toByteArray().length;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            LogInternal.logException(((Throwable) (obj)));
            return 0L;
        }
        return (long)i;
    }

    public final Boolean startSession()
    {
        _currentSessionStartedDate = (new Date()).getTime();
        setCurrentSessionId(createSessionId());
        return Boolean.valueOf(true);
    }

    public final long timestampFromSession()
    {
        return (new Date()).getTime() - _currentSessionStartedDate;
    }

    static 
    {
        _logLevel = EOMonitoringLevel.kEOMonitoringLevelIgnore.getValue();
    }



/*
    static PostTask access$002(PostTask posttask)
    {
        _postTask = posttask;
        return posttask;
    }

*/

    private class _cls1 extends TimerTask
    {

        final QueueService this$0;
        final Handler val$handler;

        public void run()
        {
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    try
                    {
                        if (QueueService._postTask == null)
                        {
                            QueueService._postTask = new PostTask();
                            QueueService._postTask.execute(new Void[0]);
                        }
                        return;
                    }
                    catch (Exception exception)
                    {
                        LogInternal.logException(exception);
                    }
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            handler.post(new _cls1());
        }

        _cls1()
        {
            this$0 = QueueService.this;
            handler = handler1;
            super();
        }
    }

}
