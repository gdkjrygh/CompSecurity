// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.base.util.io;

import android.os.StatFs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a
{

    static final boolean a;

    public a()
    {
    }

    public static long a(StatFs statfs)
    {
        Object obj;
        if (!a && statfs == null)
        {
            throw new AssertionError();
        }
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            return (long)statfs.getAvailableBlocks();
        }
        try
        {
            obj = statfs.getClass().getMethod("getAvailableBlocksLong", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((NoSuchMethodException) (obj)).printStackTrace();
            obj = null;
        }
        if (obj == null)
        {
            return (long)statfs.getAvailableBlocks();
        }
        long l = ((Long)((Method) (obj)).invoke(statfs, new Object[0])).longValue();
        return l;
        Object obj1;
        obj1;
        ((IllegalArgumentException) (obj1)).printStackTrace();
_L2:
        return (long)statfs.getAvailableBlocks();
        obj1;
        ((IllegalAccessException) (obj1)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj1;
        ((InvocationTargetException) (obj1)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static long b(StatFs statfs)
    {
        Object obj;
        if (!a && statfs == null)
        {
            throw new AssertionError();
        }
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            return (long)statfs.getBlockCount();
        }
        try
        {
            obj = statfs.getClass().getMethod("getBlockCountLong", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((NoSuchMethodException) (obj)).printStackTrace();
            obj = null;
        }
        if (obj == null)
        {
            return (long)statfs.getBlockCount();
        }
        long l = ((Long)((Method) (obj)).invoke(statfs, new Object[0])).longValue();
        return l;
        Object obj1;
        obj1;
        ((IllegalArgumentException) (obj1)).printStackTrace();
_L2:
        return (long)statfs.getBlockCount();
        obj1;
        ((IllegalAccessException) (obj1)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj1;
        ((InvocationTargetException) (obj1)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static long c(StatFs statfs)
    {
        Object obj;
        if (!a && statfs == null)
        {
            throw new AssertionError();
        }
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            return (long)statfs.getBlockSize();
        }
        try
        {
            obj = statfs.getClass().getMethod("getBlockSizeLong", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((NoSuchMethodException) (obj)).printStackTrace();
            obj = null;
        }
        if (obj == null)
        {
            return (long)statfs.getBlockSize();
        }
        long l = ((Long)((Method) (obj)).invoke(statfs, new Object[0])).longValue();
        return l;
        Object obj1;
        obj1;
        ((IllegalArgumentException) (obj1)).printStackTrace();
_L2:
        return (long)statfs.getBlockSize();
        obj1;
        ((IllegalAccessException) (obj1)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj1;
        ((InvocationTargetException) (obj1)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        boolean flag;
        if (!com/cleanmaster/base/util/io/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
