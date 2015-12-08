// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.a;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.j;

public abstract class a
    implements j
{

    protected final Drawable a;

    public a(Drawable drawable)
    {
        if (drawable == null)
        {
            throw new NullPointerException("Drawable must not be null!");
        } else
        {
            a = drawable;
            return;
        }
    }

    public final Drawable a()
    {
        return a.getConstantState().newDrawable();
    }

    public Object b()
    {
        return a();
    }
}
