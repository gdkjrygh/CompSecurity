// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordingStorage

class RecordingOperations
{

    private final RecordingStorage recordingStorage;
    private final R scheduler;

    RecordingOperations(R r, RecordingStorage recordingstorage)
    {
        scheduler = r;
        recordingStorage = recordingstorage;
    }

    public b cleanupRecordings(File file)
    {
        return recordingStorage.cleanupRecordings(file).subscribeOn(scheduler);
    }

    public b deleteStaleUploads(File file)
    {
        return recordingStorage.deleteStaleUploads(file).subscribeOn(scheduler);
    }

    public b upload(File file, Uri uri, String s, ContentResolver contentresolver)
    {
        return recordingStorage.upload(file, uri, s, contentresolver).subscribeOn(scheduler);
    }
}
