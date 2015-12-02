// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.List;

public final class IndexedStringListSerializer extends StaticListSerializerBase
    implements ContextualSerializer
{

    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
    protected final JsonSerializer _serializer;

    protected IndexedStringListSerializer()
    {
        this(null);
    }

    public IndexedStringListSerializer(JsonSerializer jsonserializer)
    {
        super(java/util/List);
        _serializer = jsonserializer;
    }

    private final void serializeContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        int i;
        int j;
        j = 0;
        i = 0;
        int k = list.size();
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        j = i;
        String s = (String)list.get(i);
        if (s == null)
        {
            j = i;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                break MISSING_BLOCK_LABEL_79;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                wrapAndThrow(serializerprovider, jsongenerator, list, j);
            }
            break MISSING_BLOCK_LABEL_78;
        }
        j = i;
        jsongenerator.writeString(s);
        break MISSING_BLOCK_LABEL_79;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private final void serializeUsingCustom(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        int i;
        int j;
        boolean flag;
        flag = false;
        i = 0;
        j = ((flag) ? 1 : 0);
        int k = list.size();
        j = ((flag) ? 1 : 0);
        JsonSerializer jsonserializer = _serializer;
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        j = i;
        String s = (String)list.get(i);
        if (s == null)
        {
            j = i;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                break MISSING_BLOCK_LABEL_96;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                wrapAndThrow(serializerprovider, jsongenerator, list, j);
            }
            break MISSING_BLOCK_LABEL_95;
        }
        j = i;
        jsonserializer.serialize(s, jsongenerator, serializerprovider);
        break MISSING_BLOCK_LABEL_96;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected JsonNode contentSchema()
    {
        return createSchemaNode("string", true);
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer1 = _serializer;
        JsonSerializer jsonserializer;
        if (jsonserializer1 == null)
        {
            jsonserializer = serializerprovider.findValueSerializer(java/lang/String, beanproperty);
        } else
        {
            jsonserializer = jsonserializer1;
            if (jsonserializer1 instanceof ContextualSerializer)
            {
                jsonserializer = ((ContextualSerializer)jsonserializer1).createContextual(serializerprovider, beanproperty);
            }
        }
        serializerprovider = jsonserializer;
        if (isDefaultSerializer(jsonserializer))
        {
            serializerprovider = null;
        }
        if (serializerprovider == _serializer)
        {
            return this;
        } else
        {
            return new IndexedStringListSerializer(serializerprovider);
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((List)obj, jsongenerator, serializerprovider);
    }

    public void serialize(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeStartArray();
        if (_serializer == null)
        {
            serializeContents(list, jsongenerator, serializerprovider);
        } else
        {
            serializeUsingCustom(list, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndArray();
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((List)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForArray(list, jsongenerator);
        if (_serializer == null)
        {
            serializeContents(list, jsongenerator, serializerprovider);
        } else
        {
            serializeUsingCustom(list, jsongenerator, serializerprovider);
        }
        typeserializer.writeTypeSuffixForArray(list, jsongenerator);
    }

}
