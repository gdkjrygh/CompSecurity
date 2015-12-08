// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.AutoBuddyManager;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAnalytics, MnvUtil

public class MnvCases
{
    public static final class REFERRER extends Enum
    {

        private static final REFERRER $VALUES[];
        public static final REFERRER ADD_PEOPLE;
        public static final REFERRER CONTACT_LIST;
        public static final REFERRER DEBUG_SETTINGS;
        public static final REFERRER EXTERNAL_URI;
        public static final REFERRER HUB;
        public static final REFERRER MANAGE_ALIASES;
        public static final REFERRER SIGN_IN;
        public static final REFERRER UNDEFINED;

        public static REFERRER valueOf(String s)
        {
            return (REFERRER)Enum.valueOf(com/skype/android/app/mnv/MnvCases$REFERRER, s);
        }

        public static REFERRER[] values()
        {
            return (REFERRER[])$VALUES.clone();
        }

        static 
        {
            UNDEFINED = new REFERRER("UNDEFINED", 0);
            DEBUG_SETTINGS = new REFERRER("DEBUG_SETTINGS", 1);
            MANAGE_ALIASES = new REFERRER("MANAGE_ALIASES", 2);
            CONTACT_LIST = new REFERRER("CONTACT_LIST", 3);
            SIGN_IN = new REFERRER("SIGN_IN", 4);
            HUB = new REFERRER("HUB", 5);
            ADD_PEOPLE = new REFERRER("ADD_PEOPLE", 6);
            EXTERNAL_URI = new REFERRER("EXTERNAL_URI", 7);
            $VALUES = (new REFERRER[] {
                UNDEFINED, DEBUG_SETTINGS, MANAGE_ALIASES, CONTACT_LIST, SIGN_IN, HUB, ADD_PEOPLE, EXTERNAL_URI
            });
        }

