// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            ResolvableDeserializer, DeserializerFactory

public final class DeserializerCache
{

    protected final ConcurrentHashMap _cachedDeserializers = new ConcurrentHashMap(64, 0.75F, 2);
    protected final HashMap _incompleteDeserializers = new HashMap(8);

    public DeserializerCache()
    {
    }

    private Class _verifyAsClass(Object obj, String s, Class class1)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((Class) (obj));
_L2:
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector.").append(s).append("() returned value of type ").append(obj.getClass().getName()).append(": expected type JsonSerializer or Class<JsonSerializer> instead").toString());
        }
        s = (Class)obj;
        if (s == class1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s;
        if (s != com/fasterxml/jackson/databind/annotation/NoClass) goto _L4; else goto _L3
_L3:
        return null;
    }

    private JavaType modifyTypeByAnnotation(DeserializationContext deserializationcontext, Annotated annotated, JavaType javatype)
    {
        Object obj1 = deserializationcontext.getAnnotationIntrospector();
        Object obj2 = ((AnnotationIntrospector) (obj1)).findDeserializationType(annotated, javatype);
        Object obj;
        if (obj2 != null)
        {
            try
            {
                obj = javatype.narrowBy(((Class) (obj2)));
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                throw new JsonMappingException((new StringBuilder()).append("Failed to narrow type ").append(javatype).append(" with concrete-type annotation (value ").append(((Class) (obj2)).getName()).append("), method '").append(annotated.getName()).append("': ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
            }
            javatype = ((JavaType) (obj));
        }
        obj = javatype;
        if (javatype.isContainerType())
        {
            obj2 = ((AnnotationIntrospector) (obj1)).findDeserializationKeyType(annotated, javatype.getKeyType());
            if (obj2 != null)
            {
                if (!(javatype instanceof MapLikeType))
                {
                    throw new JsonMappingException((new StringBuilder()).append("Illegal key-type annotation: type ").append(javatype).append(" is not a Map(-like) type").toString());
                }
                try
                {
                    obj = ((MapLikeType)javatype).narrowKey(((Class) (obj2)));
                }
                // Misplaced declaration of an exception variable
                catch (DeserializationContext deserializationcontext)
                {
                    throw new JsonMappingException((new StringBuilder()).append("Failed to narrow key type ").append(javatype).append(" with key-type annotation (").append(((Class) (obj2)).getName()).append("): ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
                }
            } else
            {
                obj = javatype;
            }
            obj2 = ((JavaType) (obj)).getKeyType();
            javatype = ((JavaType) (obj));
            if (obj2 != null)
            {
                javatype = ((JavaType) (obj));
                if (((JavaType) (obj2)).getValueHandler() == null)
                {
                    obj2 = ((AnnotationIntrospector) (obj1)).findKeyDeserializer(annotated);
                    javatype = ((JavaType) (obj));
                    if (obj2 != null)
                    {
                        obj2 = deserializationcontext.keyDeserializerInstance(annotated, obj2);
                        javatype = ((JavaType) (obj));
                        if (obj2 != null)
                        {
                            javatype = ((MapLikeType)obj).withKeyValueHandler(obj2);
                            javatype.getKeyType();
                        }
                    }
                }
            }
            obj2 = ((AnnotationIntrospector) (obj1)).findDeserializationContentType(annotated, javatype.getContentType());
            if (obj2 != null)
            {
                try
                {
                    obj = javatype.narrowContentsBy(((Class) (obj2)));
                }
                // Misplaced declaration of an exception variable
                catch (DeserializationContext deserializationcontext)
                {
                    throw new JsonMappingException((new StringBuilder()).append("Failed to narrow content type ").append(javatype).append(" with content-type annotation (").append(((Class) (obj2)).getName()).append("): ").append(deserializationcontext.getMessage()).toString(), null, deserializationcontext);
                }
                javatype = ((JavaType) (obj));
            }
            obj = javatype;
            if (javatype.getContentType().getValueHandler() == null)
            {
                obj1 = ((AnnotationIntrospector) (obj1)).findContentDeserializer(annotated);
                obj = javatype;
                if (obj1 != null)
                {
                    if (obj1 instanceof JsonDeserializer)
                    {
                        deserializationcontext = (JsonDeserializer)obj1;
                        deserializationcontext = null;
                    } else
                    {
                        obj = _verifyAsClass(obj1, "findContentDeserializer", com/fasterxml/jackson/databind/JsonDeserializer$None);
                        if (obj != null)
                        {
                            deserializationcontext = deserializationcontext.deserializerInstance(annotated, obj);
                        } else
                        {
                            deserializationcontext = null;
                        }
                    }
                    obj = javatype;
                    if (deserializationcontext != null)
                    {
                        obj = javatype.withContentValueHandler(deserializationcontext);
                    }
                }
            }
        }
        return ((JavaType) (obj));
    }

    protected JsonDeserializer _createAndCache2(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        try
        {
            deserializerfactory = _createDeserializer(deserializationcontext, deserializerfactory, javatype);
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            throw new JsonMappingException(deserializationcontext.getMessage(), null, deserializationcontext);
        }
        if (deserializerfactory == null)
        {
            deserializationcontext = null;
        } else
        {
            boolean flag = deserializerfactory instanceof ResolvableDeserializer;
            boolean flag1 = deserializerfactory.isCachable();
            if (flag)
            {
                _incompleteDeserializers.put(javatype, deserializerfactory);
                ((ResolvableDeserializer)deserializerfactory).resolve(deserializationcontext);
                _incompleteDeserializers.remove(javatype);
            }
            deserializationcontext = deserializerfactory;
            if (flag1)
            {
                _cachedDeserializers.put(javatype, deserializerfactory);
                return deserializerfactory;
            }
        }
        return deserializationcontext;
    }

    protected JsonDeserializer _createAndCacheValueDeserializer(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        HashMap hashmap = _incompleteDeserializers;
        hashmap;
        JVM INSTR monitorenter ;
        JsonDeserializer jsondeserializer = _findCachedDeserializer(javatype);
        if (jsondeserializer == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return jsondeserializer;
        int i = _incompleteDeserializers.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        jsondeserializer = (JsonDeserializer)_incompleteDeserializers.get(javatype);
        if (jsondeserializer == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return jsondeserializer;
        deserializationcontext;
        hashmap;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        deserializationcontext = _createAndCache2(deserializationcontext, deserializerfactory, javatype);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (_incompleteDeserializers.size() > 0)
        {
            _incompleteDeserializers.clear();
        }
        hashmap;
        JVM INSTR monitorexit ;
        return deserializationcontext;
        deserializationcontext;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (_incompleteDeserializers.size() > 0)
        {
            _incompleteDeserializers.clear();
        }
        throw deserializationcontext;
    }

    protected JsonDeserializer _createDeserializer(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        Object obj;
        DeserializationConfig deserializationconfig;
label0:
        {
            deserializationconfig = deserializationcontext.getConfig();
            if (!javatype.isAbstract() && !javatype.isMapLikeType())
            {
                obj = javatype;
                if (!javatype.isCollectionLikeType())
                {
                    break label0;
                }
            }
            obj = deserializerfactory.mapAbstractType(deserializationconfig, javatype);
        }
        javatype = deserializationconfig.introspect(((JavaType) (obj)));
        Object obj1 = findDeserializerFromAnnotation(deserializationcontext, javatype.getClassInfo());
        if (obj1 != null)
        {
            return ((JsonDeserializer) (obj1));
        }
        obj1 = modifyTypeByAnnotation(deserializationcontext, javatype.getClassInfo(), ((JavaType) (obj)));
        if (obj1 != obj)
        {
            javatype = deserializationconfig.introspect(((JavaType) (obj1)));
            obj = obj1;
        }
        obj1 = javatype.findPOJOBuilder();
        if (obj1 != null)
        {
            return deserializerfactory.createBuilderBasedDeserializer(deserializationcontext, ((JavaType) (obj)), javatype, ((Class) (obj1)));
        }
        if (((JavaType) (obj)).isEnumType())
        {
            return deserializerfactory.createEnumDeserializer(deserializationcontext, ((JavaType) (obj)), javatype);
        }
        if (((JavaType) (obj)).isContainerType())
        {
            if (((JavaType) (obj)).isArrayType())
            {
                return deserializerfactory.createArrayDeserializer(deserializationcontext, (ArrayType)obj, javatype);
            }
            if (((JavaType) (obj)).isMapLikeType())
            {
                obj = (MapLikeType)obj;
                if (((MapLikeType) (obj)).isTrueMapType())
                {
                    return deserializerfactory.createMapDeserializer(deserializationcontext, (MapType)obj, javatype);
                } else
                {
                    return deserializerfactory.createMapLikeDeserializer(deserializationcontext, ((MapLikeType) (obj)), javatype);
                }
            }
            if (((JavaType) (obj)).isCollectionLikeType())
            {
                obj = (CollectionLikeType)obj;
                if (((CollectionLikeType) (obj)).isTrueCollectionType())
                {
                    return deserializerfactory.createCollectionDeserializer(deserializationcontext, (CollectionType)obj, javatype);
                } else
                {
                    return deserializerfactory.createCollectionLikeDeserializer(deserializationcontext, ((CollectionLikeType) (obj)), javatype);
                }
            }
        }
        if (com/fasterxml/jackson/databind/JsonNode.isAssignableFrom(((JavaType) (obj)).getRawClass()))
        {
            return deserializerfactory.createTreeDeserializer(deserializationconfig, ((JavaType) (obj)), javatype);
        } else
        {
            return deserializerfactory.createBeanDeserializer(deserializationcontext, ((JavaType) (obj)), javatype);
        }
    }

    protected JsonDeserializer _findCachedDeserializer(JavaType javatype)
    {
        if (javatype == null)
        {
            throw new IllegalArgumentException("Null JavaType passed");
        } else
        {
            return (JsonDeserializer)_cachedDeserializers.get(javatype);
        }
    }

    protected KeyDeserializer _handleUnknownKeyDeserializer(JavaType javatype)
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not find a (Map) Key deserializer for type ").append(javatype).toString());
    }

    protected JsonDeserializer _handleUnknownValueDeserializer(JavaType javatype)
    {
        if (!ClassUtil.isConcrete(javatype.getRawClass()))
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not find a Value deserializer for abstract type ").append(javatype).toString());
        } else
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not find a Value deserializer for type ").append(javatype).toString());
        }
    }

    public int cachedDeserializersCount()
    {
        return _cachedDeserializers.size();
    }

    protected JsonDeserializer findDeserializerFromAnnotation(DeserializationContext deserializationcontext, Annotated annotated)
    {
        Object obj = deserializationcontext.getAnnotationIntrospector().findDeserializer(annotated);
        if (obj == null)
        {
            return null;
        } else
        {
            return deserializationcontext.deserializerInstance(annotated, obj);
        }
    }

    public KeyDeserializer findKeyDeserializer(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        KeyDeserializer keydeserializer = deserializerfactory.createKeyDeserializer(deserializationcontext, javatype);
        if (keydeserializer == null)
        {
            deserializerfactory = _handleUnknownKeyDeserializer(javatype);
        } else
        {
            deserializerfactory = keydeserializer;
            if (keydeserializer instanceof ResolvableDeserializer)
            {
                ((ResolvableDeserializer)keydeserializer).resolve(deserializationcontext);
                return keydeserializer;
            }
        }
        return deserializerfactory;
    }

    public JsonDeserializer findValueDeserializer(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        JsonDeserializer jsondeserializer = _findCachedDeserializer(javatype);
        if (jsondeserializer != null)
        {
            deserializationcontext = jsondeserializer;
        } else
        {
            deserializerfactory = _createAndCacheValueDeserializer(deserializationcontext, deserializerfactory, javatype);
            deserializationcontext = deserializerfactory;
            if (deserializerfactory == null)
            {
                return _handleUnknownValueDeserializer(javatype);
            }
        }
        return deserializationcontext;
    }

    public void flushCachedDeserializers()
    {
        _cachedDeserializers.clear();
    }

    public boolean hasValueDeserializerFor(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory, JavaType javatype)
    {
        boolean flag = false;
        JsonDeserializer jsondeserializer1 = _findCachedDeserializer(javatype);
        JsonDeserializer jsondeserializer = jsondeserializer1;
        if (jsondeserializer1 == null)
        {
            try
            {
                jsondeserializer = _createAndCacheValueDeserializer(deserializationcontext, deserializerfactory, javatype);
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationContext deserializationcontext)
            {
                return false;
            }
        }
        if (jsondeserializer != null)
        {
            flag = true;
        }
        return flag;
    }
}
