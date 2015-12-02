// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import android.net.Uri;
import com.facebook.ui.images.base.b;
import com.facebook.ui.images.cache.d;
import com.facebook.ui.images.cache.e;
import com.facebook.ui.images.d.h;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.ui.images.b:
//            o, n

public class m
{

    private final Uri a;
    private final b b;
    private final String c;
    private final h d;
    private final e e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private volatile d j;
    private volatile d k;
    private volatile m l;

    private m(o o1)
    {
        Preconditions.checkNotNull(o.a(o1));
        Preconditions.checkArgument(o.a(o1).isAbsolute());
        Preconditions.checkNotNull(com.facebook.ui.images.b.o.b(o1));
        a = o.a(o1);
        b = o.c(o1);
        d = com.facebook.ui.images.b.o.d(o1);
        e = com.facebook.ui.images.b.o.b(o1);
        f = com.facebook.ui.images.b.o.e(o1);
        g = o.f(o1);
        h = o.g(o1);
        i = com.facebook.ui.images.b.o.h(o1);
        if (b != null)
        {
            o1 = b.a();
        } else
        {
            o1 = null;
        }
        c = o1;
    }

    m(o o1, n n)
    {
        this(o1);
    }

    public static o a(Uri uri)
    {
        return new o(uri, null);
    }

    public static boolean a(m m1, m m2)
    {
        if (m1 == null && m2 == null)
        {
            return true;
        }
        if (m1 == null || m2 == null)
        {
            return false;
        } else
        {
            return m1.a(m2);
        }
    }

    public static o b(m m1)
    {
        return new o(m1, null);
    }

    public Uri a()
    {
        return a;
    }

    public boolean a(m m1)
    {
        return Objects.equal(a, m1.a) && Objects.equal(c, m1.c) && Objects.equal(e, m1.e);
    }

    public b b()
    {
        return b;
    }

    public h c()
    {
        return d;
    }

    public e d()
    {
        return e;
    }

    public boolean e()
    {
        return f;
    }

    public boolean f()
    {
        return g;
    }

    public boolean g()
    {
        return h;
    }

    public boolean h()
    {
        return i;
    }

    public d i()
    {
        if (j != null)
        {
            return j;
        }
        if (b != null)
        {
            if (c == b.d)
            {
                return null;
            }
            j = new d(a, e, c);
        } else
        {
            j = j();
        }
        return j;
    }

    public d j()
    {
        if (k == null)
        {
            k = new d(a, e);
        }
        return k;
    }

    public m k()
    {
        if (e == d.b)
        {
            return this;
        }
        if (l == null)
        {
            l = (new o(a, null)).a(d.b).a();
        }
        return l;
    }
}
