// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;


// Referenced classes of package com.google.b.c.c:
//            g, j, h, k

final class f
    implements g
{

    f()
    {
    }

    private static String a(CharSequence charsequence, int i)
    {
        char c5 = '\0';
        int l = charsequence.length() - i;
        if (l == 0)
        {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        char c6 = charsequence.charAt(i);
        char c;
        char c1;
        char c2;
        char c3;
        char c4;
        if (l >= 2)
        {
            c3 = charsequence.charAt(i + 1);
        } else
        {
            c3 = '\0';
        }
        if (l >= 3)
        {
            c4 = charsequence.charAt(i + 2);
        } else
        {
            c4 = '\0';
        }
        if (l >= 4)
        {
            c5 = charsequence.charAt(i + 3);
        }
        i = c5 + ((c4 << 6) + ((c3 << 12) + (c6 << 18)));
        c = (char)(i >> 16 & 0xff);
        c1 = (char)(i >> 8 & 0xff);
        c2 = (char)(i & 0xff);
        charsequence = new StringBuilder(3);
        charsequence.append(c);
        if (l >= 2)
        {
            charsequence.append(c1);
        }
        if (l >= 3)
        {
            charsequence.append(c2);
        }
        return charsequence.toString();
    }

    private static void a(char c, StringBuilder stringbuilder)
    {
        if (c >= ' ' && c <= '?')
        {
            stringbuilder.append(c);
            return;
        }
        if (c >= '@' && c <= '^')
        {
            stringbuilder.append((char)(c - 64));
            return;
        } else
        {
            j.c(c);
            return;
        }
    }

    private static void a(h h1, CharSequence charsequence)
    {
        boolean flag = true;
        int i = charsequence.length();
        if (i == 0)
        {
            h1.b(0);
            return;
        }
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        int l;
        int i1;
        int j1;
        h1.j();
        l = h1.i().h();
        i1 = h1.d();
        j1 = h1.h();
        if (j1 == 0 && l - i1 <= 2)
        {
            h1.b(0);
            return;
        }
        if (i <= 4)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        throw new IllegalStateException("Count must not exceed 4");
        charsequence;
        h1.b(0);
        throw charsequence;
        l = i - 1;
        charsequence = a(charsequence, 0);
        if (!h1.g())
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L1
_L8:
        flag = i;
        if (l > 2)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        h1.c(h1.d() + l);
        flag = i;
        if (h1.i().h() - h1.d() < 3)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        h1.c(h1.d() + charsequence.length());
        flag = false;
        if (!flag) goto _L3; else goto _L2
_L2:
        h1.k();
        h1.a = h1.a - l;
_L4:
        h1.b(0);
        return;
_L6:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        h1.a(charsequence);
          goto _L4
_L1:
        if (!i || l > 2) goto _L6; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public int a()
    {
        return 4;
    }

    public void a(h h1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (!h1.g())
            {
                break;
            }
            a(h1.b(), stringbuilder);
            h1.a = h1.a + 1;
            if (stringbuilder.length() < 4)
            {
                continue;
            }
            h1.a(a(((CharSequence) (stringbuilder)), 0));
            stringbuilder.delete(0, 4);
            if (j.a(h1.a(), h1.a, a()) == a())
            {
                continue;
            }
            h1.b(0);
            break;
        } while (true);
        stringbuilder.append('\037');
        a(h1, ((CharSequence) (stringbuilder)));
    }
}
