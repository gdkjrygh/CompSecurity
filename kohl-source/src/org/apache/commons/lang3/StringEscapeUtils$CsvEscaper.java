// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;

// Referenced classes of package org.apache.commons.lang3:
//            StringEscapeUtils, StringUtils

static class anslator extends CharSequenceTranslator
{

    private static final char CSV_DELIMITER = 44;
    private static final char CSV_QUOTE = 34;
    private static final String CSV_QUOTE_STR = String.valueOf('"');
    private static final char CSV_SEARCH_CHARS[] = {
        ',', '"', '\r', '\n'
    };

    public int translate(CharSequence charsequence, int i, Writer writer)
        throws IOException
    {
        if (i != 0)
        {
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
        if (StringUtils.containsNone(charsequence.toString(), CSV_SEARCH_CHARS))
        {
            writer.write(charsequence.toString());
        } else
        {
            writer.write(34);
            writer.write(StringUtils.replace(charsequence.toString(), CSV_QUOTE_STR, (new StringBuilder()).append(CSV_QUOTE_STR).append(CSV_QUOTE_STR).toString()));
            writer.write(34);
        }
        return charsequence.length();
    }


    anslator()
    {
    }
}
