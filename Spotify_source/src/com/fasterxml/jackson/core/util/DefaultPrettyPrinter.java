// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            Instantiatable

public class DefaultPrettyPrinter
    implements PrettyPrinter, Instantiatable, Serializable
{

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

    public void beforeArrayValues(JsonGenerator jsongenerator)
    {
        _arrayIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void beforeObjectEntries(JsonGenerator jsongenerator)
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

    public void writeArrayValueSeparator(JsonGenerator jsongenerator)
    {
        jsongenerator.writeRaw(',');
        _arrayIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void writeEndArray(JsonGenerator jsongenerator, int i)
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
    {
        jsongenerator.writeRaw(',');
        _objectIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void writeObjectFieldValueSeparator(JsonGenerator jsongenerator)
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
    {
        if (_rootSeparator != null)
        {
            jsongenerator.writeRaw(_rootSeparator);
        }
    }

    public void writeStartArray(JsonGenerator jsongenerator)
    {
        if (!_arrayIndenter.isInline())
        {
            _nesting = _nesting + 1;
        }
        jsongenerator.writeRaw('[');
    }

    public void writeStartObject(JsonGenerator jsongenerator)
    {
        jsongenerator.writeRaw('{');
        if (!_objectIndenter.isInline())
        {
            _nesting = _nesting + 1;
        }
    }


    private class FixedSpaceIndenter extends NopIndenter
    {
        private class NopIndenter
            implements Indenter, Serializable
        {

            public static final NopIndenter instance = new NopIndenter();

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


        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        public boolean isInline()
        {
            return true;
        }

        public void writeIndentation(JsonGenerator jsongenerator, int i)
        {
            jsongenerator.writeRaw(' ');
        }


        public FixedSpaceIndenter()
        {
        }
    }


    private class Lf2SpacesIndenter extends NopIndenter
    {

        static final char SPACES[];
        private static final String SYS_LF;
        public static final Lf2SpacesIndenter instance;
        protected final String _lf;

        public boolean isInline()
        {
            return false;
        }

        public void writeIndentation(JsonGenerator jsongenerator, int i)
        {
            jsongenerator.writeRaw(_lf);
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
            String s = null;
            String s1 = System.getProperty("line.separator");
            s = s1;
_L2:
            String s2 = s;
            if (s == null)
            {
                s2 = "\n";
            }
            SYS_LF = s2;
            char ac[] = new char[64];
            SPACES = ac;
            Arrays.fill(ac, ' ');
            instance = new Lf2SpacesIndenter();
            return;
            Throwable throwable;
            throwable;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public Lf2SpacesIndenter()
        {
            this(SYS_LF);
        }

        public Lf2SpacesIndenter(String s)
        {
            _lf = s;
        }
    }


    private class Indenter
    {

        public abstract boolean isInline();

        public abstract void writeIndentation(JsonGenerator jsongenerator, int i);
    }

}
