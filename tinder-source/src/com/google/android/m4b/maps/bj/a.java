// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bj;

import android.os.Build;
import java.lang.reflect.Field;

public final class a
{

    private static Boolean a;
    private static Exception b;

    public static boolean a()
    {
        boolean flag1;
        flag1 = true;
        if (a != null)
        {
            return a.booleanValue();
        }
        if (b != null)
        {
            throw b;
        }
        if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 8)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        boolean flag = flag1;
        if (!"sdk".equals(Build.PRODUCT))
        {
            if ("google_sdk".equals(Build.PRODUCT))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        Class class1;
        Field field;
        try
        {
            a = Boolean.valueOf(flag);
        }
        catch (Exception exception)
        {
            b = exception;
            throw exception;
        }
        return a.booleanValue();
        class1 = Class.forName("android.os.Build");
        field = class1.getField("HARDWARE");
        field.setAccessible(true);
        a = Boolean.valueOf("goldfish".equals((String)field.get(class1)));
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_69;
        }
    }
}
