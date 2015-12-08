// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package org.apache.commons.lang3.text.translate:
//            CodePointTranslator

public class NumericEntityEscaper extends CodePointTranslator
{

    private final int above;
    private final int below;
    private final boolean between;

    public NumericEntityEscaper()
    {
        this(0, 0x7fffffff, true);
    }

    private NumericEntityEscaper(int i, int j, boolean flag)
    {
        below = i;
        above = j;
        between = flag;
    }

    public static NumericEntityEscaper above(int i)
    {
        return outsideOf(0, i);
    }

    public static NumericEntityEscaper below(int i)
    {
        return outsideOf(i, 0x7fffffff);
    }

    public static NumericEntityEscaper between(int i, int j)
    {
        return new NumericEntityEscaper(i, j, true);
    }

    public static NumericEntityEscaper outsideOf(int i, int j)
    {
        return new NumericEntityEscaper(i, j, false);
    }

    public boolean translate(int i, Writer writer)
        throws IOException
    {
        if (between ? i < below || i > above : i >= below && i <= above)
        {
            return false;
        } else
        {
            writer.write("&#");
            writer.write(Integer.toString(i, 10));
            writer.write(59);
            return true;
        }
    }
}
