// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class ajn
{

    public static void a(Class class1, String s)
    {
        if (ajr.a)
        {
            Log.d(class1.getSimpleName(), s);
        }
    }

    public static void a(Exception exception)
    {
        if (ajr.a)
        {
            exception.printStackTrace();
        }
    }

    public static void a(Object obj, String s)
    {
        if (ajr.a)
        {
            a(obj.getClass(), s);
        }
    }

    public static void b(Class class1, String s)
    {
        if (ajr.a)
        {
            Log.e(class1.getSimpleName(), s);
        }
    }

    public static void b(Object obj, String s)
    {
        if (ajr.a)
        {
            b(obj.getClass(), s);
        }
    }
}
