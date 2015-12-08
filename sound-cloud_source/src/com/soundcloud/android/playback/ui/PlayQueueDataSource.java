// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.java.collections.Lists;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            TrackPageData, VideoPageData, PlayerPageData

class PlayQueueDataSource
{

    private final List fullQueue = createFullQueue();
    private final PlayQueueManager playQueueManager;

    public PlayQueueDataSource(PlayQueueManager playqueuemanager)
    {
        playQueueManager = playqueuemanager;
    }

    private List createFullQueue()
    {
        ArrayList arraylist = new ArrayList(playQueueManager.getQueueSize());
        for (int i = 0; i < playQueueManager.getQueueSize(); i++)
        {
            arraylist.add(transformPlayQueueItem(playQueueManager.getPlayQueueItemAtPosition(i), i));
        }

        return arraylist;
    }

    private PlayerPageData transformPlayQueueItem(PlayQueueItem playqueueitem, int i)
    {
        if (playqueueitem.isTrack())
        {
            com.soundcloud.android.model.Urn urn = playQueueManager.getCollectionUrn();
            return new TrackPageData(i, playqueueitem.getUrn(), urn, playqueueitem.getMetaData());
        } else
        {
            return new VideoPageData(i, playqueueitem.getMetaData());
        }
    }

    public List getCurrentItemAsQueue()
    {
        return Lists.newArrayList(new PlayerPageData[] {
            transformPlayQueueItem(playQueueManager.getCurrentPlayQueueItem(), playQueueManager.getCurrentPosition())
        });
    }

    public List getFullQueue()
    {
        return fullQueue;
    }
}
