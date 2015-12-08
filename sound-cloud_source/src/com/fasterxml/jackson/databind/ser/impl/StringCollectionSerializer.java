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
        iterator = collection.iterator();
        i = 0;
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
            return new StringCollectionSerializer(serializerprovider);
        }
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Collection)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartArray();
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
        throws IOException, JsonProcessingException
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
