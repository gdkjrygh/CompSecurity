// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.ErrorUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueue, PlayQueueItem, PlaySessionSource

public class PlaybackUtils
{

    public PlaybackUtils()
    {
    }

    public static int correctInitialPosition(PlayQueue playqueue, int i, Urn urn)
    {
        if (i < playqueue.size() && playqueue.getUrn(i).equals(urn))
        {
            return i;
        } else
        {
            return playqueue.indexOfTrackUrn(urn);
        }
    }

    public static int correctInitialPositionLegacy(List list, int i, Urn urn)
    {
        if (i < list.size() && ((Urn)list.get(i)).equals(urn))
        {
            return i;
        } else
        {
            return list.indexOf(urn);
        }
    }

    public static int correctStartPositionAndDeduplicateList(PlayQueue playqueue, int i, Urn urn, PlaySessionSource playsessionsource)
    {
        int j = correctInitialPosition(playqueue, i, urn);
        i = j;
        if (j < 0)
        {
            ErrorUtils.handleSilentException(new IllegalStateException((new StringBuilder("Attempting to play an adapter track that's not in the list from ")).append(playsessionsource).toString()));
            i = 0;
        }
        return getDeduplicatedList(playqueue, i);
    }

    private static int getDeduplicatedList(PlayQueue playqueue, int i)
    {
        HashSet hashset = new HashSet(playqueue.size());
        Urn urn = playqueue.getUrn(i);
        playqueue = playqueue.iterator();
        boolean flag = false;
        int j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (!playqueue.hasNext())
            {
                break;
            }
            PlayQueueItem playqueueitem = (PlayQueueItem)playqueue.next();
            if (i != j && (hashset.contains(playqueueitem) || !playqueueitem.isTrack() || playqueueitem.getUrn().equals(urn)))
            {
                playqueue.remove();
                if (i < j)
                {
                    j--;
                }
            } else
            {
                hashset.add(playqueueitem);
                i++;
            }
        } while (true);
        return j;
    }
}
