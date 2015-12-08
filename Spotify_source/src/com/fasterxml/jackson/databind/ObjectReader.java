// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonNode, ObjectMapper, JavaType, DeserializationConfig, 
//            JsonMappingException, JsonDeserializer, DeserializationContext, DeserializationFeature, 
//            PropertyName, InjectableValues

public class ObjectReader extends ObjectCodec
    implements Serializable
{

    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
    private static final long serialVersionUID = 0xc4ffd6d3565588ffL;
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _parserFactory;
    protected final JsonDeserializer _rootDeserializer;
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
        _parserFactory = objectmapper._jsonFactory;
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
            _rootDeserializer = _prefetchRootDeserializer(deserializationconfig, javatype);
            _dataFormatReaders = null;
            return;
        }
    }

    protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig)
    {
        _config = deserializationconfig;
        _context = objectreader._context;
        _rootDeserializers = objectreader._rootDeserializers;
        _parserFactory = objectreader._parserFactory;
        _rootNames = objectreader._rootNames;
        _valueType = objectreader._valueType;
        _rootDeserializer = objectreader._rootDeserializer;
        _valueToUpdate = objectreader._valueToUpdate;
        _schema = objectreader._schema;
        _injectableValues = objectreader._injectableValues;
        _unwrapRoot = deserializationconfig.useRootWrapping();
        _dataFormatReaders = objectreader._dataFormatReaders;
    }

    protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer, Object obj, FormatSchema formatschema, InjectableValues injectablevalues, 
            DataFormatReaders dataformatreaders)
    {
        _config = deserializationconfig;
        _context = objectreader._context;
        _rootDeserializers = objectreader._rootDeserializers;
        _parserFactory = objectreader._parserFactory;
        _rootNames = objectreader._rootNames;
        _valueType = javatype;
        _rootDeserializer = jsondeserializer;
        _valueToUpdate = obj;
        if (obj != null && javatype.isArrayType())
        {
            throw new IllegalArgumentException("Can not update an array value");
        } else
        {
            _schema = formatschema;
            _injectableValues = injectablevalues;
            _unwrapRoot = deserializationconfig.useRootWrapping();
            _dataFormatReaders = dataformatreaders;
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

    protected Object _bind(JsonParser jsonparser, Object obj)
    {
        JsonToken jsontoken = _initForReading(jsonparser);
        if (jsontoken != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = _findRootDeserializer(createDeserializationContext(jsonparser, _config), _valueType).getNullValue();
        }
_L4:
        jsonparser.clearCurrentToken();
        return obj1;
_L2:
        obj1 = obj;
        if (jsontoken != JsonToken.END_ARRAY)
        {
            obj1 = obj;
            if (jsontoken != JsonToken.END_OBJECT)
            {
                obj1 = createDeserializationContext(jsonparser, _config);
                JsonDeserializer jsondeserializer = _findRootDeserializer(((DeserializationContext) (obj1)), _valueType);
                if (_unwrapRoot)
                {
                    obj1 = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj1)), _valueType, jsondeserializer);
                } else
                if (obj == null)
                {
                    obj1 = jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj1)));
                } else
                {
                    jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj1)), obj);
                    obj1 = obj;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Object _bindAndClose(JsonParser jsonparser, Object obj)
    {
        if (_schema != null)
        {
            jsonparser.setSchema(_schema);
        }
        Object obj2 = _initForReading(jsonparser);
        if (obj2 != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj1 = _findRootDeserializer(createDeserializationContext(jsonparser, _config), _valueType).getNullValue();
_L4:
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            return obj1;
        }
        return obj1;
_L2:
        obj1 = obj;
        if (obj2 == JsonToken.END_ARRAY) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        if (obj2 == JsonToken.END_OBJECT) goto _L4; else goto _L5
_L5:
        obj1 = createDeserializationContext(jsonparser, _config);
        obj2 = _findRootDeserializer(((DeserializationContext) (obj1)), _valueType);
        if (!_unwrapRoot)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj1 = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj1)), _valueType, ((JsonDeserializer) (obj2)));
          goto _L4
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        obj1 = ((JsonDeserializer) (obj2)).deserialize(jsonparser, ((DeserializationContext) (obj1)));
          goto _L4
        ((JsonDeserializer) (obj2)).deserialize(jsonparser, ((DeserializationContext) (obj1)), obj);
        obj1 = obj;
          goto _L4
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
        JsonDeserializer jsondeserializer;
        if (_rootDeserializer != null)
        {
            jsondeserializer = _rootDeserializer;
        } else
        {
            if (javatype == null)
            {
                throw new JsonMappingException("No value type configured for ObjectReader");
            }
            JsonDeserializer jsondeserializer1 = (JsonDeserializer)_rootDeserializers.get(javatype);
            jsondeserializer = jsondeserializer1;
            if (jsondeserializer1 == null)
            {
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
        }
        return jsondeserializer;
    }

    protected JsonDeserializer _prefetchRootDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        JsonDeserializer jsondeserializer;
        jsondeserializer = null;
        deserializationconfig = jsondeserializer;
        if (javatype == null) goto _L2; else goto _L1
