// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            ObjectIdWriter

public class BeanAsArraySerializer extends BeanSerializerBase
{

    protected final BeanSerializerBase _defaultSerializer;

    public BeanAsArraySerializer(BeanSerializerBase beanserializerbase)
    {
        super(beanserializerbase, (ObjectIdWriter)null);
        _defaultSerializer = beanserializerbase;
    }

    protected BeanAsArraySerializer(BeanSerializerBase beanserializerbase, String as[])
    {
        super(beanserializerbase, as);
        _defaultSerializer = beanserializerbase;
    }

    protected BeanSerializerBase asArraySerializer()
    {
        return this;
    }

    public boolean isUnwrappingSerializer()
    {
        return false;
    }

    public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeStartArray();
        serializeAsArray(obj, jsongenerator, serializerprovider);
        jsongenerator.writeEndArray();
    }

    protected final void serializeAsArray(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        BeanPropertyWriter abeanpropertywriter[];
        BeanPropertyWriter beanpropertywriter;
        int i;
        int j;
        int k;
        int l;
        if (_filteredProps != null && serializerprovider.getSerializationView() != null)
        {
            abeanpropertywriter = _filteredProps;
        } else
        {
            abeanpropertywriter = _props;
        }
        j = 0;
        k = 0;
        i = 0;
        l = abeanpropertywriter.length;
_L2:
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        beanpropertywriter = abeanpropertywriter[i];
        if (beanpropertywriter != null)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        k = i;
        jsongenerator.writeNull();
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        j = i;
        k = i;
        beanpropertywriter.serializeAsColumn(obj, jsongenerator, serializerprovider);
          goto _L3
        Exception exception;
        exception;
        if (j == abeanpropertywriter.length)
        {
            jsongenerator = "[anySetter]";
        } else
        {
            jsongenerator = abeanpropertywriter[j].getName();
        }
        wrapAndThrow(serializerprovider, exception, obj, jsongenerator);
        return;
        jsongenerator;
        serializerprovider = new JsonMappingException("Infinite recursion (StackOverflowError)");
        if (k == abeanpropertywriter.length)
        {
            jsongenerator = "[anySetter]";
        } else
        {
            jsongenerator = abeanpropertywriter[k].getName();
        }
        serializerprovider.prependPath(new com.fasterxml.jackson.databind.JsonMappingException.Reference(obj, jsongenerator));
        throw serializerprovider;
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        _defaultSerializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
    }

    public String toString()
    {
        return (new StringBuilder()).append("BeanAsArraySerializer for ").append(handledType().getName()).toString();
    }

    public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
    {
        return _defaultSerializer.unwrappingSerializer(nametransformer);
    }

    protected BeanAsArraySerializer withIgnorals(String as[])
    {
        return new BeanAsArraySerializer(this, as);
    }

    protected volatile BeanSerializerBase withIgnorals(String as[])
    {
        return withIgnorals(as);
    }

    public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter)
    {
        return _defaultSerializer.withObjectIdWriter(objectidwriter);
    }
}
