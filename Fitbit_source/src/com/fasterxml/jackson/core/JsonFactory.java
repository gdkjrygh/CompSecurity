// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.b.e;
import com.fasterxml.jackson.core.b.f;
import com.fasterxml.jackson.core.b.g;
import com.fasterxml.jackson.core.b.i;
import com.fasterxml.jackson.core.c.a;
import com.fasterxml.jackson.core.c.b;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.io.c;
import com.fasterxml.jackson.core.io.j;
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
//            h, d, JsonEncoding, JsonParseException, 
//            b, f, JsonGenerator, JsonParser, 
//            Version

public class JsonFactory
    implements h, Serializable
{
    public static final class Feature extends Enum
    {

        public static final Feature a;
        public static final Feature b;
        private static final Feature c[];
        private final boolean _defaultState;

        public static int a()
        {
            int l = 0;
            Feature afeature[] = values();
            int j1 = afeature.length;
            for (int k = 0; k < j1;)
            {
                Feature feature = afeature[k];
                int i1 = l;
                if (feature.b())
                {
                    i1 = l | feature.c();
                }
                k++;
                l = i1;
            }

            return l;
        }

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonFactory$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])c.clone();
        }

        public boolean a(int k)
        {
            return (c() & k) != 0;
        }

        public boolean b()
        {
            return _defaultState;
        }

        public int c()
        {
            return 1 << ordinal();
        }

        static 
        {
            a = new Feature("INTERN_FIELD_NAMES", 0, true);
            b = new Feature("CANONICALIZE_FIELD_NAMES", 1, true);
            c = (new Feature[] {
                a, b
            });
        }

        private Feature(String s, int k, boolean flag)
        {
            super(s, k);
            _defaultState = flag;
        }
    }


    public static final String a = "JSON";
    protected static final int b = com.fasterxml.jackson.core.Feature.a();
    protected static final int c = com.fasterxml.jackson.core.JsonParser.Feature.a();
    protected static final int d = com.fasterxml.jackson.core.JsonGenerator.Feature.a();
    protected static final ThreadLocal e = new ThreadLocal();
    private static final com.fasterxml.jackson.core.f h;
    private static final long serialVersionUID = 0x791a681719524b4aL;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected d _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected com.fasterxml.jackson.core.f _rootValueSeparator;
    protected final transient b f;
    protected final transient a g;

    public JsonFactory()
    {
        this((d)null);
    }

    protected JsonFactory(JsonFactory jsonfactory, d d1)
    {
        f = com.fasterxml.jackson.core.c.b.a();
        g = com.fasterxml.jackson.core.c.a.a();
        _factoryFeatures = b;
        _parserFeatures = c;
        _generatorFeatures = d;
        _rootValueSeparator = h;
        _objectCodec = null;
        _factoryFeatures = jsonfactory._factoryFeatures;
        _parserFeatures = jsonfactory._parserFeatures;
        _generatorFeatures = jsonfactory._generatorFeatures;
        _characterEscapes = jsonfactory._characterEscapes;
        _inputDecorator = jsonfactory._inputDecorator;
        _outputDecorator = jsonfactory._outputDecorator;
        _rootValueSeparator = jsonfactory._rootValueSeparator;
    }

    public JsonFactory(d d1)
    {
        f = com.fasterxml.jackson.core.c.b.a();
        g = com.fasterxml.jackson.core.c.a.a();
        _factoryFeatures = b;
        _parserFeatures = c;
        _generatorFeatures = d;
        _rootValueSeparator = h;
        _objectCodec = d1;
    }

    public JsonFactory a()
    {
        a(com/fasterxml/jackson/core/JsonFactory);
        return new JsonFactory(this, null);
    }

    public JsonFactory a(Feature feature)
    {
        _factoryFeatures = _factoryFeatures | feature.c();
        return this;
    }

    public final JsonFactory a(Feature feature, boolean flag)
    {
        if (flag)
        {
            return a(feature);
        } else
        {
            return b(feature);
        }
    }

    public JsonFactory a(JsonGenerator.Feature feature)
    {
        _generatorFeatures = _generatorFeatures | feature.c();
        return this;
    }

    public final JsonFactory a(JsonGenerator.Feature feature, boolean flag)
    {
        if (flag)
        {
            return a(feature);
        } else
        {
            return b(feature);
        }
    }

    public JsonFactory a(JsonParser.Feature feature)
    {
        _parserFeatures = _parserFeatures | feature.c();
        return this;
    }

    public final JsonFactory a(JsonParser.Feature feature, boolean flag)
    {
        if (flag)
        {
            return a(feature);
        } else
        {
            return b(feature);
        }
    }

    public JsonFactory a(d d1)
    {
        _objectCodec = d1;
        return this;
    }

    public JsonFactory a(CharacterEscapes characterescapes)
    {
        _characterEscapes = characterescapes;
        return this;
    }

    public JsonFactory a(InputDecorator inputdecorator)
    {
        _inputDecorator = inputdecorator;
        return this;
    }

    public JsonFactory a(OutputDecorator outputdecorator)
    {
        _outputDecorator = outputdecorator;
        return this;
    }

    public JsonFactory a(String s)
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

    public JsonGenerator a(File file, JsonEncoding jsonencoding)
        throws IOException
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        c c1 = a(fileoutputstream, true);
        c1.a(jsonencoding);
        if (jsonencoding == com.fasterxml.jackson.core.JsonEncoding.a)
        {
            file = fileoutputstream;
            if (_outputDecorator != null)
            {
                file = _outputDecorator.a(c1, fileoutputstream);
            }
            return a(((OutputStream) (file)), c1);
        }
        jsonencoding = a(((OutputStream) (fileoutputstream)), jsonencoding, c1);
        file = jsonencoding;
        if (_outputDecorator != null)
        {
            file = _outputDecorator.a(c1, jsonencoding);
        }
        return a(((Writer) (file)), c1);
    }

    public JsonGenerator a(OutputStream outputstream)
        throws IOException
    {
        return a(outputstream, com.fasterxml.jackson.core.JsonEncoding.a);
    }

    public JsonGenerator a(OutputStream outputstream, JsonEncoding jsonencoding)
        throws IOException
    {
        c c1 = a(outputstream, false);
        c1.a(jsonencoding);
        if (jsonencoding == com.fasterxml.jackson.core.JsonEncoding.a)
        {
            jsonencoding = outputstream;
            if (_outputDecorator != null)
            {
                jsonencoding = _outputDecorator.a(c1, outputstream);
            }
            return a(((OutputStream) (jsonencoding)), c1);
        }
        jsonencoding = a(outputstream, jsonencoding, c1);
        outputstream = jsonencoding;
        if (_outputDecorator != null)
        {
            outputstream = _outputDecorator.a(c1, jsonencoding);
        }
        return a(((Writer) (outputstream)), c1);
    }

    protected JsonGenerator a(OutputStream outputstream, c c1)
        throws IOException
    {
        outputstream = new g(c1, _generatorFeatures, _objectCodec, outputstream);
        if (_characterEscapes != null)
        {
            outputstream.a(_characterEscapes);
        }
        c1 = _rootValueSeparator;
        if (c1 != h)
        {
            outputstream.a(c1);
        }
        return outputstream;
    }

    public JsonGenerator a(Writer writer)
        throws IOException
    {
        c c1 = a(writer, false);
        Writer writer1 = writer;
        if (_outputDecorator != null)
        {
            writer1 = _outputDecorator.a(c1, writer);
        }
        return a(writer1, c1);
    }

    protected JsonGenerator a(Writer writer, c c1)
        throws IOException
    {
        writer = new i(c1, _generatorFeatures, _objectCodec, writer);
        if (_characterEscapes != null)
        {
            writer.a(_characterEscapes);
        }
        c1 = _rootValueSeparator;
        if (c1 != h)
        {
            writer.a(c1);
        }
        return writer;
    }

    public JsonParser a(File file)
        throws IOException, JsonParseException
    {
        c c1 = a(file, true);
        FileInputStream fileinputstream = new FileInputStream(file);
        file = fileinputstream;
        if (_inputDecorator != null)
        {
            file = _inputDecorator.a(c1, fileinputstream);
        }
        return a(((InputStream) (file)), c1);
    }

    public JsonParser a(InputStream inputstream)
        throws IOException, JsonParseException
    {
        c c1 = a(inputstream, false);
        InputStream inputstream1 = inputstream;
        if (_inputDecorator != null)
        {
            inputstream1 = _inputDecorator.a(c1, inputstream);
        }
        return a(inputstream1, c1);
    }

    protected JsonParser a(InputStream inputstream, c c1)
        throws IOException, JsonParseException
    {
        return (new com.fasterxml.jackson.core.b.a(c1, inputstream)).a(_parserFeatures, _objectCodec, g, f, c(com.fasterxml.jackson.core.Feature.b), c(com.fasterxml.jackson.core.Feature.a));
    }

    public JsonParser a(Reader reader)
        throws IOException, JsonParseException
    {
        c c1 = a(reader, false);
        Reader reader1 = reader;
        if (_inputDecorator != null)
        {
            reader1 = _inputDecorator.a(c1, reader);
        }
        return a(reader1, c1);
    }

    protected JsonParser a(Reader reader, c c1)
        throws IOException, JsonParseException
    {
        return new f(c1, _parserFeatures, reader, _objectCodec, f.a(c(com.fasterxml.jackson.core.Feature.b), c(com.fasterxml.jackson.core.Feature.a)));
    }

    public JsonParser a(URL url)
        throws IOException, JsonParseException
    {
        c c1 = a(url, true);
        InputStream inputstream = c(url);
        url = inputstream;
        if (_inputDecorator != null)
        {
            url = _inputDecorator.a(c1, inputstream);
        }
        return a(((InputStream) (url)), c1);
    }

    public JsonParser a(byte abyte0[])
        throws IOException, JsonParseException
    {
        c c1 = a(abyte0, true);
        if (_inputDecorator != null)
        {
            InputStream inputstream = _inputDecorator.a(c1, abyte0, 0, abyte0.length);
            if (inputstream != null)
            {
                return a(inputstream, c1);
            }
        }
        return a(abyte0, 0, abyte0.length, c1);
    }

    public JsonParser a(byte abyte0[], int k, int l)
        throws IOException, JsonParseException
    {
        c c1 = a(abyte0, true);
        if (_inputDecorator != null)
        {
            InputStream inputstream = _inputDecorator.a(c1, abyte0, k, l);
            if (inputstream != null)
            {
                return a(inputstream, c1);
            }
        }
        return a(abyte0, k, l, c1);
    }

    protected JsonParser a(byte abyte0[], int k, int l, c c1)
        throws IOException, JsonParseException
    {
        return (new com.fasterxml.jackson.core.b.a(c1, abyte0, k, l)).a(_parserFeatures, _objectCodec, g, f, c(com.fasterxml.jackson.core.Feature.b), c(com.fasterxml.jackson.core.Feature.a));
    }

    public MatchStrength a(com.fasterxml.jackson.core.format.c c1)
        throws IOException
    {
        if (getClass() == com/fasterxml/jackson/core/JsonFactory)
        {
            return b(c1);
        } else
        {
            return null;
        }
    }

    protected c a(Object obj, boolean flag)
    {
        return new c(j(), obj, flag);
    }

    protected Writer a(OutputStream outputstream, JsonEncoding jsonencoding, c c1)
        throws IOException
    {
        if (jsonencoding == com.fasterxml.jackson.core.JsonEncoding.a)
        {
            return new j(c1, outputstream);
        } else
        {
            return new OutputStreamWriter(outputstream, jsonencoding.a());
        }
    }

    protected void a(Class class1)
    {
        if (getClass() != class1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Failed copy(): ").append(getClass().getName()).append(" (version: ").append(d()).append(") does not override copy(); it has to").toString());
        } else
        {
            return;
        }
    }

    public boolean a(com.fasterxml.jackson.core.b b1)
    {
        String s = b();
        return s != null && s.equals(b1.a());
    }

    public JsonFactory b(Feature feature)
    {
        _factoryFeatures = _factoryFeatures & ~feature.c();
        return this;
    }

    public JsonFactory b(JsonGenerator.Feature feature)
    {
        _generatorFeatures = _generatorFeatures & ~feature.c();
        return this;
    }

    public JsonFactory b(JsonParser.Feature feature)
    {
        _parserFeatures = _parserFeatures & ~feature.c();
        return this;
    }

    public JsonGenerator b(File file, JsonEncoding jsonencoding)
        throws IOException
    {
        return a(file, jsonencoding);
    }

    public JsonGenerator b(OutputStream outputstream)
        throws IOException
    {
        return a(outputstream, com.fasterxml.jackson.core.JsonEncoding.a);
    }

    public JsonGenerator b(OutputStream outputstream, JsonEncoding jsonencoding)
        throws IOException
    {
        return a(outputstream, jsonencoding);
    }

    protected JsonGenerator b(OutputStream outputstream, c c1)
        throws IOException
    {
        return a(outputstream, c1);
    }

    public JsonGenerator b(Writer writer)
        throws IOException
    {
        return a(writer);
    }

    protected JsonGenerator b(Writer writer, c c1)
        throws IOException
    {
        return a(writer, c1);
    }

    public JsonParser b(File file)
        throws IOException, JsonParseException
    {
        return a(file);
    }

    public JsonParser b(InputStream inputstream)
        throws IOException, JsonParseException
    {
        return a(inputstream);
    }

    protected JsonParser b(InputStream inputstream, c c1)
        throws IOException, JsonParseException
    {
        return a(inputstream, c1);
    }

    public JsonParser b(Reader reader)
        throws IOException, JsonParseException
    {
        return a(reader);
    }

    protected JsonParser b(Reader reader, c c1)
        throws IOException, JsonParseException
    {
        return a(reader, c1);
    }

    public JsonParser b(String s)
        throws IOException, JsonParseException
    {
        StringReader stringreader = new StringReader(s);
        c c1 = a(stringreader, true);
        s = stringreader;
        if (_inputDecorator != null)
        {
            s = _inputDecorator.a(c1, stringreader);
        }
        return a(s, c1);
    }

    public JsonParser b(URL url)
        throws IOException, JsonParseException
    {
        return a(url);
    }

    public JsonParser b(byte abyte0[])
        throws IOException, JsonParseException
    {
        return a(abyte0);
    }

    public JsonParser b(byte abyte0[], int k, int l)
        throws IOException, JsonParseException
    {
        return a(abyte0, k, l);
    }

    protected JsonParser b(byte abyte0[], int k, int l, c c1)
        throws IOException, JsonParseException
    {
        return a(abyte0, k, l, c1);
    }

    protected MatchStrength b(com.fasterxml.jackson.core.format.c c1)
        throws IOException
    {
        return com.fasterxml.jackson.core.b.a.a(c1);
    }

    public String b()
    {
        if (getClass() == com/fasterxml/jackson/core/JsonFactory)
        {
            return "JSON";
        } else
        {
            return null;
        }
    }

    public JsonParser c(String s)
        throws IOException, JsonParseException
    {
        return b(s);
    }

    protected InputStream c(URL url)
        throws IOException
    {
        if ("file".equals(url.getProtocol()))
        {
            String s = url.getHost();
            if ((s == null || s.length() == 0) && url.getPath().indexOf('%') < 0)
            {
                return new FileInputStream(url.getPath());
            }
        }
        return url.openStream();
    }

    public boolean c()
    {
        return false;
    }

    public final boolean c(Feature feature)
    {
        return (_factoryFeatures & feature.c()) != 0;
    }

    public final boolean c(JsonGenerator.Feature feature)
    {
        return (_generatorFeatures & feature.c()) != 0;
    }

    public final boolean c(JsonParser.Feature feature)
    {
        return (_parserFeatures & feature.c()) != 0;
    }

    public Version d()
    {
        return e.a;
    }

    public InputDecorator e()
    {
        return _inputDecorator;
    }

    public CharacterEscapes f()
    {
        return _characterEscapes;
    }

    public OutputDecorator g()
    {
        return _outputDecorator;
    }

    public String h()
    {
        if (_rootValueSeparator == null)
        {
            return null;
        } else
        {
            return _rootValueSeparator.a();
        }
    }

    public d i()
    {
        return _objectCodec;
    }

    public BufferRecycler j()
    {
        Object obj = (SoftReference)e.get();
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
            e.set(new SoftReference(obj1));
        }
        return ((BufferRecycler) (obj1));
    }

    protected Object readResolve()
    {
        return new JsonFactory(this, _objectCodec);
    }

    static 
    {
        h = DefaultPrettyPrinter.a;
    }
}
