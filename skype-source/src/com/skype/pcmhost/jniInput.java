// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;


public interface jniInput
{

    public abstract int GetAudioStreamType(int i);

    public abstract int GetAudioTrackSessionID(int i, int j);

    public abstract int GetMute(int i, int ai[]);

    public abstract int GetRecorderPreferredSampleRate(boolean flag);

    public abstract int GetVolumeParameters(int i, int ai[]);

    public abstract int Init();

    public abstract int SetInputBoost(int i);

    public abstract int SetMute(int i, int j);

    public abstract int SetRoute(String s);

    public abstract int SetVolume(int i, int j);

    public abstract void StopRingoutTone();

    public abstract int Uninit();
}
