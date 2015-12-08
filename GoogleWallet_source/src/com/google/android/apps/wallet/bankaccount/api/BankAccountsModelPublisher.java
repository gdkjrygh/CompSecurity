// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.featurecontrol.FeaturesChangedEvent;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.AbstractCachedRpcPublisher;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccountsModelEvent, BankAccount, BankAccountsModel, BankAccountProtoManager, 
//            BankAccountsModelRpcCache

public class BankAccountsModelPublisher extends AbstractCachedRpcPublisher
{

    private final ActionExecutor actionExecutor;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final BankAccountProtoManager protoManager;
    private final SharedPreferences sharedPrefs;
    private final ThreadChecker threadChecker;

    BankAccountsModelPublisher(BankAccountsModelRpcCache bankaccountsmodelrpccache, BankAccountProtoManager bankaccountprotomanager, FeatureManager featuremanager, SharedPreferences sharedpreferences, ActionExecutor actionexecutor, EventBus eventbus, ThreadChecker threadchecker)
    {
        this(bankaccountsmodelrpccache, bankaccountprotomanager, featuremanager, sharedpreferences, actionexecutor, eventbus, threadchecker, TimeUnit.MINUTES.toMillis(5L));
    }

    private BankAccountsModelPublisher(BankAccountsModelRpcCache bankaccountsmodelrpccache, BankAccountProtoManager bankaccountprotomanager, FeatureManager featuremanager, SharedPreferences sharedpreferences, ActionExecutor actionexecutor, EventBus eventbus, ThreadChecker threadchecker, 
            long l)
    {
        super(bankaccountsmodelrpccache, eventbus, actionexecutor, threadchecker, l);
        protoManager = bankaccountprotomanager;
        featureManager = featuremanager;
        sharedPrefs = sharedpreferences;
        actionExecutor = actionexecutor;
        eventBus = eventbus;
        threadChecker = threadchecker;
    }

    private static BankAccountsModelEvent buildErrorEvent(Exception exception)
    {
        return BankAccountsModelEvent.newExceptionEvent(exception);
    }

    private static BankAccountsModelEvent buildEvent(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new BankAccount((com.google.wallet.proto.NanoWalletEntities.BankAccount)list.next()))) { }
        return BankAccountsModelEvent.newModelEvent(new BankAccountsModel(arraylist));
    }

    protected final void afterWriteToCache()
    {
        SharedPreference.BANK_ACCOUNTS_DB_CACHE_HAS_DATA.put(sharedPrefs, Boolean.valueOf(true));
    }

    protected final volatile Object buildErrorEvent(Exception exception)
    {
        return buildErrorEvent(exception);
    }

    protected final volatile Object buildEvent(Object obj)
    {
        return buildEvent((List)obj);
    }

    protected final boolean canReadFromCache()
    {
        return ((Boolean)SharedPreference.BANK_ACCOUNTS_DB_CACHE_HAS_DATA.get(sharedPrefs)).booleanValue();
    }

    public final void generateEventForAccount(com.google.wallet.proto.NanoWalletEntities.BankAccount bankaccount)
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        postAndCacheNewData(ImmutableList.of(bankaccount));
    }

    public final void generateRemoveBankAccountEvent(final com.google.wallet.proto.NanoWalletEntities.BankAccount bankAccount)
    {
        actionExecutor.executeAction(new Callable() {

            final BankAccountsModelPublisher this$0;
            final com.google.wallet.proto.NanoWalletEntities.BankAccount val$bankAccount;

            private Void call()
            {
                protoManager.delete(bankAccount);
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = BankAccountsModelPublisher.this;
                bankAccount = bankaccount;
                super();
            }
        }, new AsyncCallback() {

            final BankAccountsModelPublisher this$0;

            private void onSuccess(Void void1)
            {
                afterWriteToCache();
                generateAndPostEvent();
            }

            public final void onFailure(Exception exception)
            {
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Void)obj);
            }

            
            {
                this$0 = BankAccountsModelPublisher.this;
                super();
            }
        });
    }

    public final void generateUpdateBankAccountEvent(com.google.wallet.proto.NanoWalletEntities.BankAccount bankaccount)
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnUiThread();
        postAndCacheNewData(ImmutableList.of(bankaccount));
    }

    void handleFeaturesChangedEvent(FeaturesChangedEvent featureschangedevent)
    {
        if (featureschangedevent.didFeatureStateChange(Feature.BANK_ACCOUNT))
        {
            generateAndPostEvent(false);
        }
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/bankaccount/api/BankAccountsModelEvent, new RegistrationCallback() {

            final BankAccountsModelPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                generateAndPostEvent();
            }

            
            {
                this$0 = BankAccountsModelPublisher.this;
                super();
            }
        });
        eventBus.register(this);
    }

    void onRequestRefreshEvent(RequestRefreshEvent requestrefreshevent)
    {
        generateAndPostEvent(false);
    }

    protected final boolean overrideIfDisabled()
    {
        if (!featureManager.isFeatureEnabled(Feature.BANK_ACCOUNT))
        {
            eventBus.post(BankAccountsModelEvent.newFeatureDisabledEvent());
            return true;
        } else
        {
            return false;
        }
    }

}
