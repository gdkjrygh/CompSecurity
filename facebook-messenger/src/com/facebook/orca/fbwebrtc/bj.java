// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.orca.fbwebrtc:
//            bb

class bj
    implements android.media.AudioManager.OnAudioFocusChangeListener
{

    final bb a;

    bj(bb bb1)
    {
        a = bb1;
        super();
    }

    public void onAudioFocusChange(int i)
    {
        i;
        JVM INSTR tableswitch -3 1: default 36
    //                   -3 37
    //                   -2 37
    //                   -1 105
    //                   0 36
    //                   1 71;
           goto _L1 _L2 _L2 _L3 _L1 _L4
_L1:
        return;
_L2:
        if (bb.c(a) != null && bb.c(a).isPlaying())
        {
            bb.c(a).pause();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (bb.c(a) != null && !bb.c(a).isPlaying())
        {
            bb.c(a).start();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        bb.d(a);
        return;
    }
}
