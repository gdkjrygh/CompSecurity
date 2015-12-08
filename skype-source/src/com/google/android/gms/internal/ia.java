// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ca, a, ie, le, 
//            iz, kp, gs, iw

public abstract class ia
    implements Comparable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/gms/internal/ia$a, s);
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

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    private final le.a a;
    private final int b;
    private final String c;
    private final int d;
    private final iw.a e;
    private Integer f;
    private ie g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private iz l;
    private z.a m;

    public ia(String s, iw.a a1)
    {
        int i1;
        le.a a2;
        if (le.a.a)
        {
            a2 = new le.a();
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
        b = 0;
        c = s;
        e = a1;
        l = new ca();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = Uri.parse(s);
        if (s == null) goto _L2; else goto _L3
_L3:
        s = s.getHost();
        if (s == null) goto _L2; else goto _L4
_L4:
        i1 = s.hashCode();
_L6:
        d = i1;
        return;
_L2:
        i1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected static kp a(kp kp)
    {
        return kp;
    }

    static le.a a(ia ia1)
    {
        return ia1.a;
    }

    public static String h()
    {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final ia a(int i1)
    {
        f = Integer.valueOf(i1);
        return this;
    }

    public final ia a(ie ie1)
    {
        g = ie1;
        return this;
    }

    public final ia a(z.a a1)
    {
        m = a1;
        return this;
    }

    protected abstract iw a(gs gs);

    public Map a()
        throws com.google.android.gms.internal.a
    {
        return Collections.emptyMap();
    }

    protected abstract void a(Object obj);

    public final void a(String s)
    {
        if (le.a.a)
        {
            a.a(s, Thread.currentThread().getId());
        } else
        if (k == 0L)
        {
            k = SystemClock.elapsedRealtime();
            return;
        }
    }

    public final int b()
    {
        return b;
    }

    public final void b(kp kp)
    {
        if (e != null)
        {
            e.a(kp);
        }
    }

    final void b(String s)
    {
        if (g != null)
        {
            g.b(this);
        }
        if (!le.a.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new Runnable(s, l1) {

            final String a;
            final long b;
            final ia c;

            public final void run()
            {
                ia.a(c).a(a, b);
                ia.a(c).a(((Object)this).toString());
            }

            
            {
                c = ia.this;
                a = s;
                b = l1;
                super();
            }
        });
_L6:
        return;
_L4:
        a.a(s, l1);
        a.a(toString());
        return;
_L2:
        long l2 = SystemClock.elapsedRealtime() - k;
        if (l2 >= 3000L)
        {
            le.b("%d ms: %s", new Object[] {
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
        obj = (ia)obj;
        a a1 = a.b;
        a a2 = a.b;
        if (a1 == a2)
        {
            return f.intValue() - ((ia) (obj)).f.intValue();
        } else
        {
            return a2.ordinal() - a1.ordinal();
        }
    }

    public final String d()
    {
        return c;
    }

    public final String e()
    {
        return c;
    }

    public final z.a f()
    {
        return m;
    }

    public final boolean g()
    {
        return i;
    }

    public final boolean i()
    {
        return h;
    }

    public final int j()
    {
        return l.a();
    }

    public final iz k()
    {
        return l;
    }

    public final void l()
    {
        j = true;
    }

    public final boolean m()
    {
        return j;
    }

    public String toString()
    {
        String s1 = (new StringBuilder("0x")).append(Integer.toHexString(d)).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (i)
        {
            s = "[X] ";
        } else
        {
            s = "[ ] ";
        }
        return stringbuilder.append(s).append(c).append(" ").append(s1).append(" ").append(a.b).append(" ").append(f).toString();
    }
}
