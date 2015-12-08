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
//            xw, fe, vp, tm, 
//            tk, xv, tl, ws, 
//            be, xm, pl, vo

public abstract class tj
    implements Comparable
{

    private final xw a;
    private final int b;
    private final String c;
    private final int d;
    private final vp e;
    private Integer f;
    private tm g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private ws l;
    private be m;

    public tj(String s, vp vp1)
    {
        int i1;
        xw xw1;
        if (xw.a)
        {
            xw1 = new xw();
        } else
        {
            xw1 = null;
        }
        a = xw1;
        h = true;
        i = false;
        j = false;
        k = 0L;
        m = null;
        b = 0;
        c = s;
        e = vp1;
        l = new fe();
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

    protected static xm a(xm xm)
    {
        return xm;
    }

    static xw a(tj tj1)
    {
        return tj1.a;
    }

    public static String h()
    {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final tj a(int i1)
    {
        f = Integer.valueOf(i1);
        return this;
    }

    public final tj a(be be)
    {
        m = be;
        return this;
    }

    public final tj a(tm tm1)
    {
        g = tm1;
        return this;
    }

    protected abstract vo a(pl pl);

    public Map a()
    {
        return Collections.emptyMap();
    }

    protected abstract void a(Object obj);

    public final void a(String s)
    {
        if (xw.a)
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

    public final void b(xm xm)
    {
        if (e != null)
        {
            e.a(xm);
        }
    }

    final void b(String s)
    {
        if (g != null)
        {
            g.b(this);
        }
        if (!xw.a) goto _L2; else goto _L1
_L1:
        long l1 = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new tk(this, s, l1));
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
            xv.b("%d ms: %s", new Object[] {
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
        obj = (tj)obj;
        tl tl1 = tl.b;
        tl tl2 = tl.b;
        if (tl1 == tl2)
        {
            return f.intValue() - ((tj) (obj)).f.intValue();
        } else
        {
            return tl2.ordinal() - tl1.ordinal();
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

    public final be f()
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

    public final ws k()
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
        return stringbuilder.append(s).append(c).append(" ").append(s1).append(" ").append(tl.b).append(" ").append(f).toString();
    }
}
