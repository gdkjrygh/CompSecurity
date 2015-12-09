// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.app.AlarmManager;
import android.net.Uri;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.geofencing.api.GeofencingClient;
import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import com.google.android.apps.wallet.hce.setup.PaymentBundleRefreshService;
import com.google.android.apps.wallet.hce.setup.PaymentBundleRefresher;
import com.google.android.apps.wallet.hce.tap.WalletHceContext;
import com.google.android.apps.wallet.init.InitializerTaskManager;
import com.google.android.gms.gcm.GcmNetworkManager;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            AccountChanger

final class val.uri
    implements Callable
{

    final AccountChanger this$0;
    final String val$nextAccountName;
    final Uri val$uri;

    private Void call()
        throws Exception
    {
        AccountChanger.access$100(AccountChanger.this).stop(AccountChanger.access$000(AccountChanger.this));
        AccountChanger.access$200(AccountChanger.this).quiesce();
        AccountChanger.access$300(AccountChanger.this).clearSuccessfulTasks();
        ((GcmNetworkManager)AccountChanger.access$400(AccountChanger.this).get()).cancelAllTasks(com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService);
        AccountChanger.access$500(AccountChanger.this).cancel(PaymentBundleRefresher.backupBundleRefreshIntent(AccountChanger.access$000(AccountChanger.this)));
        AccountChanger.access$600(AccountChanger.this).disablePeriodicSync();
        AccountChanger.access$700(AccountChanger.this).startNewGaSession();
        AccountChanger.access$800(AccountChanger.this, val$nextAccountName, val$uri);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ourcesSyncManager()
    {
        this$0 = final_accountchanger;
        val$nextAccountName = s;
        val$uri = Uri.this;
        super();
    }
}
