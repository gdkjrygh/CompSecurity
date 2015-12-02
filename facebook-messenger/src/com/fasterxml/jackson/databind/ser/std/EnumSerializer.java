// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public class EnumSerializer extends StdScalarSerializer
{

    protected final EnumValues _values;

    public EnumSerializer(EnumValues enumvalues)
    {
        super(java/lang/Enum, false);
        _values = enumvalues;
    }

    public static EnumSerializer construct(Class class1, SerializationConfig serializationconfig, BeanDescription beandescription)
    {
        beandescription = serializationconfig.getAnnotationIntrospector();
        if (serializationconfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
        {
            class1 = EnumValues.constructFromToString(class1, beandescription);
        } else
        {
            class1 = EnumValues.constructFromName(class1, beandescription);
        }
        return new EnumSerializer(class1);
    }

    public EnumValues getEnumValues()
    {
        return _values;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        if (serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX))
        {
            return createSchemaNode("integer", true);
        }
        ObjectNode objectnode = createSchemaNode("string", true);
        if (type != null && serializerprovider.constructType(type).isEnumType())
        {
            serializerprovider = objectnode.putArray("enum");
            for (type = _values.values().iterator(); type.hasNext(); serializerprovider.add(((SerializedString)type.next()).getValue())) { }
        }
        return objectnode;
    }

    public final void serialize(Enum enum, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        if (serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX))
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
