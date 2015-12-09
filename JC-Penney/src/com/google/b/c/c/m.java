// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;


// Referenced classes of package com.google.b.c.c:
//            c, j

final class m extends c
{

    m()
    {
    }

    public int a()
    {
        return 2;
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
        if (c1 >= 'a' && c1 <= 'z')
        {
            stringbuilder.append((char)((c1 - 97) + 14));
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
        if (c1 == '`')
        {
            stringbuilder.append('\002');
            stringbuilder.append((char)(c1 - 96));
            return 2;
        }
        if (c1 >= 'A' && c1 <= 'Z')
        {
            stringbuilder.append('\002');
            stringbuilder.append((char)((c1 - 65) + 1));
            return 2;
        }
        if (c1 >= '{' && c1 <= '\177')
        {
            stringbuilder.append('\002');
            stringbuilder.append((char)((c1 - 123) + 27));
            return 2;
        }
        if (c1 >= '\200')
        {
            stringbuilder.append("\001\036");
            return a((char)(c1 - 128), stringbuilder) + 2;
        } else
        {
            j.c(c1);
            return -1;
        }
    }
}
