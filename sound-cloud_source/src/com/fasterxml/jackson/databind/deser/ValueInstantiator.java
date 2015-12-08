// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            SettableBeanProperty

public abstract class ValueInstantiator
{

    public ValueInstantiator()
    {
    }

    public boolean canCreateFromBoolean()
    {
        return false;
    }

    public boolean canCreateFromDouble()
    {
        return false;
    }

    public boolean canCreateFromInt()
    {
        return false;
    }

    public boolean canCreateFromLong()
    {
        return false;
    }

    public boolean canCreateFromObjectWith()
    {
        return false;
    }

    public boolean canCreateFromString()
    {
        return false;
    }

    public boolean canCreateUsingDefault()
    {
        return getDefaultCreator() != null;
    }

    public boolean canCreateUsingDelegate()
    {
        return false;
    }

    public boolean canInstantiate()
    {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public Object createFromBoolean(DeserializationContext deserializationcontext, boolean flag)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from Boolean value").toString());
    }

    public Object createFromDouble(DeserializationContext deserializationcontext, double d)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from Floating-point number (double)").toString());
    }

    public Object createFromInt(DeserializationContext deserializationcontext, int i)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from Integer number (int)").toString());
    }

    public Object createFromLong(DeserializationContext deserializationcontext, long l)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from Integer number (long)").toString());
    }

    public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" with arguments").toString());
    }

    public Object createFromString(DeserializationContext deserializationcontext, String s)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" from String value").toString());
    }

    public Object createUsingDefault(DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append("; no default creator found").toString());
    }

    public Object createUsingDelegate(DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder("Can not instantiate value of type ")).append(getValueTypeDesc()).append(" using delegate").toString());
    }

    public AnnotatedWithParams getDefaultCreator()
    {
        return null;
    }

    public AnnotatedWithParams getDelegateCreator()
    {
        return null;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationconfig)
    {
        return null;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
    {
        return null;
    }

    public abstract String getValueTypeDesc();
}
