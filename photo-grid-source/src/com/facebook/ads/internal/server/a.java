// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.AdErrorType;
import com.facebook.ads.internal.dev.Debug;
import com.facebook.ads.internal.dto.b;
import com.facebook.ads.internal.dto.c;
import com.facebook.ads.internal.util.AdInternalSettings;
import com.facebook.ads.internal.util.d;
import com.facebook.ads.internal.util.p;
import com.facebook.ads.internal.util.s;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

// Referenced classes of package com.facebook.ads.internal.server:
//            b, c, d, e

public class a
{

    private static final p h;
    private static final ThreadPoolExecutor i;
    Map a;
    private final com.facebook.ads.internal.server.b b = com.facebook.ads.internal.server.b.a();
    private a c;
    private com.facebook.ads.internal.dto.d d;
    private com.facebook.ads.internal.http.a e;
    private long f;
    private final String g;

    public a()
    {
        String s1 = AdSettings.getUrlPrefix();
        if (AdInternalSettings.shouldUseLiveRailEndpoint())
        {
            if (s.a(s1))
            {
                s1 = "https://ad6.liverail.com/";
            } else
            {
                s1 = String.format("https://ad6.%s.liverail.com/", new Object[] {
                    s1
                });
            }
            g = s1;
            return;
        }
        if (s.a(s1))
        {
            s1 = "https://graph.facebook.com/network_ads_common/";
        } else
        {
            s1 = String.format("https://graph.%s.facebook.com/network_ads_common/", new Object[] {
                s1
            });
        }
        g = s1;
    }

    static com.facebook.ads.internal.http.a a(a a1, com.facebook.ads.internal.http.a a2)
    {
        a1.e = a2;
        return a2;
    }

    static String a(a a1)
    {
        return a1.g;
    }

    private void a(com.facebook.ads.internal.b b1)
    {
        Debug.i((new StringBuilder("AdProvider failed in ")).append(System.currentTimeMillis() - f).append("ms").toString());
        if (c != null)
        {
            (new Handler(Looper.getMainLooper())).post(new _cls4(b1));
        }
        a();
    }

    static void a(a a1, com.facebook.ads.internal.b b1)
    {
        a1.a(b1);
    }

    static void a(a a1, String s1)
    {
        a1.a(s1);
    }

    private void a(com.facebook.ads.internal.server.d d1)
    {
        Debug.i((new StringBuilder("AdProvider completed in ")).append(System.currentTimeMillis() - f).append("ms").toString());
        if (c != null)
        {
            (new Handler(Looper.getMainLooper())).post(new _cls3(d1));
        }
        a();
    }

