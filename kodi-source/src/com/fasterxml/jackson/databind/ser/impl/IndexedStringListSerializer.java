// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
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

    private final void _serializeUnwrapped(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (_serializer == null)
        {
            serializeContents(list, jsongenerator, serializerprovider, 1);
            return;
        } else
        {
            serializeUsingCustom(list, jsongenerator, serializerprovider, 1);
            return;
        }
    }

    private final void serializeContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, int i)
        throws IOException
    {
        int j = 0;
_L2:
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        String s = (String)list.get(j);
        if (s == null)
        {
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                break MISSING_BLOCK_LABEL_56;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                wrapAndThrow(serializerprovider, jsongenerator, list, j);
            }
            break MISSING_BLOCK_LABEL_55;
        }
        jsongenerator.writeString(s);
        break MISSING_BLOCK_LABEL_56;
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private final void serializeUsingCustom(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, int i)
        throws IOException
    {
        int k = 0;
        JsonSerializer jsonserializer = _serializer;
        int j = 0;
_L2:
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k = j;
        String s = (String)list.get(j);
        if (s == null)
        {
            k = j;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                break MISSING_BLOCK_LABEL_80;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                wrapAndThrow(serializerprovider, jsongenerator, list, k);
            }
            break MISSING_BLOCK_LABEL_79;
        }
        k = j;
        jsonserializer.serialize(s, jsongenerator, serializerprovider);
        break MISSING_BLOCK_LABEL_80;
        return;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer1 = null;
        JsonSerializer jsonserializer = jsonserializer1;
        if (beanproperty != null)
        {
            com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
            jsonserializer = jsonserializer1;
            if (annotatedmember != null)
            {
                Object obj = serializerprovider.getAnnotationIntrospector().findContentSerializer(annotatedmember);
                jsonserializer = jsonserializer1;
                if (obj != null)
                {
                    jsonserializer = serializerprovider.serializerInstance(annotatedmember, obj);
                }
            }
        }
        jsonserializer1 = jsonserializer;
        if (jsonserializer == null)
        {
            jsonserializer1 = _serializer;
        }
        jsonserializer = findConvertingContentSerializer(serializerprovider, beanproperty, jsonserializer1);
        if (jsonserializer == null)
        {
            serializerprovider = serializerprovider.findValueSerializer(java/lang/String, beanproperty);
        } else
        {
            serializerprovider = serializerprovider.handleSecondaryContextualization(jsonserializer, beanproperty);
        }
        beanproperty = serializerprovider;
        if (isDefaultSerializer(serializerprovider))
        {
            beanproperty = null;
        }
        if (beanproperty == _serializer)
        {
            return this;
        } else
        {
            return new IndexedStringListSerializer(beanproperty);
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((List)obj, jsongenerator, serializerprovider);
    }

    public void serialize(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        int i = list.size();
        if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        {
            _serializeUnwrapped(list, jsongenerator, serializerprovider);
            return;
        }
        jsongenerator.writeStartArray(i);
        if (_serializer == null)
        {
            serializeContents(list, jsongenerator, serializerprovider, i);
        } else
        {
            serializeUsingCustom(list, jsongenerator, serializerprovider, i);
        }
        jsongenerator.writeEndArray();
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        serializeWithType((List)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        int i = list.size();
        typeserializer.writeTypePrefixForArray(list, jsongenerator);
        if (_serializer == null)
        {
            serializeContents(list, jsongenerator, serializerprovider, i);
        } else
        {
            serializeUsingCustom(list, jsongenerator, serializerprovider, i);
        }
        typeserializer.writeTypeSuffixForArray(list, jsongenerator);
    }

}
