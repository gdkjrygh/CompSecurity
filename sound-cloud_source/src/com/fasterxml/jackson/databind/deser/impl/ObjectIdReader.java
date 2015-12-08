// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.Serializable;

public final class ObjectIdReader
    implements Serializable
{

    public final JsonDeserializer deserializer;
    public final ObjectIdGenerator generator;
    public final SettableBeanProperty idProperty;
    public final JavaType idType;
    public final String propertyName;

    protected ObjectIdReader(JavaType javatype, String s, ObjectIdGenerator objectidgenerator, JsonDeserializer jsondeserializer, SettableBeanProperty settablebeanproperty)
    {
        idType = javatype;
        propertyName = s;
        generator = objectidgenerator;
        deserializer = jsondeserializer;
        idProperty = settablebeanproperty;
    }

    public static ObjectIdReader construct(JavaType javatype, String s, ObjectIdGenerator objectidgenerator, JsonDeserializer jsondeserializer, SettableBeanProperty settablebeanproperty)
    {
        return new ObjectIdReader(javatype, s, objectidgenerator, jsondeserializer, settablebeanproperty);
    }
}
