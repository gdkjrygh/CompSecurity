// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.a:
//            bi, ar, ay

public final class ax
{

    private static final long s;
    int a;
    long b;
    int c;
    public final Uri d;
    public final int e;
    public final String f;
    public final List g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final float m;
    public final float n;
    public final float o;
    public final boolean p;
    public final android.graphics.Bitmap.Config q;
    public final ar r;

    private ax(Uri uri, int i1, String s1, List list, int j1, int k1, boolean flag, 
            boolean flag1, boolean flag2, float f1, float f2, float f3, boolean flag3, android.graphics.Bitmap.Config config, 
            ar ar)
    {
        d = uri;
        e = i1;
        f = s1;
        if (list == null)
        {
            g = null;
        } else
        {
            g = Collections.unmodifiableList(list);
        }
        h = j1;
        i = k1;
        j = flag;
        k = flag1;
        l = flag2;
        m = f1;
        n = f2;
        o = f3;
        p = flag3;
        q = config;
        r = ar;
    }

    ax(Uri uri, int i1, String s1, List list, int j1, int k1, boolean flag, 
            boolean flag1, boolean flag2, float f1, float f2, float f3, boolean flag3, android.graphics.Bitmap.Config config, 
            ar ar, ay ay)
    {
        this(uri, i1, s1, list, j1, k1, flag, flag1, flag2, f1, f2, f3, flag3, config, ar);
    }

    String a()
    {
        long l1 = System.nanoTime() - b;
        if (l1 > s)
        {
            return (new StringBuilder()).append(b()).append('+').append(TimeUnit.NANOSECONDS.toSeconds(l1)).append('s').toString();
        } else
        {
            return (new StringBuilder()).append(b()).append('+').append(TimeUnit.NANOSECONDS.toMillis(l1)).append("ms").toString();
        }
    }

    String b()
    {
        return (new StringBuilder()).append("[R").append(a).append(']').toString();
    }

    String c()
    {
        if (d != null)
        {
            return String.valueOf(d.getPath());
        } else
        {
            return Integer.toHexString(e);
        }
    }

    public boolean d()
    {
        return h != 0 || i != 0;
    }

    boolean e()
    {
        return f() || g();
    }

    boolean f()
    {
        return d() || m != 0.0F;
    }

    boolean g()
    {
        return g != null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Request{");
        if (e > 0)
        {
            stringbuilder.append(e);
        } else
        {
            stringbuilder.append(d);
        }
        if (g != null && !g.isEmpty())
        {
            bi bi1;
            for (Iterator iterator = g.iterator(); iterator.hasNext(); stringbuilder.append(' ').append(bi1.a()))
            {
                bi1 = (bi)iterator.next();
            }

        }
        if (f != null)
        {
            stringbuilder.append(" stableKey(").append(f).append(')');
        }
        if (h > 0)
        {
            stringbuilder.append(" resize(").append(h).append(',').append(i).append(')');
        }
        if (j)
        {
            stringbuilder.append(" centerCrop");
        }
        if (k)
        {
            stringbuilder.append(" centerInside");
        }
        if (m != 0.0F)
        {
            stringbuilder.append(" rotation(").append(m);
            if (p)
            {
                stringbuilder.append(" @ ").append(n).append(',').append(o);
            }
            stringbuilder.append(')');
        }
        if (q != null)
        {
            stringbuilder.append(' ').append(q);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        s = TimeUnit.SECONDS.toNanos(5L);
    }
}
