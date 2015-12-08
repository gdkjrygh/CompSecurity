// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.util.vast.VastVideoConfiguration;

// Referenced classes of package com.mopub.mobileads:
//            MraidVideoPlayerActivity

public class BaseVideoPlayerActivity extends Activity
{

    public static final String VIDEO_URL = "video_url";

    public BaseVideoPlayerActivity()
    {
    }

    static void a(Context context, VastVideoConfiguration vastvideoconfiguration, long l)
    {
        Intent intent = new Intent(context, com/mopub/mobileads/MraidVideoPlayerActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("video_view_class_name", "vast");
        intent.putExtra("vast_video_configuration", vastvideoconfiguration);
        intent.putExtra("broadcastIdentifier", l);
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("Activity MraidVideoPlayerActivity not found. Did you declare it in your AndroidManifest.xml?");
        }
    }

    public static void startMraid(Context context, String s)
    {
        Intent intent = new Intent(context, com/mopub/mobileads/MraidVideoPlayerActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("video_view_class_name", "mraid");
        intent.putExtra("video_url", s);
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MoPubLog.d("Activity MraidVideoPlayerActivity not found. Did you declare it in your AndroidManifest.xml?");
        }
    }
}
