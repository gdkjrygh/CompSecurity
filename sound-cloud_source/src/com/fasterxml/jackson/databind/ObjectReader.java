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
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JsonNode, ObjectMapper, JavaType, DeserializationConfig, 
//            JsonMappingException, JsonDeserializer, DeserializationContext, DeserializationFeature, 
//            InjectableValues

public class ObjectReader extends ObjectCodec
    implements Serializable
{

    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
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
            _rootDeserializer = _prefetchRootDeserializer(deserializationconfig, javatype);
            _dataFormatReaders = null;
            return;
        }
    }

    protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer, Object obj, FormatSchema formatschema, InjectableValues injectablevalues, 
            DataFormatReaders dataformatreaders)
    {
        _config = deserializationconfig;
        _context = objectreader._context;
        _rootDeserializers = objectreader._rootDeserializers;
        _jsonFactory = objectreader._jsonFactory;
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

    protected JsonNode _bindAndCloseAsTree(JsonParser jsonparser)
        throws IOException, JsonParseException, JsonMappingException
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
        throws IOException, JsonParseException, JsonMappingException
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

    protected JsonNode _detectBindAndCloseAsTree(InputStream inputstream)
        throws IOException
    {
        inputstream = _dataFormatReaders.findFormat(inputstream);
        if (!inputstream.hasMatch())
        {
            _reportUnkownFormat(_dataFormatReaders, inputstream);
        }
        JsonParser jsonparser = inputstream.createParserWithMatch();
        jsonparser.enable(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE);
        return inputstream.getReader()._bindAndCloseAsTree(jsonparser);
    }

    protected final JsonDeserializer _findRootDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
        throws JsonMappingException
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

    protected final JsonDeserializer _prefetchRootDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
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

    protected void _reportUnkownFormat(DataFormatReaders dataformatreaders, com.fasterxml.jackson.databind.deser.DataFormatReaders.Match match)
        throws JsonProcessingException
    {
        throw new JsonParseException((new StringBuilder("Can not detect format from input, does not look like any of detectable formats ")).append(dataformatreaders.toString()).toString(), JsonLocation.NA);
    }

    protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype, JsonDeserializer jsondeserializer)
        throws IOException, JsonParseException, JsonMappingException
    {
        String s1 = _config.getRootName();
        String s = s1;
        if (s1 == null)
        {
            s = _rootNames.findRootName(javatype, _config).getValue();
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

    protected final DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return _context.createInstance(deserializationconfig, jsonparser, _injectableValues);
    }

    public JsonFactory getFactory()
    {
        return _jsonFactory;
    }

    public JsonFactory getJsonFactory()
    {
        return _jsonFactory;
    }

    public JsonNode readTree(InputStream inputstream)
        throws IOException, JsonProcessingException
    {
        if (_dataFormatReaders != null)
        {
            return _detectBindAndCloseAsTree(inputstream);
        } else
        {
            return _bindAndCloseAsTree(_jsonFactory.createJsonParser(inputstream));
        }
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

    public void writeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

}
