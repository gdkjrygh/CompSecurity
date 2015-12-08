// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.Converter;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//            MapperConfig

public abstract class HandlerInstantiator
{

    public Converter converterInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
    {
        return null;
    }

    public abstract JsonDeserializer deserializerInstance(DeserializationConfig deserializationconfig, Annotated annotated, Class class1);

    public abstract KeyDeserializer keyDeserializerInstance(DeserializationConfig deserializationconfig, Annotated annotated, Class class1);

    public PropertyNamingStrategy namingStrategyInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
    {
        return null;
    }

    public ObjectIdGenerator objectIdGeneratorInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
    {
        return null;
    }

    public ObjectIdResolver resolverIdGeneratorInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
    {
        return null;
    }

    public abstract JsonSerializer serializerInstance(SerializationConfig serializationconfig, Annotated annotated, Class class1);

    public abstract TypeIdResolver typeIdResolverInstance(MapperConfig mapperconfig, Annotated annotated, Class class1);

    public abstract TypeResolverBuilder typeResolverBuilderInstance(MapperConfig mapperconfig, Annotated annotated, Class class1);

    public ValueInstantiator valueInstantiatorInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
    {
        return null;
    }
}
