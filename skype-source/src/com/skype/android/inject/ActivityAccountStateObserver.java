// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import com.skype.Account;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.annotation.RequireNotOffline;
import com.skype.android.annotation.RequireSignedIn;
import com.skype.android.app.LoginRequiredException;
import com.skype.android.crash.ShakeBugReportDialog;
import com.skype.android.skylib.SkyLibInitializer;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.inject:
//            LifecycleAdapter, LoginManager, AccountProvider

public class ActivityAccountStateObserver extends LifecycleAdapter
{

    private static final Logger log = Logger.getLogger("ActivityAccountStateObserver");
    private Provider accountProvider;
    private Activity activity;
    private AnalyticsPersistentStorage analyticsPersistentStorage;
    private LoginManager loginManager;

    public ActivityAccountStateObserver(Activity activity1, LoginManager loginmanager, AccountProvider accountprovider, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        activity = activity1;
        accountProvider = accountprovider;
        loginManager = loginmanager;
        analyticsPersistentStorage = analyticspersistentstorage;
    }

    private boolean isBetaBuild()
    {
        return "qb-market".contains("beta");
    }

    public boolean loginIfRequired()
        throws LoginRequiredException
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = activity.getClass();
        if (!((Class) (obj)).isAnnotationPresent(com/skype/android/annotation/RequireSignedIn)) goto _L2; else goto _L1
_L1:
        LoginManager.LoginRequiredResult loginrequiredresult;
        Object obj1;
        boolean flag;
        obj1 = (Account)accountProvider.get();
        loginrequiredresult = loginManager.loginIfRequired(((Account) (obj1)));
        flag = flag1;
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[];

            static 
            {
                $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult = new int[LoginManager.LoginRequiredResult.values().length];
                try
                {
                    $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[LoginManager.LoginRequiredResult.LOGGEDIN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[LoginManager.LoginRequiredResult.LOGINSUCCESS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[LoginManager.LoginRequiredResult.LOGINFAILED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$inject$LoginManager$LoginRequiredResult[LoginManager.LoginRequiredResult.LOGINFAILEDTIMEOUT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.inject.LoginManager.LoginRequiredResult[loginrequiredresult.ordinal()];
        JVM INSTR tableswitch 1 4: default 84
    //                   1 87
    //                   2 87
    //                   3 90
    //                   4 90;
           goto _L2 _L3 _L3 _L4 _L4
_L2:
        flag = false;
_L3:
        return flag;
_L4:
        flag = flag1;
        if (!isBetaBuild()) goto _L3; else goto _L5
_L5:
        obj1 = ((Account) (obj1)).getStatusProp();
        obj = (new StringBuilder(((Class) (obj)).getSimpleName())).append(" has thrown ").append(loginrequiredresult.toString()).append(" in ").append(com/skype/android/inject/ActivityAccountStateObserver.getSimpleName()).append(" current status is ").append(obj1).toString();
        log.severe(((String) (obj)));
        obj = new ShakeBugReportDialog(activity, SkyLibInitializer.a().c(), (Account)accountProvider.get(), analyticsPersistentStorage);
        ((ShakeBugReportDialog) (obj)).a("Login Failed Timeout");
        ((ShakeBugReportDialog) (obj)).a();
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onResume()
    {
        Class class1 = activity.getClass();
        if (class1.isAnnotationPresent(com/skype/android/annotation/RequireSignedIn))
        {
            com.skype.Account.STATUS status = ((Account)accountProvider.get()).getStatusProp();
            if (status == null || status == com.skype.Account.STATUS.LOGGED_OUT || status == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
            {
                log.warning((new StringBuilder("account signed out abandoning: ")).append(class1.getSimpleName()).toString());
                activity.finish();
            }
        }
        if (class1.isAnnotationPresent(com/skype/android/annotation/RequireNotOffline))
        {
            com.skype.Contact.AVAILABILITY availability = ((Account)accountProvider.get()).getAvailabilityProp();
            if (availability == null || availability == com.skype.Contact.AVAILABILITY.OFFLINE || availability == com.skype.Contact.AVAILABILITY.OFFLINE_BUT_CF_ABLE || availability == com.skype.Contact.AVAILABILITY.OFFLINE_BUT_VM_ABLE)
            {
                log.warning((new StringBuilder("user offline abandoning: ")).append(class1.getSimpleName()).toString());
                activity.finish();
            }
        }
    }

}
