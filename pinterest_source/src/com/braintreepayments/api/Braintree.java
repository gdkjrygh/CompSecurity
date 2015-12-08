// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.braintreepayments.api.exceptions.AppSwitchNotAvailableException;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ConfigurationException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.models.AndroidPayCard;
import com.braintreepayments.api.models.Card;
import com.braintreepayments.api.models.ClientToken;
import com.braintreepayments.api.models.PaymentMethod;
import com.braintreepayments.api.models.ThreeDSecureAuthenticationResponse;
import com.google.android.gms.wallet.Cart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

// Referenced classes of package com.braintreepayments.api:
//            BraintreeApi

public class Braintree
{

    protected static final Map a = new HashMap();
    private final ExecutorService b;
    private final BraintreeApi c;
    private String d;
    private String e;
    private final Handler f;
    private final List g;
    private boolean h;
    private final Set i;
    private final Set j;
    private final Set k;
    private final Set l;
    private List m;

    protected Braintree(Context context, String s)
    {
        f = new Handler(Looper.getMainLooper());
        g = new LinkedList();
        h = false;
        i = new HashSet();
        j = new HashSet();
        k = new HashSet();
        l = new HashSet();
        c = new BraintreeApi(context.getApplicationContext(), ClientToken.a(s));
        b = Executors.newSingleThreadExecutor();
        d = "custom";
        e = s;
        a.put(e, this);
    }

    private Braintree(String s, BraintreeApi braintreeapi)
    {
        f = new Handler(Looper.getMainLooper());
        g = new LinkedList();
        h = false;
        i = new HashSet();
        j = new HashSet();
        k = new HashSet();
        l = new HashSet();
        c = braintreeapi;
        b = Executors.newSingleThreadExecutor();
        d = "custom";
        e = s;
        a.put(e, this);
    }

