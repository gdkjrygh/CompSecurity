// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
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

    private final void _serializeUnwrapped(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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
    {
        int j;
        int k;
        k = 0;
        j = 0;
        JsonSerializer jsonserializer = _serializer;
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

    public final JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
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
        obj = findConvertingContentSerializer(serializerprovider, beanproperty, jsonserializer);
        if (obj == null)
        {
            serializerprovider = serializerprovider.findValueSerializer(java/lang/String, beanproperty);
        } else
        {
            serializerprovider = serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj)), beanproperty);
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
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((List)obj, jsongenerator, serializerprovider);
    }

    public final void serialize(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        int i = list.size();
        if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        {
            _serializeUnwrapped(list, jsongenerator, serializerprovider);
            return;
        }
        jsongenerator.writeStartArray();
        if (_serializer == null)
        {
            serializeContents(list, jsongenerator, serializerprovider, i);
        } else
        {
            serializeUsingCustom(list, jsongenerator, serializerprovider, i);
        }
        jsongenerator.writeEndArray();
    }

    public final volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((List)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public final void serializeWithType(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
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
