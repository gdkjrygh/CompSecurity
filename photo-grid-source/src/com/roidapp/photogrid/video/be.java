// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.os.Handler;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;

// Referenced classes of package com.roidapp.photogrid.video:
//            ab, TrackSelector

final class be
    implements ab
{

    final TrackSelector a;

    be(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void a(int i, int j)
    {
        if (TrackSelector.x(a) != null && TrackSelector.x(a).track.track_id == i && TrackSelector.w(a) != null)
        {
            TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(4099, i, j));
        }
    }

    public final void a(int i, int j, Exception exception)
    {
        if (TrackSelector.x(a) != null && TrackSelector.x(a).track.track_id == i)
        {
            TrackSelector.y(a);
            if (TrackSelector.w(a) != null)
            {
                TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(4097, i, j, exception));
            }
        }
    }

    public final void a(int i, String s)
    {
        if (TrackSelector.x(a) != null && TrackSelector.x(a).track.track_id == i)
        {
            TrackSelector.y(a);
            if (TrackSelector.w(a) != null)
            {
                TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(4098, i, 0, s));
            }
        }
    }
}
