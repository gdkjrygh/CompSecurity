// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

// Referenced classes of package org.apache.commons.lang3.text.translate:
//            AggregateTranslator

public abstract class CharSequenceTranslator
{

    public CharSequenceTranslator()
    {
    }

    public static String hex(int i)
    {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    public abstract int translate(CharSequence charsequence, int i, Writer writer)
        throws IOException;

    public final String translate(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return null;
        }
        try
        {
            StringWriter stringwriter = new StringWriter(charsequence.length() * 2);
            translate(charsequence, ((Writer) (stringwriter)));
            charsequence = stringwriter.toString();
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new RuntimeException(charsequence);
        }
        return charsequence;
    }

    public final void translate(CharSequence charsequence, Writer writer)
        throws IOException
    {
        if (writer == null)
        {
            throw new IllegalArgumentException("The Writer must not be null");
        }
        if (charsequence != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int l;
        i = 0;
        l = charsequence.length();
_L8:
        int i1;
        while (i < l) 
        {
label0:
            {
                i1 = translate(charsequence, i, writer);
                if (i1 != 0)
                {
                    break label0;
                }
                char ac[] = Character.toChars(Character.codePointAt(charsequence, i));
                writer.write(ac);
                i += ac.length;
            }
        }
          goto _L3
        int j;
        int k;
        k = 0;
        j = i;
_L6:
        i = j;
        if (k >= i1) goto _L5; else goto _L4
_L4:
        j += Character.charCount(Character.codePointAt(charsequence, j));
        k++;
          goto _L6
_L5:
        if (true) goto _L8; else goto _L7
_L7:
_L3:
        if (true) goto _L1; else goto _L9
_L9:
    }

    public final transient CharSequenceTranslator with(CharSequenceTranslator acharsequencetranslator[])
    {
        CharSequenceTranslator acharsequencetranslator1[] = new CharSequenceTranslator[acharsequencetranslator.length + 1];
        acharsequencetranslator1[0] = this;
        System.arraycopy(acharsequencetranslator, 0, acharsequencetranslator1, 1, acharsequencetranslator.length);
        return new AggregateTranslator(acharsequencetranslator1);
    }
}
