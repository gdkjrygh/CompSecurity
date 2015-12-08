// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;


public interface jniInput_HwOffload
{

    public abstract int enableAudioEffects(int i, int j);

    public abstract int getAudioRecordSessionID(int i, int j, boolean flag);

    public abstract int getDefaultBuiltinEffect(int i);
}
