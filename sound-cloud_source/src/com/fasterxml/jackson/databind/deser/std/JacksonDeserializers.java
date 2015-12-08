// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer, StdScalarDeserializer

public class JacksonDeserializers
{
    public static class JavaTypeDeserializer extends StdScalarDeserializer
    {

        public JavaType deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                jsonparser = jsonparser.getText().trim();
                if (jsonparser.length() == 0)
                {
                    return (JavaType)getEmptyValue();
                } else
                {
                    return deserializationcontext.getTypeFactory().constructFromCanonical(jsonparser);
                }
            }
            if (jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
            {
                return (JavaType)jsonparser.getEmbeddedObject();
            } else
            {
                throw deserializationcontext.mappingException(_valueClass);
            }
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public JavaTypeDeserializer()
        {
            super(com/fasterxml/jackson/databind/JavaType);
        }
    }

    public static class JsonLocationInstantiator extends ValueInstantiator
    {

        private static final int _int(Object obj)
        {
            if (obj == null)
            {
                return 0;
            } else
            {
                return ((Number)obj).intValue();
            }
        }

        private static final long _long(Object obj)
        {
            if (obj == null)
            {
                return 0L;
            } else
            {
                return ((Number)obj).longValue();
            }
        }

        public boolean canCreateFromObjectWith()
        {
            return true;
        }

        public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
        {
            return new JsonLocation(aobj[0], _long(aobj[1]), _long(aobj[2]), _int(aobj[3]), _int(aobj[4]));
        }

        public CreatorProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
        {
            JavaType javatype = deserializationconfig.constructType(Integer.TYPE);
            JavaType javatype1 = deserializationconfig.constructType(Long.TYPE);
            return (new CreatorProperty[] {
                new CreatorProperty("sourceRef", deserializationconfig.constructType(java/lang/Object), null, null, null, 0, null), new CreatorProperty("byteOffset", javatype1, null, null, null, 1, null), new CreatorProperty("charOffset", javatype1, null, null, null, 2, null), new CreatorProperty("lineNr", javatype, null, null, null, 3, null), new CreatorProperty("columnNr", javatype, null, null, null, 4, null)
            });
        }

        public volatile SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
        {
            return getFromObjectArguments(deserializationconfig);
        }

        public String getValueTypeDesc()
        {
            return com/fasterxml/jackson/core/JsonLocation.getName();
        }

        public JsonLocationInstantiator()
        {
        }
    }

    public static class TokenBufferDeserializer extends StdScalarDeserializer
    {

        public TokenBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            deserializationcontext = new TokenBuffer(jsonparser.getCodec());
            deserializationcontext.copyCurrentStructure(jsonparser);
            return deserializationcontext;
        }

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public TokenBufferDeserializer()
        {
            super(com/fasterxml/jackson/databind/util/TokenBuffer);
        }
    }


    public static StdDeserializer[] all()
    {
        return (new StdDeserializer[] {
            new JavaTypeDeserializer(), new TokenBufferDeserializer()
        });
    }

    public static ValueInstantiator findValueInstantiator(DeserializationConfig deserializationconfig, BeanDescription beandescription)
    {
        if (beandescription.getBeanClass() == com/fasterxml/jackson/core/JsonLocation)
        {
            return new JsonLocationInstantiator();
        } else
        {
            return null;
        }
    }
}
