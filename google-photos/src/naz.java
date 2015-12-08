// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.rastermill.FrameSequence;
import java.nio.ByteBuffer;

public final class naz
{

    public final FrameSequence a;

    public naz(FrameSequence framesequence)
    {
        a = framesequence;
    }

    public static boolean a(ByteBuffer bytebuffer)
    {
        boolean flag1;
        flag1 = true;
        if (bytebuffer.remaining() < 21)
        {
            return false;
        }
        if (bytebuffer.get(0) != 82 || bytebuffer.get(1) != 73 || bytebuffer.get(2) != 70 || bytebuffer.get(3) != 70 || bytebuffer.get(8) != 87 || bytebuffer.get(9) != 69 || bytebuffer.get(10) != 66 || bytebuffer.get(11) != 80 || bytebuffer.get(12) != 86 || bytebuffer.get(13) != 80 || bytebuffer.get(14) != 56) goto _L2; else goto _L1
_L1:
        byte byte0 = bytebuffer.get(15);
        if (byte0 != 88) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        if (!flag)
        {
            bytebuffer.position(0);
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        flag = bytebuffer.get(20);
        if ((flag & 2) == 0)
        {
            flag1 = false;
        }
        bytebuffer.position(0);
        return flag1;
        Exception exception;
        exception;
        bytebuffer.position(0);
        throw exception;
    }
}
