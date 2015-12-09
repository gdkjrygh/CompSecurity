// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;

public class rializer extends rializer
{

    private static final <init> primitiveInstance = new <init>(java/lang/Character, Character.valueOf('\0'));
    private static final long serialVersionUID = 1L;
    private static final <init> wrapperInstance;

    public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.VALUE_NUMBER_INT) goto _L2; else goto _L1
_L1:
        int i = jsonparser.getIntValue();
        if (i < 0 || i > 65535)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = Character.valueOf((char)i);
_L4:
        return ((Character) (obj));
_L2:
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
            break MISSING_BLOCK_LABEL_158;
        }
        if (obj != JsonToken.START_ARRAY || !deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        jsonparser.nextToken();
        obj = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_ARRAY) goto _L4; else goto _L3
_L3:
        throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder("Attempted to unwrap single value array for single '")).append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
        throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
