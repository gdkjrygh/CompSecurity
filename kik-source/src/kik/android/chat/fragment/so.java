// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.media.MediaPlayer;
import com.kik.android.a;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

final class so
    implements android.media.MediaPlayer.OnPreparedListener
{

    final kik.a.d.a.a a;
    final ViewPictureFragment b;

    so(ViewPictureFragment viewpicturefragment, kik.a.d.a.a a1)
    {
        b = viewpicturefragment;
        a = a1;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (ViewPictureFragment.q(b))
        {
            b.f.b("Video Playback Begin").a("App ID", a.u()).a("Is Inline", false).a("Video Length", (double)(float)mediaplayer.getDuration() / 1000D).a("Loading Duration", (double)(System.currentTimeMillis() - ViewPictureFragment.s(b)) / 1000D).a("Was Cached", ViewPictureFragment.r(b)).a("Autoplay", a.y()).a("Looping", a.z()).a("Muted", a.A()).a("Did Autoplay", false).b();
        }
        if (a.z())
        {
            mediaplayer.setLooping(true);
            ViewPictureFragment.t(b);
        }
        if (a.A())
        {
            mediaplayer.setVolume(0.0F, 0.0F);
        }
    }
}
