// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.common.a.jf;

// Referenced classes of package com.fasterxml.jackson.datatype.guava.deser:
//            GuavaCollectionDeserializer

abstract class GuavaMultisetDeserializer extends GuavaCollectionDeserializer
{

    GuavaMultisetDeserializer(CollectionType collectiontype, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        super(collectiontype, typedeserializer, jsondeserializer);
    }

    protected jf _deserializeContents(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonDeserializer jsondeserializer = _valueDeserializer;
        TypeDeserializer typedeserializer = _typeDeserializerForValue;
        jf jf1 = createMultiset();
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj != JsonToken.END_ARRAY)
            {
                if (obj == JsonToken.VALUE_NULL)
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
                jf1.add(obj);
            } else
            {
                return jf1;
            }
        } while (true);
    }

    protected volatile Object _deserializeContents(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _deserializeContents(jsonparser, deserializationcontext);
    }

    protected abstract jf createMultiset();
}
