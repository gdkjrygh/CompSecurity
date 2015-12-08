// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.skype.android.push.adm.ADMPushRegistration;
import com.skype.android.push.gcm.GCMRegistration;
import com.skype.android.push.nna.NokiaPushRegistration;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            PushServiceType, PushRegistration, PushConfiguration, PushListener, 
//            PushRegistrationException, PushMessageParser, RegistrationReason, PushMessage

public class PushManager
{

    private static final String PREFERENCE_KEY_BUILD_FINGERPRINT = "buildFingerPrint";
    private static final String PREFERENCE_KEY_REGISTRATION_TIME = "registrationTime";
    private static final String PREFERENCE_KEY_VERSION_CODE = "versionCode";
    private static final String PREFERENCE_NAME = "push";
    private static PushManager instance;
    private static final Logger log = Logger.getLogger(com/skype/android/push/PushManager.getSimpleName());
    private PushConfiguration configuration;
    private Application context;
    private Set listeners;
    private Map services;

    private PushManager(Application application)
    {
        context = application;
        listeners = new CopyOnWriteArraySet();
        services = new EnumMap(com/skype/android/push/PushServiceType);
    }

    private void checkConfiguration()
    {
        if (configuration == null)
        {
            throw new IllegalStateException("no configuration set");
        } else
        {
            return;
        }
    }

    private boolean checkFirmwareUpdate()
    {
        String s = getPreferences().getString("buildFingerPrint", "");
        return !Build.FINGERPRINT.equalsIgnoreCase(s);
    }

    private boolean checkVersionChanged()
    {
        boolean flag = false;
        if (getVersionCode() != getPreferences().getInt("versionCode", 0))
        {
            flag = true;
        }
        return flag;
    }

