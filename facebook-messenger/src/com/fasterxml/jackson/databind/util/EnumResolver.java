// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.lang.reflect.Method;
import java.util.HashMap;

public class EnumResolver
{

    protected final Class _enumClass;
    protected final Enum _enums[];
    protected final HashMap _enumsById;

    protected EnumResolver(Class class1, Enum aenum[], HashMap hashmap)
    {
        _enumClass = class1;
        _enums = aenum;
        _enumsById = hashmap;
    }

    public static EnumResolver constructFor(Class class1, AnnotationIntrospector annotationintrospector)
    {
        Enum aenum[] = (Enum[])class1.getEnumConstants();
        if (aenum == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No enum constants for class ").append(class1.getName()).toString());
        }
        HashMap hashmap = new HashMap();
        int j = aenum.length;
        for (int i = 0; i < j; i++)
        {
            Enum enum = aenum[i];
            hashmap.put(annotationintrospector.findEnumValue(enum), enum);
        }

        return new EnumResolver(class1, aenum, hashmap);
    }

    public static EnumResolver constructUnsafe(Class class1, AnnotationIntrospector annotationintrospector)
    {
        return constructFor(class1, annotationintrospector);
    }

    public static EnumResolver constructUnsafeUsingMethod(Class class1, Method method)
    {
        return constructUsingMethod(class1, method);
    }

    public static EnumResolver constructUnsafeUsingToString(Class class1)
    {
        return constructUsingToString(class1);
    }

    public static EnumResolver constructUsingMethod(Class class1, Method method)
    {
        Enum aenum[];
        HashMap hashmap;
        int i;
        aenum = (Enum[])class1.getEnumConstants();
        hashmap = new HashMap();
        i = aenum.length;
_L2:
        int j = i - 1;
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Enum enum = aenum[j];
        Object obj;
        try
        {
            obj = method.invoke(enum, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to access @JsonValue of Enum value ").append(enum).append(": ").append(class1.getMessage()).toString());
        }
        i = j;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        hashmap.put(obj.toString(), enum);
        i = j;
        if (true) goto _L2; else goto _L1
_L1:
        return new EnumResolver(class1, aenum, hashmap);
    }

    public static EnumResolver constructUsingToString(Class class1)
    {
        Enum aenum[] = (Enum[])class1.getEnumConstants();
        HashMap hashmap = new HashMap();
        int i = aenum.length;
        do
        {
            i--;
            if (i >= 0)
            {
                Enum enum = aenum[i];
                hashmap.put(enum.toString(), enum);
            } else
            {
                return new EnumResolver(class1, aenum, hashmap);
            }
        } while (true);
    }

    public Enum findEnum(String s)
    {
        return (Enum)_enumsById.get(s);
    }

    public Enum getEnum(int i)
    {
        if (i < 0 || i >= _enums.length)
        {
            return null;
        } else
        {
            return _enums[i];
        }
    }

    public Class getEnumClass()
    {
        return _enumClass;
    }

    public int lastValidIndex()
    {
        return _enums.length - 1;
    }
}
