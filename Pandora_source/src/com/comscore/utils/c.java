// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.util.Log;

// Referenced classes of package com.comscore.utils:
//            f

public class c
{

    public static void a(Class class1, String s)
    {
        if (f.a)
        {
            Log.d(class1.getSimpleName(), s);
        }
    }

    public static void a(Exception exception)
    {
        if (f.a)
        {
            exception.printStackTrace();
        }
    }

    public static void a(Object obj, String s)
    {
        if (f.a)
        {
            a(obj.getClass(), s);
        }
    }

    public static void b(Class class1, String s)
    {
        if (f.a)
        {
            Log.e(class1.getSimpleName(), s);
        }
    }

    public static void b(Object obj, String s)
    {
        if (f.a)
        {
            b(obj.getClass(), s);
        }
    }
}
