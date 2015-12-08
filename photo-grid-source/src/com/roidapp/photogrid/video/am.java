// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector

final class am
    implements android.view.View.OnClickListener
{

    final LocalTrack a;
    final TrackSelector b;

    am(TrackSelector trackselector, LocalTrack localtrack)
    {
        b = trackselector;
        a = localtrack;
        super();
    }

    public final void onClick(View view)
    {
        if (a.getTrack().artist_url != null)
        {
            b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(a.getTrack().artist_url)));
        }
    }
}
