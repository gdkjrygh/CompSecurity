// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;


public final class Q extends Enum
{

    public static final DI DI;
    public static final DI FQ;
    public static final DI RR;
    private static final DI a[];

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/google/android/apps/translatedecoder/decoder/DecoderOutput$FeaturesUsed, s);
    }

    public static Q[] values()
    {
        return (Q[])a.clone();
    }

    static 
    {
        RR = new <init>("RR", 0);
        FQ = new <init>("FQ", 1);
        DI = new <init>("DI", 2);
        a = (new a[] {
            RR, FQ, DI
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
