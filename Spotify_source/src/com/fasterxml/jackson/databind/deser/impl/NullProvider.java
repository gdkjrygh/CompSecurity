// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;

public final class NullProvider
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final boolean _isPrimitive;
    private final Object _nullValue;
    private final Class _rawType;

    public NullProvider(JavaType javatype, Object obj)
    {
        _nullValue = obj;
        _isPrimitive = javatype.isPrimitive();
        _rawType = javatype.getRawClass();
    }

    public final Object nullValue(DeserializationContext deserializationcontext)
    {
        if (_isPrimitive && deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES))
        {
            throw deserializationcontext.mappingException((new StringBuilder("Can not map JSON null into type ")).append(_rawType.getName()).append(" (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)").toString());
        } else
        {
            return _nullValue;
        }
    }
}
