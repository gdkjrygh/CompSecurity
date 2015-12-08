// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mp4parser.iso23001.part7;


// Referenced classes of package com.mp4parser.iso23001.part7:
//            CencSampleAuxiliaryDataFormat

private class encrypted extends encrypted
{

    private byte clear;
    private byte encrypted;
    final CencSampleAuxiliaryDataFormat this$0;

    public int clear()
    {
        return clear;
    }

    public long encrypted()
    {
        return (long)encrypted;
    }

    public (int i, long l)
    {
        this$0 = CencSampleAuxiliaryDataFormat.this;
        super(CencSampleAuxiliaryDataFormat.this, null);
        clear = (byte)i;
        encrypted = (byte)(int)l;
    }
}
