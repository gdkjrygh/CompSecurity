// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.widget.MediaController;

// Referenced classes of package com.jirbo.adcolony:
//            e

class 
    implements android.media.aPlayer.OnPreparedListener
{

    final e a;

    public void onPrepared(MediaPlayer mediaplayer)
    {
        int i;
        a.o = 2;
        e e1 = a;
        e e2 = a;
        a.E = true;
        e2.D = true;
        e1.C = true;
        if (a.y != null)
        {
            a.y.onPrepared(a.r);
        }
        if (a.w != null)
        {
            a.w.setEnabled(true);
        }
        a.s = mediaplayer.getVideoWidth();
        a.t = mediaplayer.getVideoHeight();
        i = a.B;
        if (i != 0)
        {
            a.seekTo(i);
        }
        if (a.s == 0 || a.t == 0) goto _L2; else goto _L1
_L1:
        a.getHolder().setFixedSize(a.s, a.t);
        if (a.u != a.s || a.v != a.t) goto _L4; else goto _L3
_L3:
        if (a.p != 3) goto _L6; else goto _L5
_L5:
        a.start();
        if (a.w != null)
        {
            a.w.show();
        }
_L4:
        return;
_L6:
        if (!a.isPlaying() && (i != 0 || a.getCurrentPosition() > 0) && a.w != null)
        {
            a.w.show(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (a.p == 3)
        {
            a.start();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    er(e e1)
    {
        a = e1;
        super();
    }
}
