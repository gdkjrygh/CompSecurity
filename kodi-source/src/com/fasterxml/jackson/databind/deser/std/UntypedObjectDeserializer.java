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
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

public class UntypedObjectDeserializer extends StdDeserializer
    implements ContextualDeserializer, ResolvableDeserializer
{
    public static class Vanilla extends StdDeserializer
    {

        public static final Vanilla std = new Vanilla();

        public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException
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
            throws IOException
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
            throws IOException
        {
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
            int j = 0 + 1;
            aobj1[0] = obj;
            int i = j + 1;
            aobj1[j] = obj1;
            j = i;
            do
            {
                Object obj2 = deserialize(jsonparser, deserializationcontext);
                int k = j + 1;
                j = i;
                Object aobj[] = aobj1;
                if (i >= aobj1.length)
                {
                    aobj = objectbuffer.appendCompletedChunk(aobj1);
                    j = 0;
                }
                i = j + 1;
                aobj[j] = obj2;
                if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                {
                    jsonparser = new ArrayList(k);
                    objectbuffer.completeAndClearBuffer(aobj, i, jsonparser);
                    return jsonparser;
                }
                j = k;
                aobj1 = aobj;
            } while (true);
        }

        protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException
        {
            ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
            Object aobj[] = objectbuffer.resetAndStart();
            int i = 0;
            do
            {
                Object obj = deserialize(jsonparser, deserializationcontext);
                int j = i;
                Object aobj1[] = aobj;
                if (i >= aobj.length)
                {
                    aobj1 = objectbuffer.appendCompletedChunk(aobj);
                    j = 0;
                }
                i = j + 1;
                aobj1[j] = obj;
                if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                {
                    return objectbuffer.completeAndClearBuffer(aobj1, i);
                }
                aobj = aobj1;
            } while (true);
        }

        protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException
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


    protected static final Object NO_OBJECTS[] = new Object[0];
    public static final UntypedObjectDeserializer instance = new UntypedObjectDeserializer();
    protected JsonDeserializer _listDeserializer;
    protected JsonDeserializer _mapDeserializer;
    protected JsonDeserializer _numberDeserializer;
    protected JsonDeserializer _stringDeserializer;

    public UntypedObjectDeserializer()
    {
        super(java/lang/Object);
    }

    protected JsonDeserializer _findCustomDeser(DeserializationContext deserializationcontext, JavaType javatype)
        throws JsonMappingException
    {
        javatype = deserializationcontext.findNonContextualValueDeserializer(javatype);
        deserializationcontext = javatype;
        if (ClassUtil.isJacksonStdImpl(javatype))
        {
            deserializationcontext = null;
        }
        return deserializationcontext;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        deserializationcontext = this;
        if (_stringDeserializer == null)
        {
            deserializationcontext = this;
            if (_numberDeserializer == null)
            {
                deserializationcontext = this;
                if (_mapDeserializer == null)
                {
                    deserializationcontext = this;
                    if (_listDeserializer == null)
                    {
                        deserializationcontext = this;
                        if (getClass() == com/fasterxml/jackson/databind/deser/std/UntypedObjectDeserializer)
                        {
                            deserializationcontext = Vanilla.std;
                        }
                    }
                }
            }
        }
        return deserializationcontext;
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        static class _cls1
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
        throws IOException
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

    public boolean isCachable()
    {
        return true;
    }

    protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
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
        int j = 0 + 1;
        aobj1[0] = obj;
        int i = j + 1;
        aobj1[j] = obj1;
        j = i;
        do
        {
            Object obj2 = deserialize(jsonparser, deserializationcontext);
            int k = j + 1;
            j = i;
            Object aobj[] = aobj1;
            if (i >= aobj1.length)
            {
                aobj = objectbuffer.appendCompletedChunk(aobj1);
                j = 0;
            }
            i = j + 1;
            aobj[j] = obj2;
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                jsonparser = new ArrayList(k);
                objectbuffer.completeAndClearBuffer(aobj, i, jsonparser);
                return jsonparser;
            }
            j = k;
            aobj1 = aobj;
        } while (true);
    }

    protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
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
            int j = i;
            Object aobj1[] = aobj;
            if (i >= aobj.length)
            {
                aobj1 = objectbuffer.appendCompletedChunk(aobj);
                j = 0;
            }
            i = j + 1;
            aobj1[j] = obj;
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                return objectbuffer.completeAndClearBuffer(aobj1, i);
            }
            aobj = aobj1;
        } while (true);
    }

    protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
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
        throws JsonMappingException
    {
        JavaType javatype = deserializationcontext.constructType(java/lang/Object);
        JavaType javatype1 = deserializationcontext.constructType(java/lang/String);
        TypeFactory typefactory = deserializationcontext.getTypeFactory();
        _mapDeserializer = _findCustomDeser(deserializationcontext, typefactory.constructMapType(java/util/Map, javatype1, javatype));
        _listDeserializer = _findCustomDeser(deserializationcontext, typefactory.constructCollectionType(java/util/List, javatype));
        _stringDeserializer = _findCustomDeser(deserializationcontext, javatype1);
        _numberDeserializer = _findCustomDeser(deserializationcontext, typefactory.constructType(java/lang/Number));
        javatype = TypeFactory.unknownType();
        _mapDeserializer = deserializationcontext.handleSecondaryContextualization(_mapDeserializer, null, javatype);
        _listDeserializer = deserializationcontext.handleSecondaryContextualization(_listDeserializer, null, javatype);
        _stringDeserializer = deserializationcontext.handleSecondaryContextualization(_stringDeserializer, null, javatype);
        _numberDeserializer = deserializationcontext.handleSecondaryContextualization(_numberDeserializer, null, javatype);
    }

}
