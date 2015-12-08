// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;


// Referenced classes of package com.google.b.c.c:
//            g, h, j, k

final class b
    implements g
{

    b()
    {
    }

    private static char a(char c, int i)
    {
        c = (i * 149) % 255 + 1 + c;
        if (c <= '\377')
        {
            return (char)c;
        } else
        {
            return (char)(c - 256);
        }
    }

    public int a()
    {
        return 5;
    }

    public void a(h h1)
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('\0');
        do
        {
            if (!h1.g())
            {
                break;
            }
            stringbuilder.append(h1.b());
            h1.a = h1.a + 1;
            int i = j.a(h1.a(), h1.a, a());
            if (i == a())
            {
                continue;
            }
            h1.b(i);
            break;
        } while (true);
        int i1 = stringbuilder.length() - 1;
        int l = h1.d() + i1 + 1;
        h1.c(l);
        if (h1.i().h() - l > 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (h1.g() || l != 0)
        {
            if (i1 <= 249)
            {
                stringbuilder.setCharAt(0, (char)i1);
            } else
            if (i1 > 249 && i1 <= 1555)
            {
                stringbuilder.setCharAt(0, (char)(i1 / 250 + 249));
                stringbuilder.insert(1, (char)(i1 % 250));
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Message length not in valid ranges: ").append(i1).toString());
            }
        }
        i1 = stringbuilder.length();
        for (l = ((flag) ? 1 : 0); l < i1; l++)
        {
            h1.a(a(stringbuilder.charAt(l), h1.d() + 1));
        }

    }
}
