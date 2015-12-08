// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind:
//            DatabindContext, SerializationConfig, JsonMappingException, JavaType, 
//            SerializationFeature, JsonSerializer, BeanProperty, AnnotationIntrospector

public abstract class SerializerProvider extends DatabindContext
{

    public static final JsonSerializer DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final JsonSerializer DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected static final JavaType TYPE_OBJECT = TypeFactory.defaultInstance().uncheckedSimpleType(java/lang/Object);
    protected transient ContextAttributes _attributes;
    public final SerializationConfig _config;
    protected DateFormat _dateFormat;
    protected JsonSerializer _keySerializer;
    protected final ReadOnlyClassToSerializerMap _knownSerializers;
    protected JsonSerializer _nullKeySerializer;
    protected JsonSerializer _nullValueSerializer;
    public final RootNameLookup _rootNames;
    protected final Class _serializationView;
    protected final SerializerCache _serializerCache;
    protected final SerializerFactory _serializerFactory;
    protected final boolean _stdNullValueSerializer;
    protected JsonSerializer _unknownTypeSerializer;

    public SerializerProvider()
    {
        _unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        _nullValueSerializer = NullSerializer.instance;
        _nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        _config = null;
        _serializerFactory = null;
        _serializerCache = new SerializerCache();
        _knownSerializers = null;
        _rootNames = new RootNameLookup();
        _serializationView = null;
        _attributes = null;
        _stdNullValueSerializer = true;
    }

    public SerializerProvider(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
    {
        _unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        _nullValueSerializer = NullSerializer.instance;
        _nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        if (serializationconfig == null)
        {
            throw new NullPointerException();
        }
        _serializerFactory = serializerfactory;
        _config = serializationconfig;
        _serializerCache = serializerprovider._serializerCache;
        _unknownTypeSerializer = serializerprovider._unknownTypeSerializer;
        _keySerializer = serializerprovider._keySerializer;
        _nullValueSerializer = serializerprovider._nullValueSerializer;
        _nullKeySerializer = serializerprovider._nullKeySerializer;
        boolean flag;
        if (_nullValueSerializer == DEFAULT_NULL_KEY_SERIALIZER)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _stdNullValueSerializer = flag;
        _rootNames = serializerprovider._rootNames;
        _knownSerializers = _serializerCache.getReadOnlyLookupMap();
        _serializationView = serializationconfig.getActiveView();
        _attributes = serializationconfig.getAttributes();
    }

    protected JsonSerializer _createAndCacheUntypedSerializer(JavaType javatype)
    {
        JsonSerializer jsonserializer;
        try
        {
            jsonserializer = _createUntypedSerializer(javatype);
        }
        // Misplaced declaration of an exception variable
        catch (JavaType javatype)
        {
            throw new JsonMappingException(javatype.getMessage(), null, javatype);
        }
        if (jsonserializer != null)
        {
            _serializerCache.addAndResolveNonTypedSerializer(javatype, jsonserializer, this);
        }
        return jsonserializer;
    }

    protected JsonSerializer _createAndCacheUntypedSerializer(Class class1)
    {
        JsonSerializer jsonserializer;
        try
        {
            jsonserializer = _createUntypedSerializer(_config.constructType(class1));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new JsonMappingException(class1.getMessage(), null, class1);
        }
        if (jsonserializer != null)
        {
            _serializerCache.addAndResolveNonTypedSerializer(class1, jsonserializer, this);
        }
        return jsonserializer;
    }

    protected JsonSerializer _createUntypedSerializer(JavaType javatype)
    {
        return _serializerFactory.createSerializer(this, javatype);
    }

    protected final DateFormat _dateFormat()
    {
        if (_dateFormat != null)
        {
            return _dateFormat;
        } else
        {
            DateFormat dateformat = (DateFormat)_config.getDateFormat().clone();
            _dateFormat = dateformat;
            return dateformat;
        }
    }

    protected JsonSerializer _handleContextualResolvable(JsonSerializer jsonserializer, BeanProperty beanproperty)
    {
        if (jsonserializer instanceof ResolvableSerializer)
        {
            ((ResolvableSerializer)jsonserializer).resolve(this);
        }
        return handleSecondaryContextualization(jsonserializer, beanproperty);
    }

    public JsonSerializer _handleResolvable(JsonSerializer jsonserializer)
    {
        if (jsonserializer instanceof ResolvableSerializer)
        {
            ((ResolvableSerializer)jsonserializer).resolve(this);
        }
        return jsonserializer;
    }

    public void _reportIncompatibleRootType(Object obj, JavaType javatype)
    {
        if (javatype.isPrimitive() && ClassUtil.wrapperType(javatype.getRawClass()).isAssignableFrom(obj.getClass()))
        {
            return;
        } else
        {
            throw new JsonMappingException((new StringBuilder("Incompatible types: declared root type (")).append(javatype).append(") vs ").append(obj.getClass().getName()).toString());
        }
    }

    public void defaultSerializeDateKey(long l, JsonGenerator jsongenerator)
    {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
        {
            jsongenerator.writeFieldName(String.valueOf(l));
            return;
        } else
        {
            jsongenerator.writeFieldName(_dateFormat().format(new Date(l)));
            return;
        }
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsongenerator)
    {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
        {
            jsongenerator.writeFieldName(String.valueOf(date.getTime()));
            return;
        } else
        {
            jsongenerator.writeFieldName(_dateFormat().format(date));
            return;
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsongenerator)
    {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS))
        {
            jsongenerator.writeNumber(date.getTime());
            return;
        } else
        {
            jsongenerator.writeString(_dateFormat().format(date));
            return;
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsongenerator)
    {
        if (_stdNullValueSerializer)
        {
            jsongenerator.writeNull();
            return;
        } else
        {
            _nullValueSerializer.serialize(null, jsongenerator, this);
            return;
        }
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsongenerator)
    {
        if (obj == null)
        {
            if (_stdNullValueSerializer)
            {
                jsongenerator.writeNull();
                return;
            } else
            {
                _nullValueSerializer.serialize(null, jsongenerator, this);
                return;
            }
        } else
        {
            findTypedValueSerializer(obj.getClass(), true, null).serialize(obj, jsongenerator, this);
            return;
        }
    }

    public JsonSerializer findKeySerializer(JavaType javatype, BeanProperty beanproperty)
    {
        return _handleContextualResolvable(_serializerFactory.createKeySerializer(_config, javatype, _keySerializer), beanproperty);
    }

    public JsonSerializer findNullKeySerializer(JavaType javatype, BeanProperty beanproperty)
    {
        return _nullKeySerializer;
    }

    public JsonSerializer findNullValueSerializer(BeanProperty beanproperty)
    {
        return _nullValueSerializer;
    }

    public abstract WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator);

