// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            TLVBuilder, ByteConvertor

private abstract class <init>
{

    protected int a;
    final TLVBuilder b;

    public int a()
    {
        return a;
    }

    public abstract taType b();

    public abstract byte[] c();

    public abstract int d();

    public String toString()
    {
        return (new StringBuilder("id:")).append(a()).append("[type:").append(b()).append(";len:").append(d()).append(";value(").append(ByteConvertor.toHex(c())).append(")]\n").toString();
    }

    private taType(TLVBuilder tlvbuilder)
    {
        b = tlvbuilder;
        super();
    }

    b(TLVBuilder tlvbuilder, b b1)
    {
        this(tlvbuilder);
    }
}
