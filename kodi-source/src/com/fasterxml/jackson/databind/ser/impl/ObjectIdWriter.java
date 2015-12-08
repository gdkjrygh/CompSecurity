// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;

public final class ObjectIdWriter
{

    public final boolean alwaysAsId;
    public final ObjectIdGenerator generator;
    public final JavaType idType;
    public final SerializableString propertyName;
    public final JsonSerializer serializer;

    protected ObjectIdWriter(JavaType javatype, SerializableString serializablestring, ObjectIdGenerator objectidgenerator, JsonSerializer jsonserializer, boolean flag)
    {
        idType = javatype;
        propertyName = serializablestring;
        generator = objectidgenerator;
        serializer = jsonserializer;
        alwaysAsId = flag;
    }

    public static ObjectIdWriter construct(JavaType javatype, PropertyName propertyname, ObjectIdGenerator objectidgenerator, boolean flag)
    {
        if (propertyname == null)
        {
            propertyname = null;
        } else
        {
            propertyname = propertyname.getSimpleName();
        }
        return construct(javatype, ((String) (propertyname)), objectidgenerator, flag);
    }

    public static ObjectIdWriter construct(JavaType javatype, String s, ObjectIdGenerator objectidgenerator, boolean flag)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = new SerializedString(s);
        }
        return new ObjectIdWriter(javatype, s, objectidgenerator, null, flag);
    }

    public ObjectIdWriter withAlwaysAsId(boolean flag)
    {
        if (flag == alwaysAsId)
        {
            return this;
        } else
        {
            return new ObjectIdWriter(idType, propertyName, generator, serializer, flag);
        }
    }

    public ObjectIdWriter withSerializer(JsonSerializer jsonserializer)
    {
        return new ObjectIdWriter(idType, propertyName, generator, jsonserializer, alwaysAsId);
    }
}