_L1:
        if (_config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) goto _L4; else goto _L3
_L3:
        deserializationconfig = jsondeserializer;
_L2:
        return deserializationconfig;
_L4:
        jsondeserializer = (JsonDeserializer)_rootDeserializers.get(javatype);
        deserializationconfig = jsondeserializer;
        if (jsondeserializer != null) goto _L2; else goto _L5
_L5:
        deserializationconfig = jsondeserializer;
        try
        {
            jsondeserializer = createDeserializationContext(null, _config).findRootValueDeserializer(javatype);
        }
        // Misplaced declaration of an exception variable
        catch (JavaType javatype)
        {
            return deserializationconfig;
        }
        deserializationconfig = jsondeserializer;
        if (jsondeserializer == null) goto _L2; else goto _L6
_L6:
        deserializationconfig = jsondeserializer;
        _rootDeserializers.put(javatype, jsondeserializer);
        return jsondeserializer;
    }

    protected void _reportUndetectableSource(Object obj)
    {
        throw new JsonParseException((new StringBuilder("Can not use source of type ")).append(obj.getClass().getName()).append(" with format auto-detection: must be byte- not char-based").toString(), JsonLocation.NA);
    }

    protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        String s1 = _config.getRootName();
        String s = s1;
        if (s1 == null)
        {
            s = _rootNames.findRootName(javatype, _config).getSimpleName();
        }
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Current token not START_OBJECT (needed to unwrap root name '")).append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Current token not FIELD_NAME (to contain expected root name '")).append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        s1 = jsonparser.getCurrentName();
        if (!s.equals(s1))
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Root name '")).append(s1).append("' does not match expected ('").append(s).append("') for type ").append(javatype).toString());
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
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Current token not END_OBJECT (to match wrapper object with root name '")).append(s).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        } else
        {
            return deserializationcontext;
        }
    }

    protected ObjectReader _with(DeserializationConfig deserializationconfig)
    {
        if (deserializationconfig == _config)
        {
            return this;
        }
        if (_dataFormatReaders != null)
        {
            return (new ObjectReader(this, deserializationconfig)).withFormatDetection(_dataFormatReaders.with(deserializationconfig));
        } else
        {
            return new ObjectReader(this, deserializationconfig);
        }
    }

    protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return _context.createInstance(deserializationconfig, jsonparser, _injectableValues);
    }

    public JsonFactory getFactory()
    {
        return _parserFactory;
    }

    public JsonFactory getJsonFactory()
    {
        return _parserFactory;
    }

    public TreeNode readTree(JsonParser jsonparser)
    {
        return _bindAsTree(jsonparser);
    }

    public Object readValue(JsonParser jsonparser)
    {
        return _bind(jsonparser, _valueToUpdate);
    }

    public Object readValue(JsonParser jsonparser, Class class1)
    {
        return withType(class1).readValue(jsonparser);
    }

    public Object readValue(String s)
    {
        if (_dataFormatReaders != null)
        {
            _reportUndetectableSource(s);
        }
        return _bindAndClose(_parserFactory.createParser(s), _valueToUpdate);
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

    public ObjectReader with(DeserializationConfig deserializationconfig)
    {
        return _with(deserializationconfig);
    }

    public ObjectReader with(InjectableValues injectablevalues)
    {
        if (_injectableValues == injectablevalues)
        {
            return this;
        } else
        {
            return new ObjectReader(this, _config, _valueType, _rootDeserializer, _valueToUpdate, _schema, injectablevalues, _dataFormatReaders);
        }
    }

    public ObjectReader withFormatDetection(DataFormatReaders dataformatreaders)
    {
        return new ObjectReader(this, _config, _valueType, _rootDeserializer, _valueToUpdate, _schema, _injectableValues, dataformatreaders);
    }

    public ObjectReader withRootName(String s)
    {
        return _with(_config.withRootName(s));
    }

    public ObjectReader withType(JavaType javatype)
    {
        if (javatype != null && javatype.equals(_valueType))
        {
            return this;
        }
        JsonDeserializer jsondeserializer = _prefetchRootDeserializer(_config, javatype);
        DataFormatReaders dataformatreaders1 = _dataFormatReaders;
        DataFormatReaders dataformatreaders = dataformatreaders1;
        if (dataformatreaders1 != null)
        {
            dataformatreaders = dataformatreaders1.withType(javatype);
        }
        return new ObjectReader(this, _config, javatype, jsondeserializer, _valueToUpdate, _schema, _injectableValues, dataformatreaders);
    }

    public ObjectReader withType(Class class1)
    {
        return withType(_config.constructType(class1));
    }

    public void writeValue(JsonGenerator jsongenerator, Object obj)
    {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

}
