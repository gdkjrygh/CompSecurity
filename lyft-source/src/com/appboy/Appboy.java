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
import bo.app.ad;
import bo.app.ah;
import bo.app.au;
import bo.app.av;
import bo.app.aw;
import bo.app.ax;
import bo.app.ay;
import bo.app.az;
import bo.app.b;
import bo.app.ba;
import bo.app.bb;
import bo.app.be;
import bo.app.bf;
import bo.app.bg;
import bo.app.bk;
import bo.app.bl;
import bo.app.bm;
import bo.app.bo;
import bo.app.bt;
import bo.app.bu;
import bo.app.bx;
import bo.app.by;
import bo.app.c;
import bo.app.cc;
import bo.app.cf;
import bo.app.ci;
import bo.app.cj;
import bo.app.cs;
import bo.app.cx;
import bo.app.cy;
import bo.app.cz;
import bo.app.d;
import bo.app.dr;
import bo.app.eg;
import bo.app.ei;
import bo.app.ek;
import bo.app.em;
import bo.app.ep;
import bo.app.er;
import bo.app.eu;
import bo.app.ev;
import bo.app.ew;
import bo.app.ex;
import bo.app.fa;
import bo.app.g;
import bo.app.gw;
import bo.app.h;
import bo.app.ih;
import bo.app.ii;
import bo.app.ij;
import bo.app.il;
import bo.app.im;
import bo.app.io;
import bo.app.ip;
import bo.app.iq;
import bo.app.iu;
import bo.app.iv;
import bo.app.iw;
import bo.app.ix;
import bo.app.jr;
import bo.app.js;
import bo.app.kd;
import bo.app.kk;
import bo.app.kz;
import bo.app.la;
import bo.app.m;
import bo.app.o;
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
    private static final Set f = gw.a("AED", "AFN", "ALL", "AMD", "ANG", "AOA", new String[] {
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
    private static final Set g = gw.a("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    private static volatile Appboy h = null;
    private static final Object x = new Object();
    private static volatile IAppboyEndpointProvider y;
    private static volatile IAppboyNotificationFactory z;
    private IAppboyNavigator B;
    volatile ew a;
    public volatile ei b;
    volatile em c;
    final XmlAppConfigurationProvider d;
    private final Context i;
    private final iv j;
    private final bb k;
    private volatile AppboyUser l;
    private volatile h m;
    private volatile be n;
    private volatile ThreadPoolExecutor o;
    private volatile bx p;
    private final m q;
    private ci r;
    private final bu s;
    private final cc t;
    private final bt u = null;
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
        s = new bu(i);
        ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor(4, 8, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10));
        k = new bb(threadpoolexecutor);
        int i1 = Math.min((int)Runtime.getRuntime().maxMemory() / 32, 0x100000);
        context = e;
        String.format("Setting maximum in-memory image cache size to %d bytes.", new Object[] {
            Integer.valueOf(i1)
        });
        Object obj = new ix(i);
        if (((ix) (obj)).c != null || ((ix) (obj)).d != null)
        {
            kz.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        obj.h = 3;
        obj.i = true;
        context = new im();
        if (((ix) (obj)).o != null)
        {
            kz.c("discCache() and discCacheFileNameGenerator() calls overlap each other", new Object[0]);
        }
        obj.p = context;
        if (((ix) (obj)).o != null || ((ix) (obj)).l > 0)
        {
            kz.c("discCache(), discCacheSize() and discCacheFileCount calls overlap each other", new Object[0]);
        }
        obj.l = 0;
        obj.m = 50;
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("memoryCacheSize must be a positive number");
        }
        if (((ix) (obj)).n != null)
        {
            kz.c("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
        }
        obj.k = i1;
        i1 = js.b;
        if (((ix) (obj)).c != null || ((ix) (obj)).d != null)
        {
            kz.c("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        obj.j = i1;
        context = new iu();
        context.h = true;
        context.i = true;
        obj.s = context.a();
        if (((ix) (obj)).c == null)
        {
            obj.c = iq.a(((ix) (obj)).g, ((ix) (obj)).h, ((ix) (obj)).j);
        } else
        {
            obj.e = true;
        }
        if (((ix) (obj)).d == null)
        {
            obj.d = iq.a(((ix) (obj)).g, ((ix) (obj)).h, ((ix) (obj)).j);
        } else
        {
            obj.f = true;
        }
        if (((ix) (obj)).o == null)
        {
            if (((ix) (obj)).p == null)
            {
                obj.p = new il();
            }
            context = ((ix) (obj)).b;
            bo.app.ik ik = ((ix) (obj)).p;
            int j1 = ((ix) (obj)).l;
            int k1 = ((ix) (obj)).m;
            long l2;
            if (j1 > 0)
            {
                context = new ii(la.a(context), ik, j1);
            } else
            if (k1 > 0)
            {
                context = new ih(la.a(context), ik, k1);
            } else
            {
                context = new ij(la.a(context, true), ik);
            }
            obj.o = context;
        }
        if (((ix) (obj)).n == null)
        {
            k1 = ((ix) (obj)).k;
            j1 = k1;
            if (k1 == 0)
            {
                j1 = (int)(Runtime.getRuntime().maxMemory() / 8L);
            }
            obj.n = new ip(j1);
        }
        if (((ix) (obj)).i)
        {
            obj.n = new io(((ix) (obj)).n, new jr());
        }
        if (((ix) (obj)).q == null)
        {
            obj.q = new kk(((ix) (obj)).b);
        }
        if (((ix) (obj)).r == null)
        {
            obj.r = new kd(((ix) (obj)).t);
        }
        if (((ix) (obj)).s == null)
        {
            obj.s = (new iu()).a();
        }
        context = new iw(((ix) (obj)), (byte)0);
        j = iv.a();
        j.a(context);
        r = new cj(i, d);
        if (cc.a(i, d))
        {
            AppboyLogger.i(e, "Google Cloud Messaging found.  Setting up Google Cloud Messaging");
            t = new cc(i, r);
            obj = d.getGcmSenderId();
            if (d.isGcmMessagingRegistrationEnabled() && obj != null)
            {
                context = t;
                if (((cc) (context)).c.a() != null)
                {
                    AppboyLogger.w(cc.a, "The device is already registered with the GCM server and is eligible to receive GCM messages.");
                } else
                {
                    Object obj1 = cc.a;
                    obj = fa.a().b().a(Arrays.asList(new String[] {
                        obj
                    }));
                    obj1 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    ((Intent) (obj1)).setPackage("com.google.android.gsf");
                    ((Intent) (obj1)).putExtra("app", PendingIntent.getBroadcast(((cc) (context)).b, 0, new Intent(), 0));
                    ((Intent) (obj1)).putExtra("sender", ((String) (obj)));
                    ((cc) (context)).b.startService(((Intent) (obj1)));
                }
            }
        } else
        {
            t = null;
        }
        if (!bt.a(i) || cc.a(i, d)) goto _L2; else goto _L1
_L1:
        AppboyLogger.i(e, "Amazon Device Messaging found.  Setting up Amazon Device Messaging");
        u = new bt(i, r);
        context = u;
        if (((bt) (context)).b.a() == null) goto _L4; else goto _L3
_L3:
        AppboyLogger.i(bt.c, "The device is already registered with the ADM server and is eligible to receive ADM messages.");
        AppboyLogger.i(bt.c, (new StringBuilder("ADM registration id: ")).append(((bt) (context)).b.a()).toString());
        ((bt) (context)).b.a(((bt) (context)).b.a());
_L6:
        if (t == null && u == null)
        {
            AppboyLogger.e(e, "Did not find support for Google Cloud Messaging or Amazon Device Messaging");
        }
        c = new em(i, d.getAppboyApiKey().toString());
        context = new ew(i, q, d, k, s, r, c, A);
        a(context);
        a(((ew) (context)).i, ((ew) (context)).d);
        threadpoolexecutor.execute(new a(this));
        l2 = System.nanoTime();
        context = e;
        String.format("Appboy loaded in %d ms.", new Object[] {
            Long.valueOf(TimeUnit.MILLISECONDS.convert(l2 - l1, TimeUnit.NANOSECONDS))
        });
        return;
_L4:
        context = new ADM(((bt) (context)).a);
        if (context.isSupported())
        {
            AppboyLogger.i(bt.c, "Registering with ADM server...");
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

    private void a(ek ek, o o1)
    {
        o.execute(new b(this, ek, o1));
    }

    private void a(ew ew1)
    {
        Object obj = v;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = w;
        obj1;
        JVM INSTR monitorenter ;
        Object obj3;
        a = ew1;
        m = ew1.j;
        p = ew1.e;
        l = new AppboyUser(ew1.a, ew1.e, q.a(), ew1.k, c);
        bo.app.at at = ew1.g;
        obj3 = ew1.c;
        ((bb) (obj3)).a(new av(at), bo/app/bf);
        ((bb) (obj3)).a(new aw(at), bo/app/bm);
        ((bb) (obj3)).a(new ax(at), bo/app/bl);
        ((bb) (obj3)).a(new ay(at), bo/app/bk);
        ((bb) (obj3)).a(new az(at), java/lang/Throwable);
        ((bb) (obj3)).a(new ba(at), bo/app/bo);
        ((bb) (obj3)).a(new au(at), bo/app/bg);
        obj3 = ew1.d;
        Object obj2 = ((o) (obj3)).d;
        obj2;
        JVM INSTR monitorenter ;
        if (!((o) (obj3)).f) goto _L2; else goto _L1
_L1:
        obj3 = o.a;
_L3:
        n = ew1.c;
        o = ew1.h;
        b = ew1.f;
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
        ew1;
        obj2;
        JVM INSTR monitorexit ;
        throw ew1;
        ew1;
        obj1;
        JVM INSTR monitorexit ;
        throw ew1;
        ew1;
        obj;
        JVM INSTR monitorexit ;
        throw ew1;
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
            if (appboy.i.checkCallingOrSelfPermission(s1) == -1)
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

    public static bb b(Appboy appboy)
    {
        return appboy.k;
    }

    public static iv c(Appboy appboy)
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
                if (!ev.b(s1))
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
        ev.a(s1);
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
        ((bx) (obj3)).b.e();
        obj3 = q;
        ev.a(s1);
        obj3 = ((m) (obj3)).a.edit();
        ((android.content.SharedPreferences.Editor) (obj3)).putString("last_user", s1);
        ((android.content.SharedPreferences.Editor) (obj3)).commit();
        obj3 = a;
        ew ew1 = new ew(i, q, d, k, s, r, c, A);
        a(ew1);
        a(ew1.i, ew1.d);
        a.b.c();
        p.a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_556;
        }
        p.a(cz.a(s1));
_L7:
        p.a(ah.a);
        ((ew) (obj3)).h.execute(new ex(((ew) (obj3))));
          goto _L5
_L4:
        AppboyLogger.i(e, String.format("Changing current user %s to new user %s.", new Object[] {
            obj1, s1
        }));
        FeedUpdatedEvent feedupdatedevent = new FeedUpdatedEvent(new ArrayList(), s1, false, er.a());
        k.a(feedupdatedevent, com/appboy/events/FeedUpdatedEvent);
          goto _L6
        p.a(cz.a(((String) (obj1)), s1));
          goto _L7
    }

    public final boolean closeSession(Activity activity)
    {
        Object obj = w;
        obj;
        JVM INSTR monitorenter ;
        bx bx1 = p;
        if (bx1.f == null || activity.getClass().equals(bx1.f)) goto _L2; else goto _L1
_L1:
        activity = bx.a;
        activity = null;
_L4:
        if (activity == null)
        {
            break; /* Loop/switch isn't completed */
        }
        AppboyLogger.i(e, (new StringBuilder("Closed session with ID: ")).append(((cs) (activity)).d).toString());
        obj;
        JVM INSTR monitorexit ;
        return true;
_L2:
        activity = bx1.b.b();
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
            messagetype = (MessageType)eu.a(((JSONObject) (obj)), "type", com/appboy/enums/inappmessage/MessageType, null);
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
        if (!ev.c(s1))
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
        boolean flag = p.a(cz.a(s1, appboyproperties));
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
        if (!ev.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppboyLogger.e(e, "Card ID cannot be null");
        return false;
        boolean flag;
        try
        {
            flag = p.a(cz.d(s1));
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
        if (!ev.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppboyLogger.e(e, "Card ID cannot be null");
        return false;
        boolean flag;
        try
        {
            flag = p.a(cz.c(s1));
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
            flag = p.a(cz.e());
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
            flag = p.a(cz.f());
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
        if (!ev.c(s1))
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
        boolean flag = p.a(cz.a(s1, "USD", ep.a(i1), 1, null));
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
        if (!ev.c(s1))
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
        boolean flag = p.a(cz.a(s1, s2, bigdecimal, i1, appboyproperties));
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
        if (!ev.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppboyLogger.w(e, "Campaign ID cannot be null or blank");
        return false;
        if (!ev.c(s2))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        AppboyLogger.w(e, "Action ID cannot be null or blank");
        return false;
        boolean flag;
        try
        {
            flag = p.a(cz.b(s1, s2));
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
        if (!ev.c(s1))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        AppboyLogger.w(e, "Campaign ID cannot be null or blank");
        return false;
        boolean flag;
        try
        {
            flag = p.a(cz.b(s1));
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
            flag = p.a(cz.a(socialnetwork));
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
        cx cx1 = p.b.c();
        bx bx1 = p;
        cs cs1 = bx1.a();
        bx1.f = activity.getClass();
        flag1 = cs1.d.equals(cx1);
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
        p.a(ah.a);
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
        p.a(ah.d);
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
        p.a(ah.b);
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
        p.a(ah.b);
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
        bx bx1 = p;
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
            if (ev.c(s2))
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
        s1 = new Feedback(s2, s1, flag, bx1.d.c(), bx1.d.a());
        bx1.c.a(new dr(bx1.e.getBaseUrlForRequests(), s1));
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
