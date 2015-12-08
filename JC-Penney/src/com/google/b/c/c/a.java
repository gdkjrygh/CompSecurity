// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;


// Referenced classes of package com.google.b.c.c:
//            g, j, h

final class a
    implements g
{

    a()
    {
    }

    private static char a(char c, char c1)
    {
        if (j.a(c) && j.a(c1))
        {
            return (char)((c - 48) * 10 + (c1 - 48) + 130);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("not digits: ").append(c).append(c1).toString());
        }
    }

    public int a()
    {
        return 0;
    }

    public void a(h h1)
    {
        if (j.a(h1.a(), h1.a) >= 2)
        {
            h1.a(a(h1.a().charAt(h1.a), h1.a().charAt(h1.a + 1)));
            h1.a = h1.a + 2;
            return;
        }
        char c = h1.b();
        int i = j.a(h1.a(), h1.a, a());
        if (i != a())
        {
            switch (i)
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Illegal mode: ").append(i).toString());

            case 5: // '\005'
                h1.a('\347');
                h1.b(5);
                return;

            case 1: // '\001'
                h1.a('\346');
                h1.b(1);
                return;

            case 3: // '\003'
                h1.a('\356');
                h1.b(3);
                return;

            case 2: // '\002'
                h1.a('\357');
                h1.b(2);
                return;

            case 4: // '\004'
                h1.a('\360');
                h1.b(4);
                return;
            }
        }
        if (j.b(c))
        {
            h1.a('\353');
            h1.a((char)((c - 128) + 1));
            h1.a = h1.a + 1;
            return;
        } else
        {
            h1.a((char)(c + 1));
            h1.a = h1.a + 1;
            return;
        }
    }
}
