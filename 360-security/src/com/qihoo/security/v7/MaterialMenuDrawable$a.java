// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.nineoldandroids.a.k;

// Referenced classes of package com.qihoo.security.v7:
//            MaterialMenuDrawable

private final class <init> extends android.graphics.drawable.t>
{

    final MaterialMenuDrawable a;
    private int b;

    static int a(ate ate, int i)
    {
        ate.b = i;
        return i;
    }

    public int getChangingConfigurations()
    {
        return b;
    }

    public Drawable newDrawable()
    {
        MaterialMenuDrawable materialmenudrawable = new MaterialMenuDrawable(MaterialMenuDrawable.b(a).getColor(), MaterialMenuDrawable.c(a), MaterialMenuDrawable.d(a).m(), MaterialMenuDrawable.e(a).m(), MaterialMenuDrawable.f(a), MaterialMenuDrawable.g(a), MaterialMenuDrawable.h(a), MaterialMenuDrawable.i(a), MaterialMenuDrawable.j(a), com.qihoo.security.v7.MaterialMenuDrawable.k(a), null);
        onState onstate;
        if (MaterialMenuDrawable.a(a) != null)
        {
            onstate = MaterialMenuDrawable.a(a);
        } else
        {
            onstate = MaterialMenuDrawable.l(a);
        }
        materialmenudrawable.a(onstate);
        materialmenudrawable.a(MaterialMenuDrawable.m(a));
        return materialmenudrawable;
    }

    private ate(MaterialMenuDrawable materialmenudrawable)
    {
        a = materialmenudrawable;
        super();
    }

    ate(MaterialMenuDrawable materialmenudrawable, ate ate)
    {
        this(materialmenudrawable);
    }
}