    public JsonSerializer findPrimaryPropertySerializer(JavaType javatype, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(javatype);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                JsonSerializer jsonserializer3 = _createAndCacheUntypedSerializer(javatype);
                jsonserializer = jsonserializer3;
                if (jsonserializer3 == null)
                {
                    return getUnknownTypeSerializer(javatype.getRawClass());
                }
            }
        }
        return handlePrimaryContextualization(jsonserializer, beanproperty);
    }

    public JsonSerializer findPrimaryPropertySerializer(Class class1, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(class1);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                JsonSerializer jsonserializer3 = _serializerCache.untypedValueSerializer(_config.constructType(class1));
                jsonserializer = jsonserializer3;
                if (jsonserializer3 == null)
                {
                    JsonSerializer jsonserializer4 = _createAndCacheUntypedSerializer(class1);
                    jsonserializer = jsonserializer4;
                    if (jsonserializer4 == null)
                    {
                        return getUnknownTypeSerializer(class1);
                    }
                }
            }
        }
        return handlePrimaryContextualization(jsonserializer, beanproperty);
    }

    public JsonSerializer findTypedValueSerializer(JavaType javatype, boolean flag, BeanProperty beanproperty)
    {
        Object obj = _knownSerializers.typedValueSerializer(javatype);
        if (obj == null)
        {
            JsonSerializer jsonserializer = _serializerCache.typedValueSerializer(javatype);
            obj = jsonserializer;
            if (jsonserializer == null)
            {
                obj = findValueSerializer(javatype, beanproperty);
                TypeSerializer typeserializer = _serializerFactory.createTypeSerializer(_config, javatype);
                if (typeserializer != null)
                {
                    beanproperty = new TypeWrappedSerializer(typeserializer.forProperty(beanproperty), ((JsonSerializer) (obj)));
                } else
                {
                    beanproperty = ((BeanProperty) (obj));
                }
                obj = beanproperty;
                if (flag)
                {
                    _serializerCache.addTypedSerializer(javatype, beanproperty);
                    return beanproperty;
                }
            }
        }
        return ((JsonSerializer) (obj));
    }

    public JsonSerializer findTypedValueSerializer(Class class1, boolean flag, BeanProperty beanproperty)
    {
        Object obj = _knownSerializers.typedValueSerializer(class1);
        if (obj == null)
        {
            JsonSerializer jsonserializer = _serializerCache.typedValueSerializer(class1);
            obj = jsonserializer;
            if (jsonserializer == null)
            {
                obj = findValueSerializer(class1, beanproperty);
                TypeSerializer typeserializer = _serializerFactory.createTypeSerializer(_config, _config.constructType(class1));
                if (typeserializer != null)
                {
                    beanproperty = new TypeWrappedSerializer(typeserializer.forProperty(beanproperty), ((JsonSerializer) (obj)));
                } else
                {
                    beanproperty = ((BeanProperty) (obj));
                }
                obj = beanproperty;
                if (flag)
                {
                    _serializerCache.addTypedSerializer(class1, beanproperty);
                    return beanproperty;
                }
            }
        }
        return ((JsonSerializer) (obj));
    }

    public JsonSerializer findValueSerializer(JavaType javatype, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(javatype);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                JsonSerializer jsonserializer3 = _createAndCacheUntypedSerializer(javatype);
                jsonserializer = jsonserializer3;
                if (jsonserializer3 == null)
                {
                    return getUnknownTypeSerializer(javatype.getRawClass());
                }
            }
        }
        return handleSecondaryContextualization(jsonserializer, beanproperty);
    }

    public JsonSerializer findValueSerializer(Class class1, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(class1);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                JsonSerializer jsonserializer3 = _serializerCache.untypedValueSerializer(_config.constructType(class1));
                jsonserializer = jsonserializer3;
                if (jsonserializer3 == null)
                {
                    JsonSerializer jsonserializer4 = _createAndCacheUntypedSerializer(class1);
                    jsonserializer = jsonserializer4;
                    if (jsonserializer4 == null)
                    {
                        return getUnknownTypeSerializer(class1);
                    }
                }
            }
        }
        return handleSecondaryContextualization(jsonserializer, beanproperty);
    }

    public final Class getActiveView()
    {
        return _serializationView;
    }

    public final AnnotationIntrospector getAnnotationIntrospector()
    {
        return _config.getAnnotationIntrospector();
    }

    public final SerializationConfig getConfig()
    {
        return _config;
    }

    public volatile MapperConfig getConfig()
    {
        return getConfig();
    }

    public JsonSerializer getDefaultNullValueSerializer()
    {
        return _nullValueSerializer;
    }

    public final FilterProvider getFilterProvider()
    {
        return _config.getFilterProvider();
    }

    public Locale getLocale()
    {
        return _config.getLocale();
    }

    public TimeZone getTimeZone()
    {
        return _config.getTimeZone();
    }

    public final TypeFactory getTypeFactory()
    {
        return _config.getTypeFactory();
    }

    public JsonSerializer getUnknownTypeSerializer(Class class1)
    {
        return _unknownTypeSerializer;
    }

    public JsonSerializer handlePrimaryContextualization(JsonSerializer jsonserializer, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer1 = jsonserializer;
        if (jsonserializer != null)
        {
            jsonserializer1 = jsonserializer;
            if (jsonserializer instanceof ContextualSerializer)
            {
                jsonserializer1 = ((ContextualSerializer)jsonserializer).createContextual(this, beanproperty);
            }
        }
        return jsonserializer1;
    }

    public JsonSerializer handleSecondaryContextualization(JsonSerializer jsonserializer, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer1 = jsonserializer;
        if (jsonserializer != null)
        {
            jsonserializer1 = jsonserializer;
            if (jsonserializer instanceof ContextualSerializer)
            {
                jsonserializer1 = ((ContextualSerializer)jsonserializer).createContextual(this, beanproperty);
            }
        }
        return jsonserializer1;
    }

    public final boolean isEnabled(SerializationFeature serializationfeature)
    {
        return _config.isEnabled(serializationfeature);
    }

    public abstract JsonSerializer serializerInstance(Annotated annotated, Object obj);

}
