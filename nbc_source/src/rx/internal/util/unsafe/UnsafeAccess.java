// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class UnsafeAccess
{

    public static final Unsafe UNSAFE;

    private UnsafeAccess()
    {
        throw new IllegalStateException("No instances!");
    }

    public static long addressOf(Class class1, String s)
    {
        long l;
        try
        {
            class1 = class1.getDeclaredField(s);
            l = UNSAFE.objectFieldOffset(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            s = new InternalError();
            s.initCause(class1);
            throw s;
        }
        return l;
    }

    public static boolean compareAndSwapInt(Object obj, long l, int i, int j)
    {
        return UNSAFE.compareAndSwapInt(obj, l, i, j);
    }

    public static int getAndAddInt(Object obj, long l, int i)
    {
        int j;
        do
        {
            j = UNSAFE.getIntVolatile(obj, l);
        } while (!UNSAFE.compareAndSwapInt(obj, l, j, j + i));
        return j;
    }

    public static int getAndIncrementInt(Object obj, long l)
    {
        int i;
        do
        {
            i = UNSAFE.getIntVolatile(obj, l);
        } while (!UNSAFE.compareAndSwapInt(obj, l, i, i + 1));
        return i;
    }

    public static int getAndSetInt(Object obj, long l, int i)
    {
        int j;
        do
        {
            j = UNSAFE.getIntVolatile(obj, l);
        } while (!UNSAFE.compareAndSwapInt(obj, l, j, i));
        return j;
    }

    public static final boolean isUnsafeAvailable()
    {
        return UNSAFE != null;
    }

    static 
    {
        Unsafe unsafe = null;
        Object obj;
        obj = sun/misc/Unsafe.getDeclaredField("theUnsafe");
        ((Field) (obj)).setAccessible(true);
        obj = (Unsafe)((Field) (obj)).get(null);
        unsafe = ((Unsafe) (obj));
_L2:
        UNSAFE = unsafe;
        return;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
