// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind:
//            SerializationFeature, SerializationConfig, ObjectMapper, JavaType, 
//            JsonMappingException, JsonSerializer

public class ObjectWriter
    implements Serializable
{

    protected static final PrettyPrinter NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    private static final long serialVersionUID = 0x9e4a868e1a7967a4L;
    protected final boolean _cfgBigDecimalAsPlain;
    protected final CharacterEscapes _characterEscapes;
    protected final SerializationConfig _config;
    protected final JsonFactory _generatorFactory;
    protected final PrettyPrinter _prettyPrinter;
    protected final JsonSerializer _rootSerializer;
    protected final JavaType _rootType;
    protected final FormatSchema _schema;
    protected final SerializerFactory _serializerFactory;
    protected final DefaultSerializerProvider _serializerProvider;

    protected ObjectWriter(ObjectMapper objectmapper, SerializationConfig serializationconfig)
    {
        _config = serializationconfig;
        _cfgBigDecimalAsPlain = _config.isEnabled(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN);
        _serializerProvider = objectmapper._serializerProvider;
        _serializerFactory = objectmapper._serializerFactory;
        _generatorFactory = objectmapper._jsonFactory;
        _rootType = null;
        _rootSerializer = null;
        _prettyPrinter = null;
        _schema = null;
        _characterEscapes = null;
    }

    protected ObjectWriter(ObjectMapper objectmapper, SerializationConfig serializationconfig, JavaType javatype, PrettyPrinter prettyprinter)
    {
        _config = serializationconfig;
        _cfgBigDecimalAsPlain = _config.isEnabled(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN);
        _serializerProvider = objectmapper._serializerProvider;
        _serializerFactory = objectmapper._serializerFactory;
        _generatorFactory = objectmapper._jsonFactory;
        _prettyPrinter = prettyprinter;
        _schema = null;
        _characterEscapes = null;
        if (javatype == null || javatype.hasRawClass(java/lang/Object))
        {
            _rootType = null;
            _rootSerializer = null;
            return;
        } else
        {
            _rootType = javatype.withStaticTyping();
            _rootSerializer = _prefetchRootSerializer(serializationconfig, _rootType);
            return;
        }
    }

    private void _configureJsonGenerator(JsonGenerator jsongenerator)
    {
        if (_prettyPrinter == null) goto _L2; else goto _L1
_L1:
        PrettyPrinter prettyprinter1 = _prettyPrinter;
        if (prettyprinter1 == NULL_PRETTY_PRINTER)
        {
            jsongenerator.setPrettyPrinter(null);
        } else
        {
            PrettyPrinter prettyprinter = prettyprinter1;
            if (prettyprinter1 instanceof Instantiatable)
            {
                prettyprinter = (PrettyPrinter)((Instantiatable)prettyprinter1).createInstance();
            }
            jsongenerator.setPrettyPrinter(prettyprinter);
        }
_L4:
        if (_characterEscapes != null)
        {
            jsongenerator.setCharacterEscapes(_characterEscapes);
        }
        if (_schema != null)
        {
            jsongenerator.setSchema(_schema);
        }
        if (_cfgBigDecimalAsPlain)
        {
            jsongenerator.enable(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN);
        }
        return;
_L2:
        if (_config.isEnabled(SerializationFeature.INDENT_OUTPUT))
        {
            jsongenerator.useDefaultPrettyPrinter();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private final void _writeCloseable(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
    {
        Object obj1 = (Closeable)obj;
        if (_rootType != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
_L1:
        jsongenerator.close();
        ((Closeable) (obj1)).close();
        return;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj, _rootType, _rootSerializer);
          goto _L1
        serializationconfig;
        obj = obj1;
        obj1 = serializationconfig;
        serializationconfig = jsongenerator;
        jsongenerator = ((JsonGenerator) (obj1));
_L3:
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
        serializationconfig = null;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        jsongenerator;
        obj = null;
        serializationconfig = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
    {
        boolean flag;
        boolean flag1;
        _configureJsonGenerator(jsongenerator);
        if (_config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
        {
            _writeCloseable(jsongenerator, obj, _config);
            return;
        }
        flag1 = false;
        flag = flag1;
        if (_rootType != null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        _serializerProvider(_config).serializeValue(jsongenerator, obj);
_L3:
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
_L2:
        flag = flag1;
        _serializerProvider(_config).serializeValue(jsongenerator, obj, _rootType, _rootSerializer);
          goto _L3
    }

    protected JsonSerializer _prefetchRootSerializer(SerializationConfig serializationconfig, JavaType javatype)
    {
        if (javatype == null || !_config.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH))
        {
            return null;
        }
        try
        {
            serializationconfig = _serializerProvider(serializationconfig).findTypedValueSerializer(javatype, true, null);
        }
        // Misplaced declaration of an exception variable
        catch (SerializationConfig serializationconfig)
        {
            return null;
        }
        return serializationconfig;
    }

    protected DefaultSerializerProvider _serializerProvider(SerializationConfig serializationconfig)
    {
        return _serializerProvider.createInstance(serializationconfig, _serializerFactory);
    }

    public String writeValueAsString(Object obj)
    {
        SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_generatorFactory._getBufferRecycler());
        try
        {
            _configAndWriteValue(_generatorFactory.createGenerator(segmentedstringwriter), obj);
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

}
