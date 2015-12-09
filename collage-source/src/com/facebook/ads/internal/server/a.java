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
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.dto.c;
import com.facebook.ads.internal.dto.d;
import com.facebook.ads.internal.dto.e;
import com.facebook.ads.internal.dto.f;
import com.facebook.ads.internal.util.AdInternalSettings;
import com.facebook.ads.internal.util.p;
import com.facebook.ads.internal.util.s;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;

// Referenced classes of package com.facebook.ads.internal.server:
//            b, c, d, e

public class com.facebook.ads.internal.server.a
{
    public static interface a
    {

        public abstract void a(b b1);

        public abstract void a(com.facebook.ads.internal.server.d d1);
    }


    private static final p g;
    private static final ThreadPoolExecutor h;
    Map a;
    private final com.facebook.ads.internal.server.b b = com.facebook.ads.internal.server.b.a();
    private a c;
    private e d;
    private com.facebook.ads.internal.http.a e;
    private final String f;

    public com.facebook.ads.internal.server.a()
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
            f = s1;
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
        f = s1;
    }

    static com.facebook.ads.internal.http.a a(com.facebook.ads.internal.server.a a1, com.facebook.ads.internal.http.a a2)
    {
        a1.e = a2;
        return a2;
    }

    static String a(com.facebook.ads.internal.server.a a1)
    {
        return a1.f;
    }

    private void a(b b1)
    {
        if (c != null)
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable(b1) {

                final b a;
                final com.facebook.ads.internal.server.a b;

                public void run()
                {
                    com.facebook.ads.internal.server.a.f(b).a(a);
                }

            
            {
                b = com.facebook.ads.internal.server.a.this;
                a = b1;
                super();
            }
            });
        }
        a();
    }

    static void a(com.facebook.ads.internal.server.a a1, b b1)
    {
        a1.a(b1);
    }

    static void a(com.facebook.ads.internal.server.a a1, String s1)
    {
        a1.a(s1);
    }

    private void a(com.facebook.ads.internal.server.d d1)
    {
        if (c != null)
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable(d1) {

                final com.facebook.ads.internal.server.d a;
                final com.facebook.ads.internal.server.a b;

                public void run()
                {
                    com.facebook.ads.internal.server.a.f(b).a(a);
                }

            
            {
                b = com.facebook.ads.internal.server.a.this;
                a = d1;
                super();
            }
            });
        }
        a();
    }

    private void a(String s1)
    {
        Object obj = b.a(s1);
        static class _cls5
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

        _cls5.a[((com.facebook.ads.internal.server.c) (obj)).a().ordinal()];
        JVM INSTR tableswitch 1 2: default 145
    //                   1 56
    //                   2 117;
           goto _L1 _L2 _L3
_L1:
        a(AdErrorType.UNKNOWN_RESPONSE.getAdErrorWrapper(s1));
        return;
_L2:
        try
        {
            obj = (com.facebook.ads.internal.server.d)obj;
            d d1 = ((com.facebook.ads.internal.server.d) (obj)).b().a();
            com.facebook.ads.internal.util.d.a(d1.c(), d);
            if (d1.d())
            {
                com.facebook.ads.internal.util.d.a(s1, d);
            }
            a(((com.facebook.ads.internal.server.d) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a(AdErrorType.PARSER_FAILURE.getAdErrorWrapper(s1.getMessage()));
        }
        return;
_L3:
        AdErrorType aderrortype;
        obj = ((com.facebook.ads.internal.server.e)obj).b();
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
        boolean flag;
        if (context != null && context.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    private com.facebook.ads.internal.http.c b()
    {
        return new com.facebook.ads.internal.http.c() {

            final com.facebook.ads.internal.server.a a;

            public void a()
            {
            }

            public void a(int i, String s1)
            {
                com.facebook.ads.internal.util.d.b(com.facebook.ads.internal.server.a.d(a));
                com.facebook.ads.internal.server.a.a(a, null);
                com.facebook.ads.internal.server.a.a(a, s1);
            }

            public void a(Throwable throwable, String s1)
            {
                com.facebook.ads.internal.util.d.b(com.facebook.ads.internal.server.a.d(a));
                com.facebook.ads.internal.server.a.a(a, null);
                Object obj;
                com.facebook.ads.internal.server.a a1;
                AdErrorType aderrortype;
                obj = com.facebook.ads.internal.server.a.e(a).a(s1);
                if (((com.facebook.ads.internal.server.c) (obj)).a() != com.facebook.ads.internal.server.c.a.b)
                {
                    break MISSING_BLOCK_LABEL_82;
                }
                obj = ((com.facebook.ads.internal.server.e)obj).b();
                a1 = a;
                aderrortype = AdErrorType.ERROR_MESSAGE;
                if (obj != null)
                {
                    s1 = ((String) (obj));
                }
                try
                {
                    com.facebook.ads.internal.server.a.a(a1, aderrortype.getAdErrorWrapper(s1));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s1) { }
                com.facebook.ads.internal.server.a.a(a, new b(AdErrorType.NETWORK_ERROR, throwable.getMessage()));
                return;
            }

            
            {
                a = com.facebook.ads.internal.server.a.this;
                super();
            }
        };
    }

    static com.facebook.ads.internal.http.c b(com.facebook.ads.internal.server.a a1)
    {
        return a1.b();
    }

    static com.facebook.ads.internal.http.a c(com.facebook.ads.internal.server.a a1)
    {
        return a1.e;
    }

    static e d(com.facebook.ads.internal.server.a a1)
    {
        return a1.d;
    }

    static com.facebook.ads.internal.server.b e(com.facebook.ads.internal.server.a a1)
    {
        return a1.b;
    }

    static a f(com.facebook.ads.internal.server.a a1)
    {
        return a1.c;
    }

    public void a()
    {
        if (e != null)
        {
            e.a(true);
            e = null;
        }
    }

    public void a(Context context, e e1)
    {
        a();
        if (!a(context))
        {
            a(new b(AdErrorType.NETWORK_ERROR, "No network connection"));
            return;
        }
        d = e1;
        if (com.facebook.ads.internal.util.d.a(e1))
        {
            context = com.facebook.ads.internal.util.d.c(e1);
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
            h.submit(new Runnable(context, e1) {

                final Context a;
                final e b;
                final com.facebook.ads.internal.server.a c;

                public void run()
                {
                    com.facebook.ads.internal.dto.f.b(a);
                    c.a = b.e();
                    try
                    {
                        com.facebook.ads.internal.server.a.a(c, new com.facebook.ads.internal.http.a(a, b.e));
                        com.facebook.ads.internal.server.a.c(c).a(com.facebook.ads.internal.server.a.a(c), new com.facebook.ads.internal.http.d(c.a), com.facebook.ads.internal.server.a.b(c));
                        return;
                    }
                    catch (Exception exception)
                    {
                        com.facebook.ads.internal.server.a.a(c, AdErrorType.AD_REQUEST_FAILED.getAdErrorWrapper(exception.getMessage()));
                    }
                }

            
            {
                c = com.facebook.ads.internal.server.a.this;
                a = context;
                b = e1;
                super();
            }
            });
            return;
        }
    }

    public void a(a a1)
    {
        c = a1;
    }

    static 
    {
        g = new p();
        h = (ThreadPoolExecutor)Executors.newCachedThreadPool(g);
    }
}
