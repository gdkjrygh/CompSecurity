// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.lightcycle;

import java.lang.reflect.Method;

// Referenced classes of package com.soundcloud.lightcycle:
//            LightCycleDispatcher

public final class LightCycleBinder
{

    private static final String ANDROID_PREFIX = "android.";
    private static final String JAVA_PREFIX = "java.";
    private static final String TAG = com/soundcloud/lightcycle/LightCycleBinder.getSimpleName();

    public LightCycleBinder()
    {
    }

    public static void bind(LightCycleDispatcher lightcycledispatcher)
    {
        Method method;
        try
        {
            method = findBinderForClass(lightcycledispatcher.getClass());
        }
        // Misplaced declaration of an exception variable
        catch (LightCycleDispatcher lightcycledispatcher)
        {
            return;
        }
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        method.invoke(null, new Object[] {
            lightcycledispatcher
        });
    }

    private static Method findBinderForClass(Class class1)
        throws IllegalAccessException, InstantiationException, NoSuchMethodException
    {
        Object obj = class1.getName();
        if (((String) (obj)).startsWith("android.") || ((String) (obj)).startsWith("java."))
        {
            return null;
        }
        try
        {
            obj = Class.forName(getInjectorClassName(((String) (obj)))).getMethod("bind", new Class[] {
                class1
            });
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            (new StringBuilder("Not found. Trying superclass ")).append(class1.getSuperclass().getName());
            return findBinderForClass(class1.getSuperclass());
        }
        return ((Method) (obj));
    }

    private static String getInjectorClassName(String s)
    {
        return (new StringBuilder()).append(s).append("$LightCycleBinder").toString();
    }

}
