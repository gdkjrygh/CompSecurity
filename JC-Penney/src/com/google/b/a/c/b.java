// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.c;

import com.google.b.b.a;

// Referenced classes of package com.google.b.a.c:
//            h

final class b extends h
{

    private final short b;
    private final short c;

    b(h h1, int i, int j)
    {
        super(h1);
        b = (short)i;
        c = (short)j;
    }

    public void a(a a1, byte abyte0[])
    {
        int i = 0;
        while (i < c) 
        {
            if (i == 0 || i == 31 && c <= 62)
            {
                a1.b(31, 5);
                if (c > 62)
                {
                    a1.b(c - 31, 16);
                } else
                if (i == 0)
                {
                    a1.b(Math.min(c, 31), 5);
                } else
                {
                    a1.b(c - 31, 5);
                }
            }
            a1.b(abyte0[b + i], 8);
            i++;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("<").append(b).append("::").append((b + c) - 1).append('>').toString();
    }
}
