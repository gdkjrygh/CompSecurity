// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;

import com.google.a.a.ad;
import java.nio.CharBuffer;

public final class e
{

    private static long a(Readable readable, Appendable appendable)
    {
        ad.a(readable);
        ad.a(appendable);
        CharBuffer charbuffer = CharBuffer.allocate(2048);
        long l = 0L;
        for (; readable.read(charbuffer) != -1; charbuffer.clear())
        {
            charbuffer.flip();
            appendable.append(charbuffer);
            l += charbuffer.remaining();
        }

        return l;
    }

    public static String a(Readable readable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(readable, ((Appendable) (stringbuilder)));
        return stringbuilder.toString();
    }
}
