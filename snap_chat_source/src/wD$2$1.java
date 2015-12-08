// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import com.snapchat.android.ui.TextureVideoView;

final class ng.Object
    implements Runnable
{

    private wy a;

    public final void run()
    {
        a.b();
    }

    ct(wy wy1)
    {
        a = wy1;
        super();
    }

    // Unreferenced inner class wD$2

/* anonymous class */
    final class wD._cls2
        implements android.media.MediaPlayer.OnPreparedListener
    {

        private wD a;

        public final void onPrepared(MediaPlayer mediaplayer)
        {
            a.i = mediaplayer.getVideoWidth();
            a.j = mediaplayer.getVideoHeight();
            a.g = mediaplayer.getDuration();
            a.f = 2;
            a.h = 0;
            wy wy1 = a.e;
            if (wy1 != null)
            {
                if (!a.a)
                {
                    a.b.postDelayed(new wD._cls2._cls1(wy1), 250L);
                }
                return;
            } else
            {
                mediaplayer.setLooping(a.d);
                return;
            }
        }

            
            {
                a = wd;
                super();
            }
    }

}
