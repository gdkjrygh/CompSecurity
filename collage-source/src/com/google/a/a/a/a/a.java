// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;


// Referenced classes of package com.google.a.a.a.a:
//            b

public class a extends b
{

    private static final char a[] = {
        '+'
    };
    private static final char b[] = "0123456789ABCDEF".toCharArray();
    private final boolean c;
    private final boolean d[];

    public a(String s, boolean flag)
    {
        if (s.matches(".*[0-9A-Za-z].*"))
        {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        if (flag && s.contains(" "))
        {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (s.contains("%"))
        {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        } else
        {
            c = flag;
            d = b(s);
            return;
        }
    }

    private static boolean[] b(String s)
    {
        boolean flag = false;
        s = s.toCharArray();
        int k1 = s.length;
        int i = 0;
        int j1 = 122;
        for (; i < k1; i++)
        {
            j1 = Math.max(s[i], j1);
        }

        boolean aflag[] = new boolean[j1 + 1];
        for (int j = 48; j <= 57; j++)
        {
            aflag[j] = true;
        }

        for (int k = 65; k <= 90; k++)
        {
            aflag[k] = true;
        }

        for (int l = 97; l <= 122; l++)
        {
            aflag[l] = true;
        }

        j1 = s.length;
        for (int i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            aflag[s[i1]] = true;
        }

        return aflag;
    }

    protected int a(CharSequence charsequence, int i, int j)
    {
        do
        {
label0:
            {
                if (i < j)
                {
                    char c1 = charsequence.charAt(i);
                    if (c1 < d.length && d[c1])
                    {
                        break label0;
                    }
                }
                return i;
            }
            i++;
        } while (true);
    }

    public String a(String s)
    {
        int j = s.length();
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < j)
                {
                    char c1 = s.charAt(i);
                    if (c1 < d.length && d[c1])
                    {
                        break label0;
                    }
                    s1 = a(s, i);
                }
                return s1;
            }
            i++;
        } while (true);
    }

    protected char[] a(int i)
    {
        if (i < d.length && d[i])
        {
            return null;
        }
        if (i == 32 && c)
        {
            return a;
        }
        if (i <= 127)
        {
            char c1 = b[i & 0xf];
            return (new char[] {
                '%', b[i >>> 4], c1
            });
        }
        if (i <= 2047)
        {
            char c2 = b[i & 0xf];
            i >>>= 4;
            char c5 = b[i & 3 | 8];
            i >>>= 2;
            char c8 = b[i & 0xf];
            return (new char[] {
                '%', b[i >>> 4 | 0xc], c8, '%', c5, c2
            });
        }
        if (i <= 65535)
        {
            char c3 = b[i & 0xf];
            i >>>= 4;
            char c6 = b[i & 3 | 8];
            i >>>= 2;
            char c9 = b[i & 0xf];
            i >>>= 4;
            char c11 = b[i & 3 | 8];
            return (new char[] {
                '%', 'E', b[i >>> 2], '%', c11, c9, '%', c6, c3
            });
        }
        if (i <= 0x10ffff)
        {
            char c4 = b[i & 0xf];
            i >>>= 4;
            char c7 = b[i & 3 | 8];
            i >>>= 2;
            char c10 = b[i & 0xf];
            i >>>= 4;
            char c12 = b[i & 3 | 8];
            i >>>= 2;
            char c13 = b[i & 0xf];
            i >>>= 4;
            char c14 = b[i & 3 | 8];
            return (new char[] {
                '%', 'F', b[i >>> 2 & 7], '%', c14, c13, '%', c12, c10, '%', 
                c7, c4
            });
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid unicode character value ").append(i).toString());
        }
    }

}
