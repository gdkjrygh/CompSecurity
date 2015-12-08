// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ad;

import android.graphics.drawable.Drawable;
import p.s.k;

public abstract class a
    implements k
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
