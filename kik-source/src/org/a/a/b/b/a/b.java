// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

// Referenced classes of package org.a.a.b.b.a:
//            a

public abstract class b
{

    public b()
    {
    }

    public static String a(int i)
    {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    private void a(CharSequence charsequence, Writer writer)
    {
        if (charsequence != null)
        {
            int k = charsequence.length();
            int i = 0;
            while (i < k) 
            {
                int l = a(charsequence, i, writer);
                if (l == 0)
                {
                    char ac[] = Character.toChars(Character.codePointAt(charsequence, i));
                    writer.write(ac);
                    i += ac.length;
                } else
                {
                    int j = 0;
                    while (j < l) 
                    {
                        i += Character.charCount(Character.codePointAt(charsequence, i));
                        j++;
                    }
                }
            }
        }
    }

    public abstract int a(CharSequence charsequence, int i, Writer writer);

    public final String a(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return null;
        }
        try
        {
            StringWriter stringwriter = new StringWriter(charsequence.length() * 2);
            a(charsequence, ((Writer) (stringwriter)));
            charsequence = stringwriter.toString();
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw new RuntimeException(charsequence);
        }
        return charsequence;
    }

    public final transient b a(b ab[])
    {
        b ab1[] = new b[2];
        ab1[0] = this;
        System.arraycopy(ab, 0, ab1, 1, 1);
        return new a(ab1);
    }
}
