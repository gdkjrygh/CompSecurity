// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;

final class ehg
    implements android.media.MediaPlayer.OnCompletionListener
{

    private ehb a;

    ehg(ehb ehb1)
    {
        a = ehb1;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (PreferenceManager.getDefaultSharedPreferences(a.a).getBoolean("com.google.android.apps.photos.videoplayer.loop_video", true) && a.i.isPlaying())
        {
            a.i.seekTo(0);
            ehb.a(a);
            a.f.a(jek.b);
            a.g.a();
            return;
        }
        if (a.i != null)
        {
            a.a(a.i.getDuration(), false);
        }
        a.f.a(jek.a);
    }
}
