// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTrack;

public class cub
{

    static final String a = cub.getSimpleName();
    final AudioTrack b;
    final int c;
    int d;
    int e;

    public cub(int i, int j, int k, int l, int i1, int j1)
    {
        this(new AudioTrack(3, j, k, l, i1, 1), i1);
    }

    private cub(AudioTrack audiotrack, int i)
    {
        byte byte0 = 2;
        super();
        b = audiotrack;
        c = i;
        d = 0;
        if (audiotrack.getAudioFormat() == 2)
        {
            i = byte0;
        } else
        {
            i = 1;
        }
        e = i * audiotrack.getChannelCount();
    }

    public final int a()
    {
        return d - b.getPlaybackHeadPosition() * e;
    }

}
