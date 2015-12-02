// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.MediaPlayer;
import com.facebook.common.time.a;

public class ae
{

    private final a a;
    private MediaPlayer b;
    private long c;
    private int d;
    private int e;

    public ae(a a1)
    {
        a = a1;
    }

    public int a()
    {
        if (!b.isPlaying())
        {
            return e;
        }
        int i = b.getCurrentPosition();
        if (i <= 0)
        {
            i = 0;
        }
        if (i > e)
        {
            d = i;
            c = a.a();
            e = d;
            return i;
        }
        i = (int)(a.a() - c) + d;
        if (i > b.getDuration())
        {
            return b.getDuration();
        } else
        {
            e = i;
            return i;
        }
    }

    public void a(MediaPlayer mediaplayer)
    {
        b = mediaplayer;
        e = -1;
    }

    public void b()
    {
        d = e;
        c = a.a();
    }
}
