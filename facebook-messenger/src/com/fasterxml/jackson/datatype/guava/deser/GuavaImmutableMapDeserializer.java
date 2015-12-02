// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.google.common.a.ev;
import com.google.common.a.ew;

// Referenced classes of package com.fasterxml.jackson.datatype.guava.deser:
//            GuavaMapDeserializer

abstract class GuavaImmutableMapDeserializer extends GuavaMapDeserializer
{

    GuavaImmutableMapDeserializer(MapType maptype, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(maptype, keydeserializer, typedeserializer, jsondeserializer);
    }

    protected ev _deserializeEntries(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        KeyDeserializer keydeserializer = _keyDeserializer;
        JsonDeserializer jsondeserializer = _valueDeserializer;
        TypeDeserializer typedeserializer = _typeDeserializerForValue;
        ew ew1 = createBuilder();
        while (jsonparser.getCurrentToken() == JsonToken.FIELD_NAME) 
        {
            Object obj1 = jsonparser.getCurrentName();
            Object obj;
            if (keydeserializer != null)
            {
                obj1 = keydeserializer.deserializeKey(((String) (obj1)), deserializationcontext);
            }
            if (jsonparser.nextToken() == JsonToken.VALUE_NULL)
            {
                obj = null;
            } else
            if (typedeserializer == null)
            {
                obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
            } else
            {
                obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
            }
            ew1.b(obj1, obj);
            jsonparser.nextToken();
        }
        return ew1.b();
    }

    protected volatile Object _deserializeEntries(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _deserializeEntries(jsonparser, deserializationcontext);
    }

    protected abstract ew createBuilder();
}
