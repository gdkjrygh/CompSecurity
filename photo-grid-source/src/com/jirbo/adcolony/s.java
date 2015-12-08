// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.InputStream;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyException

class s
{

    char a[];
    int b;
    int c;

    s(InputStream inputstream)
    {
        StringBuilder stringbuilder = new StringBuilder(inputstream.available());
        int i = inputstream.read();
        while (i != -1) 
        {
            if (i >= 32 && i <= 126 || i == 10)
            {
                stringbuilder.append((char)i);
            } else
            if ((i & 0x80) != 0)
            {
                if ((i & 0xe0) == 192)
                {
                    stringbuilder.append((char)((i & 0x1f) << 6 | inputstream.read() & 0x3f));
                } else
                {
                    stringbuilder.append((char)((i & 0xf) << 12 | (inputstream.read() & 0x3f) << 6 | inputstream.read() & 0x3f));
                }
            } else
            {
                stringbuilder.append(' ');
            }
            i = inputstream.read();
        }
        inputstream.close();
        c = stringbuilder.length();
        a = new char[c];
        stringbuilder.getChars(0, c, a, 0);
    }

    s(String s1)
    {
        c = s1.length();
        StringBuilder stringbuilder = new StringBuilder(c);
        int i = 0;
        while (i < c) 
        {
            char c1 = s1.charAt(i);
            if (c1 >= ' ' && c1 <= '~' || c1 == '\n')
            {
                stringbuilder.append(c1);
            } else
            if ((c1 & 0x80) != 0)
            {
                if ((c1 & 0xe0) == 192 && i + 1 < c)
                {
                    stringbuilder.append((char)((c1 & 0x1f) << 6 | s1.charAt(i + 1) & 0x3f));
                    i++;
                } else
                if (i + 2 < c)
                {
                    stringbuilder.append((char)((c1 & 0xf) << 12 | (s1.charAt(i + 1) & 0x3f) << 6 | s1.charAt(i + 2) & 0x3f));
                    i += 2;
                } else
                {
                    stringbuilder.append('?');
                }
            } else
            {
                stringbuilder.append(' ');
            }
            i++;
        }
        c = stringbuilder.length();
        a = new char[c];
        stringbuilder.getChars(0, c, a, 0);
    }

    public static void a(String as[])
    {
    }

    boolean a()
    {
        return b < c;
    }

    boolean a(char c1)
    {
        if (b == c || a[b] != c1)
        {
            return false;
        } else
        {
            b = b + 1;
            return true;
        }
    }

    boolean a(String s1)
    {
        int j = s1.length();
        if (b + j <= c) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (s1.charAt(i) != a[b + i])
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        b = b + j;
        return true;
    }

    char b()
    {
        if (b == c)
        {
            return '\0';
        } else
        {
            return a[b];
        }
    }

    void b(char c1)
    {
        if (!a(c1))
        {
            throw new AdColonyException((new StringBuilder("'")).append(c1).append("' expected.").toString());
        } else
        {
            return;
        }
    }

    void b(String s1)
    {
        if (!a(s1))
        {
            throw new AdColonyException((new StringBuilder("\"")).append(s1).append("\" expected.").toString());
        } else
        {
            return;
        }
    }

    char c()
    {
        char ac[] = a;
        int i = b;
        b = i + 1;
        return ac[i];
    }

    void d()
    {
_L5:
        if (b != c) goto _L2; else goto _L1
_L1:
        char c1;
        return;
_L2:
        if ((c1 = a[b]) != ' ' && c1 != '\n') goto _L1; else goto _L3
_L3:
        b = b + 1;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
