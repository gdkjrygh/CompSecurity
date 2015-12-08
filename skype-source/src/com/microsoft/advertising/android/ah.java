// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import android.os.Looper;
import com.microsoft.advertising.android.a.a;
import com.microsoft.advertising.android.a.b;
import com.microsoft.advertising.android.a.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.microsoft.advertising.android:
//            ai, f, ae, av, 
//            g, h, i, af, 
//            AdControl, bo

final class ah
    implements ai
{

    private final String a;
    private final List b = new CopyOnWriteArrayList();
    private final Handler c = new Handler(Looper.getMainLooper());
    private final f d;

    public ah(f f1)
    {
        d = f1;
        if (f1 != null)
        {
            f1 = f1.o();
        } else
        {
            f1 = null;
        }
        a = f1;
    }

    static List a(ah ah1)
    {
        return ah1.b;
    }

    private void a(String s, e e1, String s1)
    {
        c.post(new Runnable(e1, s, s1) {

            final ah a;
            private final e b;
            private final String c;
            private final String d;

            public final void run()
            {
                Iterator iterator = com.microsoft.advertising.android.ah.a(a).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        return;
                    }
                    b b1 = (b)iterator.next();
                    b1.a(new h(a.a(), com.microsoft.advertising.android.a.a.a.e, b, c, d));
                    b1.a(a.a(), c, b);
                } while (true);
            }

            
            {
                a = ah.this;
                b = e1;
                c = s;
                d = s1;
                super();
            }
        });
    }

    final AdControl a()
    {
        if (d != null)
        {
            return d.b();
        } else
        {
            return null;
        }
    }

    public final void a(a a1)
    {
        b(a1);
    }

    public final void a(com.microsoft.advertising.android.a.b.a a1)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((b)iterator.next()).a(a(), a1);
        } while (true);
    }

    public final void a(b b1)
    {
        if (b1 != null && !b.contains(b1))
        {
            b.add(b1);
        }
    }

    public final void a(bo bo)
    {
        c.post(new Runnable(bo) {

            final ah a;
            private final bo b;

            public final void run()
            {
                Iterator iterator = com.microsoft.advertising.android.ah.a(a).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        b.a();
                        return;
                    }
                    ((b)iterator.next()).a(b);
                } while (true);
            }

            
            {
                a = ah.this;
                b = bo1;
                super();
            }
        });
    }

    public final void a(g g1, ae ae1)
    {
        if (ae1 != null)
        {
            com.microsoft.advertising.android.av.a("EventLogger", (new StringBuilder("firing debug event: ")).append(ae1.a()).toString());
        }
        if (g1 != null)
        {
            g1 = g1.b().b();
        } else
        {
            g1 = null;
        }
        b(new h(g1, ae1));
    }

    public final void a(Exception exception)
    {
        if (com/microsoft/advertising/android/i.isAssignableFrom(exception.getClass()))
        {
            c(exception.getMessage(), ((i)exception).a());
            return;
        } else
        {
            c(exception.getMessage(), e.a);
            return;
        }
    }

    public final void a(Exception exception, e e1)
    {
        c(exception.getMessage(), e1);
    }

    public final void a(String s, long l)
    {
        long l1 = System.currentTimeMillis();
        if (com.microsoft.advertising.android.af.a())
        {
            b(com.microsoft.advertising.android.h.a(a(), s, Long.valueOf(l1 - l)));
        }
    }

    public final void a(String s, e e1)
    {
        a(s, e1, null);
    }

    public final void a(String s, String s1)
    {
        c.post(new Runnable(s, s1) {

            final ah a;
            private final String b;
            private final String c;

            public final void run()
            {
                Iterator iterator = com.microsoft.advertising.android.ah.a(a).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        return;
                    }
                    ((b)iterator.next()).a(b, c);
                } while (true);
            }

            
            {
                a = ah.this;
                b = s;
                c = s1;
                super();
            }
        });
    }

    public final void a(String s, boolean flag, String s1)
    {
        if (flag)
        {
            a((new StringBuilder("Cannot refresh: ")).append(s).toString(), e.h, s1);
            return;
        } else
        {
            c("AdControl.autoRefresh()", (new StringBuilder("can't auto refresh; ")).append(s).toString());
            return;
        }
    }

    public final void b()
    {
        if (c != null)
        {
            c.removeCallbacksAndMessages(null);
        }
    }

    public final void b(a a1)
    {
        if (!com.microsoft.advertising.android.af.a() && a1 != null && a1.b() == com.microsoft.advertising.android.a.a.a.j)
        {
            return;
        } else
        {
            c.post(new Runnable(a1) {

                final ah a;
                private final a b;

                public final void run()
                {
                    Iterator iterator = com.microsoft.advertising.android.ah.a(a).iterator();
_L1:
                    if (!iterator.hasNext())
                    {
                        return;
                    }
                    try
                    {
                        ((b)iterator.next()).a(b);
                    }
                    catch (Exception exception)
                    {
                        com.microsoft.advertising.android.av.a("EventLogger", "exception thrown by listener", exception);
                        return;
                    }
                      goto _L1
                }

            
            {
                a = ah.this;
                b = a1;
                super();
            }
            });
            return;
        }
    }

    public final void b(String s, e e1)
    {
        a(s, e1, null);
    }

    public final void b(String s, String s1)
    {
        av.d(String.format("[%s]%s", new Object[] {
            a, s
        }), s1);
    }

    public final void c(String s, e e1)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        com.microsoft.advertising.android.av.a("errorEvents", s1);
        a(s1, e1, null);
    }

    public final void c(String s, String s1)
    {
        com.microsoft.advertising.android.av.b(String.format("[%s]%s", new Object[] {
            a, s
        }), s1);
    }
}
