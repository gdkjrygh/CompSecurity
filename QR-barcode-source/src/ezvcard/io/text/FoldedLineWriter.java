// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;

import ezvcard.util.org.apache.commons.codec.EncoderException;
import ezvcard.util.org.apache.commons.codec.net.QuotedPrintableCodec;
import java.io.IOException;
import java.io.Writer;

public class FoldedLineWriter extends Writer
{

    private int curLineLength;
    private String indent;
    private Integer lineLength;
    private String newline;
    private final Writer writer;

    public FoldedLineWriter(Writer writer1, Integer integer, String s, String s1)
    {
        curLineLength = 0;
        writer = writer1;
        setLineLength(integer);
        setIndent(s);
        newline = s1;
    }

    public FoldedLineWriter append(CharSequence charsequence, boolean flag)
        throws IOException
    {
        write(charsequence, flag);
        return this;
    }

    public void close()
        throws IOException
    {
        writer.close();
    }

    public void flush()
        throws IOException
    {
        writer.flush();
    }

    public String getIndent()
    {
        return indent;
    }

    public Integer getLineLength()
    {
        return lineLength;
    }

    public String getNewline()
    {
        return newline;
    }

    public Writer getWriter()
    {
        return writer;
    }

    public void setIndent(String s)
    {
        if (lineLength != null && s.length() >= lineLength.intValue())
        {
            throw new IllegalArgumentException("The length of the indent string must be less than the max line length.");
        } else
        {
            indent = s;
            return;
        }
    }

    public void setLineLength(Integer integer)
    {
        if (integer != null && integer.intValue() <= 0)
        {
            throw new IllegalArgumentException("Line length must be greater than 0.");
        } else
        {
            lineLength = integer;
            return;
        }
    }

    public void setNewline(String s)
    {
        newline = s;
    }

    public void write(CharSequence charsequence, boolean flag)
        throws IOException
    {
        write(charsequence.toString().toCharArray(), 0, charsequence.length(), flag);
    }

    public void write(char ac[], int i, int j)
        throws IOException
    {
        write(ac, i, j, false);
    }

    public void write(char ac[], int i, int j, boolean flag)
        throws IOException
    {
        char ac1[];
        int k;
        int l;
        ac1 = ac;
        k = i;
        l = j;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        ac1 = new QuotedPrintableCodec();
        try
        {
            ac1 = ac1.encode(new String(ac, i, j)).toCharArray();
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            throw new RuntimeException(ac);
        }
        k = 0;
        l = ac1.length;
        int j1;
        int k1;
        int l1;
        if (lineLength == null)
        {
            writer.write(ac1, k, l);
            return;
        }
        i = lineLength.intValue();
        j1 = i;
        if (flag)
        {
            j1 = i - 1;
        }
        byte byte0 = -1;
        i = k;
        l1 = k + l;
        j = i;
        k1 = i;
        i = j;
        l = byte0;
_L2:
        char c;
        if (i >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        c = ac1[i];
        j = l;
        if (l >= 0)
        {
            k = l + 1;
            j = k;
            if (k == 3)
            {
                j = -1;
            }
        }
        if (c == '\n')
        {
            writer.write(ac1, k1, (i - k1) + 1);
            curLineLength = 0;
            k = i + 1;
        } else
        {
label0:
            {
                if (c != '\r')
                {
                    break label0;
                }
                if (i == l1 - 1 || ac1[i + 1] != '\n')
                {
                    writer.write(ac1, k1, (i - k1) + 1);
                    curLineLength = 0;
                    k = i + 1;
                } else
                {
                    curLineLength = curLineLength + 1;
                    k = k1;
                }
            }
        }
_L6:
        i++;
        l = j;
        k1 = k;
        if (true) goto _L2; else goto _L1
        k = j;
        if (c == '=')
        {
            k = j;
            if (flag)
            {
                k = 0;
            }
        }
        if (curLineLength < j1)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        j = i;
        if (!Character.isWhitespace(c)) goto _L4; else goto _L3
_L3:
        for (; Character.isWhitespace(c) && i < l1 - 1; c = ac1[i])
        {
            i++;
        }

        j = i;
        if (i < l1 - 1) goto _L4; else goto _L1
_L1:
        writer.write(ac1, k1, l1 - k1);
        return;
_L4:
        i = j;
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j + (3 - k);
        if (i >= l1 - 1) goto _L1; else goto _L5
_L5:
        writer.write(ac1, k1, i - k1);
        if (flag)
        {
            writer.write(61);
        }
        writer.write(newline);
        writer.write(indent);
        curLineLength = indent.length() + 1;
        int i1 = i;
        j = k;
        k = i1;
          goto _L6
        curLineLength = curLineLength + 1;
        j = k;
        k = k1;
          goto _L6
    }

    public void writeln(String s)
        throws IOException
    {
        write(s);
        write(newline);
    }
}