    public static Braintree a(Context context, Bundle bundle)
    {
        if (bundle != null) goto _L2; else goto _L1
_L1:
        bundle = null;
_L4:
        return bundle;
_L2:
        Braintree braintree;
        String s;
        String s1;
        s = bundle.getString("com.braintreepayments.api.KEY_CLIENT_TOKEN");
        s1 = bundle.getString("com.braintreepayments.api.KEY_CONFIGURATION");
        braintree = (Braintree)a.get(s);
        if (braintree == null)
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = braintree;
        if (braintree.c.a()) goto _L4; else goto _L3
_L3:
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            return new Braintree(s, new BraintreeApi(context.getApplicationContext(), s, s1));
        } else
        {
            return null;
        }
    }

    public static Braintree a(Context context, String s)
    {
        if (a.containsKey(s))
        {
            return (Braintree)a.get(s);
        } else
        {
            return new Braintree(s, new BraintreeApi(context.getApplicationContext(), s));
        }
    }

    static List a(Braintree braintree, List list)
    {
        braintree.m = list;
        return list;
    }

    private Future a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = b.submit(new _cls12(s, s1));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static void a(Context context, String s, BraintreeSetupFinishedListener braintreesetupfinishedlistener)
    {
        Executors.newSingleThreadExecutor().submit(new _cls1(s, context, braintreesetupfinishedlistener));
    }

    private void a(ListenerCallback listenercallback)
    {
        if (h || !listenercallback.hasListeners())
        {
            g.add(listenercallback);
            return;
        } else
        {
            listenercallback.execute();
            return;
        }
    }

    static void a(Braintree braintree, ErrorWithResponse errorwithresponse)
    {
        braintree.a(errorwithresponse);
    }

    static void a(Braintree braintree, PaymentMethod paymentmethod)
    {
        braintree.a(paymentmethod);
    }

    static void a(Braintree braintree, String s)
    {
        braintree.b(s);
    }

    private void a(ErrorWithResponse errorwithresponse)
    {
        this;
        JVM INSTR monitorenter ;
        a(((ListenerCallback) (new _cls17(errorwithresponse))));
        this;
        JVM INSTR monitorexit ;
        return;
        errorwithresponse;
        throw errorwithresponse;
    }

    private void a(PaymentMethod paymentmethod)
    {
        if (m == null)
        {
            m = new ArrayList();
        }
        m.add(0, paymentmethod);
    }

    private void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        a(((ListenerCallback) (new _cls13(Collections.unmodifiableList(list)))));
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    static boolean a(Braintree braintree)
    {
        return braintree.c.a();
    }

    static void b(Braintree braintree)
    {
        braintree.c.b();
    }

    static void b(Braintree braintree, PaymentMethod paymentmethod)
    {
        braintree.b(paymentmethod);
    }

    static void b(Braintree braintree, List list)
    {
        braintree.a(list);
    }

    private void b(PaymentMethod paymentmethod)
    {
        this;
        JVM INSTR monitorenter ;
        a(new _cls14(paymentmethod));
        this;
        JVM INSTR monitorexit ;
        return;
        paymentmethod;
        throw paymentmethod;
    }

    private void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a(new _cls15(s));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static BraintreeApi c(Braintree braintree)
    {
        return braintree.c;
    }

    private Future c(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        this;
        JVM INSTR monitorenter ;
        builder = b.submit(new _cls10(builder));
        this;
        JVM INSTR monitorexit ;
        return builder;
        builder;
        throw builder;
    }

    static Set d(Braintree braintree)
    {
        return braintree.i;
    }

    private Future d(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        this;
        JVM INSTR monitorenter ;
        builder = b.submit(new _cls11(builder));
        this;
        JVM INSTR monitorexit ;
        return builder;
        builder;
        throw builder;
    }

    static Handler e(Braintree braintree)
    {
        return braintree.f;
    }

    static Set f(Braintree braintree)
    {
        return braintree.j;
    }

    static Set g(Braintree braintree)
    {
        return braintree.k;
    }

    static Set h(Braintree braintree)
    {
        return braintree.l;
    }

    private Future k()
    {
        this;
        JVM INSTR monitorenter ;
        Future future = b.submit(new _cls2());
        this;
        JVM INSTR monitorexit ;
        return future;
        Exception exception;
        exception;
        throw exception;
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        h = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        d = "dropin";
    }

    public final void a(int i1, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        intent = intent.getStringExtra("com.braintreepayments.api.EXTRA_PAYMENT_METHOD_NONCE");
_L5:
        if (TextUtils.isEmpty(intent)) goto _L4; else goto _L3
_L3:
        b.submit(new _cls3(intent));
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        intent = null;
          goto _L5
_L4:
        a("venmo-app.fail");
          goto _L6
        intent;
        throw intent;
          goto _L5
    }

    public final void a(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        if (activity instanceof Listener)
        {
            a((Listener)activity);
        }
        j();
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public final void a(Activity activity, int i1)
    {
        try
        {
            c.a(activity, i1);
            a("add-venmo.start");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            a("add-venmo.unavailable");
        }
        a(((Throwable) (activity)));
    }

    public final void a(Activity activity, int i1, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        activity = c.a(activity, i1, intent);
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        a(((com.braintreepayments.api.models.PaymentMethod.Builder) (activity)));
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        a(((Throwable) (activity)));
        if (true) goto _L2; else goto _L1
_L1:
        activity;
        throw activity;
    }

    public final void a(Activity activity, int i1, Cart cart, boolean flag, boolean flag1, boolean flag2)
    {
        this;
        JVM INSTR monitorenter ;
        b.submit(new _cls5(activity, i1, cart, flag, flag1, flag2));
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public final void a(Activity activity, int i1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        b.submit(new _cls7(activity, i1, s));
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public final void a(Activity activity, int i1, List list)
    {
        a("add-paypal.start");
        c.a(activity, i1, list);
    }

    public final void a(Bundle bundle)
    {
        bundle.putString("com.braintreepayments.api.KEY_CLIENT_TOKEN", e);
        bundle.putString("com.braintreepayments.api.KEY_CONFIGURATION", c.c());
    }

    public final void a(Listener listener)
    {
        this;
        JVM INSTR monitorenter ;
        if (listener instanceof PaymentMethodsUpdatedListener)
        {
            i.add((PaymentMethodsUpdatedListener)listener);
        }
        if (listener instanceof PaymentMethodCreatedListener)
        {
            j.add((PaymentMethodCreatedListener)listener);
        }
        if (listener instanceof PaymentMethodNonceListener)
        {
            k.add((PaymentMethodNonceListener)listener);
        }
        if (listener instanceof ErrorListener)
        {
            l.add((ErrorListener)listener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        listener;
        throw listener;
    }

    public final void a(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        this;
        JVM INSTR monitorenter ;
        c(builder);
        this;
        JVM INSTR monitorexit ;
        return;
        builder;
        throw builder;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a((new StringBuilder()).append((new StringBuilder()).append(d).append(".android").toString()).append(".").append(s).toString(), d);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    protected final void a(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        a(((ListenerCallback) (new _cls16(throwable))));
        this;
        JVM INSTR monitorexit ;
        return;
        throwable;
        throw throwable;
    }

    public final void b(int i1, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (i1 != -1)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        c.i();
        intent = BraintreeApi.a(intent);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        a(intent);
        b(((PaymentMethod) (intent)));
        b(intent.c());
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        a(intent);
        if (true) goto _L2; else goto _L1
_L1:
        intent;
        throw intent;
    }

    public final void b(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        l();
        if (activity instanceof Listener)
        {
            b((Listener)activity);
        }
        c.i();
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public final void b(Listener listener)
    {
        this;
        JVM INSTR monitorenter ;
        if (listener instanceof PaymentMethodsUpdatedListener)
        {
            i.remove(listener);
        }
        if (listener instanceof PaymentMethodCreatedListener)
        {
            j.remove(listener);
        }
        if (listener instanceof PaymentMethodNonceListener)
        {
            k.remove(listener);
        }
        if (listener instanceof ErrorListener)
        {
            l.remove(listener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        listener;
        throw listener;
    }

    public final void b(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        this;
        JVM INSTR monitorenter ;
        d(builder);
        this;
        JVM INSTR monitorexit ;
        return;
        builder;
        throw builder;
    }

    public final boolean b()
    {
        return c.d();
    }

    public final void c(int i1, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        intent = (ThreeDSecureAuthenticationResponse)intent.getParcelableExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_RESULT");
        if (!intent.a()) goto _L4; else goto _L3
_L3:
        b(intent.b());
        b(intent.b().c());
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (intent.d() == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        a(new BraintreeException(intent.d()));
          goto _L2
        intent;
        throw intent;
        a(new ErrorWithResponse(422, intent.c()));
          goto _L2
    }

    public final boolean c()
    {
        return c.e();
    }

    public final boolean d()
    {
        return c.f();
    }

    public final boolean e()
    {
        return c.g();
    }

    public final boolean f()
    {
        return c.h();
    }

    public final void g()
    {
        this;
        JVM INSTR monitorenter ;
        k();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        List list = m;
        boolean flag;
        if (list != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final List i()
    {
        this;
        JVM INSTR monitorenter ;
        if (m != null) goto _L2; else goto _L1
_L1:
        List list = Collections.emptyList();
_L4:
        this;
        JVM INSTR monitorexit ;
        return list;
_L2:
        list = Collections.unmodifiableList(m);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void j()
    {
        this;
        JVM INSTR monitorenter ;
        h = false;
        Object obj = new ArrayList();
        ((List) (obj)).addAll(g);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ListenerCallback listenercallback = (ListenerCallback)((Iterator) (obj)).next();
            if (listenercallback.hasListeners())
            {
                listenercallback.execute();
                g.remove(listenercallback);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_86;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }


    /* member class not found */
    class _cls12 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class ListenerCallback {}


    /* member class not found */
    class _cls17 {}


    /* member class not found */
    class _cls13 {}


    /* member class not found */
    class _cls14 {}


    /* member class not found */
    class _cls15 {}


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    private class Listener
    {
    }


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls7 {}


    private class PaymentMethodsUpdatedListener
        implements Listener
    {

        public abstract void onPaymentMethodsUpdated(List list);
    }


    private class PaymentMethodCreatedListener
        implements Listener
    {

        public abstract void onPaymentMethodCreated(PaymentMethod paymentmethod);
    }


    /* member class not found */
    class PaymentMethodNonceListener {}


    private class ErrorListener
        implements Listener
    {

        public abstract void onRecoverableError(ErrorWithResponse errorwithresponse);

        public abstract void onUnrecoverableError(Throwable throwable);
    }


    /* member class not found */
    class _cls16 {}

}
