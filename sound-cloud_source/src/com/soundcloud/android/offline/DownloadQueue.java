// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadState, DownloadRequest

final class DownloadQueue
{

    private final LinkedList queue = new LinkedList();

    DownloadQueue()
    {
    }

    private List addAllRemovingDuplication(List list, List list1)
    {
        list1 = list1.iterator();
        do
        {
            if (!list1.hasNext())
            {
                break;
            }
            Urn urn = (Urn)list1.next();
            if (!list.contains(urn))
            {
                list.add(urn);
            }
        } while (true);
        return list;
    }

    private List getComplementWith(DownloadState downloadstate)
    {
        ArrayList arraylist = new ArrayList(downloadstate.request.getPlaylists());
        arraylist.removeAll(getRequestedEntities());
        arraylist.add(downloadstate.getTrack());
        return arraylist;
    }

    private List getIntersectionWith(DownloadState downloadstate)
    {
        ArrayList arraylist = new ArrayList(getRequestedEntities());
        arraylist.retainAll(downloadstate.request.getPlaylists());
        return arraylist;
    }

    final List getDownloaded(DownloadState downloadstate)
    {
        return getComplementWith(downloadstate);
    }

    final List getDownloadedPlaylists(DownloadState downloadstate)
    {
        downloadstate = new ArrayList(downloadstate.request.getPlaylists());
        downloadstate.removeAll(getRequestedEntities());
        return downloadstate;
    }

    final DownloadRequest getFirst()
    {
        return (DownloadRequest)queue.getFirst();
    }

    final List getRequested(DownloadState downloadstate)
    {
        return getIntersectionWith(downloadstate);
    }

    final List getRequestedEntities()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = queue.iterator(); iterator.hasNext(); addAllRemovingDuplication(arraylist, ((DownloadRequest)iterator.next()).getPlaylists())) { }
        return arraylist;
    }

    final List getRequestedWithOwningPlaylists(DownloadState downloadstate)
    {
        List list = getRequestedEntities();
        addAllRemovingDuplication(list, downloadstate.request.getPlaylists());
        list.add(downloadstate.getTrack());
        return list;
    }

    final List getRequests()
    {
        return Collections.unmodifiableList(queue);
    }

    final boolean isAllLikedTracksDownloaded(DownloadState downloadstate)
    {
        return downloadstate.request.isLiked() && !isLikedTrackRequested();
    }

    final boolean isEmpty()
    {
        return queue.isEmpty();
    }

    final boolean isLikedTrackRequested()
    {
        for (Iterator iterator = queue.iterator(); iterator.hasNext();)
        {
            if (((DownloadRequest)iterator.next()).isLiked())
            {
                return true;
            }
        }

        return false;
    }

    final DownloadRequest poll()
    {
        return (DownloadRequest)queue.poll();
    }

    final void set(Collection collection)
    {
        queue.clear();
        queue.addAll(collection);
    }

    final int size()
    {
        return queue.size();
    }
}
