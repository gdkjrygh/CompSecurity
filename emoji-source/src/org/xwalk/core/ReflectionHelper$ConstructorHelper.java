// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import java.lang.reflect.Constructor;

// Referenced classes of package org.xwalk.core:
//            ReflectionHelper

static class paramTypes
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

    transient (String s, Object aobj[])
    {
        fullClassName = s;
        paramTypes = aobj;
    }
}
