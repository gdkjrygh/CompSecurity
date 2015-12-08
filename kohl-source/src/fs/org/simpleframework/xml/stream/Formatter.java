// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.io.BufferedWriter;
import java.io.Writer;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Indenter, OutputBuffer, Format, NodeException, 
//            Mode

class Formatter
{
    private static final class Tag extends Enum
    {

        private static final Tag $VALUES[];
        public static final Tag COMMENT;
        public static final Tag END;
        public static final Tag START;
        public static final Tag TEXT;

        public static Tag valueOf(String s)
        {
            return (Tag)Enum.valueOf(fs/org/simpleframework/xml/stream/Formatter$Tag, s);
        }

        public static final Tag[] values()
        {
            return (Tag[])$VALUES.clone();
        }

        static 
        {
            COMMENT = new Tag("COMMENT", 0);
            START = new Tag("START", 1);
            TEXT = new Tag("TEXT", 2);
            END = new Tag("END", 3);
            $VALUES = (new Tag[] {
                COMMENT, START, TEXT, END
            });
        }

        private Tag(String s, int i)
        {
            super(s, i);
        }
    }


    private static final char AND[] = {
        '&', 'a', 'm', 'p', ';'
    };
    private static final char CLOSE[] = {
        ' ', '-', '-', '>'
    };
    private static final char DOUBLE[] = {
        '&', 'q', 'u', 'o', 't', ';'
    };
    private static final char GREATER[] = {
        '&', 'g', 't', ';'
    };
    private static final char LESS[] = {
        '&', 'l', 't', ';'
    };
    private static final char NAMESPACE[] = {
        'x', 'm', 'l', 'n', 's'
    };
    private static final char OPEN[] = {
        '<', '!', '-', '-', ' '
    };
    private static final char SINGLE[] = {
        '&', 'a', 'p', 'o', 's', ';'
    };
    private OutputBuffer buffer;
    private Indenter indenter;
    private Tag last;
    private String prolog;
    private Writer result;

    public Formatter(Writer writer, Format format)
    {
        result = new BufferedWriter(writer, 1024);
        indenter = new Indenter(format);
        buffer = new OutputBuffer();
        prolog = format.getProlog();
    }

    private void append(char c)
        throws Exception
    {
        buffer.append(c);
    }

    private void append(String s)
        throws Exception
    {
        buffer.append(s);
    }

    private void append(char ac[])
        throws Exception
    {
        buffer.append(ac);
    }

    private void data(String s)
        throws Exception
    {
        write("<![CDATA[");
        write(s);
        write("]]>");
    }

    private void escape(char c)
        throws Exception
    {
        char ac[] = symbol(c);
        if (ac != null)
        {
            write(ac);
            return;
        } else
        {
            write(c);
            return;
        }
    }

    private void escape(String s)
        throws Exception
    {
        int j = s.length();
        for (int i = 0; i < j; i++)
        {
            escape(s.charAt(i));
        }

    }

    private boolean isEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    private char[] symbol(char c)
    {
        switch (c)
        {
        default:
            return null;

        case 60: // '<'
            return LESS;

        case 62: // '>'
            return GREATER;

        case 34: // '"'
            return DOUBLE;

        case 39: // '\''
            return SINGLE;

        case 38: // '&'
            return AND;
        }
    }

    private void write(char c)
        throws Exception
    {
        buffer.write(result);
        buffer.clear();
        result.write(c);
    }

    private void write(String s)
        throws Exception
    {
        buffer.write(result);
        buffer.clear();
        result.write(s);
    }

    private void write(String s, String s1)
        throws Exception
    {
        buffer.write(result);
        buffer.clear();
        if (!isEmpty(s1))
        {
            result.write(s1);
            result.write(58);
        }
        result.write(s);
    }

    private void write(char ac[])
        throws Exception
    {
        buffer.write(result);
        buffer.clear();
        result.write(ac);
    }

    public void flush()
        throws Exception
    {
        buffer.write(result);
        buffer.clear();
        result.flush();
    }

    public void writeAttribute(String s, String s1, String s2)
        throws Exception
    {
        if (last != Tag.START)
        {
            throw new NodeException("Start element required");
        } else
        {
            write(' ');
            write(s, s2);
            write('=');
            write('"');
            escape(s1);
            write('"');
            return;
        }
    }

    public void writeComment(String s)
        throws Exception
    {
        String s1 = indenter.top();
        if (last == Tag.START)
        {
            append('>');
        }
        if (s1 != null)
        {
            append(s1);
            append(OPEN);
            append(s);
            append(CLOSE);
        }
        last = Tag.COMMENT;
    }

    public void writeEnd(String s, String s1)
        throws Exception
    {
        String s2 = indenter.pop();
        if (last != Tag.START) goto _L2; else goto _L1
_L1:
        write('/');
        write('>');
_L4:
        last = Tag.END;
        return;
_L2:
        if (last != Tag.TEXT)
        {
            write(s2);
        }
        if (last != Tag.START)
        {
            write('<');
            write('/');
            write(s, s1);
            write('>');
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeNamespace(String s, String s1)
        throws Exception
    {
        if (last != Tag.START)
        {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(NAMESPACE);
        if (!isEmpty(s1))
        {
            write(':');
            write(s1);
        }
        write('=');
        write('"');
        escape(s);
        write('"');
    }

    public void writeProlog()
        throws Exception
    {
        if (prolog != null)
        {
            write(prolog);
            write("\n");
        }
    }

    public void writeStart(String s, String s1)
        throws Exception
    {
        String s2 = indenter.push();
        if (last == Tag.START)
        {
            append('>');
        }
        flush();
        append(s2);
        append('<');
        if (!isEmpty(s1))
        {
            append(s1);
            append(':');
        }
        append(s);
        last = Tag.START;
    }

    public void writeText(String s, Mode mode)
        throws Exception
    {
        if (last == Tag.START)
        {
            write('>');
        }
        if (mode == Mode.DATA)
        {
            data(s);
        } else
        {
            escape(s);
        }
        last = Tag.TEXT;
    }

}
