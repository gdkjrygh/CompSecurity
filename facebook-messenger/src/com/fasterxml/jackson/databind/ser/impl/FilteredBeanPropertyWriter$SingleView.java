// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

final class _view extends BeanPropertyWriter
{

    protected final BeanPropertyWriter _delegate;
    protected final Class _view;

    public void assignNullSerializer(JsonSerializer jsonserializer)
    {
        _delegate.assignNullSerializer(jsonserializer);
    }

    public void assignSerializer(JsonSerializer jsonserializer)
    {
        _delegate.assignSerializer(jsonserializer);
    }

    public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
    {
        return rename(nametransformer);
    }

    public rename rename(NameTransformer nametransformer)
    {
        return new <init>(_delegate.rename(nametransformer), _view);
    }

    public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        Class class1 = serializerprovider.getSerializationView();
        if (class1 == null || _view.isAssignableFrom(class1))
        {
            _delegate.serializeAsField(obj, jsongenerator, serializerprovider);
        }
    }

    protected (BeanPropertyWriter beanpropertywriter, Class class1)
    {
        super(beanpropertywriter);
        _delegate = beanpropertywriter;
        _view = class1;
    }
}
