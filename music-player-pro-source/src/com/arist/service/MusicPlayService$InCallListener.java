// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.media.MediaPlayer;
import android.telephony.PhoneStateListener;
import com.arist.MusicPlayer.MyApplication;

// Referenced classes of package com.arist.service:
//            MusicPlayService

private class <init> extends PhoneStateListener
{

    final MusicPlayService this$0;

    public void onCallStateChanged(int i, String s)
    {
        i;
        JVM INSTR tableswitch 1 2: default 24
    //                   1 25
    //                   2 25;
           goto _L1 _L2 _L2
_L1:
        return;
_L2:
        if (MyApplication.getInstance().isPlaying())
        {
            MyApplication.mediaPlayer.pause();
            MyApplication.status = 3;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private ()
    {
        this$0 = MusicPlayService.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
