// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            ContainerDeserializerBase

public class MapDeserializer extends ContainerDeserializerBase
    implements ContextualDeserializer, ResolvableDeserializer
{

    private static final long serialVersionUID = 0xd11c9bd2fbfb27d0L;
    protected JsonDeserializer _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected HashSet _ignorableProperties;
    protected final KeyDeserializer _keyDeserializer;
    protected final JavaType _mapType;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final JsonDeserializer _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    public MapDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super(javatype);
        _mapType = javatype;
        _keyDeserializer = keydeserializer;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
        _valueInstantiator = valueinstantiator;
        _hasDefaultCreator = valueinstantiator.canCreateUsingDefault();
        _delegateDeserializer = null;
        _propertyBasedCreator = null;
        _standardStringKey = _isStdKeyDeser(javatype, keydeserializer);
    }

    protected MapDeserializer(MapDeserializer mapdeserializer, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, HashSet hashset)
    {
        super(mapdeserializer._mapType);
        _mapType = mapdeserializer._mapType;
        _keyDeserializer = keydeserializer;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
        _valueInstantiator = mapdeserializer._valueInstantiator;
        _propertyBasedCreator = mapdeserializer._propertyBasedCreator;
        _delegateDeserializer = mapdeserializer._delegateDeserializer;
        _hasDefaultCreator = mapdeserializer._hasDefaultCreator;
        _ignorableProperties = hashset;
        _standardStringKey = _isStdKeyDeser(_mapType, keydeserializer);
    }

    private void handleUnresolvedReference(JsonParser jsonparser, MapReferringAccumulator mapreferringaccumulator, Object obj, UnresolvedForwardReference unresolvedforwardreference)
    {
        if (mapreferringaccumulator == null)
        {
            throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info.", unresolvedforwardreference);
        } else
        {
            jsonparser = mapreferringaccumulator.handleUnresolvedReference(unresolvedforwardreference, obj);
            unresolvedforwardreference.getRoid().appendReferring(jsonparser);
            return;
        }
    }

    public Map _deserializeUsingCreator(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        Object obj1;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        TypeDeserializer typedeserializer;
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, null);
        obj1 = jsonparser.getCurrentToken();
        obj = obj1;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
        obj1 = _valueDeserializer;
        typedeserializer = _valueTypeDeserializer;
_L2:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        s = jsonparser.getCurrentName();
        obj = jsonparser.nextToken();
        if (_ignorableProperties == null || !_ignorableProperties.contains(s))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonparser.skipChildren();
_L3:
        obj = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            SettableBeanProperty settablebeanproperty = propertybasedcreator.findCreatorProperty(s);
            if (settablebeanproperty == null)
            {
                break label0;
            }
            obj = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
            if (propertyvaluebuffer.assignParameter(settablebeanproperty.getCreatorIndex(), obj))
            {
                jsonparser.nextToken();
                try
                {
                    obj = (Map)propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
                }
                // Misplaced declaration of an exception variable
                catch (JsonParser jsonparser)
                {
                    wrapAndThrow(jsonparser, _mapType.getRawClass(), s);
                    return null;
                }
                _readAndBind(jsonparser, deserializationcontext, ((Map) (obj)));
                return ((Map) (obj));
            }
        }
          goto _L3
        Object obj2;
        obj2 = jsonparser.getCurrentName();
        obj2 = _keyDeserializer.deserializeKey(((String) (obj2)), deserializationcontext);
        if (obj != JsonToken.VALUE_NULL) goto _L5; else goto _L4
_L4:
        obj = ((JsonDeserializer) (obj1)).getNullValue();
_L6:
        propertyvaluebuffer.bufferMapProperty(obj2, obj);
          goto _L3
