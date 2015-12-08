// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector, q

final class ao
    implements android.content.DialogInterface.OnClickListener
{

    final LocalTrack a;
    final TrackSelector b;

    ao(TrackSelector trackselector, LocalTrack localtrack)
    {
        b = trackselector;
        a = localtrack;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (b.a != null)
        {
            b.a.h(a.getTrack().track_id);
        }
        if (TrackSelector.a(b) != null)
        {
            TrackSelector.a(b).dismiss();
        }
        TrackSelector.C(b);
        TrackSelector.y(b);
    }
}
