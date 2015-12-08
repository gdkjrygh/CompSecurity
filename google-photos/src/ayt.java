// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;

public final class ayt extends aym
{

    private static ayt u;
    private static ayt v;

    public ayt()
    {
    }

    public static ayt b(int i, int j)
    {
        return (ayt)(new ayt()).a(i, j);
    }

    public static ayt b(amb amb)
    {
        return (ayt)(new ayt()).a(amb);
    }

    public static ayt b(ana ana)
    {
        return (ayt)(new ayt()).a(ana);
    }

    public static ayt b(ane ane)
    {
        return (ayt)(new ayt()).a(ane);
    }

    public static ayt b(anf anf, Object obj)
    {
        return (ayt)(new ayt()).a(anf, obj);
    }

    public static ayt b(apa apa)
    {
        return (ayt)(new ayt()).a(apa);
    }

    public static ayt b(avk avk)
    {
        return (ayt)(new ayt()).a(avk);
    }

    public static ayt b(Class class1)
    {
        return (ayt)(new ayt()).a(class1);
    }

    public static ayt b(boolean flag)
    {
        if (u == null)
        {
            u = (ayt)((ayt)(new ayt()).a(true)).c();
        }
        return u;
    }

    public static ayt c(Context context)
    {
        if (v == null)
        {
            v = (ayt)((ayt)(new ayt()).a(context.getApplicationContext())).c();
        }
        return v;
    }

    public static ayt c(Drawable drawable)
    {
        return (ayt)(new ayt()).a(drawable);
    }

    public static ayt d(Drawable drawable)
    {
        return (ayt)(new ayt()).b(drawable);
    }
}
