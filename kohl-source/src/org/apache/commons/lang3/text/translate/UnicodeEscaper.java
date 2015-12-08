// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package org.apache.commons.lang3.text.translate:
//            CodePointTranslator

public class UnicodeEscaper extends CodePointTranslator
{

    private final int above;
    private final int below;
    private final boolean between;

    public UnicodeEscaper()
    {
        this(0, 0x7fffffff, true);
    }

    private UnicodeEscaper(int i, int j, boolean flag)
    {
        below = i;
        above = j;
        between = flag;
    }

    public static UnicodeEscaper above(int i)
    {
        return outsideOf(0, i);
    }

    public static UnicodeEscaper below(int i)
    {
        return outsideOf(i, 0x7fffffff);
    }

    public static UnicodeEscaper between(int i, int j)
    {
        return new UnicodeEscaper(i, j, true);
    }

    public static UnicodeEscaper outsideOf(int i, int j)
    {
        return new UnicodeEscaper(i, j, false);
    }

    public boolean translate(int i, Writer writer)
        throws IOException
    {
        if (between ? i < below || i > above : i >= below && i <= above)
        {
            return false;
        }
        if (i > 65535)
        {
            writer.write((new StringBuilder()).append("\\u").append(hex(i)).toString());
        } else
        if (i > 4095)
        {
            writer.write((new StringBuilder()).append("\\u").append(hex(i)).toString());
        } else
        if (i > 255)
        {
            writer.write((new StringBuilder()).append("\\u0").append(hex(i)).toString());
        } else
        if (i > 15)
        {
            writer.write((new StringBuilder()).append("\\u00").append(hex(i)).toString());
        } else
        {
            writer.write((new StringBuilder()).append("\\u000").append(hex(i)).toString());
        }
        return true;
    }
}
