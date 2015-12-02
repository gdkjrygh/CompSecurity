// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.DatabindVersion;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonNode, MappingJsonFactory, SerializationConfig, DeserializationConfig, 
//            SerializationFeature, JsonDeserializer, DeserializationContext, JsonMappingException, 
//            MapperFeature, JavaType, MappingIterator, ObjectReader, 
//            Module, ObjectWriter, AnnotationIntrospector, InjectableValues, 
//            DeserializationFeature, SerializerProvider, PropertyNamingStrategy

public class ObjectMapper extends ObjectCodec
    implements Versioned
{

    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    protected static final ClassIntrospector DEFAULT_INTROSPECTOR;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
    protected static final VisibilityChecker STD_VISIBILITY_CHECKER;
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
    {
        Closeable closeable;
        Object obj1;
        obj1 = null;
        closeable = (Closeable)obj;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
        jsongenerator.close();
        closeable.close();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        throw new NullPointerException();
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
        return;
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
    {
        Closeable closeable = (Closeable)obj;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
        if (serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
        {
            jsongenerator.flush();
        }
        obj = null;
        closeable.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        throw new NullPointerException();
        return;
        jsongenerator;
        obj = closeable;
_L2:
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
        return;
        jsongenerator;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
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

    protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj, Class class1)
    {
        boolean flag;
        class1 = getSerializationConfig().withView(class1);
        if (class1.isEnabled(SerializationFeature.INDENT_OUTPUT))
        {
            jsongenerator.useDefaultPrettyPrinter();
        }
        if (class1.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
        {
            _configAndWriteCloseable(jsongenerator, obj, class1);
            return;
        }
        flag = false;
        _serializerProvider(class1).serializeValue(jsongenerator, obj);
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

    protected Object _convert(Object obj, JavaType javatype)
    {
        Object obj1 = new TokenBuffer(this);
        JsonToken jsontoken;
        _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(((JsonGenerator) (obj1)), obj);
        obj1 = ((TokenBuffer) (obj1)).asParser();
        obj = getDeserializationConfig();
        jsontoken = _initForReading(((JsonParser) (obj1)));
        if (jsontoken != JsonToken.VALUE_NULL)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = _findRootDeserializer(createDeserializationContext(((JsonParser) (obj1)), ((DeserializationConfig) (obj))), javatype).getNullValue();
_L1:
        ((JsonParser) (obj1)).close();
        return obj;
        if (jsontoken != JsonToken.END_ARRAY && jsontoken != JsonToken.END_OBJECT)
        {
            try
            {
                obj = createDeserializationContext(((JsonParser) (obj1)), ((DeserializationConfig) (obj)));
                obj = _findRootDeserializer(((DeserializationContext) (obj)), javatype).deserialize(((JsonParser) (obj1)), ((DeserializationContext) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
            }
        } else
        {
            obj = null;
        }
          goto _L1
    }

    protected PrettyPrinter _defaultPrettyPrinter()
    {
        return new DefaultPrettyPrinter();
    }

    protected JsonDeserializer _findRootDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
    {
        JsonDeserializer jsondeserializer = (JsonDeserializer)_rootDeserializers.get(javatype);
        if (jsondeserializer != null)
        {
            return jsondeserializer;
        }
        deserializationcontext = deserializationcontext.findRootValueDeserializer(javatype);
        if (deserializationcontext == null)
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not find a deserializer for type ").append(javatype).toString());
        } else
        {
            _rootDeserializers.put(javatype, deserializationcontext);
            return deserializationcontext;
        }
    }

    protected JsonToken _initForReading(JsonParser jsonparser)
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
    {
        String s1 = deserializationconfig.getRootName();
        String s = s1;
        if (s1 == null)
        {
            s = _rootNames.findRootName(javatype, deserializationconfig).getValue();
        }
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not START_OBJECT (needed to unwrap root name '").append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not FIELD_NAME (to contain expected root name '").append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        deserializationconfig = jsonparser.getCurrentName();
        if (!s.equals(deserializationconfig))
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Root name '").append(deserializationconfig).append("' does not match expected ('").append(s).append("') for type ").append(javatype).toString());
        }
        jsonparser.nextToken();
        deserializationcontext = ((DeserializationContext) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
        if (jsonparser.nextToken() != JsonToken.END_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not END_OBJECT (to match wrapper object with root name '").append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        } else
        {
            return deserializationcontext;
        }
    }

    public ObjectMapper addHandler(DeserializationProblemHandler deserializationproblemhandler)
    {
        _deserializationConfig = _deserializationConfig.withHandler(deserializationproblemhandler);
        return this;
    }

    public final void addMixInAnnotations(Class class1, Class class2)
    {
        _mixInAnnotations.put(new ClassKey(class1), class2);
    }

    public boolean canDeserialize(JavaType javatype)
    {
        return createDeserializationContext(null, getDeserializationConfig()).hasValueDeserializerFor(javatype);
    }

    public boolean canSerialize(Class class1)
    {
        return _serializerProvider(getSerializationConfig()).hasSerializerFor(class1);
    }

    public ObjectMapper clearProblemHandlers()
    {
        _deserializationConfig = _deserializationConfig.withNoProblemHandlers();
        return this;
    }

    public ObjectMapper configure(com.fasterxml.jackson.core.JsonGenerator.Feature feature, boolean flag)
    {
        _jsonFactory.configure(feature, flag);
        return this;
    }

    public ObjectMapper configure(com.fasterxml.jackson.core.JsonParser.Feature feature, boolean flag)
    {
        _jsonFactory.configure(feature, flag);
        return this;
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

    public JavaType constructType(Type type)
    {
        return _typeFactory.constructType(type);
    }

    public Object convertValue(Object obj, TypeReference typereference)
    {
        return convertValue(obj, _typeFactory.constructType(typereference));
    }

    public Object convertValue(Object obj, JavaType javatype)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return obj1;
_L2:
        Class class1;
        class1 = javatype.getRawClass();
        if (class1 == java/lang/Object || javatype.hasGenericTypes())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (class1.isAssignableFrom(obj.getClass())) goto _L4; else goto _L3
_L3:
        return _convert(obj, javatype);
    }

    public Object convertValue(Object obj, Class class1)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L4:
        return obj1;
_L2:
        if (class1 == java/lang/Object)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (class1.isAssignableFrom(obj.getClass())) goto _L4; else goto _L3
_L3:
        return _convert(obj, _typeFactory.constructType(class1));
    }

    public volatile TreeNode createArrayNode()
    {
        return createArrayNode();
    }

    public ArrayNode createArrayNode()
    {
        return _deserializationConfig.getNodeFactory().arrayNode();
    }

    protected final DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return _deserializationContext.createInstance(deserializationconfig, jsonparser, _injectableValues);
    }

    public volatile TreeNode createObjectNode()
    {
        return createObjectNode();
    }

    public ObjectNode createObjectNode()
    {
        return _deserializationConfig.getNodeFactory().objectNode();
    }

    public ObjectMapper disable(DeserializationFeature deserializationfeature)
    {
        _deserializationConfig = _deserializationConfig.without(deserializationfeature);
        return this;
    }

    public transient ObjectMapper disable(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
    {
        _deserializationConfig = _deserializationConfig.without(deserializationfeature, adeserializationfeature);
        return this;
    }

    public ObjectMapper disable(SerializationFeature serializationfeature)
    {
        _serializationConfig = _serializationConfig.without(serializationfeature);
        return this;
    }

    public transient ObjectMapper disable(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
    {
        _serializationConfig = _serializationConfig.without(serializationfeature, aserializationfeature);
        return this;
    }

    public transient ObjectMapper disable(MapperFeature amapperfeature[])
    {
        _deserializationConfig = _deserializationConfig.without(amapperfeature);
        _serializationConfig = _serializationConfig.without(amapperfeature);
        return this;
    }

    public ObjectMapper disableDefaultTyping()
    {
        return setDefaultTyping(null);
    }

    public ObjectMapper enable(DeserializationFeature deserializationfeature)
    {
        _deserializationConfig = _deserializationConfig.with(deserializationfeature);
        return this;
    }

    public transient ObjectMapper enable(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
    {
        _deserializationConfig = _deserializationConfig.with(deserializationfeature, adeserializationfeature);
        return this;
    }

    public ObjectMapper enable(SerializationFeature serializationfeature)
    {
        _serializationConfig = _serializationConfig.with(serializationfeature);
        return this;
    }

    public transient ObjectMapper enable(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
    {
        _serializationConfig = _serializationConfig.with(serializationfeature, aserializationfeature);
        return this;
    }

    public transient ObjectMapper enable(MapperFeature amapperfeature[])
    {
        _deserializationConfig = _deserializationConfig.with(amapperfeature);
        _serializationConfig = _serializationConfig.with(amapperfeature);
        return this;
    }

    public ObjectMapper enableDefaultTyping()
    {
        return enableDefaultTyping(DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaulttyping)
    {
        return enableDefaultTyping(defaulttyping, com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaulttyping, com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
    {
        return setDefaultTyping((new DefaultTypeResolverBuilder(defaulttyping)).init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, null).inclusion(as));
    }

    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaulttyping, String s)
    {
        return setDefaultTyping((new DefaultTypeResolverBuilder(defaulttyping)).init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, null).inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY).typeProperty(s));
    }

    public final Class findMixInClassFor(Class class1)
    {
        if (_mixInAnnotations == null)
        {
            return null;
        } else
        {
            return (Class)_mixInAnnotations.get(new ClassKey(class1));
        }
    }

    public JsonSchema generateJsonSchema(Class class1)
    {
        return _serializerProvider(getSerializationConfig()).generateJsonSchema(class1);
    }

    public DeserializationConfig getDeserializationConfig()
    {
        return _deserializationConfig;
    }

    public JsonFactory getJsonFactory()
    {
        return _jsonFactory;
    }

    public JsonNodeFactory getNodeFactory()
    {
        return _deserializationConfig.getNodeFactory();
    }

    public SerializationConfig getSerializationConfig()
    {
        return _serializationConfig;
    }

    public SerializerProvider getSerializerProvider()
    {
        return _serializerProvider;
    }

    public SubtypeResolver getSubtypeResolver()
    {
        return _subtypeResolver;
    }

    public TypeFactory getTypeFactory()
    {
        return _typeFactory;
    }

    public VisibilityChecker getVisibilityChecker()
    {
        return _serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature feature)
    {
        return _jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return _jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
    {
        return _jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(DeserializationFeature deserializationfeature)
    {
        return _deserializationConfig.isEnabled(deserializationfeature);
    }

    public boolean isEnabled(MapperFeature mapperfeature)
    {
        return _serializationConfig.isEnabled(mapperfeature);
    }

    public boolean isEnabled(SerializationFeature serializationfeature)
    {
        return _serializationConfig.isEnabled(serializationfeature);
    }

    public final int mixInCount()
    {
        if (_mixInAnnotations == null)
        {
            return 0;
        } else
        {
            return _mixInAnnotations.size();
        }
    }

    public TreeNode readTree(JsonParser jsonparser)
    {
        Object obj = getDeserializationConfig();
        if (jsonparser.getCurrentToken() == null && jsonparser.nextToken() == null)
        {
            jsonparser = null;
        } else
        {
            obj = (JsonNode)_readValue(((DeserializationConfig) (obj)), jsonparser, JSON_NODE_TYPE);
            jsonparser = ((JsonParser) (obj));
            if (obj == null)
            {
                return getNodeFactory().nullNode();
            }
        }
        return jsonparser;
    }

    public JsonNode readTree(File file)
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(file), JSON_NODE_TYPE);
        file = jsonnode;
        if (jsonnode == null)
        {
            file = NullNode.instance;
        }
        return file;
    }

    public JsonNode readTree(InputStream inputstream)
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(inputstream), JSON_NODE_TYPE);
        inputstream = jsonnode;
        if (jsonnode == null)
        {
            inputstream = NullNode.instance;
        }
        return inputstream;
    }

    public JsonNode readTree(Reader reader1)
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(reader1), JSON_NODE_TYPE);
        reader1 = jsonnode;
        if (jsonnode == null)
        {
            reader1 = NullNode.instance;
        }
        return reader1;
    }

    public JsonNode readTree(String s)
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(s), JSON_NODE_TYPE);
        s = jsonnode;
        if (jsonnode == null)
        {
            s = NullNode.instance;
        }
        return s;
    }

    public JsonNode readTree(URL url)
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(url), JSON_NODE_TYPE);
        url = jsonnode;
        if (jsonnode == null)
        {
            url = NullNode.instance;
        }
        return url;
    }

    public JsonNode readTree(byte abyte0[])
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(abyte0), JSON_NODE_TYPE);
        abyte0 = jsonnode;
        if (jsonnode == null)
        {
            abyte0 = NullNode.instance;
        }
        return abyte0;
    }

    public final Object readValue(JsonParser jsonparser, ResolvedType resolvedtype)
    {
        return _readValue(getDeserializationConfig(), jsonparser, (JavaType)resolvedtype);
    }

    public Object readValue(JsonParser jsonparser, TypeReference typereference)
    {
        return _readValue(getDeserializationConfig(), jsonparser, _typeFactory.constructType(typereference));
    }

    public Object readValue(JsonParser jsonparser, JavaType javatype)
    {
        return _readValue(getDeserializationConfig(), jsonparser, javatype);
    }

    public Object readValue(JsonParser jsonparser, Class class1)
    {
        return _readValue(getDeserializationConfig(), jsonparser, _typeFactory.constructType(class1));
    }

    public Object readValue(File file, TypeReference typereference)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(file), _typeFactory.constructType(typereference));
    }

    public Object readValue(File file, JavaType javatype)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(file), javatype);
    }

    public Object readValue(File file, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(file), _typeFactory.constructType(class1));
    }

    public Object readValue(InputStream inputstream, TypeReference typereference)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(inputstream), _typeFactory.constructType(typereference));
    }

    public Object readValue(InputStream inputstream, JavaType javatype)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(inputstream), javatype);
    }

    public Object readValue(InputStream inputstream, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(inputstream), _typeFactory.constructType(class1));
    }

    public Object readValue(Reader reader1, TypeReference typereference)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(reader1), _typeFactory.constructType(typereference));
    }

    public Object readValue(Reader reader1, JavaType javatype)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(reader1), javatype);
    }

    public Object readValue(Reader reader1, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(reader1), _typeFactory.constructType(class1));
    }

    public Object readValue(String s, TypeReference typereference)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(s), _typeFactory.constructType(typereference));
    }

    public Object readValue(String s, JavaType javatype)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(s), javatype);
    }

    public Object readValue(String s, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(s), _typeFactory.constructType(class1));
    }

    public Object readValue(URL url, TypeReference typereference)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(url), _typeFactory.constructType(typereference));
    }

    public Object readValue(URL url, JavaType javatype)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(url), javatype);
    }

    public Object readValue(URL url, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(url), _typeFactory.constructType(class1));
    }

    public Object readValue(byte abyte0[], int i, int j, TypeReference typereference)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0, i, j), _typeFactory.constructType(typereference));
    }

    public Object readValue(byte abyte0[], int i, int j, JavaType javatype)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0, i, j), javatype);
    }

    public Object readValue(byte abyte0[], int i, int j, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0, i, j), _typeFactory.constructType(class1));
    }

    public Object readValue(byte abyte0[], TypeReference typereference)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0), _typeFactory.constructType(typereference));
    }

    public Object readValue(byte abyte0[], JavaType javatype)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0), javatype);
    }

    public Object readValue(byte abyte0[], Class class1)
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0), _typeFactory.constructType(class1));
    }

    public MappingIterator readValues(JsonParser jsonparser, ResolvedType resolvedtype)
    {
        return readValues(jsonparser, (JavaType)resolvedtype);
    }

    public MappingIterator readValues(JsonParser jsonparser, TypeReference typereference)
    {
        return readValues(jsonparser, _typeFactory.constructType(typereference));
    }

    public MappingIterator readValues(JsonParser jsonparser, JavaType javatype)
    {
        DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser, getDeserializationConfig());
        return new MappingIterator(javatype, jsonparser, defaultdeserializationcontext, _findRootDeserializer(defaultdeserializationcontext, javatype), false, null);
    }

    public MappingIterator readValues(JsonParser jsonparser, Class class1)
    {
        return readValues(jsonparser, _typeFactory.constructType(class1));
    }

    public volatile Iterator readValues(JsonParser jsonparser, ResolvedType resolvedtype)
    {
        return readValues(jsonparser, resolvedtype);
    }

    public volatile Iterator readValues(JsonParser jsonparser, TypeReference typereference)
    {
        return readValues(jsonparser, typereference);
    }

    public volatile Iterator readValues(JsonParser jsonparser, Class class1)
    {
        return readValues(jsonparser, class1);
    }

    public ObjectReader reader()
    {
        return (new ObjectReader(this, getDeserializationConfig())).with(_injectableValues);
    }

    public ObjectReader reader(FormatSchema formatschema)
    {
        return new ObjectReader(this, getDeserializationConfig(), null, null, formatschema, _injectableValues);
    }

    public ObjectReader reader(TypeReference typereference)
    {
        return reader(_typeFactory.constructType(typereference));
    }

    public ObjectReader reader(DeserializationFeature deserializationfeature)
    {
        return new ObjectReader(this, getDeserializationConfig().with(deserializationfeature));
    }

    public transient ObjectReader reader(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
    {
        return new ObjectReader(this, getDeserializationConfig().with(deserializationfeature, adeserializationfeature));
    }

    public ObjectReader reader(InjectableValues injectablevalues)
    {
        return new ObjectReader(this, getDeserializationConfig(), null, null, null, injectablevalues);
    }

    public ObjectReader reader(JavaType javatype)
    {
        return new ObjectReader(this, getDeserializationConfig(), javatype, null, null, _injectableValues);
    }

    public ObjectReader reader(JsonNodeFactory jsonnodefactory)
    {
        return (new ObjectReader(this, getDeserializationConfig())).with(jsonnodefactory);
    }

    public ObjectReader reader(Class class1)
    {
        return reader(_typeFactory.constructType(class1));
    }

    public ObjectReader readerForUpdating(Object obj)
    {
        JavaType javatype = _typeFactory.constructType(obj.getClass());
        return new ObjectReader(this, getDeserializationConfig(), javatype, obj, null, _injectableValues);
    }

    public ObjectReader readerWithView(Class class1)
    {
        return new ObjectReader(this, getDeserializationConfig().withView(class1));
    }

    public ObjectMapper registerModule(Module module)
    {
        if (module.getModuleName() == null)
        {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (module.version() == null)
        {
            throw new IllegalArgumentException("Module without defined version");
        } else
        {
            module.setupModule(new _cls1());
            return this;
        }
    }

    public transient void registerSubtypes(NamedType anamedtype[])
    {
        getSubtypeResolver().registerSubtypes(anamedtype);
    }

    public transient void registerSubtypes(Class aclass[])
    {
        getSubtypeResolver().registerSubtypes(aclass);
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        _serializationConfig = _serializationConfig.with(annotationintrospector);
        _deserializationConfig = _deserializationConfig.with(annotationintrospector);
        return this;
    }

    public ObjectMapper setDateFormat(DateFormat dateformat)
    {
        _deserializationConfig = _deserializationConfig.with(dateformat);
        _serializationConfig = _serializationConfig.with(dateformat);
        return this;
    }

    public ObjectMapper setDefaultTyping(TypeResolverBuilder typeresolverbuilder)
    {
        _deserializationConfig = _deserializationConfig.with(typeresolverbuilder);
        _serializationConfig = _serializationConfig.with(typeresolverbuilder);
        return this;
    }

    public void setFilters(FilterProvider filterprovider)
    {
        _serializationConfig = _serializationConfig.withFilters(filterprovider);
    }

    public Object setHandlerInstantiator(HandlerInstantiator handlerinstantiator)
    {
        _deserializationConfig = _deserializationConfig.with(handlerinstantiator);
        _serializationConfig = _serializationConfig.with(handlerinstantiator);
        return this;
    }

    public ObjectMapper setInjectableValues(InjectableValues injectablevalues)
    {
        _injectableValues = injectablevalues;
        return this;
    }

    public ObjectMapper setLocale(Locale locale)
    {
        _deserializationConfig = _deserializationConfig.with(locale);
        _serializationConfig = _serializationConfig.with(locale);
        return this;
    }

    public final void setMixInAnnotations(Map map)
    {
        _mixInAnnotations.clear();
        if (map != null && map.size() > 0)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); _mixInAnnotations.put(new ClassKey((Class)entry.getKey()), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonnodefactory)
    {
        _deserializationConfig = _deserializationConfig.with(jsonnodefactory);
        return this;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
    {
        _serializationConfig = _serializationConfig.with(propertynamingstrategy);
        _deserializationConfig = _deserializationConfig.with(propertynamingstrategy);
        return this;
    }

    public ObjectMapper setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        _serializationConfig = _serializationConfig.withSerializationInclusion(include);
        return this;
    }

    public ObjectMapper setSerializerFactory(SerializerFactory serializerfactory)
    {
        _serializerFactory = serializerfactory;
        return this;
    }

    public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultserializerprovider)
    {
        _serializerProvider = defaultserializerprovider;
        return this;
    }

    public ObjectMapper setSubtypeResolver(SubtypeResolver subtyperesolver)
    {
        _subtypeResolver = subtyperesolver;
        _deserializationConfig = _deserializationConfig.with(subtyperesolver);
        _serializationConfig = _serializationConfig.with(subtyperesolver);
        return this;
    }

    public ObjectMapper setTimeZone(TimeZone timezone)
    {
        _deserializationConfig = _deserializationConfig.with(timezone);
        _serializationConfig = _serializationConfig.with(timezone);
        return this;
    }

    public ObjectMapper setTypeFactory(TypeFactory typefactory)
    {
        _typeFactory = typefactory;
        _deserializationConfig = _deserializationConfig.with(typefactory);
        _serializationConfig = _serializationConfig.with(typefactory);
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
    {
        _deserializationConfig = _deserializationConfig.withVisibility(propertyaccessor, visibility);
        _serializationConfig = _serializationConfig.withVisibility(propertyaccessor, visibility);
        return this;
    }

    public void setVisibilityChecker(VisibilityChecker visibilitychecker)
    {
        _deserializationConfig = _deserializationConfig.with(visibilitychecker);
        _serializationConfig = _serializationConfig.with(visibilitychecker);
    }

    public JsonParser treeAsTokens(TreeNode treenode)
    {
        return new TreeTraversingParser((JsonNode)treenode, this);
    }

    public Object treeToValue(TreeNode treenode, Class class1)
    {
        if (class1 == java/lang/Object)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        if (class1.isAssignableFrom(treenode.getClass()))
        {
            return treenode;
        }
        try
        {
            treenode = ((TreeNode) (readValue(treeAsTokens(treenode), class1)));
        }
        // Misplaced declaration of an exception variable
        catch (TreeNode treenode)
        {
            throw treenode;
        }
        // Misplaced declaration of an exception variable
        catch (TreeNode treenode)
        {
            throw new IllegalArgumentException(treenode.getMessage(), treenode);
        }
        return treenode;
    }

    public JsonNode valueToTree(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        Object obj1 = new TokenBuffer(this);
        try
        {
            writeValue(((JsonGenerator) (obj1)), obj);
            obj = ((TokenBuffer) (obj1)).asParser();
            obj1 = (JsonNode)readTree(((JsonParser) (obj)));
            ((JsonParser) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
        }
        return ((JsonNode) (obj1));
    }

    public Version version()
    {
        return DatabindVersion.instance.version();
    }

    public void writeTree(JsonGenerator jsongenerator, JsonNode jsonnode)
    {
        SerializationConfig serializationconfig = getSerializationConfig();
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, jsonnode);
        if (serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
        {
            jsongenerator.flush();
        }
    }

    public void writeValue(JsonGenerator jsongenerator, Object obj)
    {
        SerializationConfig serializationconfig = getSerializationConfig();
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

    public void writeValue(File file, Object obj)
    {
        _configAndWriteValue(_jsonFactory.createJsonGenerator(file, JsonEncoding.UTF8), obj);
    }

    public void writeValue(OutputStream outputstream, Object obj)
    {
        _configAndWriteValue(_jsonFactory.createJsonGenerator(outputstream, JsonEncoding.UTF8), obj);
    }

    public void writeValue(Writer writer1, Object obj)
    {
        _configAndWriteValue(_jsonFactory.createJsonGenerator(writer1), obj);
    }

    public byte[] writeValueAsBytes(Object obj)
    {
        ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder(_jsonFactory._getBufferRecycler());
        _configAndWriteValue(_jsonFactory.createJsonGenerator(bytearraybuilder, JsonEncoding.UTF8), obj);
        obj = bytearraybuilder.toByteArray();
        bytearraybuilder.release();
        return ((byte []) (obj));
    }

    public String writeValueAsString(Object obj)
    {
        SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_jsonFactory._getBufferRecycler());
        _configAndWriteValue(_jsonFactory.createJsonGenerator(segmentedstringwriter), obj);
        return segmentedstringwriter.getAndClear();
    }

    public ObjectWriter writer()
    {
        return new ObjectWriter(this, getSerializationConfig());
    }

    public ObjectWriter writer(FormatSchema formatschema)
    {
        return new ObjectWriter(this, getSerializationConfig(), formatschema);
    }

    public ObjectWriter writer(PrettyPrinter prettyprinter)
    {
        PrettyPrinter prettyprinter1 = prettyprinter;
        if (prettyprinter == null)
        {
            prettyprinter1 = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return new ObjectWriter(this, getSerializationConfig(), null, prettyprinter1);
    }

    public ObjectWriter writer(SerializationFeature serializationfeature)
    {
        return new ObjectWriter(this, getSerializationConfig().with(serializationfeature));
    }

    public transient ObjectWriter writer(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
    {
        return new ObjectWriter(this, getSerializationConfig().with(serializationfeature, aserializationfeature));
    }

    public ObjectWriter writer(FilterProvider filterprovider)
    {
        return new ObjectWriter(this, getSerializationConfig().withFilters(filterprovider));
    }

    public ObjectWriter writer(DateFormat dateformat)
    {
        return new ObjectWriter(this, getSerializationConfig().with(dateformat));
    }

    public ObjectWriter writerWithDefaultPrettyPrinter()
    {
        return new ObjectWriter(this, getSerializationConfig(), null, _defaultPrettyPrinter());
    }

    public ObjectWriter writerWithType(TypeReference typereference)
    {
        if (typereference == null)
        {
            typereference = null;
        } else
        {
            typereference = _typeFactory.constructType(typereference);
        }
        return new ObjectWriter(this, getSerializationConfig(), typereference, null);
    }

    public ObjectWriter writerWithType(JavaType javatype)
    {
        return new ObjectWriter(this, getSerializationConfig(), javatype, null);
    }

    public ObjectWriter writerWithType(Class class1)
    {
        if (class1 == null)
        {
            class1 = null;
        } else
        {
            class1 = _typeFactory.constructType(class1);
        }
        return new ObjectWriter(this, getSerializationConfig(), class1, null);
    }

    public ObjectWriter writerWithView(Class class1)
    {
        return new ObjectWriter(this, getSerializationConfig().withView(class1));
    }

    static 
    {
        DEFAULT_INTROSPECTOR = BasicClassIntrospector.instance;
        DEFAULT_ANNOTATION_INTROSPECTOR = new JacksonAnnotationIntrospector();
        STD_VISIBILITY_CHECKER = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
        DEFAULT_BASE = new BaseSettings(DEFAULT_INTROSPECTOR, DEFAULT_ANNOTATION_INTROSPECTOR, STD_VISIBILITY_CHECKER, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), TimeZone.getTimeZone("GMT"));
    }

    private class DefaultTyping extends Enum
    {

        private static final DefaultTyping $VALUES[];
        public static final DefaultTyping JAVA_LANG_OBJECT;
        public static final DefaultTyping NON_CONCRETE_AND_ARRAYS;
        public static final DefaultTyping NON_FINAL;
        public static final DefaultTyping OBJECT_AND_NON_CONCRETE;

        public static DefaultTyping valueOf(String s)
        {
            return (DefaultTyping)Enum.valueOf(com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping, s);
        }

        public static DefaultTyping[] values()
        {
            return (DefaultTyping[])$VALUES.clone();
        }

        static 
        {
            JAVA_LANG_OBJECT = new DefaultTyping("JAVA_LANG_OBJECT", 0);
            OBJECT_AND_NON_CONCRETE = new DefaultTyping("OBJECT_AND_NON_CONCRETE", 1);
            NON_CONCRETE_AND_ARRAYS = new DefaultTyping("NON_CONCRETE_AND_ARRAYS", 2);
            NON_FINAL = new DefaultTyping("NON_FINAL", 3);
            $VALUES = (new DefaultTyping[] {
                JAVA_LANG_OBJECT, OBJECT_AND_NON_CONCRETE, NON_CONCRETE_AND_ARRAYS, NON_FINAL
            });
        }

        private DefaultTyping(String s, int i)
        {
            super(s, i);
        }
    }


    private class DefaultTypeResolverBuilder extends StdTypeResolverBuilder
    {

        protected final DefaultTyping _appliesFor;

        public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, Collection collection)
        {
            if (useForType(javatype))
            {
                return super.buildTypeDeserializer(deserializationconfig, javatype, collection);
            } else
            {
                return null;
            }
        }

        public TypeSerializer buildTypeSerializer(SerializationConfig serializationconfig, JavaType javatype, Collection collection)
        {
            if (useForType(javatype))
            {
                return super.buildTypeSerializer(serializationconfig, javatype, collection);
            } else
            {
                return null;
            }
        }

        public boolean useForType(JavaType javatype)
        {
            JavaType javatype1;
            JavaType javatype2;
            JavaType javatype3;
            boolean flag;
            flag = false;
            javatype1 = javatype;
            javatype2 = javatype;
            javatype3 = javatype;
            _cls2..SwitchMap.com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping[_appliesFor.ordinal()];
            JVM INSTR tableswitch 1 3: default 48
        //                       1 59
        //                       2 76
        //                       3 98;
               goto _L1 _L2 _L3 _L4
_L1:
            if (javatype.getRawClass() != java/lang/Object) goto _L6; else goto _L5
_L5:
            return true;
_L2:
            javatype2 = javatype1;
            if (!javatype1.isArrayType()) goto _L3; else goto _L7
_L7:
            javatype1 = javatype1.getContentType();
              goto _L2
_L3:
            if (javatype2.getRawClass() == java/lang/Object || !javatype2.isConcrete())
            {
                flag = true;
            }
            return flag;
_L4:
            for (; javatype3.isArrayType(); javatype3 = javatype3.getContentType()) { }
            if (javatype3.isFinal())
            {
                return false;
            }
            if (true) goto _L5; else goto _L6
_L6:
            return false;
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaulttyping)
        {
            _appliesFor = defaulttyping;
        }

        private class _cls2
        {

            static final int $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping = new int[DefaultTyping.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[DefaultTyping.NON_FINAL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls1
        implements Module.SetupContext
    {

        final ObjectMapper this$0;
        final ObjectMapper val$mapper;

        public void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
        {
            abstracttyperesolver = mapper._deserializationContext._factory.withAbstractTypeResolver(abstracttyperesolver);
            mapper._deserializationContext = mapper._deserializationContext.with(abstracttyperesolver);
        }

        public void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
        {
            beandeserializermodifier = mapper._deserializationContext._factory.withDeserializerModifier(beandeserializermodifier);
            mapper._deserializationContext = mapper._deserializationContext.with(beandeserializermodifier);
        }

        public void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier)
        {
            mapper._serializerFactory = mapper._serializerFactory.withSerializerModifier(beanserializermodifier);
        }

        public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationproblemhandler)
        {
            mapper.addHandler(deserializationproblemhandler);
        }

        public void addDeserializers(Deserializers deserializers)
        {
            deserializers = mapper._deserializationContext._factory.withAdditionalDeserializers(deserializers);
            mapper._deserializationContext = mapper._deserializationContext.with(deserializers);
        }

        public void addKeyDeserializers(KeyDeserializers keydeserializers)
        {
            keydeserializers = mapper._deserializationContext._factory.withAdditionalKeyDeserializers(keydeserializers);
            mapper._deserializationContext = mapper._deserializationContext.with(keydeserializers);
        }

        public void addKeySerializers(Serializers serializers)
        {
            mapper._serializerFactory = mapper._serializerFactory.withAdditionalKeySerializers(serializers);
        }

        public void addSerializers(Serializers serializers)
        {
            mapper._serializerFactory = mapper._serializerFactory.withAdditionalSerializers(serializers);
        }

        public void addTypeModifier(TypeModifier typemodifier)
        {
            typemodifier = mapper._typeFactory.withModifier(typemodifier);
            mapper.setTypeFactory(typemodifier);
        }

        public void addValueInstantiators(ValueInstantiators valueinstantiators)
        {
            valueinstantiators = mapper._deserializationContext._factory.withValueInstantiators(valueinstantiators);
            mapper._deserializationContext = mapper._deserializationContext.with(valueinstantiators);
        }

        public void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
        {
            mapper._deserializationConfig = mapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
            mapper._serializationConfig = mapper._serializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
        }

        public Version getMapperVersion()
        {
            return version();
        }

        public ObjectCodec getOwner()
        {
            return mapper;
        }

        public TypeFactory getTypeFactory()
        {
            return _typeFactory;
        }

        public void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
        {
            mapper._deserializationConfig = mapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
            mapper._serializationConfig = mapper._serializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
        }

        public boolean isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature feature)
        {
            return mapper.isEnabled(feature);
        }

        public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
        {
            return mapper.isEnabled(feature);
        }

        public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
        {
            return mapper.isEnabled(feature);
        }

        public boolean isEnabled(DeserializationFeature deserializationfeature)
        {
            return mapper.isEnabled(deserializationfeature);
        }

        public boolean isEnabled(MapperFeature mapperfeature)
        {
            return mapper.isEnabled(mapperfeature);
        }

        public boolean isEnabled(SerializationFeature serializationfeature)
        {
            return mapper.isEnabled(serializationfeature);
        }

        public transient void registerSubtypes(NamedType anamedtype[])
        {
            mapper.registerSubtypes(anamedtype);
        }

        public transient void registerSubtypes(Class aclass[])
        {
            mapper.registerSubtypes(aclass);
        }

        public void setMixInAnnotations(Class class1, Class class2)
        {
            mapper.addMixInAnnotations(class1, class2);
        }

        _cls1()
        {
            this$0 = ObjectMapper.this;
            mapper = objectmapper1;
            super();
        }
    }

}