    public static PushManager getInstance(Context context1)
    {
        com/skype/android/push/PushManager;
        JVM INSTR monitorenter ;
        if (context1 != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new IllegalArgumentException("null context");
        context1;
        com/skype/android/push/PushManager;
        JVM INSTR monitorexit ;
        throw context1;
        if (instance == null)
        {
            instance = new PushManager((Application)context1.getApplicationContext());
        }
        context1 = instance;
        com/skype/android/push/PushManager;
        JVM INSTR monitorexit ;
        return context1;
    }

    private SharedPreferences getPreferences()
    {
        return context.getSharedPreferences("push", 0);
    }

    private long getRegistrationTimestamp()
    {
        return getPreferences().getLong("registrationTime", 0L);
    }

    private int getVersionCode()
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return 0;
        }
        return i;
    }

    private void saveVersion()
    {
        int i = getVersionCode();
        getPreferences().edit().putInt("versionCode", i).putLong("registrationTime", System.currentTimeMillis()).putString("buildFingerPrint", Build.FINGERPRINT).commit();
    }

    public boolean addListener(PushListener pushlistener)
    {
        if (pushlistener == null)
        {
            throw new IllegalArgumentException("null listener");
        } else
        {
            return listeners.add(pushlistener);
        }
    }

    public boolean checkRegistrationTTLExpired(PushServiceType pushservicetype)
    {
        PushRegistration pushregistration = (PushRegistration)services.get(pushservicetype);
        if (pushregistration != null)
        {
            long l = System.currentTimeMillis();
            long l1 = getRegistrationTimestamp();
            if (l1 > 0L && (l - l1) / 1000L >= (long)getConfiguration().getRegistrationTTLSeconds(pushservicetype))
            {
                for (pushservicetype = listeners.iterator(); pushservicetype.hasNext(); ((PushListener)pushservicetype.next()).onRegistrationExpired(pushregistration)) { }
                return true;
            }
        }
        return false;
    }

    public PushConfiguration getConfiguration()
    {
        return configuration;
    }

    public EnumSet getRegisteredServices()
    {
        EnumSet enumset = EnumSet.noneOf(com/skype/android/push/PushServiceType);
        Iterator iterator = services.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PushRegistration pushregistration = (PushRegistration)iterator.next();
            if (pushregistration.isRegistered())
            {
                enumset.add(pushregistration.getServiceType());
            }
        } while (true);
        return enumset;
    }

    public String getRegistrationToken(PushServiceType pushservicetype)
    {
        pushservicetype = (PushRegistration)services.get(pushservicetype);
        if (pushservicetype != null)
        {
            return pushservicetype.getRegistrationToken();
        } else
        {
            return null;
        }
    }

    public EnumSet getSupportedServices()
    {
        EnumSet enumset = EnumSet.noneOf(com/skype/android/push/PushServiceType);
        Iterator iterator = services.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PushRegistration pushregistration = (PushRegistration)iterator.next();
            if (pushregistration.isSupported())
            {
                enumset.add(pushregistration.getServiceType());
            }
        } while (true);
        return enumset;
    }

    public boolean isAnyServiceRegistered()
    {
        return getRegisteredServices().size() > 0;
    }

    public boolean isAnyServiceSupported()
    {
        return getSupportedServices().size() > 0;
    }

    public boolean isRegistered(PushServiceType pushservicetype)
    {
        for (Iterator iterator = services.values().iterator(); iterator.hasNext();)
        {
            PushRegistration pushregistration = (PushRegistration)iterator.next();
            if (pushregistration.isSupported() && pushregistration.getServiceType() == pushservicetype)
            {
                return pushregistration.isRegistered();
            }
        }

        return false;
    }

    public void onError(PushServiceType pushservicetype, String s)
    {
        pushservicetype = (PushRegistration)services.get(pushservicetype);
        if (pushservicetype != null)
        {
            log.info(String.format("registration failed for %s with errorId %s", new Object[] {
                pushservicetype.getServiceType(), s
            }));
            for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PushListener)iterator.next()).onRegistrationError(pushservicetype, new PushRegistrationException(s))) { }
        }
    }

    public void onMessageReceived(PushServiceType pushservicetype, Intent intent)
    {
        if (intent != null && configuration != null)
        {
            onMessageReceived(pushservicetype, configuration.getMessageParser(pushservicetype).parse(pushservicetype, intent));
        }
    }

    public void onMessageReceived(PushServiceType pushservicetype, PushMessage pushmessage)
    {
        if (pushmessage != null)
        {
            for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PushListener)iterator.next()).onPushMessage((PushRegistration)services.get(pushservicetype), pushmessage)) { }
        }
    }

    public void onMessagesDeleted(PushServiceType pushservicetype, Intent intent)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PushListener)iterator.next()).onPushMessagesDeleted((PushRegistration)services.get(pushservicetype), intent)) { }
    }

    public void onRegistered(PushServiceType pushservicetype)
    {
        pushservicetype = (PushRegistration)services.get(pushservicetype);
        if (pushservicetype != null)
        {
            saveVersion();
            for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PushListener)iterator.next()).onRegistered(pushservicetype)) { }
        }
    }

    public void onUnregistered(PushServiceType pushservicetype)
    {
        log.info(String.format("unregistered push service %s", new Object[] {
            pushservicetype
        }));
        pushservicetype = (PushRegistration)services.get(pushservicetype);
        if (pushservicetype != null)
        {
            for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PushListener)iterator.next()).onUnregistered(pushservicetype)) { }
        }
    }

    public EnumSet register()
    {
        EnumSet enumset;
        Iterator iterator1;
        checkConfiguration();
        enumset = EnumSet.noneOf(com/skype/android/push/PushServiceType);
        iterator1 = services.values().iterator();
_L14:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        PushRegistration pushregistration;
        pushregistration = (PushRegistration)iterator1.next();
        if (!pushregistration.isSupported())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        if (pushregistration.isRegistered()) goto _L4; else goto _L3
_L3:
        obj = RegistrationReason.NO_TOKEN;
_L8:
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            for (Iterator iterator2 = listeners.iterator(); iterator2.hasNext(); ((PushListener)iterator2.next()).onBeforeRegister(pushregistration, ((RegistrationReason) (obj)))) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            log.severe(String.format("register of service type %s failed: %s", new Object[] {
                pushregistration.getServiceType().toString(), ((Exception) (obj)).toString()
            }));
            Iterator iterator3 = listeners.iterator();
            while (iterator3.hasNext()) 
            {
                ((PushListener)iterator3.next()).onRegistrationError(pushregistration, ((Exception) (obj)));
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
_L4:
label0:
        {
            if (!checkVersionChanged())
            {
                break label0;
            }
            obj = RegistrationReason.APPLICATION_UPDATE;
        }
          goto _L8
        if (!checkFirmwareUpdate()) goto _L10; else goto _L9
_L9:
        obj = RegistrationReason.FIRMWARE_UPDATE;
          goto _L8
_L10:
        if (!checkRegistrationTTLExpired(pushregistration.getServiceType())) goto _L8; else goto _L11
_L11:
        obj = RegistrationReason.TTL_EXPIRED;
          goto _L8
_L7:
        log.info((new StringBuilder("Regsiter to: ")).append(pushregistration).toString());
        pushregistration.register(configuration);
_L12:
        enumset.add(pushregistration.getServiceType());
        continue; /* Loop/switch isn't completed */
_L6:
        Iterator iterator = listeners.iterator();
        while (iterator.hasNext()) 
        {
            ((PushListener)iterator.next()).onRegistered(pushregistration);
        }
        if (true) goto _L12; else goto _L2
_L2:
        return enumset;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public boolean removeListener(PushListener pushlistener)
    {
        return listeners.remove(pushlistener);
    }

    public void setConfiguration(PushConfiguration pushconfiguration)
    {
        if (pushconfiguration == null)
        {
            throw new IllegalArgumentException("null configuration");
        }
        configuration = pushconfiguration;
        services.clear();
        pushconfiguration = configuration.getEnabledPushServiceTypes();
        if (pushconfiguration != null)
        {
            pushconfiguration = pushconfiguration.iterator();
            do
            {
                if (!pushconfiguration.hasNext())
                {
                    break;
                }
                PushServiceType pushservicetype = (PushServiceType)pushconfiguration.next();
                static final class _cls1
                {

                    static final int $SwitchMap$com$skype$android$push$PushServiceType[];

                    static 
                    {
                        $SwitchMap$com$skype$android$push$PushServiceType = new int[PushServiceType.values().length];
                        try
                        {
                            $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.GOOGLE_GCM.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.NOKIA_NNA.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.AMAZON_ADM.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls1..SwitchMap.com.skype.android.push.PushServiceType[pushservicetype.ordinal()])
                {
                default:
                    throw new UnsupportedOperationException((new StringBuilder()).append(pushservicetype.toString()).append(" not supported").toString());

                case 1: // '\001'
                    services.put(pushservicetype, new GCMRegistration(context));
                    break;

                case 2: // '\002'
                    services.put(pushservicetype, new NokiaPushRegistration(context));
                    break;

                case 3: // '\003'
                    services.put(pushservicetype, new ADMPushRegistration(context));
                    break;
                }
            } while (true);
        }
    }

    public EnumSet unregister()
    {
        checkConfiguration();
        Object obj = EnumSet.noneOf(com/skype/android/push/PushServiceType);
        Iterator iterator = services.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PushRegistration pushregistration = (PushRegistration)iterator.next();
            if (pushregistration.isSupported() && pushregistration.isRegistered())
            {
                try
                {
                    pushregistration.unregister();
                    ((EnumSet) (obj)).add(pushregistration.getServiceType());
                    Iterator iterator1 = listeners.iterator();
                    while (iterator1.hasNext()) 
                    {
                        ((PushListener)iterator1.next()).onUnregistered(pushregistration);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    log.severe(String.format("unregister of service type %s failed: %s", new Object[] {
                        pushregistration.getServiceType().toString(), ((Exception) (obj)).toString()
                    }));
                    throw new PushRegistrationException(((Exception) (obj)));
                }
            }
        } while (true);
        return ((EnumSet) (obj));
    }

}
