// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.jackson;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.deser.StdDeserializer;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.jackson:
//            JacksonSerializedJSONArray, JsonOrgJSONObjectDeserializer

public class JsonOrgJSONArrayDeserializer extends StdDeserializer
{

    protected static final JsonOrgJSONArrayDeserializer instance = new JsonOrgJSONArrayDeserializer();

    protected JsonOrgJSONArrayDeserializer()
    {
        super(org/json/JSONArray);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public JSONArray deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken;
        JacksonSerializedJSONArray jacksonserializedjsonarray;
        jacksonserializedjsonarray = new JacksonSerializedJSONArray();
        jsontoken = jsonparser.nextToken();
_L12:
        if (jsontoken == JsonToken.END_ARRAY)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        static class _cls1
        {

            static final int $SwitchMap$org$codehaus$jackson$JsonToken[];

            static 
            {
                $SwitchMap$org$codehaus$jackson$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.START_ARRAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.START_OBJECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.END_OBJECT.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.NOT_AVAILABLE.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsontoken.ordinal()];
        JVM INSTR tableswitch 1 9: default 80
    //                   1 88
    //                   2 103
    //                   3 120
    //                   4 133
    //                   5 145
    //                   6 157
    //                   7 170
    //                   8 183
    //                   9 196;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_196;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L13:
        jsontoken = jsonparser.nextToken();
        if (true) goto _L12; else goto _L11
_L11:
        jacksonserializedjsonarray.put(deserialize(jsonparser, deserializationcontext));
          goto _L13
_L3:
        jacksonserializedjsonarray.put(JsonOrgJSONObjectDeserializer.instance.deserialize(jsonparser, deserializationcontext));
          goto _L13
_L4:
        jacksonserializedjsonarray.put(jsonparser.getEmbeddedObject());
          goto _L13
_L5:
        jacksonserializedjsonarray.put(Boolean.FALSE);
          goto _L13
_L6:
        jacksonserializedjsonarray.put(JSONObject.NULL);
          goto _L13
_L7:
        jacksonserializedjsonarray.put(jsonparser.getNumberValue());
          goto _L13
_L8:
        jacksonserializedjsonarray.put(jsonparser.getNumberValue());
          goto _L13
_L9:
        jacksonserializedjsonarray.put(jsonparser.getText());
          goto _L13
        jacksonserializedjsonarray.put(Boolean.TRUE);
          goto _L13
        return jacksonserializedjsonarray;
    }

}
