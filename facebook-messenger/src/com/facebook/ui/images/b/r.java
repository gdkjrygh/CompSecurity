// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import android.graphics.Bitmap;
import com.facebook.ui.images.cache.d;
import com.google.common.base.Preconditions;
import java.io.File;

// Referenced classes of package com.facebook.ui.images.b:
//            t, v, u, s

public class r
{

    private final d a;
    private final File b;
    private final Bitmap c;
    private final v d;
    private final u e;
    private final long f;

    private r(t t1)
    {
        boolean flag2 = false;
        super();
        Preconditions.checkNotNull(t.a(t1));
        Preconditions.checkNotNull(t.b(t1));
        boolean flag;
        boolean flag1;
        if (t.b(t1) == v.ERROR)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (t.c(t1) == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag ^ flag1);
        if (com.facebook.ui.images.b.t.d(t1) == null || t.e(t1) == null)
        {
            flag2 = true;
        }
        Preconditions.checkState(flag2);
        a = t.a(t1);
        b = t.e(t1);
        c = com.facebook.ui.images.b.t.d(t1);
        d = t.b(t1);
        e = t.c(t1);
        f = t.f(t1);
    }

    r(t t1, s s)
    {
        this(t1);
    }

    public static t a(d d1)
    {
        return new t(d1, null);
    }

    public Bitmap a()
    {
        return c;
    }

    public v b()
    {
        return d;
    }

    public u c()
    {
        return e;
    }

    public long d()
    {
        return f;
    }
}
