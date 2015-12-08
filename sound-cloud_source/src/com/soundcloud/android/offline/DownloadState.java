// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadRequest, SecureFileStorage

public final class DownloadState
{
    private static final class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status CANCELLED;
        public static final Status CONNECTION_ERROR;
        public static final Status ERROR;
        public static final Status NOT_ENOUGH_SPACE;
        public static final Status PROGRESS;
        public static final Status SUCCESS;
        public static final Status UNAVAILABLE;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/soundcloud/android/offline/DownloadState$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            PROGRESS = new Status("PROGRESS", 0);
            SUCCESS = new Status("SUCCESS", 1);
            CANCELLED = new Status("CANCELLED", 2);
            UNAVAILABLE = new Status("UNAVAILABLE", 3);
            NOT_ENOUGH_SPACE = new Status("NOT_ENOUGH_SPACE", 4);
            CONNECTION_ERROR = new Status("CONNECTION_ERROR", 5);
            ERROR = new Status("ERROR", 6);
            $VALUES = (new Status[] {
                PROGRESS, SUCCESS, CANCELLED, UNAVAILABLE, NOT_ENOUGH_SPACE, CONNECTION_ERROR, ERROR
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    final DownloadOperations.ConnectionState connectionState;
    long progress;
    final DownloadRequest request;
    final Status status;
    final long timestamp;

    private DownloadState(Status status1, DownloadRequest downloadrequest)
    {
        this(status1, downloadrequest, -1L);
    }

    public DownloadState(Status status1, DownloadRequest downloadrequest, long l)
    {
        this(status1, downloadrequest, l, null);
    }

    private DownloadState(Status status1, DownloadRequest downloadrequest, long l, DownloadOperations.ConnectionState connectionstate)
    {
        progress = -1L;
        status = status1;
        request = downloadrequest;
        timestamp = System.currentTimeMillis();
        progress = l;
        connectionState = connectionstate;
    }

    private DownloadState(Status status1, DownloadRequest downloadrequest, DownloadOperations.ConnectionState connectionstate)
    {
        this(status1, downloadrequest, -1L, connectionstate);
    }

    public static DownloadState canceled(DownloadRequest downloadrequest)
    {
        (new StringBuilder("Download cancelled: ")).append(downloadrequest.getTrack());
        return new DownloadState(Status.CANCELLED, downloadrequest);
    }

    public static DownloadState connectionError(DownloadRequest downloadrequest, DownloadOperations.ConnectionState connectionstate)
    {
        (new StringBuilder("Connection error download result: ")).append(downloadrequest.getTrack());
        return new DownloadState(Status.CONNECTION_ERROR, downloadrequest, connectionstate);
    }

    public static DownloadState error(DownloadRequest downloadrequest)
    {
        return new DownloadState(Status.ERROR, downloadrequest);
    }

    public static DownloadState inProgress(DownloadRequest downloadrequest, long l)
    {
        return new DownloadState(Status.PROGRESS, downloadrequest, l);
    }

    public static DownloadState notEnoughSpace(DownloadRequest downloadrequest)
    {
        (new StringBuilder("Not enough space download result: ")).append(downloadrequest.getTrack());
        return new DownloadState(Status.NOT_ENOUGH_SPACE, downloadrequest);
    }

    public static DownloadState success(DownloadRequest downloadrequest)
    {
        (new StringBuilder("Successful download result: ")).append(downloadrequest.getTrack());
        return new DownloadState(Status.SUCCESS, downloadrequest, SecureFileStorage.calculateFileSizeInBytes(downloadrequest.getDuration()));
    }

    public static DownloadState unavailable(DownloadRequest downloadrequest)
    {
        (new StringBuilder("Unavailable download result: ")).append(downloadrequest.getTrack());
        return new DownloadState(Status.UNAVAILABLE, downloadrequest);
    }

    public final long getProgress()
    {
        return progress;
    }

    public final long getTimestamp()
    {
        return timestamp;
    }

    public final long getTotalBytes()
    {
        return SecureFileStorage.calculateFileSizeInBytes(request.getDuration());
    }

    public final Urn getTrack()
    {
        return request.getTrack();
    }

    public final boolean isCancelled()
    {
        return status == Status.CANCELLED;
    }

    public final boolean isConnectionError()
    {
        return status == Status.CONNECTION_ERROR;
    }

    public final boolean isDownloadFailed()
    {
        return status == Status.ERROR;
    }

    public final boolean isNotEnoughSpace()
    {
        return status == Status.NOT_ENOUGH_SPACE;
    }

    public final boolean isSuccess()
    {
        return status == Status.SUCCESS;
    }

    public final boolean isUnavailable()
    {
        return status == Status.UNAVAILABLE;
    }

    public final String toString()
    {
        return MoreObjects.toStringHelper(this).add("status", status).add("request", request).add("timestamp", timestamp).toString();
    }
}
