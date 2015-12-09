// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b.a;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.b.a:
//            t

class o
{

    public static void a(Drawable drawable, boolean flag)
    {
        drawable.setAutoMirrored(flag);
    }

    public static boolean a(Drawable drawable)
    {
        return drawable.isAutoMirrored();
    }

    public static Drawable b(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof t))
        {
            obj = new t(drawable);
        }
        return ((Drawable) (obj));
    }
}
