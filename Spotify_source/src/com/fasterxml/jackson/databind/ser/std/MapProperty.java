// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

public class MapProperty extends PropertyWriter
{

    protected Object _key;
    protected JsonSerializer _keySerializer;
    protected TypeSerializer _typeSerializer;
    protected Object _value;
    protected JsonSerializer _valueSerializer;

    public MapProperty(TypeSerializer typeserializer)
    {
        _typeSerializer = typeserializer;
    }

    public void reset(Object obj, Object obj1, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
    {
        _key = obj;
        _value = obj1;
        _keySerializer = jsonserializer;
        _valueSerializer = jsonserializer1;
    }
}
