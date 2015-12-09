// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.media.MediaPlayer;
import p.df.a;

public class q
{

    private MediaPlayer a;
    private int b;
    private int c;
    private int d;

    public q(MediaPlayer mediaplayer, int i, int j, int k)
    {
        a = mediaplayer;
        b = i;
        c = j;
        d = k;
    }

    public MediaPlayer a()
    {
        return a;
    }

    void a(int i, int j, int k)
    {
        b = i;
        c = j;
        d = k;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    void e()
    {
        if (a != null)
        {
            try
            {
                a.reset();
            }
            catch (Exception exception)
            {
                p.df.a.c("VIDEO AD", "error resetting media player", exception);
            }
            try
            {
                a.release();
            }
            catch (Exception exception1)
            {
                p.df.a.c("VIDEO AD", "error releasing media player", exception1);
            }
            a = null;
        }
        b = 0;
        c = 0;
        d = 0;
    }
}
