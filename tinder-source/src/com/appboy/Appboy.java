// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import bo.app.a;
import bo.app.ac;
import bo.app.ap;
import bo.app.aq;
import bo.app.ar;
import bo.app.as;
import bo.app.at;
import bo.app.au;
import bo.app.av;
import bo.app.aw;
import bo.app.az;
import bo.app.b;
import bo.app.ba;
import bo.app.bb;
import bo.app.be;
import bo.app.bf;
import bo.app.bg;
import bo.app.bi;
import bo.app.bn;
import bo.app.bo;
import bo.app.br;
import bo.app.bs;
import bo.app.bw;
import bo.app.bz;
import bo.app.c;
import bo.app.cc;
import bo.app.cd;
import bo.app.cm;
import bo.app.cr;
import bo.app.cs;
import bo.app.ct;
import bo.app.d;
import bo.app.dl;
import bo.app.ea;
import bo.app.ec;
import bo.app.ee;
import bo.app.eg;
import bo.app.ej;
import bo.app.el;
import bo.app.eo;
import bo.app.ep;
import bo.app.eq;
import bo.app.er;
import bo.app.eu;
import bo.app.g;
import bo.app.gq;
import bo.app.h;
import bo.app.ib;
import bo.app.ic;
import bo.app.id;
import bo.app.if;
import bo.app.ig;
import bo.app.ii;
import bo.app.ij;
import bo.app.ik;
import bo.app.io;
import bo.app.ip;
import bo.app.iq;
import bo.app.ir;
import bo.app.jl;
import bo.app.jm;
import bo.app.jx;
import bo.app.ke;
import bo.app.kt;
import bo.app.ku;
import bo.app.m;
import bo.app.o;
import bo.app.z;
import com.amazon.device.messaging.ADM;
import com.appboy.configuration.XmlAppConfigurationProvider;
import com.appboy.enums.SocialNetwork;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.events.SubmitFeedbackFailed;
import com.appboy.events.SubmitFeedbackSucceeded;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageFull;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.models.InAppMessageModal;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.models.outgoing.Feedback;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PermissionUtils;
import com.appboy.support.ValidationUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

// Referenced classes of package com.appboy:
//            IAppboy, IAppboyUnitySupport, Constants, AppboyUser, 
//            IAppboyEndpointProvider, IAppboyNotificationFactory, IAppboyNavigator

