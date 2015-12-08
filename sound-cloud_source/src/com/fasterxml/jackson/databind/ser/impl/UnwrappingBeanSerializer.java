// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            ObjectIdWriter, WritableObjectId

public class UnwrappingBeanSerializer extends BeanSerializerBase
{

    protected final NameTransformer _nameTransformer;

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingbeanserializer, ObjectIdWriter objectidwriter)
    {
        super(unwrappingbeanserializer, objectidwriter);
        _nameTransformer = unwrappingbeanserializer._nameTransformer;
    }

    protected UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingbeanserializer, String as[])
    {
        super(unwrappingbeanserializer, as);
        _nameTransformer = unwrappingbeanserializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(BeanSerializerBase beanserializerbase, NameTransformer nametransformer)
    {
        super(beanserializerbase, nametransformer);
        _nameTransformer = nametransformer;
    }

    private final void serializeWithObjectId(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        ObjectIdWriter objectidwriter = _objectIdWriter;
        Object obj1 = serializerprovider.findObjectId(obj, objectidwriter.generator);
        Object obj2 = ((WritableObjectId) (obj1)).id;
        if (obj2 != null)
        {
            ((WritableObjectId) (obj1)).serializer.serialize(obj2, jsongenerator, serializerprovider);
            return;
        }
        obj1.serializer = objectidwriter.serializer;
        obj2 = ((WritableObjectId) (obj1)).generator.generateId(obj);
        obj1.id = obj2;
        if (objectidwriter.alwaysAsId)
        {
            ((WritableObjectId) (obj1)).serializer.serialize(obj2, jsongenerator, serializerprovider);
            return;
        }
        jsongenerator.writeStartObject();
        obj1 = objectidwriter.propertyName;
        if (obj1 != null)
        {
            jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (obj1)));
            objectidwriter.serializer.serialize(obj2, jsongenerator, serializerprovider);
        }
        if (_propertyFilterId != null)
        {
            serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
        } else
        {
            serializeFields(obj, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndObject();
    }

    protected BeanSerializerBase asArraySerializer()
    {
        return this;
    }

    public boolean isUnwrappingSerializer()
    {
        return true;
    }

    public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_objectIdWriter != null)
        {
            serializeWithObjectId(obj, jsongenerator, serializerprovider);
            return;
        }
        if (_propertyFilterId != null)
        {
            serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
            return;
        } else
        {
            serializeFields(obj, jsongenerator, serializerprovider);
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("UnwrappingBeanSerializer for ")).append(handledType().getName()).toString();
    }

    public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
    {
        return new UnwrappingBeanSerializer(this, nametransformer);
    }

    protected UnwrappingBeanSerializer withIgnorals(String as[])
    {
        return new UnwrappingBeanSerializer(this, as);
    }

    protected volatile BeanSerializerBase withIgnorals(String as[])
    {
        return withIgnorals(as);
    }

    public UnwrappingBeanSerializer withObjectIdWriter(ObjectIdWriter objectidwriter)
    {
        return new UnwrappingBeanSerializer(this, objectidwriter);
    }

    public volatile BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter)
    {
        return withObjectIdWriter(objectidwriter);
    }
}
