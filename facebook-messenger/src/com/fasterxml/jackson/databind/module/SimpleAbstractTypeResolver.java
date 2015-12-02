// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class SimpleAbstractTypeResolver extends AbstractTypeResolver
{

    protected final HashMap _mappings = new HashMap();

    public SimpleAbstractTypeResolver()
    {
    }

    public SimpleAbstractTypeResolver addMapping(Class class1, Class class2)
    {
        if (class1 == class2)
        {
            throw new IllegalArgumentException("Can not add mapping from class to itself");
        }
        if (!class1.isAssignableFrom(class2))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not add mapping from class ").append(class1.getName()).append(" to ").append(class2.getName()).append(", as latter is not a subtype of former").toString());
        }
        if (!Modifier.isAbstract(class1.getModifiers()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not add mapping from class ").append(class1.getName()).append(" since it is not abstract").toString());
        } else
        {
            _mappings.put(new ClassKey(class1), class2);
            return this;
        }
    }

    public JavaType findTypeMapping(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        deserializationconfig = javatype.getRawClass();
        deserializationconfig = (Class)_mappings.get(new ClassKey(deserializationconfig));
        if (deserializationconfig == null)
        {
            return null;
        } else
        {
            return javatype.narrowBy(deserializationconfig);
        }
    }

    public JavaType resolveAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        return null;
    }
}
