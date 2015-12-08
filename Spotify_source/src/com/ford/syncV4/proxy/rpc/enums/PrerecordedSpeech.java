// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class PrerecordedSpeech extends Enum
{

    private static PrerecordedSpeech a;
    private static PrerecordedSpeech b;
    private static PrerecordedSpeech c;
    private static PrerecordedSpeech d;
    private static PrerecordedSpeech e;
    private static final PrerecordedSpeech f[];

    private PrerecordedSpeech(String s, int i)
    {
        super(s, i);
    }

    public static PrerecordedSpeech a(String s)
    {
        return valueOf(s);
    }

    public static PrerecordedSpeech valueOf(String s)
    {
        return (PrerecordedSpeech)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/PrerecordedSpeech, s);
    }

    public static PrerecordedSpeech[] values()
    {
        return (PrerecordedSpeech[])f.clone();
    }

    static 
    {
        a = new PrerecordedSpeech("HELP_JINGLE", 0);
        b = new PrerecordedSpeech("INITIAL_JINGLE", 1);
        c = new PrerecordedSpeech("LISTEN_JINGLE", 2);
        d = new PrerecordedSpeech("POSITIVE_JINGLE", 3);
        e = new PrerecordedSpeech("NEGATIVE_JINGLE", 4);
        f = (new PrerecordedSpeech[] {
            a, b, c, d, e
        });
    }
}
