// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package com.jirbo.adcolony:
//            e

class 
    implements android.media.aPlayer.OnVideoSizeChangedListener
{

    final e a;

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        a.s = mediaplayer.getVideoWidth();
        a.t = mediaplayer.getVideoHeight();
        if (a.s != 0 && a.t != 0)
        {
            a.getHolder().setFixedSize(a.s, a.t);
        }
    }

    er(e e1)
    {
        a = e1;
        super();
    }
}
