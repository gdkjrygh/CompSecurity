// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.offline.DownloadRequest;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.java.objects.MoreObjects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

public final class CurrentDownloadEvent
{

    public static final f FOR_LIKED_TRACKS_FILTER = new _cls2();
    public static final f TO_OFFLINE_STATE = new _cls1();
    public final List entities;
    public final boolean isLikedTracks;
    public final OfflineState kind;

    private CurrentDownloadEvent(OfflineState offlinestate, boolean flag, List list)
    {
        kind = offlinestate;
        entities = Collections.unmodifiableList(list);
        isLikedTracks = flag;
    }

    private static CurrentDownloadEvent create(OfflineState offlinestate, List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        boolean flag = false;
        while (list.hasNext()) 
        {
            DownloadRequest downloadrequest = (DownloadRequest)list.next();
            if (flag || downloadrequest.isLiked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            arraylist.addAll(downloadrequest.getPlaylists());
            arraylist.add(downloadrequest.getTrack());
        }
        return new CurrentDownloadEvent(offlinestate, flag, arraylist);
    }

    public static CurrentDownloadEvent downloadRemoved(List list)
    {
        return new CurrentDownloadEvent(OfflineState.NO_OFFLINE, false, list);
    }

    public static CurrentDownloadEvent downloadRequestRemoved(List list)
    {
        return create(OfflineState.NO_OFFLINE, list);
    }

    public static CurrentDownloadEvent downloadRequested(List list)
    {
        return create(OfflineState.REQUESTED, list);
    }

    public static CurrentDownloadEvent downloadRequested(boolean flag, List list)
    {
        return new CurrentDownloadEvent(OfflineState.REQUESTED, flag, list);
    }

    public static CurrentDownloadEvent downloaded(List list)
    {
        return create(OfflineState.DOWNLOADED, list);
    }

    public static CurrentDownloadEvent downloaded(boolean flag, List list)
    {
        return new CurrentDownloadEvent(OfflineState.DOWNLOADED, flag, list);
    }

    public static CurrentDownloadEvent downloading(DownloadRequest downloadrequest)
    {
        return create(OfflineState.DOWNLOADING, Arrays.asList(new DownloadRequest[] {
            downloadrequest
        }));
    }

    public static CurrentDownloadEvent idle()
    {
        return new CurrentDownloadEvent(OfflineState.NO_OFFLINE, false, Collections.emptyList());
    }

    public static CurrentDownloadEvent offlineContentRemoved(List list)
    {
        return new CurrentDownloadEvent(OfflineState.NO_OFFLINE, true, list);
    }

    public static CurrentDownloadEvent unavailable(List list)
    {
        return create(OfflineState.UNAVAILABLE, list);
    }

    public static CurrentDownloadEvent unavailable(boolean flag, List list)
    {
        return new CurrentDownloadEvent(OfflineState.UNAVAILABLE, flag, list);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CurrentDownloadEvent)obj;
            if (!MoreObjects.equal(kind, ((CurrentDownloadEvent) (obj)).kind) || !MoreObjects.equal(Boolean.valueOf(isLikedTracks), Boolean.valueOf(((CurrentDownloadEvent) (obj)).isLikedTracks)) || !MoreObjects.equal(entities, ((CurrentDownloadEvent) (obj)).entities))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            kind, entities, Boolean.valueOf(isLikedTracks)
        });
    }

    public final String toString()
    {
        return MoreObjects.toStringHelper(this).add("kind", kind).add("entities", entities).add("isLikedTracks", isLikedTracks).toString();
    }


    private class _cls1
        implements f
    {

        public final OfflineState call(CurrentDownloadEvent currentdownloadevent)
        {
            return currentdownloadevent.kind;
        }

        public final volatile Object call(Object obj)
        {
            return call((CurrentDownloadEvent)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Boolean call(CurrentDownloadEvent currentdownloadevent)
        {
            return Boolean.valueOf(currentdownloadevent.isLikedTracks);
        }

        public final volatile Object call(Object obj)
        {
            return call((CurrentDownloadEvent)obj);
        }

        _cls2()
        {
        }
    }

}