public final class Appboy
    implements IAppboy, IAppboyUnitySupport
{

    private static volatile boolean A = false;
    private static final String e;
    private static final Set f = gq.a("AED", "AFN", "ALL", "AMD", "ANG", "AOA", new String[] {
        "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", 
        "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", 
        "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", 
        "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", 
        "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", 
        "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", 
        "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", 
        "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", 
        "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", 
        "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", 
        "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", 
        "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", 
        "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", 
        "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", 
        "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", 
        "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", 
        "YER", "ZAR", "ZMK", "ZMW", "ZWL"
    });
    private static final Set g = gq.a("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    private static volatile Appboy h = null;
    private static final Object x = new Object();
    private static volatile IAppboyEndpointProvider y;
    private static volatile IAppboyNotificationFactory z;
    private IAppboyNavigator B;
    volatile eq a;
    public volatile ec b;
    volatile eg c;
    final XmlAppConfigurationProvider d;
    private final Context i;
    private final ip j;
    private final aw k;
    private volatile AppboyUser l;
    private volatile h m;
    private volatile az n;
    private volatile ThreadPoolExecutor o;
    private volatile br p;
    private final m q;
    private cc r;
    private final bo s;
    private final bw t;
    private final bn u = null;
    private final Object v;
    private final Object w;

    private Appboy(Context context)
    {
        v = new Object();
        w = new Object();
        long l1 = System.nanoTime();
        i = context.getApplicationContext();
        q = new m(i);
        d = new XmlAppConfigurationProvider(i);
        s = new bo(i);
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(4, 8, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10));
        k = new aw(threadpoolexecutor);
        int i1 = Math.min((int)Runtime.getRuntime().maxMemory() / 32, 0x100000);
        String.format("Setting maximum in-memory image cache size to %d bytes.", new Object[] {
            Integer.valueOf(i1)
        });
        Object obj = new ir(i);
        if (((ir) (obj)).c != null || ((ir) (obj)).d != null)
        {
            kt.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        obj.h = 3;
        obj.i = true;
        context = new ig();
        if (((ir) (obj)).o != null)
        {
            kt.c("discCache() and discCacheFileNameGenerator() calls overlap each other", new Object[0]);
        }
        obj.p = context;
        if (((ir) (obj)).o != null || ((ir) (obj)).l > 0)
        {
            kt.c("discCache(), discCacheSize() and discCacheFileCount calls overlap each other", new Object[0]);
        }
        obj.l = 0;
        obj.m = 50;
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("memoryCacheSize must be a positive number");
        }
        if (((ir) (obj)).n != null)
        {
            kt.c("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
        }
        obj.k = i1;
        i1 = jm.b;
        if (((ir) (obj)).c != null || ((ir) (obj)).d != null)
        {
            kt.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        obj.j = i1;
        context = new io();
        context.h = true;
        context.i = true;
        obj.s = context.a();
        if (((ir) (obj)).c == null)
        {
            obj.c = ik.a(((ir) (obj)).g, ((ir) (obj)).h, ((ir) (obj)).j);
        } else
        {
            obj.e = true;
        }
        if (((ir) (obj)).d == null)
        {
            obj.d = ik.a(((ir) (obj)).g, ((ir) (obj)).h, ((ir) (obj)).j);
        } else
        {
            obj.f = true;
        }
        if (((ir) (obj)).o == null)
        {
            if (((ir) (obj)).p == null)
            {
                obj.p = new if();
            }
            context = ((ir) (obj)).b;
            bo.app.ie ie = ((ir) (obj)).p;
            int j1 = ((ir) (obj)).l;
            int k1 = ((ir) (obj)).m;
            long l2;
            if (j1 > 0)
            {
                context = new ic(ku.a(context), ie, j1);
            } else
            if (k1 > 0)
            {
                context = new ib(ku.a(context), ie, k1);
            } else
            {
                context = new id(ku.a(context, true), ie);
            }
            obj.o = context;
        }
        if (((ir) (obj)).n == null)
        {
            k1 = ((ir) (obj)).k;
            j1 = k1;
            if (k1 == 0)
            {
                j1 = (int)(Runtime.getRuntime().maxMemory() / 8L);
            }
            obj.n = new ij(j1);
        }
        if (((ir) (obj)).i)
        {
            obj.n = new ii(((ir) (obj)).n, new jl());
        }
        if (((ir) (obj)).q == null)
        {
            obj.q = new ke(((ir) (obj)).b);
        }
        if (((ir) (obj)).r == null)
        {
            obj.r = new jx(((ir) (obj)).t);
        }
        if (((ir) (obj)).s == null)
        {
            obj.s = (new io()).a();
        }
        context = new iq(((ir) (obj)), (byte)0);
        j = ip.a();
        j.a(context);
        r = new cd(i, d);
        if (bw.a(i, d))
        {
            AppboyLogger.i(e, "Google Cloud Messaging found.  Setting up Google Cloud Messaging");
            t = new bw(i, r);
            obj = d.getGcmSenderId();
            if (d.isGcmMessagingRegistrationEnabled() && obj != null)
            {
                context = t;
                if (((bw) (context)).c.a() != null)
                {
                    AppboyLogger.w(bw.a, "The device is already registered with the GCM server and is eligible to receive GCM messages.");
                } else
                {
                    Object obj1 = bw.a;
                    obj = eu.a().b().a(Arrays.asList(new String[] {
                        obj
                    }));
                    obj1 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    ((Intent) (obj1)).setPackage("com.google.android.gsf");
                    ((Intent) (obj1)).putExtra("app", PendingIntent.getBroadcast(((bw) (context)).b, 0, new Intent(), 0));
                    ((Intent) (obj1)).putExtra("sender", ((String) (obj)));
                    ((bw) (context)).b.startService(((Intent) (obj1)));
                }
            }
        } else
        {
            t = null;
        }
        if (!bn.a(i) || bw.a(i, d)) goto _L2; else goto _L1
_L1:
        AppboyLogger.i(e, "Amazon Device Messaging found.  Setting up Amazon Device Messaging");
        u = new bn(i, r);
        context = u;
        if (((bn) (context)).b.a() == null) goto _L4; else goto _L3
_L3:
        AppboyLogger.i(bn.c, "The device is already registered with the ADM server and is eligible to receive ADM messages.");
        AppboyLogger.i(bn.c, (new StringBuilder("ADM registration id: ")).append(((bn) (context)).b.a()).toString());
        ((bn) (context)).b.a(((bn) (context)).b.a());
_L6:
        if (t == null && u == null)
        {
            AppboyLogger.e(e, "Did not find support for Google Cloud Messaging or Amazon Device Messaging");
        }
        c = new eg(i, d.getAppboyApiKey().toString());
        context = new eq(i, q, d, k, s, r, c, A);
        a(context);
        a(((eq) (context)).i, ((eq) (context)).d);
        threadpoolexecutor.execute(new a(this));
        l2 = System.nanoTime();
        String.format("Appboy loaded in %d ms.", new Object[] {
            Long.valueOf(TimeUnit.MILLISECONDS.convert(l2 - l1, TimeUnit.NANOSECONDS))
        });
        return;
_L4:
        context = new ADM(((bn) (context)).a);
        if (context.isSupported())
        {
            AppboyLogger.i(bn.c, "Registering with ADM server...");
            context.startRegister();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String a()
    {
        return e;
    }

    public static void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
            return;
        } else
        {
            viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
            return;
        }
    }

    private void a(ee ee, o o1)
    {
        o.execute(new b(this, ee, o1));
    }

    private void a(eq eq1)
    {
        Object obj = v;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = w;
        obj1;
        JVM INSTR monitorenter ;
        Object obj3;
        a = eq1;
        m = eq1.j;
        p = eq1.e;
        l = new AppboyUser(eq1.a, eq1.e, q.a(), eq1.k, c);
        bo.app.ao ao = eq1.g;
        obj3 = eq1.c;
        ((aw) (obj3)).a(new aq(ao), bo/app/ba);
        ((aw) (obj3)).a(new ar(ao), bo/app/bg);
        ((aw) (obj3)).a(new as(ao), bo/app/bf);
        ((aw) (obj3)).a(new at(ao), bo/app/be);
        ((aw) (obj3)).a(new au(ao), java/lang/Throwable);
        ((aw) (obj3)).a(new av(ao), bo/app/bi);
        ((aw) (obj3)).a(new ap(ao), bo/app/bb);
        obj3 = eq1.d;
        Object obj2 = ((o) (obj3)).e;
        obj2;
        JVM INSTR monitorenter ;
        if (!((o) (obj3)).f) goto _L2; else goto _L1
_L1:
        obj3 = o.a;
_L3:
        n = eq1.c;
        o = eq1.h;
        b = eq1.f;
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (((o) (obj3)).g != null)
        {
            ((o) (obj3)).g.start();
        }
        obj3.f = true;
        obj2;
        JVM INSTR monitorexit ;
          goto _L3
        eq1;
        obj2;
        JVM INSTR monitorexit ;
        throw eq1;
        eq1;
        obj1;
        JVM INSTR monitorexit ;
        throw eq1;
        eq1;
        obj;
        JVM INSTR monitorexit ;
        throw eq1;
    }

    public static void a(Appboy appboy)
    {
        boolean flag1 = false;
        Iterator iterator = g.iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!PermissionUtils.hasPermission(appboy.i, s1))
            {
                AppboyLogger.e(e, String.format("The Appboy SDK requires the permission %s. Check your app manifest.", new Object[] {
                    s1
                }));
                flag = false;
            }
        } while (true);
        if (appboy.d.getAppboyApiKey().toString().equals(""))
        {
            AppboyLogger.e(e, "The Appboy SDK requires a non-empty API key. Check your appboy.xml.");
            flag = flag1;
        }
        if (!flag)
        {
            AppboyLogger.e(e, "The Appboy SDK is not integrated correctly. Please visit http://documentation.appboy.com/SDK_Integration/Android");
        }
    }

    private void a(Throwable throwable)
    {
        try
        {
            n.a(throwable, java/lang/Throwable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            AppboyLogger.e(e, "Failed to log throwable.", throwable);
        }
    }

    public static aw b(Appboy appboy)
    {
        return appboy.k;
    }

    public static ip c(Appboy appboy)
    {
        return appboy.j;
    }

    public static void clearAppboyEndpointProvider()
    {
        synchronized (x)
        {
            y = null;
        }
    }

    public static boolean configure(Context context, String s1)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        com/appboy/Appboy;
        JVM INSTR monitorenter ;
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (s1 != null) goto _L4; else goto _L3
_L3:
        AppboyLogger.i(e, "Appboy.configure called with a null appboyApiKey; unsetting any cached override api key.");
        context = bo.app.m.a(context);
        context.remove("com_appboy_api_key");
        context.apply();
_L5:
        com/appboy/Appboy;
        JVM INSTR monitorexit ;
        return true;
_L4:
        if (s1.equals(""))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        AppboyLogger.i(e, "Appboy.configure called with an appboyApiKey; caching the api key to override the appboy.xml value when initializing Appboy.");
        context = bo.app.m.a(context);
        context.putString("com_appboy_api_key", s1);
        context.apply();
          goto _L5
        context;
        throw context;
        AppboyLogger.e(e, "Appboy.configure called with an empty string; no action will be taken.  Configure with null to clear an override api key.");
          goto _L5
        com/appboy/Appboy;
        JVM INSTR monitorexit ;
_L2:
        AppboyLogger.e(e, "The custom Appboy API key was not set by configure since getInstance() has already been called.");
        return false;
    }

    public static boolean disableAllAppboyNetworkRequests()
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        com/appboy/Appboy;
        JVM INSTR monitorenter ;
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (!A)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        AppboyLogger.i(e, "Appboy network requests already disabled.");
        com/appboy/Appboy;
        JVM INSTR monitorexit ;
        return true;
        AppboyLogger.i(e, "Appboy network requests now disabled.");
        A = true;
        com/appboy/Appboy;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        throw exception;
        com/appboy/Appboy;
        JVM INSTR monitorexit ;
_L2:
        AppboyLogger.e(e, "Attempt to disable network requests will have no effect since getInstance() has already been called.");
        return false;
    }

    public static Uri getAppboyApiEndpoint(Uri uri)
    {
        Object obj = x;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = y;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj1 = y.getApiEndpoint(uri);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        return ((Uri) (obj1));
        Exception exception;
        exception;
        AppboyLogger.e(e, "Caught exception trying to get an Appboy API endpoint from the AppboyEndpointProvider.  Using the original URI");
        obj;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        throw uri;
    }

    public static Uri getAppboyResourceEndpoint(Uri uri)
    {
        Object obj = x;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = y;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj1 = y.getResourceEndpoint(uri);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        return ((Uri) (obj1));
        Exception exception;
        exception;
        AppboyLogger.e(e, "Caught exception trying to get an Appboy resource endpoint from the AppboyEndpointProvider.  Using the original URI");
        obj;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        throw uri;
    }

    public static IAppboyNotificationFactory getCustomAppboyNotificationFactory()
    {
        return z;
    }

    public static Appboy getInstance(Context context)
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        com/appboy/Appboy;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            h = new Appboy(context);
        }
        com/appboy/Appboy;
        JVM INSTR monitorexit ;
