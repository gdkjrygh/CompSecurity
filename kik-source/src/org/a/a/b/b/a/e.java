// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;

import java.io.Writer;
import java.util.HashMap;

// Referenced classes of package org.a.a.b.b.a:
//            b

public final class e extends b
{

    private final HashMap a = new HashMap();
    private final int b;
    private final int c;

    public transient e(CharSequence acharsequence[][])
    {
        int j = 0x7fffffff;
        int i;
        if (acharsequence != null)
        {
            int j1 = acharsequence.length;
            int k = 0;
            i = 0;
            int l;
            for (j = 0x7fffffff; k < j1; j = l)
            {
                CharSequence acharsequence1[] = acharsequence[k];
                a.put(acharsequence1[0], acharsequence1[1]);
                int i1 = acharsequence1[0].length();
                l = j;
                if (i1 < j)
                {
                    l = i1;
                }
                if (i1 > i)
                {
                    i = i1;
                }
                k++;
            }

        } else
        {
            i = 0;
        }
        b = j;
        c = i;
    }

    public final int a(CharSequence charsequence, int i, Writer writer)
    {
        int j = c;
        if (c + i > charsequence.length())
        {
            j = charsequence.length() - i;
        }
        for (; j >= b; j--)
        {
            CharSequence charsequence1 = charsequence.subSequence(i, i + j);
            charsequence1 = (CharSequence)a.get(charsequence1);
            if (charsequence1 != null)
            {
                writer.write(charsequence1.toString());
                return j;
            }
        }

        return 0;
    }
}
