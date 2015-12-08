// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class UntypedObjectDeserializer extends StdDeserializer
    implements ContextualDeserializer, ResolvableDeserializer
{

    protected static final Object NO_OBJECTS[] = new Object[0];
    public static final UntypedObjectDeserializer instance = new UntypedObjectDeserializer();
    private static final long serialVersionUID = 1L;
    protected JsonDeserializer _listDeserializer;
    protected JsonDeserializer _mapDeserializer;
    protected JsonDeserializer _numberDeserializer;
    protected JsonDeserializer _stringDeserializer;

    public UntypedObjectDeserializer()
    {
        super(java/lang/Object);
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedobjectdeserializer, JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, JsonDeserializer jsondeserializer2, JsonDeserializer jsondeserializer3)
    {
        super(java/lang/Object);
        _mapDeserializer = jsondeserializer;
        _listDeserializer = jsondeserializer1;
        _stringDeserializer = jsondeserializer2;
        _numberDeserializer = jsondeserializer3;
    }

    protected JsonDeserializer _findCustomDeser(DeserializationContext deserializationcontext, JavaType javatype)
    {
        javatype = deserializationcontext.findRootValueDeserializer(javatype);
        deserializationcontext = javatype;
        if (ClassUtil.isJacksonStdImpl(javatype))
        {
            deserializationcontext = null;
        }
        return deserializationcontext;
    }

    protected JsonDeserializer _withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, JsonDeserializer jsondeserializer2, JsonDeserializer jsondeserializer3)
    {
        return new UntypedObjectDeserializer(this, jsondeserializer, jsondeserializer1, jsondeserializer2, jsondeserializer3);
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        if (_stringDeserializer != null || _numberDeserializer != null || _mapDeserializer != null || _listDeserializer != null || getClass() != com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer) goto _L2; else goto _L1
_L1:
        deserializationcontext = Vanilla.std;
_L4:
        return deserializationcontext;
_L2:
        JsonDeserializer jsondeserializer;
        JsonDeserializer jsondeserializer1;
        JsonDeserializer jsondeserializer2;
        JsonDeserializer jsondeserializer3;
        jsondeserializer = _mapDeserializer;
        if (jsondeserializer instanceof ContextualDeserializer)
        {
            jsondeserializer = ((ContextualDeserializer)jsondeserializer).createContextual(deserializationcontext, beanproperty);
        }
        jsondeserializer1 = _listDeserializer;
        if (jsondeserializer1 instanceof ContextualDeserializer)
        {
            jsondeserializer1 = ((ContextualDeserializer)jsondeserializer1).createContextual(deserializationcontext, beanproperty);
        }
        jsondeserializer2 = _stringDeserializer;
        if (jsondeserializer2 instanceof ContextualDeserializer)
        {
            jsondeserializer2 = ((ContextualDeserializer)jsondeserializer2).createContextual(deserializationcontext, beanproperty);
        }
        JsonDeserializer jsondeserializer4 = _numberDeserializer;
        jsondeserializer3 = jsondeserializer4;
        if (jsondeserializer4 instanceof ContextualDeserializer)
        {
            jsondeserializer3 = ((ContextualDeserializer)jsondeserializer4).createContextual(deserializationcontext, beanproperty);
        }
        if (jsondeserializer != _mapDeserializer || jsondeserializer1 != _listDeserializer || jsondeserializer2 != _stringDeserializer)
        {
            break; /* Loop/switch isn't completed */
        }
        deserializationcontext = this;
        if (jsondeserializer3 == _numberDeserializer) goto _L4; else goto _L3
_L3:
        return _withResolved(jsondeserializer, jsondeserializer1, jsondeserializer2, jsondeserializer3);
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()])
        {
        default:
            throw deserializationcontext.mappingException(java/lang/Object);

        case 1: // '\001'
        case 2: // '\002'
            if (_mapDeserializer != null)
            {
                return _mapDeserializer.deserialize(jsonparser, deserializationcontext);
            } else
            {
                return mapObject(jsonparser, deserializationcontext);
            }

        case 3: // '\003'
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
            {
                return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
            }
            if (_listDeserializer != null)
            {
                return _listDeserializer.deserialize(jsonparser, deserializationcontext);
            } else
            {
                return mapArray(jsonparser, deserializationcontext);
            }

        case 4: // '\004'
            return jsonparser.getEmbeddedObject();

        case 5: // '\005'
            if (_stringDeserializer != null)
            {
                return _stringDeserializer.deserialize(jsonparser, deserializationcontext);
            } else
            {
                return jsonparser.getText();
            }

        case 6: // '\006'
            if (_numberDeserializer != null)
            {
                return _numberDeserializer.deserialize(jsonparser, deserializationcontext);
            }
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
            {
                return jsonparser.getBigIntegerValue();
            } else
            {
                return jsonparser.getNumberValue();
            }

        case 7: // '\007'
            if (_numberDeserializer != null)
            {
                return _numberDeserializer.deserialize(jsonparser, deserializationcontext);
            }
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                return jsonparser.getDecimalValue();
            } else
            {
                return Double.valueOf(jsonparser.getDoubleValue());
            }

        case 8: // '\b'
            return Boolean.TRUE;

        case 9: // '\t'
            return Boolean.FALSE;

        case 10: // '\n'
            return null;
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
        {
        default:
            throw deserializationcontext.mappingException(java/lang/Object);

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);

        case 5: // '\005'
            if (_stringDeserializer != null)
            {
                return _stringDeserializer.deserialize(jsonparser, deserializationcontext);
            } else
            {
                return jsonparser.getText();
            }

        case 6: // '\006'
            if (_numberDeserializer != null)
            {
                return _numberDeserializer.deserialize(jsonparser, deserializationcontext);
            }
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
            {
                return jsonparser.getBigIntegerValue();
            } else
            {
                return jsonparser.getNumberValue();
            }

        case 7: // '\007'
            if (_numberDeserializer != null)
            {
                return _numberDeserializer.deserialize(jsonparser, deserializationcontext);
            }
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                return jsonparser.getDecimalValue();
            } else
            {
                return Double.valueOf(jsonparser.getDoubleValue());
            }

        case 8: // '\b'
            return Boolean.TRUE;

        case 9: // '\t'
            return Boolean.FALSE;

        case 4: // '\004'
            return jsonparser.getEmbeddedObject();

        case 10: // '\n'
            return null;
        }
    }

    protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        int i = 2;
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            return new ArrayList(2);
        }
        Object obj = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            jsonparser = new ArrayList(2);
            jsonparser.add(obj);
            return jsonparser;
        }
        Object obj1 = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            jsonparser = new ArrayList(2);
            jsonparser.add(obj);
            jsonparser.add(obj1);
            return jsonparser;
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj1[] = objectbuffer.resetAndStart();
        aobj1[0] = obj;
        aobj1[1] = obj1;
        int j = 2;
        do
        {
            Object obj2 = deserialize(jsonparser, deserializationcontext);
            int k = j + 1;
            Object aobj[];
            int l;
            if (i >= aobj1.length)
            {
                aobj = objectbuffer.appendCompletedChunk(aobj1);
                i = 0;
            } else
            {
                aobj = aobj1;
            }
            l = i + 1;
            aobj[i] = obj2;
            i = l;
            aobj1 = aobj;
            j = k;
        } while (jsonparser.nextToken() != JsonToken.END_ARRAY);
        jsonparser = new ArrayList(k);
        objectbuffer.completeAndClearBuffer(aobj, l, jsonparser);
        return jsonparser;
    }

    protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            return NO_OBJECTS;
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj[] = objectbuffer.resetAndStart();
        int i = 0;
        do
        {
            Object obj = deserialize(jsonparser, deserializationcontext);
            Object aobj1[];
            int j;
            if (i >= aobj.length)
            {
                aobj1 = objectbuffer.appendCompletedChunk(aobj);
                i = 0;
            } else
            {
                aobj1 = aobj;
            }
            j = i + 1;
            aobj1[i] = obj;
            i = j;
            aobj = aobj1;
        } while (jsonparser.nextToken() != JsonToken.END_ARRAY);
        return objectbuffer.completeAndClearBuffer(aobj1, j);
    }

    protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj1 = jsonparser.getCurrentToken();
        Object obj = obj1;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
        if (obj == JsonToken.END_OBJECT)
        {
            return new LinkedHashMap(2);
        }
        obj = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj1 = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_OBJECT)
        {
            jsonparser = new LinkedHashMap(2);
            jsonparser.put(obj, obj1);
            return jsonparser;
        }
        String s1 = jsonparser.getCurrentName();
        jsonparser.nextToken();
        Object obj2 = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() == JsonToken.END_OBJECT)
        {
            jsonparser = new LinkedHashMap(4);
            jsonparser.put(obj, obj1);
            jsonparser.put(s1, obj2);
            return jsonparser;
        }
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        linkedhashmap.put(obj, obj1);
        linkedhashmap.put(s1, obj2);
        do
        {
            String s = jsonparser.getCurrentName();
            jsonparser.nextToken();
            linkedhashmap.put(s, deserialize(jsonparser, deserializationcontext));
        } while (jsonparser.nextToken() != JsonToken.END_OBJECT);
        return linkedhashmap;
    }

    public void resolve(DeserializationContext deserializationcontext)
    {
        JavaType javatype = deserializationcontext.constructType(java/lang/Object);
        JavaType javatype1 = deserializationcontext.constructType(java/lang/String);
        TypeFactory typefactory = deserializationcontext.getTypeFactory();
        _mapDeserializer = _findCustomDeser(deserializationcontext, typefactory.constructMapType(java/util/Map, javatype1, javatype));
        _listDeserializer = _findCustomDeser(deserializationcontext, typefactory.constructCollectionType(java/util/List, javatype));
        _stringDeserializer = _findCustomDeser(deserializationcontext, javatype1);
        _numberDeserializer = _findCustomDeser(deserializationcontext, typefactory.constructType(java/lang/Number));
    }


    private class Vanilla extends StdDeserializer
    {

        private static final long serialVersionUID = 1L;
        public static final Vanilla std = new Vanilla();

        public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            switch (jsonparser.getCurrentTokenId())
            {
            case 2: // '\002'
            case 4: // '\004'
            default:
                throw deserializationcontext.mappingException(java/lang/Object);

            case 1: // '\001'
                if (jsonparser.nextToken() == JsonToken.END_OBJECT)
                {
                    return new LinkedHashMap(2);
                }
                // fall through

            case 5: // '\005'
                return mapObject(jsonparser, deserializationcontext);

            case 3: // '\003'
                if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                {
                    if (deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
                    {
                        return ((Object) (UntypedObjectDeserializer.NO_OBJECTS));
                    } else
                    {
                        return new ArrayList(2);
                    }
                }
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
                {
                    return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
                } else
                {
                    return mapArray(jsonparser, deserializationcontext);
                }

            case 12: // '\f'
                return jsonparser.getEmbeddedObject();

            case 6: // '\006'
                return jsonparser.getText();

            case 7: // '\007'
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
                {
                    return jsonparser.getBigIntegerValue();
                } else
                {
                    return jsonparser.getNumberValue();
                }

            case 8: // '\b'
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
                {
                    return jsonparser.getDecimalValue();
                } else
                {
                    return Double.valueOf(jsonparser.getDoubleValue());
                }

            case 9: // '\t'
                return Boolean.TRUE;

            case 10: // '\n'
                return Boolean.FALSE;

            case 11: // '\013'
                return null;
            }
        }

        public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        {
            switch (jsonparser.getCurrentTokenId())
            {
            case 2: // '\002'
            case 4: // '\004'
            default:
                throw deserializationcontext.mappingException(java/lang/Object);

            case 1: // '\001'
            case 3: // '\003'
            case 5: // '\005'
                return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);

            case 6: // '\006'
                return jsonparser.getText();

            case 7: // '\007'
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
                {
                    return jsonparser.getBigIntegerValue();
                } else
                {
                    return jsonparser.getNumberValue();
                }

            case 8: // '\b'
                if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
                {
                    return jsonparser.getDecimalValue();
                } else
                {
                    return Double.valueOf(jsonparser.getDoubleValue());
                }

            case 9: // '\t'
                return Boolean.TRUE;

            case 10: // '\n'
                return Boolean.FALSE;

            case 12: // '\f'
                return jsonparser.getEmbeddedObject();

            case 11: // '\013'
                return null;
            }
        }

        protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            int i = 2;
            Object obj = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                jsonparser = new ArrayList(2);
                jsonparser.add(obj);
                return jsonparser;
            }
            Object obj1 = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                jsonparser = new ArrayList(2);
                jsonparser.add(obj);
                jsonparser.add(obj1);
                return jsonparser;
            }
            ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
            Object aobj1[] = objectbuffer.resetAndStart();
            aobj1[0] = obj;
            aobj1[1] = obj1;
            int j = 2;
            do
            {
                Object obj2 = deserialize(jsonparser, deserializationcontext);
                int k = j + 1;
                Object aobj[];
                int l;
                if (i >= aobj1.length)
                {
                    aobj = objectbuffer.appendCompletedChunk(aobj1);
                    i = 0;
                } else
                {
                    aobj = aobj1;
                }
                l = i + 1;
                aobj[i] = obj2;
                i = l;
                aobj1 = aobj;
                j = k;
            } while (jsonparser.nextToken() != JsonToken.END_ARRAY);
            jsonparser = new ArrayList(k);
            objectbuffer.completeAndClearBuffer(aobj, l, jsonparser);
            return jsonparser;
        }

        protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
            Object aobj[] = objectbuffer.resetAndStart();
            int i = 0;
            do
            {
                Object obj = deserialize(jsonparser, deserializationcontext);
                Object aobj1[];
                int j;
                if (i >= aobj.length)
                {
                    aobj1 = objectbuffer.appendCompletedChunk(aobj);
                    i = 0;
                } else
                {
                    aobj1 = aobj;
                }
                j = i + 1;
                aobj1[i] = obj;
                i = j;
                aobj = aobj1;
            } while (jsonparser.nextToken() != JsonToken.END_ARRAY);
            return objectbuffer.completeAndClearBuffer(aobj1, j);
        }

        protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            String s = jsonparser.getText();
            jsonparser.nextToken();
            Object obj = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() == JsonToken.END_OBJECT)
            {
                jsonparser = new LinkedHashMap(2);
                jsonparser.put(s, obj);
                return jsonparser;
            }
            String s2 = jsonparser.getText();
            jsonparser.nextToken();
            Object obj1 = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() == JsonToken.END_OBJECT)
            {
                jsonparser = new LinkedHashMap(4);
                jsonparser.put(s, obj);
                jsonparser.put(s2, obj1);
                return jsonparser;
            }
            LinkedHashMap linkedhashmap = new LinkedHashMap();
            linkedhashmap.put(s, obj);
            linkedhashmap.put(s2, obj1);
            do
            {
                String s1 = jsonparser.getText();
                jsonparser.nextToken();
                linkedhashmap.put(s1, deserialize(jsonparser, deserializationcontext));
            } while (jsonparser.nextToken() != JsonToken.END_OBJECT);
            return linkedhashmap;
        }


        public Vanilla()
        {
            super(java/lang/Object);
        }
    }

}
