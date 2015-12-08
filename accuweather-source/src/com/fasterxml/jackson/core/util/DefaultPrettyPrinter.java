// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            Instantiatable

public class DefaultPrettyPrinter
    implements PrettyPrinter, Instantiatable, Serializable
{
    public static class FixedSpaceIndenter
        implements Indenter, Serializable
    {

        public static FixedSpaceIndenter instance = new FixedSpaceIndenter();
        private static final long serialVersionUID = 1L;

        public boolean isInline()
        {
            return true;
        }

        public void writeIndentation(JsonGenerator jsongenerator, int i)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeRaw(' ');
        }


        public FixedSpaceIndenter()
        {
        }
    }

    public static interface Indenter
    {

        public abstract boolean isInline();

        public abstract void writeIndentation(JsonGenerator jsongenerator, int i)
            throws IOException, JsonGenerationException;
    }

    public static class Lf2SpacesIndenter
        implements Indenter, Serializable
    {

        static final char SPACES[];
        static final int SPACE_COUNT = 64;
        static final String SYSTEM_LINE_SEPARATOR;
        public static Lf2SpacesIndenter instance;
        private static final long serialVersionUID = 1L;

        public boolean isInline()
        {
            return false;
        }

        public void writeIndentation(JsonGenerator jsongenerator, int i)
            throws IOException, JsonGenerationException
        {
            jsongenerator.writeRaw(SYSTEM_LINE_SEPARATOR);
            if (i > 0)
            {
                for (i += i; i > 64; i -= SPACES.length)
                {
                    jsongenerator.writeRaw(SPACES, 0, 64);
                }

                jsongenerator.writeRaw(SPACES, 0, i);
            }
        }

        static 
        {
            String s;
            instance = new Lf2SpacesIndenter();
            s = null;
            String s1 = System.getProperty("line.separator");
            s = s1;
_L2:
            String s2 = s;
            if (s == null)
            {
                s2 = "\n";
            }
            SYSTEM_LINE_SEPARATOR = s2;
            SPACES = new char[64];
            Arrays.fill(SPACES, ' ');
            return;
            Throwable throwable;
            throwable;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public Lf2SpacesIndenter()
        {
        }
    }

    public static class NopIndenter
        implements Indenter, Serializable
    {

        public static NopIndenter instance = new NopIndenter();
        private static final long serialVersionUID = 1L;

        public boolean isInline()
        {
            return true;
        }

        public void writeIndentation(JsonGenerator jsongenerator, int i)
        {
        }


        public NopIndenter()
        {
        }
    }


    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    private static final long serialVersionUID = 0xb37f5ba7a3142563L;
    protected Indenter _arrayIndenter;
    protected transient int _nesting;
    protected Indenter _objectIndenter;
    protected final SerializableString _rootSeparator;
    protected boolean _spacesInObjectEntries;

    public DefaultPrettyPrinter()
    {
        this(((SerializableString) (DEFAULT_ROOT_VALUE_SEPARATOR)));
    }

    public DefaultPrettyPrinter(SerializableString serializablestring)
    {
        _arrayIndenter = FixedSpaceIndenter.instance;
        _objectIndenter = Lf2SpacesIndenter.instance;
        _spacesInObjectEntries = true;
        _nesting = 0;
        _rootSeparator = serializablestring;
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultprettyprinter)
    {
        this(defaultprettyprinter, defaultprettyprinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultprettyprinter, SerializableString serializablestring)
    {
        _arrayIndenter = FixedSpaceIndenter.instance;
        _objectIndenter = Lf2SpacesIndenter.instance;
        _spacesInObjectEntries = true;
        _nesting = 0;
        _arrayIndenter = defaultprettyprinter._arrayIndenter;
        _objectIndenter = defaultprettyprinter._objectIndenter;
        _spacesInObjectEntries = defaultprettyprinter._spacesInObjectEntries;
        _nesting = defaultprettyprinter._nesting;
        _rootSeparator = serializablestring;
    }

    public DefaultPrettyPrinter(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = new SerializedString(s);
        }
        this(((SerializableString) (s)));
    }

    public void beforeArrayValues(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        _arrayIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void beforeObjectEntries(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        _objectIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public DefaultPrettyPrinter createInstance()
    {
        return new DefaultPrettyPrinter(this);
    }

    public volatile Object createInstance()
    {
        return createInstance();
    }

    public void indentArraysWith(Indenter indenter)
    {
        Object obj = indenter;
        if (indenter == null)
        {
            obj = NopIndenter.instance;
        }
        _arrayIndenter = ((Indenter) (obj));
    }

    public void indentObjectsWith(Indenter indenter)
    {
        Object obj = indenter;
        if (indenter == null)
        {
            obj = NopIndenter.instance;
        }
        _objectIndenter = ((Indenter) (obj));
    }

    public void spacesInObjectEntries(boolean flag)
    {
        _spacesInObjectEntries = flag;
    }

    public DefaultPrettyPrinter withRootSeparator(SerializableString serializablestring)
    {
        if (_rootSeparator == serializablestring || serializablestring != null && serializablestring.equals(_rootSeparator))
        {
            return this;
        } else
        {
            return new DefaultPrettyPrinter(this, serializablestring);
        }
    }

    public void writeArrayValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(',');
        _arrayIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void writeEndArray(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        if (!_arrayIndenter.isInline())
        {
            _nesting = _nesting - 1;
        }
        if (i > 0)
        {
            _arrayIndenter.writeIndentation(jsongenerator, _nesting);
        } else
        {
            jsongenerator.writeRaw(' ');
        }
        jsongenerator.writeRaw(']');
    }

    public void writeEndObject(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        if (!_objectIndenter.isInline())
        {
            _nesting = _nesting - 1;
        }
        if (i > 0)
        {
            _objectIndenter.writeIndentation(jsongenerator, _nesting);
        } else
        {
            jsongenerator.writeRaw(' ');
        }
        jsongenerator.writeRaw('}');
    }

    public void writeObjectEntrySeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw(',');
        _objectIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (_spacesInObjectEntries)
        {
            jsongenerator.writeRaw(" : ");
            return;
        } else
        {
            jsongenerator.writeRaw(':');
            return;
        }
    }

    public void writeRootValueSeparator(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (_rootSeparator != null)
        {
            jsongenerator.writeRaw(_rootSeparator);
        }
    }

    public void writeStartArray(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (!_arrayIndenter.isInline())
        {
            _nesting = _nesting + 1;
        }
        jsongenerator.writeRaw('[');
    }

    public void writeStartObject(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeRaw('{');
        if (!_objectIndenter.isInline())
        {
            _nesting = _nesting + 1;
        }
    }

}
