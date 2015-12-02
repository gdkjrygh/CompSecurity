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
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.CoreVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.net.URL;

// Referenced classes of package com.fasterxml.jackson.core:
//            Versioned, JsonEncoding, ObjectCodec, JsonGenerator, 
//            JsonParser, Version

public class JsonFactory
    implements Versioned
{

    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    public static final String FORMAT_NAME_JSON = "JSON";
    protected static final ThreadLocal _recyclerRef = new ThreadLocal();
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected BytesToNameCanonicalizer _rootByteSymbols;
    protected CharsToNameCanonicalizer _rootCharSymbols;

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
        _objectCodec = objectcodec;
    }

    protected IOContext _createContext(Object obj, boolean flag)
    {
        return new IOContext(_getBufferRecycler(), obj, flag);
    }

    protected JsonGenerator _createJsonGenerator(Writer writer, IOContext iocontext)
    {
        writer = new WriterBasedJsonGenerator(iocontext, _generatorFeatures, _objectCodec, writer);
        if (_characterEscapes != null)
        {
            writer.setCharacterEscapes(_characterEscapes);
        }
        return writer;
    }

    protected JsonParser _createJsonParser(InputStream inputstream, IOContext iocontext)
    {
        return (new ByteSourceJsonBootstrapper(iocontext, inputstream)).constructParser(_parserFeatures, _objectCodec, _rootByteSymbols, _rootCharSymbols, isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES));
    }

    protected JsonParser _createJsonParser(Reader reader, IOContext iocontext)
    {
        return new ReaderBasedJsonParser(iocontext, _parserFeatures, reader, _objectCodec, _rootCharSymbols.makeChild(isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES)));
    }

    protected JsonParser _createJsonParser(byte abyte0[], int i, int j, IOContext iocontext)
    {
        return (new ByteSourceJsonBootstrapper(iocontext, abyte0, i, j)).constructParser(_parserFeatures, _objectCodec, _rootByteSymbols, _rootCharSymbols, isEnabled(Feature.CANONICALIZE_FIELD_NAMES), isEnabled(Feature.INTERN_FIELD_NAMES));
    }

    protected JsonGenerator _createUTF8JsonGenerator(OutputStream outputstream, IOContext iocontext)
    {
        outputstream = new UTF8JsonGenerator(iocontext, _generatorFeatures, _objectCodec, outputstream);
        if (_characterEscapes != null)
        {
            outputstream.setCharacterEscapes(_characterEscapes);
        }
        return outputstream;
    }

    protected Writer _createWriter(OutputStream outputstream, JsonEncoding jsonencoding, IOContext iocontext)
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
    {
        if ("file".equals(url.getProtocol()))
        {
            String s = url.getHost();
            if (s == null || s.length() == 0)
            {
                return new FileInputStream(url.getPath());
            }
        }
        return url.openStream();
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

    public JsonGenerator createJsonGenerator(File file, JsonEncoding jsonencoding)
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
        return _createJsonGenerator(file, iocontext);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputstream)
    {
        return createJsonGenerator(outputstream, JsonEncoding.UTF8);
    }

    public JsonGenerator createJsonGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
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
        return _createJsonGenerator(outputstream, iocontext);
    }

    public JsonGenerator createJsonGenerator(Writer writer)
    {
        IOContext iocontext = _createContext(writer, false);
        Writer writer1 = writer;
        if (_outputDecorator != null)
        {
            writer1 = _outputDecorator.decorate(iocontext, writer);
        }
        return _createJsonGenerator(writer1, iocontext);
    }

    public JsonParser createJsonParser(File file)
    {
        IOContext iocontext = _createContext(file, true);
        FileInputStream fileinputstream = new FileInputStream(file);
        file = fileinputstream;
        if (_inputDecorator != null)
        {
            file = _inputDecorator.decorate(iocontext, fileinputstream);
        }
        return _createJsonParser(file, iocontext);
    }

    public JsonParser createJsonParser(InputStream inputstream)
    {
        IOContext iocontext = _createContext(inputstream, false);
        InputStream inputstream1 = inputstream;
        if (_inputDecorator != null)
        {
            inputstream1 = _inputDecorator.decorate(iocontext, inputstream);
        }
        return _createJsonParser(inputstream1, iocontext);
    }

    public JsonParser createJsonParser(Reader reader)
    {
        IOContext iocontext = _createContext(reader, false);
        Reader reader1 = reader;
        if (_inputDecorator != null)
        {
            reader1 = _inputDecorator.decorate(iocontext, reader);
        }
        return _createJsonParser(reader1, iocontext);
    }

    public JsonParser createJsonParser(String s)
    {
        StringReader stringreader = new StringReader(s);
        IOContext iocontext = _createContext(stringreader, true);
        s = stringreader;
        if (_inputDecorator != null)
        {
            s = _inputDecorator.decorate(iocontext, stringreader);
        }
        return _createJsonParser(s, iocontext);
    }

    public JsonParser createJsonParser(URL url)
    {
        IOContext iocontext = _createContext(url, true);
        InputStream inputstream = _optimizedStreamFromURL(url);
        url = inputstream;
        if (_inputDecorator != null)
        {
            url = _inputDecorator.decorate(iocontext, inputstream);
        }
        return _createJsonParser(url, iocontext);
    }

    public JsonParser createJsonParser(byte abyte0[])
    {
        IOContext iocontext = _createContext(abyte0, true);
        if (_inputDecorator != null)
        {
            InputStream inputstream = _inputDecorator.decorate(iocontext, abyte0, 0, abyte0.length);
            if (inputstream != null)
            {
                return _createJsonParser(inputstream, iocontext);
            }
        }
        return _createJsonParser(abyte0, 0, abyte0.length, iocontext);
    }

    public JsonParser createJsonParser(byte abyte0[], int i, int j)
    {
        IOContext iocontext = _createContext(abyte0, true);
        if (_inputDecorator != null)
        {
            InputStream inputstream = _inputDecorator.decorate(iocontext, abyte0, i, j);
            if (inputstream != null)
            {
                return _createJsonParser(inputstream, iocontext);
            }
        }
        return _createJsonParser(abyte0, i, j, iocontext);
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

    public MatchStrength hasFormat(InputAccessor inputaccessor)
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

    public Version version()
    {
        return CoreVersion.instance.version();
    }


    private class Feature extends Enum
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

}
