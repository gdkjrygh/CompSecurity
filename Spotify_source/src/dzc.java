// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class dzc
    implements Runnable
{

    private static final long b;
    private static final long c;
    private static final long d;
    private static final gip e = gip.b("gcm_reg_id");
    private static final gip f = gip.b("gcm_app_version");
    private static final gip g = gip.b("gcm_valid_until");
    private static final gip h = gip.b("gcm_user");
    final gey a;
    private final Context i;
    private final dzd j;
    private final byg k;
    private final gin l;
    private AsyncTask m;
    private boolean n;
    private final String o;

    dzc(Context context, dzd dzd, byg byg, String s)
    {
        i = context;
        j = dzd;
        k = byg;
        n = true;
        o = s;
        l = ((giq)dmz.a(giq)).b(context);
        context = new gez("gcm-registration", this);
        context.a = new gfd(b, TimeUnit.MILLISECONDS);
        context.b = new gfe(c, d, TimeUnit.MILLISECONDS);
        context.c = new gfd(2L, TimeUnit.MINUTES);
        context.d = 100;
        context.e = new gfe(c, d, TimeUnit.MILLISECONDS);
        a = context.a();
    }

    static void a(dzc dzc1, Pair pair)
    {
        Object obj = pair.first;
        obj = dzc1.o;
        obj = pair.second;
        dzc1.l.b().a(e, (String)pair.first).a(f, 0x8c08aa).a(h, dzc1.o).a(g, ((Long)pair.second).longValue()).b();
    }

    static boolean a(dzc dzc1)
    {
        return dzc1.n;
    }

    static long b()
    {
        return d;
    }

    static boolean b(dzc dzc1)
    {
        dzc1.n = false;
        return false;
    }

    static long c()
    {
        return b;
    }

    static Pair c(dzc dzc1)
    {
        String s;
        s = dzc1.l.a(e, "");
        break MISSING_BLOCK_LABEL_13;
        if (s.length() != 0 && dzc1.l.a(f, 0x80000000) == 0x8c08aa)
        {
            long l1 = dzc1.l.a(g, -1L);
            if (System.currentTimeMillis() <= l1)
            {
                String s1 = dzc1.l.a(h, "");
                if (dzc1.o == null || !dzc1.o.equals(s1))
                {
                    dzc1 = dzc1.o;
                    return null;
                } else
                {
                    return Pair.create(s, Long.valueOf(l1));
                }
            }
        }
        return null;
    }

    static byg d(dzc dzc1)
    {
        return dzc1.k;
    }

    static gip d()
    {
        return g;
    }

    static Context e(dzc dzc1)
    {
        return dzc1.i;
    }

    static gip e()
    {
        return h;
    }

    static gey f(dzc dzc1)
    {
        return dzc1.a;
    }

    static gip f()
    {
        return f;
    }

    static dzd g(dzc dzc1)
    {
        return dzc1.j;
    }

    static gip g()
    {
        return e;
    }

    static AsyncTask h(dzc dzc1)
    {
        dzc1.m = null;
        return null;
    }

    static gin i(dzc dzc1)
    {
        return dzc1.l;
    }

    public final void a()
    {
        a.c();
        if (m != null)
        {
            m.cancel(false);
            m = null;
        }
    }

    public final void run()
    {
        m = new AsyncTask() {

            private boolean a;
            private dzc b;

            private transient Pair a()
            {
                if (dzc.a(b))
                {
                    dzc.b(b);
                    Pair pair = dzc.c(b);
                    if (pair != null)
                    {
                        a = true;
                        return pair;
                    }
                }
                if (isCancelled())
                {
                    return null;
                }
                Object obj;
                try
                {
                    obj = dzc.d(b).a(new String[] {
                        "775475490056"
                    });
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Logger.b(((Throwable) (obj)), "Failed to get GCM registration id", new Object[0]);
                    return null;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (dzc.e(b).checkCallingOrSelfPermission("com.google.android.c2dm.permission.RECEIVE") == 0)
                    {
                        Assertion.a("Failed to get GCM registration id even with com.google.android.c2dm.permission.RECEIVE granted", ((Exception) (obj)));
                    }
                    return null;
                }
                if (isCancelled() || obj == null)
                {
                    return null;
                } else
                {
                    long l1 = System.currentTimeMillis();
                    gey gey1 = dzc.f(b);
                    obj = Pair.create(obj, Long.valueOf(l1 + gey1.a(gey1.b)));
                    dzc.a(b, ((Pair) (obj)));
                    return ((Pair) (obj));
                }
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onCancelled(Object obj)
            {
                dzc.h(b);
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (Pair)obj;
                if (obj != null)
                {
                    dzc.g(b).a((String)((Pair) (obj)).first, a);
                    long l2 = ((Long)((Pair) (obj)).second).longValue() - System.currentTimeMillis();
                    long l1;
                    if (l2 > dzc.b())
                    {
                        l1 = dzc.b();
                    } else
                    {
                        l1 = l2;
                        if (l2 < dzc.c())
                        {
                            l1 = dzc.c();
                        }
                    }
                    dzc.f(b).a(l1);
                } else
                {
                    dzc.f(b).e();
                }
                dzc.h(b);
            }

            
            {
                b = dzc.this;
                super();
            }
        };
        m.execute(new Void[0]);
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(10L);
        c = TimeUnit.HOURS.toMillis(20L);
        d = TimeUnit.HOURS.toMillis(28L);
    }

    // Unreferenced inner class dzc$2

/* anonymous class */
    final class _cls2 extends AsyncTask
    {

        private dzc a;

        protected final Object doInBackground(Object aobj[])
        {
            dzc.i(a).b().a(dzc.g()).a(dzc.f()).a(dzc.e()).a(dzc.d()).b();
            return null;
        }

            
            {
                a = dzc.this;
                super();
            }
    }

}
