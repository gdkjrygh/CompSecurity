// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.jackson;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.ser.SerializerBase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.jackson:
//            JsonOrgJSONArraySerializer

public class JsonOrgJSONObjectSerializer extends SerializerBase
{

    public static final JsonOrgJSONObjectSerializer instance = new JsonOrgJSONObjectSerializer();

    public JsonOrgJSONObjectSerializer()
    {
        super(org/json/JSONObject);
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        throws JsonMappingException
    {
        return createSchemaNode("object", true);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((JSONObject)obj, jsongenerator, serializerprovider);
    }

    public void serialize(JSONObject jsonobject, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartObject();
        serializeContents(jsonobject, jsongenerator, serializerprovider);
        jsongenerator.writeEndObject();
    }

    protected void serializeContents(JSONObject jsonobject, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            Object obj1 = (String)iterator.next();
            Object obj;
            try
            {
                obj = jsonobject.get(((String) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new JsonGenerationException(jsonobject);
            }
            if (obj == null || obj == JSONObject.NULL)
            {
                jsongenerator.writeNullField(((String) (obj1)));
            } else
            {
                jsongenerator.writeFieldName(((String) (obj1)));
                obj1 = obj.getClass();
                if (obj1 == org/json/JSONObject || org/json/JSONObject.isAssignableFrom(((Class) (obj1))))
                {
                    serialize((JSONObject)obj, jsongenerator, serializerprovider);
                } else
                if (obj1 == org/json/JSONArray || org/json/JSONArray.isAssignableFrom(((Class) (obj1))))
                {
                    JsonOrgJSONArraySerializer.instance.serialize((JSONArray)obj, jsongenerator, serializerprovider);
                } else
                if (obj1 == java/lang/String)
                {
                    jsongenerator.writeString((String)obj);
                } else
                if (obj1 == java/lang/Integer)
                {
                    jsongenerator.writeNumber(((Integer)obj).intValue());
                } else
                if (obj1 == java/lang/Long)
                {
                    jsongenerator.writeNumber(((Long)obj).longValue());
                } else
                if (obj1 == java/lang/Boolean)
                {
                    jsongenerator.writeBoolean(((Boolean)obj).booleanValue());
                } else
                if (obj1 == java/lang/Double)
                {
                    jsongenerator.writeNumber(((Double)obj).doubleValue());
                } else
                {
                    serializerprovider.defaultSerializeValue(obj, jsongenerator);
                }
            }
        }

    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((JSONObject)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(JSONObject jsonobject, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForObject(jsonobject, jsongenerator);
        serializeContents(jsonobject, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForObject(jsonobject, jsongenerator);
    }

}
