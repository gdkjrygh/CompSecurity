// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            NumberDeserializers

public static class rializer extends rializer
{

    static final <init> primitiveInstance = new <init>(java/lang/Character, Character.valueOf('\0'));
    static final <init> wrapperInstance;

    public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.VALUE_NUMBER_INT)
        {
            int i = jsonparser.getIntValue();
            if (i >= 0 && i <= 65535)
            {
                return Character.valueOf((char)i);
            }
        } else
        if (obj == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText();
            if (jsonparser.length() == 1)
            {
                return Character.valueOf(jsonparser.charAt(0));
            }
            if (jsonparser.length() == 0)
            {
                return (Character)getEmptyValue();
            }
        } else
        if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            obj = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
            } else
            {
                return ((Character) (obj));
            }
        }
        throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    static 
    {
        wrapperInstance = new <init>(Character.TYPE, null);
    }

    public rializer(Class class1, Character character)
    {
        super(class1, character);
    }
}
