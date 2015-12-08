// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdKeyDeserializer

static final class _delegate extends KeyDeserializer
    implements Serializable
{

    protected final JsonDeserializer _delegate;
    protected final Class _keyClass;

    public final Object deserializeKey(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        if (s == null)
        {
            obj = null;
        } else
        {
            Object obj1;
            try
            {
                obj1 = _delegate.deserialize(deserializationcontext.getParser(), deserializationcontext);
            }
            catch (Exception exception)
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder()).append("not a valid representation: ").append(exception.getMessage()).toString());
            }
            obj = obj1;
            if (obj1 == null)
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "not a valid representation");
            }
        }
        return obj;
    }

    protected (Class class1, JsonDeserializer jsondeserializer)
    {
        _keyClass = class1;
        _delegate = jsondeserializer;
    }
}
