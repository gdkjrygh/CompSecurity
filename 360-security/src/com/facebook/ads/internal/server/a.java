// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.e;
import com.facebook.ads.internal.AdErrorType;
import com.facebook.ads.internal.d.b;
import com.facebook.ads.internal.d.c;
import com.facebook.ads.internal.d.d;
import com.facebook.ads.internal.util.f;
import com.facebook.ads.internal.util.q;
import com.facebook.ads.internal.util.t;
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

        public abstract void a(com.facebook.ads.internal.b b1);

        public abstract void a(com.facebook.ads.internal.server.d d1);
    }


    private static final q j;
    private static final ThreadPoolExecutor k;
    Map a;
    private final com.facebook.ads.internal.server.b b = com.facebook.ads.internal.server.b.a();
    private a c;
    private Context d;
    private d e;
    private com.facebook.ads.internal.e.a f;
    private long g;
    private boolean h;
    private final String i;

    public com.facebook.ads.internal.server.a()
    {
        String s = com.facebook.ads.e.a();
        if (t.a(s))
        {
            s = "https://graph.facebook.com/network_ads_common/";
        } else
        {
            s = String.format("https://graph.%s.facebook.com/network_ads_common/", new Object[] {
                s
            });
        }
        i = s;
    }

    static com.facebook.ads.internal.e.a a(com.facebook.ads.internal.server.a a1, com.facebook.ads.internal.e.a a2)
    {
        a1.f = a2;
        return a2;
    }

    static String a(com.facebook.ads.internal.server.a a1)
    {
        return a1.i;
    }

    private void a(com.facebook.ads.internal.b b1)
    {
        com.facebook.ads.internal.c.a.c((new StringBuilder()).append("AdProvider failed in ").append(System.currentTimeMillis() - g).append("ms").toString());
        if (c != null)
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable(b1) {

                final com.facebook.ads.internal.b a;
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

    static void a(com.facebook.ads.internal.server.a a1, com.facebook.ads.internal.b b1)
    {
        a1.a(b1);
    }

    static void a(com.facebook.ads.internal.server.a a1, String s)
    {
        a1.a(s);
    }

    private void a(com.facebook.ads.internal.server.d d1)
    {
        com.facebook.ads.internal.c.a.c((new StringBuilder()).append("AdProvider completed in ").append(System.currentTimeMillis() - g).append("ms").toString());
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

    private void a(String s)
    {
        Object obj = b.a(s);
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
        JVM INSTR tableswitch 1 2: default 219
    //                   1 70
    //                   2 142;
           goto _L1 _L2 _L3
_L1:
        com.facebook.ads.internal.c.a.d("Facebook Ads SDK unknown response.");
        com.facebook.ads.internal.c.a.a(s);
        a(AdErrorType.UNKNOWN_RESPONSE.getAdErrorWrapper(s));
_L4:
        h = false;
        return;
_L2:
        AdErrorType aderrortype;
        try
        {
            obj = (com.facebook.ads.internal.server.d)obj;
            c c1 = ((com.facebook.ads.internal.server.d) (obj)).b().a();
            com.facebook.ads.internal.util.f.a(c1.c(), e);
            if (c1.d())
            {
                com.facebook.ads.internal.util.f.a(s, e);
            }
            a(((com.facebook.ads.internal.server.d) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.ads.internal.c.a.d("Failed to parse Facebook Ads SDK response");
            a(AdErrorType.PARSER_FAILURE.getAdErrorWrapper(s.getMessage()));
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.ads.internal.c.a.d("Failed to parse Facebook Ads SDK response");
            a(AdErrorType.PARSER_FAILURE.getAdErrorWrapper(s.getMessage()));
            s.printStackTrace();
            return;
        }
          goto _L4
_L3:
        obj = ((com.facebook.ads.internal.server.e)obj).b();
        com.facebook.ads.internal.c.a.d((new StringBuilder()).append("Facebook Ads SDK response error message. ").append(((String) (obj))).toString());
        aderrortype = AdErrorType.ERROR_MESSAGE;
        if (obj != null)
        {
            s = ((String) (obj));
        }
        a(aderrortype.getAdErrorWrapper(s));
          goto _L4
    }

    private com.facebook.ads.internal.e.c b()
    {
        return new com.facebook.ads.internal.e.c() {

            final com.facebook.ads.internal.server.a a;

            public void a()
            {
                com.facebook.ads.internal.c.a.b((new StringBuilder()).append("Facebook Ads SDK req start delay=").append(System.currentTimeMillis() - com.facebook.ads.internal.server.a.d(a)).append("ms").toString());
            }

            public void a(int l, String s)
            {
                com.facebook.ads.internal.util.f.b(com.facebook.ads.internal.server.a.e(a));
                com.facebook.ads.internal.c.a.c((new StringBuilder()).append("Facebook Ads SDK req complete ").append(System.currentTimeMillis() - com.facebook.ads.internal.server.a.d(a)).append("ms ").toString());
                com.facebook.ads.internal.server.a.a(a, null);
                com.facebook.ads.internal.server.a.a(a, s);
            }

            public void a(Throwable throwable, String s)
            {
                com.facebook.ads.internal.util.f.b(com.facebook.ads.internal.server.a.e(a));
                long l = System.currentTimeMillis();
                long l1 = com.facebook.ads.internal.server.a.d(a);
                com.facebook.ads.internal.c.a.d((new StringBuilder()).append("Facebook Ads SDK req failed ").append(l - l1).append("ms ").append(s).append(" ").append(throwable).toString());
                com.facebook.ads.internal.server.a.a(a, null);
                com.facebook.ads.internal.server.a.a(a, new com.facebook.ads.internal.b(AdErrorType.NETWORK_ERROR, throwable.getMessage()));
            }

            
            {
                a = com.facebook.ads.internal.server.a.this;
                super();
            }
        };
    }

    static com.facebook.ads.internal.e.c b(com.facebook.ads.internal.server.a a1)
    {
        return a1.b();
    }

    static com.facebook.ads.internal.e.a c(com.facebook.ads.internal.server.a a1)
    {
        return a1.f;
    }

    static long d(com.facebook.ads.internal.server.a a1)
    {
        return a1.g;
    }

    static d e(com.facebook.ads.internal.server.a a1)
    {
        return a1.e;
    }

    static a f(com.facebook.ads.internal.server.a a1)
    {
        return a1.c;
    }

    public void a()
    {
        if (f != null)
        {
            com.facebook.ads.internal.c.a.a("AdProvider clean up Facebook Ads SDK client");
            f.a(true);
            f = null;
        }
        d = null;
    }

    public void a(Context context, d d1)
    {
        a();
        g = System.currentTimeMillis();
        h = true;
        d = context;
        e = d1;
        if (com.facebook.ads.internal.util.f.a(d1))
        {
            context = com.facebook.ads.internal.util.f.c(d1);
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
            k.submit(new Runnable(context, d1) {

                final Context a;
                final d b;
                final com.facebook.ads.internal.server.a c;

                public void run()
                {
                    com.facebook.ads.internal.d.e.b(a);
                    c.a = b.g();
                    com.facebook.ads.internal.c.a.b(c.a.toString());
                    try
                    {
                        com.facebook.ads.internal.server.a.a(c, new com.facebook.ads.internal.e.a(a, b.i));
                        com.facebook.ads.internal.server.a.c(c).a(com.facebook.ads.internal.server.a.a(c), new com.facebook.ads.internal.e.d(c.a), com.facebook.ads.internal.server.a.b(c));
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
                b = d1;
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
        j = new q();
        k = (ThreadPoolExecutor)Executors.newCachedThreadPool(j);
    }
}
