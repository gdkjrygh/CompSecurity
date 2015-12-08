// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            FilteredBeanPropertyWriter

private static final class _view extends BeanPropertyWriter
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

    public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Class class1 = serializerprovider.getActiveView();
        if (class1 == null || _view.isAssignableFrom(class1))
        {
            _delegate.serializeAsElement(obj, jsongenerator, serializerprovider);
            return;
        } else
        {
            _delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
            return;
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Class class1 = serializerprovider.getActiveView();
        if (class1 == null || _view.isAssignableFrom(class1))
        {
            _delegate.serializeAsField(obj, jsongenerator, serializerprovider);
            return;
        } else
        {
            _delegate.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
            return;
        }
    }

    protected (BeanPropertyWriter beanpropertywriter, Class class1)
    {
        super(beanpropertywriter);
        _delegate = beanpropertywriter;
        _view = class1;
    }
}
