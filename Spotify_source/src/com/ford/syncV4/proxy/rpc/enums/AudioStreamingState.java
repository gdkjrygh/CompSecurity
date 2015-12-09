// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class AudioStreamingState extends Enum
{

    public static final AudioStreamingState a;
    public static final AudioStreamingState b;
    private static AudioStreamingState c;
    private static final AudioStreamingState d[];

    private AudioStreamingState(String s, int i)
    {
        super(s, i);
    }

    public static AudioStreamingState a(String s)
    {
        return valueOf(s);
    }

    public static AudioStreamingState valueOf(String s)
    {
        return (AudioStreamingState)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/AudioStreamingState, s);
    }

    public static AudioStreamingState[] values()
    {
        return (AudioStreamingState[])d.clone();
    }

    static 
    {
        a = new AudioStreamingState("AUDIBLE", 0);
        c = new AudioStreamingState("ATTENUATED", 1);
        b = new AudioStreamingState("NOT_AUDIBLE", 2);
        d = (new AudioStreamingState[] {
            a, c, b
        });
    }
}
