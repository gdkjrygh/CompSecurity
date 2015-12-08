// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BeanSerializerBuilder, BeanPropertyWriter

public class BeanSerializer extends BeanSerializerBase
{

    public BeanSerializer(JavaType javatype, BeanSerializerBuilder beanserializerbuilder, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
    {
        super(javatype, beanserializerbuilder, abeanpropertywriter, abeanpropertywriter1);
    }

    protected BeanSerializer(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter, Object obj)
    {
        super(beanserializerbase, objectidwriter, obj);
    }

    protected BeanSerializer(BeanSerializerBase beanserializerbase, String as[])
    {
        super(beanserializerbase, as);
    }

    public static BeanSerializer createDummy(JavaType javatype)
    {
        return new BeanSerializer(javatype, null, NO_PROPS, null);
    }

    protected BeanSerializerBase asArraySerializer()
    {
        Object obj = this;
        if (_objectIdWriter == null)
        {
            obj = this;
            if (_anyGetterWriter == null)
            {
                obj = this;
                if (_propertyFilterId == null)
                {
                    obj = new BeanAsArraySerializer(this);
                }
            }
        }
        return ((BeanSerializerBase) (obj));
    }

    public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (_objectIdWriter != null)
        {
            _serializeWithObjectId(obj, jsongenerator, serializerprovider, true);
            return;
        }
        jsongenerator.writeStartObject();
        if (_propertyFilterId != null)
        {
            serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
        } else
        {
            serializeFields(obj, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndObject();
    }

    public String toString()
    {
        return (new StringBuilder("BeanSerializer for ")).append(handledType().getName()).toString();
    }

    public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
    {
        return new UnwrappingBeanSerializer(this, nametransformer);
    }

    protected BeanSerializerBase withFilterId(Object obj)
    {
        return new BeanSerializer(this, _objectIdWriter, obj);
    }

    protected BeanSerializerBase withIgnorals(String as[])
    {
        return new BeanSerializer(this, as);
    }

    public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter)
    {
        return new BeanSerializer(this, objectidwriter, _propertyFilterId);
    }
}
