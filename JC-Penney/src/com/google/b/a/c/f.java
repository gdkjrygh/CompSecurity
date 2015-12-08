// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.c;

import com.google.b.b.a;

// Referenced classes of package com.google.b.a.c:
//            h

final class f extends h
{

    private final short b;
    private final short c;

    f(h h1, int i, int j)
    {
        super(h1);
        b = (short)i;
        c = (short)j;
    }

    void a(a a1, byte abyte0[])
    {
        a1.b(b, c);
    }

    public String toString()
    {
        short word0 = b;
        short word1 = c;
        short word2 = c;
        return (new StringBuilder()).append('<').append(Integer.toBinaryString(word0 & (1 << word1) - 1 | 1 << word2 | 1 << c).substring(1)).append('>').toString();
    }
}
