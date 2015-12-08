// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ReflectionHelper
{
    static class ConstructorHelper
    {

        private String fullClassName;
        private Object paramTypes[];

        Constructor loadConstructor()
        {
            Object obj = ReflectionHelper.loadClass(fullClassName);
            if (obj == null)
            {
                return null;
            }
            Class aclass[] = new Class[paramTypes.length];
            int i = 0;
            while (i < paramTypes.length) 
            {
                Object obj1 = paramTypes[i];
                if (obj1 instanceof Class)
                {
                    aclass[i] = (Class)obj1;
                } else
                if (obj1 instanceof String)
                {
                    aclass[i] = ReflectionHelper.loadClass((String)obj1);
                }
                i++;
            }
            try
            {
                obj = ((Class) (obj)).getConstructor(aclass);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                ReflectionHelper.handleException(nosuchmethodexception);
                return null;
            }
            return ((Constructor) (obj));
        }

        transient ConstructorHelper(String s, Object aobj[])
        {
            fullClassName = s;
            paramTypes = aobj;
        }
    }


    static final boolean $assertionsDisabled;
    private static final String INTERNAL_PACKAGE = "org.xwalk.core.internal";
    private static final String LIBRARY_APK_PACKAGE = "org.xwalk.core";
    private static Context sBridgeContext = null;
    private static ClassLoader sBridgeOrWrapperLoader = null;
    private static Map sBridgeWrapperMap = new HashMap();
    private static Map sConstructorHelperMap = new HashMap();
    private static Map sConstructorMap = new HashMap();
    private static boolean sIsWrapper = isWrapper();

    public ReflectionHelper()
    {
    }

    public static transient Object createInstance(String s, Object aobj[])
    {
        Object obj = null;
        Constructor constructor1 = (Constructor)sConstructorMap.get(s);
        Constructor constructor = constructor1;
        if (constructor1 == null)
        {
            ConstructorHelper constructorhelper = (ConstructorHelper)sConstructorHelperMap.get(s);
            constructor = constructor1;
            if (constructorhelper != null)
            {
                constructor = constructorhelper.loadConstructor();
                sConstructorMap.put(s, constructor);
            }
        }
        s = obj;
        if (constructor != null)
        {
            try
            {
                s = ((String) (constructor.newInstance(aobj)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleException(s);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleException(s);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleException(s);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                handleException(s);
                return null;
            }
        }
        return s;
    }

    public static Context getBridgeContext()
    {
        return sBridgeContext;
    }

    public static Object getBridgeOrWrapper(Object obj)
    {
        Object obj1;
        Object obj2;
        Class class1;
        while (sBridgeOrWrapperLoader == null || obj == null) 
        {
            return null;
        }
        class1 = obj.getClass();
        obj1 = (Method)sBridgeWrapperMap.get(class1);
        obj2 = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj2 = "getBridge";
        if (sIsWrapper)
        {
            obj2 = "getWrapper";
        }
        obj2 = class1.getDeclaredMethod(((String) (obj2)), new Class[0]);
        obj1 = obj2;
_L2:
        if (obj1 == null)
        {
            return invokeMethod(((Method) (obj1)), obj, new Object[0]);
        }
        break; /* Loop/switch isn't completed */
        obj2;
        handleException(((Exception) (obj2)));
        if (true) goto _L2; else goto _L1
_L1:
        sBridgeWrapperMap.put(class1, obj1);
        obj2 = obj1;
        if (((Method) (obj2)).isAccessible())
        {
            return invokeMethod(((Method) (obj2)), obj, new Object[0]);
        } else
        {
            ((Method) (obj2)).setAccessible(true);
            obj = invokeMethod(((Method) (obj2)), obj, new Object[0]);
            ((Method) (obj2)).setAccessible(false);
            return obj;
        }
    }

    public static void handleException(Exception exception)
    {
        exception.printStackTrace();
        throw new RuntimeException(exception);
    }

    public static void handleException(String s)
    {
        handleException(((Exception) (new RuntimeException(s))));
    }

    public static void init()
    {
        if (!$assertionsDisabled && !isWrapper())
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public static void initClassLoader(ClassLoader classloader, Context context)
    {
        sBridgeOrWrapperLoader = classloader;
        sBridgeContext = context;
        sBridgeWrapperMap.clear();
        sConstructorMap.clear();
        classloader = sConstructorHelperMap.keySet().iterator();
_L1:
        ConstructorHelper constructorhelper;
        if (!classloader.hasNext())
        {
            break MISSING_BLOCK_LABEL_97;
        }
        context = (String)classloader.next();
        constructorhelper = (ConstructorHelper)sConstructorHelperMap.get(context);
        if (constructorhelper != null)
        {
            try
            {
                sConstructorMap.put(context, constructorhelper.loadConstructor());
            }
            // Misplaced declaration of an exception variable
            catch (ClassLoader classloader)
            {
                handleException(classloader);
                return;
            }
        }
          goto _L1
        if (sIsWrapper)
        {
            sBridgeOrWrapperLoader.loadClass("org.xwalk.core.internal.ReflectionHelper").getMethod("initClassLoader", new Class[] {
                java/lang/ClassLoader, android/content/Context
            }).invoke(null, new Object[] {
                org/xwalk/core/internal/ReflectionHelper.getClassLoader(), sBridgeContext
            });
            return;
        }
        classloader = sBridgeOrWrapperLoader.loadClass("org.xwalk.core.JavascriptInterface");
        org/xwalk/core/internal/ReflectionHelper.getClassLoader().loadClass("org.xwalk.core.internal.XWalkContent").getDeclaredMethod("setJavascriptInterfaceClass", new Class[] {
            classloader.getClass()
        }).invoke(null, new Object[] {
            classloader
        });
        return;
    }

    public static transient Object invokeMethod(Method method, Object obj, Object aobj[])
    {
        while (sBridgeOrWrapperLoader == null || method == null) 
        {
            return null;
        }
        try
        {
            method = ((Method) (method.invoke(obj, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            handleException(method);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            handleException(method);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            handleException(method);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            handleException(method);
            return null;
        }
        return method;
    }

    private static boolean isWrapper()
    {
        return !org/xwalk/core/internal/ReflectionHelper.getPackage().getName().equals("org.xwalk.core.internal");
    }

    public static Class loadClass(String s)
    {
        if (sBridgeOrWrapperLoader == null)
        {
            init();
        }
        if (sBridgeOrWrapperLoader == null)
        {
            return null;
        }
        try
        {
            s = sBridgeOrWrapperLoader.loadClass(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            handleException(s);
            return null;
        }
        return s;
    }

    public static transient Method loadMethod(Class class1, String s, Object aobj[])
    {
        if (sBridgeOrWrapperLoader == null)
        {
            return null;
        }
        Class aclass[] = new Class[aobj.length];
        int i = 0;
        while (i < aobj.length) 
        {
            Object obj = aobj[i];
            if (obj instanceof Class)
            {
                aclass[i] = (Class)obj;
            } else
            if (obj instanceof String)
            {
                aclass[i] = loadClass((String)obj);
            }
            i++;
        }
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            handleException(class1);
            return null;
        }
        return class1;
    }

    public static transient void registerConstructor(String s, String s1, Object aobj[])
    {
        sConstructorHelperMap.put(s, new ConstructorHelper(s1, aobj));
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/internal/ReflectionHelper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
