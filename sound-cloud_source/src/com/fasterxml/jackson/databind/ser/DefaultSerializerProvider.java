// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.IdentityHashMap;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            SerializerFactory

public abstract class DefaultSerializerProvider extends SerializerProvider
    implements Serializable
{
    public static final class Impl extends DefaultSerializerProvider
    {

        public final Impl createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
        {
            return new Impl(this, serializationconfig, serializerfactory);
        }

        public final volatile DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
        {
            return createInstance(serializationconfig, serializerfactory);
        }

        public Impl()
        {
        }

        protected Impl(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
        {
            super(serializerprovider, serializationconfig, serializerfactory);
        }
    }


    protected transient ArrayList _objectIdGenerators;
    protected transient IdentityHashMap _seenObjectIds;

    protected DefaultSerializerProvider()
    {
    }

    protected DefaultSerializerProvider(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
    {
        super(serializerprovider, serializationconfig, serializerfactory);
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory);

    public WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator)
    {
        Object obj1;
        if (_seenObjectIds == null)
        {
            _seenObjectIds = new IdentityHashMap();
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

    public ObjectIdGenerator objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectidinfo)
        throws JsonMappingException
    {
        Class class1 = objectidinfo.getGeneratorType();
        Object obj = _config.getHandlerInstantiator();
        if (obj == null)
        {
            annotated = null;
        } else
        {
            annotated = ((HandlerInstantiator) (obj)).objectIdGeneratorInstance(_config, annotated, class1);
        }
        obj = annotated;
        if (annotated == null)
        {
            obj = (ObjectIdGenerator)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers());
        }
        return ((ObjectIdGenerator) (obj)).forScope(objectidinfo.getScope());
    }

    public void serializeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonGenerationException
    {
        boolean flag = false;
        if (obj != null) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer = getDefaultNullValueSerializer();
_L4:
        String s;
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
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        jsongenerator.writeEndObject();
        return;
_L2:
        jsonserializer = findTypedValueSerializer(obj.getClass(), true, null);
        s = _config.getRootName();
        if (s == null)
        {
            flag = _config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (flag)
            {
                jsongenerator.writeStartObject();
                jsongenerator.writeFieldName(_rootNames.findRootName(obj.getClass(), _config));
            }
        } else
        if (s.length() != 0)
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(s);
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonSerializer serializerInstance(Annotated annotated, Object obj)
        throws JsonMappingException
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
            if (obj == com/fasterxml/jackson/databind/JsonSerializer$None || obj == com/fasterxml/jackson/databind/annotation/NoClass)
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
