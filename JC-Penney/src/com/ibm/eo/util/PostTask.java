// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import android.os.AsyncTask;
import com.ibm.eo.EOCore;
import com.ibm.eo.EOLifecycleObject;
import com.ibm.eo.model.MessageFormat;
import com.ibm.eo.model.TLFCacheFile;
import com.ibm.eo.service.EnvironmentalDataService;
import com.ibm.eo.service.QueueService;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.util:
//            LogInternal, ConnectionReceiver, HTTPUtil, FileUtil, 
//            GCUtil

public class PostTask extends AsyncTask
{

    private static final int BUFFER_SIZE = 40;
    private Boolean _isRunning;

    public PostTask()
    {
        _isRunning = Boolean.valueOf(false);
    }

    private void logResult(String s, String s1, Boolean boolean1)
    {
        StringBuffer stringbuffer = new StringBuffer(40);
        stringbuffer.append("PostTask with session id:");
        stringbuffer.append(s);
        LogInternal.log(stringbuffer.toString());
        if (stringbuffer.length() >= 1)
        {
            stringbuffer.delete(0, stringbuffer.length());
        }
        if (boolean1.booleanValue())
        {
            stringbuffer.append("PostTask image:");
        } else
        {
            stringbuffer.append("PostTask JSON:");
        }
        stringbuffer.append(s1);
        LogInternal.log(stringbuffer.toString());
    }

    private Boolean sendMessageFormat()
    {
        Boolean boolean1 = Boolean.valueOf(false);
        if (EOCore.getEnvironmentalDataService() != null && EOCore.getEnvironmentalDataService().getConnectionReceiver() != null && !EOCore.getEnvironmentalDataService().getConnectionReceiver().isOnline().booleanValue())
        {
            return boolean1;
        }
        QueueService queueservice = (QueueService)EOCore.getLifecycleObject("QueueService");
        Boolean boolean3 = EOCore.getConfigItemBoolean("CompressPostMessage", EOCore.getInstance());
        Boolean boolean2;
        List list;
        java.util.HashMap hashmap;
        String s;
        Date date;
        Iterator iterator;
        TLFCacheFile tlfcachefile;
        if (queueservice != null)
        {
            list = queueservice.messageFormats();
        } else
        {
            list = null;
        }
        boolean2 = boolean1;
        if (list == null) goto _L2; else goto _L1
_L1:
        boolean2 = boolean1;
        if (list.isEmpty()) goto _L2; else goto _L3
_L3:
        hashmap = EOCore.getLifecycleObject(((TLFCacheFile)list.get(0)).getModuleName()).httpHeaders();
        s = EOCore.getConfigItemString("PostMessageUrl", EOCore.getLifecycleObject(((TLFCacheFile)list.get(0)).getModuleName()));
        date = new Date();
        iterator = list.iterator();
        boolean2 = boolean1;
_L5:
        if (iterator.hasNext())
        {
            tlfcachefile = (TLFCacheFile)iterator.next();
            if (tlfcachefile.isImage().booleanValue())
            {
                if (tlfcachefile.getDirectory() == null)
                {
                    boolean1 = HTTPUtil.sendHttpImagePost(s, tlfcachefile.getSessionId(), tlfcachefile.getFileName(), (ByteArrayOutputStream)tlfcachefile.getData(), hashmap);
                } else
                {
                    boolean1 = HTTPUtil.sendHttpImagePost(s, tlfcachefile.getSessionId(), tlfcachefile.getDirectory(), tlfcachefile.getFileName(), hashmap);
                }
                if (boolean1.booleanValue())
                {
                    logResult(tlfcachefile.getSessionId(), tlfcachefile.getFileName(), Boolean.valueOf(true));
                    if (tlfcachefile.getDirectory() != null)
                    {
                        FileUtil.deleteFile(tlfcachefile.getDirectory(), tlfcachefile.getFileName());
                    }
                }
            } else
            {
                boolean1 = boolean2;
                if (tlfcachefile.getData() != null)
                {
                    if ("DigitalAnalytics".equals(tlfcachefile.getModuleName()))
                    {
                        boolean1 = HTTPUtil.sendHttpGet(s, tlfcachefile.getSessionId(), (String)tlfcachefile.getData(), hashmap);
                        logResult(tlfcachefile.getSessionId(), (String)tlfcachefile.getData(), Boolean.valueOf(false));
                    } else
                    {
                        boolean1 = HTTPUtil.sendHttpPost(s, tlfcachefile.getSessionId(), (String)tlfcachefile.getData(), boolean3, tlfcachefile.getHasUICData(), hashmap);
                        logResult(tlfcachefile.getSessionId(), (String)tlfcachefile.getData(), Boolean.valueOf(false));
                    }
                }
            }
            boolean2 = boolean1;
            if (boolean1.booleanValue())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (EOCore.getConfigItemBoolean("PersistLocalCache", EOCore.getInstance()).booleanValue())
            {
                FileUtil.saveObject(tlfcachefile, "TLFCache", (new StringBuilder()).append("cache_").append(date.getTime()).toString());
                LogInternal.log("Saving to device.");
            } else
            {
                if (queueservice != null)
                {
                    queueservice.addToMemoryFiles(tlfcachefile);
                }
                if (tlfcachefile.getData() instanceof MessageFormat)
                {
                    LogInternal.log((new StringBuilder()).append("Save to memory queue:").append(((MessageFormat)tlfcachefile.getData()).getJSON().toString()).toString());
                }
            }
            LogInternal.log("Could not send message.");
            boolean2 = boolean1;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        GCUtil.clean(list);
        return boolean2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final transient Boolean doInBackground(Void avoid[])
    {
        try
        {
            _isRunning = Boolean.valueOf(true);
            avoid = sendMessageFormat();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            LogInternal.logException(avoid);
            return Boolean.valueOf(false);
        }
        return avoid;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    public final Boolean isRunning()
    {
        return _isRunning;
    }

    protected final void onPostExecute(Boolean boolean1)
    {
        _isRunning = Boolean.valueOf(false);
        boolean1 = (QueueService)EOCore.getLifecycleObject("QueueService");
        if (boolean1 != null)
        {
            boolean1.closePostTask();
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }
}
