// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package com.yume.android.player:
//            ar, YuMePlayerInterfaceImpl, J, O

final class au
    implements android.media.MediaPlayer.OnPreparedListener
{

    private ar a;

    au(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        int i;
        a.a = 2;
        ar ar1 = a;
        ar ar2 = a;
        a.q = true;
        ar2.p = true;
        ar1.o = true;
        if (a.j != null)
        {
            a.j.onPrepared(a.d);
        }
        if (YuMePlayerInterfaceImpl.d.u() == O.d)
        {
            mediaplayer = a.getLayoutParams();
            if (mediaplayer != null)
            {
                a.e = ((android.view.ViewGroup.LayoutParams) (mediaplayer)).width;
                a.f = ((android.view.ViewGroup.LayoutParams) (mediaplayer)).height;
            }
        } else
        {
            a.e = mediaplayer.getVideoWidth();
            a.f = mediaplayer.getVideoHeight();
        }
        i = a.n;
        if (i != 0)
        {
            a.seekTo(i);
        }
        if (a.e == 0 || a.f == 0) goto _L2; else goto _L1
_L1:
        a.getHolder().setFixedSize(a.e, a.f);
        if (a.g != a.e || a.h != a.f) goto _L4; else goto _L3
_L3:
        if (a.b != 3) goto _L6; else goto _L5
_L5:
        a.start();
_L4:
        return;
_L6:
        if (!a.isPlaying() && i == 0 && a.getCurrentPosition() > 0)
        {
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (a.b == 3)
        {
            a.start();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }
}
