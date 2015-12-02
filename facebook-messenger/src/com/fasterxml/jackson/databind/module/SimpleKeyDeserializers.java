// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.util.HashMap;

public class SimpleKeyDeserializers
    implements KeyDeserializers
{

    protected HashMap _classMappings;

    public SimpleKeyDeserializers()
    {
        _classMappings = null;
    }

    public SimpleKeyDeserializers addDeserializer(Class class1, KeyDeserializer keydeserializer)
    {
        if (_classMappings == null)
        {
            _classMappings = new HashMap();
        }
        _classMappings.put(new ClassKey(class1), keydeserializer);
        return this;
    }

    public KeyDeserializer findKeyDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
    {
        if (_classMappings == null)
        {
            return null;
        } else
        {
            return (KeyDeserializer)_classMappings.get(new ClassKey(javatype.getRawClass()));
        }
    }
}
