// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;

public abstract class awk
    implements aqa
{

    public final Drawable a;

    public awk(Drawable drawable)
    {
        a = (Drawable)b.a(drawable, "Argument must not be null");
    }

    public final Object b()
    {
        return a.getConstantState().newDrawable();
    }
}
