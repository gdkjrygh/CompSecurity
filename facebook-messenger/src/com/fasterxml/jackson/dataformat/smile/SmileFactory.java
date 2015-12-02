// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.dataformat.smile;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.IOContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

// Referenced classes of package com.fasterxml.jackson.dataformat.smile:
//            SmileGenerator, SmileParserBootstrapper, ModuleVersion, SmileParser

public class SmileFactory extends JsonFactory
{

    static final int DEFAULT_SMILE_GENERATOR_FEATURE_FLAGS = SmileGenerator.Feature.collectDefaults();
    static final int DEFAULT_SMILE_PARSER_FEATURE_FLAGS = SmileParser.Feature.collectDefaults();
    public static final String FORMAT_NAME_SMILE = "Smile";
    protected boolean _cfgDelegateToTextual;
    protected int _smileGeneratorFeatures;
    protected int _smileParserFeatures;

    public SmileFactory()
    {
        this(null);
    }

    public SmileFactory(ObjectCodec objectcodec)
    {
        super(objectcodec);
        _smileParserFeatures = DEFAULT_SMILE_PARSER_FEATURE_FLAGS;
        _smileGeneratorFeatures = DEFAULT_SMILE_GENERATOR_FEATURE_FLAGS;
    }

    protected JsonGenerator _createJsonGenerator(Writer writer, IOContext iocontext)
    {
        if (_cfgDelegateToTextual)
        {
            return super._createJsonGenerator(writer, iocontext);
        } else
        {
            throw new UnsupportedOperationException("Can not create generator for non-byte-based target");
        }
    }

    protected SmileGenerator _createJsonGenerator(OutputStream outputstream, IOContext iocontext)
    {
        int i = _smileGeneratorFeatures;
        outputstream = new SmileGenerator(iocontext, _generatorFeatures, i, _objectCodec, outputstream);
        if ((SmileGenerator.Feature.WRITE_HEADER.getMask() & i) != 0)
        {
            outputstream.writeHeader();
        } else
        {
            if ((SmileGenerator.Feature.CHECK_SHARED_STRING_VALUES.getMask() & i) != 0)
            {
                throw new JsonGenerationException("Inconsistent settings: WRITE_HEADER disabled, but CHECK_SHARED_STRING_VALUES enabled; can not construct generator due to possible data loss (either enable WRITE_HEADER, or disable CHECK_SHARED_STRING_VALUES to resolve)");
            }
            if ((SmileGenerator.Feature.ENCODE_BINARY_AS_7BIT.getMask() & i) == 0)
            {
                throw new JsonGenerationException("Inconsistent settings: WRITE_HEADER disabled, but ENCODE_BINARY_AS_7BIT disabled; can not construct generator due to possible data loss (either enable WRITE_HEADER, or ENCODE_BINARY_AS_7BIT to resolve)");
            }
        }
        return outputstream;
    }

    protected volatile JsonParser _createJsonParser(InputStream inputstream, IOContext iocontext)
    {
        return _createJsonParser(inputstream, iocontext);
    }

    protected JsonParser _createJsonParser(Reader reader, IOContext iocontext)
    {
        if (_cfgDelegateToTextual)
        {
            return super._createJsonParser(reader, iocontext);
        } else
        {
            throw new UnsupportedOperationException("Can not create generator for non-byte-based target");
        }
    }

    protected volatile JsonParser _createJsonParser(byte abyte0[], int i, int j, IOContext iocontext)
    {
        return _createJsonParser(abyte0, i, j, iocontext);
    }

