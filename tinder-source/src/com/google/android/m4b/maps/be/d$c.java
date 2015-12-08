// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;


// Referenced classes of package com.google.android.m4b.maps.be:
//            d

public static final class <init>
{

    public final <init> a;
    public final byte b[];
    public final int c;
    public final byte d[];

    private ( , int i, byte abyte0[])
    {
        if (abyte0.length > 0xffffff)
        {
            throw new IllegalArgumentException("data too large");
        } else
        {
            a = ;
            b = .b;
            c = i;
            d = abyte0;
            return;
        }
    }

    d(d d1, int i, byte abyte0[], byte byte0)
    {
        this(d1, i, abyte0);
    }

    private <init>(<init> <init>1, byte abyte0[])
    {
        this(<init>1, 0, abyte0);
    }

    <init>(<init> <init>1, byte abyte0[], byte byte0)
    {
        this(<init>1, abyte0);
    }
}
