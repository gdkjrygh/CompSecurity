// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package com.google.b.b:
//            ak, al, am, an

public abstract class aj
{

    public aj()
    {
    }

    public static aj a()
    {
        Object obj;
        try
        {
            obj = Class.forName("sun.misc.Unsafe");
            Object obj3 = ((Class) (obj)).getDeclaredField("theUnsafe");
            ((Field) (obj3)).setAccessible(true);
            obj3 = ((Field) (obj3)).get(null);
            obj = new ak(((Class) (obj)).getMethod("allocateInstance", new Class[] {
                java/lang/Class
            }), obj3);
        }
        catch (Exception exception)
        {
            Object obj1;
            try
            {
                obj1 = java/io/ObjectStreamClass.getDeclaredMethod("getConstructorId", new Class[] {
                    java/lang/Class
                });
                ((Method) (obj1)).setAccessible(true);
                int i = ((Integer)((Method) (obj1)).invoke(null, new Object[] {
                    java/lang/Object
                })).intValue();
                obj1 = java/io/ObjectStreamClass.getDeclaredMethod("newInstance", new Class[] {
                    java/lang/Class, Integer.TYPE
                });
                ((Method) (obj1)).setAccessible(true);
                obj1 = new al(((Method) (obj1)), i);
            }
            catch (Exception exception1)
            {
                Object obj2;
                try
                {
                    obj2 = java/io/ObjectInputStream.getDeclaredMethod("newInstance", new Class[] {
                        java/lang/Class, java/lang/Class
                    });
                    ((Method) (obj2)).setAccessible(true);
                    obj2 = new am(((Method) (obj2)));
                }
                catch (Exception exception2)
                {
                    return new an();
                }
                return ((aj) (obj2));
            }
            return ((aj) (obj1));
        }
        return ((aj) (obj));
    }

    public abstract Object a(Class class1);
}
