// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeApplication;
import com.skype.android.inject.LoginManager;
import com.skype.android.sync.SyncAdapter;
import com.skype.android.util.DeviceFeatures;
import java.util.logging.Logger;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.service:
//            DaggerAccountServiceComponent, AccountAuthenticator, LocalBinder, AccountServiceComponent

public class AccountService extends Service
{

    public static final String ACTION_START_BACKGROUND = "com.skype.ACTION_START_BACKGROUND";
    public static final String ACTION_SYNCADAPTER_INTENT = "android.content.SyncAdapter";
    private static final Logger log = Logger.getLogger("AccountService");
    Provider accountProvider;
    private AccountServiceComponent component;
    LoginManager loginManager;
    Provider skyLibProvider;

    public AccountService()
    {
    }

    private AccountServiceComponent getComponent()
    {
        log.info((new StringBuilder("getComponent() component:")).append(component).toString());
        if (component == null)
        {
            component = DaggerAccountServiceComponent.builder().skypeApplicationComponent(((SkypeApplication)getApplicationContext()).a()).build();
        }
        return component;
    }

    private int handleBlackBerry()
    {
        log.info((new StringBuilder("onStartCommand() loginManager: ")).append(loginManager).append(" accountProvider: ").append(accountProvider).append(" skyLibProvider: ").append(skyLibProvider).toString());
        boolean flag = loginManager.loginIfRequired(true);
        log.info((new StringBuilder("onStartCommand() loggedIn: ")).append(flag).toString());
        Account account = (Account)accountProvider.get();
        if (account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN && account.getAvailabilityProp() != com.skype.Contact.AVAILABILITY.OFFLINE)
        {
            ((SkyLib)skyLibProvider.get()).executeBackgroundTask();
        }
        return 1;
    }

    public IBinder onBind(Intent intent)
    {
        if ("android.accounts.AccountAuthenticator".equals(intent.getAction()))
        {
            log.info("onBind() ACTION_AUTHENTICATOR_INTENT");
            return (new AccountAuthenticator(getApplicationContext())).getIBinder();
        }
        if ("android.content.SyncAdapter".equals(intent.getAction()))
        {
            log.info("onBind() ACTION_SYNCADAPTER_INTENT");
            return (new SyncAdapter(getApplicationContext())).getSyncAdapterBinder();
        }
        if ("com.skype.ACTION_START_BACKGROUND".equals(intent.getAction()))
        {
            log.info("onBind() ACTION_START_BACKGROUND");
            return new LocalBinder(this);
        } else
        {
            log.info("onBind() e.");
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        log.info("onCreate()");
        getComponent().inject(this);
    }

    public void onDestroy()
    {
        log.info("onDestroy() e.");
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        log.info((new StringBuilder("onStartCommand() intent: ")).append(intent).toString());
        if (DeviceFeatures.d())
        {
            return handleBlackBerry();
        }
        if (intent != null && "com.skype.ACTION_START_BACKGROUND".equals(intent.getAction()))
        {
            log.info("onStartCommand() START_STICKY");
            return 1;
        } else
        {
            log.info("onStartCommand() START_NOT_STICKY e.");
            return 2;
        }
    }

}
