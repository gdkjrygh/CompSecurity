// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.soundcloud.android.payments.ConnectionStatus;
import rx.g.a;

// Referenced classes of package com.soundcloud.android.payments.googleplay:
//            BillingUtil, BillingService, BillingServiceBinder

class this._cls0
    implements ServiceConnection
{

    final BillingService this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        BillingUtil.log("Service connected");
        BillingService.access$002(BillingService.this, BillingService.access$100(BillingService.this).bind(ibinder));
        ibinder = BillingService.access$300(BillingService.this);
        if (BillingService.access$200(BillingService.this))
        {
            componentname = ConnectionStatus.READY;
        } else
        {
            componentname = ConnectionStatus.UNSUPPORTED;
        }
        ibinder.onNext(componentname);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        BillingUtil.log("Service disconnected");
        BillingService.access$002(BillingService.this, null);
        BillingService.access$300(BillingService.this).onNext(ConnectionStatus.DISCONNECTED);
    }

    der()
    {
        this$0 = BillingService.this;
        super();
    }
}
