// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            ContextualSerializer, PropertyFilter

public class AnyGetterWriter
{

    protected final AnnotatedMember _accessor;
    protected MapSerializer _mapSerializer;
    protected final BeanProperty _property;
    protected JsonSerializer _serializer;

    public AnyGetterWriter(BeanProperty beanproperty, AnnotatedMember annotatedmember, JsonSerializer jsonserializer)
    {
        _accessor = annotatedmember;
        _property = beanproperty;
        _serializer = jsonserializer;
        if (jsonserializer instanceof MapSerializer)
        {
            _mapSerializer = (MapSerializer)jsonserializer;
        }
    }

    public void getAndFilter(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyFilter propertyfilter)
        throws Exception
    {
        obj = _accessor.getValue(obj);
        if (obj == null)
        {
            return;
        }
        if (!(obj instanceof Map))
        {
            throw new JsonMappingException((new StringBuilder()).append("Value returned by 'any-getter' (").append(_accessor.getName()).append("()) not java.util.Map but ").append(obj.getClass().getName()).toString());
        }
        if (_mapSerializer != null)
        {
            _mapSerializer.serializeFilteredFields((Map)obj, jsongenerator, serializerprovider, propertyfilter, null);
            return;
        } else
        {
            _serializer.serialize(obj, jsongenerator, serializerprovider);
            return;
        }
    }

    public void getAndSerialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        obj = _accessor.getValue(obj);
        if (obj == null)
        {
            return;
        }
        if (!(obj instanceof Map))
        {
            throw new JsonMappingException((new StringBuilder()).append("Value returned by 'any-getter' (").append(_accessor.getName()).append("()) not java.util.Map but ").append(obj.getClass().getName()).toString());
        }
        if (_mapSerializer != null)
        {
            _mapSerializer.serializeFields((Map)obj, jsongenerator, serializerprovider);
            return;
        } else
        {
            _serializer.serialize(obj, jsongenerator, serializerprovider);
            return;
        }
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_serializer instanceof ContextualSerializer)
        {
            serializerprovider = serializerprovider.handlePrimaryContextualization(_serializer, _property);
            _serializer = serializerprovider;
            if (serializerprovider instanceof MapSerializer)
            {
                _mapSerializer = (MapSerializer)serializerprovider;
            }
        }
    }
}
