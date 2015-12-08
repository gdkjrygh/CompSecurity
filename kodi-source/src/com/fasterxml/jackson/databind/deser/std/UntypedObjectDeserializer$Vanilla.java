// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer, UntypedObjectDeserializer

public static class  extends StdDeserializer
{

    public static final deserialize std = new <init>();

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        switch (jsonparser.getCurrentTokenId())
        {
        case 2: // '\002'
        case 4: // '\004'
        default:
            throw deserializationcontext.mappingException(java/lang/Object);

        case 1: // '\001'
            if (jsonparser.nextToken() == JsonToken.END_OBJECT)
            {
                return new LinkedHashMap(2);
            }
            // fall through

        case 5: // '\005'
            return mapObject(jsonparser, deserializationcontext);

        case 3: // '\003'
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
                {
                    return ((Object) (UntypedObjectDeserializer.NO_OBJECTS));
                } else
                {
                    return new ArrayList(2);
                }
            }
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
            {
                return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
            } else
            {
                return mapArray(jsonparser, deserializationcontext);
            }

        case 12: // '\f'
            return jsonparser.getEmbeddedObject();

        case 6: // '\006'
            return jsonparser.getText();

        case 7: // '\007'
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
            {
                return jsonparser.getBigIntegerValue();
            } else
            {
                return jsonparser.getNumberValue();
            }

        case 8: // '\b'
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                return jsonparser.getDecimalValue();
            } else
            {
                return Double.valueOf(jsonparser.getDoubleValue());
            }

        case 9: // '\t'
            return Boolean.TRUE;

        case 10: // '\n'
            return Boolean.FALSE;

        case 11: // '\013'
            return null;
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        switch (jsonparser.getCurrentTokenId())
        {
        case 2: // '\002'
        case 4: // '\004'
        default:
            throw deserializationcontext.mappingException(java/lang/Object);

        case 1: // '\001'
        case 3: // '\003'
        case 5: // '\005'
            return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);

        case 6: // '\006'
            return jsonparser.getText();

        case 7: // '\007'
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
            {
                return jsonparser.getBigIntegerValue();
            } else
            {
                return jsonparser.getNumberValue();
            }

        case 8: // '\b'
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                return jsonparser.getDecimalValue();
            } else
            {
                return Double.valueOf(jsonparser.getDoubleValue());
            }

        case 9: // '\t'
            return Boolean.TRUE;

        case 10: // '\n'
            return Boolean.FALSE;

        case 12: // '\f'
            return jsonparser.getEmbeddedObject();

        case 11: // '\013'
            return null;
        }
    }

    protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        Object obj = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            jsonparser = new ArrayList(2);
            jsonparser.add(obj);
            return jsonparser;
        }
        Object obj1 = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            jsonparser = new ArrayList(2);
            jsonparser.add(obj);
            jsonparser.add(obj1);
            return jsonparser;
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj1[] = objectbuffer.resetAndStart();
        int j = 0 + 1;
        aobj1[0] = obj;
        int i = j + 1;
        aobj1[j] = obj1;
        j = i;
        do
        {
            Object obj2 = deserialize(jsonparser, deserializationcontext);
            int k = j + 1;
            j = i;
            Object aobj[] = aobj1;
            if (i >= aobj1.length)
            {
                aobj = objectbuffer.appendCompletedChunk(aobj1);
                j = 0;
            }
            i = j + 1;
            aobj[j] = obj2;
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                jsonparser = new ArrayList(k);
                objectbuffer.completeAndClearBuffer(aobj, i, jsonparser);
                return jsonparser;
            }
            j = k;
            aobj1 = aobj;
        } while (true);
    }

    protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj[] = objectbuffer.resetAndStart();
        int i = 0;
        do
        {
            Object obj = deserialize(jsonparser, deserializationcontext);
            int j = i;
            Object aobj1[] = aobj;
            if (i >= aobj.length)
            {
                aobj1 = objectbuffer.appendCompletedChunk(aobj);
                j = 0;
            }
            i = j + 1;
            aobj1[j] = obj;
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                return objectbuffer.completeAndClearBuffer(aobj1, i);
            }
            aobj = aobj1;
        } while (true);
    }

    protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        String s = jsonparser.getText();
        jsonparser.nextToken();
        Object obj = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_OBJECT)
        {
            jsonparser = new LinkedHashMap(2);
            jsonparser.put(s, obj);
            return jsonparser;
        }
        String s2 = jsonparser.getText();
        jsonparser.nextToken();
        Object obj1 = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_OBJECT)
        {
            jsonparser = new LinkedHashMap(4);
            jsonparser.put(s, obj);
            jsonparser.put(s2, obj1);
            return jsonparser;
        }
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        linkedhashmap.put(s, obj);
        linkedhashmap.put(s2, obj1);
        do
        {
            String s1 = jsonparser.getText();
            jsonparser.nextToken();
            linkedhashmap.put(s1, deserialize(jsonparser, deserializationcontext));
        } while (jsonparser.nextToken() != JsonToken.END_OBJECT);
        return linkedhashmap;
    }


    public ()
    {
        super(java/lang/Object);
    }
}
