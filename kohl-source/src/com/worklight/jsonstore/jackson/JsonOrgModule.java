// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.jackson;

import java.io.StringWriter;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.module.SimpleModule;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.jackson:
//            JsonOrgJSONArrayDeserializer, JsonOrgJSONObjectDeserializer, JsonOrgJSONArraySerializer, JsonOrgJSONObjectSerializer

public class JsonOrgModule extends SimpleModule
{

    private static final ObjectMapper mapper;

    private JsonOrgModule()
    {
        super("JsonOrgModule", new Version(1, 0, 0, null));
        addDeserializer(org/json/JSONArray, JsonOrgJSONArrayDeserializer.instance);
        addDeserializer(org/json/JSONObject, JsonOrgJSONObjectDeserializer.instance);
        addSerializer(org/json/JSONArray, JsonOrgJSONArraySerializer.instance);
        addSerializer(org/json/JSONObject, JsonOrgJSONObjectSerializer.instance);
    }

    public static JSONArray deserializeJSONArray(String s)
        throws Throwable
    {
        return (JSONArray)mapper.readValue(s, org/json/JSONArray);
    }

    public static JSONObject deserializeJSONObject(String s)
        throws Throwable
    {
        return (JSONObject)mapper.readValue(s, org/json/JSONObject);
    }

    public static String serialize(JSONArray jsonarray)
    {
        try
        {
            StringWriter stringwriter = new StringWriter();
            mapper.writeValue(stringwriter, jsonarray);
            stringwriter.close();
            jsonarray = stringwriter.toString();
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            return null;
        }
        return jsonarray;
    }

    public static String serialize(JSONObject jsonobject)
    {
        try
        {
            StringWriter stringwriter = new StringWriter();
            mapper.writeValue(stringwriter, jsonobject);
            stringwriter.close();
            jsonobject = stringwriter.toString();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    static 
    {
        mapper = new ObjectMapper();
        mapper.registerModule(new JsonOrgModule());
    }
}
