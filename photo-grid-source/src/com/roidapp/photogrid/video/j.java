// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.os.Message;

// Referenced classes of package com.roidapp.photogrid.video:
//            MusicPlayerService

final class j
    implements android.os.Handler.Callback
{

    final MusicPlayerService a;

    j(MusicPlayerService musicplayerservice)
    {
        a = musicplayerservice;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 30
    //                   2 47;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        MusicPlayerService.a(a, (String)message.obj);
        continue; /* Loop/switch isn't completed */
_L3:
        MusicPlayerService.b(a);
        if (true) goto _L1; else goto _L4
_L4:
    }
}
