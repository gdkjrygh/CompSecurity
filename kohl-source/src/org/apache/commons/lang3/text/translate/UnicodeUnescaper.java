// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package org.apache.commons.lang3.text.translate:
//            CharSequenceTranslator

public class UnicodeUnescaper extends CharSequenceTranslator
{

    public UnicodeUnescaper()
    {
    }

    public int translate(CharSequence charsequence, int i, Writer writer)
        throws IOException
    {
        if (charsequence.charAt(i) == '\\' && i + 1 < charsequence.length() && charsequence.charAt(i + 1) == 'u')
        {
            int j;
            for (j = 2; i + j < charsequence.length() && charsequence.charAt(i + j) == 'u'; j++) { }
            int k = j;
            if (i + j < charsequence.length())
            {
                k = j;
                if (charsequence.charAt(i + j) == '+')
                {
                    k = j + 1;
                }
            }
            if (i + k + 4 <= charsequence.length())
            {
                charsequence = charsequence.subSequence(i + k, i + k + 4);
                try
                {
                    writer.write((char)Integer.parseInt(charsequence.toString(), 16));
                }
                // Misplaced declaration of an exception variable
                catch (Writer writer)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Unable to parse unicode value: ").append(charsequence).toString(), writer);
                }
                return k + 4;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Less than 4 hex digits in unicode value: '").append(charsequence.subSequence(i, charsequence.length())).append("' due to end of CharSequence").toString());
            }
        } else
        {
            return 0;
        }
    }
}
