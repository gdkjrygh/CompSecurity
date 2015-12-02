// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import android.content.Context;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package com.qihoo.a.a.a:
//            g, a

class e
{

    e()
    {
    }

    public static DexClassLoader a(Context context, String s, String s1)
        throws Throwable
    {
        DexClassLoader dexclassloader;
        dexclassloader = null;
        s1 = null;
        g g1 = new g((new StringBuilder(String.valueOf(s))).append(".lock").toString());
        String s2;
        File file;
        boolean flag;
        g1.a(1500);
        s2 = context.getFilesDir().getAbsolutePath();
        file = context.getFileStreamPath(s);
        flag = com.qihoo.a.a.a.a.a(context, s, s2, s, s2);
        if (flag) goto _L2; else goto _L1
_L1:
        context = s1;
        if (g1 != null)
        {
            g1.b();
            context = s1;
        }
_L7:
        return context;
_L2:
        s1 = dexclassloader;
        if (!file.exists()) goto _L4; else goto _L3
_L3:
        int i = 0;
_L5:
        DexClassLoader dexclassloader1 = new DexClassLoader(file.getAbsolutePath(), s2, null, context.getClassLoader());
        s1 = dexclassloader1;
        if (dexclassloader1 == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        dexclassloader = dexclassloader1;
        if (!a(dexclassloader1))
        {
            dexclassloader = null;
        }
        s1 = dexclassloader;
        if (dexclassloader != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        com.qihoo.a.a.a.a.a(context, s, s2, s, s2);
        s1 = dexclassloader;
        int j;
        if (s1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i + 1;
        i = j;
        if (j < 3) goto _L5; else goto _L4
_L4:
        context = s1;
        if (g1 == null) goto _L7; else goto _L6
_L6:
        g1.b();
        return s1;
        context;
        s = null;
_L9:
        if (s != null)
        {
            s.b();
        }
        throw context;
        context;
        s = g1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static final Object a(DexClassLoader dexclassloader, String s, String s1)
    {
        try
        {
            dexclassloader = ((DexClassLoader) (dexclassloader.loadClass(s).getDeclaredField(s1).get(null)));
        }
        // Misplaced declaration of an exception variable
        catch (DexClassLoader dexclassloader)
        {
            return null;
        }
        return dexclassloader;
    }

    public static final transient Object a(Object obj, Method method, Object aobj[])
    {
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    public static transient Object a(Constructor constructor, Object aobj[])
    {
        try
        {
            constructor = ((Constructor) (constructor.newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Constructor constructor)
        {
            return null;
        }
        return constructor;
    }

    public static transient Constructor a(ClassLoader classloader, String s, Class aclass[])
    {
        try
        {
            classloader = classloader.loadClass(s).getDeclaredConstructor(aclass);
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return null;
        }
        return classloader;
    }

    public static final transient Method a(DexClassLoader dexclassloader, String s, String s1, Class aclass[])
    {
        dexclassloader = dexclassloader.loadClass(s);
_L3:
        if (dexclassloader != java/lang/Object) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        s = dexclassloader.getDeclaredMethod(s1, aclass);
        s.setAccessible(true);
        return s;
        s;
        dexclassloader = dexclassloader.getSuperclass();
          goto _L3
        dexclassloader;
          goto _L1
    }

    private static boolean a(DexClassLoader dexclassloader)
    {
        int i;
        try
        {
            i = ((Integer)a(dexclassloader, "com.qihoo360.plugin.clear.Entry", "SDK_VERSION_CODE")).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (DexClassLoader dexclassloader)
        {
            return false;
        }
        return i > 0;
    }
}
