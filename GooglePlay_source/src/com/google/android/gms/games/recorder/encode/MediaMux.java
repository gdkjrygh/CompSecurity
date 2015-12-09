// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import java.nio.ByteBuffer;

public interface MediaMux
{
    public static interface ResultCallback
    {

        public abstract void onResultAvailable(Uri uri);
    }


    public abstract int addTrack(MediaFormat mediaformat);

    public abstract void cleanupPartialResults();

    public abstract boolean hasAllTracks();

    public abstract boolean isStarted();

    public abstract boolean release();

    public abstract void requestFinalResult(Context context, ResultCallback resultcallback);

    public abstract boolean start();

    public abstract boolean stop();

    public abstract boolean writeSampleData(int i, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo);
}
