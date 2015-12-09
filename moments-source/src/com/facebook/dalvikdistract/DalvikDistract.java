// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvikdistract;

import com.facebook.soloader.SoLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class DalvikDistract
{

    private final ArrayList mTransaction = new ArrayList();

    public DalvikDistract()
    {
    }

    public static void checkSignatureCompatibility(Object obj, Object obj1, boolean flag)
    {
        Class aclass[] = extractSignature(obj);
        Class aclass1[] = extractSignature(obj1);
        Class class1 = aclass[0];
        aclass[0] = aclass1[0];
        aclass1[0] = class1;
        if (aclass1.length > aclass.length)
        {
            throw new IncompatibleSignatureError(String.format("Argument length mismatch: hook may not accept more arguments than the original method.  Hook (%s) accepts %s arguments; original (%s) accepts %s", new Object[] {
                obj1, Integer.valueOf(aclass1.length - 1), obj, Integer.valueOf(aclass.length - 1)
            }));
        }
        for (int i = 0; i < aclass1.length; i++)
        {
            if (!aclass1[i].isAssignableFrom(aclass[i]) && (!flag || aclass[i] != java/lang/Object || aclass1[i].isPrimitive()))
            {
                throw new IncompatibleSignatureError(String.format("%s cannot substitute for %s", new Object[] {
                    aclass[i], aclass1[i]
                }));
            }
        }

    }

    private static Object cleanupMm(int i, Object obj)
    {
        nativeCleanupMm(i);
        return obj;
    }

    private static Class[] extractSignature(Object obj)
    {
        boolean flag1 = true;
        boolean flag = false;
        Object obj1;
        Object obj2;
        Class aclass[];
        int i;
        if (obj instanceof Method)
        {
            obj2 = (Method)obj;
            obj1 = ((Method) (obj2)).getReturnType();
            int j;
            if (Modifier.isStatic(((Method) (obj2)).getModifiers()))
            {
                obj = null;
            } else
            {
                obj = ((Method) (obj2)).getDeclaringClass();
            }
            aclass = ((Method) (obj2)).getParameterTypes();
            obj2 = obj;
            obj = obj1;
            obj1 = aclass;
        } else
        {
            obj1 = (Constructor)obj;
            obj = Void.TYPE;
            obj2 = ((Constructor) (obj1)).getDeclaringClass();
            obj1 = ((Constructor) (obj1)).getParameterTypes();
        }
        if (obj2 == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        aclass = new Class[i + 1 + obj1.length];
        aclass[0] = ((Class) (obj));
        j = ((flag) ? 1 : 0);
        i = ((flag1) ? 1 : 0);
        if (obj2 != null)
        {
            aclass[1] = ((Class) (obj2));
            i = 2;
            j = ((flag) ? 1 : 0);
        }
        while (j < obj1.length) 
        {
            aclass[i] = obj1[j];
            j++;
            i++;
        }
        return aclass;
    }

    private static native void nativeCleanupMm(int i);

    private static synchronized native void nativeCommit(Object aobj[]);

    public static Unsafe unsafe(Object obj)
    {
        return new Unsafe(obj);
    }

    public final void commit()
    {
        String s = System.getProperty("java.vm.version");
        if (s != null && !s.startsWith("0.") && !s.startsWith("1."))
        {
            throw new UnsupportedOperationException("DalvikDistract does not yet support ART");
        } else
        {
            nativeCommit(mTransaction.toArray());
            mTransaction.clear();
            return;
        }
    }

    public final DalvikDistract hook(Object obj, Object obj1)
    {
        boolean flag1 = true;
        boolean flag = false;
        Object obj2 = obj;
        if (obj instanceof Unsafe)
        {
            obj2 = ((Unsafe)obj).wrapped;
            flag = true;
        }
        if (obj1 instanceof Unsafe)
        {
            obj1 = ((Unsafe)obj1).wrapped;
            flag = flag1;
        }
        if (obj1 instanceof GenericCallHandler)
        {
            if (obj2 == null || !(obj2 instanceof Constructor) && !(obj2 instanceof Method))
            {
                throw new IllegalArgumentException("can hook only methods or constructors");
            }
        } else
        {
            checkSignatureCompatibility(obj2, obj1, flag);
        }
        mTransaction.add(obj2);
        mTransaction.add(obj1);
        return this;
    }

    public final DalvikDistract hook(Object obj, Object obj1, Object obj2)
    {
        hook(obj, obj1);
        hook(obj2, obj);
        return this;
    }

    public final DalvikDistract unhook(Constructor constructor)
    {
        mTransaction.add(constructor);
        mTransaction.add(null);
        return this;
    }

    public final DalvikDistract unhook(Method method)
    {
        mTransaction.add(method);
        mTransaction.add(null);
        return this;
    }

    static 
    {
        SoLoader.a("gnustl_shared");
        SoLoader.a("sigmux");
        SoLoader.a("distract");
        SoLoader.a("dalvikdistract");
    }

    private class IncompatibleSignatureError extends RuntimeException
    {

        IncompatibleSignatureError(String s)
        {
            super(s);
        }
    }


    private class Unsafe
    {

        private final Object wrapped;


        Unsafe(Object obj)
        {
            wrapped = obj;
        }
    }


    private class GenericCallHandler
    {

        public abstract void handleCall(Object obj, int i);
    }

}
