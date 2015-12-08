// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

abstract class n extends Number
{
    static final class a
    {

        private static final Unsafe b;
        private static final long c;
        volatile long a;

        final boolean a(long l, long l1)
        {
            return b.compareAndSwapLong(this, c, l, l1);
        }

        static 
        {
            try
            {
                b = n.c();
                c = b.objectFieldOffset(com/google/android/m4b/maps/z/n$a.getDeclaredField("value"));
            }
            catch (Exception exception)
            {
                throw new Error(exception);
            }
        }

        a(long l)
        {
            a = l;
        }
    }

    static final class b
    {

        private static Random b = new Random();
        int a;


        b()
        {
            int j = b.nextInt();
            int i = j;
            if (j == 0)
            {
                i = 1;
            }
            a = i;
        }
    }

    static final class c extends ThreadLocal
    {

        public final Object initialValue()
        {
            return new b();
        }

        c()
        {
        }
    }


    static final c a = new c();
    static final int b = Runtime.getRuntime().availableProcessors();
    private static final Unsafe f;
    private static final long g;
    private static final long h;
    volatile transient a c[];
    volatile transient long d;
    volatile transient int e;

    n()
    {
    }

    private static Unsafe a()
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

                    public final Object run()
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

    static Unsafe c()
    {
        return a();
    }

    abstract long a(long l, long l1);

    final boolean b()
    {
        return f.compareAndSwapInt(this, h, 0, 1);
    }

    final boolean b(long l, long l1)
    {
        return f.compareAndSwapLong(this, g, l, l1);
    }

    static 
    {
        try
        {
            f = a();
            g = f.objectFieldOffset(com/google/android/m4b/maps/z/n.getDeclaredField("base"));
            h = f.objectFieldOffset(com/google/android/m4b/maps/z/n.getDeclaredField("busy"));
        }
        catch (Exception exception)
        {
            throw new Error(exception);
        }
    }
}
