// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.a;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.b.x;

public abstract class a
    implements x
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

    public final Object b()
    {
        return a.getConstantState().newDrawable();
    }
}
