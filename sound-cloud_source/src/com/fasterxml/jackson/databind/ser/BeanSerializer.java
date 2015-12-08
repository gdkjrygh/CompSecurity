// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BeanSerializerBuilder, BeanPropertyWriter

public class BeanSerializer extends BeanSerializerBase
{

    public BeanSerializer(JavaType javatype, BeanSerializerBuilder beanserializerbuilder, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
    {
        super(javatype, beanserializerbuilder, abeanpropertywriter, abeanpropertywriter1);
    }

    protected BeanSerializer(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter)
    {
        super(beanserializerbase, objectidwriter);
    }

    protected BeanSerializer(BeanSerializerBase beanserializerbase, String as[])
    {
        super(beanserializerbase, as);
    }

    public static BeanSerializer createDummy(JavaType javatype)
    {
        return new BeanSerializer(javatype, null, NO_PROPS, null);
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
        throws IOException, JsonGenerationException
    {
        if (_objectIdWriter != null)
        {
            serializeWithObjectId(obj, jsongenerator, serializerprovider);
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

    protected BeanSerializer withIgnorals(String as[])
    {
        return new BeanSerializer(this, as);
    }

    protected volatile BeanSerializerBase withIgnorals(String as[])
    {
        return withIgnorals(as);
    }

    public BeanSerializer withObjectIdWriter(ObjectIdWriter objectidwriter)
    {
        return new BeanSerializer(this, objectidwriter);
    }

    public volatile BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter)
    {
        return withObjectIdWriter(objectidwriter);
    }
}
