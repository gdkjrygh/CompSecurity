// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.PeriodicWakeupConfig;
import com.skype.android.inject.LoginManager;
import com.skype.android.skylib.SkyLibInitializer;
import com.skype.android.wakeup.BackgroundLogger;
import com.skype.android.wakeup.DreamKeeper;
import com.skype.android.wakeup.OnWakeupEvent;
import com.skype.android.wakeup.WakeupEventReceiver;
import com.skype.android.wakeup.WakeupPeriod;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app:
//            Agent

public class WakeupSchedulerAgent extends Agent
{

    private static final String BACKGROUND_TASK = "com.skype.action.BACKGROUND";
    private static final String FOREGROUND_TASK = "com.skype.action.FOREGROUND";
    private static final int INTERVAL_LONG = 48;
    private static final int INTERVAL_SHORT = 2;
    private static final Logger log;
    private PeriodicWakeupConfig config;
    private Context context;
    private DreamKeeper dreamKeeper;
    private boolean loggedInFromWakeup;
    private LoginManager loginManager;
    private Provider skyLibProvider;

    public WakeupSchedulerAgent(Application application, ApplicationConfig applicationconfig, DreamKeeper dreamkeeper, Provider provider, LoginManager loginmanager)
    {
        super(application);
        context = application;
        config = applicationconfig.getPeriodicWakeupConfig();
        dreamKeeper = dreamkeeper;
        skyLibProvider = provider;
        loginManager = loginmanager;
    }

    private void cancelAlarms()
    {
        WakeupEventReceiver.a(context, "com.skype.action.BACKGROUND");
        WakeupEventReceiver.a(context, "com.skype.action.FOREGROUND");
        log.info("cancelAlarms()");
    }

    private void handleBackgroundTask()
    {
        Account account = getAccount();
        SkyLib skylib = (SkyLib)skyLibProvider.get();
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN && account.getAvailabilityProp() != com.skype.Contact.AVAILABILITY.OFFLINE)
        {
            log.info("handleBackgroundTask() executeBackgroundTask");
            skylib.executeBackgroundTask();
        }
    }

    private void handleForegroundTask()
    {
        ((SkyLib)skyLibProvider.get()).getSetup().setInt("*Lib/MSNP/UserlessForeground", 1);
        Account account = getAccount();
        com.skype.Account.STATUS status = account.getStatusProp();
        log.info((new StringBuilder("handleForegroundTask() status: ")).append(status).toString());
        if (status == com.skype.Account.STATUS.LOGGED_IN || status == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY)
        {
            dreamKeeper.a(config.getForegroundAwakeTime());
        } else
        if (status == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
        {
            if (loginManager.isLoggedOut())
            {
                log.info("Login canceled: user signed out manualy");
                return;
            } else
            {
                SkyLibInitializer.a().b();
                account.beginLogin();
                loggedInFromWakeup = true;
                return;
            }
        }
    }

    private void scheduleAlarms()
    {
        cancelAlarms();
        int j = ((SkyLib)skyLibProvider.get()).getSetup().getInt("*Lib/PeriodicNetworkScheduler/Default/Background", 600) * 1000;
        int k = config.getBackgroundAwakeTime();
        int l = config.getAwakeAdjustmentTime();
        int i1 = config.getForegroundAwakeTime();
        int j1 = config.getAwakeAdjustmentTime();
        WakeupPeriod wakeupperiod;
        WakeupPeriod wakeupperiod1;
        byte byte0;
        int i;
        if (getUserPreferences().isSyncGroupsInBackgroundEnabled())
        {
            byte0 = 2;
        } else
        {
            byte0 = 48;
        }
        if (config.isForegroundTaskEnabled())
        {
            i = j * byte0;
        } else
        {
            i = j;
        }
        wakeupperiod = new WakeupPeriod(i, j, k + l);
        wakeupperiod1 = new WakeupPeriod(j * byte0, j * byte0, i1 + j1);
        if (config.isForegroundTaskEnabled())
        {
            log.info((new StringBuilder("foreground wakeup in: ")).append(wakeupperiod1.b()).toString());
            WakeupEventReceiver.a(context, "com.skype.action.FOREGROUND", wakeupperiod1);
        }
        if (config.isBackgroundTaskEnabled())
        {
            log.info((new StringBuilder("background wakeup in: ")).append(wakeupperiod.b()).toString());
            WakeupEventReceiver.a(context, "com.skype.action.BACKGROUND", wakeupperiod);
        }
    }

    public void onAccountEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        Account account = (Account)onpropertychange.getSender();
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_AVAILABILITY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_STATUS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 70
    //                   2 87;
           goto _L1 _L2 _L3
_L1:
        log.info((new StringBuilder("onAccountEvent(): default: event:")).append(onpropertychange.getPropKey().toString()).toString());
_L5:
        return;
_L2:
        if (account.getAvailabilityProp() == com.skype.Contact.AVAILABILITY.OFFLINE)
        {
            cancelAlarms();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        onpropertychange = account.getStatusProp();
        if ((onpropertychange == com.skype.Account.STATUS.LOGGED_IN_PARTIALLY || onpropertychange == com.skype.Account.STATUS.LOGGED_IN) && loggedInFromWakeup)
        {
            handleForegroundTask();
            loggedInFromWakeup = false;
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnOperationModeChanged onoperationmodechanged)
    {
        log.info((new StringBuilder("onEvent() changed background mode: ")).append(onoperationmodechanged.getLevel()).toString());
        if (onoperationmodechanged.getLevel() > com.skype.GI.NETWORKACTIVITYLEVEL.NAL_NORMAL_LEVEL.toInt())
        {
            ((SkyLib)skyLibProvider.get()).getSetup().setInt("*Lib/MSNP/UserlessForeground", 0);
            scheduleAlarms();
            return;
        } else
        {
            cancelAlarms();
            return;
        }
    }

    public void onLogout()
    {
        super.onLogout();
        cancelAlarms();
    }

    public void onWakeup(OnWakeupEvent onwakeupevent)
    {
        onwakeupevent = onwakeupevent.a().getAction();
        log.info((new StringBuilder("onWakeup() wakeup to handle: ")).append(onwakeupevent).toString());
        if ("com.skype.action.FOREGROUND".equals(onwakeupevent))
        {
            handleForegroundTask();
        } else
        if ("com.skype.action.BACKGROUND".equals(onwakeupevent))
        {
            handleBackgroundTask();
            return;
        }
    }

    static 
    {
        log = BackgroundLogger.a;
    }
}
