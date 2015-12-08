// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.e.l;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector, q, XListView, g, 
//            ad

final class ae extends Handler
{

    final TrackSelector a;

    ae(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 14: default 128
    //                   4097: 129
    //                   4098: 339
    //                   4099: 424
    //                   8193: 128
    //                   8194: 128
    //                   8195: 128
    //                   8196: 491
    //                   8197: 788
    //                   12289: 937
    //                   12290: 1073
    //                   16385: 849
    //                   16386: 871
    //                   16387: 893
    //                   16388: 915;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        return;
_L2:
        if (TrackSelector.a(a) != null)
        {
            TrackSelector.a(a).dismiss();
        }
        if (message.arg2 == 0)
        {
            TrackSelector.a(a, 20483, true);
            return;
        }
        if (message.arg2 == 2)
        {
            an.a(TrackSelector.b(a), TrackSelector.b(a).getResources().getString(0x7f0701c4));
            return;
        }
        if (message.arg2 == 3)
        {
            an.a(TrackSelector.b(a), TrackSelector.b(a).getResources().getString(0x7f0702f6));
            return;
        }
        if (message.arg2 == 4)
        {
            an.a(TrackSelector.b(a), TrackSelector.b(a).getResources().getString(0x7f070137));
            return;
        }
        if (message.arg2 == 5)
        {
            an.a(TrackSelector.b(a), TrackSelector.b(a).getResources().getString(0x7f0702f5));
            return;
        }
        if (message.arg2 == 6)
        {
            an.a(TrackSelector.b(a), TrackSelector.b(a).getResources().getString(0x7f0702f7));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        Object obj;
        TrackSelector trackselector;
        int i;
        if (a.a != null)
        {
            obj = a.a.c(message.arg1);
            obj = (new StringBuilder()).append(((LocalTrack) (obj)).getTrack().track_title).append(" By ").append(((LocalTrack) (obj)).getTrack().artist_name).toString();
        } else
        {
            obj = "online music";
        }
        trackselector = a;
        i = message.arg1;
        TrackSelector.a(trackselector, (String)message.obj, ((String) (obj)));
        return;
_L4:
        if (TrackSelector.c(a) != null)
        {
            TrackSelector.c(a).setProgress(message.arg2);
        }
        if (TrackSelector.d(a) != null)
        {
            TrackSelector.d(a).setText((new StringBuilder()).append(message.arg2).append("%").toString());
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        (new StringBuilder("handler update ")).append(message.arg1).append(", current:").append(TrackSelector.e(a)).append(", count:").append(TrackSelector.f(a));
        if (a.a != null && TrackSelector.f(a) != a.a.e(TrackSelector.e(a)))
        {
            if (TrackSelector.f(a) <= 0)
            {
                TrackSelector.h(a).setAdapter(TrackSelector.g(a));
            }
            TrackSelector.a(a, a.a.e(TrackSelector.e(a)));
            (new StringBuilder("handler count change update ")).append(message.arg1).append(", current:").append(TrackSelector.e(a)).append(", mTrackCount:").append(TrackSelector.f(a));
            TrackSelector.i(a).notifyDataSetChanged();
            TrackSelector.b(a, TrackSelector.e(a));
        } else
        if (a.a != null && message.arg1 == TrackSelector.e(a) && TrackSelector.f(a) == a.a.d(TrackSelector.e(a)))
        {
            TrackSelector.h(a).b(false);
        }
        TrackSelector.j(a).setVisibility(8);
        TrackSelector.k(a).setVisibility(8);
        return;
_L6:
        if (message.arg1 == TrackSelector.e(a) && a.a != null && a.a.a(message.arg1) && message.arg2 == 1)
        {
            TrackSelector.j(a).setVisibility(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (TrackSelector.g(a) != null)
        {
            TrackSelector.g(a).a(3);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (TrackSelector.g(a) != null)
        {
            TrackSelector.g(a).a(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (TrackSelector.g(a) != null)
        {
            TrackSelector.g(a).a(1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (TrackSelector.g(a) != null)
        {
            TrackSelector.g(a).a(2);
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        message = (String)message.obj;
        if (message == null || !message.toLowerCase(Locale.ENGLISH).startsWith("http") || l.b(TrackSelector.b(a)))
        {
            break; /* Loop/switch isn't completed */
        }
        com.roidapp.photogrid.video.TrackSelector.l(a);
        TrackSelector.a(a, 20483, false);
        if (TrackSelector.g(a) != null)
        {
            TrackSelector.g(a).a(0);
            return;
        }
        if (true) goto _L1; else goto _L13
_L13:
        if (message == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        TrackSelector.a(a, message);
        if (TrackSelector.g(a) != null)
        {
            TrackSelector.g(a).a(1);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (TrackSelector.g(a) == null) goto _L1; else goto _L14
_L14:
        TrackSelector.g(a).a(0);
        return;
_L8:
        com.roidapp.photogrid.video.TrackSelector.l(a);
        if (TrackSelector.g(a) != null)
        {
            TrackSelector.g(a).a(0);
            return;
        }
        TrackSelector.j(a).setVisibility(8);
        if (!l.b(TrackSelector.b(a)))
        {
            TrackSelector.m(a).setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L15
_L15:
    }
}
