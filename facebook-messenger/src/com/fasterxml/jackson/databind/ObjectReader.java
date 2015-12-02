// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.DatabindVersion;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonNode, ObjectMapper, JavaType, DeserializationConfig, 
//            JsonMappingException, JsonDeserializer, DeserializationContext, MappingIterator, 
//            InjectableValues, DeserializationFeature, MapperFeature

public class ObjectReader extends ObjectCodec
    implements Versioned
{

    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected final ConcurrentHashMap _rootDeserializers;
    protected final RootNameLookup _rootNames;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    protected ObjectReader(ObjectMapper objectmapper, DeserializationConfig deserializationconfig)
    {
        this(objectmapper, deserializationconfig, null, null, null, null);
    }

    protected ObjectReader(ObjectMapper objectmapper, DeserializationConfig deserializationconfig, JavaType javatype, Object obj, FormatSchema formatschema, InjectableValues injectablevalues)
    {
        _config = deserializationconfig;
        _context = objectmapper._deserializationContext;
        _rootDeserializers = objectmapper._rootDeserializers;
        _jsonFactory = objectmapper._jsonFactory;
        _rootNames = objectmapper._rootNames;
        _valueType = javatype;
        _valueToUpdate = obj;
        if (obj != null && javatype.isArrayType())
        {
            throw new IllegalArgumentException("Can not update an array value");
        } else
        {
            _schema = formatschema;
            _injectableValues = injectablevalues;
            _unwrapRoot = deserializationconfig.useRootWrapping();
            return;
        }
    }

    protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig)
    {
        _config = deserializationconfig;
        _context = objectreader._context;
        _rootDeserializers = objectreader._rootDeserializers;
        _jsonFactory = objectreader._jsonFactory;
        _rootNames = objectreader._rootNames;
        _valueType = objectreader._valueType;
        _valueToUpdate = objectreader._valueToUpdate;
        _schema = objectreader._schema;
        _injectableValues = objectreader._injectableValues;
        _unwrapRoot = deserializationconfig.useRootWrapping();
    }

    protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig, JavaType javatype, Object obj, FormatSchema formatschema, InjectableValues injectablevalues)
    {
        _config = deserializationconfig;
        _context = objectreader._context;
        _rootDeserializers = objectreader._rootDeserializers;
        _jsonFactory = objectreader._jsonFactory;
        _rootNames = objectreader._rootNames;
        _valueType = javatype;
        _valueToUpdate = obj;
        if (obj != null && javatype.isArrayType())
        {
            throw new IllegalArgumentException("Can not update an array value");
        } else
        {
            _schema = formatschema;
            _injectableValues = injectablevalues;
            _unwrapRoot = deserializationconfig.useRootWrapping();
            return;
        }
    }

    protected static JsonToken _initForReading(JsonParser jsonparser)
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

    protected Object _bind(JsonParser jsonparser)
    {
        Object obj = _initForReading(jsonparser);
        if (obj == JsonToken.VALUE_NULL)
        {
            if (_valueToUpdate == null)
            {
                obj = _findRootDeserializer(createDeserializationContext(jsonparser, _config), _valueType).getNullValue();
            } else
            {
                obj = _valueToUpdate;
            }
        } else
        if (obj == JsonToken.END_ARRAY || obj == JsonToken.END_OBJECT)
        {
            obj = _valueToUpdate;
        } else
        {
            obj = createDeserializationContext(jsonparser, _config);
            JsonDeserializer jsondeserializer = _findRootDeserializer(((DeserializationContext) (obj)), _valueType);
            if (_unwrapRoot)
            {
                obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), _valueType, jsondeserializer);
            } else
            if (_valueToUpdate == null)
            {
                obj = jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)));
            } else
            {
                jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)), _valueToUpdate);
                obj = _valueToUpdate;
            }
        }
        jsonparser.clearCurrentToken();
        return obj;
    }

    protected Object _bindAndClose(JsonParser jsonparser)
    {
        if (_schema != null)
        {
            jsonparser.setSchema(_schema);
        }
        Object obj = _initForReading(jsonparser);
        if (obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        if (_valueToUpdate != null) goto _L4; else goto _L3
_L3:
        obj = _findRootDeserializer(createDeserializationContext(jsonparser, _config), _valueType).getNullValue();
_L5:
        JsonDeserializer jsondeserializer;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            return obj;
        }
        return obj;
_L4:
        obj = _valueToUpdate;
          goto _L5
_L2:
label0:
        {
            if (obj != JsonToken.END_ARRAY && obj != JsonToken.END_OBJECT)
            {
                break label0;
            }
            obj = _valueToUpdate;
        }
          goto _L5
label1:
        {
            obj = createDeserializationContext(jsonparser, _config);
            jsondeserializer = _findRootDeserializer(((DeserializationContext) (obj)), _valueType);
            if (!_unwrapRoot)
            {
                break label1;
            }
            obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), _valueType, jsondeserializer);
        }
          goto _L5
