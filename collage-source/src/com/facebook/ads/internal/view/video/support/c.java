// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.video.support;

import android.media.MediaPlayer;
import android.view.View;

public class c
    implements android.media.MediaPlayer.OnInfoListener
{

    private View a;

    public c(View view)
    {
        a = view;
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 3)
        {
            a.setVisibility(8);
            return true;
        } else
        {
            return false;
        }
    }
}
