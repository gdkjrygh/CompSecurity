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
import com.fasterxml.jackson.core.TreeNode;
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
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonNode, MappingJsonFactory, SerializationConfig, DeserializationConfig, 
//            MapperFeature, JsonMappingException, SerializationFeature, JsonDeserializer, 
//            DeserializationContext, PropertyName, AnnotationIntrospector, JavaType, 
//            InjectableValues

public class ObjectMapper extends ObjectCodec
    implements Serializable
{

    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
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
        BaseSettings basesettings = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
        _serializationConfig = new SerializationConfig(basesettings, _subtypeResolver, jsonfactory);
        _deserializationConfig = new DeserializationConfig(basesettings, _subtypeResolver, jsonfactory);
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

    private final void _writeCloseableValue(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        Closeable closeable;
        Closeable closeable1;
        closeable1 = (Closeable)obj;
        closeable = closeable1;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
        closeable = closeable1;
        if (!serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        closeable = closeable1;
        jsongenerator.flush();
        closeable = null;
        closeable1.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new NullPointerException();
        return;
        jsongenerator;
        if (closeable != null)
        {
            try
            {
                closeable.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw jsongenerator;
        jsongenerator;
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
            throw new JsonMappingException((new StringBuilder()).append("Can not find a deserializer for type ").append(javatype).toString());
        } else
        {
            _rootDeserializers.put(javatype, deserializationcontext);
            return deserializationcontext;
        }
    }

    protected JsonToken _initForReading(JsonParser jsonparser)
        throws IOException
    {
        _deserializationConfig.initialize(jsonparser);
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
        throws IOException
    {
        String s1 = deserializationconfig.getRootName();
        String s = s1;
        if (s1 == null)
        {
            s = _rootNames.findRootName(javatype, deserializationconfig).getSimpleName();
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

    public ArrayNode createArrayNode()
    {
        return _deserializationConfig.getNodeFactory().arrayNode();
    }

    protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return _deserializationContext.createInstance(deserializationconfig, jsonparser, _injectableValues);
    }

    public ObjectNode createObjectNode()
    {
        return _deserializationConfig.getNodeFactory().objectNode();
    }

    protected ClassIntrospector defaultClassIntrospector()
    {
        return new BasicClassIntrospector();
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

    public TreeNode readTree(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        Object obj = getDeserializationConfig();
        if (jsonparser.getCurrentToken() == null && jsonparser.nextToken() == null)
        {
            return null;
        }
        obj = (JsonNode)_readValue(((DeserializationConfig) (obj)), jsonparser, JSON_NODE_TYPE);
        jsonparser = ((JsonParser) (obj));
        if (obj == null)
        {
            jsonparser = getNodeFactory().nullNode();
        }
        return jsonparser;
    }

    public JsonNode readTree(String s)
        throws IOException, JsonProcessingException
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(s), JSON_NODE_TYPE);
        s = jsonnode;
        if (jsonnode == null)
        {
            s = NullNode.instance;
        }
        return s;
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

    static 
    {
        DEFAULT_ANNOTATION_INTROSPECTOR = new JacksonAnnotationIntrospector();
        STD_VISIBILITY_CHECKER = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
        DEFAULT_BASE = new BaseSettings(null, DEFAULT_ANNOTATION_INTROSPECTOR, STD_VISIBILITY_CHECKER, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, null, Locale.getDefault(), TimeZone.getTimeZone("GMT"), Base64Variants.getDefaultVariant());
    }
}
