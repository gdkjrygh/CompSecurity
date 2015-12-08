// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.java.objects.MoreObjects;
import java.util.Collections;
import java.util.List;

public class OfflineContentUpdates
{

    public final List allDownloadRequests;
    public final List creatorOptOutRequests;
    public final List newDownloadRequests;
    public final List newRemovedTracks;
    public final List newRestoredRequests;

    public OfflineContentUpdates(List list, List list1, List list2, List list3, List list4)
    {
        allDownloadRequests = Collections.unmodifiableList(list);
        newDownloadRequests = Collections.unmodifiableList(list1);
        newRestoredRequests = Collections.unmodifiableList(list2);
        creatorOptOutRequests = Collections.unmodifiableList(list3);
        newRemovedTracks = Collections.unmodifiableList(list4);
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("allDownloads", allDownloadRequests).add("newDownloads", newDownloadRequests).add("newRestoredRequests", newRestoredRequests).add("creatorOptOutRequests", creatorOptOutRequests).add("newRemovedTracks", newRemovedTracks).toString();
    }
}
