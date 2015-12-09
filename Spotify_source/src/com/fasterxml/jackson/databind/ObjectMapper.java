// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
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
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
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
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonNode, MappingJsonFactory, SerializationConfig, DeserializationConfig, 
//            MapperFeature, SerializationFeature, JavaType, JsonDeserializer, 
//            DeserializationContext, JsonMappingException, PropertyName, ObjectReader, 
//            ObjectWriter, AnnotationIntrospector, InjectableValues, DeserializationFeature

public class ObjectMapper extends ObjectCodec
    implements Serializable
{

    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    protected static final ClassIntrospector DEFAULT_INTROSPECTOR;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
    protected static final VisibilityChecker STD_VISIBILITY_CHECKER;
    protected static final PrettyPrinter _defaultPrettyPrinter = new DefaultPrettyPrinter();
    private static final long serialVersionUID = 1L;
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
        _rootDeserializers = new ConcurrentHashMap(64, 0.6F, 2);
        if (jsonfactory != null) goto _L2; else goto _L1
_L1:
        _jsonFactory = new MappingJsonFactory(this);
_L4:
        _subtypeResolver = new StdSubtypeResolver();
        _rootNames = new RootNameLookup();
        _typeFactory = TypeFactory.defaultInstance();
        jsonfactory = new HashMap();
        _mixInAnnotations = jsonfactory;
        _serializationConfig = new SerializationConfig(DEFAULT_BASE, _subtypeResolver, jsonfactory);
        _deserializationConfig = new DeserializationConfig(DEFAULT_BASE, _subtypeResolver, jsonfactory);
        boolean flag = _jsonFactory.requiresPropertyOrdering();
        if (_serializationConfig.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY) ^ flag)
        {
            configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, flag);
        }
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
        return;
        serializationconfig;
        obj = jsongenerator;
        jsongenerator = serializationconfig;
        serializationconfig = ((SerializationConfig) (obj));
        obj = closeable;
