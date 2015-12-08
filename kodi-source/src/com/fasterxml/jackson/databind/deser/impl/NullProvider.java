// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;

public final class NullProvider
    implements Serializable
{

    private final boolean _isPrimitive;
    private final Object _nullValue;
    private final Class _rawType;

    public NullProvider(JavaType javatype, Object obj)
    {
        _nullValue = obj;
        _isPrimitive = javatype.isPrimitive();
        _rawType = javatype.getRawClass();
    }

    public Object nullValue(DeserializationContext deserializationcontext)
        throws JsonProcessingException
    {
        if (_isPrimitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
        {
            throw deserializationcontext.mappingException((new StringBuilder()).append("Can not map JSON null into type ").append(_rawType.getName()).append(" (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)").toString());
        } else
        {
            return _nullValue;
        }
    }
}