_L5:
label1:
        {
            if (typedeserializer != null)
            {
                break label1;
            }
            try
            {
                obj = ((JsonDeserializer) (obj1)).deserialize(jsonparser, deserializationcontext);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                wrapAndThrow(jsonparser, _mapType.getRawClass(), s);
                return null;
            }
        }
          goto _L6
        obj = ((JsonDeserializer) (obj1)).deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
          goto _L6
        try
        {
            jsonparser = (Map)propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            wrapAndThrow(jsonparser, _mapType.getRawClass(), null);
            return null;
        }
        return jsonparser;
    }

    protected final boolean _isStdKeyDeser(JavaType javatype, KeyDeserializer keydeserializer)
    {
        if (keydeserializer != null)
        {
            if ((javatype = javatype.getKeyType()) != null && ((javatype = javatype.getRawClass()) != java/lang/String && javatype != java/lang/Object || !isDefaultKeyDeserializer(keydeserializer)))
            {
                return false;
            }
        }
        return true;
    }

    protected final void _readAndBind(JsonParser jsonparser, DeserializationContext deserializationcontext, Map map)
    {
        Object obj1 = jsonparser.getCurrentToken();
        Object obj = obj1;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
        KeyDeserializer keydeserializer = _keyDeserializer;
        JsonDeserializer jsondeserializer = _valueDeserializer;
        TypeDeserializer typedeserializer = _valueTypeDeserializer;
        String s;
        Object obj2;
        boolean flag;
        if (jsondeserializer.getObjectIdReader() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Exception exception;
        if (flag)
        {
            obj1 = new MapReferringAccumulator(_mapType.getContentType().getRawClass(), map);
        } else
        {
            obj1 = null;
        }
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        s = jsonparser.getCurrentName();
        obj2 = keydeserializer.deserializeKey(s, deserializationcontext);
        obj = jsonparser.nextToken();
        if (_ignorableProperties == null || !_ignorableProperties.contains(s))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonparser.skipChildren();
_L7:
        obj = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_78;
_L1:
        if (obj != JsonToken.VALUE_NULL) goto _L4; else goto _L3
_L3:
        obj = jsondeserializer.getNullValue();
_L5:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        try
        {
            ((MapReferringAccumulator) (obj1)).put(obj2, obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            handleUnresolvedReference(jsonparser, ((MapReferringAccumulator) (obj1)), obj2, ((UnresolvedForwardReference) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            wrapAndThrow(exception, map, s);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (typedeserializer != null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
          goto _L5
        obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
          goto _L5
        map.put(obj2, obj);
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected final void _readAndBindStringMap(JsonParser jsonparser, DeserializationContext deserializationcontext, Map map)
    {
        Object obj1 = jsonparser.getCurrentToken();
        Object obj = obj1;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
        JsonDeserializer jsondeserializer = _valueDeserializer;
        TypeDeserializer typedeserializer = _valueTypeDeserializer;
        String s;
        boolean flag;
        if (jsondeserializer.getObjectIdReader() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Exception exception;
        if (flag)
        {
            obj1 = new MapReferringAccumulator(_mapType.getContentType().getRawClass(), map);
        } else
        {
            obj1 = null;
        }
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        s = jsonparser.getCurrentName();
        obj = jsonparser.nextToken();
        if (_ignorableProperties == null || !_ignorableProperties.contains(s))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonparser.skipChildren();
_L7:
        obj = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_72;
_L1:
        if (obj != JsonToken.VALUE_NULL) goto _L4; else goto _L3
_L3:
        obj = jsondeserializer.getNullValue();
_L5:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        try
        {
            ((MapReferringAccumulator) (obj1)).put(s, obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            handleUnresolvedReference(jsonparser, ((MapReferringAccumulator) (obj1)), s, ((UnresolvedForwardReference) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            wrapAndThrow(exception, map, s);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (typedeserializer != null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
          goto _L5
        obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
          goto _L5
        map.put(s, obj);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        Object obj;
        Object obj1;
        TypeDeserializer typedeserializer;
label0:
        {
            obj1 = _keyDeserializer;
            Object obj2;
            if (obj1 == null)
            {
                obj = deserializationcontext.findKeyDeserializer(_mapType.getKeyType(), beanproperty);
            } else
            {
                obj = obj1;
                if (obj1 instanceof ContextualKeyDeserializer)
                {
                    obj = ((ContextualKeyDeserializer)obj1).createContextual(deserializationcontext, beanproperty);
                }
            }
            obj1 = findConvertingContentDeserializer(deserializationcontext, beanproperty, _valueDeserializer);
            if (obj1 == null)
            {
                obj1 = deserializationcontext.findContextualValueDeserializer(_mapType.getContentType(), beanproperty);
            } else
            {
                obj1 = deserializationcontext.handleSecondaryContextualization(((JsonDeserializer) (obj1)), beanproperty);
            }
            obj2 = _valueTypeDeserializer;
            typedeserializer = ((TypeDeserializer) (obj2));
            if (obj2 != null)
            {
                typedeserializer = ((TypeDeserializer) (obj2)).forProperty(beanproperty);
            }
            obj2 = _ignorableProperties;
            deserializationcontext = deserializationcontext.getAnnotationIntrospector();
            if (deserializationcontext != null && beanproperty != null)
            {
                String as[] = deserializationcontext.findPropertiesToIgnore(beanproperty.getMember());
                if (as != null)
                {
                    int i;
                    int j;
                    if (obj2 == null)
                    {
                        deserializationcontext = new HashSet();
                    } else
                    {
                        deserializationcontext = new HashSet(((java.util.Collection) (obj2)));
                    }
                    j = as.length;
                    i = 0;
                    do
                    {
                        beanproperty = deserializationcontext;
                        if (i >= j)
                        {
                            break;
                        }
                        deserializationcontext.add(as[i]);
                        i++;
                    } while (true);
                    break label0;
                }
            }
            beanproperty = ((BeanProperty) (obj2));
        }
        return withResolved(((KeyDeserializer) (obj)), typedeserializer, ((JsonDeserializer) (obj1)), beanproperty);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        return deserialize(jsonparser, deserializationcontext, (Map)obj);
    }

    public Map deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (_propertyBasedCreator != null)
        {
            return _deserializeUsingCreator(jsonparser, deserializationcontext);
        }
        if (_delegateDeserializer != null)
        {
            return (Map)_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (!_hasDefaultCreator)
        {
            throw deserializationcontext.instantiationException(getMapClass(), "No default constructor found");
        }
        Object obj = jsonparser.getCurrentToken();
        if (obj != JsonToken.START_OBJECT && obj != JsonToken.FIELD_NAME && obj != JsonToken.END_OBJECT)
        {
            if (obj == JsonToken.VALUE_STRING)
            {
                return (Map)_valueInstantiator.createFromString(deserializationcontext, jsonparser.getText());
            } else
            {
                throw deserializationcontext.mappingException(getMapClass());
            }
        }
        obj = (Map)_valueInstantiator.createUsingDefault(deserializationcontext);
        if (_standardStringKey)
        {
            _readAndBindStringMap(jsonparser, deserializationcontext, ((Map) (obj)));
            return ((Map) (obj));
        } else
        {
            _readAndBind(jsonparser, deserializationcontext, ((Map) (obj)));
            return ((Map) (obj));
        }
    }

    public Map deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Map map)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.START_OBJECT && jsontoken != JsonToken.FIELD_NAME)
        {
            throw deserializationcontext.mappingException(getMapClass());
        }
        if (_standardStringKey)
        {
            _readAndBindStringMap(jsonparser, deserializationcontext, map);
            return map;
        } else
        {
            _readAndBind(jsonparser, deserializationcontext, map);
            return map;
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _valueDeserializer;
    }

    public final Class getMapClass()
    {
        return _mapType.getRawClass();
    }

    public boolean isCachable()
    {
        return true;
    }

    public void resolve(DeserializationContext deserializationcontext)
    {
        if (_valueInstantiator.canCreateUsingDelegate())
        {
            JavaType javatype = _valueInstantiator.getDelegateType(deserializationcontext.getConfig());
            if (javatype == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid delegate-creator definition for ")).append(_mapType).append(": value instantiator (").append(_valueInstantiator.getClass().getName()).append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'").toString());
            }
            _delegateDeserializer = findDeserializer(deserializationcontext, javatype, null);
        }
        if (_valueInstantiator.canCreateFromObjectWith())
        {
            SettableBeanProperty asettablebeanproperty[] = _valueInstantiator.getFromObjectArguments(deserializationcontext.getConfig());
            _propertyBasedCreator = PropertyBasedCreator.construct(deserializationcontext, _valueInstantiator, asettablebeanproperty);
        }
        _standardStringKey = _isStdKeyDeser(_mapType, _keyDeserializer);
    }

    public void setIgnorableProperties(String as[])
    {
        if (as == null || as.length == 0)
        {
            as = null;
        } else
        {
            as = ArrayBuilders.arrayToSet(as);
        }
        _ignorableProperties = as;
    }

    protected MapDeserializer withResolved(KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer, HashSet hashset)
    {
        if (_keyDeserializer == keydeserializer && _valueDeserializer == jsondeserializer && _valueTypeDeserializer == typedeserializer && _ignorableProperties == hashset)
        {
            return this;
        } else
        {
            return new MapDeserializer(this, keydeserializer, jsondeserializer, typedeserializer, hashset);
        }
    }

    protected void wrapAndThrow(Throwable throwable, Object obj, String s)
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        if ((throwable instanceof IOException) && !(throwable instanceof JsonMappingException))
        {
            throw (IOException)throwable;
        } else
        {
            throw JsonMappingException.wrapWithPath(throwable, obj, s);
        }
    }

    private class MapReferringAccumulator
    {

        private List _accumulator;
        private Map _result;
        private final Class _valueType;

        public final com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedforwardreference, Object obj)
        {
            unresolvedforwardreference = new MapReferring(unresolvedforwardreference, _valueType, obj);
            _accumulator.add(unresolvedforwardreference);
            return unresolvedforwardreference;
        }

        public final void put(Object obj, Object obj1)
        {
            if (_accumulator.isEmpty())
            {
                _result.put(obj, obj1);
                return;
            } else
            {
                ((MapReferring)_accumulator.get(_accumulator.size() - 1)).next.put(obj, obj1);
                return;
            }
        }

        public final void resolveForwardReference(Object obj, Object obj1)
        {
            Iterator iterator = _accumulator.iterator();
            MapReferring mapreferring;
            for (Map map = _result; iterator.hasNext(); map = mapreferring.next)
            {
                mapreferring = (MapReferring)iterator.next();
                if (mapreferring.hasId(obj))
                {
                    iterator.remove();
                    map.put(mapreferring.key, obj1);
                    map.putAll(mapreferring.next);
                    return;
                }
            }

            throw new IllegalArgumentException((new StringBuilder("Trying to resolve a forward reference with id [")).append(obj).append("] that wasn't previously seen as unresolved.").toString());
        }

        public MapReferringAccumulator(Class class1, Map map)
        {
            _accumulator = new ArrayList();
            _valueType = class1;
            _result = map;
        }

        private class MapReferring extends com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        {

            private final MapReferringAccumulator _parent;
            public final Object key;
            public final Map next;

            public final void handleResolvedForwardReference(Object obj, Object obj1)
            {
                _parent.resolveForwardReference(obj, obj1);
            }

            private MapReferring(UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj)
            {
                super(unresolvedforwardreference, class1);
                next = new LinkedHashMap();
                _parent = MapReferringAccumulator.this;
                key = obj;
            }

        }

    }

}