_L2:
        if (serializationconfig != null)
        {
            serializationconfig.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
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
    {
        SerializationConfig serializationconfig;
        boolean flag;
        serializationconfig = getSerializationConfig();
        if (serializationconfig.isEnabled(SerializationFeature.INDENT_OUTPUT))
        {
            jsongenerator.useDefaultPrettyPrinter();
        }
        if (serializationconfig.isEnabled(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN))
        {
            jsongenerator.enable(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
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
            jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
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
        Object obj1;
        obj1 = javatype.getRawClass();
        if (obj1 != java/lang/Object && !javatype.hasGenericTypes() && ((Class) (obj1)).isAssignableFrom(obj.getClass()))
        {
            return obj;
        }
        obj1 = new TokenBuffer(this, false);
        JsonToken jsontoken;
        _serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(((JsonGenerator) (obj1)), obj);
        obj1 = ((TokenBuffer) (obj1)).asParser();
        obj = getDeserializationConfig();
        jsontoken = _initForReading(((JsonParser) (obj1)));
        if (jsontoken != JsonToken.VALUE_NULL)
        {
            break MISSING_BLOCK_LABEL_121;
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
        return _defaultPrettyPrinter;
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
            throw new JsonMappingException((new StringBuilder("Can not find a deserializer for type ")).append(javatype).toString());
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
        DeserializationConfig deserializationconfig;
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
            break MISSING_BLOCK_LABEL_132;
        }
        deserializationconfig = getDeserializationConfig();
        obj = createDeserializationContext(jsonparser, deserializationconfig);
        jsondeserializer = _findRootDeserializer(((DeserializationContext) (obj)), javatype);
        if (!deserializationconfig.useRootWrapping())
        {
            break MISSING_BLOCK_LABEL_114;
        }
        javatype = ((JavaType) (_unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), deserializationconfig, javatype, jsondeserializer)));
_L4:
        ((DeserializationContext) (obj)).checkUnresolvedObjectId();
          goto _L3
        javatype;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser) { }
        throw javatype;
        javatype = ((JavaType) (jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)))));
          goto _L4
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
            s = _rootNames.findRootName(javatype, deserializationconfig).getSimpleName();
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

    public final void addMixInAnnotations(Class class1, Class class2)
    {
        _mixInAnnotations.put(new ClassKey(class1), class2);
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

    public Object convertValue(Object obj, TypeReference typereference)
    {
        return convertValue(obj, _typeFactory.constructType(typereference));
    }

    public Object convertValue(Object obj, JavaType javatype)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return _convert(obj, javatype);
        }
    }

    public Object convertValue(Object obj, Class class1)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return _convert(obj, _typeFactory.constructType(class1));
        }
    }

    protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return _deserializationContext.createInstance(deserializationconfig, jsonparser, _injectableValues);
    }

    public ObjectNode createObjectNode()
    {
        return _deserializationConfig.getNodeFactory().objectNode();
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
        return getFactory();
    }

    public JsonNodeFactory getNodeFactory()
    {
        return _deserializationConfig.getNodeFactory();
    }

    public SerializationConfig getSerializationConfig()
    {
        return _serializationConfig;
    }

    public TypeFactory getTypeFactory()
    {
        return _typeFactory;
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

    public JsonNode readTree(String s)
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(s), JSON_NODE_TYPE);
        s = jsonnode;
        if (jsonnode == null)
        {
            s = NullNode.instance;
        }
        return s;
    }

    public JsonNode readTree(byte abyte0[])
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(abyte0), JSON_NODE_TYPE);
        abyte0 = jsonnode;
        if (jsonnode == null)
        {
            abyte0 = NullNode.instance;
        }
        return abyte0;
    }

    public Object readValue(JsonParser jsonparser, Class class1)
    {
        return _readValue(getDeserializationConfig(), jsonparser, _typeFactory.constructType(class1));
    }

    public Object readValue(File file, TypeReference typereference)
    {
        return _readMapAndClose(_jsonFactory.createParser(file), _typeFactory.constructType(typereference));
    }

    public Object readValue(File file, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createParser(file), _typeFactory.constructType(class1));
    }

    public Object readValue(InputStream inputstream, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createParser(inputstream), _typeFactory.constructType(class1));
    }

    public Object readValue(String s, JavaType javatype)
    {
        return _readMapAndClose(_jsonFactory.createParser(s), javatype);
    }

    public Object readValue(String s, Class class1)
    {
        return _readMapAndClose(_jsonFactory.createParser(s), _typeFactory.constructType(class1));
    }

    public Object readValue(byte abyte0[], Class class1)
    {
        return _readMapAndClose(_jsonFactory.createParser(abyte0), _typeFactory.constructType(class1));
    }

    public ObjectReader reader()
    {
        return (new ObjectReader(this, getDeserializationConfig())).with(_injectableValues);
    }

    public ObjectReader reader(JavaType javatype)
    {
        return new ObjectReader(this, getDeserializationConfig(), javatype, null, null, _injectableValues);
    }

    public ObjectReader reader(Class class1)
    {
        return reader(_typeFactory.constructType(class1));
    }

    public ObjectMapper setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        _serializationConfig = _serializationConfig.withSerializationInclusion(include);
        return this;
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
        Object obj1 = new TokenBuffer(this, false);
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

    public void writeValue(JsonGenerator jsongenerator, Object obj)
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

    public void writeValue(File file, Object obj)
    {
        _configAndWriteValue(_jsonFactory.createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public byte[] writeValueAsBytes(Object obj)
    {
        ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder(_jsonFactory._getBufferRecycler());
        try
        {
            _configAndWriteValue(_jsonFactory.createGenerator(bytearraybuilder, JsonEncoding.UTF8), obj);
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
        obj = bytearraybuilder.toByteArray();
        bytearraybuilder.release();
        return ((byte []) (obj));
    }

    public String writeValueAsString(Object obj)
    {
        SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_jsonFactory._getBufferRecycler());
        try
        {
            _configAndWriteValue(_jsonFactory.createGenerator(segmentedstringwriter), obj);
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

    public ObjectWriter writer()
    {
        return new ObjectWriter(this, getSerializationConfig());
    }

    public ObjectWriter writerWithDefaultPrettyPrinter()
    {
        return new ObjectWriter(this, getSerializationConfig(), null, _defaultPrettyPrinter());
    }

    static 
    {
        DEFAULT_INTROSPECTOR = BasicClassIntrospector.instance;
        DEFAULT_ANNOTATION_INTROSPECTOR = new JacksonAnnotationIntrospector();
        STD_VISIBILITY_CHECKER = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
        DEFAULT_BASE = new BaseSettings(DEFAULT_INTROSPECTOR, DEFAULT_ANNOTATION_INTROSPECTOR, STD_VISIBILITY_CHECKER, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), TimeZone.getTimeZone("GMT"), Base64Variants.getDefaultVariant());
    }
}
