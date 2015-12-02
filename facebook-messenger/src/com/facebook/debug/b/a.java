// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.b;

import com.facebook.base.b;
import junit.framework.Assert;

public class a
{

    public a()
    {
    }

    public static void a(int i, int j)
    {
        if (a())
        {
            Assert.assertEquals(i, j);
        }
    }

    public static void a(Object obj)
    {
        if (a())
        {
            Assert.assertNotNull(obj);
        }
    }

    public static void a(String s, boolean flag)
    {
        if (a())
        {
            Assert.assertFalse(s, flag);
        }
    }

    public static void a(boolean flag)
    {
        if (a())
        {
            Assert.assertFalse(flag);
        }
    }

    public static boolean a()
    {
        return com.facebook.base.b.a();
    }

    public static void b(String s, boolean flag)
    {
        if (a())
        {
            Assert.assertTrue(s, flag);
        }
    }

    public static void b(boolean flag)
    {
        if (a())
        {
            Assert.assertTrue(flag);
        }
    }
}
