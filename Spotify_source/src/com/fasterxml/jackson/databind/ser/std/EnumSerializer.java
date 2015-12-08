// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public class EnumSerializer extends StdScalarSerializer
    implements ContextualSerializer
{

    protected final Boolean _serializeAsIndex;
    protected final EnumValues _values;

    public EnumSerializer(EnumValues enumvalues, Boolean boolean1)
    {
        super(java/lang/Enum, false);
        _values = enumvalues;
        _serializeAsIndex = boolean1;
    }

    protected static Boolean _isShapeWrittenUsingIndex(Class class1, com.fasterxml.jackson.annotation.JsonFormat.Value value, boolean flag)
    {
        if (value == null)
        {
            value = null;
        } else
        {
            value = value.getShape();
        }
        while (value == null || value == com.fasterxml.jackson.annotation.JsonFormat.Shape.ANY || value == com.fasterxml.jackson.annotation.JsonFormat.Shape.SCALAR) 
        {
            return null;
        }
        if (value == com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
        {
            return Boolean.FALSE;
        }
        if (value.isNumeric())
        {
            return Boolean.TRUE;
        }
        value = (new StringBuilder("Unsupported serialization shape (")).append(value).append(") for Enum ").append(class1.getName()).append(", not supported as ");
        if (flag)
        {
            class1 = "class";
        } else
        {
            class1 = "property";
        }
        throw new IllegalArgumentException(value.append(class1).append(" annotation").toString());
    }

    public static EnumSerializer construct(Class class1, SerializationConfig serializationconfig, BeanDescription beandescription, com.fasterxml.jackson.annotation.JsonFormat.Value value)
    {
        return new EnumSerializer(EnumValues.construct(serializationconfig, class1), _isShapeWrittenUsingIndex(class1, value, true));
    }

    protected final boolean _serializeAsIndex(SerializerProvider serializerprovider)
    {
        if (_serializeAsIndex != null)
        {
            return _serializeAsIndex.booleanValue();
        } else
        {
            return serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
        }
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        EnumSerializer enumserializer = this;
        if (beanproperty != null)
        {
            serializerprovider = serializerprovider.getAnnotationIntrospector().findFormat(beanproperty.getMember());
            enumserializer = this;
            if (serializerprovider != null)
            {
                serializerprovider = _isShapeWrittenUsingIndex(beanproperty.getType().getRawClass(), serializerprovider, false);
                enumserializer = this;
                if (serializerprovider != _serializeAsIndex)
                {
                    enumserializer = new EnumSerializer(_values, serializerprovider);
                }
            }
        }
        return enumserializer;
    }

    public EnumValues getEnumValues()
    {
        return _values;
    }

    public final void serialize(Enum enum, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (_serializeAsIndex(serializerprovider))
        {
            jsongenerator.writeNumber(enum.ordinal());
            return;
        } else
        {
            jsongenerator.writeString(_values.serializedValueFor(enum));
            return;
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((Enum)obj, jsongenerator, serializerprovider);
    }
}
