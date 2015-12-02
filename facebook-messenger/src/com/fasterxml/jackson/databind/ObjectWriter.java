// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.DatabindVersion;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind:
//            ObjectMapper, SerializationFeature, SerializationConfig, JavaType, 
//            MapperFeature

public class ObjectWriter
    implements Versioned
{

    protected static final PrettyPrinter NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    protected final SerializationConfig _config;
    protected final JsonFactory _jsonFactory;
    protected final PrettyPrinter _prettyPrinter;
    protected final JavaType _rootType;
    protected final FormatSchema _schema;
    protected final SerializerFactory _serializerFactory;
    protected final DefaultSerializerProvider _serializerProvider;

    protected ObjectWriter(ObjectMapper objectmapper, SerializationConfig serializationconfig)
    {
        _config = serializationconfig;
        _serializerProvider = objectmapper._serializerProvider;
        _serializerFactory = objectmapper._serializerFactory;
        _jsonFactory = objectmapper._jsonFactory;
        _rootType = null;
        _prettyPrinter = null;
        _schema = null;
    }

    protected ObjectWriter(ObjectMapper objectmapper, SerializationConfig serializationconfig, FormatSchema formatschema)
    {
        _config = serializationconfig;
        _serializerProvider = objectmapper._serializerProvider;
        _serializerFactory = objectmapper._serializerFactory;
        _jsonFactory = objectmapper._jsonFactory;
        _rootType = null;
        _prettyPrinter = null;
        _schema = formatschema;
    }

    protected ObjectWriter(ObjectMapper objectmapper, SerializationConfig serializationconfig, JavaType javatype, PrettyPrinter prettyprinter)
    {
        _config = serializationconfig;
        _serializerProvider = objectmapper._serializerProvider;
        _serializerFactory = objectmapper._serializerFactory;
        _jsonFactory = objectmapper._jsonFactory;
        _rootType = javatype;
        _prettyPrinter = prettyprinter;
        _schema = null;
    }

    protected ObjectWriter(ObjectWriter objectwriter, SerializationConfig serializationconfig)
    {
        _config = serializationconfig;
        _serializerProvider = objectwriter._serializerProvider;
        _serializerFactory = objectwriter._serializerFactory;
        _jsonFactory = objectwriter._jsonFactory;
        _schema = objectwriter._schema;
        _rootType = objectwriter._rootType;
        _prettyPrinter = objectwriter._prettyPrinter;
    }

    protected ObjectWriter(ObjectWriter objectwriter, SerializationConfig serializationconfig, JavaType javatype, PrettyPrinter prettyprinter, FormatSchema formatschema)
    {
        _config = serializationconfig;
        _serializerProvider = objectwriter._serializerProvider;
        _serializerFactory = objectwriter._serializerFactory;
        _jsonFactory = objectwriter._jsonFactory;
        _rootType = javatype;
        _prettyPrinter = prettyprinter;
        _schema = formatschema;
    }

    private final void _configAndWriteCloseable(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
    {
        Object obj1 = (Closeable)obj;
        if (_rootType != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
_L1:
        if (_schema != null)
        {
            jsongenerator.setSchema(_schema);
        }
        jsongenerator.close();
        ((Closeable) (obj1)).close();
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
            break MISSING_BLOCK_LABEL_73;
        }
        throw new NullPointerException();
        return;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
          goto _L1
        serializationconfig;
        obj = obj1;
        obj1 = serializationconfig;
        serializationconfig = jsongenerator;
        jsongenerator = ((JsonGenerator) (obj1));
_L3:
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
        serializationconfig = null;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        jsongenerator;
        obj = null;
        serializationconfig = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private final void _writeCloseableValue(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
    {
        Closeable closeable = (Closeable)obj;
        if (_rootType != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
_L1:
        if (_config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
        {
            jsongenerator.flush();
        }
        obj = null;
        closeable.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        throw new NullPointerException();
        return;
        _serializerProvider(serializationconfig).serializeValue(jsongenerator, obj, _rootType);
          goto _L1
        serializationconfig;
        jsongenerator = closeable;
        obj = jsongenerator;
        jsongenerator = serializationconfig;
_L3:
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
        if (true) goto _L3; else goto _L2
_L2:
    }

    protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
    {
        if (_prettyPrinter == null) goto _L2; else goto _L1
_L1:
        PrettyPrinter prettyprinter1 = _prettyPrinter;
        PrettyPrinter prettyprinter = prettyprinter1;
        if (prettyprinter1 == NULL_PRETTY_PRINTER)
        {
            prettyprinter = null;
        }
        jsongenerator.setPrettyPrinter(prettyprinter);
_L4:
        if (_schema != null)
        {
            jsongenerator.setSchema(_schema);
        }
        if (_config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
        {
            _configAndWriteCloseable(jsongenerator, obj, _config);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (_config.isEnabled(SerializationFeature.INDENT_OUTPUT))
        {
            jsongenerator.useDefaultPrettyPrinter();
        }
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (_rootType != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        _serializerProvider(_config).serializeValue(jsongenerator, obj);
_L7:
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
_L6:
        flag = flag1;
        _serializerProvider(_config).serializeValue(jsongenerator, obj, _rootType);
          goto _L7
    }

    protected DefaultSerializerProvider _serializerProvider(SerializationConfig serializationconfig)
    {
        return _serializerProvider.createInstance(serializationconfig, _serializerFactory);
    }

    public boolean canSerialize(Class class1)
    {
        return _serializerProvider(_config).hasSerializerFor(class1);
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

    public boolean isEnabled(MapperFeature mapperfeature)
    {
        return _config.isEnabled(mapperfeature);
    }

    public boolean isEnabled(SerializationFeature serializationfeature)
    {
        return _config.isEnabled(serializationfeature);
    }

    public Version version()
    {
        return DatabindVersion.instance.version();
    }

    public ObjectWriter with(PrettyPrinter prettyprinter)
    {
        if (prettyprinter == _prettyPrinter)
        {
            return this;
        }
        if (prettyprinter == null)
        {
            prettyprinter = NULL_PRETTY_PRINTER;
        }
        return new ObjectWriter(this, _config, _rootType, prettyprinter, _schema);
    }

    public ObjectWriter with(SerializationFeature serializationfeature)
    {
        serializationfeature = _config.with(serializationfeature);
        if (serializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, serializationfeature);
        }
    }

    public transient ObjectWriter with(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
    {
        serializationfeature = _config.with(serializationfeature, aserializationfeature);
        if (serializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, serializationfeature);
        }
    }

    public ObjectWriter with(FilterProvider filterprovider)
    {
        if (filterprovider == _config.getFilterProvider())
        {
            return this;
        } else
        {
            return new ObjectWriter(this, _config.withFilters(filterprovider));
        }
    }

    public ObjectWriter with(DateFormat dateformat)
    {
        dateformat = _config.with(dateformat);
        if (dateformat == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, dateformat);
        }
    }

    public ObjectWriter with(Locale locale)
    {
        locale = _config.with(locale);
        if (locale == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, locale);
        }
    }

    public ObjectWriter with(TimeZone timezone)
    {
        timezone = _config.with(timezone);
        if (timezone == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, timezone);
        }
    }

    public ObjectWriter withDefaultPrettyPrinter()
    {
        return with(new DefaultPrettyPrinter());
    }

    public transient ObjectWriter withFeatures(SerializationFeature aserializationfeature[])
    {
        aserializationfeature = _config.withFeatures(aserializationfeature);
        if (aserializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, aserializationfeature);
        }
    }

    public ObjectWriter withRootName(String s)
    {
        s = _config.withRootName(s);
        if (s == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, s);
        }
    }

    public ObjectWriter withSchema(FormatSchema formatschema)
    {
        if (_schema == formatschema)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, _config, _rootType, _prettyPrinter, formatschema);
        }
    }

    public ObjectWriter withType(TypeReference typereference)
    {
        return withType(_config.getTypeFactory().constructType(typereference.getType()));
    }

    public ObjectWriter withType(JavaType javatype)
    {
        if (javatype == _rootType)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, _config, javatype, _prettyPrinter, _schema);
        }
    }

    public ObjectWriter withType(Class class1)
    {
        return withType(_config.constructType(class1));
    }

    public ObjectWriter withView(Class class1)
    {
        class1 = _config.withView(class1);
        if (class1 == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, class1);
        }
    }

    public ObjectWriter without(SerializationFeature serializationfeature)
    {
        serializationfeature = _config.without(serializationfeature);
        if (serializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, serializationfeature);
        }
    }

    public transient ObjectWriter without(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
    {
        serializationfeature = _config.without(serializationfeature, aserializationfeature);
        if (serializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, serializationfeature);
        }
    }

    public transient ObjectWriter withoutFeatures(SerializationFeature aserializationfeature[])
    {
        aserializationfeature = _config.withoutFeatures(aserializationfeature);
        if (aserializationfeature == _config)
        {
            return this;
        } else
        {
            return new ObjectWriter(this, aserializationfeature);
        }
    }

    public void writeValue(JsonGenerator jsongenerator, Object obj)
    {
        if (_config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
        {
            _writeCloseableValue(jsongenerator, obj, _config);
        } else
        {
            if (_rootType == null)
            {
                _serializerProvider(_config).serializeValue(jsongenerator, obj);
            } else
            {
                _serializerProvider(_config).serializeValue(jsongenerator, obj, _rootType);
            }
            if (_config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
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

    public void writeValue(Writer writer, Object obj)
    {
        _configAndWriteValue(_jsonFactory.createJsonGenerator(writer), obj);
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

}
