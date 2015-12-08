// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import java.lang.reflect.Constructor;

// Referenced classes of package com.skype.android.inject:
//            Proxy

public class ProxyFactory
{

    private static final String CLASS_SUFFIX = "$$Proxy";

    private ProxyFactory()
    {
    }

    public static Proxy get(Object obj)
    {
        Class class1 = obj.getClass();
_L3:
        if (isTopLevelClass(class1)) goto _L2; else goto _L1
_L1:
        Object obj1 = Class.forName((new StringBuilder()).append(class1.getName()).append("$$Proxy").toString());
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (Proxy)((Class) (obj1)).getConstructor(new Class[] {
            class1
        }).newInstance(new Object[] {
            obj
        });
        return ((Proxy) (obj1));
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        class1 = class1.getSuperclass();
          goto _L3
_L2:
        return null;
    }

    private static boolean isTopLevelClass(Class class1)
    {
        class1 = class1.getName();
        return class1.startsWith("java") || class1.startsWith("android");
    }
}
