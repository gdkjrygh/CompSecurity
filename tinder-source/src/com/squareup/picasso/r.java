// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.picasso:
//            z

public final class r
{
    public static final class a
    {

        Uri a;
        int b;
        String c;
        int d;
        int e;
        boolean f;
        boolean g;
        boolean h;
        float i;
        float j;
        float k;
        boolean l;
        List m;
        android.graphics.Bitmap.Config n;
        Picasso.Priority o;

        public final a a(int i1, int j1)
        {
            if (i1 < 0)
            {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (j1 < 0)
            {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (j1 == 0 && i1 == 0)
            {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else
            {
                d = i1;
                e = j1;
                return this;
            }
        }

        final boolean a()
        {
            return a != null || b != 0;
        }

        a(Uri uri, int i1, android.graphics.Bitmap.Config config)
        {
            a = uri;
            b = i1;
            n = config;
        }
    }


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
    public final Picasso.Priority r;

    private r(Uri uri, int i1, String s1, List list, int j1, int k1, boolean flag, 
            boolean flag1, boolean flag2, float f1, float f2, float f3, boolean flag3, android.graphics.Bitmap.Config config, 
            Picasso.Priority priority)
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
        r = priority;
    }

    r(Uri uri, int i1, String s1, List list, int j1, int k1, boolean flag, 
            boolean flag1, boolean flag2, float f1, float f2, float f3, boolean flag3, android.graphics.Bitmap.Config config, 
            Picasso.Priority priority, byte byte0)
    {
        this(uri, i1, s1, list, j1, k1, flag, flag1, flag2, f1, f2, f3, flag3, config, priority);
    }

    final String a()
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

    final String b()
    {
        return (new StringBuilder("[R")).append(a).append(']').toString();
    }

    public final boolean c()
    {
        return h != 0 || i != 0;
    }

    final boolean d()
    {
        return c() || m != 0.0F;
    }

    final boolean e()
    {
        return g != null;
    }

    public final String toString()
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
            z z1;
            for (Iterator iterator = g.iterator(); iterator.hasNext(); stringbuilder.append(' ').append(z1.key()))
            {
                z1 = (z)iterator.next();
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
