// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            HandShake, MMLog

private class videoInterval
{

    boolean downloading;
    long lastVideo;
    final HandShake this$0;
    long videoInterval;

    boolean canDisplayCachedAd(long l)
    {
        return System.currentTimeMillis() - l < HandShake.access$1100(HandShake.this);
    }

    boolean canRequestVideo(Context context)
    {
        long l = System.currentTimeMillis();
        MMLog.d("HandShake", (new StringBuilder()).append("canRequestVideo() Current Time:").append(l).append(" Last Video: ").append(lastVideo / 1000L).append("  Diff: ").append((l - lastVideo) / 1000L).append("  Video interval: ").append(videoInterval / 1000L).toString());
        return System.currentTimeMillis() - lastVideo > videoInterval;
    }

    void deserializeFromObj(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        } else
        {
            videoInterval = jsonobject.optLong("videointerval") * 1000L;
            return;
        }
    }

    boolean load(SharedPreferences sharedpreferences, String s)
    {
        boolean flag = false;
        if (sharedpreferences.contains((new StringBuilder()).append("handshake_lastvideo_").append(s).toString()))
        {
            lastVideo = sharedpreferences.getLong((new StringBuilder()).append("handshake_lastvideo_").append(s).toString(), lastVideo);
            flag = true;
        }
        if (sharedpreferences.contains((new StringBuilder()).append("handshake_videointerval_").append(s).toString()))
        {
            videoInterval = sharedpreferences.getLong((new StringBuilder()).append("handshake_videointerval_").append(s).toString(), videoInterval);
            flag = true;
        }
        return flag;
    }

    void loadLastVideo(Context context, String s)
    {
        context = context.getSharedPreferences("MillennialMediaSettings", 0);
        if (context != null && context.contains((new StringBuilder()).append("handshake_lastvideo_").append(s).toString()))
        {
            lastVideo = context.getLong((new StringBuilder()).append("handshake_lastvideo_").append(s).toString(), lastVideo);
        }
    }

    void save(Context context, String s)
    {
        context = context.getSharedPreferences("MillennialMediaSettings", 0).edit();
        save(((android.content.peHandShake.save) (context)), s);
        context.ommit();
    }

    void save(android.content.peHandShake pehandshake, String s)
    {
        pehandshake.utLong((new StringBuilder()).append("handshake_lastvideo_").append(s).toString(), lastVideo);
        pehandshake.utLong((new StringBuilder()).append("handshake_videointerval_").append(s).toString(), videoInterval);
    }

    void updateLastVideoViewedTime(Context context, String s)
    {
        lastVideo = System.currentTimeMillis();
        save(context, s);
    }

    ()
    {
        this$0 = HandShake.this;
        super();
        lastVideo = 0L;
        videoInterval = 0L;
    }
}
