// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;
import android.util.Log;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

class b
    implements android.media.MediaPlayer.OnInfoListener
{

    final VideoDisplayComponent a;

    b(VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        i;
        JVM INSTR lookupswitch 10: default 92
    //                   1: 120
    //                   3: 144
    //                   700: 132
    //                   701: 156
    //                   702: 168
    //                   703: 216
    //                   800: 180
    //                   801: 192
    //                   802: 204
    //                   900: 228;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        Log.i(VideoDisplayComponent.e(), (new StringBuilder()).append("unknown MediaPlayer info: what = ").append(i).toString());
_L13:
        return true;
_L2:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_UNKNOWN");
        continue; /* Loop/switch isn't completed */
_L4:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        continue; /* Loop/switch isn't completed */
_L3:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_VIDEO_RENDERING_START");
        continue; /* Loop/switch isn't completed */
_L5:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_BUFFERING_START");
        continue; /* Loop/switch isn't completed */
_L6:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_BUFFERING_END");
        continue; /* Loop/switch isn't completed */
_L8:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_BAD_INTERLEAVING");
        continue; /* Loop/switch isn't completed */
_L9:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_NOT_SEEKABLE");
        continue; /* Loop/switch isn't completed */
_L10:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_METADATA_UPDATE");
        continue; /* Loop/switch isn't completed */
_L7:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_NETWORK_BANDWIDTH");
        continue; /* Loop/switch isn't completed */
_L11:
        Log.i(VideoDisplayComponent.e(), "MEDIA_INFO_TIMED_TEXT_ERROR");
        if (true) goto _L13; else goto _L12
_L12:
    }
}
