// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;


// Referenced classes of package com.google.b.c.c:
//            g, h, k, j

class c
    implements g
{

    c()
    {
    }

    private int a(h h1, StringBuilder stringbuilder, StringBuilder stringbuilder1, int i)
    {
        int l = stringbuilder.length();
        stringbuilder.delete(l - i, l);
        h1.a = h1.a - 1;
        i = a(h1.b(), stringbuilder1);
        h1.k();
        return i;
    }

    private static String a(CharSequence charsequence, int i)
    {
        i = charsequence.charAt(i) * 1600 + charsequence.charAt(i + 1) * 40 + charsequence.charAt(i + 2) + 1;
        return new String(new char[] {
            (char)(i / 256), (char)(i % 256)
        });
    }

    static void a(h h1, StringBuilder stringbuilder)
    {
        h1.a(a(((CharSequence) (stringbuilder)), 0));
        stringbuilder.delete(0, 3);
    }

    public int a()
    {
        return 1;
    }

    int a(char c1, StringBuilder stringbuilder)
    {
        if (c1 == ' ')
        {
            stringbuilder.append('\003');
            return 1;
        }
        if (c1 >= '0' && c1 <= '9')
        {
            stringbuilder.append((char)((c1 - 48) + 4));
            return 1;
        }
        if (c1 >= 'A' && c1 <= 'Z')
        {
            stringbuilder.append((char)((c1 - 65) + 14));
            return 1;
        }
        if (c1 >= 0 && c1 <= '\037')
        {
            stringbuilder.append('\0');
            stringbuilder.append(c1);
            return 2;
        }
        if (c1 >= '!' && c1 <= '/')
        {
            stringbuilder.append('\001');
            stringbuilder.append((char)(c1 - 33));
            return 2;
        }
        if (c1 >= ':' && c1 <= '@')
        {
            stringbuilder.append('\001');
            stringbuilder.append((char)((c1 - 58) + 15));
            return 2;
        }
        if (c1 >= '[' && c1 <= '_')
        {
            stringbuilder.append('\001');
            stringbuilder.append((char)((c1 - 91) + 22));
            return 2;
        }
        if (c1 >= '`' && c1 <= '\177')
        {
            stringbuilder.append('\002');
            stringbuilder.append((char)(c1 - 96));
            return 2;
        }
        if (c1 >= '\200')
        {
            stringbuilder.append("\001\036");
            return a((char)(c1 - 128), stringbuilder) + 2;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal character: ").append(c1).toString());
        }
    }


// JavaClassFileOutputException: Prev chain is broken

    void b(h h1, StringBuilder stringbuilder)
    {
        int i;
        int l;
        l = stringbuilder.length() / 3;
        i = stringbuilder.length() % 3;
        l = l * 2 + h1.d();
        h1.c(l);
        l = h1.i().h() - l;
        if (i != 2) goto _L2; else goto _L1
_L1:
        stringbuilder.append('\0');
        for (; stringbuilder.length() >= 3; a(h1, stringbuilder)) { }
        if (h1.g())
        {
            h1.a('\376');
        }
_L4:
        h1.b(0);
        return;
_L2:
        if (l == 1 && i == 1)
        {
            for (; stringbuilder.length() >= 3; a(h1, stringbuilder)) { }
            if (h1.g())
            {
                h1.a('\376');
            }
            h1.a = h1.a - 1;
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        for (; stringbuilder.length() >= 3; a(h1, stringbuilder)) { }
        if (l > 0 || h1.g())
        {
            h1.a('\376');
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException("Unexpected case. Please report!");
    }
}
