// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import android.content.Context;
import android.content.res.Resources;

public class h
{

    public h()
    {
    }

    public static int a(Context context, String s, String s1)
    {
        return a(context, s, s1, context.getPackageName());
    }

    public static int a(Context context, String s, String s1, String s2)
    {
        return context.getResources().getIdentifier(s, s1, s2);
    }

    public static transient String a(Context context, String s, String s1, Object aobj[])
    {
        int i = a(context, s, "string", context.getPackageName());
        if (i != 0)
        {
            context.getResources().getString(i, aobj);
        }
        return String.format(s1, aobj);
    }

    public static String b(Context context, String s, String s1)
    {
        return b(context, s, s1, context.getPackageName());
    }

    public static String b(Context context, String s, String s1, String s2)
    {
        int i = a(context, s, "string", s2);
        if (i != 0)
        {
            s1 = context.getResources().getString(i);
        }
        return s1;
    }
}
