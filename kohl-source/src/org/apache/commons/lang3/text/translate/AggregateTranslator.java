// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package org.apache.commons.lang3.text.translate:
//            CharSequenceTranslator

public class AggregateTranslator extends CharSequenceTranslator
{

    private final CharSequenceTranslator translators[];

    public transient AggregateTranslator(CharSequenceTranslator acharsequencetranslator[])
    {
        translators = (CharSequenceTranslator[])ArrayUtils.clone(acharsequencetranslator);
    }

    public int translate(CharSequence charsequence, int i, Writer writer)
        throws IOException
    {
        CharSequenceTranslator acharsequencetranslator[] = translators;
        int k = acharsequencetranslator.length;
        for (int j = 0; j < k; j++)
        {
            int l = acharsequencetranslator[j].translate(charsequence, i, writer);
            if (l != 0)
            {
                return l;
            }
        }

        return 0;
    }
}
