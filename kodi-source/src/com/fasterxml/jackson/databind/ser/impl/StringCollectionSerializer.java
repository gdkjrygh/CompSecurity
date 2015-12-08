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
import java.util.Collection;
import java.util.Iterator;

public class StringCollectionSerializer extends StaticListSerializerBase
    implements ContextualSerializer
{

    public static final StringCollectionSerializer instance = new StringCollectionSerializer();
    protected final JsonSerializer _serializer;

    protected StringCollectionSerializer()
    {
        this(null);
    }

    protected StringCollectionSerializer(JsonSerializer jsonserializer)
    {
        super(java/util/Collection);
        _serializer = jsonserializer;
    }

    private final void _serializeUnwrapped(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_serializer == null)
        {
            serializeContents(collection, jsongenerator, serializerprovider);
            return;
        } else
        {
            serializeUsingCustom(collection, jsongenerator, serializerprovider);
            return;
        }
    }

    private final void serializeContents(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_serializer == null) goto _L2; else goto _L1
_L1:
        serializeUsingCustom(collection, jsongenerator, serializerprovider);
_L6:
        return;
_L2:
        Iterator iterator;
        int i;
        i = 0;
        iterator = collection.iterator();
_L4:
label0:
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            String s = (String)iterator.next();
            if (s == null)
            {
                try
                {
                    serializerprovider.defaultSerializeNull(jsongenerator);
                    break label0;
                }
                catch (Exception exception)
                {
                    wrapAndThrow(serializerprovider, exception, collection, i);
                }
                break; /* Loop/switch isn't completed */
            }
        }
        jsongenerator.writeString(s);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void serializeUsingCustom(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        JsonSerializer jsonserializer;
        Iterator iterator;
        jsonserializer = _serializer;
        iterator = collection.iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        if (obj == null)
        {
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                wrapAndThrow(serializerprovider, ((Throwable) (obj)), collection, 0);
            }
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
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
            return new StringCollectionSerializer(beanproperty);
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Collection)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int i = collection.size();
        if (i == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        {
            _serializeUnwrapped(collection, jsongenerator, serializerprovider);
            return;
        }
        jsongenerator.writeStartArray(i);
        if (_serializer == null)
        {
            serializeContents(collection, jsongenerator, serializerprovider);
        } else
        {
            serializeUsingCustom(collection, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndArray();
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        serializeWithType((Collection)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForArray(collection, jsongenerator);
        if (_serializer == null)
        {
            serializeContents(collection, jsongenerator, serializerprovider);
        } else
        {
            serializeUsingCustom(collection, jsongenerator, serializerprovider);
        }
        typeserializer.writeTypeSuffixForArray(collection, jsongenerator);
    }

}
