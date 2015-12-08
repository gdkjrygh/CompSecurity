// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            UnwrappingBeanSerializer, PropertySerializerMap

public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter
{

    protected final NameTransformer _nameTransformer;

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanpropertywriter, NameTransformer nametransformer)
    {
        super(beanpropertywriter);
        _nameTransformer = nametransformer;
    }

    private UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingbeanpropertywriter, NameTransformer nametransformer, SerializedString serializedstring)
    {
        super(unwrappingbeanpropertywriter, serializedstring);
        _nameTransformer = nametransformer;
    }

    protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
    {
        if (_nonTrivialBaseType != null)
        {
            propertyserializermap = serializerprovider.findValueSerializer(serializerprovider.constructSpecializedType(_nonTrivialBaseType, class1), this);
        } else
        {
            propertyserializermap = serializerprovider.findValueSerializer(class1, this);
        }
        serializerprovider = _nameTransformer;
        if (propertyserializermap.isUnwrappingSerializer())
        {
            serializerprovider = NameTransformer.chainedTransformer(serializerprovider, ((UnwrappingBeanSerializer)propertyserializermap)._nameTransformer);
        }
        propertyserializermap = propertyserializermap.unwrappingSerializer(serializerprovider);
        _dynamicSerializers = _dynamicSerializers.newWith(class1, propertyserializermap);
        return propertyserializermap;
    }

    public void assignSerializer(JsonSerializer jsonserializer)
    {
        super.assignSerializer(jsonserializer);
        if (_serializer != null)
        {
            jsonserializer = _nameTransformer;
            if (_serializer.isUnwrappingSerializer())
            {
                jsonserializer = NameTransformer.chainedTransformer(jsonserializer, ((UnwrappingBeanSerializer)_serializer)._nameTransformer);
            }
            _serializer = _serializer.unwrappingSerializer(jsonserializer);
        }
    }

    public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
    {
        return rename(nametransformer);
    }

    public UnwrappingBeanPropertyWriter rename(NameTransformer nametransformer)
    {
        String s = nametransformer.transform(_name.getValue());
        return new UnwrappingBeanPropertyWriter(this, NameTransformer.chainedTransformer(nametransformer, _nameTransformer), new SerializedString(s));
    }

    public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        Object obj1 = get(obj);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JsonSerializer jsonserializer;
        JsonSerializer jsonserializer1 = _serializer;
        jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            Class class1 = obj1.getClass();
            PropertySerializerMap propertyserializermap = _dynamicSerializers;
            JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
            }
        }
        if (_suppressableValue == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (MARKER_FOR_EMPTY != _suppressableValue)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (jsonserializer.isEmpty(obj1)) goto _L1; else goto _L3
_L3:
        if (obj1 != obj || !_handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
        {
            if (!jsonserializer.isUnwrappingSerializer())
            {
                jsongenerator.writeFieldName(_name);
            }
            if (_typeSerializer == null)
            {
                jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
                return;
            } else
            {
                jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (_suppressableValue.equals(obj1))
        {
            return;
        }
          goto _L3
        if (true) goto _L1; else goto _L4
_L4:
    }
}
