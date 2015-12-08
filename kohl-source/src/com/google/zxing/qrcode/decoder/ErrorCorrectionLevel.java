// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;


public final class ErrorCorrectionLevel extends Enum
{

    private static final ErrorCorrectionLevel $VALUES[];
    private static final ErrorCorrectionLevel FOR_BITS[];
    public static final ErrorCorrectionLevel H;
    public static final ErrorCorrectionLevel L;
    public static final ErrorCorrectionLevel M;
    public static final ErrorCorrectionLevel Q;
    private final int bits;

    private ErrorCorrectionLevel(String s, int i, int j)
    {
        super(s, i);
        bits = j;
    }

    public static ErrorCorrectionLevel forBits(int i)
    {
        if (i < 0 || i >= FOR_BITS.length)
        {
            throw new IllegalArgumentException();
        } else
        {
            return FOR_BITS[i];
        }
    }

    public static ErrorCorrectionLevel valueOf(String s)
    {
        return (ErrorCorrectionLevel)Enum.valueOf(com/google/zxing/qrcode/decoder/ErrorCorrectionLevel, s);
    }

    public static ErrorCorrectionLevel[] values()
    {
        return (ErrorCorrectionLevel[])$VALUES.clone();
    }

    public int getBits()
    {
        return bits;
    }

    static 
    {
        L = new ErrorCorrectionLevel("L", 0, 1);
        M = new ErrorCorrectionLevel("M", 1, 0);
        Q = new ErrorCorrectionLevel("Q", 2, 3);
        H = new ErrorCorrectionLevel("H", 3, 2);
        $VALUES = (new ErrorCorrectionLevel[] {
            L, M, Q, H
        });
        FOR_BITS = (new ErrorCorrectionLevel[] {
            M, L, H, Q
        });
    }
}
