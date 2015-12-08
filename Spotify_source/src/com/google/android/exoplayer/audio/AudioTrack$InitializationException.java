// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.audio;


public final class audioTrackState extends Exception
{

    public final int audioTrackState;

    public (int i, int j, int k, int l)
    {
        super((new StringBuilder("AudioTrack init failed: ")).append(i).append(", Config(").append(j).append(", ").append(k).append(", ").append(l).append(")").toString());
        audioTrackState = i;
    }
}