    protected SmileParser _createJsonParser(InputStream inputstream, IOContext iocontext)
    {
        return (new SmileParserBootstrapper(iocontext, inputstream)).constructParser(_parserFeatures, _smileParserFeatures, isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES), _objectCodec, _rootByteSymbols);
    }

    protected SmileParser _createJsonParser(byte abyte0[], int i, int j, IOContext iocontext)
    {
        return (new SmileParserBootstrapper(iocontext, abyte0, i, j)).constructParser(_parserFeatures, _smileParserFeatures, isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES), _objectCodec, _rootByteSymbols);
    }

    protected JsonGenerator _createUTF8JsonGenerator(OutputStream outputstream, IOContext iocontext)
    {
        return _createJsonGenerator(outputstream, iocontext);
    }

    protected Writer _createWriter(OutputStream outputstream, JsonEncoding jsonencoding, IOContext iocontext)
    {
        if (_cfgDelegateToTextual)
        {
            return super._createWriter(outputstream, jsonencoding, iocontext);
        } else
        {
            throw new UnsupportedOperationException("Can not create generator for non-byte-based target");
        }
    }

    public final SmileFactory configure(SmileGenerator.Feature feature, boolean flag)
    {
        if (flag)
        {
            enable(feature);
            return this;
        } else
        {
            disable(feature);
            return this;
        }
    }

    public final SmileFactory configure(SmileParser.Feature feature, boolean flag)
    {
        if (flag)
        {
            enable(feature);
            return this;
        } else
        {
            disable(feature);
            return this;
        }
    }

    public volatile JsonGenerator createJsonGenerator(OutputStream outputstream)
    {
        return createJsonGenerator(outputstream);
    }

    public volatile JsonGenerator createJsonGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
    {
        return createJsonGenerator(outputstream, jsonencoding);
    }

    public SmileGenerator createJsonGenerator(OutputStream outputstream)
    {
        return _createJsonGenerator(outputstream, _createContext(outputstream, false));
    }

    public SmileGenerator createJsonGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
    {
        return createJsonGenerator(outputstream);
    }

    public volatile JsonParser createJsonParser(File file)
    {
        return createJsonParser(file);
    }

    public volatile JsonParser createJsonParser(InputStream inputstream)
    {
        return createJsonParser(inputstream);
    }

    public volatile JsonParser createJsonParser(URL url)
    {
        return createJsonParser(url);
    }

    public volatile JsonParser createJsonParser(byte abyte0[])
    {
        return createJsonParser(abyte0);
    }

    public volatile JsonParser createJsonParser(byte abyte0[], int i, int j)
    {
        return createJsonParser(abyte0, i, j);
    }

    public SmileParser createJsonParser(File file)
    {
        return _createJsonParser(new FileInputStream(file), _createContext(file, true));
    }

    public SmileParser createJsonParser(InputStream inputstream)
    {
        return _createJsonParser(inputstream, _createContext(inputstream, false));
    }

    public SmileParser createJsonParser(URL url)
    {
        return _createJsonParser(_optimizedStreamFromURL(url), _createContext(url, true));
    }

    public SmileParser createJsonParser(byte abyte0[])
    {
        IOContext iocontext = _createContext(abyte0, true);
        return _createJsonParser(abyte0, 0, abyte0.length, iocontext);
    }

    public SmileParser createJsonParser(byte abyte0[], int i, int j)
    {
        return _createJsonParser(abyte0, i, j, _createContext(abyte0, true));
    }

    public void delegateToTextual(boolean flag)
    {
        _cfgDelegateToTextual = flag;
    }

    public SmileFactory disable(SmileGenerator.Feature feature)
    {
        _smileGeneratorFeatures = _smileGeneratorFeatures & ~feature.getMask();
        return this;
    }

    public SmileFactory disable(SmileParser.Feature feature)
    {
        _smileParserFeatures = _smileParserFeatures & ~feature.getMask();
        return this;
    }

    public SmileFactory enable(SmileGenerator.Feature feature)
    {
        _smileGeneratorFeatures = _smileGeneratorFeatures | feature.getMask();
        return this;
    }

    public SmileFactory enable(SmileParser.Feature feature)
    {
        _smileParserFeatures = _smileParserFeatures | feature.getMask();
        return this;
    }

    public String getFormatName()
    {
        return "Smile";
    }

    public MatchStrength hasFormat(InputAccessor inputaccessor)
    {
        return SmileParserBootstrapper.hasSmileFormat(inputaccessor);
    }

    public final boolean isEnabled(SmileGenerator.Feature feature)
    {
        return (_smileGeneratorFeatures & feature.getMask()) != 0;
    }

    public final boolean isEnabled(SmileParser.Feature feature)
    {
        return (_smileParserFeatures & feature.getMask()) != 0;
    }

    public Version version()
    {
        return ModuleVersion.instance.version();
    }

}
