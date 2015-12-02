// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

public final class erializer extends erializer
{

    private static final JavaType VALUE_TYPE;

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new <init>(this, _property, typeserializer);
    }

    public JsonSerializer getContentSerializer()
    {
        return null;
    }

    public JavaType getContentType()
    {
        return VALUE_TYPE;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        serializerprovider = createSchemaNode("array", true);
        serializerprovider.put("items", createSchemaNode("number", true));
        return serializerprovider;
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((long[])obj);
    }

    public boolean hasSingleElement(long al[])
    {
        return al.length == 1;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((long[])obj);
    }

    public boolean isEmpty(long al[])
    {
        return al == null || al.length == 0;
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serializeContents((long[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        int k = 0;
        int i = 0;
        if (_valueTypeSerializer != null)
        {
            for (k = al.length; i < k; i++)
            {
                _valueTypeSerializer.writeTypePrefixForScalar(null, jsongenerator, Long.TYPE);
                jsongenerator.writeNumber(al[i]);
                _valueTypeSerializer.writeTypeSuffixForScalar(null, jsongenerator);
            }

        } else
        {
            int l = al.length;
            for (int j = k; j < l; j++)
            {
                jsongenerator.writeNumber(al[j]);
            }

        }
    }

    static 
    {
        VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);
    }

    public erializer()
    {
        super([J);
    }

    public erializer(erializer erializer, BeanProperty beanproperty, TypeSerializer typeserializer)
    {
        super(erializer, beanproperty, typeserializer);
    }
}
