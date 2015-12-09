// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class SpeechCapabilities extends Enum
{

    public static final SpeechCapabilities a;
    public static final SpeechCapabilities b;
    private static SpeechCapabilities c;
    private static SpeechCapabilities d;
    private static SpeechCapabilities e;
    private static final SpeechCapabilities f[];

    private SpeechCapabilities(String s, int i)
    {
        super(s, i);
    }

    public static SpeechCapabilities a(String s)
    {
        return valueOf(s);
    }

    public static SpeechCapabilities valueOf(String s)
    {
        return (SpeechCapabilities)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/SpeechCapabilities, s);
    }

    public static SpeechCapabilities[] values()
    {
        return (SpeechCapabilities[])f.clone();
    }

    static 
    {
        a = new SpeechCapabilities("TEXT", 0);
        c = new SpeechCapabilities("SAPI_PHONEMES", 1);
        d = new SpeechCapabilities("LHPLUS_PHONEMES", 2);
        e = new SpeechCapabilities("PRE_RECORDED", 3);
        b = new SpeechCapabilities("SILENCE", 4);
        f = (new SpeechCapabilities[] {
            a, c, d, e, b
        });
    }
}
