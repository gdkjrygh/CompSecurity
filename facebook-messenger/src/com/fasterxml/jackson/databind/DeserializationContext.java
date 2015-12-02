// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind:
//            DeserializationConfig, InjectableValues, JsonMappingException, DeserializationFeature, 
//            JsonDeserializer, JavaType, BeanProperty, KeyDeserializer, 
//            AnnotationIntrospector, MapperFeature

public abstract class DeserializationContext
{

    private static final int MAX_ERROR_STR_LEN = 500;
    protected ArrayBuilders _arrayBuilders;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected DateFormat _dateFormat;
    protected final DeserializerFactory _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected ObjectBuffer _objectBuffer;
    protected JsonParser _parser;
    protected final Class _view;

    protected DeserializationContext(DeserializationContext deserializationcontext, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
    {
        _cache = deserializationcontext._cache;
        _factory = deserializationcontext._factory;
        _config = deserializationconfig;
        _featureFlags = deserializationconfig.getDeserializationFeatures();
        _view = deserializationconfig.getActiveView();
        _parser = jsonparser;
        _injectableValues = injectablevalues;
    }

    protected DeserializationContext(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory)
    {
        _cache = deserializationcontext._cache;
        _factory = deserializerfactory;
        _config = deserializationcontext._config;
        _featureFlags = deserializationcontext._featureFlags;
        _view = deserializationcontext._view;
        _parser = deserializationcontext._parser;
        _injectableValues = deserializationcontext._injectableValues;
    }

    protected DeserializationContext(DeserializerFactory deserializerfactory)
    {
        this(deserializerfactory, ((DeserializerCache) (null)));
    }

    protected DeserializationContext(DeserializerFactory deserializerfactory, DeserializerCache deserializercache)
    {
        if (deserializerfactory == null)
        {
            throw new IllegalArgumentException("Can not pass null DeserializerFactory");
        }
        _factory = deserializerfactory;
        deserializerfactory = deserializercache;
        if (deserializercache == null)
        {
            deserializerfactory = new DeserializerCache();
        }
        _cache = deserializerfactory;
        _featureFlags = 0;
        _config = null;
        _injectableValues = null;
        _view = null;
    }

    protected String _calcName(Class class1)
    {
        if (class1.isArray())
        {
            return (new StringBuilder()).append(_calcName(class1.getComponentType())).append("[]").toString();
        } else
        {
            return class1.getName();
        }
    }

    protected String _desc(String s)
    {
        String s1 = s;
        if (s.length() > 500)
        {
            s1 = (new StringBuilder()).append(s.substring(0, 500)).append("]...[").append(s.substring(s.length() - 500)).toString();
        }
        return s1;
    }

    protected String _valueDesc()
    {
        String s;
        try
        {
            s = _desc(_parser.getText());
        }
        catch (Exception exception)
        {
            return "[N/A]";
        }
        return s;
    }

    public final boolean canOverrideAccessModifiers()
    {
        return _config.canOverrideAccessModifiers();
    }

    public Calendar constructCalendar(Date date)
    {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    public final JavaType constructType(Class class1)
    {
        return _config.constructType(class1);
    }

    public abstract JsonDeserializer deserializerInstance(Annotated annotated, Object obj);

    protected String determineClassName(Object obj)
    {
        return ClassUtil.getClassDescription(obj);
    }

    public Class findClass(String s)
    {
        return ClassUtil.findClass(s);
    }

    public final JsonDeserializer findContextualValueDeserializer(JavaType javatype, BeanProperty beanproperty)
    {
        JsonDeserializer jsondeserializer = _cache.findValueDeserializer(this, _factory, javatype);
        javatype = jsondeserializer;
        if (jsondeserializer != null)
        {
            javatype = jsondeserializer;
            if (jsondeserializer instanceof ContextualDeserializer)
            {
                javatype = ((ContextualDeserializer)jsondeserializer).createContextual(this, beanproperty);
            }
        }
        return javatype;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanproperty, Object obj1)
    {
        if (_injectableValues == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No 'injectableValues' configured, can not inject value with id [").append(obj).append("]").toString());
        } else
        {
            return _injectableValues.findInjectableValue(obj, this, beanproperty, obj1);
        }
    }

    public final KeyDeserializer findKeyDeserializer(JavaType javatype, BeanProperty beanproperty)
    {
        KeyDeserializer keydeserializer = _cache.findKeyDeserializer(this, _factory, javatype);
        javatype = keydeserializer;
        if (keydeserializer instanceof ContextualKeyDeserializer)
        {
            javatype = ((ContextualKeyDeserializer)keydeserializer).createContextual(this, beanproperty);
        }
        return javatype;
    }

    public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator);

    public final JsonDeserializer findRootValueDeserializer(JavaType javatype)
    {
        Object obj = _cache.findValueDeserializer(this, _factory, javatype);
        if (obj == null)
        {
            javatype = null;
        } else
        {
            JsonDeserializer jsondeserializer = ((JsonDeserializer) (obj));
            if (obj instanceof ContextualDeserializer)
            {
                jsondeserializer = ((ContextualDeserializer)obj).createContextual(this, null);
            }
            obj = _factory.findTypeDeserializer(_config, javatype);
            javatype = jsondeserializer;
            if (obj != null)
            {
                return new TypeWrappedDeserializer(((TypeDeserializer) (obj)).forProperty(null), jsondeserializer);
            }
        }
        return javatype;
    }

    public final Class getActiveView()
    {
        return _view;
    }

    public final AnnotationIntrospector getAnnotationIntrospector()
    {
        return _config.getAnnotationIntrospector();
    }

    public final ArrayBuilders getArrayBuilders()
    {
        if (_arrayBuilders == null)
        {
            _arrayBuilders = new ArrayBuilders();
        }
        return _arrayBuilders;
    }

    public final Base64Variant getBase64Variant()
    {
        return _config.getBase64Variant();
    }

    public DeserializationConfig getConfig()
    {
        return _config;
    }

    protected DateFormat getDateFormat()
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

    public Locale getLocale()
    {
        return _config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory()
    {
        return _config.getNodeFactory();
    }

    public final JsonParser getParser()
    {
        return _parser;
    }

    public TimeZone getTimeZone()
    {
        return _config.getTimeZone();
    }

    public final TypeFactory getTypeFactory()
    {
        return _config.getTypeFactory();
    }

    public boolean handleUnknownProperty(JsonParser jsonparser, JsonDeserializer jsondeserializer, Object obj, String s)
    {
        LinkedNode linkednode = _config.getProblemHandlers();
        if (linkednode != null)
        {
            for (; linkednode != null; linkednode = linkednode.next())
            {
                if (((DeserializationProblemHandler)linkednode.value()).handleUnknownProperty(this, jsonparser, jsondeserializer, obj, s))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean hasValueDeserializerFor(JavaType javatype)
    {
        return _cache.hasValueDeserializerFor(this, _factory, javatype);
    }

    public JsonMappingException instantiationException(Class class1, String s)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct instance of ").append(class1.getName()).append(", problem: ").append(s).toString());
    }

    public JsonMappingException instantiationException(Class class1, Throwable throwable)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct instance of ").append(class1.getName()).append(", problem: ").append(throwable.getMessage()).toString(), throwable);
    }

    public final boolean isEnabled(DeserializationFeature deserializationfeature)
    {
        return (_featureFlags & deserializationfeature.getMask()) != 0;
    }

    public final boolean isEnabled(MapperFeature mapperfeature)
    {
        return _config.isEnabled(mapperfeature);
    }

    public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj);

    public final ObjectBuffer leaseObjectBuffer()
    {
        ObjectBuffer objectbuffer = _objectBuffer;
        if (objectbuffer == null)
        {
            return new ObjectBuffer();
        } else
        {
            _objectBuffer = null;
            return objectbuffer;
        }
    }

    public JsonMappingException mappingException(Class class1)
    {
        return mappingException(class1, _parser.getCurrentToken());
    }

    public JsonMappingException mappingException(Class class1, JsonToken jsontoken)
    {
        class1 = _calcName(class1);
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not deserialize instance of ").append(class1).append(" out of ").append(jsontoken).append(" token").toString());
    }

    public JsonMappingException mappingException(String s)
    {
        return JsonMappingException.from(getParser(), s);
    }

    public abstract ObjectIdGenerator objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectidinfo);

    public Date parseDate(String s)
    {
        Date date;
        try
        {
            date = getDateFormat().parse(s);
        }
        catch (ParseException parseexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to parse Date value '").append(s).append("': ").append(parseexception.getMessage()).toString());
        }
        return date;
    }

    public void reportUnknownProperty(Object obj, String s, JsonDeserializer jsondeserializer)
    {
        if (!isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES))
        {
            return;
        }
        if (jsondeserializer == null)
        {
            jsondeserializer = null;
        } else
        {
            jsondeserializer = jsondeserializer.getKnownPropertyNames();
        }
        throw UnrecognizedPropertyException.from(_parser, obj, s, jsondeserializer);
    }

