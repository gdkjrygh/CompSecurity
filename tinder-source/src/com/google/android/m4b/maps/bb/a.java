// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.bb:
//            j

public final class a extends com.google.android.m4b.maps.bb.j
{

    private final Object e[];

    public a(Interpolator interpolator, Object aobj[])
    {
        super(interpolator);
        boolean flag;
        if (aobj.length >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        e = aobj;
        a = aobj[0];
        b = aobj[aobj.length - 1];
        c = aobj[0];
        d = true;
    }

    protected final void a(long l)
    {
        int i = Math.min(Math.max((int)(c(l) * (float)(e.length - 1)), 0), e.length - 1);
        c = e[i];
    }

    protected final void a(Object obj)
    {
        a = obj;
    }

    protected final void b(Object obj)
    {
        b = obj;
    }

    protected final void c(Object obj)
    {
        c = obj;
    }
}
