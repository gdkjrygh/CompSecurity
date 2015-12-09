// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class gvz
{

    private static final long p;
    int a;
    long b;
    public int c;
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
    public final android.graphics.Bitmap.Config n;
    public final com.squareup.picasso.Picasso.Priority o;

    private gvz(Uri uri, int i1, List list, int j1, int k1, boolean flag, boolean flag1, 
            boolean flag2, android.graphics.Bitmap.Config config, com.squareup.picasso.Picasso.Priority priority)
    {
        d = uri;
        e = i1;
        f = null;
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
        m = 0.0F;
        n = config;
        o = priority;
    }

    gvz(Uri uri, int i1, List list, int j1, int k1, boolean flag, boolean flag1, 
            boolean flag2, android.graphics.Bitmap.Config config, com.squareup.picasso.Picasso.Priority priority, byte byte0)
    {
        this(uri, i1, list, j1, k1, flag, flag1, flag2, config, priority);
    }

    public final String a()
    {
        long l1 = System.nanoTime() - b;
        if (l1 > p)
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
        return c();
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
            gwk gwk1;
            for (Iterator iterator = g.iterator(); iterator.hasNext(); stringbuilder.append(' ').append(gwk1.a()))
            {
                gwk1 = (gwk)iterator.next();
            }

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
        if (n != null)
        {
            stringbuilder.append(' ').append(n);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    static 
    {
        p = TimeUnit.SECONDS.toNanos(5L);
    }
}
