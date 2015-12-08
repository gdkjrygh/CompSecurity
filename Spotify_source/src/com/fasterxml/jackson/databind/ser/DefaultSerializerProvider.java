// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            SerializerFactory

public abstract class DefaultSerializerProvider extends SerializerProvider
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    protected transient ArrayList _objectIdGenerators;
    protected transient Map _seenObjectIds;

    protected DefaultSerializerProvider()
    {
    }

    protected DefaultSerializerProvider(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
    {
        super(serializerprovider, serializationconfig, serializerfactory);
    }

    protected Map _createObjectIdMap()
    {
        if (isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID))
        {
            return new HashMap();
        } else
        {
            return new IdentityHashMap();
        }
    }

    protected void _serializeNull(JsonGenerator jsongenerator)
    {
        JsonSerializer jsonserializer = getDefaultNullValueSerializer();
        try
        {
            jsonserializer.serialize(null, jsongenerator, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            throw jsongenerator;
        }
        catch (Exception exception)
        {
            String s = exception.getMessage();
            jsongenerator = s;
            if (s == null)
            {
                jsongenerator = (new StringBuilder("[no message for ")).append(exception.getClass().getName()).append("]").toString();
            }
            throw new JsonMappingException(jsongenerator, exception);
        }
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory);

    public WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator)
    {
        Object obj1;
        if (_seenObjectIds == null)
        {
            _seenObjectIds = _createObjectIdMap();
        } else
        {
            obj1 = (WritableObjectId)_seenObjectIds.get(obj);
            if (obj1 != null)
            {
                return ((WritableObjectId) (obj1));
            }
        }
        if (_objectIdGenerators != null) goto _L2; else goto _L1
_L1:
        _objectIdGenerators = new ArrayList(8);
        obj1 = null;
_L4:
        ObjectIdGenerator objectidgenerator1 = ((ObjectIdGenerator) (obj1));
        if (obj1 == null)
        {
            objectidgenerator1 = objectidgenerator.newForSerialization(this);
            _objectIdGenerators.add(objectidgenerator1);
        }
        objectidgenerator = new WritableObjectId(objectidgenerator1);
        _seenObjectIds.put(obj, objectidgenerator);
        return objectidgenerator;
_L2:
        int j = _objectIdGenerators.size();
        for (int i = 0; i < j; i++)
        {
            ObjectIdGenerator objectidgenerator2 = (ObjectIdGenerator)_objectIdGenerators.get(i);
            obj1 = objectidgenerator2;
            if (objectidgenerator2.canUseFor(objectidgenerator))
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        obj1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void serializeValue(JsonGenerator jsongenerator, Object obj)
    {
        boolean flag = true;
        if (obj != null) goto _L2; else goto _L1
_L1:
        _serializeNull(jsongenerator);
_L4:
        return;
_L2:
        JsonSerializer jsonserializer = findTypedValueSerializer(obj.getClass(), true, null);
        Object obj1 = _config.getRootName();
        if (obj1 == null)
        {
            boolean flag1 = _config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            flag = flag1;
            if (flag1)
            {
                obj1 = _rootNames.findRootName(obj.getClass(), _config);
                jsongenerator.writeStartObject();
                jsongenerator.writeFieldName(((PropertyName) (obj1)).simpleAsEncoded(_config));
                flag = flag1;
            }
        } else
        if (((String) (obj1)).length() == 0)
        {
            flag = false;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(((String) (obj1)));
        }
        try
        {
            jsonserializer.serialize(obj, jsongenerator, this);
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            throw jsongenerator;
        }
        catch (Exception exception)
        {
            obj = exception.getMessage();
            jsongenerator = ((JsonGenerator) (obj));
            if (obj == null)
            {
                jsongenerator = (new StringBuilder("[no message for ")).append(exception.getClass().getName()).append("]").toString();
            }
            throw new JsonMappingException(jsongenerator, exception);
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        jsongenerator.writeEndObject();
        return;
    }

    public void serializeValue(JsonGenerator jsongenerator, Object obj, JavaType javatype, JsonSerializer jsonserializer)
    {
        boolean flag = true;
        if (obj != null) goto _L2; else goto _L1
_L1:
        _serializeNull(jsongenerator);
_L4:
        return;
_L2:
        if (javatype != null && !javatype.getRawClass().isAssignableFrom(obj.getClass()))
        {
            _reportIncompatibleRootType(obj, javatype);
        }
        JsonSerializer jsonserializer1 = jsonserializer;
        if (jsonserializer == null)
        {
            jsonserializer1 = findTypedValueSerializer(javatype, true, null);
        }
        jsonserializer = _config.getRootName();
        if (jsonserializer == null)
        {
            flag = _config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (flag)
            {
                jsongenerator.writeStartObject();
                if (javatype == null)
                {
                    javatype = _rootNames.findRootName(obj.getClass(), _config);
                } else
                {
                    javatype = _rootNames.findRootName(javatype, _config);
                }
                jsongenerator.writeFieldName(javatype.simpleAsEncoded(_config));
            }
        } else
        if (jsonserializer.length() == 0)
        {
            flag = false;
        } else
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(jsonserializer);
        }
        jsonserializer1.serialize(obj, jsongenerator, this);
        if (flag)
        {
            try
            {
                jsongenerator.writeEndObject();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                throw jsongenerator;
            }
            // Misplaced declaration of an exception variable
            catch (JavaType javatype)
            {
                obj = javatype.getMessage();
            }
            jsongenerator = ((JsonGenerator) (obj));
            if (obj == null)
            {
                jsongenerator = (new StringBuilder("[no message for ")).append(javatype.getClass().getName()).append("]").toString();
            }
            throw new JsonMappingException(jsongenerator, javatype);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonSerializer serializerInstance(Annotated annotated, Object obj)
    {
        Object obj1 = null;
        if (obj != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (obj instanceof JsonSerializer)
        {
            annotated = (JsonSerializer)obj;
        } else
        {
            if (!(obj instanceof Class))
            {
                throw new IllegalStateException((new StringBuilder("AnnotationIntrospector returned serializer definition of type ")).append(obj.getClass().getName()).append("; expected type JsonSerializer or Class<JsonSerializer> instead").toString());
            }
            obj = (Class)obj;
            if (obj == com/fasterxml/jackson/databind/JsonSerializer$None || ClassUtil.isBogusClass(((Class) (obj))))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!com/fasterxml/jackson/databind/JsonSerializer.isAssignableFrom(((Class) (obj))))
            {
                throw new IllegalStateException((new StringBuilder("AnnotationIntrospector returned Class ")).append(((Class) (obj)).getName()).append("; expected Class<JsonSerializer>").toString());
            }
            HandlerInstantiator handlerinstantiator = _config.getHandlerInstantiator();
            if (handlerinstantiator == null)
            {
                annotated = obj1;
            } else
            {
                annotated = handlerinstantiator.serializerInstance(_config, annotated, ((Class) (obj)));
            }
            if (annotated == null)
            {
                annotated = (JsonSerializer)ClassUtil.createInstance(((Class) (obj)), _config.canOverrideAccessModifiers());
            }
        }
        return _handleResolvable(annotated);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
