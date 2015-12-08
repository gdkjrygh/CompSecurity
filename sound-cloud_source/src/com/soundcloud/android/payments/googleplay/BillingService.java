// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments.googleplay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PaymentFailureEvent;
import com.soundcloud.android.payments.ConnectionStatus;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.ArrayList;
import org.json.JSONException;
import rx.b;
import rx.g.a;

// Referenced classes of package com.soundcloud.android.payments.googleplay:
//            SubscriptionStatus, Payload, ResponseProcessor, BillingUtil, 
//            BillingServiceBinder

public class BillingService
{

    private static final int IAB_VERSION = 3;
    private static final int NO_FLAGS = 0;
    private static final String TYPE_SUBS = "subs";
    private final BillingServiceBinder binder;
    private Activity bindingActivity;
    private final a connectionSubject = a.a();
    private final DeviceHelper deviceHelper;
    private final EventBus eventBus;
    private final FeatureFlags flags;
    private IInAppBillingService iabService;
    private final ResponseProcessor processor;
    private final ServiceConnection serviceConnection = new _cls1();

    BillingService(DeviceHelper devicehelper, BillingServiceBinder billingservicebinder, ResponseProcessor responseprocessor, EventBus eventbus, FeatureFlags featureflags)
    {
        deviceHelper = devicehelper;
        binder = billingservicebinder;
        processor = responseprocessor;
        eventBus = eventbus;
        flags = featureflags;
    }

    private SubscriptionStatus extractStatusFromResponse(Bundle bundle)
        throws JSONException
    {
        ArrayList arraylist = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        bundle = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (arraylist.isEmpty())
        {
            return SubscriptionStatus.notSubscribed();
        } else
        {
            bundle = new Payload((String)arraylist.get(0), (String)bundle.get(0));
            return SubscriptionStatus.subscribed(processor.extractToken((String)arraylist.get(0)), bundle);
        }
    }

    private Bundle getSkuBundle(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", Lists.newArrayList(new String[] {
            s
        }));
        return bundle;
    }

    private boolean isSubsSupported()
    {
        boolean flag = false;
        int i;
        try
        {
            i = iabService.a(3, deviceHelper.getPackageName(), "subs");
            BillingUtil.logBillingResponse("isSubsSupported", i);
        }
        catch (RemoteException remoteexception)
        {
            return false;
        }
        if (i == 0)
        {
            flag = true;
        }
        return flag;
    }

    public void closeConnection()
    {
        if (iabService != null)
        {
            bindingActivity.unbindService(serviceConnection);
            BillingUtil.log("Connection closed");
        }
        connectionSubject.onCompleted();
        bindingActivity = null;
    }

    public b getDetails(final String id)
    {
        return b.create(new _cls2());
    }

    public b getStatus()
    {
        return b.create(new _cls3());
    }

    public b openConnection(Activity activity)
    {
        bindingActivity = activity;
        if (binder.canConnect())
        {
            binder.connect(activity, serviceConnection);
        } else
        {
            BillingUtil.log("Billing service is not available on this device");
            connectionSubject.onNext(ConnectionStatus.UNSUPPORTED);
        }
        return connectionSubject.asObservable();
    }

    public void startPurchase(String s, String s1)
    {
        int i;
        s = iabService.a(3, deviceHelper.getPackageName(), s, "subs", s1);
        i = BillingUtil.getResponseCodeFromBundle(s);
        BillingUtil.logBillingResponse("getBuyIntent", i);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (flags.isDisabled(Flag.PAYMENTS_TEST))
        {
            s = (PendingIntent)s.getParcelable("BUY_INTENT");
            bindingActivity.startIntentSenderForResult(s.getIntentSender(), 1001, new Intent(), 0, 0, 0);
        }
        return;
        s;
_L2:
        BillingUtil.log("Failed to send purchase Intent");
        eventBus.publish(EventQueue.TRACKING, PaymentFailureEvent.create("BillingService.startPurchase"));
        ErrorUtils.handleSilentException(s);
        return;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }



/*
    static IInAppBillingService access$002(BillingService billingservice, IInAppBillingService iinappbillingservice)
    {
        billingservice.iabService = iinappbillingservice;
        return iinappbillingservice;
    }

*/








    private class _cls1
        implements ServiceConnection
    {

        final BillingService this$0;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            BillingUtil.log("Service connected");
            iabService = binder.bind(ibinder);
            ibinder = connectionSubject;
            if (isSubsSupported())
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
            iabService = null;
            connectionSubject.onNext(ConnectionStatus.DISCONNECTED);
        }

        _cls1()
        {
            this$0 = BillingService.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.f
    {

        final BillingService this$0;
        final String val$id;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            Object obj = iabService.a(3, deviceHelper.getPackageName(), "subs", getSkuBundle(id));
            BillingUtil.logBillingResponse("getSkuDetails", BillingUtil.getResponseCodeFromBundle(((Bundle) (obj))));
            if (((Bundle) (obj)).containsKey("DETAILS_LIST"))
            {
                obj = ((Bundle) (obj)).getStringArrayList("DETAILS_LIST");
                x.onNext(processor.parseProduct((String)((ArrayList) (obj)).get(0)));
            }
            x.onCompleted();
            return;
            Object obj1;
            obj1;
_L2:
            BillingUtil.log("Failed to retrieve subscription details");
            x.onError(((Throwable) (obj1)));
            return;
            obj1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        _cls2()
        {
            this$0 = BillingService.this;
            id = s;
            super();
        }
    }


    private class _cls3
        implements rx.b.f
    {

        final BillingService this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            Bundle bundle;
            int i;
            bundle = iabService.a(3, deviceHelper.getPackageName(), "subs", null);
            i = BillingUtil.getResponseCodeFromBundle(bundle);
            BillingUtil.logBillingResponse("getPurchases", i);
            if (i != 0)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            x.onNext(extractStatusFromResponse(bundle));
            x.onCompleted();
            return;
            Object obj;
            obj;
_L2:
            BillingUtil.log("Failed to retrieve subscription status");
            x.onError(((Throwable) (obj)));
            return;
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        _cls3()
        {
            this$0 = BillingService.this;
            super();
        }
    }

}