    private void a(String s1)
    {
        Object obj = b.a(s1);
        _cls5.a[((com.facebook.ads.internal.server.c) (obj)).a().ordinal()];
        JVM INSTR tableswitch 1 2: default 182
    //                   1 65
    //                   2 135;
           goto _L1 _L2 _L3
_L1:
        Debug.e("Facebook Ads SDK unknown response.");
        Debug.v(s1);
        a(AdErrorType.UNKNOWN_RESPONSE.getAdErrorWrapper(s1));
        return;
_L2:
        try
        {
            obj = (com.facebook.ads.internal.server.d)obj;
            c c1 = ((com.facebook.ads.internal.server.d) (obj)).b().a();
            com.facebook.ads.internal.util.d.a(c1.c(), d);
            if (c1.d())
            {
                com.facebook.ads.internal.util.d.a(s1, d);
            }
            a(((com.facebook.ads.internal.server.d) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Debug.e("Failed to parse Facebook Ads SDK response");
        }
        a(AdErrorType.PARSER_FAILURE.getAdErrorWrapper(s1.getMessage()));
        s1.printStackTrace();
        return;
_L3:
        AdErrorType aderrortype;
        obj = ((e)obj).b();
        Debug.e((new StringBuilder("Facebook Ads SDK response error message. ")).append(((String) (obj))).toString());
        aderrortype = AdErrorType.ERROR_MESSAGE;
        if (obj != null)
        {
            s1 = ((String) (obj));
        }
        a(aderrortype.getAdErrorWrapper(s1));
        return;
    }

    private boolean a(Context context)
    {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
        {
            return true;
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    private com.facebook.ads.internal.http.c b()
    {
        return new _cls2();
    }

    static com.facebook.ads.internal.http.c b(a a1)
    {
        return a1.b();
    }

    static com.facebook.ads.internal.http.a c(a a1)
    {
        return a1.e;
    }

    static long d(a a1)
    {
        return a1.f;
    }

    static com.facebook.ads.internal.dto.d e(a a1)
    {
        return a1.d;
    }

    static com.facebook.ads.internal.server.b f(a a1)
    {
        return a1.b;
    }

    static a g(a a1)
    {
        return a1.c;
    }

    public void a()
    {
        if (e != null)
        {
            Debug.v("AdProvider clean up Facebook Ads SDK client");
            e.a(true);
            e = null;
        }
    }

    public void a(Context context, com.facebook.ads.internal.dto.d d1)
    {
        a();
        if (!a(context))
        {
            a(new com.facebook.ads.internal.b(AdErrorType.NETWORK_ERROR, "No network connection"));
            return;
        }
        f = System.currentTimeMillis();
        d = d1;
        if (com.facebook.ads.internal.util.d.a(d1))
        {
            context = com.facebook.ads.internal.util.d.c(d1);
            if (context != null)
            {
                a(((String) (context)));
                return;
            } else
            {
                a(AdErrorType.LOAD_TOO_FREQUENTLY.getAdErrorWrapper(null));
                return;
            }
        } else
        {
            i.submit(new _cls1(context, d1));
            return;
        }
    }

    public void a(a a1)
    {
        c = a1;
    }

    static 
    {
        p p1 = new p();
        h = p1;
        i = (ThreadPoolExecutor)Executors.newCachedThreadPool(p1);
    }

    private class _cls4
        implements Runnable
    {

        final com.facebook.ads.internal.b a;
        final com.facebook.ads.internal.server.a b;

        public void run()
        {
            com.facebook.ads.internal.server.a.g(b).a(a);
        }

        _cls4(com.facebook.ads.internal.b b1)
        {
            b = a.this;
            a = b1;
            super();
        }

        private class a
        {

            public abstract void a(com.facebook.ads.internal.b b1);

            public abstract void a(com.facebook.ads.internal.server.d d1);
        }

    }


    private class _cls3
        implements Runnable
    {

        final com.facebook.ads.internal.server.d a;
        final com.facebook.ads.internal.server.a b;

        public void run()
        {
            com.facebook.ads.internal.server.a.g(b).a(a);
        }

        _cls3(com.facebook.ads.internal.server.d d1)
        {
            b = a.this;
            a = d1;
            super();
        }
    }


    private class _cls5
    {

        static final int a[];

        static 
        {
            a = new int[com.facebook.ads.internal.server.c.a.values().length];
            try
            {
                a[com.facebook.ads.internal.server.c.a.c.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.facebook.ads.internal.server.c.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls2 extends com.facebook.ads.internal.http.c
    {

        final com.facebook.ads.internal.server.a a;

        public void a()
        {
            Debug.d((new StringBuilder("Facebook Ads SDK req start delay=")).append(System.currentTimeMillis() - com.facebook.ads.internal.server.a.d(a)).append("ms").toString());
        }

        public void a(int j, String s1)
        {
            com.facebook.ads.internal.util.d.b(com.facebook.ads.internal.server.a.e(a));
            Debug.i((new StringBuilder("Facebook Ads SDK req complete ")).append(System.currentTimeMillis() - com.facebook.ads.internal.server.a.d(a)).append("ms ").toString());
            com.facebook.ads.internal.server.a.a(a, null);
            com.facebook.ads.internal.server.a.a(a, s1);
        }

        public void a(Throwable throwable, String s1)
        {
            com.facebook.ads.internal.util.d.b(com.facebook.ads.internal.server.a.e(a));
            long l = System.currentTimeMillis();
            long l1 = com.facebook.ads.internal.server.a.d(a);
            Debug.e((new StringBuilder("Facebook Ads SDK req failed ")).append(l - l1).append("ms ").append(s1).append(" ").append(throwable).toString());
            com.facebook.ads.internal.server.a.a(a, null);
            String s2;
            com.facebook.ads.internal.server.a a1;
            AdErrorType aderrortype;
            throwable = com.facebook.ads.internal.server.a.f(a).a(s1);
            if (throwable.a() != com.facebook.ads.internal.server.c.a.b)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            s2 = ((com.facebook.ads.internal.server.e)throwable).b();
            a1 = a;
            aderrortype = AdErrorType.ERROR_MESSAGE;
            throwable = s2;
            if (s2 == null)
            {
                throwable = s1;
            }
            try
            {
                com.facebook.ads.internal.server.a.a(a1, aderrortype.getAdErrorWrapper(throwable));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable) { }
            com.facebook.ads.internal.server.a.a(a, new com.facebook.ads.internal.b(AdErrorType.NETWORK_ERROR, s1));
            return;
        }

        _cls2()
        {
            a = a.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final Context a;
        final com.facebook.ads.internal.dto.d b;
        final com.facebook.ads.internal.server.a c;

        public void run()
        {
            com.facebook.ads.internal.dto.e.b(a);
            c.a = b.e();
            Debug.d(c.a.toString());
            try
            {
                com.facebook.ads.internal.server.a.a(c, new com.facebook.ads.internal.http.a(a, b.f));
                com.facebook.ads.internal.server.a.c(c).a(com.facebook.ads.internal.server.a.a(c), new com.facebook.ads.internal.http.d(c.a), com.facebook.ads.internal.server.a.b(c));
                return;
            }
            catch (Exception exception)
            {
                com.facebook.ads.internal.server.a.a(c, AdErrorType.AD_REQUEST_FAILED.getAdErrorWrapper(exception.getMessage()));
            }
        }

        _cls1(Context context, com.facebook.ads.internal.dto.d d1)
        {
            c = a.this;
            a = context;
            b = d1;
            super();
        }
    }

}
