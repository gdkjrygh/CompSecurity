// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class r
    implements android.media.MediaPlayer.OnPreparedListener
{

    final CameraFragment a;

    r(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        mediaplayer.setLooping(true);
    }
}
