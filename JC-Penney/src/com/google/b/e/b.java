// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;


// Referenced classes of package com.google.b.e:
//            r, a

public final class b extends r
{

    private static final char a[] = {
        'A', 'B', 'C', 'D'
    };
    private static final char b[] = {
        'T', 'N', '*', 'E'
    };
    private static final char c[] = {
        '/', ':', '+', '.'
    };
    private static final char d = a[0];

    public b()
    {
    }

    public boolean[] a(String s)
    {
        String s1;
        int k;
        int i1;
        int i;
        if (s.length() < 2)
        {
            s1 = (new StringBuilder()).append(d).append(s).append(d).toString();
        } else
        {
            char c1 = Character.toUpperCase(s.charAt(0));
            char c2 = Character.toUpperCase(s.charAt(s.length() - 1));
            boolean flag = com.google.b.e.a.a(a, c1);
            boolean flag1 = com.google.b.e.a.a(a, c2);
            boolean flag2 = com.google.b.e.a.a(b, c1);
            boolean flag3 = com.google.b.e.a.a(b, c2);
            if (flag)
            {
                s1 = s;
                if (!flag1)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid start/end guards: ").append(s).toString());
                }
            } else
            if (flag2)
            {
                s1 = s;
                if (!flag3)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid start/end guards: ").append(s).toString());
                }
            } else
            {
                if (flag1 || flag3)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Invalid start/end guards: ").append(s).toString());
                }
                s1 = (new StringBuilder()).append(d).append(s).append(d).toString();
            }
        }
        i = 20;
        k = 1;
        while (k < s1.length() - 1) 
        {
            if (Character.isDigit(s1.charAt(k)) || s1.charAt(k) == '-' || s1.charAt(k) == '$')
            {
                i += 9;
            } else
            if (com.google.b.e.a.a(c, s1.charAt(k)))
            {
                i += 10;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Cannot encode : '").append(s1.charAt(k)).append('\'').toString());
            }
            k++;
        }
        s = new boolean[(s1.length() - 1) + i];
        i1 = 0;
        k = 0;
_L11:
        if (i1 >= s1.length()) goto _L2; else goto _L1
_L1:
        int l = Character.toUpperCase(s1.charAt(i1));
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        int j = l;
        if (i1 != s1.length() - 1) goto _L5; else goto _L4
_L4:
        l;
        JVM INSTR lookupswitch 4: default 484
    //                   42: 604
    //                   69: 611
    //                   78: 597
    //                   84: 590;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        int j1;
        byte byte0;
        j = l;
        break; /* Loop/switch isn't completed */
_L10:
        j = 65;
          goto _L5
_L9:
        j = 66;
          goto _L5
_L7:
        j = 67;
          goto _L5
_L8:
        j = 68;
_L5:
        l = 0;
        do
        {
            if (l >= a.a.length)
            {
                break MISSING_BLOCK_LABEL_680;
            }
            int k1;
            if (j == a.a[l])
            {
                j1 = a.b[l];
                break MISSING_BLOCK_LABEL_519;
            }
            l++;
        } while (true);
_L12:
        k1 = 0;
        l = 0;
        byte0 = 1;
        j = k;
        while (k1 < 7) 
        {
            s[j] = byte0;
            j++;
            if ((j1 >> 6 - k1 & 1) == 0 || l == 1)
            {
                if (byte0 == 0)
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                k1++;
                l = 0;
            } else
            {
                l++;
            }
        }
        k = j;
        if (i1 < s1.length() - 1)
        {
            s[j] = 0;
            k = j + 1;
        }
        i1++;
          goto _L11
_L2:
        return s;
        j1 = 0;
          goto _L12
    }

}
