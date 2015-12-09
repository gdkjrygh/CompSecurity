// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.util.VideoUtils;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            MediaMux

public final class FileMuxer
    implements MediaMux
{

    private boolean mHasAudioTrack;
    private boolean mHasVideoTrack;
    private boolean mIsReleased;
    private boolean mIsStarted;
    private boolean mIsStopped;
    private final MediaMuxer mMuxer;
    private final String mPath;
    private final boolean mRequiresAudioTrack;
    private final boolean mRequiresVideoTrack = true;

    public FileMuxer(String s, boolean flag, boolean flag1)
        throws IOException
    {
        mPath = s;
        mRequiresAudioTrack = flag1;
        mMuxer = new MediaMuxer(s, 0);
    }

    private void deleteFile()
    {
        if ((new File(mPath)).delete())
        {
            GamesLog.e("FileMuxer", (new StringBuilder("Removed media file due to muxer failure: ")).append(mPath).toString());
        }
    }

    public final int addTrack(MediaFormat mediaformat)
    {
        if (!mIsStarted) goto _L2; else goto _L1
_L1:
        int i;
        GamesLog.e("FileMuxer", "Cannot add a track once started");
        i = -1;
_L4:
        return i;
_L2:
        int j;
label0:
        {
            if (mIsStopped)
            {
                GamesLog.e("FileMuxer", "Cannot add a track once stopped");
                return -1;
            }
            if (mIsReleased)
            {
                GamesLog.e("FileMuxer", "Cannot add a track after release");
                return -1;
            }
            try
            {
                j = mMuxer.addTrack(mediaformat);
                if (!VideoUtils.isVideoFormat(mediaformat))
                {
                    break label0;
                }
                mHasVideoTrack = true;
            }
            catch (Exception exception)
            {
                GamesLog.e("FileMuxer", (new StringBuilder("Adding track failed for format: ")).append(mediaformat).toString());
                return -1;
            }
            return j;
        }
        i = j;
        if (!VideoUtils.isAudioFormat(mediaformat)) goto _L4; else goto _L3
_L3:
        mHasAudioTrack = true;
        return j;
    }

    public final void cleanupPartialResults()
    {
        deleteFile();
    }

    public final boolean hasAllTracks()
    {
        return !mIsReleased && !mIsStopped && (!mRequiresAudioTrack || mHasAudioTrack) && (!mRequiresVideoTrack || mHasVideoTrack);
    }

    public final boolean isStarted()
    {
        return mIsStarted && !mIsStopped && !mIsReleased;
    }

    public final boolean release()
    {
        VideoUtils.logChatty("FileMuxer", (new StringBuilder("Releasing muxer: ")).append(this).toString());
        if (mIsReleased)
        {
            return true;
        }
        try
        {
            mMuxer.release();
            mIsReleased = true;
        }
        catch (Exception exception)
        {
            GamesLog.e("FileMuxer", "Releasing media muxer failed", exception);
        }
        return mIsReleased;
    }

    public final void requestFinalResult(Context context, final MediaMux.ResultCallback resultCallback)
    {
        Preconditions.checkNotNull(resultCallback);
        PlatformVersion.checkVersion(21);
        String s = mPath;
        resultCallback = new android.media.MediaScannerConnection.OnScanCompletedListener() {

            final FileMuxer this$0;
            final MediaMux.ResultCallback val$resultCallback;

            public final void onScanCompleted(String s1, Uri uri)
            {
                resultCallback.onResultAvailable(uri);
            }

            
            {
                this$0 = FileMuxer.this;
                resultCallback = resultcallback;
                super();
            }
        };
        MediaScannerConnection.scanFile(context, new String[] {
            s
        }, new String[] {
            "video/avc", "video/mp4v-es"
        }, resultCallback);
    }

    public final boolean start()
    {
        VideoUtils.logChatty("FileMuxer", (new StringBuilder("Starting muxer: ")).append(this).toString());
        if (mIsReleased)
        {
            GamesLog.e("FileMuxer", "Cannot start once released");
            return false;
        }
        if (mIsStopped)
        {
            GamesLog.e("FileMuxer", "Cannot restart once stopped");
            return false;
        }
        if (mIsStarted)
        {
            return true;
        }
        if (!hasAllTracks())
        {
            GamesLog.e("FileMuxer", "Cannot start without all tracks");
            return false;
        }
        try
        {
            mMuxer.start();
            mIsStarted = true;
        }
        catch (Exception exception)
        {
            GamesLog.e("FileMuxer", "Starting muxer failed", exception);
        }
        return mIsStarted;
    }

    public final boolean stop()
    {
        VideoUtils.logChatty("FileMuxer", (new StringBuilder("Stopping muxer: ")).append(this).toString());
        if (mIsReleased)
        {
            GamesLog.e("FileMuxer", "Cannot stop once released");
            return false;
        }
        if (!mIsStarted)
        {
            GamesLog.e("FileMuxer", "Muxer not started");
            return false;
        }
        if (mIsStopped)
        {
            return true;
        }
        try
        {
            mMuxer.stop();
            mIsStopped = true;
        }
        catch (Exception exception)
        {
            GamesLog.e("FileMuxer", (new StringBuilder("Muxer not stopped cleanly. Deleting media file: ")).append(mPath).toString());
            deleteFile();
        }
        return mIsStopped;
    }

    public final boolean writeSampleData(int i, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        if (mIsReleased)
        {
            GamesLog.e("FileMuxer", "Cannot write data once released");
            return false;
        }
        if (mIsStopped)
        {
            GamesLog.e("FileMuxer", "Cannot write data once stopped");
            return false;
        }
        if (!mIsStarted)
        {
            GamesLog.e("FileMuxer", "Muxer not started");
            return false;
        }
        try
        {
            mMuxer.writeSampleData(i, bytebuffer, bufferinfo);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            GamesLog.e("FileMuxer", "Writing sample data failed", bytebuffer);
            return false;
        }
        return true;
    }
}
