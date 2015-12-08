// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Where;

public class OfflineFilters
{

    public static final Where OFFLINE_TRACK_FILTER;
    public static final Where REQUESTED_DOWNLOAD_FILTER;

    public OfflineFilters()
    {
    }

    static 
    {
        REQUESTED_DOWNLOAD_FILTER = Filter.filter().whereNull(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT).whereNull(com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT).whereNull(com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT).whereNotNull(com.soundcloud.android.storage.Tables.TrackDownloads.REQUESTED_AT);
        OFFLINE_TRACK_FILTER = Filter.filter().whereNotNull(com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT).whereNull(com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT).whereNull(com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT);
    }
}
