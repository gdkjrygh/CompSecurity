// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.DialogInterface;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector, q

final class an
    implements android.content.DialogInterface.OnClickListener
{

    final LocalTrack a;
    final TrackSelector b;

    an(TrackSelector trackselector, LocalTrack localtrack)
    {
        b = trackselector;
        a = localtrack;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (dialoginterface != null)
        {
            dialoginterface.dismiss();
        }
        TrackSelector.B(b);
        if (b.a == null)
        {
            return;
        }
        (new StringBuilder("before trackPath ")).append(null);
        if (b.a.f(a.getTrack().track_id))
        {
            dialoginterface = b.a.c(a.getTrack().track_id).getTrackPath();
            String s = (new StringBuilder()).append(a.getTrack().track_title).append(" By ").append(a.getTrack().artist_name).toString();
            b.a.a(a);
            TrackSelector trackselector = b;
            a.getTrack();
            TrackSelector.a(trackselector, dialoginterface, s);
            return;
        } else
        {
            TrackSelector.a(b, a);
            b.a.g(a.getTrack().track_id);
            return;
        }
    }
}
