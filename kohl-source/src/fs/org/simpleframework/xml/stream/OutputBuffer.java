// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.io.IOException;
import java.io.Writer;

class OutputBuffer
{

    private StringBuilder text;

    public OutputBuffer()
    {
        text = new StringBuilder();
    }

    public void append(char c)
    {
        text.append(c);
    }

    public void append(String s)
    {
        text.append(s);
    }

    public void append(char ac[])
    {
        text.append(ac, 0, ac.length);
    }

    public void clear()
    {
        text.setLength(0);
    }

    public void write(Writer writer)
        throws IOException
    {
        writer.append(text);
    }
}
