// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.ads;

import android.app.Application;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeApplication;
import com.skype.android.ads.AdManager;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.UpdateConfig;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import java.util.logging.Logger;
import javax.inject.Provider;

public class AdManagerInitializer
{

    private static final Logger log = Logger.getLogger("AdManagerInitializer");
    private AdManager adManager;
    private ApplicationConfig appConfig;
    private AsyncService asyncService;
    private Application context;
    private EventSubscriberBinder eventBinder;
    private Provider userPrefsProvider;

    public AdManagerInitializer(Application application, AdManager admanager, ApplicationConfig applicationconfig, Provider provider, AsyncService asyncservice, EventBus eventbus)
    {
        context = application;
        adManager = admanager;
        appConfig = applicationconfig;
        userPrefsProvider = provider;
        asyncService = asyncservice;
        eventBinder = new EventSubscriberBinder(eventbus, this);
        asyncservice.a(new Runnable() {

            final AdManagerInitializer this$0;

            public final void run()
            {
                adManager.a(context);
            }

            
            {
                this$0 = AdManagerInitializer.this;
                super();
            }
        });
    }

    private void handleCBLSync(Account account)
    {
        com.skype.Account.CBLSYNCSTATUS cblsyncstatus = account.getCblSyncStatusProp();
        log.info((new StringBuilder("handleCBLSync: syncStatus=")).append(cblsyncstatus).toString());
        if (com.skype.Account.CBLSYNCSTATUS.CBL_IN_SYNC == cblsyncstatus || com.skype.Account.CBLSYNCSTATUS.CBL_SYNC_FAILED == cblsyncstatus)
        {
            int i = account.getRegistrationTimestampProp();
            int j = account.getBirthdayProp();
            int k = account.getGenderProp();
            adManager.b(j);
            adManager.a(k);
            adManager.a(i);
            handleSkypeoutBalanceChange(account);
            handleSubscriptionChange(account);
            account = (UserPreferences)userPrefsProvider.get();
            if (account != null)
            {
                boolean flag;
                if (!account.isAdTargetingAllowed())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adManager.c(flag);
                return;
            }
        }
    }

    private void handleSkypeoutBalanceChange(Account account)
    {
        int i = account.getSkypeoutBalanceProp();
        account = adManager;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        account.b(flag);
    }

    private void handleSubscriptionChange(Account account)
    {
        boolean flag = false;
        account = account.getSubscriptionInfo();
        for (int i = 0; i < ((com.skype.Account.GetSubscriptionInfo_Result) (account)).m_status.length; i++)
        {
            if (((com.skype.Account.GetSubscriptionInfo_Result) (account)).m_status[i] == com.skype.Account.SUBSCRIPTIONSTATUS.SS_ACTIVE.toInt() || (long)((com.skype.Account.GetSubscriptionInfo_Result) (account)).m_endtime[i] * 1000L > System.currentTimeMillis())
            {
                flag = true;
            }
        }

        adManager.a(flag);
    }

    private void initializeAdComponent(Account account)
    {
        try
        {
            String s = account.getSkypenameProp();
            String s1 = appConfig.getUpdateConfig().getLastVersion();
            String s2 = SkypeApplication.d();
            int i = account.getRegistrationTimestampProp();
            int j = account.getBirthdayProp();
            int k = account.getGenderProp();
            adManager.a(context, s, j, k, i, s1, s2);
            handleCBLSync(account);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            log.severe(account.toString());
        }
    }

    private void startAdComponentInitialization(final Account account)
    {
        asyncService.a(new Runnable() {

            final AdManagerInitializer this$0;
            final Account val$account;

            public final void run()
            {
                AdManagerInitializer.log.info("initializeAdComponent ");
                initializeAdComponent(account);
            }

            
            {
                this$0 = AdManagerInitializer.this;
                account = account1;
                super();
            }
        });
    }

    public void initialize(Account account)
    {
        eventBinder.bind();
        startAdComponentInitialization(account);
    }

    void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        Account account = (Account)onpropertychange.getSender();
        onpropertychange = onpropertychange.getPropKey();
        log.info((new StringBuilder("onAccountEvent ")).append(account.getSkypenameProp()).append(" ").append(onpropertychange).toString());
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_REGISTRATION_TIMESTAMP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_BIRTHDAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_GENDER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_SKYPEOUT_BALANCE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_SUBSCRIPTIONS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.ACCOUNT_CBLSYNCSTATUS.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.skype.PROPKEY[onpropertychange.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            adManager.a(account.getRegistrationTimestampProp());
            return;

        case 2: // '\002'
            adManager.b(account.getBirthdayProp());
            return;

        case 3: // '\003'
            adManager.a(account.getGenderProp());
            return;

        case 4: // '\004'
            handleSkypeoutBalanceChange(account);
            return;

        case 5: // '\005'
            handleSubscriptionChange(account);
            return;

        case 6: // '\006'
            handleCBLSync(account);
            break;
        }
    }

    public void release()
    {
        eventBinder.unbind();
        try
        {
            adManager.c();
            return;
        }
        catch (Exception exception)
        {
            log.severe(exception.toString());
        }
    }





}
