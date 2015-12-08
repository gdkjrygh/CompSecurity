// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.events.CurrentDownloadEvent;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistWithTracks, PlaylistEngagementsPresenter

class val.playlistWithTracks
    implements f
{

    final PlaylistEngagementsPresenter this$0;
    final PlaylistWithTracks val$playlistWithTracks;

    public Boolean call(CurrentDownloadEvent currentdownloadevent)
    {
        return Boolean.valueOf(currentdownloadevent.entities.contains(val$playlistWithTracks.getUrn()));
    }

    public volatile Object call(Object obj)
    {
        return call((CurrentDownloadEvent)obj);
    }

    ()
    {
        this$0 = final_playlistengagementspresenter;
        val$playlistWithTracks = PlaylistWithTracks.this;
        super();
    }
}
