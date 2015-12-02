// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.KeyDeserializer;

public abstract class StdKeyDeserializer extends KeyDeserializer
{

    protected final Class _keyClass;

    protected StdKeyDeserializer(Class class1)
    {
        _keyClass = class1;
    }

    protected abstract Object _parse(String s, DeserializationContext deserializationcontext);

    protected double _parseDouble(String s)
    {
        return NumberInput.parseDouble(s);
    }

    protected int _parseInt(String s)
    {
        return Integer.parseInt(s);
    }

    protected long _parseLong(String s)
    {
        return Long.parseLong(s);
    }

    public final Object deserializeKey(String s, DeserializationContext deserializationcontext)
    {
        if (s != null)
        {
            Object obj;
            try
            {
                obj = _parse(s, deserializationcontext);
            }
            catch (Exception exception)
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, (new StringBuilder()).append("not a valid representation: ").append(exception.getMessage()).toString());
            }
            if (obj != null)
            {
                return obj;
            }
            if (!_keyClass.isEnum() || !deserializationcontext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
            {
                throw deserializationcontext.weirdKeyException(_keyClass, s, "not a valid representation");
            }
        }
        return null;
    }

    public Class getKeyClass()
    {
        return _keyClass;
    }
}
