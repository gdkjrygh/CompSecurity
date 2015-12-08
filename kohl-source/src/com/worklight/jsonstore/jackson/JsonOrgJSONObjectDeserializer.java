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
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.jackson:
//            JacksonSerializedJSONObject, JsonOrgJSONArrayDeserializer

public class JsonOrgJSONObjectDeserializer extends StdDeserializer
{

    protected static final JsonOrgJSONObjectDeserializer instance = new JsonOrgJSONObjectDeserializer();

    protected JsonOrgJSONObjectDeserializer()
    {
        super(org/json/JSONObject);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public JSONObject deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        JacksonSerializedJSONObject jacksonserializedjsonobject;
        jacksonserializedjsonobject = new JacksonSerializedJSONObject();
        JsonToken jsontoken = jsonparser.getCurrentToken();
        obj = jsontoken;
        if (jsontoken == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
_L12:
        if (obj == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        if (obj != JsonToken.FIELD_NAME)
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.FIELD_NAME, "");
        }
        JsonToken jsontoken1;
        obj = jsonparser.getCurrentName();
        jsontoken1 = jsonparser.nextToken();
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

        _cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsontoken1.ordinal()];
        JVM INSTR tableswitch 1 9: default 276
    //                   1 144
    //                   2 162
    //                   3 178
    //                   4 192
    //                   5 205
    //                   6 218
    //                   7 232
    //                   8 246
    //                   9 260;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_260;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L13:
        obj = jsonparser.nextToken();
        if (true) goto _L12; else goto _L11
_L11:
        try
        {
            jacksonserializedjsonobject.put(((String) (obj)), JsonOrgJSONArrayDeserializer.instance.deserialize(jsonparser, deserializationcontext));
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw deserializationcontext.mappingException(jsonparser.getMessage());
        }
          goto _L13
_L3:
        jacksonserializedjsonobject.put(((String) (obj)), deserialize(jsonparser, deserializationcontext));
          goto _L13
_L4:
        jacksonserializedjsonobject.put(((String) (obj)), jsonparser.getEmbeddedObject());
          goto _L13
_L5:
        jacksonserializedjsonobject.put(((String) (obj)), Boolean.FALSE);
          goto _L13
_L6:
        jacksonserializedjsonobject.put(((String) (obj)), JSONObject.NULL);
          goto _L13
_L7:
        jacksonserializedjsonobject.put(((String) (obj)), jsonparser.getNumberValue());
          goto _L13
_L8:
        jacksonserializedjsonobject.put(((String) (obj)), jsonparser.getNumberValue());
          goto _L13
_L9:
        jacksonserializedjsonobject.put(((String) (obj)), jsonparser.getText());
          goto _L13
        jacksonserializedjsonobject.put(((String) (obj)), Boolean.TRUE);
          goto _L13
        return jacksonserializedjsonobject;
    }

}
