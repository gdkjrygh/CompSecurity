// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.geofence.impl;


// Referenced classes of package com.digby.mm.android.library.geofence.impl:
//            GetGeoFencesTask

static class tates
{

    static final int $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates[];

    static 
    {
        $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates = new int[com.digby.mm.android.library.geofence.loadStates.values().length];
        try
        {
            $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates[com.digby.mm.android.library.geofence.loadStates.NEVER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates[com.digby.mm.android.library.geofence.loadStates.DOWNLOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$digby$mm$android$library$geofence$IDownloadInfo$eDownloadStates[com.digby.mm.android.library.geofence.loadStates.COMPLETE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
