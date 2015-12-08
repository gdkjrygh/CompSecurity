// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            UnresolvedForwardReference, ResolvableDeserializer, DeserializerFactory, DeserializerCache

public abstract class DefaultDeserializationContext extends DeserializationContext
    implements Serializable
{
    public static final class Impl extends DefaultDeserializationContext
    {

        public DefaultDeserializationContext createInstance(DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
        {
            return new Impl(this, deserializationconfig, jsonparser, injectablevalues);
        }

        protected Impl(Impl impl, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
        {
            super(impl, deserializationconfig, jsonparser, injectablevalues);
        }

        public Impl(DeserializerFactory deserializerfactory)
        {
            super(deserializerfactory, null);
        }
    }


    private List _objectIdResolvers;
    protected transient LinkedHashMap _objectIds;

    protected DefaultDeserializationContext(DefaultDeserializationContext defaultdeserializationcontext, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
    {
        super(defaultdeserializationcontext, deserializationconfig, jsonparser, injectablevalues);
    }

    protected DefaultDeserializationContext(DeserializerFactory deserializerfactory, DeserializerCache deserializercache)
    {
        super(deserializerfactory, deserializercache);
    }

    public void checkUnresolvedObjectId()
        throws UnresolvedForwardReference
    {
_L2:
        return;
        if (_objectIds == null || !isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = null;
        Iterator iterator = _objectIds.entrySet().iterator();
        do
        {
            ReadableObjectId readableobjectid;
            do
            {
                if (!iterator.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                readableobjectid = (ReadableObjectId)((java.util.Map.Entry)iterator.next()).getValue();
            } while (!readableobjectid.hasReferringProperties());
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = new UnresolvedForwardReference("Unresolved forward references for: ");
            }
            Iterator iterator1 = readableobjectid.referringProperties();
            do
            {
                obj1 = obj;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj1 = (com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring)iterator1.next();
                ((UnresolvedForwardReference) (obj)).addUnresolvedId(readableobjectid.getKey().key, ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (obj1)).getBeanType(), ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (obj1)).getLocation());
            } while (true);
        } while (true);
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        throw obj1;
    }

    public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues);

    public JsonDeserializer deserializerInstance(Annotated annotated, Object obj)
        throws JsonMappingException
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = obj2;
_L4:
        return ((JsonDeserializer) (obj));
_L2:
        if (!(obj instanceof JsonDeserializer))
        {
            break; /* Loop/switch isn't completed */
        }
        annotated = (JsonDeserializer)obj;
_L7:
        obj = annotated;
        if (annotated instanceof ResolvableDeserializer)
        {
            ((ResolvableDeserializer)annotated).resolve(this);
            return annotated;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Class class1;
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned deserializer definition of type ").append(obj.getClass().getName()).append("; expected type JsonDeserializer or Class<JsonDeserializer> instead").toString());
        }
        class1 = (Class)obj;
        obj = obj2;
        if (class1 == com/fasterxml/jackson/databind/JsonDeserializer$None) goto _L4; else goto _L5
_L5:
        obj = obj2;
        if (ClassUtil.isBogusClass(class1)) goto _L4; else goto _L6
_L6:
        if (!com/fasterxml/jackson/databind/JsonDeserializer.isAssignableFrom(class1))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<JsonDeserializer>").toString());
        }
        obj = _config.getHandlerInstantiator();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((HandlerInstantiator) (obj)).deserializerInstance(_config, annotated, class1);
        }
        annotated = ((Annotated) (obj));
        if (obj == null)
        {
            annotated = (JsonDeserializer)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers());
        }
          goto _L7
    }

    public ReadableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator, ObjectIdResolver objectidresolver)
    {
        com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey idkey = objectidgenerator.key(obj);
        if (_objectIds == null)
        {
            _objectIds = new LinkedHashMap();
        } else
        {
            obj = (ReadableObjectId)_objectIds.get(idkey);
            if (obj != null)
            {
                return ((ReadableObjectId) (obj));
            }
        }
        objectidgenerator = null;
        if (_objectIdResolvers == null)
        {
            _objectIdResolvers = new ArrayList(8);
            obj = objectidgenerator;
        } else
        {
            Iterator iterator = _objectIdResolvers.iterator();
            do
            {
                obj = objectidgenerator;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (ObjectIdResolver)iterator.next();
            } while (!((ObjectIdResolver) (obj)).canUseFor(objectidresolver));
        }
        objectidgenerator = ((ObjectIdGenerator) (obj));
        if (obj == null)
        {
            objectidgenerator = objectidresolver.newForDeserialization(this);
            _objectIdResolvers.add(objectidgenerator);
        }
        obj = new ReadableObjectId(idkey);
        ((ReadableObjectId) (obj)).setResolver(objectidgenerator);
        _objectIds.put(idkey, obj);
        return ((ReadableObjectId) (obj));
    }

    public final KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj)
        throws JsonMappingException
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = obj2;
_L4:
        return ((KeyDeserializer) (obj));
_L2:
        if (!(obj instanceof KeyDeserializer))
        {
            break; /* Loop/switch isn't completed */
        }
        annotated = (KeyDeserializer)obj;
_L7:
        obj = annotated;
        if (annotated instanceof ResolvableDeserializer)
        {
            ((ResolvableDeserializer)annotated).resolve(this);
            return annotated;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Class class1;
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned key deserializer definition of type ").append(obj.getClass().getName()).append("; expected type KeyDeserializer or Class<KeyDeserializer> instead").toString());
        }
        class1 = (Class)obj;
        obj = obj2;
        if (class1 == com/fasterxml/jackson/databind/KeyDeserializer$None) goto _L4; else goto _L5
_L5:
        obj = obj2;
        if (ClassUtil.isBogusClass(class1)) goto _L4; else goto _L6
_L6:
        if (!com/fasterxml/jackson/databind/KeyDeserializer.isAssignableFrom(class1))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<KeyDeserializer>").toString());
        }
        obj = _config.getHandlerInstantiator();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((HandlerInstantiator) (obj)).keyDeserializerInstance(_config, annotated, class1);
        }
        annotated = ((Annotated) (obj));
        if (obj == null)
        {
            annotated = (KeyDeserializer)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers());
        }
          goto _L7
    }
}
