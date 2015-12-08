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
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonParseException, SerializableString, ObjectCodec, JsonGenerator, 
//            JsonParser

public class JsonFactory
    implements Serializable
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

        public final boolean enabledByDefault()
        {
            return _defaultState;
        }

        public final int getMask()
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
    protected static final ThreadLocal _recyclerRef = new ThreadLocal();
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    public ObjectCodec _objectCodec;
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

    public JsonParser createParser(InputStream inputstream)
        throws IOException, JsonParseException
    {
        return createJsonParser(inputstream);
    }

    public JsonParser createParser(byte abyte0[], int i, int j)
        throws IOException, JsonParseException
    {
        return createJsonParser(abyte0, i, j);
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

    public MatchStrength hasJSONFormat(InputAccessor inputaccessor)
        throws IOException
    {
        return ByteSourceJsonBootstrapper.hasJSONFormat(inputaccessor);
    }

    public final boolean isEnabled(Feature feature)
    {
        return (_factoryFeatures & feature.getMask()) != 0;
    }

    public JsonFactory setCodec(ObjectCodec objectcodec)
    {
        _objectCodec = objectcodec;
        return this;
    }

    static 
    {
        DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    }
}
