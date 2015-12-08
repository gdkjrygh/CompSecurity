// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

// Referenced classes of package org.apache.commons.lang3.text.translate:
//            CharSequenceTranslator

public class OctalUnescaper extends CharSequenceTranslator
{

    private static int OCTAL_MAX = 377;

    public OctalUnescaper()
    {
    }

    public int translate(CharSequence charsequence, int i, Writer writer)
        throws IOException
    {
        if (charsequence.charAt(i) == '\\' && i < charsequence.length() - 1 && Character.isDigit(charsequence.charAt(i + 1)))
        {
            int k = i + 1;
            i += 2;
            int j;
            do
            {
                j = i;
                if (i >= charsequence.length())
                {
                    break;
                }
                j = i;
                if (!Character.isDigit(charsequence.charAt(i)))
                {
                    break;
                }
                j = i + 1;
                i = j;
                if (Integer.parseInt(charsequence.subSequence(k, j).toString(), 10) <= OCTAL_MAX)
                {
                    continue;
                }
                j--;
                break;
            } while (true);
            writer.write(Integer.parseInt(charsequence.subSequence(k, j).toString(), 8));
            return (j + 1) - k;
        } else
        {
            return 0;
        }
    }

}
