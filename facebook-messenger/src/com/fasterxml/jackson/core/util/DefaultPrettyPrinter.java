// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;

public class DefaultPrettyPrinter
    implements PrettyPrinter
{

    protected Indenter _arrayIndenter;
    protected int _nesting;
    protected Indenter _objectIndenter;
    protected boolean _spacesInObjectEntries;

    public DefaultPrettyPrinter()
    {
        _arrayIndenter = new FixedSpaceIndenter();
        _objectIndenter = new Lf2SpacesIndenter();
        _spacesInObjectEntries = true;
        _nesting = 0;
    }

    public void beforeArrayValues(JsonGenerator jsongenerator)
    {
        _arrayIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void beforeObjectEntries(JsonGenerator jsongenerator)
    {
        _objectIndenter.writeIndentation(jsongenerator, _nesting);
    }

    public void indentArraysWith(Indenter indenter)
    {
        Object obj = indenter;
        if (indenter == null)
        {
            obj = new NopIndenter();
        }
        _arrayIndenter = ((Indenter) (obj));
    }

    public void indentObjectsWith(Indenter indenter)
    {
        Object obj = indenter;
        if (indenter == null)
        {
            obj = new NopIndenter();
        }
        _objectIndenter = ((Indenter) (obj));
    }

    public void spacesInObjectEntries(boolean flag)
    {
        _spacesInObjectEntries = flag;
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
        jsongenerator.writeRaw(' ');
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

    private class FixedSpaceIndenter
        implements Indenter
    {

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


    private class Lf2SpacesIndenter
        implements Indenter
    {

        static final char SPACES[];
        static final int SPACE_COUNT = 64;
        static final String SYSTEM_LINE_SEPARATOR;

        public boolean isInline()
        {
            return false;
        }

        public void writeIndentation(JsonGenerator jsongenerator, int i)
        {
            jsongenerator.writeRaw(SYSTEM_LINE_SEPARATOR);
            for (i += i; i > 64; i -= SPACES.length)
            {
                jsongenerator.writeRaw(SPACES, 0, 64);
            }

            jsongenerator.writeRaw(SPACES, 0, i);
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


    private class Indenter
    {

        public abstract boolean isInline();

        public abstract void writeIndentation(JsonGenerator jsongenerator, int i);
    }


    private class NopIndenter
        implements Indenter
    {

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

}
