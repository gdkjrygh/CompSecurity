// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            BeanDeserializerBuilder

public abstract class BeanDeserializerModifier
{

    public BeanDeserializerModifier()
    {
    }

    public JsonDeserializer modifyArrayDeserializer(DeserializationConfig deserializationconfig, ArrayType arraytype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public JsonDeserializer modifyCollectionDeserializer(DeserializationConfig deserializationconfig, CollectionType collectiontype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public JsonDeserializer modifyCollectionLikeDeserializer(DeserializationConfig deserializationconfig, CollectionLikeType collectionliketype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public JsonDeserializer modifyDeserializer(DeserializationConfig deserializationconfig, BeanDescription beandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public JsonDeserializer modifyEnumDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public KeyDeserializer modifyKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, KeyDeserializer keydeserializer)
    {
        return keydeserializer;
    }

    public JsonDeserializer modifyMapDeserializer(DeserializationConfig deserializationconfig, MapType maptype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public JsonDeserializer modifyMapLikeDeserializer(DeserializationConfig deserializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonDeserializer jsondeserializer)
    {
        return jsondeserializer;
    }

    public BeanDeserializerBuilder updateBuilder(DeserializationConfig deserializationconfig, BeanDescription beandescription, BeanDeserializerBuilder beandeserializerbuilder)
    {
        return beandeserializerbuilder;
    }

    public List updateProperties(DeserializationConfig deserializationconfig, BeanDescription beandescription, List list)
    {
        return list;
    }
}
