// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.play.utils.PlayUtils;
import java.io.File;

// Referenced classes of package com.google.android.gms.games.util:
//            VideoHandler, VideoEncodingProfiles

public final class VideoUtils
{

    public static final boolean DBG;

    public static void assertThreadState(VideoHandler videohandler)
    {
        if (videohandler.getLooper().getThread() != Thread.currentThread())
        {
            String s = videohandler.mName;
            GamesLog.e("VideoUtils", (new StringBuilder("current thread ")).append(Thread.currentThread()).append(" IS NOT the ").append(s).append(" thread ").append(videohandler.getLooper().getThread()).append("!").toString());
            throw new IllegalStateException((new StringBuilder("This method must be called in the ")).append(s).append(" handler thread").toString());
        } else
        {
            return;
        }
    }

    public static int getEstimatedTimeRemainingSeconds(Context context, int i)
    {
        Preconditions.checkState(VideoConfiguration.isValidQualityLevel(i));
        Preconditions.checkState(PlatformVersion.checkVersion(18));
        long l2 = (new StatFs(Environment.getExternalStorageDirectory().getPath())).getAvailableBytes() - ((Long)G.videoMinimumDiskSpace.get()).longValue();
        if (l2 <= 0L)
        {
            return 0;
        }
        context = VideoEncodingProfiles.getInstance(context);
        MediaFormat mediaformat = context.getVideoFormat(i, true);
        long l = 0L;
        if (mediaformat != null)
        {
            l = 0L + (long)mediaformat.getInteger("bitrate");
        }
        context = context.getAudioFormat$11e6a031();
        long l1 = l;
        if (context != null)
        {
            l1 = l + (long)context.getInteger("bitrate");
        }
        if (l1 == 0L)
        {
            return 0;
        } else
        {
            return (int)((8L * l2) / l1);
        }
    }

    public static boolean isAudioFormat(MediaFormat mediaformat)
    {
        mediaformat = mediaformat.getString("mime");
        return mediaformat != null && mediaformat.startsWith("audio/");
    }

    private static boolean isRecordingEnabled(Context context)
    {
        Preconditions.checkNotNull(context);
        while (!PlatformVersion.checkVersion(21) || PlayUtils.isTv(context)) 
        {
            return false;
        }
        return true;
    }

    public static boolean isStreamRecordingEnabled(Context context)
    {
        Preconditions.checkNotNull(context);
        return isRecordingEnabled(context);
    }

    public static boolean isVideoFormat(MediaFormat mediaformat)
    {
        mediaformat = mediaformat.getString("mime");
        return mediaformat != null && mediaformat.startsWith("video/");
    }

    public static boolean isVideoRecordingEnabled(Context context)
    {
        Preconditions.checkNotNull(context);
        return isRecordingEnabled(context);
    }

    public static void logChatty(String s, String s1)
    {
        if (DBG)
        {
            GamesLog.d(s, String.format("thread=%s, %s", new Object[] {
                Thread.currentThread().getName(), s1
            }));
        }
    }

    static 
    {
        DBG = ((Boolean)G.videoEnableDebugging.get()).booleanValue();
    }
}
