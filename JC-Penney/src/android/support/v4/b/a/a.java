// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.b.a:
//            i, h, g, f, 
//            e, d, b, c

public class a
{

    static final c a;

    public static void a(Drawable drawable)
    {
        a.a(drawable);
    }

    public static void a(Drawable drawable, float f1, float f2)
    {
        a.a(drawable, f1, f2);
    }

    public static void a(Drawable drawable, int j)
    {
        a.a(drawable, j);
    }

    public static void a(Drawable drawable, int j, int k, int l, int i1)
    {
        a.a(drawable, j, k, l, i1);
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        a.a(drawable, colorstatelist);
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        a.a(drawable, mode);
    }

    public static void a(Drawable drawable, boolean flag)
    {
        a.a(drawable, flag);
    }

    public static void b(Drawable drawable, int j)
    {
        a.b(drawable, j);
    }

    public static boolean b(Drawable drawable)
    {
        return a.b(drawable);
    }

    public static Drawable c(Drawable drawable)
    {
        return a.c(drawable);
    }

    static 
    {
        int j = android.os.Build.VERSION.SDK_INT;
        if (j >= 23)
        {
            a = new i();
        } else
        if (j >= 22)
        {
            a = new h();
        } else
        if (j >= 21)
        {
            a = new g();
        } else
        if (j >= 19)
        {
            a = new f();
        } else
        if (j >= 17)
        {
            a = new e();
        } else
        if (j >= 11)
        {
            a = new d();
        } else
        {
            a = new b();
        }
    }
}
