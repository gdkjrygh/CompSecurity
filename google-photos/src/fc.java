// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;

class fc extends fb
{

    fc()
    {
    }

    public final void a(Drawable drawable)
    {
        drawable.jumpToCurrentState();
    }

    public Drawable c(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof fk))
        {
            obj = new fk(drawable);
        }
        return ((Drawable) (obj));
    }
}
