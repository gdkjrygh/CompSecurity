// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import flb;
import fld;
import fli;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.spotlets.video:
//            BackgroundableVideoPlayerActivity

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        BackgroundableVideoPlayerActivity.e(a.a).setVisibility(8);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/video/BackgroundableVideoPlayerActivity$1

/* anonymous class */
    final class BackgroundableVideoPlayerActivity._cls1
        implements fli
    {

        final BackgroundableVideoPlayerActivity a;

        public final void a()
        {
            BackgroundableVideoPlayerActivity.b(a).a(BackgroundableVideoPlayerActivity.a(a), a.getWindowManager().getDefaultDisplay());
            BackgroundableVideoPlayerActivity.c(a).a();
        }

        public final void a(LegacyAdsVideoPlayerService.AdsVideoPlaybackState adsvideoplaybackstate)
        {
            switch (BackgroundableVideoPlayerActivity._cls5.a[adsvideoplaybackstate.ordinal()])
            {
            default:
                a.runOnUiThread(new BackgroundableVideoPlayerActivity._cls1._cls2(this));
                return;

            case 1: // '\001'
                a.runOnUiThread(new BackgroundableVideoPlayerActivity._cls1._cls1());
                break;
            }
        }

        public final void a(Map map)
        {
            BackgroundableVideoPlayerActivity.d(a);
        }

        public final void a(boolean flag)
        {
            if (flag)
            {
                a.getWindow().addFlags(128);
                return;
            } else
            {
                a.getWindow().clearFlags(128);
                return;
            }
        }

        public final void b()
        {
            if (BackgroundableVideoPlayerActivity.f(a) != null)
            {
                a.runOnUiThread(new BackgroundableVideoPlayerActivity._cls1._cls3());
            }
        }

        public final void b(Map map)
        {
            BackgroundableVideoPlayerActivity.d(a);
        }

            
            {
                a = backgroundablevideoplayeractivity;
                super();
            }

        // Unreferenced inner class com/spotify/mobile/android/spotlets/video/BackgroundableVideoPlayerActivity$1$1

/* anonymous class */
        final class BackgroundableVideoPlayerActivity._cls1._cls1
            implements Runnable
        {

            private BackgroundableVideoPlayerActivity._cls1 a;

            public final void run()
            {
                BackgroundableVideoPlayerActivity.e(a.a).setVisibility(0);
            }

                    
                    {
                        a = BackgroundableVideoPlayerActivity._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/spotify/mobile/android/spotlets/video/BackgroundableVideoPlayerActivity$1$3

/* anonymous class */
        final class BackgroundableVideoPlayerActivity._cls1._cls3
            implements Runnable
        {

            private BackgroundableVideoPlayerActivity._cls1 a;

            public final void run()
            {
                BackgroundableVideoPlayerActivity.f(a.a).setVisibility(8);
            }

                    
                    {
                        a = BackgroundableVideoPlayerActivity._cls1.this;
                        super();
                    }
        }

    }

}
