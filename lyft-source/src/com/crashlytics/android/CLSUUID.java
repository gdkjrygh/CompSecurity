// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.os.Process;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class CLSUUID
{

    private static final AtomicLong a = new AtomicLong(0L);
    private static String b;

    public CLSUUID(IdManager idmanager)
    {
        byte abyte0[] = new byte[10];
        a(abyte0);
        b(abyte0);
        c(abyte0);
        idmanager = CommonUtils.a(idmanager.b());
        String s = CommonUtils.a(abyte0);
        b = String.format(Locale.US, "%s-%s-%s-%s", new Object[] {
            s.substring(0, 12), s.substring(12, 16), s.subSequence(16, 20), idmanager.substring(0, 12)
        }).toUpperCase(Locale.US);
    }

    private void a(byte abyte0[])
    {
        long l = (new Date()).getTime();
        byte abyte1[] = a(l / 1000L);
        abyte0[0] = abyte1[0];
        abyte0[1] = abyte1[1];
        abyte0[2] = abyte1[2];
        abyte0[3] = abyte1[3];
        abyte1 = b(l % 1000L);
        abyte0[4] = abyte1[0];
        abyte0[5] = abyte1[1];
    }

    private static byte[] a(long l)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(4);
        bytebuffer.putInt((int)l);
        bytebuffer.order(ByteOrder.BIG_ENDIAN);
        bytebuffer.position(0);
        return bytebuffer.array();
    }

    private void b(byte abyte0[])
    {
        byte abyte1[] = b(a.incrementAndGet());
        abyte0[6] = abyte1[0];
        abyte0[7] = abyte1[1];
    }

    private static byte[] b(long l)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(2);
        bytebuffer.putShort((short)(int)l);
        bytebuffer.order(ByteOrder.BIG_ENDIAN);
        bytebuffer.position(0);
        return bytebuffer.array();
    }

    private void c(byte abyte0[])
    {
        byte abyte1[] = b(Integer.valueOf(Process.myPid()).shortValue());
        abyte0[8] = abyte1[0];
        abyte0[9] = abyte1[1];
    }

    public String toString()
    {
        return b;
    }

}
