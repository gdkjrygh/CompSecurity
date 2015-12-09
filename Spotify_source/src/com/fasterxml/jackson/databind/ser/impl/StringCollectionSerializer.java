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
            return new StringCollectionSerializer(beanproperty);
        }
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Collection)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (collection.size() == 1 && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        {
            _serializeUnwrapped(collection, jsongenerator, serializerprovider);
            return;
        }
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
    {
        serializeWithType((Collection)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
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