        private REFERRER(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Logger log = Logger.getLogger("MnvCases");
    private AccountProvider accountProvider;
    private AutoBuddyManager autoBuddyManager;
    private EcsConfiguration configuration;
    private MnvAnalytics mnvAnalytics;
    private MnvUtil mnvUtil;
    private Provider userPrefsProvider;

    public MnvCases(EcsConfiguration ecsconfiguration, MnvAnalytics mnvanalytics, Provider provider, MnvUtil mnvutil, AutoBuddyManager autobuddymanager, AccountProvider accountprovider)
    {
        configuration = ecsconfiguration;
        mnvAnalytics = mnvanalytics;
        userPrefsProvider = provider;
        mnvUtil = mnvutil;
        autoBuddyManager = autobuddymanager;
        accountProvider = accountprovider;
    }

    private UserPreferences getUserPreferences()
    {
        return (UserPreferences)userPrefsProvider.get();
    }

    private boolean isAlreadySeenToday()
    {
        boolean flag = true;
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(new Date());
        ((Calendar) (obj)).add(5, -1);
        obj = ((Calendar) (obj)).getTime();
        UserPreferences userpreferences = getUserPreferences();
        if (userpreferences == null || userpreferences.getMnvLastChecked().getTime() == 0L || userpreferences.getMnvLastChecked().before(((Date) (obj))))
        {
            flag = false;
        }
        if (flag)
        {
            mnvAnalytics.reportPreCheckSkip(mnvAnalytics.getUserType((UserPreferences)userPrefsProvider.get()), "PreCheck", "MnvAlreadySeenToday", AnalyticsEvent.cF);
            log.info("MNV isAlreadySeenToday: true");
        }
        return flag;
    }

    private boolean isSkippedOrCompleted()
    {
        if (userPrefsProvider != null)
        {
            String s = mnvAnalytics.getUserType((UserPreferences)userPrefsProvider.get());
            if (isMnvCompleted())
            {
                mnvAnalytics.reportPreCheckSkip(s, "PreCheck", "MnvAlreadyVerified", AnalyticsEvent.cE);
                log.info("MNV isSkippedOrCompleted isMnvCompleted: true");
                return true;
            }
            if (getUserPreferences().getMnvSkippedUntil().getTime() != 0L && getUserPreferences().getMnvSkippedUntil().after(new Date()))
            {
                mnvAnalytics.reportPreCheckSkip(s, "PreCheck", "MnvSkippedUntil", AnalyticsEvent.cE);
                log.info("MNV isSkippedOrCompleted getMnvSkippedUntil: true");
                return true;
            }
            if (getUserPreferences().getMnvHttpMaxTimeoutCount() >= getMnvHttpMaxTimeoutCount())
            {
                mnvAnalytics.reportPreCheckSkip(s, "PreCheck", "MnvHttpMaxTimeoutCountExceed", AnalyticsEvent.cE);
                log.info("MNV isSkippedOrCompleted getMnvHttpMaxTimeoutCount: true");
                return true;
            }
        }
        log.info("MNV isSkippedOrCompleted: false");
        return false;
    }

    public boolean deviceCanShowSpinner()
    {
        return mnvUtil.getProcessorCount() >= mnvUtil.getRequiredProcessorsCount();
    }

    int getMnvHttpConnectionTimeout()
    {
        int i;
        try
        {
            i = Integer.parseInt(configuration.getMnvHttpConnectionTimeout());
        }
        catch (NumberFormatException numberformatexception)
        {
            return 10000;
        }
        return i;
    }

    int getMnvHttpMaxTimeoutCount()
    {
        int i;
        try
        {
            i = Integer.parseInt(configuration.getMnvHttpMaxTimeoutCount());
        }
        catch (NumberFormatException numberformatexception)
        {
            return 3;
        }
        return i;
    }

    public int getMnvSkipCount()
    {
        return getUserPreferences().getMnvSkipCount();
    }

    void incrementSkipCount()
    {
        if (userPrefsProvider != null)
        {
            int i = getMnvSkipCount();
            UserPreferences userpreferences = getUserPreferences();
            i++;
            userpreferences.setMnvSkipCount(i);
            if (i >= 3)
            {
                getUserPreferences().setMnvCompleted(true);
            }
        }
    }

    public boolean isAutoBuddyEnabled()
    {
        return getUserPreferences().isAutoBuddyEnabledInLocalCache();
    }

    public boolean isDeviceReady(REFERRER referrer, boolean flag)
    {
        String s = referrer.name();
        boolean flag2 = true;
        StringBuilder stringbuilder = new StringBuilder();
        com.skype.Account.STATUS status = accountProvider.get().getStatusProp();
        boolean flag1 = flag2;
        if (status != com.skype.Account.STATUS.LOGGED_IN)
        {
            flag1 = flag2;
            if (status != com.skype.Account.STATUS.LOGGED_IN_PARTIALLY)
            {
                stringbuilder.append("account not logged in ");
                flag1 = false;
            }
        }
        if (flag)
        {
            mnvAnalytics.reportWithValue(s, AnalyticsEvent.cD);
            stringbuilder.append("device is tablet ");
            flag1 = false;
        }
        if (flag1 && (referrer == REFERRER.SIGN_IN || referrer == REFERRER.HUB))
        {
            mnvAnalytics.reportMnvEnabled(s, AnalyticsEvent.cy);
        }
        log.info((new StringBuilder("MNV isDeviceReady: ")).append(flag1).append(" ").append(stringbuilder.toString()).toString());
        return flag1;
    }

    protected boolean isMnvCompleted()
    {
        return getUserPreferences().isMnvCompleted();
    }

    void resetLastCheckedTime()
    {
        getUserPreferences().setMnvLastChecked(new Date());
    }

    void setAlreadyVerified()
    {
        setCompleted();
        mnvAnalytics.reportPreCheckSkip(mnvAnalytics.getUserType((UserPreferences)userPrefsProvider.get()), "PreCheck", "MnvAlreadyVerified", AnalyticsEvent.cE);
        log.info("MNV already verified previously in the Profile Services");
    }

    protected void setCompleted()
    {
        autoBuddyManager.updateAutoBuddy(true);
        accountProvider.get().setServersideIntProperty(PROPKEY.ACCOUNT_SHORTCIRCUIT_SYNC, 1);
        getUserPreferences().setMnvCompleted(true);
        log.info("Autobuddy settings turned on and MNV marked as completed.");
    }

    void setMnvHttpMaxTimeoutCount()
    {
        int i = getUserPreferences().getMnvHttpMaxTimeoutCount();
        getUserPreferences().setMnvHttpMaxTimeoutCount(i + 1);
    }

    public void setSkip(int i)
    {
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(new Date());
        ((Calendar) (obj)).add(5, i);
        obj = ((Calendar) (obj)).getTime();
        if (userPrefsProvider != null)
        {
            getUserPreferences().setMnvSkippedUntil(((Date) (obj)));
        }
    }

    boolean shouldRetry(REFERRER referrer, boolean flag)
    {
        return !isAlreadySeenToday() && !isSkippedOrCompleted() && isDeviceReady(referrer, flag);
    }

}
