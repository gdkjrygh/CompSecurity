// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
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
    public static final class Impl extends DefaultSerializerProvider
    {

        public Impl createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
        {
            return new Impl(this, serializationconfig, serializerfactory);
        }

        public volatile DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
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
        throws IOException
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
                jsongenerator = (new StringBuilder()).append("[no message for ").append(exception.getClass().getName()).append("]").toString();
            }
            throw new JsonMappingException(jsongenerator, exception);
        }
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory);

    public WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator)
    {
        Object obj1;
        ObjectIdGenerator objectidgenerator1;
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
        objectidgenerator1 = null;
        if (_objectIdGenerators != null) goto _L2; else goto _L1
_L1:
        _objectIdGenerators = new ArrayList(8);
        obj1 = objectidgenerator1;
_L4:
        objectidgenerator1 = ((ObjectIdGenerator) (obj1));
        if (obj1 == null)
        {
            objectidgenerator1 = objectidgenerator.newForSerialization(this);
            _objectIdGenerators.add(objectidgenerator1);
        }
        objectidgenerator = new WritableObjectId(objectidgenerator1);
        _seenObjectIds.put(obj, objectidgenerator);
        return objectidgenerator;
_L2:
        int i;
        int j;
        i = 0;
        j = _objectIdGenerators.size();
_L6:
        obj1 = objectidgenerator1;
        if (i >= j) goto _L4; else goto _L3
_L3:
        obj1 = (ObjectIdGenerator)_objectIdGenerators.get(i);
        if (!((ObjectIdGenerator) (obj1)).canUseFor(objectidgenerator)) goto _L5; else goto _L4
_L5:
        i++;
          goto _L6
    }

    public void serializeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        _serializeNull(jsongenerator);
_L4:
        return;
_L2:
        JsonSerializer jsonserializer = findTypedValueSerializer(obj.getClass(), true, null);
        Object obj1 = _config.getRootName();
        boolean flag;
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
            flag = true;
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
                jsongenerator = (new StringBuilder()).append("[no message for ").append(exception.getClass().getName()).append("]").toString();
            }
            throw new JsonMappingException(jsongenerator, exception);
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        jsongenerator.writeEndObject();
        return;
    }

    public JsonSerializer serializerInstance(Annotated annotated, Object obj)
        throws JsonMappingException
    {
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
                throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned serializer definition of type ").append(obj.getClass().getName()).append("; expected type JsonSerializer or Class<JsonSerializer> instead").toString());
            }
            Class class1 = (Class)obj;
            if (class1 == com/fasterxml/jackson/databind/JsonSerializer$None || ClassUtil.isBogusClass(class1))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!com/fasterxml/jackson/databind/JsonSerializer.isAssignableFrom(class1))
            {
                throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<JsonSerializer>").toString());
            }
            obj = _config.getHandlerInstantiator();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((HandlerInstantiator) (obj)).serializerInstance(_config, annotated, class1);
            }
            annotated = ((Annotated) (obj));
            if (obj == null)
            {
                annotated = (JsonSerializer)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers());
            }
        }
        return _handleResolvable(annotated);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
