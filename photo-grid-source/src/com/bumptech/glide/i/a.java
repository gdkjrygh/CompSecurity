// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.i;

import android.util.Log;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.i:
//            h

public final class a
{

    private static final a b = new a();
    private final Queue a = h.a(0);

    private a()
    {
    }

    public static a a()
    {
        return b;
    }

    public final boolean a(byte abyte0[])
    {
        boolean flag;
        flag = false;
        if (abyte0.length != 0x10000)
        {
            return false;
        }
        Queue queue = a;
        queue;
        JVM INSTR monitorenter ;
        if (a.size() >= 32)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        flag = true;
        a.offer(abyte0);
        queue;
        JVM INSTR monitorexit ;
        return flag;
        abyte0;
        queue;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public final byte[] b()
    {
        byte abyte1[];
        synchronized (a)
        {
            abyte1 = (byte[])a.poll();
        }
        abyte0 = abyte1;
        if (abyte1 == null)
        {
            abyte0 = new byte[0x10000];
            Log.isLoggable("ByteArrayPool", 3);
        }
        return abyte0;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
