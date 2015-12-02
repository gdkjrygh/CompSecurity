// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            Serializers

public class er
    implements Serializers
{

    public JsonSerializer findArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return null;
    }

    public JsonSerializer findCollectionLikeSerializer(SerializationConfig serializationconfig, CollectionLikeType collectionliketype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return null;
    }

    public JsonSerializer findCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return null;
    }

    public JsonSerializer findMapLikeSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        return null;
    }

    public JsonSerializer findMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        return null;
    }

    public JsonSerializer findSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
    {
        return null;
    }

    public er()
    {
    }
}
