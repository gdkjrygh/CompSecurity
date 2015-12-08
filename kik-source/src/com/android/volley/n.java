// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.android.volley:
//            e, p, o, x, 
//            t, w, k, r

public abstract class n
    implements Comparable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/android/volley/n$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("LOW", 0);
            b = new a("NORMAL", 1);
            c = new a("HIGH", 2);
            d = new a("IMMEDIATE", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private final x.a a;
    private final int b = 0;
    private final String c;
    private final int d;
    private final r.a e;
    private Integer f;
    private p g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private t l;
    private b.a m;
    private Object n;

    public n(String s1, r.a a1)
    {
        x.a a2;
        int i1;
        if (x.a.a)
        {
            a2 = new x.a();
        } else
        {
            a2 = null;
        }
        a = a2;
        h = true;
        i = false;
        j = false;
        k = 0L;
        m = null;
        c = s1;
        e = a1;
        l = new e();
        if (TextUtils.isEmpty(s1))
        {
            i1 = 0;
        } else
        {
            i1 = Uri.parse(s1).getHost().hashCode();
        }
        d = i1;
    }

    protected static w a(w w)
    {
        return w;
    }

    static x.a a(n n1)
    {
        return n1.a;
    }

    public final int a()
    {
        return b;
    }

    protected abstract r a(k k1);

    public final void a(int i1)
    {
        f = Integer.valueOf(i1);
    }

    public final void a(b.a a1)
    {
        m = a1;
    }

    public final void a(p p1)
    {
        g = p1;
    }

    public final void a(t t1)
    {
        l = t1;
    }

    public final void a(Object obj)
    {
        n = obj;
    }

    public void a(String s1)
    {
        if (x.a.a)
        {
            a.a(s1, Thread.currentThread().getId());
        } else
        if (k == 0L)
        {
            k = SystemClock.elapsedRealtime();
            return;
        }
    }

    public final Object b()
    {
        return n;
    }

    public void b(w w)
    {
        if (e != null)
        {
            e.a(w);
        }
    }

    protected abstract void b(Object obj);

    final void b(String s1)
    {
        if (g != null)
        {
            g.b(this);
        }
        if (!x.a.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new o(this, s1, l1));
_L6:
        return;
_L4:
        a.a(s1, l1);
        a.a(toString());
        return;
_L2:
        long l2 = SystemClock.elapsedRealtime() - k;
        if (l2 >= 3000L)
        {
            x.b("%d ms: %s", new Object[] {
                Long.valueOf(l2), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int c()
    {
        return d;
    }

    public int compareTo(Object obj)
    {
        obj = (n)obj;
        a a1 = o();
        a a2 = ((n) (obj)).o();
        if (a1 == a2)
        {
            return f.intValue() - ((n) (obj)).f.intValue();
        } else
        {
            return a2.ordinal() - a1.ordinal();
        }
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return d();
    }

    public final b.a f()
    {
        return m;
    }

    public final void g()
    {
        i = true;
    }

    public final boolean h()
    {
        return i;
    }

    public Map i()
    {
        return Collections.emptyMap();
    }

    public String j()
    {
        return l();
    }

    public byte[] k()
    {
        return null;
    }

    public String l()
    {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public byte[] m()
    {
        return null;
    }

    public final boolean n()
    {
        return h;
    }

    public a o()
    {
        return a.b;
    }

    public final int p()
    {
        return l.a();
    }

    public final t q()
    {
        return l;
    }

    public final void r()
    {
        j = true;
    }

    public final boolean s()
    {
        return j;
    }

    public String toString()
    {
        String s2 = (new StringBuilder("0x")).append(Integer.toHexString(d)).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s1;
        if (i)
        {
            s1 = "[X] ";
        } else
        {
            s1 = "[ ] ";
        }
        return stringbuilder.append(s1).append(d()).append(" ").append(s2).append(" ").append(o()).append(" ").append(f).toString();
    }
}
