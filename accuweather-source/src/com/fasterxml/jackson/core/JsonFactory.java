// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.CoreVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.net.URL;

// Referenced classes of package com.fasterxml.jackson.core:
//            Versioned, JsonParseException, JsonEncoding, FormatSchema, 
//            SerializableString, ObjectCodec, JsonGenerator, JsonParser, 
//            Version

public class JsonFactory
    implements Versioned, Serializable
{
    public static final class Feature extends Enum
    {

        private static final Feature $VALUES[];
        public static final Feature CANONICALIZE_FIELD_NAMES;
        public static final Feature INTERN_FIELD_NAMES;
        private final boolean _defaultState;

        public static int collectDefaults()
        {
            int j = 0;
            Feature afeature[] = values();
            int l = afeature.length;
            for (int i = 0; i < l;)
            {
                Feature feature = afeature[i];
                int k = j;
                if (feature.enabledByDefault())
                {
                    k = j | feature.getMask();
                }
                i++;
                j = k;
            }

            return j;
        }

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonFactory$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])$VALUES.clone();
        }

        public boolean enabledByDefault()
        {
            return _defaultState;
        }

        public boolean enabledIn(int i)
        {
            return (getMask() & i) != 0;
        }

        public int getMask()
        {
            return 1 << ordinal();
        }

        static 
        {
            INTERN_FIELD_NAMES = new Feature("INTERN_FIELD_NAMES", 0, true);
            CANONICALIZE_FIELD_NAMES = new Feature("CANONICALIZE_FIELD_NAMES", 1, true);
            $VALUES = (new Feature[] {
                INTERN_FIELD_NAMES, CANONICALIZE_FIELD_NAMES
            });
        }

        private Feature(String s, int i, boolean flag)
        {
            super(s, i);
            _defaultState = flag;
        }
    }


    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR;
    public static final String FORMAT_NAME_JSON = "JSON";
    protected static final ThreadLocal _recyclerRef = new ThreadLocal();
    private static final long serialVersionUID = 0x791a681719524b4aL;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final transient BytesToNameCanonicalizer _rootByteSymbols;
    protected final transient CharsToNameCanonicalizer _rootCharSymbols;
    protected SerializableString _rootValueSeparator;

    public JsonFactory()
    {
        this(null);
    }

    public JsonFactory(ObjectCodec objectcodec)
    {
        _rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        _rootByteSymbols = BytesToNameCanonicalizer.createRoot();
        _factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        _parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        _generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        _rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        _objectCodec = objectcodec;
    }

    protected void _checkInvalidCopy(Class class1)
    {
        if (getClass() != class1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Failed copy(): ").append(getClass().getName()).append(" (version: ").append(version()).append(") does not override copy(); it has to").toString());
        } else
        {
            return;
        }
    }

    protected IOContext _createContext(Object obj, boolean flag)
    {
        return new IOContext(_getBufferRecycler(), obj, flag);
    }

    protected JsonGenerator _createGenerator(Writer writer, IOContext iocontext)
        throws IOException
    {
        return _createJsonGenerator(writer, iocontext);
    }

    protected JsonGenerator _createJsonGenerator(Writer writer, IOContext iocontext)
        throws IOException
    {
        writer = new WriterBasedJsonGenerator(iocontext, _generatorFeatures, _objectCodec, writer);
        if (_characterEscapes != null)
        {
            writer.setCharacterEscapes(_characterEscapes);
        }
        iocontext = _rootValueSeparator;
        if (iocontext != DEFAULT_ROOT_VALUE_SEPARATOR)
        {
            writer.setRootValueSeparator(iocontext);
        }
        return writer;
    }

    protected JsonParser _createJsonParser(InputStream inputstream, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return (new ByteSourceJsonBootstrapper(iocontext, inputstream)).constructParser(_parserFeatures, _objectCodec, _rootByteSymbols, _rootCharSymbols, isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES));
    }

    protected JsonParser _createJsonParser(Reader reader, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return new ReaderBasedJsonParser(iocontext, _parserFeatures, reader, _objectCodec, _rootCharSymbols.makeChild(isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES)));
    }

    protected JsonParser _createJsonParser(byte abyte0[], int i, int j, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return (new ByteSourceJsonBootstrapper(iocontext, abyte0, i, j)).constructParser(_parserFeatures, _objectCodec, _rootByteSymbols, _rootCharSymbols, isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES));
    }

    protected JsonParser _createParser(InputStream inputstream, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return _createJsonParser(inputstream, iocontext);
    }

    protected JsonParser _createParser(Reader reader, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return _createJsonParser(reader, iocontext);
    }

    protected JsonParser _createParser(byte abyte0[], int i, int j, IOContext iocontext)
        throws IOException, JsonParseException
    {
        return _createJsonParser(abyte0, i, j, iocontext);
    }

    protected JsonGenerator _createUTF8Generator(OutputStream outputstream, IOContext iocontext)
        throws IOException
    {
        return _createUTF8JsonGenerator(outputstream, iocontext);
    }

    protected JsonGenerator _createUTF8JsonGenerator(OutputStream outputstream, IOContext iocontext)
        throws IOException
    {
        outputstream = new UTF8JsonGenerator(iocontext, _generatorFeatures, _objectCodec, outputstream);
        if (_characterEscapes != null)
        {
            outputstream.setCharacterEscapes(_characterEscapes);
        }
        iocontext = _rootValueSeparator;
        if (iocontext != DEFAULT_ROOT_VALUE_SEPARATOR)
        {
            outputstream.setRootValueSeparator(iocontext);
        }
        return outputstream;
    }

    protected Writer _createWriter(OutputStream outputstream, JsonEncoding jsonencoding, IOContext iocontext)
        throws IOException
    {
        if (jsonencoding == JsonEncoding.UTF8)
        {
            return new UTF8Writer(iocontext, outputstream);
        } else
        {
            return new OutputStreamWriter(outputstream, jsonencoding.getJavaName());
        }
    }

    public BufferRecycler _getBufferRecycler()
    {
        Object obj = (SoftReference)_recyclerRef.get();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = (BufferRecycler)((SoftReference) (obj)).get();
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new BufferRecycler();
            _recyclerRef.set(new SoftReference(obj1));
        }
        return ((BufferRecycler) (obj1));
    }

    protected InputStream _optimizedStreamFromURL(URL url)
        throws IOException
    {
        if ("file".equals(url.getProtocol()))
        {
            String s = url.getHost();
            if (s == null || s.length() == 0)
            {
                if (url.getPath().indexOf('%') < 0)
                {
                    return new FileInputStream(url.getPath());
                } else
                {
                    return new FileInputStream(url.getPath());
                }
            }
        }
        return url.openStream();
    }

    public boolean canUseSchema(FormatSchema formatschema)
    {
        String s = getFormatName();
        return s != null && s.equals(formatschema.getSchemaType());
    }

    public final JsonFactory configure(Feature feature, boolean flag)
    {
        if (flag)
        {
            return enable(feature);
        } else
        {
            return disable(feature);
        }
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean flag)
    {
        if (flag)
        {
            return enable(feature);
        } else
        {
            return disable(feature);
        }
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean flag)
    {
        if (flag)
        {
            return enable(feature);
        } else
        {
            return disable(feature);
        }
    }

    public JsonFactory copy()
    {
        _checkInvalidCopy(com/fasterxml/jackson/core/JsonFactory);
        return new JsonFactory(null);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonencoding)
        throws IOException
    {
        return createJsonGenerator(file, jsonencoding);
    }

    public JsonGenerator createGenerator(OutputStream outputstream)
        throws IOException
    {
        return createJsonGenerator(outputstream);
    }

    public JsonGenerator createGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
        throws IOException
    {
        return createJsonGenerator(outputstream, jsonencoding);
    }

    public JsonGenerator createGenerator(Writer writer)
        throws IOException
    {
        return createJsonGenerator(writer);
    }

    public JsonGenerator createJsonGenerator(File file, JsonEncoding jsonencoding)
        throws IOException
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        IOContext iocontext = _createContext(fileoutputstream, true);
        iocontext.setEncoding(jsonencoding);
        if (jsonencoding == JsonEncoding.UTF8)
        {
            file = fileoutputstream;
            if (_outputDecorator != null)
            {
                file = _outputDecorator.decorate(iocontext, fileoutputstream);
            }
            return _createUTF8JsonGenerator(file, iocontext);
        }
        jsonencoding = _createWriter(fileoutputstream, jsonencoding, iocontext);
        file = jsonencoding;
        if (_outputDecorator != null)
        {
            file = _outputDecorator.decorate(iocontext, jsonencoding);
        }
        return _createGenerator(file, iocontext);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputstream)
        throws IOException
    {
        return createJsonGenerator(outputstream, JsonEncoding.UTF8);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
        throws IOException
    {
        IOContext iocontext = _createContext(outputstream, false);
        iocontext.setEncoding(jsonencoding);
        if (jsonencoding == JsonEncoding.UTF8)
        {
            jsonencoding = outputstream;
            if (_outputDecorator != null)
            {
                jsonencoding = _outputDecorator.decorate(iocontext, outputstream);
            }
            return _createUTF8JsonGenerator(jsonencoding, iocontext);
        }
        jsonencoding = _createWriter(outputstream, jsonencoding, iocontext);
        outputstream = jsonencoding;
        if (_outputDecorator != null)
        {
            outputstream = _outputDecorator.decorate(iocontext, jsonencoding);
        }
        return _createGenerator(outputstream, iocontext);
    }

    public JsonGenerator createJsonGenerator(Writer writer)
        throws IOException
    {
        IOContext iocontext = _createContext(writer, false);
        Writer writer1 = writer;
        if (_outputDecorator != null)
        {
            writer1 = _outputDecorator.decorate(iocontext, writer);
        }
        return _createGenerator(writer1, iocontext);
    }

    public JsonParser createJsonParser(File file)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(file, true);
        FileInputStream fileinputstream = new FileInputStream(file);
        file = fileinputstream;
        if (_inputDecorator != null)
        {
            file = _inputDecorator.decorate(iocontext, fileinputstream);
        }
        return _createParser(file, iocontext);
    }

    public JsonParser createJsonParser(InputStream inputstream)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(inputstream, false);
        InputStream inputstream1 = inputstream;
        if (_inputDecorator != null)
        {
            inputstream1 = _inputDecorator.decorate(iocontext, inputstream);
        }
        return _createParser(inputstream1, iocontext);
    }

    public JsonParser createJsonParser(Reader reader)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(reader, false);
        Reader reader1 = reader;
        if (_inputDecorator != null)
        {
            reader1 = _inputDecorator.decorate(iocontext, reader);
        }
        return _createParser(reader1, iocontext);
    }

    public JsonParser createJsonParser(String s)
        throws IOException, JsonParseException
    {
        StringReader stringreader = new StringReader(s);
        IOContext iocontext = _createContext(stringreader, true);
        s = stringreader;
        if (_inputDecorator != null)
        {
            s = _inputDecorator.decorate(iocontext, stringreader);
        }
        return _createParser(s, iocontext);
    }

    public JsonParser createJsonParser(URL url)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(url, true);
        InputStream inputstream = _optimizedStreamFromURL(url);
        url = inputstream;
        if (_inputDecorator != null)
        {
            url = _inputDecorator.decorate(iocontext, inputstream);
        }
        return _createParser(url, iocontext);
    }

    public JsonParser createJsonParser(byte abyte0[])
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(abyte0, true);
        if (_inputDecorator != null)
        {
            InputStream inputstream = _inputDecorator.decorate(iocontext, abyte0, 0, abyte0.length);
            if (inputstream != null)
            {
                return _createParser(inputstream, iocontext);
            }
        }
        return _createParser(abyte0, 0, abyte0.length, iocontext);
    }

    public JsonParser createJsonParser(byte abyte0[], int i, int j)
        throws IOException, JsonParseException
    {
        IOContext iocontext = _createContext(abyte0, true);
        if (_inputDecorator != null)
        {
            InputStream inputstream = _inputDecorator.decorate(iocontext, abyte0, i, j);
            if (inputstream != null)
            {
                return _createParser(inputstream, iocontext);
            }
        }
        return _createParser(abyte0, i, j, iocontext);
    }

    public JsonParser createParser(File file)
        throws IOException, JsonParseException
    {
        return createJsonParser(file);
    }

    public JsonParser createParser(InputStream inputstream)
        throws IOException, JsonParseException
    {
        return createJsonParser(inputstream);
    }

    public JsonParser createParser(Reader reader)
        throws IOException, JsonParseException
    {
        return createJsonParser(reader);
    }

    public JsonParser createParser(String s)
        throws IOException, JsonParseException
    {
        return createJsonParser(s);
    }

    public JsonParser createParser(URL url)
        throws IOException, JsonParseException
    {
        return createJsonParser(url);
    }

    public JsonParser createParser(byte abyte0[])
        throws IOException, JsonParseException
    {
        return createJsonParser(abyte0);
    }

    public JsonParser createParser(byte abyte0[], int i, int j)
        throws IOException, JsonParseException
    {
        return createJsonParser(abyte0, i, j);
    }

    public JsonFactory disable(Feature feature)
    {
        _factoryFeatures = _factoryFeatures & ~feature.getMask();
        return this;
    }

    public JsonFactory disable(JsonGenerator.Feature feature)
    {
        _generatorFeatures = _generatorFeatures & ~feature.getMask();
        return this;
    }

    public JsonFactory disable(JsonParser.Feature feature)
    {
        _parserFeatures = _parserFeatures & ~feature.getMask();
        return this;
    }

    public JsonFactory enable(Feature feature)
    {
        _factoryFeatures = _factoryFeatures | feature.getMask();
        return this;
    }

    public JsonFactory enable(JsonGenerator.Feature feature)
    {
        _generatorFeatures = _generatorFeatures | feature.getMask();
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature)
    {
        _parserFeatures = _parserFeatures | feature.getMask();
        return this;
    }

    public CharacterEscapes getCharacterEscapes()
    {
        return _characterEscapes;
    }

    public ObjectCodec getCodec()
    {
        return _objectCodec;
    }

    public String getFormatName()
    {
        if (getClass() == com/fasterxml/jackson/core/JsonFactory)
        {
            return "JSON";
        } else
        {
            return null;
        }
    }

    public InputDecorator getInputDecorator()
    {
        return _inputDecorator;
    }

    public OutputDecorator getOutputDecorator()
    {
        return _outputDecorator;
    }

    public String getRootValueSeparator()
    {
        if (_rootValueSeparator == null)
        {
            return null;
        } else
        {
            return _rootValueSeparator.getValue();
        }
    }

    public MatchStrength hasFormat(InputAccessor inputaccessor)
        throws IOException
    {
        if (getClass() == com/fasterxml/jackson/core/JsonFactory)
        {
            return hasJSONFormat(inputaccessor);
        } else
        {
            return null;
        }
    }

    protected MatchStrength hasJSONFormat(InputAccessor inputaccessor)
        throws IOException
    {
        return ByteSourceJsonBootstrapper.hasJSONFormat(inputaccessor);
    }

    public final boolean isEnabled(Feature feature)
    {
        return (_factoryFeatures & feature.getMask()) != 0;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature)
    {
        return (_generatorFeatures & feature.getMask()) != 0;
    }

    public final boolean isEnabled(JsonParser.Feature feature)
    {
        return (_parserFeatures & feature.getMask()) != 0;
    }

    protected Object readResolve()
    {
        return new JsonFactory(_objectCodec);
    }

    public boolean requiresCustomCodec()
    {
        return false;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterescapes)
    {
        _characterEscapes = characterescapes;
        return this;
    }

    public JsonFactory setCodec(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
        return this;
    }

    public JsonFactory setInputDecorator(InputDecorator inputdecorator)
    {
        _inputDecorator = inputdecorator;
        return this;
    }

    public JsonFactory setOutputDecorator(OutputDecorator outputdecorator)
    {
        _outputDecorator = outputdecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = new SerializedString(s);
        }
        _rootValueSeparator = s;
        return this;
    }

    public Version version()
    {
        return CoreVersion.instance.version();
    }

    static 
    {
        DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    }
}
