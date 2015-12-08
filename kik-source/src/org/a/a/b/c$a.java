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
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
        if (org.a.a.b.d.b(charsequence.toString(), b))
        {
            writer.write(charsequence.toString());
        } else
        {
            writer.write(34);
            writer.write(d.a(charsequence.toString(), a, (new StringBuilder()).append(a).append(a).toString()));
            writer.write(34);
        }
        return charsequence.length();
    }


    ()
    {
    }
}
