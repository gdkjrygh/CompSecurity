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

private static final class _views extends BeanPropertyWriter
{

    protected final BeanPropertyWriter _delegate;
    protected final Class _views[];

    public final void assignNullSerializer(JsonSerializer jsonserializer)
    {
        _delegate.assignNullSerializer(jsonserializer);
    }

    public final void assignSerializer(JsonSerializer jsonserializer)
    {
        _delegate.assignSerializer(jsonserializer);
    }

    public final volatile BeanPropertyWriter rename(NameTransformer nametransformer)
    {
        return rename(nametransformer);
    }

    public final rename rename(NameTransformer nametransformer)
    {
        return new <init>(_delegate.rename(nametransformer), _views);
    }

    public final void serializeAsColumn(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Class class1 = serializerprovider.getSerializationView();
        if (class1 != null)
        {
            int i = 0;
            int j;
            for (j = _views.length; i < j && !_views[i].isAssignableFrom(class1); i++) { }
            if (i == j)
            {
                _delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
                return;
            }
        }
        _delegate.serializeAsColumn(obj, jsongenerator, serializerprovider);
    }

    public final void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        Class class1 = serializerprovider.getSerializationView();
        if (class1 != null)
        {
            int i = 0;
            int j;
            for (j = _views.length; i < j && !_views[i].isAssignableFrom(class1); i++) { }
            if (i == j)
            {
                return;
            }
        }
        _delegate.serializeAsField(obj, jsongenerator, serializerprovider);
    }

    protected (BeanPropertyWriter beanpropertywriter, Class aclass[])
    {
        super(beanpropertywriter);
        _delegate = beanpropertywriter;
        _views = aclass;
    }
}
