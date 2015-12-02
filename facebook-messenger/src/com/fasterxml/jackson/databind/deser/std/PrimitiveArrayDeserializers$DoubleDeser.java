// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

final class  extends 
{

    private final double[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
        {
            return null;
        }
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_valueClass);
        } else
        {
            return (new double[] {
                _parseDoublePrimitive(jsonparser, deserializationcontext)
            });
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public double[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        com.fasterxml.jackson.databind.util.eser eser = deserializationcontext.getArrayBuilders().getDoubleBuilder();
        double ad[] = (double[])eser.t();
        int i;
        int j;
        for (i = 0; jsonparser.nextToken() != JsonToken.END_ARRAY; i = j)
        {
            double d = _parseDoublePrimitive(jsonparser, deserializationcontext);
            if (i >= ad.length)
            {
                ad = (double[])eser.tedChunk(ad, i);
                i = 0;
            }
            j = i + 1;
            ad[i] = d;
        }

        return (double[])eser.learBuffer(ad, i);
    }

    public ()
    {
        super([D);
    }
}
