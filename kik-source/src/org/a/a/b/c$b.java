// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b;

import java.io.Writer;
import org.a.a.b.b.a.b;

// Referenced classes of package org.a.a.b:
//            c, d

static final class  extends b
{

    private static final String a = "\"";
    private static final char b[] = {
        ',', '"', '\r', '\n'
    };

    public final int a(CharSequence charsequence, int i, Writer writer)
    {
        if (i != 0)
        {
            throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
        }
        if (charsequence.charAt(0) != '"' || charsequence.charAt(charsequence.length() - 1) != '"')
        {
            writer.write(charsequence.toString());
            return charsequence.length();
        }
        String s = charsequence.subSequence(1, charsequence.length() - 1).toString();
        if (d.a(s, b))
        {
            writer.write(d.a(s, (new StringBuilder()).append(a).append(a).toString(), a));
        } else
        {
            writer.write(charsequence.toString());
        }
        return charsequence.length();
    }


    ()
    {
    }
}
