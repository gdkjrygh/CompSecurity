// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import com.roidapp.baselib.c.an;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class ay extends BroadcastReceiver
{

    final TrackSelector a;

    ay(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction() != "MusicPlayerService.onError") goto _L2; else goto _L1
_L1:
        if (TrackSelector.b(a) != null)
        {
            an.a(TrackSelector.b(a), TrackSelector.b(a).getResources().getString(0x7f0701c8));
        }
        if (TrackSelector.w(a) != null)
        {
            TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(16386));
        }
_L4:
        return;
_L2:
        if (intent.getAction() != "MusicPlayerServic.onComplete")
        {
            break; /* Loop/switch isn't completed */
        }
        if (TrackSelector.w(a) != null)
        {
            TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(16386));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (intent.getAction() != "MusicPlayerService.onInfo")
        {
            continue; /* Loop/switch isn't completed */
        }
        intent.getIntExtra("what", 0);
        JVM INSTR tableswitch 701 702: default 160
    //                   701 161
    //                   702 196;
           goto _L5 _L6 _L7
_L7:
        continue; /* Loop/switch isn't completed */
_L5:
        return;
_L6:
        if (TrackSelector.w(a) == null) goto _L4; else goto _L8
_L8:
        TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(16388));
        return;
        if (TrackSelector.w(a) == null) goto _L4; else goto _L9
_L9:
        TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(16385));
        return;
        if (intent.getAction() != "MusicPlayerService.onPrepared" || TrackSelector.w(a) == null) goto _L4; else goto _L10
_L10:
        TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(16385));
        return;
    }
}
