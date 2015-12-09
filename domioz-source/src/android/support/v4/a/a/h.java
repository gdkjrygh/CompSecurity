// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.a.a:
//            i

final class h
{

    public static void a(Drawable drawable, int j)
    {
        if (drawable instanceof i)
        {
            ((i)drawable).setTint(j);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        if (drawable instanceof i)
        {
            ((i)drawable).setTintList(colorstatelist);
        }
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        if (drawable instanceof i)
        {
            ((i)drawable).setTintMode(mode);
        }
    }
}
