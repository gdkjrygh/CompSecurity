// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.time;

import com.pinterest.kit.application.Resources;
import java.util.HashMap;

public class FuzzyDateMessages
{

    private static HashMap a = new _cls1();

    public static String a()
    {
        return Resources.string(0x7f070317);
    }

    private static String a(int i, int j, boolean flag)
    {
        if (flag)
        {
            return Resources.string(((Integer)a.get(Integer.valueOf(i))).intValue(), new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            return Resources.stringPlural(i, Integer.valueOf(j), new Object[] {
                Integer.valueOf(j)
            });
        }
    }

    public static String a(int i, boolean flag)
    {
        return a(0x7f090026, i, flag);
    }

    public static String b(int i, boolean flag)
    {
        return a(0x7f09000e, i, flag);
    }

    public static String c(int i, boolean flag)
    {
        return a(0x7f09000b, i, flag);
    }

    public static String d(int i, boolean flag)
    {
        return a(0x7f090005, i, flag);
    }

    public static String e(int i, boolean flag)
    {
        return a(0x7f090027, i, flag);
    }

    public static String f(int i, boolean flag)
    {
        return a(0x7f09000f, i, flag);
    }

    public static String g(int i, boolean flag)
    {
        return a(0x7f090028, i, flag);
    }


    private class _cls1 extends HashMap
    {

        _cls1()
        {
            put(Integer.valueOf(0x7f070317), Integer.valueOf(0x7f070317));
            put(Integer.valueOf(0x7f090026), Integer.valueOf(0x7f07055c));
            put(Integer.valueOf(0x7f09000e), Integer.valueOf(0x7f07055a));
            put(Integer.valueOf(0x7f09000b), Integer.valueOf(0x7f070559));
            put(Integer.valueOf(0x7f090005), Integer.valueOf(0x7f070558));
            put(Integer.valueOf(0x7f090027), Integer.valueOf(0x7f07055d));
            put(Integer.valueOf(0x7f09000f), Integer.valueOf(0x7f07055b));
            put(Integer.valueOf(0x7f090028), Integer.valueOf(0x7f07055e));
        }
    }

}