_L2:
        return h;
        context;
        throw context;
    }

    public static void setAppboyEndpointProvider(IAppboyEndpointProvider iappboyendpointprovider)
    {
        synchronized (x)
        {
            y = iappboyendpointprovider;
        }
    }

    public static void setCustomAppboyNotificationFactory(IAppboyNotificationFactory iappboynotificationfactory)
    {
        z = iappboynotificationfactory;
    }

    public final AppboyUser changeUser(String s1)
    {
        obj;
        JVM INSTR monitorenter ;
label0:
        {
            AppboyUser appboyuser;
            synchronized (v)
            {
                if (!ep.b(s1))
                {
                    break label0;
                }
                AppboyLogger.e(e, "ArgumentException: userId passed to changeUser was null or empty.  The current user will remain the active user.");
                appboyuser = l;
            }
            return appboyuser;
        }
        Object obj1 = l.getUserId();
        if (!((String) (obj1)).equals(s1)) goto _L2; else goto _L1
_L1:
        AppboyLogger.i(e, String.format("Received request to change current user %s to the same user id. Doing nothing.", new Object[] {
            s1
        }));
_L5:
        obj;
        JVM INSTR monitorexit ;
        return l;
_L2:
        boolean flag = ((String) (obj1)).equals("");
        if (!flag) goto _L4; else goto _L3
_L3:
        AppboyUser appboyuser1;
        AppboyLogger.i(e, String.format("Changing anonymous user to %s.", new Object[] {
            s1
        }));
        Object obj2 = q;
        ep.a(s1);
        obj2 = ((m) (obj2)).a.edit();
        ((android.content.SharedPreferences.Editor) (obj2)).putString("default_user", s1);
        ((android.content.SharedPreferences.Editor) (obj2)).putString("last_user", s1);
        ((android.content.SharedPreferences.Editor) (obj2)).commit();
        appboyuser1 = l;
        Object obj3 = appboyuser1.a;
        obj3;
        JVM INSTR monitorenter ;
        if (!appboyuser1.b.equals("") && !appboyuser1.b.equals(s1))
        {
            throw new IllegalArgumentException(String.format("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [%s], tried to change to: [%s]", new Object[] {
                appboyuser1.b, s1
            }));
        }
        break MISSING_BLOCK_LABEL_284;
        obj1;
        obj3;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        AppboyLogger.w(e, (new StringBuilder("Failed to set external id to: ")).append(s1).toString(), ((Throwable) (obj1)));
        a(((Throwable) (obj1)));
          goto _L5
        s1;
        throw s1;
        appboyuser1.b = s1;
        obj3;
        JVM INSTR monitorexit ;
        m.a = s1;
_L6:
        obj3 = p;
        obj3.f = null;
        ((br) (obj3)).b.e();
        obj3 = q;
        ep.a(s1);
        obj3 = ((m) (obj3)).a.edit();
        ((android.content.SharedPreferences.Editor) (obj3)).putString("last_user", s1);
        ((android.content.SharedPreferences.Editor) (obj3)).commit();
        obj3 = a;
        eq eq1 = new eq(i, q, d, k, s, r, c, A);
        a(eq1);
        a(eq1.i, eq1.d);
        a.b.c();
        p.a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_556;
        }
        p.a(ct.a(s1));
