// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;


// Referenced classes of package com.google.b.c.c:
//            c, j, h, k

final class n extends c
{

    n()
    {
    }

    public int a()
    {
        return 3;
    }

    int a(char c1, StringBuilder stringbuilder)
    {
        if (c1 == '\r')
        {
            stringbuilder.append('\0');
            return 1;
        }
        if (c1 == '*')
        {
            stringbuilder.append('\001');
            return 1;
        }
        if (c1 == '>')
        {
            stringbuilder.append('\002');
            return 1;
        }
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
        } else
        {
            j.c(c1);
            return 1;
        }
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
            char c1 = h1.b();
            h1.a = h1.a + 1;
            a(c1, stringbuilder);
            if (stringbuilder.length() % 3 != 0)
            {
                continue;
            }
            a(h1, stringbuilder);
            int i = j.a(h1.a(), h1.a, a());
            if (i == a())
            {
                continue;
            }
            h1.b(i);
            break;
        } while (true);
        b(h1, stringbuilder);
    }

    void b(h h1, StringBuilder stringbuilder)
    {
        h1.j();
        int i = h1.i().h() - h1.d();
        int l = stringbuilder.length();
        h1.a = h1.a - l;
        if (h1.h() > 1 || i > 1 || h1.h() != i)
        {
            h1.a('\376');
        }
        if (h1.e() < 0)
        {
            h1.b(0);
        }
    }
}
