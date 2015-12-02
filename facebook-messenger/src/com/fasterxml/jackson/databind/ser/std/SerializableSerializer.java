// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public class SerializableSerializer extends StdSerializer
{

    private static final AtomicReference _mapperReference = new AtomicReference();
    public static final SerializableSerializer instance = new SerializableSerializer();

    protected SerializableSerializer()
    {
        super(com/fasterxml/jackson/databind/JsonSerializable);
    }

    private static final ObjectMapper _getObjectMapper()
    {
        com/fasterxml/jackson/databind/ser/std/SerializableSerializer;
        JVM INSTR monitorenter ;
        ObjectMapper objectmapper1 = (ObjectMapper)_mapperReference.get();
        ObjectMapper objectmapper;
        objectmapper = objectmapper1;
        if (objectmapper1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        objectmapper = new ObjectMapper();
        _mapperReference.set(objectmapper);
        com/fasterxml/jackson/databind/ser/std/SerializableSerializer;
        JVM INSTR monitorexit ;
        return objectmapper;
        Exception exception;
        exception;
        throw exception;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        String s;
        ObjectNode objectnode;
        s = null;
        objectnode = createObjectNode();
        serializerprovider = "any";
        if (type == null) goto _L2; else goto _L1
_L1:
        type = TypeFactory.rawClass(type);
        if (!type.isAnnotationPresent(com/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema)) goto _L2; else goto _L3
_L3:
        JsonSerializableSchema jsonserializableschema = (JsonSerializableSchema)type.getAnnotation(com/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema);
        type = jsonserializableschema.schemaType();
        if (!"##irrelevant".equals(jsonserializableschema.schemaObjectPropertiesDefinition()))
        {
            serializerprovider = jsonserializableschema.schemaObjectPropertiesDefinition();
        } else
        {
            serializerprovider = null;
        }
        if (!"##irrelevant".equals(jsonserializableschema.schemaItemDefinition()))
        {
            s = jsonserializableschema.schemaItemDefinition();
        }
_L5:
        objectnode.put("type", type);
        if (serializerprovider != null)
        {
            try
            {
                objectnode.put("properties", _getObjectMapper().readTree(serializerprovider));
            }
            // Misplaced declaration of an exception variable
            catch (SerializerProvider serializerprovider)
            {
                throw new JsonMappingException("Failed to parse @JsonSerializableSchema.schemaObjectPropertiesDefinition value");
            }
        }
        if (s != null)
        {
            try
            {
                objectnode.put("items", _getObjectMapper().readTree(s));
            }
            // Misplaced declaration of an exception variable
            catch (SerializerProvider serializerprovider)
            {
                throw new JsonMappingException("Failed to parse @JsonSerializableSchema.schemaItemDefinition value");
            }
        }
        return objectnode;
_L2:
        Object obj = null;
        type = serializerprovider;
        serializerprovider = obj;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void serialize(JsonSerializable jsonserializable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsonserializable.serialize(jsongenerator, serializerprovider);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((JsonSerializable)obj, jsongenerator, serializerprovider);
    }

    public final void serializeWithType(JsonSerializable jsonserializable, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        jsonserializable.serializeWithType(jsongenerator, serializerprovider, typeserializer);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((JsonSerializable)obj, jsongenerator, serializerprovider, typeserializer);
    }

}
