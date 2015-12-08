// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package com.google.a.b:
//            af, ag, ah, ai

public abstract class ae
{

    public ae()
    {
    }

    public static ae a()
    {
        Object obj;
        try
        {
            obj = Class.forName("sun.misc.Unsafe");
            Object obj3 = ((Class) (obj)).getDeclaredField("theUnsafe");
            ((Field) (obj3)).setAccessible(true);
            obj3 = ((Field) (obj3)).get(null);
            obj = new af(((Class) (obj)).getMethod("allocateInstance", new Class[] {
                java/lang/Class
            }), obj3);
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
                obj1 = new ag(((Method) (obj1)));
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
                    obj2 = new ah(((Method) (obj2)), i);
                }
                catch (Exception exception2)
                {
                    return new ai();
                }
                return ((ae) (obj2));
            }
            return ((ae) (obj1));
        }
        return ((ae) (obj));
    }

    public abstract Object a(Class class1);
}
