// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

abstract class Striped64 extends Number
{
    static final class Cell
    {

        private static final Unsafe UNSAFE;
        private static final long valueOffset;
        volatile long value;

        final boolean cas(long l, long l1)
        {
            return UNSAFE.compareAndSwapLong(this, valueOffset, l, l1);
        }

        static 
        {
            try
            {
                UNSAFE = Striped64.getUnsafe();
                valueOffset = UNSAFE.objectFieldOffset(com/google/common/cache/Striped64$Cell.getDeclaredField("value"));
            }
            catch (Exception exception)
            {
                throw new Error(exception);
            }
        }

        Cell(long l)
        {
            value = l;
        }
    }

    static final class HashCode
    {

        static final Random rng = new Random();
        int code;


        HashCode()
        {
            int j = rng.nextInt();
            int i = j;
            if (j == 0)
            {
                i = 1;
            }
            code = i;
        }
    }

    static final class ThreadHashCode extends ThreadLocal
    {

        private static HashCode initialValue()
        {
            return new HashCode();
        }

        public final volatile Object initialValue()
        {
            return initialValue();
        }

        ThreadHashCode()
        {
        }
    }


    static final int NCPU = Runtime.getRuntime().availableProcessors();
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    static final ThreadHashCode threadHashCode = new ThreadHashCode();
    volatile transient long base;
    volatile transient int busy;
    volatile transient Cell cells[];

    Striped64()
    {
    }

    private boolean casBusy()
    {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    private static Unsafe getUnsafe()
    {
        Unsafe unsafe;
        try
        {
            unsafe = Unsafe.getUnsafe();
        }
        catch (SecurityException securityexception)
        {
            Unsafe unsafe1;
            try
            {
                unsafe1 = (Unsafe)AccessController.doPrivileged(new PrivilegedExceptionAction() {

                    private static Unsafe run()
                        throws Exception
                    {
                        Field afield[] = sun/misc/Unsafe.getDeclaredFields();
                        int j = afield.length;
                        for (int i = 0; i < j; i++)
                        {
                            Object obj = afield[i];
                            ((Field) (obj)).setAccessible(true);
                            obj = ((Field) (obj)).get(null);
                            if (sun/misc/Unsafe.isInstance(obj))
                            {
                                return (Unsafe)sun/misc/Unsafe.cast(obj);
                            }
                        }

                        throw new NoSuchFieldError("the Unsafe");
                    }

                    public final volatile Object run()
                        throws Exception
                    {
                        return run();
                    }

                });
            }
            catch (PrivilegedActionException privilegedactionexception)
            {
                throw new RuntimeException("Could not initialize intrinsics", privilegedactionexception.getCause());
            }
            return unsafe1;
        }
        return unsafe;
    }

    final boolean casBase(long l, long l1)
    {
        return UNSAFE.compareAndSwapLong(this, baseOffset, l, l1);
    }

    abstract long fn(long l, long l1);

    final void retryUpdate(long l, HashCode hashcode, boolean flag)
    {
        int k;
        int i1;
        i1 = hashcode.code;
        k = 0;
_L10:
        Cell acell[] = cells;
        if (acell == null) goto _L2; else goto _L1
_L1:
        int j1 = acell.length;
        if (j1 <= 0) goto _L2; else goto _L3
_L3:
        Object obj = acell[j1 - 1 & i1];
        if (obj != null) goto _L5; else goto _L4
_L4:
        if (busy != 0) goto _L7; else goto _L6
_L6:
        acell = new Cell(l);
        if (busy != 0 || !casBusy()) goto _L7; else goto _L8
_L8:
        j1 = 0;
        obj = cells;
        int i;
        i = j1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        int k1 = obj.length;
        i = j1;
        if (k1 > 0)
        {
            k1 = k1 - 1 & i1;
            i = j1;
            if (obj[k1] == null)
            {
                obj[k1] = acell;
                i = 1;
            }
        }
        busy = 0;
        if (i == 0) goto _L10; else goto _L9
_L9:
        hashcode.code = i1;
        return;
        hashcode;
        busy = 0;
        throw hashcode;
_L7:
        boolean flag1;
        i = 0;
        flag1 = flag;
_L11:
        k = i1 ^ i1 << 13;
        k ^= k >>> 17;
        i1 = k ^ k << 5;
        k = i;
        flag = flag1;
        break; /* Loop/switch isn't completed */
_L5:
label0:
        {
            if (flag)
            {
                break label0;
            }
            flag1 = true;
            i = k;
        }
          goto _L11
        long l1 = ((Cell) (obj)).value;
        if (((Cell) (obj)).cas(l1, fn(l1, l))) goto _L9; else goto _L12
_L12:
        if (j1 >= NCPU || cells != acell)
        {
            i = 0;
            flag1 = flag;
        } else
        {
label1:
            {
                if (k != 0)
                {
                    break label1;
                }
                i = 1;
                flag1 = flag;
            }
        }
          goto _L11
        i = k;
        flag1 = flag;
        if (busy != 0) goto _L11; else goto _L13
_L13:
        i = k;
        flag1 = flag;
        if (!casBusy()) goto _L11; else goto _L14
_L14:
        Cell acell1[];
        if (cells == acell)
        {
            acell1 = new Cell[j1 << 1];
            break MISSING_BLOCK_LABEL_342;
        }
          goto _L15
_L17:
        cells = acell1;
_L15:
        busy = 0;
        k = 0;
        break; /* Loop/switch isn't completed */
        hashcode;
        busy = 0;
        throw hashcode;
_L2:
        if (busy != 0 || cells != acell || !casBusy())
        {
            break MISSING_BLOCK_LABEL_459;
        }
        j = 0;
        if (cells != acell)
        {
            break MISSING_BLOCK_LABEL_438;
        }
        acell = new Cell[2];
        acell[i1 & 1] = new Cell(l);
        cells = acell;
        j = 1;
        busy = 0;
        if (j != 0) goto _L9; else goto _L16
_L16:
        break; /* Loop/switch isn't completed */
        hashcode;
        busy = 0;
        throw hashcode;
        l2 = base;
        if (casBase(l2, fn(l2, l))) goto _L9; else goto _L10
        long l2;
        int j = 0;
        while (j < j1) 
        {
            acell1[j] = acell[j];
            j++;
        }
          goto _L17
    }

    static 
    {
        try
        {
            UNSAFE = getUnsafe();
            baseOffset = UNSAFE.objectFieldOffset(com/google/common/cache/Striped64.getDeclaredField("base"));
            busyOffset = UNSAFE.objectFieldOffset(com/google/common/cache/Striped64.getDeclaredField("busy"));
        }
        catch (Exception exception)
        {
            throw new Error(exception);
        }
    }

}
