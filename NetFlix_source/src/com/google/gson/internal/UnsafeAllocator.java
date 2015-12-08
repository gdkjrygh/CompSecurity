// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class UnsafeAllocator
{

    public UnsafeAllocator()
    {
    }

    public static UnsafeAllocator create()
    {
        Object obj;
        try
        {
            obj = Class.forName("sun.misc.Unsafe");
            Object obj3 = ((Class) (obj)).getDeclaredField("theUnsafe");
            ((Field) (obj3)).setAccessible(true);
            obj3 = ((Field) (obj3)).get(null);
            obj = new UnsafeAllocator(((Class) (obj)).getMethod("allocateInstance", new Class[] {
                java/lang/Class
            }), obj3) {

                final Method val$allocateInstance;
                final Object val$unsafe;

                public Object newInstance(Class class1)
                    throws Exception
                {
                    return allocateInstance.invoke(unsafe, new Object[] {
                        class1
                    });
                }

            
            {
                allocateInstance = method;
                unsafe = obj;
                super();
            }
            };
        }
        catch (Exception exception)
        {
            Object obj1;
            try
            {
                obj1 = java/io/ObjectInputStream.getDeclaredMethod("newInstance", new Class[] {
                    java/lang/Class, java/lang/Class
                });
                ((Method) (obj1)).setAccessible(true);
                obj1 = new UnsafeAllocator(((Method) (obj1))) {

                    final Method val$newInstance;

                    public Object newInstance(Class class1)
                        throws Exception
                    {
                        return newInstance.invoke(null, new Object[] {
                            class1, java/lang/Object
                        });
                    }

            
            {
                newInstance = method;
                super();
            }
                };
            }
            catch (Exception exception1)
            {
                Object obj2;
                try
                {
                    obj2 = java/io/ObjectStreamClass.getDeclaredMethod("getConstructorId", new Class[] {
                        java/lang/Class
                    });
                    ((Method) (obj2)).setAccessible(true);
                    int i = ((Integer)((Method) (obj2)).invoke(null, new Object[] {
                        java/lang/Object
                    })).intValue();
                    obj2 = java/io/ObjectStreamClass.getDeclaredMethod("newInstance", new Class[] {
                        java/lang/Class, Integer.TYPE
                    });
                    ((Method) (obj2)).setAccessible(true);
                    obj2 = new UnsafeAllocator(((Method) (obj2)), i) {

                        final int val$constructorId;
                        final Method val$newInstance;

                        public Object newInstance(Class class1)
                            throws Exception
                        {
                            return newInstance.invoke(null, new Object[] {
                                class1, Integer.valueOf(constructorId)
                            });
                        }

            
            {
                newInstance = method;
                constructorId = i;
                super();
            }
                    };
                }
                catch (Exception exception2)
                {
                    return new UnsafeAllocator() {

                        public Object newInstance(Class class1)
                        {
                            throw new UnsupportedOperationException((new StringBuilder()).append("Cannot allocate ").append(class1).toString());
                        }

                    };
                }
                return ((UnsafeAllocator) (obj2));
            }
            return ((UnsafeAllocator) (obj1));
        }
        return ((UnsafeAllocator) (obj));
    }

    public abstract Object newInstance(Class class1)
        throws Exception;
}