label2:
        {
            if (_valueToUpdate != null)
            {
                break label2;
            }
            obj = jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)));
        }
          goto _L5
        jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)), _valueToUpdate);
        obj = _valueToUpdate;
          goto _L5
        obj;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser) { }
        throw obj;
    }

    protected JsonNode _bindAndCloseAsTree(JsonParser jsonparser)
    {
        if (_schema != null)
        {
            jsonparser.setSchema(_schema);
        }
        Object obj = _bindAsTree(jsonparser);
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            return ((JsonNode) (obj));
        }
        return ((JsonNode) (obj));
        obj;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser) { }
        throw obj;
    }

    protected JsonNode _bindAsTree(JsonParser jsonparser)
    {
        Object obj = _initForReading(jsonparser);
        if (obj == JsonToken.VALUE_NULL || obj == JsonToken.END_ARRAY || obj == JsonToken.END_OBJECT)
        {
            obj = NullNode.instance;
        } else
        {
            obj = createDeserializationContext(jsonparser, _config);
            JsonDeserializer jsondeserializer = _findRootDeserializer(((DeserializationContext) (obj)), JSON_NODE_TYPE);
            if (_unwrapRoot)
            {
                obj = (JsonNode)_unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), JSON_NODE_TYPE, jsondeserializer);
            } else
            {
                obj = (JsonNode)jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)));
            }
        }
        jsonparser.clearCurrentToken();
        return ((JsonNode) (obj));
    }

    protected JsonDeserializer _findRootDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
    {
        if (javatype == null)
        {
            throw new JsonMappingException("No value type configured for ObjectReader");
        }
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

    protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        String s1 = _config.getRootName();
        String s = s1;
        if (s1 == null)
        {
            s = _rootNames.findRootName(javatype, _config).getValue();
        }
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not START_OBJECT (needed to unwrap root name '").append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not FIELD_NAME (to contain expected root name '").append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        s1 = jsonparser.getCurrentName();
        if (!s.equals(s1))
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Root name '").append(s1).append("' does not match expected ('").append(s).append("') for type ").append(javatype).toString());
        }
        jsonparser.nextToken();
        if (_valueToUpdate == null)
        {
            deserializationcontext = ((DeserializationContext) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
        } else
        {
            jsondeserializer.deserialize(jsonparser, deserializationcontext, _valueToUpdate);
            deserializationcontext = ((DeserializationContext) (_valueToUpdate));
        }
        if (jsonparser.nextToken() != JsonToken.END_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not END_OBJECT (to match wrapper object with root name '").append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        } else
        {
            return deserializationcontext;
        }
    }

    public volatile TreeNode createArrayNode()
    {
        return createArrayNode();
    }

    public JsonNode createArrayNode()
    {
        return _config.getNodeFactory().arrayNode();
    }

    protected final DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return _context.createInstance(deserializationconfig, jsonparser, _injectableValues);
    }

    public volatile TreeNode createObjectNode()
    {
        return createObjectNode();
    }

    public JsonNode createObjectNode()
    {
        return _config.getNodeFactory().objectNode();
    }

    public JsonFactory getJsonFactory()
    {
        return _jsonFactory;
    }

    public TypeFactory getTypeFactory()
    {
        return _config.getTypeFactory();
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
    {
        return _jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(DeserializationFeature deserializationfeature)
    {
        return _config.isEnabled(deserializationfeature);
    }

    public boolean isEnabled(MapperFeature mapperfeature)
    {
        return _config.isEnabled(mapperfeature);
    }

    public TreeNode readTree(JsonParser jsonparser)
    {
        return _bindAsTree(jsonparser);
    }

    public JsonNode readTree(InputStream inputstream)
    {
        return _bindAndCloseAsTree(_jsonFactory.createJsonParser(inputstream));
    }

    public JsonNode readTree(Reader reader)
    {
        return _bindAndCloseAsTree(_jsonFactory.createJsonParser(reader));
    }

    public JsonNode readTree(String s)
    {
        return _bindAndCloseAsTree(_jsonFactory.createJsonParser(s));
    }

    public Object readValue(JsonParser jsonparser)
    {
        return _bind(jsonparser);
    }

    public Object readValue(JsonParser jsonparser, ResolvedType resolvedtype)
    {
        return withType((JavaType)resolvedtype).readValue(jsonparser);
    }

    public Object readValue(JsonParser jsonparser, TypeReference typereference)
    {
        return withType(typereference).readValue(jsonparser);
    }

    public Object readValue(JsonParser jsonparser, JavaType javatype)
    {
        return withType(javatype).readValue(jsonparser);
    }

    public Object readValue(JsonParser jsonparser, Class class1)
    {
        return withType(class1).readValue(jsonparser);
    }

    public Object readValue(JsonNode jsonnode)
    {
        return _bindAndClose(treeAsTokens(jsonnode));
    }

    public Object readValue(File file)
    {
        return _bindAndClose(_jsonFactory.createJsonParser(file));
    }

    public Object readValue(InputStream inputstream)
    {
        return _bindAndClose(_jsonFactory.createJsonParser(inputstream));
    }

    public Object readValue(Reader reader)
    {
        return _bindAndClose(_jsonFactory.createJsonParser(reader));
    }

    public Object readValue(String s)
    {
        return _bindAndClose(_jsonFactory.createJsonParser(s));
    }

    public Object readValue(URL url)
    {
        return _bindAndClose(_jsonFactory.createJsonParser(url));
    }

    public Object readValue(byte abyte0[])
    {
        return _bindAndClose(_jsonFactory.createJsonParser(abyte0));
    }

    public Object readValue(byte abyte0[], int i, int j)
    {
        return _bindAndClose(_jsonFactory.createJsonParser(abyte0, i, j));
    }

    public MappingIterator readValues(JsonParser jsonparser)
    {
        DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser, _config);
        return new MappingIterator(_valueType, jsonparser, defaultdeserializationcontext, _findRootDeserializer(defaultdeserializationcontext, _valueType), false, _valueToUpdate);
    }

    public MappingIterator readValues(File file)
    {
        file = _jsonFactory.createJsonParser(file);
        if (_schema != null)
        {
            file.setSchema(_schema);
        }
        DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(file, _config);
        return new MappingIterator(_valueType, file, defaultdeserializationcontext, _findRootDeserializer(defaultdeserializationcontext, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(InputStream inputstream)
    {
        inputstream = _jsonFactory.createJsonParser(inputstream);
        if (_schema != null)
        {
            inputstream.setSchema(_schema);
        }
        DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(inputstream, _config);
        return new MappingIterator(_valueType, inputstream, defaultdeserializationcontext, _findRootDeserializer(defaultdeserializationcontext, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(Reader reader)
    {
        reader = _jsonFactory.createJsonParser(reader);
        if (_schema != null)
        {
            reader.setSchema(_schema);
        }
        DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(reader, _config);
        return new MappingIterator(_valueType, reader, defaultdeserializationcontext, _findRootDeserializer(defaultdeserializationcontext, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(String s)
    {
        s = _jsonFactory.createJsonParser(s);
        if (_schema != null)
        {
            s.setSchema(_schema);
        }
        DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(s, _config);
        return new MappingIterator(_valueType, s, defaultdeserializationcontext, _findRootDeserializer(defaultdeserializationcontext, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(URL url)
    {
        url = _jsonFactory.createJsonParser(url);
        if (_schema != null)
        {
            url.setSchema(_schema);
        }
        DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(url, _config);
        return new MappingIterator(_valueType, url, defaultdeserializationcontext, _findRootDeserializer(defaultdeserializationcontext, _valueType), true, _valueToUpdate);
    }

    public final MappingIterator readValues(byte abyte0[])
    {
        return readValues(abyte0, 0, abyte0.length);
    }

    public MappingIterator readValues(byte abyte0[], int i, int j)
    {
        abyte0 = _jsonFactory.createJsonParser(abyte0, i, j);
        if (_schema != null)
        {
            abyte0.setSchema(_schema);
        }
        DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(abyte0, _config);
        return new MappingIterator(_valueType, abyte0, defaultdeserializationcontext, _findRootDeserializer(defaultdeserializationcontext, _valueType), true, _valueToUpdate);
    }

    public Iterator readValues(JsonParser jsonparser, ResolvedType resolvedtype)
    {
        return readValues(jsonparser, (JavaType)resolvedtype);
    }

    public Iterator readValues(JsonParser jsonparser, TypeReference typereference)
    {
        return withType(typereference).readValues(jsonparser);
    }

    public Iterator readValues(JsonParser jsonparser, JavaType javatype)
    {
        return withType(javatype).readValues(jsonparser);
    }

    public Iterator readValues(JsonParser jsonparser, Class class1)
    {
        return withType(class1).readValues(jsonparser);
    }

    public JsonParser treeAsTokens(TreeNode treenode)
    {
        return new TreeTraversingParser((JsonNode)treenode, this);
    }

    public Object treeToValue(TreeNode treenode, Class class1)
    {
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

    public Version version()
    {
        return DatabindVersion.instance.version();
    }

    public ObjectReader with(FormatSchema formatschema)
    {
        if (_schema == formatschema)
        {
            return this;
        } else
        {
            return new ObjectReader(this, _config, _valueType, _valueToUpdate, formatschema, _injectableValues);
        }
    }

    public ObjectReader with(DeserializationFeature deserializationfeature)
    {
        deserializationfeature = _config.with(deserializationfeature);
        if (deserializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, deserializationfeature);
        }
    }

    public transient ObjectReader with(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
    {
        deserializationfeature = _config.with(deserializationfeature, adeserializationfeature);
        if (deserializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, deserializationfeature);
        }
    }

    public ObjectReader with(InjectableValues injectablevalues)
    {
        if (_injectableValues == injectablevalues)
        {
            return this;
        } else
        {
            return new ObjectReader(this, _config, _valueType, _valueToUpdate, _schema, injectablevalues);
        }
    }

    public ObjectReader with(JsonNodeFactory jsonnodefactory)
    {
        jsonnodefactory = _config.with(jsonnodefactory);
        if (jsonnodefactory == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, jsonnodefactory);
        }
    }

    public ObjectReader with(Locale locale)
    {
        locale = _config.with(locale);
        if (locale == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, locale);
        }
    }

    public ObjectReader with(TimeZone timezone)
    {
        timezone = _config.with(timezone);
        if (timezone == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, timezone);
        }
    }

    public transient ObjectReader withFeatures(DeserializationFeature adeserializationfeature[])
    {
        adeserializationfeature = _config.withFeatures(adeserializationfeature);
        if (adeserializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, adeserializationfeature);
        }
    }

    public ObjectReader withRootName(String s)
    {
        s = _config.withRootName(s);
        if (s == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, s);
        }
    }

    public ObjectReader withType(TypeReference typereference)
    {
        return withType(_config.getTypeFactory().constructType(typereference.getType()));
    }

    public ObjectReader withType(JavaType javatype)
    {
        if (javatype != null && javatype.equals(_valueType))
        {
            return this;
        } else
        {
            return new ObjectReader(this, _config, javatype, _valueToUpdate, _schema, _injectableValues);
        }
    }

    public ObjectReader withType(Class class1)
    {
        return withType(_config.constructType(class1));
    }

    public ObjectReader withType(Type type)
    {
        return withType(_config.getTypeFactory().constructType(type));
    }

    public ObjectReader withValueToUpdate(Object obj)
    {
        if (obj == _valueToUpdate)
        {
            return this;
        }
        if (obj == null)
        {
            throw new IllegalArgumentException("cat not update null value");
        }
        JavaType javatype;
        if (_valueType == null)
        {
            javatype = _config.constructType(obj.getClass());
        } else
        {
            javatype = _valueType;
        }
        return new ObjectReader(this, _config, javatype, obj, _schema, _injectableValues);
    }

    public ObjectReader withView(Class class1)
    {
        class1 = _config.withView(class1);
        if (class1 == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, class1);
        }
    }

    public ObjectReader without(DeserializationFeature deserializationfeature)
    {
        deserializationfeature = _config.without(deserializationfeature);
        if (deserializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, deserializationfeature);
        }
    }

    public transient ObjectReader without(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
    {
        deserializationfeature = _config.without(deserializationfeature, adeserializationfeature);
        if (deserializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, deserializationfeature);
        }
    }

    public transient ObjectReader withoutFeatures(DeserializationFeature adeserializationfeature[])
    {
        adeserializationfeature = _config.withoutFeatures(adeserializationfeature);
        if (adeserializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectReader(this, adeserializationfeature);
        }
    }

    public void writeValue(JsonGenerator jsongenerator, Object obj)
    {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

}
