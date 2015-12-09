// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.a.a:
//            b, k

class d extends b
{

    d()
    {
    }

    public final void a(Drawable drawable)
    {
        drawable.jumpToCurrentState();
    }

    public Drawable c(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof k))
        {
            obj = new k(drawable);
        }
        return ((Drawable) (obj));
    }
}
