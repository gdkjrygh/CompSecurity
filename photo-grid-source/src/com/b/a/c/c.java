// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.l;
import a.a.a.a.a.b.x;
import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

final class c
{

    private static final AtomicLong a = new AtomicLong(0L);
    private static String b;

    public c(x x1)
    {
        long l1 = (new Date()).getTime();
        long l2 = l1 / 1000L;
        Object obj = ByteBuffer.allocate(4);
        ((ByteBuffer) (obj)).putInt((int)l2);
        ((ByteBuffer) (obj)).order(ByteOrder.BIG_ENDIAN);
        ((ByteBuffer) (obj)).position(0);
        byte abyte0[] = ((ByteBuffer) (obj)).array();
        byte byte0 = abyte0[0];
        byte byte1 = abyte0[1];
        byte byte2 = abyte0[2];
        byte byte3 = abyte0[3];
        abyte0 = a(l1 % 1000L);
        byte byte4 = abyte0[0];
        byte byte5 = abyte0[1];
        abyte0 = a(a.incrementAndGet());
        byte byte6 = abyte0[0];
        byte byte7 = abyte0[1];
        abyte0 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte byte8 = abyte0[0];
        byte byte9 = abyte0[1];
        x1 = l.a(x1.b());
        abyte0 = l.a(new byte[] {
            byte0, byte1, byte2, byte3, byte4, byte5, byte6, byte7, byte8, byte9
        });
        b = String.format(Locale.US, "%s-%s-%s-%s", new Object[] {
            abyte0.substring(0, 12), abyte0.substring(12, 16), abyte0.subSequence(16, 20), x1.substring(0, 12)
        }).toUpperCase(Locale.US);
    }

    private static byte[] a(long l1)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(2);
        bytebuffer.putShort((short)(int)l1);
        bytebuffer.order(ByteOrder.BIG_ENDIAN);
        bytebuffer.position(0);
        return bytebuffer.array();
    }

    public final String toString()
    {
        return b;
    }

}
