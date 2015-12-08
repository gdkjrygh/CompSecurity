// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;

// Referenced classes of package com.roidapp.photogrid.video:
//            TrackSelector, f, q

final class bf
    implements android.widget.AdapterView.OnItemClickListener
{

    final TrackSelector a;

    bf(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
label1:
            {
                if (TrackSelector.w(a) != null)
                {
                    TrackSelector.w(a).sendMessage(TrackSelector.w(a).obtainMessage(12290));
                }
                if (TrackSelector.z(a) != null && i < TrackSelector.z(a).b())
                {
                    adapterview = TrackSelector.z(a).b(i);
                    if (adapterview != null && adapterview.getTrack() != null)
                    {
                        if (adapterview.getTrack().license_url != null && !"".equals(adapterview.getTrack().license_url))
                        {
                            break label0;
                        }
                        if (!a.a.f(adapterview.getTrack().track_id))
                        {
                            break label1;
                        }
                        view = a.a.c(adapterview.getTrack().track_id).getTrackPath();
                        String s = (new StringBuilder()).append(((LocalTrack) (adapterview)).track.track_title).append(" By ").append(((LocalTrack) (adapterview)).track.artist_name).toString();
                        a.a.a(adapterview);
                        TrackSelector trackselector = a;
                        adapterview.getTrack();
                        TrackSelector.a(trackselector, view, s);
                    }
                }
                return;
            }
            TrackSelector.a(a, adapterview);
            a.a.g(adapterview.getTrack().track_id);
            return;
        }
        TrackSelector.b(a, adapterview);
    }
}
