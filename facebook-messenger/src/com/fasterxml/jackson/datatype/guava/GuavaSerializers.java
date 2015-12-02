// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;
import com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import com.google.common.a.iw;
import com.google.common.base.Optional;

public class GuavaSerializers extends com.fasterxml.jackson.databind.ser.Serializers.Base
{

    public GuavaSerializers()
    {
    }

    public JsonSerializer findMapLikeSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        if (com/google/common/a/iw.isAssignableFrom(mapliketype.getRawClass()))
        {
            return new MultimapSerializer(serializationconfig, mapliketype, beandescription, jsonserializer, typeserializer, jsonserializer1);
        } else
        {
            return null;
        }
    }

    public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
    {
        if (com/google/common/base/Optional.isAssignableFrom(javatype.getRawClass()))
        {
            return new GuavaOptionalSerializer(javatype);
        } else
        {
            return super.findSerializer(serializationconfig, javatype, beandescription);
        }
    }
}
