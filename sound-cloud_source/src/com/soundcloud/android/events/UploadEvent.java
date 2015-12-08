// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.java.objects.MoreObjects;

public final class UploadEvent
{

    private static final String CANCELLED = "cancelled";
    private static final String ERROR = "error";
    private static final String IDLE = "idle";
    private static final String PROCESSING_CANCELLED = "processing_cancelled";
    private static final String PROCESSING_PROGRESS = "processing_progress";
    private static final String PROCESSING_STARTED = "processing_started";
    private static final String PROCESSING_SUCCESS = "processing_success";
    private static final String RESIZE_STARTED = "resize_started";
    private static final String RESIZE_SUCCESS = "resize_success";
    private static final String TRANSFER_CANCELLED = "transfer_cancelled";
    private static final String TRANSFER_PROGRESS = "transfer_progress";
    private static final String TRANSFER_STARTED = "transfer_started";
    private static final String TRANSFER_SUCCESS = "transfer_success";
    private static final String UPLOAD_CANCELLED = "upload_cancelled";
    private static final String UPLOAD_START = "upload_start";
    private static final String UPLOAD_SUCCESS = "upload_success";
    private final String kind;
    private final int progress;
    private final Recording recording;
    private final PublicApiTrack track;

    private UploadEvent(String s)
    {
        this(s, null);
    }

    private UploadEvent(String s, Recording recording1)
    {
        this(s, recording1, 0);
    }

    private UploadEvent(String s, Recording recording1, int i)
    {
        this(s, recording1, i, null);
    }

    private UploadEvent(String s, Recording recording1, int i, PublicApiTrack publicapitrack)
    {
        kind = s;
        recording = recording1;
        track = publicapitrack;
        progress = i;
    }

    public static UploadEvent cancelled(Recording recording1)
    {
        return new UploadEvent("cancelled", recording1);
    }

    public static UploadEvent error(Recording recording1)
    {
        return new UploadEvent("error", recording1);
    }

    public static UploadEvent idle()
    {
        return new UploadEvent("idle");
    }

    public static UploadEvent processingProgress(Recording recording1, int i)
    {
        return new UploadEvent("processing_progress", recording1, i);
    }

    public static UploadEvent processingStarted(Recording recording1)
    {
        return new UploadEvent("processing_started", recording1, -1);
    }

    public static UploadEvent processingSuccess(Recording recording1)
    {
        return new UploadEvent("processing_success", recording1, 100);
    }

    public static UploadEvent resizeStarted(Recording recording1)
    {
        return new UploadEvent("resize_started", recording1);
    }

    public static UploadEvent resizeSuccess(Recording recording1)
    {
        return new UploadEvent("resize_success", recording1);
    }

    public static UploadEvent start(Recording recording1)
    {
        return new UploadEvent("upload_start", recording1);
    }

    public static UploadEvent success(Recording recording1)
    {
        return new UploadEvent("upload_success", recording1);
    }

    public static UploadEvent transferProgress(Recording recording1, int i)
    {
        return new UploadEvent("transfer_progress", recording1, i);
    }

    public static UploadEvent transferStarted(Recording recording1)
    {
        return new UploadEvent("transfer_started", recording1, -1);
    }

    public static UploadEvent transferSuccess(Recording recording1, PublicApiTrack publicapitrack)
    {
        return new UploadEvent("transfer_success", recording1, 100, publicapitrack);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UploadEvent)obj;
            if (!MoreObjects.equal(((UploadEvent) (obj)).kind, kind) || !MoreObjects.equal(((UploadEvent) (obj)).recording, recording) || !MoreObjects.equal(Integer.valueOf(((UploadEvent) (obj)).progress), Integer.valueOf(progress)) || !MoreObjects.equal(((UploadEvent) (obj)).track, track))
            {
                return false;
            }
        }
        return true;
    }

    public final int getProgress()
    {
        return progress;
    }

    public final Recording getRecording()
    {
        return recording;
    }

    public final PublicApiTrack getTrack()
    {
        return track;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            kind, recording, Integer.valueOf(progress), track
        });
    }

    public final boolean isCancelled()
    {
        return kind.equals("cancelled") || isTransferCancelled() || isUploadCancelled();
    }

    public final boolean isError()
    {
        return kind.equals("error");
    }

    public final boolean isFinished()
    {
        return isUploadSuccess() || isError();
    }

    public final boolean isProcessing()
    {
        return isProcessingProgress() || isProcessingStarted() || isProcessingSuccess();
    }

    public final boolean isProcessingProgress()
    {
        return kind.equals("processing_progress");
    }

    public final boolean isProcessingStarted()
    {
        return kind.equals("processing_started");
    }

    public final boolean isProcessingSuccess()
    {
        return kind.equals("processing_success");
    }

    public final boolean isResizeStarted()
    {
        return kind.equals("resize_started");
    }

    public final boolean isResizeSuccess()
    {
        return kind.equals("resize_success");
    }

    public final boolean isStarted()
    {
        return kind.equals("upload_start");
    }

    public final boolean isTransfer()
    {
        return isTransferStarted() || isTransferProgress() || isTransferSuccess();
    }

    public final boolean isTransferCancelled()
    {
        return kind.equals("transfer_cancelled");
    }

    public final boolean isTransferProgress()
    {
        return kind.equals("transfer_progress");
    }

    public final boolean isTransferStarted()
    {
        return kind.equals("transfer_started");
    }

    public final boolean isTransferSuccess()
    {
        return kind.equals("transfer_success");
    }

    public final boolean isUploadCancelled()
    {
        return kind.equals("upload_cancelled");
    }

    public final boolean isUploadSuccess()
    {
        return kind.equals("upload_success");
    }

    public final boolean isUploading()
    {
        return !kind.equals("idle") && !isCancelled() && !isError() && !isUploadSuccess();
    }

    public final String toString()
    {
        return MoreObjects.toStringHelper(this).add("kind", kind).add("progress", progress).add("track", track).toString();
    }
}
