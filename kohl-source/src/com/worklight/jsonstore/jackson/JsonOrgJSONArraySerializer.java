// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.jackson;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.ser.SerializerBase;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.jackson:
//            JsonOrgJSONObjectSerializer

public class JsonOrgJSONArraySerializer extends SerializerBase
{

    public static final JsonOrgJSONArraySerializer instance = new JsonOrgJSONArraySerializer();

    protected JsonOrgJSONArraySerializer()
    {
        super(org/json/JSONArray);
    }

    private void serializeContents(JSONArray jsonarray, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int j = jsonarray.length();
        int i = 0;
        while (i < j) 
        {
            Object obj = jsonarray.opt(i);
            if (obj == null || obj == JSONObject.NULL)
            {
                jsongenerator.writeNull();
            } else
            {
                Class class1 = obj.getClass();
                if (class1 == org/json/JSONObject || org/json/JSONObject.isAssignableFrom(class1))
                {
                    JsonOrgJSONObjectSerializer.instance.serialize((JSONObject)obj, jsongenerator, serializerprovider);
                } else
                if (class1 == org/json/JSONArray || org/json/JSONArray.isAssignableFrom(class1))
                {
                    serialize((JSONArray)obj, jsongenerator, serializerprovider);
                } else
                if (class1 == java/lang/String)
                {
                    jsongenerator.writeString((String)obj);
                } else
                if (class1 == java/lang/Integer)
                {
                    jsongenerator.writeNumber(((Integer)obj).intValue());
                } else
                if (class1 == java/lang/Long)
                {
                    jsongenerator.writeNumber(((Long)obj).longValue());
                } else
                if (class1 == java/lang/Boolean)
                {
                    jsongenerator.writeBoolean(((Boolean)obj).booleanValue());
                } else
                if (class1 == java/lang/Double)
                {
                    jsongenerator.writeNumber(((Double)obj).doubleValue());
                } else
                {
                    serializerprovider.defaultSerializeValue(obj, jsongenerator);
                }
            }
            i++;
        }
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        throws JsonMappingException
    {
        return createSchemaNode("array", true);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((JSONArray)obj, jsongenerator, serializerprovider);
    }

    public void serialize(JSONArray jsonarray, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartArray();
        serializeContents(jsonarray, jsongenerator, serializerprovider);
        jsongenerator.writeEndArray();
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((JSONArray)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(JSONArray jsonarray, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForArray(jsonarray, jsongenerator);
        serializeContents(jsonarray, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForArray(jsonarray, jsongenerator);
    }

}
