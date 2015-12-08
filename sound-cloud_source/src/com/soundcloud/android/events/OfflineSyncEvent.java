// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineTrackContext;
import java.util.List;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class OfflineSyncEvent extends TrackingEvent
{

    public static final String KIND_DESYNC = "desync";
    public static final String KIND_SYNC = "sync";
    public static final String STAGE_COMPLETE = "complete";
    public static final String STAGE_FAIL = "fail";
    public static final String STAGE_START = "start";
    private final String stage;
    private final OfflineTrackContext trackContext;

    private OfflineSyncEvent(String s, String s1, OfflineTrackContext offlinetrackcontext)
    {
        super(s, System.currentTimeMillis());
        stage = s1;
        trackContext = offlinetrackcontext;
    }

    public static OfflineSyncEvent fromDesync(OfflineTrackContext offlinetrackcontext)
    {
        return new OfflineSyncEvent("desync", "complete", offlinetrackcontext);
    }

    public static OfflineSyncEvent fromSyncComplete(OfflineTrackContext offlinetrackcontext)
    {
        return new OfflineSyncEvent("sync", "complete", offlinetrackcontext);
    }

    public static OfflineSyncEvent fromSyncFail(OfflineTrackContext offlinetrackcontext)
    {
        return new OfflineSyncEvent("sync", "fail", offlinetrackcontext);
    }

    public static OfflineSyncEvent fromSyncStart(OfflineTrackContext offlinetrackcontext)
    {
        return new OfflineSyncEvent("sync", "start", offlinetrackcontext);
    }

    public String getStage()
    {
        return stage;
    }

    public Urn getTrackOwner()
    {
        return trackContext.getCreator();
    }

    public Urn getTrackUrn()
    {
        return trackContext.getTrack();
    }

    public boolean isInPlaylists()
    {
        return !trackContext.getPlaylists().isEmpty();
    }

    public boolean isLiked()
    {
        return trackContext.isLiked();
    }
}