    public final void returnObjectBuffer(ObjectBuffer objectbuffer)
    {
        if (_objectBuffer == null || objectbuffer.initialCapacity() >= _objectBuffer.initialCapacity())
        {
            _objectBuffer = objectbuffer;
        }
    }

    public JsonMappingException unknownTypeException(JavaType javatype, String s)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Could not resolve type id '").append(s).append("' into a subtype of ").append(javatype).toString());
    }

    public JsonMappingException weirdKeyException(Class class1, String s, String s1)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct Map key of type ").append(class1.getName()).append(" from String \"").append(_desc(s)).append("\": ").append(s1).toString());
    }

    public JsonMappingException weirdNumberException(Class class1, String s)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct instance of ").append(class1.getName()).append(" from number value (").append(_valueDesc()).append("): ").append(s).toString());
    }

    public JsonMappingException weirdStringException(Class class1, String s)
    {
        return JsonMappingException.from(_parser, (new StringBuilder()).append("Can not construct instance of ").append(class1.getName()).append(" from String value '").append(_valueDesc()).append("': ").append(s).toString());
    }

    public JsonMappingException wrongTokenException(JsonParser jsonparser, JsonToken jsontoken, String s)
    {
        return JsonMappingException.from(jsonparser, (new StringBuilder()).append("Unexpected token (").append(jsonparser.getCurrentToken()).append("), expected ").append(jsontoken).append(": ").append(s).toString());
    }
}
