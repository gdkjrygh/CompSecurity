// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.io.IOException;
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
        throws IOException, JsonGenerationException
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
        throws IOException, JsonGenerationException
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

    public final JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        if (beanproperty == null) goto _L2; else goto _L1
_L1:
        Object obj = beanproperty.getMember();
        if (obj == null) goto _L2; else goto _L3
_L3:
        Object obj1 = serializerprovider.getAnnotationIntrospector().findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
        if (obj1 == null) goto _L2; else goto _L4
_L4:
        obj = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), obj1);
_L6:
        JsonSerializer jsonserializer = ((JsonSerializer) (obj));
        if (obj == null)
        {
            jsonserializer = _serializer;
        }
        if (jsonserializer == null)
        {
            obj = serializerprovider.findValueSerializer(java/lang/String, beanproperty);
        } else
        {
            obj = jsonserializer;
            if (jsonserializer instanceof ContextualSerializer)
            {
                obj = ((ContextualSerializer)jsonserializer).createContextual(serializerprovider, beanproperty);
            }
        }
        serializerprovider = ((SerializerProvider) (obj));
        if (isDefaultSerializer(((JsonSerializer) (obj))))
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
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((List)obj, jsongenerator, serializerprovider);
    }

    public final void serialize(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
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

    public final volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((List)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public final void serializeWithType(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
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
