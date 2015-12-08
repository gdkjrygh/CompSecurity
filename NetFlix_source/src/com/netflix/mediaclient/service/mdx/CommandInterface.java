// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;


public interface CommandInterface
{

    public abstract void pinCancelled(String s);

    public abstract void pinConfirmed(String s);

    public abstract void playerAutoAdvance(String s, int i);

    public abstract void playerChangeMetaData(String s, String s1, String s2, String s3);

    public abstract void playerDialogReponse(String s, String s1, String s2);

    public abstract void playerGetAudioSubtitle(String s);

    public abstract void playerGetCapability(String s);

    public abstract void playerGetCurrentState(String s);

    public abstract void playerPause(String s);

    public abstract void playerPlay(String s, String s1, int i, String s2, int j);

    public abstract void playerResume(String s);

    public abstract void playerSeek(String s, int i);

    public abstract void playerSetAudioSubtitle(String s, String s1, String s2);

    public abstract void playerSetVolume(String s, int i);

    public abstract void playerSkip(String s, int i);

    public abstract void playerStop(String s);
}
