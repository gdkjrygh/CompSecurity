// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.os.HandlerThread;
import android.os.Looper;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadHandler, DownloadOperations, SecureFileStorage, TrackDownloadsStorage

static class secureFileStorage
{

    private final DownloadOperations downloadOperations;
    private final SecureFileStorage secureFileStorage;
    private final TrackDownloadsStorage tracksStorage;

    private Looper createLooper()
    {
        HandlerThread handlerthread = new HandlerThread("DownloadThread", 10);
        handlerthread.start();
        return handlerthread.getLooper();
    }

    DownloadHandler create( )
    {
        return new DownloadHandler(createLooper(), new ler(), downloadOperations, secureFileStorage, tracksStorage);
    }

    (DownloadOperations downloadoperations, TrackDownloadsStorage trackdownloadsstorage, SecureFileStorage securefilestorage)
    {
        downloadOperations = downloadoperations;
        tracksStorage = trackdownloadsstorage;
        secureFileStorage = securefilestorage;
    }
}
