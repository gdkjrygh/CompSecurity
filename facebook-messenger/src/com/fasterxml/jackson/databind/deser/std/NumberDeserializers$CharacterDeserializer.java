// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;

public final class rializer extends rializer
{

    public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT)
        {
            int i = jsonparser.getIntValue();
            if (i >= 0 && i <= 65535)
            {
                return Character.valueOf((char)i);
            }
        } else
        if (jsontoken == JsonToken.VALUE_STRING)
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
        }
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public rializer(Class class1, Character character)
    {
        super(class1, character);
    }
}
