// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo;

import android.app.Application;
import com.ibm.eo.model.EOMessage;
import com.ibm.eo.service.ConfigService;
import com.ibm.eo.service.EnvironmentalDataService;
import com.ibm.eo.service.QueueService;
import com.ibm.eo.util.LogInternal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.ibm.eo:
//            EOLifecycleObjectName, EOLifecycleObject

public final class EOCore
    implements EOLifecycleObjectName
{

    private static final String CONFIG_SERVICE_NAME = "ConfigService";
    private static final String ENVIRONMENTAL_DATA_SERVICE_NAME = "EnvironmentalDataService";
    private static final int MILLISECOND_MULTIPLIER = 1000;
    private static final String QUEUE_SERVICE_NAME = "QueueService";
    private static Boolean _appLoaded = Boolean.valueOf(false);
    private static int _applicationInForegroundCounter = 0;
    private static Boolean _isEnabled = Boolean.valueOf(false);
    private static volatile EOCore _myInstance;
    private static Application application;
    private static HashMap classReferences = new HashMap();

    private EOCore()
    {
    }

    public static boolean addModule(String s, EOLifecycleObject eolifecycleobject)
    {
        boolean flag;
        try
        {
            classReferences.put(s, eolifecycleobject);
            getConfigService().loadConfig(eolifecycleobject);
            flag = classReferences.containsKey(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
            return false;
        }
        return flag;
    }

    private static boolean addService(String s, String s1)
    {
        try
        {
            s1 = ((String) (Class.forName(s1).newInstance()));
            if (s1 instanceof EOLifecycleObject)
            {
                classReferences.put(s, (EOLifecycleObject)s1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            LogInternal.logException(s1);
        }
        return classReferences.containsKey(s);
    }

    public static boolean canPostMessage(int i)
    {
        return i <= QueueService.getLogLevel();
    }

    public static boolean disable()
    {
        Iterator iterator = classReferences.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if ((obj instanceof EOLifecycleObject) && obj != null && ((EOLifecycleObject)obj).isEnabled())
            {
                ((EOLifecycleObject)obj).disable();
            }
        } while (true);
        _isEnabled = Boolean.valueOf(false);
        return true;
    }

    public static boolean disableAll()
    {
        Iterator iterator = classReferences.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if ((obj instanceof EOLifecycleObject) && obj != null && ((EOLifecycleObject)obj).isEnabled())
            {
                ((EOLifecycleObject)obj).disable();
            }
        } while (true);
        _isEnabled = Boolean.valueOf(false);
        return _isEnabled.booleanValue();
    }

    public static boolean enable(Application application1)
    {
        com/ibm/eo/EOCore;
        JVM INSTR monitorenter ;
        application = application1;
        com/ibm/eo/EOCore;
        JVM INSTR monitorexit ;
        if (!isEnabled())
        {
            addService("ConfigService", com/ibm/eo/service/ConfigService.getName());
            addService("QueueService", com/ibm/eo/service/QueueService.getName());
            addService("EnvironmentalDataService", com/ibm/eo/service/EnvironmentalDataService.getName());
        }
        enableAll();
        startSession();
        return _isEnabled.booleanValue();
        application1;
        com/ibm/eo/EOCore;
        JVM INSTR monitorexit ;
        throw application1;
    }

    private static Boolean enableAll()
    {
        enableModule("ConfigService");
        enableModule("QueueService");
        enableModule("EnvironmentalDataService");
        _isEnabled = Boolean.valueOf(true);
        return _isEnabled;
    }

    public static boolean enableModule(String s)
    {
        s = (EOLifecycleObject)classReferences.get(s);
        if (s != null)
        {
            if (s.isEnabled())
            {
                return s.isEnabled();
            } else
            {
                return s.enable();
            }
        } else
        {
            return false;
        }
    }

    public static Boolean flushQueues()
    {
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (queueservice != null)
        {
            return queueservice.flushQueues();
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    public static Application getApplication()
    {
        return application;
    }

    public static Boolean getConfigItemBoolean(String s, EOLifecycleObjectName eolifecycleobjectname)
    {
        boolean flag;
        try
        {
            flag = Boolean.parseBoolean(getConfigService().getConfigItem(s, eolifecycleobjectname));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public static int getConfigItemInt(String s, EOLifecycleObjectName eolifecycleobjectname)
    {
        int i;
        try
        {
            i = Integer.parseInt(getConfigService().getConfigItem(s, eolifecycleobjectname));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
            return -1;
        }
        return i;
    }

    public static long getConfigItemLong(String s, EOLifecycleObjectName eolifecycleobjectname)
    {
        long l;
        try
        {
            l = Long.parseLong(getConfigService().getConfigItem(s, eolifecycleobjectname));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
            return -1L;
        }
        return l;
    }

    public static long getConfigItemLongMSFromMinute(String s, EOLifecycleObjectName eolifecycleobjectname)
    {
        long l;
        try
        {
            l = Long.parseLong(getConfigService().getConfigItem(s, eolifecycleobjectname));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
            return -1L;
        }
        return l * 1000L;
    }

    public static String getConfigItemString(String s, EOLifecycleObjectName eolifecycleobjectname)
    {
        try
        {
            s = getConfigService().getConfigItem(s, eolifecycleobjectname);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
            return null;
        }
        return s;
    }

    private static ConfigService getConfigService()
    {
        if (classReferences.containsKey("ConfigService"))
        {
            return (ConfigService)classReferences.get("ConfigService");
        } else
        {
            addService("ConfigService", com/ibm/eo/service/ConfigService.getName());
            return (ConfigService)classReferences.get("ConfigService");
        }
    }

    public static String getCurrentSessionId()
    {
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (queueservice != null)
        {
            return queueservice.getCurrentSessionId();
        } else
        {
            return null;
        }
    }

    public static String getDeviceId()
    {
        return getEnvironmentalDataService().getDeviceId();
    }

    public static EnvironmentalDataService getEnvironmentalDataService()
    {
        return (EnvironmentalDataService)getLifecycleObject("EnvironmentalDataService");
    }

    public static String getHttpXTealeafProperty()
    {
        if (getEnvironmentalDataService() == null || getEnvironmentalDataService().getHttpXTealeafProperty() == null)
        {
            return "";
        } else
        {
            return getEnvironmentalDataService().getHttpXTealeafProperty();
        }
    }

    public static EOCore getInstance()
    {
        com/ibm/eo/EOCore;
        JVM INSTR monitorenter ;
        EOCore eocore;
        if (_myInstance == null)
        {
            _myInstance = new EOCore();
        }
        eocore = _myInstance;
        com/ibm/eo/EOCore;
        JVM INSTR monitorexit ;
        return eocore;
        Exception exception;
        exception;
        throw exception;
    }

    public static String getLibraryVersion()
    {
        return getConfigItemString("LibraryVersion", getInstance());
    }

    public static EOLifecycleObject getLifecycleObject(String s)
    {
        return (EOLifecycleObject)classReferences.get(s);
    }

    public static String getMessageVersion()
    {
        return getConfigItemString("MessageVersion", getInstance());
    }

    public static long getTimestampFromSession()
    {
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (queueservice != null)
        {
            return queueservice.timestampFromSession();
        } else
        {
            return 0L;
        }
    }

    public static Boolean hasBeenPostedInBackground()
    {
        return Boolean.valueOf(true);
    }

    public static Boolean isApplicationInBackground()
    {
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (queueservice != null)
        {
            if (_applicationInForegroundCounter <= 0 && !queueservice.hasBeenPostedInBackground().booleanValue())
            {
                return Boolean.valueOf(true);
            }
        } else
        if (_applicationInForegroundCounter <= 0)
        {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }

    public static boolean isEnabled()
    {
        return _isEnabled.booleanValue();
    }

    public static boolean onDestroy()
    {
        return true;
    }

    public static boolean onLowMemory()
    {
        return true;
    }

    public static boolean onPause()
    {
        EnvironmentalDataService environmentaldataservice = getEnvironmentalDataService();
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (environmentaldataservice != null)
        {
            environmentaldataservice.onPauseEO();
        }
        if (queueservice != null)
        {
            queueservice.onPauseEO();
        }
        return true;
    }

    public static Boolean onPauseNoActivityInForeground()
    {
        if (!_appLoaded.booleanValue())
        {
            return Boolean.valueOf(false);
        }
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (queueservice != null)
        {
            queueservice.flushQueues();
        }
        return Boolean.valueOf(true);
    }

    public static boolean onResume()
    {
        EnvironmentalDataService environmentaldataservice = getEnvironmentalDataService();
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (environmentaldataservice != null)
        {
            environmentaldataservice.onResumeEO();
        }
        if (queueservice != null)
        {
            queueservice.onPauseEO();
        }
        return true;
    }

    public static boolean onTerminate()
    {
        disable();
        return true;
    }

    public static Boolean postMessage(EOLifecycleObject eolifecycleobject, EOMessage eomessage)
    {
        return Boolean.valueOf(postMessage(eolifecycleobject, eomessage, getCurrentSessionId()));
    }

    public static boolean postMessage(EOLifecycleObject eolifecycleobject, EOMessage eomessage, String s)
    {
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (queueservice != null)
        {
            return queueservice.postMessage(eolifecycleobject, eomessage, s).booleanValue();
        } else
        {
            return false;
        }
    }

    public static void setApplication(Application application1)
    {
        application = application1;
    }

    public static Boolean setDeviceId(String s)
    {
        if (getEnvironmentalDataService() != null)
        {
            return getEnvironmentalDataService().setDeviceId(s);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    private static Boolean startSession()
    {
        QueueService queueservice = (QueueService)getLifecycleObject("QueueService");
        if (queueservice != null)
        {
            queueservice.startSession();
        }
        return Boolean.valueOf(true);
    }

    public static Boolean updateConfig(String s, String s1, EOLifecycleObjectName eolifecycleobjectname)
    {
        try
        {
            getConfigService().updateConfig(s, s1, eolifecycleobjectname);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
        }
        return Boolean.valueOf(false);
    }

    public String name()
    {
        return "EOCore";
    }

}
