// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;

import java.io.Writer;

// Referenced classes of package org.a.a.b.b.a:
//            b

public final class i extends b
{

    public i()
    {
    }

    public final int a(CharSequence charsequence, int j, Writer writer)
    {
        if (charsequence.charAt(j) == '\\' && j + 1 < charsequence.length() && charsequence.charAt(j + 1) == 'u')
        {
            int k;
            for (k = 2; j + k < charsequence.length() && charsequence.charAt(j + k) == 'u'; k++) { }
            int l = k;
            if (j + k < charsequence.length())
            {
                l = k;
                if (charsequence.charAt(j + k) == '+')
                {
                    l = k + 1;
                }
            }
            if (j + l + 4 <= charsequence.length())
            {
                charsequence = charsequence.subSequence(j + l, j + l + 4);
                try
                {
                    writer.write((char)Integer.parseInt(charsequence.toString(), 16));
                }
                // Misplaced declaration of an exception variable
                catch (Writer writer)
                {
                    throw new IllegalArgumentException((new StringBuilder("Unable to parse unicode value: ")).append(charsequence).toString(), writer);
                }
                return l + 4;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Less than 4 hex digits in unicode value: '")).append(charsequence.subSequence(j, charsequence.length())).append("' due to end of CharSequence").toString());
            }
        } else
        {
            return 0;
        }
    }
}
