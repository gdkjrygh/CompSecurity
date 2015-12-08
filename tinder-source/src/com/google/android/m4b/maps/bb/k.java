// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;
import com.google.android.m4b.maps.bo.g;

// Referenced classes of package com.google.android.m4b.maps.bb:
//            j

public final class k extends j
{

    public k(Interpolator interpolator)
    {
        super(interpolator);
        a = new g();
        b = new g();
        c = new g();
    }

    protected final void a(long l)
    {
        float f = c(l);
        g.a((g)a, (g)b, f, (g)c);
    }

    protected final void a(Object obj)
    {
        obj = (g)obj;
        ((g)a).b(((g) (obj)));
    }

    protected final void b(Object obj)
    {
        obj = (g)obj;
        ((g)b).b(((g) (obj)));
    }

    protected final void c(Object obj)
    {
        obj = (g)obj;
        ((g)c).b(((g) (obj)));
    }
}
