// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer:
//            CryptoInfo

public final class SampleHolder
{

    public final CryptoInfo a = new CryptoInfo();
    public ByteBuffer b;
    public int c;
    public int d;
    public long e;
    private final int f;

    public SampleHolder(int i)
    {
        f = i;
    }

    public final boolean a()
    {
        return (d & 2) != 0;
    }

    public final boolean a(int i)
    {
        switch (f)
        {
        default:
            return false;

        case 1: // '\001'
            b = ByteBuffer.allocate(i);
            return true;

        case 2: // '\002'
            b = ByteBuffer.allocateDirect(i);
            break;
        }
        return true;
    }

    public final boolean b()
    {
        return (d & 0x8000000) != 0;
    }

    public final boolean c()
    {
        return (d & 1) != 0;
    }
}
