// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.telephony.PhoneStateListener;
import com.arist.activity.MyApplication;

// Referenced classes of package com.arist.service:
//            MusicPlayService

final class j extends PhoneStateListener
{

    final MusicPlayService a;

    private j(MusicPlayService musicplayservice)
    {
        a = musicplayservice;
        super();
    }

    j(MusicPlayService musicplayservice, byte byte0)
    {
        this(musicplayservice);
    }

    public final void onCallStateChanged(int i, String s)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 51
    //                   1 29
    //                   2 29;
           goto _L1 _L2 _L3 _L3
_L1:
        return;
_L3:
        if (MyApplication.d())
        {
            a.a();
            MusicPlayService.a(a, true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (MusicPlayService.f(a))
        {
            MusicPlayService.a(a, false);
            a.a();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
