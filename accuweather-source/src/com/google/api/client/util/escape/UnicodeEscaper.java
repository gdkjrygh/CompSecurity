// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.escape;


// Referenced classes of package com.google.api.client.util.escape:
//            Escaper, Platform

public abstract class UnicodeEscaper extends Escaper
{

    private static final int DEST_PAD = 32;

    public UnicodeEscaper()
    {
    }

    protected static int codePointAt(CharSequence charsequence, int i, int j)
    {
        if (i < j)
        {
            int k = i + 1;
            char c = charsequence.charAt(i);
            if (c < '\uD800' || c > '\uDFFF')
            {
                return c;
            }
            if (c <= '\uDBFF')
            {
                if (k == j)
                {
                    return -c;
                }
                char c1 = charsequence.charAt(k);
                if (Character.isLowSurrogate(c1))
                {
                    return Character.toCodePoint(c, c1);
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Expected low surrogate but got char '").append(c1).append("' with value ").append(c1).append(" at index ").append(k).toString());
                }
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected low surrogate character '").append(c).append("' with value ").append(c).append(" at index ").append(k - 1).toString());
            }
        } else
        {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    private static char[] growBuffer(char ac[], int i, int j)
    {
        char ac1[] = new char[j];
        if (i > 0)
        {
            System.arraycopy(ac, 0, ac1, 0, i);
        }
        return ac1;
    }

    public abstract String escape(String s);

    protected abstract char[] escape(int i);

    protected final String escapeSlow(String s, int i)
    {
        int k1 = s.length();
        char ac[] = Platform.charBufferFromThreadLocal();
        int j = 0;
        int k = 0;
        int l = i;
        i = j;
        while (l < k1) 
        {
            j = codePointAt(s, l, k1);
            if (j < 0)
            {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char ac3[] = escape(j);
            char ac1[];
            int i1;
            int j1;
            if (Character.isSupplementaryCodePoint(j))
            {
                j = 2;
            } else
            {
                j = 1;
            }
            j1 = l + j;
            ac1 = ac;
            i1 = i;
            j = k;
            if (ac3 != null)
            {
                i1 = l - k;
                j = i + i1 + ac3.length;
                ac1 = ac;
                if (ac.length < j)
                {
                    ac1 = growBuffer(ac, i, ((j + k1) - l) + 32);
                }
                j = i;
                if (i1 > 0)
                {
                    s.getChars(k, l, ac1, i);
                    j = i + i1;
                }
                i = j;
                if (ac3.length > 0)
                {
                    System.arraycopy(ac3, 0, ac1, j, ac3.length);
                    i = j + ac3.length;
                }
                j = j1;
                i1 = i;
            }
            l = nextEscapeIndex(s, j1, k1);
            ac = ac1;
            i = i1;
            k = j;
        }
        l = k1 - k;
        char ac2[] = ac;
        j = i;
        if (l > 0)
        {
            j = i + l;
            ac2 = ac;
            if (ac.length < j)
            {
                ac2 = growBuffer(ac, i, j);
            }
            s.getChars(k, k1, ac2, i);
        }
        return new String(ac2, 0, j);
    }

    protected abstract int nextEscapeIndex(CharSequence charsequence, int i, int j);
}