_L7:
        p.a(ac.a);
        ((eq) (obj3)).h.execute(new er(((eq) (obj3))));
          goto _L5
_L4:
        AppboyLogger.i(e, String.format("Changing current user %s to new user %s.", new Object[] {
            obj1, s1
        }));
        FeedUpdatedEvent feedupdatedevent = new FeedUpdatedEvent(new ArrayList(), s1, false, el.a());
        k.a(feedupdatedevent, com/appboy/events/FeedUpdatedEvent);
          goto _L6
        p.a(ct.a(((String) (obj1)), s1));
          goto _L7
    }

    public final boolean closeSession(Activity activity)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        br br1 = p;
        if (br1.f == null || activity.getClass().equals(br1.f)) goto _L2; else goto _L1
_L1:
        activity = br.a;
        activity = null;
_L4:
        if (activity == null)
        {
            break; /* Loop/switch isn't completed */
        }
        AppboyLogger.i(e, (new StringBuilder("Closed session with ID: ")).append(((cm) (activity)).d).toString());
        obj;
        JVM INSTR monitorexit ;
        return true;
_L2:
        activity = br1.b.b();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
        return false;
        activity;
        AppboyLogger.w(e, "Failed to close session.", activity);
        a(activity);
        obj;
        JVM INSTR monitorexit ;
        return false;
        activity;
        throw activity;
    }

    public final IInAppMessage deserializeInAppMessageString(String s1)
    {
        Object obj;
        MessageType messagetype;
        try
        {
            obj = new JSONObject(s1);
            messagetype = (MessageType)eo.a(((JSONObject) (obj)), "type", com/appboy/enums/inappmessage/MessageType, null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            AppboyLogger.e(e, (new StringBuilder("Failed to deserialize the in-app message string.")).append(s1).toString(), ((Throwable) (obj)));
            return null;
        }
        if (messagetype != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        AppboyLogger.i(e, (new StringBuilder("In-app message type was null.  Not de-serializing message string: ")).append(s1).toString());
        return null;
        g.a[messagetype.ordinal()];
        JVM INSTR tableswitch 1 4: default 202
    //                   1 118
    //                   2 161
    //                   3 174
    //                   4 187;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        AppboyLogger.e(e, (new StringBuilder("Unknown in-app message type.  Not de-serializing message string: ")).append(s1).toString());
        return null;
_L2:
        obj = new InAppMessageFull(((JSONObject) (obj)), p);
        return ((IInAppMessage) (obj));
_L3:
        return new InAppMessageModal(((JSONObject) (obj)), p);
_L4:
        return new InAppMessageSlideup(((JSONObject) (obj)), p);
_L5:
        obj = new InAppMessageHtmlFull(((JSONObject) (obj)), p);
        return ((IInAppMessage) (obj));
    }

    public final void fetchAndRenderImage(String s1, ImageView imageview)
    {
        fetchAndRenderImage(s1, imageview, false);
    }

    public final void fetchAndRenderImage(String s1, ImageView imageview, boolean flag)
    {
        imageview.post(new d(this, s1, imageview, flag));
    }

    public final IAppboyNavigator getAppboyNavigator()
    {
        return B;
    }

    public final String getAppboyPushMessageRegistrationId()
    {
        String s1;
        try
        {
            s1 = r.a();
        }
        catch (Exception exception)
        {
            AppboyLogger.w(e, "Failed to get the registration ID.", exception);
            a(exception);
            return null;
        }
        return s1;
    }

    public final AppboyUser getCurrentUser()
    {
        AppboyUser appboyuser;
        synchronized (v)
        {
            appboyuser = l;
        }
        return appboyuser;
    }

    public final String getInstallTrackingId()
    {
        return s.b();
    }

    public final boolean logCustomEvent(String s1)
    {
        boolean flag;
        synchronized (w)
        {
            flag = logCustomEvent(s1, null);
        }
        return flag;
    }

    public final boolean logCustomEvent(String s1, AppboyProperties appboyproperties)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        String s2 = s1;
        if (!ep.c(s1))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        s2 = s1;
        AppboyLogger.w(e, "The custom event name cannot be null or contain only whitespaces. Ignoring custom event.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        s2 = s1;
        if (!c.f().contains(s1))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s2 = s1;
        AppboyLogger.w(e, String.format("The custom event is a blacklisted custom event: %s. Ignoring custom event.", new Object[] {
            s1
        }));
        obj;
        JVM INSTR monitorexit ;
        return false;
        s1;
        throw s1;
        s2 = s1;
        s1 = ValidationUtils.ensureAppboyFieldLength(s1);
        s2 = s1;
        boolean flag = p.a(ct.a(s1, appboyproperties));
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        AppboyLogger.w(e, (new StringBuilder("Failed to log custom event: ")).append(s2).toString(), s1);
        a(s1);
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public final boolean logFeedCardClick(String s1)
    {
        if (!ep.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppboyLogger.e(e, "Card ID cannot be null");
        return false;
        boolean flag;
        try
        {
            flag = p.a(ct.d(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            AppboyLogger.w(e, "Failed to log feed card clicked.", s1);
            a(s1);
            return false;
        }
        return flag;
    }

    public final boolean logFeedCardImpression(String s1)
    {
        if (!ep.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppboyLogger.e(e, "Card ID cannot be null");
        return false;
        boolean flag;
        try
        {
            flag = p.a(ct.c(s1));
            b.a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            AppboyLogger.w(e, "Failed to log feed card impression.", s1);
            a(s1);
            return false;
        }
        return flag;
    }

    public final boolean logFeedDisplayed()
    {
        boolean flag;
        try
        {
            flag = p.a(ct.e());
        }
        catch (Exception exception)
        {
            AppboyLogger.w(e, "Failed to log that the feed was displayed.", exception);
            a(exception);
            return false;
        }
        return flag;
    }

    public final boolean logFeedbackDisplayed()
    {
        boolean flag;
        try
        {
            flag = p.a(ct.f());
        }
        catch (Exception exception)
        {
            AppboyLogger.w(e, "Failed to log that feedback was displayed.", exception);
            a(exception);
            return false;
        }
        return flag;
    }

    public final boolean logPurchase(String s1, int i1)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        String s2 = s1;
        if (!ep.c(s1))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        s2 = s1;
        AppboyLogger.w(e, "The productId is empty, not logging in-app purchase to Appboy.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        s2 = s1;
        if (!c.h().contains(s1))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s2 = s1;
        AppboyLogger.w(e, String.format("The productId is a blacklisted productId: %s, not logging in-app purchase to Appboy.", new Object[] {
            s1
        }));
        obj;
        JVM INSTR monitorexit ;
        return false;
        s1;
        throw s1;
        if (i1 >= 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s2 = s1;
        AppboyLogger.w(e, "The price is less than zero, not logging in-app purchase to Appboy.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        s2 = s1;
        s1 = ValidationUtils.ensureAppboyFieldLength(s1);
        s2 = s1;
        boolean flag = p.a(ct.a(s1, "USD", ej.a(i1), 1, null));
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        AppboyLogger.w(e, (new StringBuilder("Failed to log purchase event of ")).append(s2).toString(), s1);
        a(s1);
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public final boolean logPurchase(String s1, String s2, BigDecimal bigdecimal)
    {
        return logPurchase(s1, s2, bigdecimal, 1);
    }

    public final boolean logPurchase(String s1, String s2, BigDecimal bigdecimal, int i1)
    {
        return logPurchase(s1, s2, bigdecimal, i1, null);
    }

    public final boolean logPurchase(String s1, String s2, BigDecimal bigdecimal, int i1, AppboyProperties appboyproperties)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        String s3 = s1;
        if (!ep.c(s1))
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s3 = s1;
        AppboyLogger.w(e, "The productId is empty, not logging in-app purchase to Appboy.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        s3 = s1;
        if (!c.h().contains(s1))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s3 = s1;
        AppboyLogger.w(e, String.format("The productId is a blacklisted productId: %s, not logging in-app purchase to Appboy.", new Object[] {
            s1
        }));
        obj;
        JVM INSTR monitorexit ;
        return false;
        s1;
        throw s1;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        s3 = s1;
        AppboyLogger.w(e, String.format("The currencyCode is null. Expected one of %s. Not logging in-app purchase to Appboy.", new Object[] {
            f
        }));
        obj;
        JVM INSTR monitorexit ;
        return false;
        s3 = s1;
        s2 = s2.trim().toUpperCase(Locale.US);
        s3 = s1;
        if (f.contains(s2))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        s3 = s1;
        AppboyLogger.w(e, String.format("The currencyCode is invalid. Expected one of %s. Not logging in-app purchase to Appboy.", new Object[] {
            f
        }));
        obj;
        JVM INSTR monitorexit ;
        return false;
        if (bigdecimal != null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        s3 = s1;
        AppboyLogger.w(e, "The price is null. Not logging in-app purchase to Appboy.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        s3 = s1;
        if (bigdecimal.compareTo(BigDecimal.ZERO) != -1)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        s3 = s1;
        AppboyLogger.w(e, "The price is negative. Not logging in-app purchase to Appboy.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        s3 = s1;
        AppboyLogger.w(e, "The requested purchase quantity is less than zero. Not logging in-app purchase to Appboy.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        if (i1 <= 100)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        s3 = s1;
        AppboyLogger.w(e, "The requested purchase quantity is greater than the maximum of 100. Not logging in-app purchase to Appboy.");
        obj;
        JVM INSTR monitorexit ;
        return false;
        s3 = s1;
        s1 = ValidationUtils.ensureAppboyFieldLength(s1);
        s3 = s1;
        boolean flag = p.a(ct.a(s1, s2, bigdecimal, i1, appboyproperties));
        obj;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        AppboyLogger.w(e, (new StringBuilder("Failed to log purchase event of ")).append(s3).toString(), s1);
        a(s1);
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public final boolean logPurchase(String s1, String s2, BigDecimal bigdecimal, AppboyProperties appboyproperties)
    {
        return logPurchase(s1, s2, bigdecimal, 1, appboyproperties);
    }

    public final boolean logPushNotificationActionClicked(String s1, String s2)
    {
        if (!ep.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppboyLogger.w(e, "Campaign ID cannot be null or blank");
        return false;
        if (!ep.c(s2))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        AppboyLogger.w(e, "Action ID cannot be null or blank");
        return false;
        boolean flag;
        try
        {
            flag = p.a(ct.b(s1, s2));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            AppboyLogger.w(e, "Failed to log push notification action clicked.", s1);
            a(s1);
            return false;
        }
        return flag;
    }

    public final boolean logPushNotificationOpened(String s1)
    {
        if (!ep.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppboyLogger.w(e, "Campaign ID cannot be null or blank");
        return false;
        boolean flag;
        try
        {
            flag = p.a(ct.b(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            AppboyLogger.w(e, "Failed to log opened push.", s1);
            a(s1);
            return false;
        }
        return flag;
    }

    public final boolean logShare(SocialNetwork socialnetwork)
    {
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        synchronized (w)
        {
            flag = p.a(ct.a(socialnetwork));
        }
        return flag;
        exception;
        AppboyLogger.w(e, (new StringBuilder("Failed to log share to ")).append(socialnetwork).toString(), exception);
        a(exception);
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    public final boolean openSession(Activity activity)
    {
        boolean flag = false;
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        cr cr1 = p.b.c();
        br br1 = p;
        cm cm1 = br1.a();
        br1.f = activity.getClass();
        flag1 = cm1.d.equals(cr1);
        if (!flag1)
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        activity;
        AppboyLogger.w(e, "Failed to open session.", activity);
        a(activity);
        obj;
        JVM INSTR monitorexit ;
        return false;
        activity;
        throw activity;
    }

    public final void registerAppboyGcmMessages(String s1)
    {
        registerAppboyPushMessages(s1);
    }

    public final void registerAppboyPushMessages(String s1)
    {
        if (ep.c(s1))
        {
            AppboyLogger.w(e, "Push registration ID must not be null or blank. Not registering for push messages from Appboy.");
            return;
        }
        try
        {
            r.a(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            AppboyLogger.w(e, "Failed to set the registration ID.", s1);
        }
        a(s1);
        return;
    }

    public final void removeSingleSubscription(IEventSubscriber ieventsubscriber, Class class1)
    {
        try
        {
            k.b(ieventsubscriber, class1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IEventSubscriber ieventsubscriber)
        {
            AppboyLogger.w(e, (new StringBuilder("Failed to remove ")).append(class1.getName()).append(" subscriber.").toString(), ieventsubscriber);
        }
        a(ieventsubscriber);
    }

    public final void requestFeedRefresh()
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        p.a(ac.a);
_L1:
        return;
        Object obj1;
        obj1;
        AppboyLogger.w(e, "Failed to request refresh of feed.", ((Throwable) (obj1)));
        a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void requestFeedRefreshFromCache()
    {
        o.execute(new c(this));
    }

    public final void requestImmediateDataFlush()
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        p.a(ac.d);
_L1:
        return;
        Object obj1;
        obj1;
        AppboyLogger.w(e, "Failed to request data flush.", ((Throwable) (obj1)));
        a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void requestInAppMessageRefresh()
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        p.a(ac.b);
_L1:
        return;
        Object obj1;
        obj1;
        AppboyLogger.w(e, "Failed to request in-app message refresh.", ((Throwable) (obj1)));
        a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void requestSlideupRefresh()
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        AppboyLogger.w(e, "Deprecated method IAppboy#requestSlideupRefresh() called. Use IAppboy#requestInAppMessageRefresh() instead.");
        p.a(ac.b);
_L1:
        return;
        Object obj1;
        obj1;
        AppboyLogger.w(e, "Failed to request in-app message refresh from requestSlideupRefresh().", ((Throwable) (obj1)));
        a(((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void setAppboyNavigator(IAppboyNavigator iappboynavigator)
    {
        B = iappboynavigator;
    }

    public final boolean submitFeedback(String s1, String s2, boolean flag)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        br br1 = p;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (ValidationUtils.isValidEmailAddress(s1)) goto _L3; else goto _L2
_L2:
        throw new IllegalArgumentException("Reply to email address is invalid");
_L5:
        AppboyLogger.w(e, (new StringBuilder("Failed to submit feedback: ")).append(s2).toString(), s1);
        a(s1);
        obj;
        JVM INSTR monitorexit ;
        return false;
_L3:
        try
        {
            if (ep.c(s2))
            {
                throw new IllegalArgumentException("Feedback message cannot be null or blank");
            }
            break MISSING_BLOCK_LABEL_97;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            obj;
        }
        if (true) goto _L5; else goto _L4
_L4:
        JVM INSTR monitorexit ;
        throw s1;
        s1 = new Feedback(s2, s1, flag, br1.d.c(), br1.d.a());
        br1.c.a(new dl(br1.e.getBaseUrlForRequests(), s1));
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    public final void subscribeToFeedUpdates(IEventSubscriber ieventsubscriber)
    {
        try
        {
            k.a(ieventsubscriber, com/appboy/events/FeedUpdatedEvent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IEventSubscriber ieventsubscriber)
        {
            AppboyLogger.w(e, "Failed to add subscriber for feed updates.", ieventsubscriber);
        }
        a(ieventsubscriber);
    }

    public final void subscribeToFeedbackRequestEvents(IEventSubscriber ieventsubscriber, IEventSubscriber ieventsubscriber1)
    {
        if (ieventsubscriber != null)
        {
            try
            {
                k.a(ieventsubscriber, com/appboy/events/SubmitFeedbackSucceeded);
            }
            // Misplaced declaration of an exception variable
            catch (IEventSubscriber ieventsubscriber)
            {
                AppboyLogger.w(e, "Failed to add subscribers for feedback request events.", ieventsubscriber);
                a(ieventsubscriber);
                return;
            }
        }
        if (ieventsubscriber1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        k.a(ieventsubscriber1, com/appboy/events/SubmitFeedbackFailed);
    }

    public final void subscribeToNewInAppMessages(IEventSubscriber ieventsubscriber)
    {
        try
        {
            k.a(ieventsubscriber, com/appboy/events/InAppMessageEvent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IEventSubscriber ieventsubscriber)
        {
            AppboyLogger.w(e, "Failed to add subscriber to new in-app messages.", ieventsubscriber);
        }
        a(ieventsubscriber);
    }

    public final void unregisterAppboyPushMessages()
    {
        try
        {
            r.b();
            return;
        }
        catch (Exception exception)
        {
            AppboyLogger.w(e, "Failed to unset the registration ID.", exception);
            a(exception);
            return;
        }
    }

    static 
    {
        e = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/Appboy.getName()
        });
    }
}
