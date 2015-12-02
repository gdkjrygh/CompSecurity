// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import java.nio.CharBuffer;

public final class b
{

    private b()
    {
    }

    public static long a(Readable readable, Appendable appendable)
    {
        CharBuffer charbuffer = CharBuffer.allocate(2048);
        long l = 0L;
        do
        {
            int i = readable.read(charbuffer);
            if (i == -1)
            {
                return l;
            }
            charbuffer.flip();
            appendable.append(charbuffer, 0, i);
            l += i;
        } while (true);
    }

    public static String a(Readable readable)
    {
        return b(readable).toString();
    }

    private static StringBuilder b(Readable readable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(readable, stringbuilder);
        return stringbuilder;
    }
}
