// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.scan;


// Referenced classes of package com.snapchat.android.scan:
//            SnapScanResult

public static class c
{

    private final boolean a;
    private int b;
    private final byte c[];

    public byte[] getSnapcodeMessage()
    {
        return c;
    }

    public int getSnapcodeVersion()
    {
        return b;
    }

    public boolean hasScannedData()
    {
        return a;
    }

    public (boolean flag, int i, byte abyte0[])
    {
        a = flag;
        b = i;
        c = abyte0;
    }
}
