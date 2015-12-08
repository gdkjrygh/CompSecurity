// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            VideoWindowForPostplayFullScreen, VideoWindowForPostplayWithAnimation, PlayerActivity, VideoWindowForPostplay

public final class VideoWindowForPostplayFactory
{

    protected static String TAG = "nf_postplay";

    private VideoWindowForPostplayFactory()
    {
    }

    static VideoWindowForPostplay createVideoWindow(PlayerActivity playeractivity)
    {
        if (AndroidUtils.getAndroidVersion() < 17)
        {
            Log.d(TAG, "Use simple scaling");
            return new VideoWindowForPostplayFullScreen(playeractivity);
        } else
        {
            Log.d(TAG, "Use animation");
            return new VideoWindowForPostplayWithAnimation(playeractivity);
        }
    }

}
