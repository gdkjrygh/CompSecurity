// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;

import java.io.IOException;

// Referenced classes of package com.google.a.a.a.a:
//            d

class b
    implements Appendable
{

    int a;
    char b[];
    final Appendable c;
    final d d;

    private void a(char ac[], int i)
        throws IOException
    {
        for (int j = 0; j < i; j++)
        {
            c.append(ac[j]);
        }

    }

    public Appendable append(char c1)
        throws IOException
    {
        if (a != -1)
        {
            if (!Character.isLowSurrogate(c1))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Expected low surrogate character but got '").append(c1).append("' with value ").append(c1).toString());
            }
            char ac[] = d.a(Character.toCodePoint((char)a, c1));
            if (ac != null)
            {
                a(ac, ac.length);
            } else
            {
                c.append((char)a);
                c.append(c1);
            }
            a = -1;
            return this;
        }
        if (Character.isHighSurrogate(c1))
        {
            a = c1;
            return this;
        }
        if (Character.isLowSurrogate(c1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected low surrogate character '").append(c1).append("' with value ").append(c1).toString());
        }
        char ac1[] = d.a(c1);
        if (ac1 != null)
        {
            a(ac1, ac1.length);
            return this;
        } else
        {
            c.append(c1);
            return this;
        }
    }

    public Appendable append(CharSequence charsequence)
        throws IOException
    {
        return append(charsequence, 0, charsequence.length());
    }

    public Appendable append(CharSequence charsequence, int i, int j)
        throws IOException
    {
label0:
        {
label1:
            {
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    char ac1[];
                    int k;
                    int l;
                    if (a != -1)
                    {
                        k = i + 1;
                        char c1 = charsequence.charAt(i);
                        if (!Character.isLowSurrogate(c1))
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("Expected low surrogate character but got ").append(c1).toString());
                        }
                        char ac[] = d.a(Character.toCodePoint((char)a, c1));
                        if (ac != null)
                        {
                            a(ac, ac.length);
                            i++;
                        } else
                        {
                            c.append((char)a);
                        }
                        a = -1;
                    } else
                    {
                        k = i;
                    }
                }
                k = d.a(charsequence, k, j);
                if (k > i)
                {
                    c.append(charsequence, i, k);
                }
                if (k != j)
                {
                    break label0;
                }
            }
            return this;
        }
        i = com.google.a.a.a.a.d.b(charsequence, k, j);
        if (i < 0)
        {
            a = -i;
            return this;
        }
        ac1 = d.a(i);
        if (ac1 != null)
        {
            a(ac1, ac1.length);
        } else
        {
            l = Character.toChars(i, b, 0);
            a(b, l);
        }
        if (Character.isSupplementaryCodePoint(i))
        {
            i = 2;
        } else
        {
            i = 1;
        }
        i = k + i;
        k = i;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_105;
        }
    }

    (d d1, Appendable appendable)
    {
        d = d1;
        c = appendable;
        super();
        a = -1;
        b = new char[2];
    }
}
