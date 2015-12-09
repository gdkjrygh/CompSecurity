// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;

class dr extends dq
{

    dr()
    {
    }

    public final void a(Drawable drawable, boolean flag)
    {
        drawable.setAutoMirrored(flag);
    }

    public final boolean b(Drawable drawable)
    {
        return drawable.isAutoMirrored();
    }

    public Drawable c(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof ea))
        {
            obj = new ea(drawable);
        }
        return ((Drawable) (obj));
    }
}
