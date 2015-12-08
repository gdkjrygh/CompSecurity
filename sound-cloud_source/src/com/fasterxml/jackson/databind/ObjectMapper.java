// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonNode, MappingJsonFactory, SerializationConfig, DeserializationConfig, 
//            JsonMappingException, SerializationFeature, JsonDeserializer, DeserializationContext, 
//            MapperFeature, ObjectReader, AnnotationIntrospector, JavaType, 
//            InjectableValues, DeserializationFeature

public class ObjectMapper extends ObjectCodec
    implements Serializable
{

    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    protected static final ClassIntrospector DEFAULT_INTROSPECTOR;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
    protected static final VisibilityChecker STD_VISIBILITY_CHECKER;
    protected static final PrettyPrinter _defaultPrettyPrinter = new DefaultPrettyPrinter();
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected final HashMap _mixInAnnotations;
    protected final ConcurrentHashMap _rootDeserializers;
    protected final RootNameLookup _rootNames;
    protected SerializationConfig _serializationConfig;
    protected SerializerFactory _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected SubtypeResolver _subtypeResolver;
    protected TypeFactory _typeFactory;

    public ObjectMapper()
    {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonfactory)
    {
        this(jsonfactory, null, null);
    }

    public ObjectMapper(JsonFactory jsonfactory, DefaultSerializerProvider defaultserializerprovider, DefaultDeserializationContext defaultdeserializationcontext)
    {
        _mixInAnnotations = new HashMap();
        _rootDeserializers = new ConcurrentHashMap(64, 0.6F, 2);
        if (jsonfactory != null) goto _L2; else goto _L1
_L1:
        _jsonFactory = new MappingJsonFactory(this);
_L4:
        _subtypeResolver = new StdSubtypeResolver();
        _rootNames = new RootNameLookup();
        _typeFactory = TypeFactory.defaultInstance();
        _serializationConfig = new SerializationConfig(DEFAULT_BASE, _subtypeResolver, _mixInAnnotations);
        _deserializationConfig = new DeserializationConfig(DEFAULT_BASE, _subtypeResolver, _mixInAnnotations);
        jsonfactory = defaultserializerprovider;
        if (defaultserializerprovider == null)
        {
            jsonfactory = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        }
        _serializerProvider = jsonfactory;
        jsonfactory = defaultdeserializationcontext;
        if (defaultdeserializationcontext == null)
        {
            jsonfactory = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance);
        }
        _deserializationContext = jsonfactory;
        _serializerFactory = BeanSerializerFactory.instance;
        return;
_L2:
        _jsonFactory = jsonfactory;
        if (jsonfactory.getCodec() == null)
        {
            _jsonFactory.setCodec(this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final void _configAndWriteCloseable(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        Closeable closeable;
        Object obj1;
        obj1 = null;
        closeable = (Closeable)obj;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
        jsongenerator.close();
        closeable.close();
        return;
        serializationconfig;
        obj = jsongenerator;
        jsongenerator = serializationconfig;
        serializationconfig = ((SerializationConfig) (obj));
        obj = closeable;
_L2:
        if (serializationconfig != null)
        {
            try
            {
                serializationconfig.close();
            }
            // Misplaced declaration of an exception variable
            catch (SerializationConfig serializationconfig) { }
        }
        if (obj != null)
        {
            try
            {
                ((Closeable) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw jsongenerator;
        jsongenerator;
        obj = closeable;
        serializationconfig = obj1;
        continue; /* Loop/switch isn't completed */
        jsongenerator;
        obj = null;
        serializationconfig = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private final void _writeCloseableValue(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        Closeable closeable = (Closeable)obj;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
        if (serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
        {
            jsongenerator.flush();
        }
        serializationconfig = null;
        closeable.close();
        return;
        obj;
        jsongenerator = closeable;
        serializationconfig = jsongenerator;
        jsongenerator = ((JsonGenerator) (obj));
_L2:
        if (serializationconfig != null)
        {
            try
            {
                serializationconfig.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw jsongenerator;
        jsongenerator;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        SerializationConfig serializationconfig;
        boolean flag;
        serializationconfig = getSerializationConfig();
        if (serializationconfig.isEnabled(SerializationFeature.INDENT_OUTPUT))
        {
            jsongenerator.useDefaultPrettyPrinter();
        }
        if (serializationconfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
        {
            _configAndWriteCloseable(jsongenerator, obj, serializationconfig);
            return;
        }
        flag = false;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
        flag = true;
        jsongenerator.close();
        return;
        obj;
        if (!flag)
        {
            try
            {
                jsongenerator.close();
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
        }
        throw obj;
    }

    protected JsonDeserializer _findRootDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer = (JsonDeserializer)_rootDeserializers.get(javatype);
        if (jsondeserializer != null)
        {
            return jsondeserializer;
        }
        deserializationcontext = deserializationcontext.findRootValueDeserializer(javatype);
        if (deserializationcontext == null)
        {
            throw new JsonMappingException((new StringBuilder("Can not find a deserializer for type ")).append(javatype).toString());
        } else
        {
            _rootDeserializers.put(javatype, deserializationcontext);
            return deserializationcontext;
        }
    }

    protected JsonToken _initForReading(JsonParser jsonparser)
        throws IOException, JsonParseException, JsonMappingException
    {
        JsonToken jsontoken1 = jsonparser.getCurrentToken();
        JsonToken jsontoken = jsontoken1;
        if (jsontoken1 == null)
        {
            JsonToken jsontoken2 = jsonparser.nextToken();
            jsontoken = jsontoken2;
            if (jsontoken2 == null)
            {
                throw JsonMappingException.from(jsonparser, "No content to map due to end-of-input");
            }
        }
        return jsontoken;
    }

    protected Object _readMapAndClose(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        Object obj = _initForReading(jsonparser);
        if (obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        javatype = ((JavaType) (_findRootDeserializer(createDeserializationContext(jsonparser, getDeserializationConfig()), javatype).getNullValue()));
_L3:
        jsonparser.clearCurrentToken();
        DefaultDeserializationContext defaultdeserializationcontext;
        JsonDeserializer jsondeserializer;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            return javatype;
        }
        return javatype;
_L2:
        if (obj == JsonToken.END_ARRAY || obj == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_128;
        }
label0:
        {
            obj = getDeserializationConfig();
            defaultdeserializationcontext = createDeserializationContext(jsonparser, ((DeserializationConfig) (obj)));
            jsondeserializer = _findRootDeserializer(defaultdeserializationcontext, javatype);
            if (!((DeserializationConfig) (obj)).useRootWrapping())
            {
                break label0;
            }
            javatype = ((JavaType) (_unwrapAndDeserialize(jsonparser, defaultdeserializationcontext, ((DeserializationConfig) (obj)), javatype, jsondeserializer)));
        }
          goto _L3
        javatype = ((JavaType) (jsondeserializer.deserialize(jsonparser, defaultdeserializationcontext)));
          goto _L3
        javatype;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser) { }
        throw javatype;
        javatype = null;
          goto _L3
    }

    protected Object _readValue(DeserializationConfig deserializationconfig, JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        JsonToken jsontoken = _initForReading(jsonparser);
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            deserializationconfig = ((DeserializationConfig) (_findRootDeserializer(createDeserializationContext(jsonparser, deserializationconfig), javatype).getNullValue()));
        } else
        if (jsontoken == JsonToken.END_ARRAY || jsontoken == JsonToken.END_OBJECT)
        {
            deserializationconfig = null;
        } else
        {
            DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser, deserializationconfig);
            JsonDeserializer jsondeserializer = _findRootDeserializer(defaultdeserializationcontext, javatype);
            if (deserializationconfig.useRootWrapping())
            {
                deserializationconfig = ((DeserializationConfig) (_unwrapAndDeserialize(jsonparser, defaultdeserializationcontext, deserializationconfig, javatype, jsondeserializer)));
            } else
            {
                deserializationconfig = ((DeserializationConfig) (jsondeserializer.deserialize(jsonparser, defaultdeserializationcontext)));
            }
        }
        jsonparser.clearCurrentToken();
        return deserializationconfig;
    }

    protected DefaultSerializerProvider _serializerProvider(SerializationConfig serializationconfig)
    {
        return _serializerProvider.createInstance(serializationconfig, _serializerFactory);
    }

    protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer)
        throws IOException, JsonParseException, JsonMappingException
    {
        String s1 = deserializationconfig.getRootName();
        String s = s1;
        if (s1 == null)
        {
            s = _rootNames.findRootName(javatype, deserializationconfig).getValue();
        }
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Current token not START_OBJECT (needed to unwrap root name '")).append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Current token not FIELD_NAME (to contain expected root name '")).append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        deserializationconfig = jsonparser.getCurrentName();
        if (!s.equals(deserializationconfig))
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Root name '")).append(deserializationconfig).append("' does not match expected ('").append(s).append("') for type ").append(javatype).toString());
        }
        jsonparser.nextToken();
        deserializationcontext = ((DeserializationContext) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
        if (jsonparser.nextToken() != JsonToken.END_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Current token not END_OBJECT (to match wrapper object with root name '")).append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        } else
        {
            return deserializationcontext;
        }
    }

    public ObjectMapper configure(DeserializationFeature deserializationfeature, boolean flag)
    {
        if (flag)
        {
            deserializationfeature = _deserializationConfig.with(deserializationfeature);
        } else
        {
            deserializationfeature = _deserializationConfig.without(deserializationfeature);
        }
        _deserializationConfig = deserializationfeature;
        return this;
    }

    public ObjectMapper configure(MapperFeature mapperfeature, boolean flag)
    {
        SerializationConfig serializationconfig;
        if (flag)
        {
            serializationconfig = _serializationConfig.with(new MapperFeature[] {
                mapperfeature
            });
        } else
        {
            serializationconfig = _serializationConfig.without(new MapperFeature[] {
                mapperfeature
            });
        }
        _serializationConfig = serializationconfig;
        if (flag)
        {
            mapperfeature = _deserializationConfig.with(new MapperFeature[] {
                mapperfeature
            });
        } else
        {
            mapperfeature = _deserializationConfig.without(new MapperFeature[] {
                mapperfeature
            });
        }
        _deserializationConfig = mapperfeature;
        return this;
    }

    public ObjectMapper configure(SerializationFeature serializationfeature, boolean flag)
    {
        if (flag)
        {
            serializationfeature = _serializationConfig.with(serializationfeature);
        } else
        {
            serializationfeature = _serializationConfig.without(serializationfeature);
        }
        _serializationConfig = serializationfeature;
        return this;
    }

    protected final DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return _deserializationContext.createInstance(deserializationconfig, jsonparser, _injectableValues);
    }

    public DeserializationConfig getDeserializationConfig()
    {
        return _deserializationConfig;
    }

    public JsonFactory getFactory()
    {
        return _jsonFactory;
    }

    public JsonFactory getJsonFactory()
    {
        return _jsonFactory;
    }

    public SerializationConfig getSerializationConfig()
    {
        return _serializationConfig;
    }

    public TypeFactory getTypeFactory()
    {
        return _typeFactory;
    }

    public Object readValue(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(getDeserializationConfig(), jsonparser, javatype);
    }

    public Object readValue(JsonParser jsonparser, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(getDeserializationConfig(), jsonparser, _typeFactory.constructType(class1));
    }

    public Object readValue(InputStream inputstream, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(inputstream), _typeFactory.constructType(class1));
    }

    public Object readValue(String s, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(s), javatype);
    }

    public ObjectReader reader()
    {
        return (new ObjectReader(this, getDeserializationConfig())).with(_injectableValues);
    }

    public ObjectMapper setDateFormat(DateFormat dateformat)
    {
        _deserializationConfig = _deserializationConfig.with(dateformat);
        _serializationConfig = _serializationConfig.with(dateformat);
        return this;
    }

    public void writeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        SerializationConfig serializationconfig = getSerializationConfig();
        if (serializationconfig.isEnabled(SerializationFeature.INDENT_OUTPUT))
        {
            jsongenerator.useDefaultPrettyPrinter();
        }
        if (serializationconfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
        {
            _writeCloseableValue(jsongenerator, obj, serializationconfig);
        } else
        {
            _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
            if (serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
            {
                jsongenerator.flush();
                return;
            }
        }
    }

    public String writeValueAsString(Object obj)
        throws JsonProcessingException
    {
        SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_jsonFactory._getBufferRecycler());
        try
        {
            _configAndWriteValue(_jsonFactory.createJsonGenerator(segmentedstringwriter), obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw JsonMappingException.fromUnexpectedIOE(((IOException) (obj)));
        }
        return segmentedstringwriter.getAndClear();
    }

    static 
    {
        DEFAULT_INTROSPECTOR = BasicClassIntrospector.instance;
        DEFAULT_ANNOTATION_INTROSPECTOR = new JacksonAnnotationIntrospector();
        STD_VISIBILITY_CHECKER = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
        DEFAULT_BASE = new BaseSettings(DEFAULT_INTROSPECTOR, DEFAULT_ANNOTATION_INTROSPECTOR, STD_VISIBILITY_CHECKER, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), TimeZone.getTimeZone("GMT"), Base64Variants.getDefaultVariant());
    }
}
