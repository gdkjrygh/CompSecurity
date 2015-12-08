// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

public class StringArraySerializer extends ArraySerializerBase
    implements ContextualSerializer
{

    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(java/lang/String);
    public static final StringArraySerializer instance = new StringArraySerializer();
    protected final JsonSerializer _elementSerializer;

    protected StringArraySerializer()
    {
        super([Ljava/lang/String;, null);
        _elementSerializer = null;
    }

    public StringArraySerializer(StringArraySerializer stringarrayserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        super(stringarrayserializer, beanproperty);
        _elementSerializer = jsonserializer;
    }

    private void serializeContentsSlow(String as[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        int i = 0;
        int j = as.length;
        while (i < j) 
        {
            if (as[i] == null)
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
            } else
            {
                jsonserializer.serialize(as[i], jsongenerator, serializerprovider);
            }
            i++;
        }
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return this;
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
            jsonserializer = _elementSerializer;
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
        if (serializerprovider == _elementSerializer)
        {
            return this;
        } else
        {
            return new StringArraySerializer(this, beanproperty, serializerprovider);
        }
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((String[])obj);
    }

    public boolean hasSingleElement(String as[])
    {
        return as.length == 1;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((String[])obj);
    }

    public boolean isEmpty(String as[])
    {
        return as == null || as.length == 0;
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((String[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(String as[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int j = as.length;
        if (j != 0)
        {
            if (_elementSerializer != null)
            {
                serializeContentsSlow(as, jsongenerator, serializerprovider, _elementSerializer);
                return;
            }
            int i = 0;
            while (i < j) 
            {
                if (as[i] == null)
                {
                    jsongenerator.writeNull();
                } else
                {
                    jsongenerator.writeString(as[i]);
                }
                i++;
            }
        }
    }

}
