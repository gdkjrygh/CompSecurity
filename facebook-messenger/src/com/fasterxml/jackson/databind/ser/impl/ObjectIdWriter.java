// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;

public final class ObjectIdWriter
{

    public final ObjectIdGenerator generator;
    public final JavaType idType;
    public final SerializedString propertyName;
    public final JsonSerializer serializer;

    protected ObjectIdWriter(JavaType javatype, SerializedString serializedstring, ObjectIdGenerator objectidgenerator, JsonSerializer jsonserializer)
    {
        idType = javatype;
        propertyName = serializedstring;
        generator = objectidgenerator;
        serializer = jsonserializer;
    }

    public static ObjectIdWriter construct(JavaType javatype, String s, ObjectIdGenerator objectidgenerator)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = new SerializedString(s);
        }
        return new ObjectIdWriter(javatype, s, objectidgenerator, null);
    }

    public ObjectIdWriter withSerializer(JsonSerializer jsonserializer)
    {
        return new ObjectIdWriter(idType, propertyName, generator, jsonserializer);
    }
}
