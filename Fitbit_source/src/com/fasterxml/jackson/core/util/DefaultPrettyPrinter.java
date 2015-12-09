// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            b

public class DefaultPrettyPrinter
    implements e, b, Serializable
{
    public static class FixedSpaceIndenter extends NopIndenter
    {

        public static final FixedSpaceIndenter a = new FixedSpaceIndenter();

        public void a(JsonGenerator jsongenerator, int i)
            throws IOException, JsonGenerationException
        {
            jsongenerator.a(' ');
        }

        public boolean a()
        {
            return true;
        }


        public FixedSpaceIndenter()
        {
        }
    }

    public static class Lf2SpacesIndenter extends NopIndenter
    {

        public static final Lf2SpacesIndenter a;
        static final int b = 64;
        static final char c[];
        private static final String e;

        public void a(JsonGenerator jsongenerator, int i)
            throws IOException, JsonGenerationException
        {
            jsongenerator.c(e);
            if (i > 0)
            {
                for (i += i; i > 64; i -= c.length)
                {
                    jsongenerator.b(c, 0, 64);
                }

                jsongenerator.b(c, 0, i);
            }
        }

        public boolean a()
        {
            return false;
        }

        static 
        {
            String s;
            a = new Lf2SpacesIndenter();
            s = null;
            String s1 = System.getProperty("line.separator");
            s = s1;
_L2:
            String s2 = s;
            if (s == null)
            {
                s2 = "\n";
            }
            e = s2;
            c = new char[64];
            Arrays.fill(c, ' ');
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
        implements a, Serializable
    {

        public static final NopIndenter d = new NopIndenter();

        public void a(JsonGenerator jsongenerator, int i)
            throws IOException, JsonGenerationException
        {
        }

        public boolean a()
        {
            return true;
        }


        public NopIndenter()
        {
        }
    }

    public static interface a
    {

        public abstract void a(JsonGenerator jsongenerator, int i)
            throws IOException, JsonGenerationException;

        public abstract boolean a();
    }


    public static final SerializedString a = new SerializedString(" ");
    private static final long serialVersionUID = 0xb37f5ba7a3142563L;
    protected a _arrayIndenter;
    protected a _objectIndenter;
    protected final f _rootSeparator;
    protected boolean _spacesInObjectEntries;
    protected transient int b;

    public DefaultPrettyPrinter()
    {
        this(((f) (a)));
    }

    public DefaultPrettyPrinter(f f1)
    {
        _arrayIndenter = FixedSpaceIndenter.a;
        _objectIndenter = Lf2SpacesIndenter.a;
        _spacesInObjectEntries = true;
        b = 0;
        _rootSeparator = f1;
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultprettyprinter)
    {
        this(defaultprettyprinter, defaultprettyprinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultprettyprinter, f f1)
    {
        _arrayIndenter = FixedSpaceIndenter.a;
        _objectIndenter = Lf2SpacesIndenter.a;
        _spacesInObjectEntries = true;
        b = 0;
        _arrayIndenter = defaultprettyprinter._arrayIndenter;
        _objectIndenter = defaultprettyprinter._objectIndenter;
        _spacesInObjectEntries = defaultprettyprinter._spacesInObjectEntries;
        b = defaultprettyprinter.b;
        _rootSeparator = f1;
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
        this(((f) (s)));
    }

    public DefaultPrettyPrinter a()
    {
        return new DefaultPrettyPrinter(this);
    }

    public DefaultPrettyPrinter a(f f1)
    {
        if (_rootSeparator == f1 || f1 != null && f1.equals(_rootSeparator))
        {
            return this;
        } else
        {
            return new DefaultPrettyPrinter(this, f1);
        }
    }

    public void a(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (_rootSeparator != null)
        {
            jsongenerator.d(_rootSeparator);
        }
    }

    public void a(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        if (!_objectIndenter.a())
        {
            b = b - 1;
        }
        if (i > 0)
        {
            _objectIndenter.a(jsongenerator, b);
        } else
        {
            jsongenerator.a(' ');
        }
        jsongenerator.a('}');
    }

    public void a(a a1)
    {
        Object obj = a1;
        if (a1 == null)
        {
            obj = NopIndenter.d;
        }
        _arrayIndenter = ((a) (obj));
    }

    public void a(boolean flag)
    {
        _spacesInObjectEntries = flag;
    }

    public Object b()
    {
        return a();
    }

    public void b(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.a('{');
        if (!_objectIndenter.a())
        {
            b = b + 1;
        }
    }

    public void b(JsonGenerator jsongenerator, int i)
        throws IOException, JsonGenerationException
    {
        if (!_arrayIndenter.a())
        {
            b = b - 1;
        }
        if (i > 0)
        {
            _arrayIndenter.a(jsongenerator, b);
        } else
        {
            jsongenerator.a(' ');
        }
        jsongenerator.a(']');
    }

    public void b(a a1)
    {
        Object obj = a1;
        if (a1 == null)
        {
            obj = NopIndenter.d;
        }
        _objectIndenter = ((a) (obj));
    }

    public void c(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.a(',');
        _objectIndenter.a(jsongenerator, b);
    }

    public void d(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (_spacesInObjectEntries)
        {
            jsongenerator.c(" : ");
            return;
        } else
        {
            jsongenerator.a(':');
            return;
        }
    }

    public void e(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        if (!_arrayIndenter.a())
        {
            b = b + 1;
        }
        jsongenerator.a('[');
    }

    public void f(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        jsongenerator.a(',');
        _arrayIndenter.a(jsongenerator, b);
    }

    public void g(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        _arrayIndenter.a(jsongenerator, b);
    }

    public void h(JsonGenerator jsongenerator)
        throws IOException, JsonGenerationException
    {
        _objectIndenter.a(jsongenerator, b);
    }

}
