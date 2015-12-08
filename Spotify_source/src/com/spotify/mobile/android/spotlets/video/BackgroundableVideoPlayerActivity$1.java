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
    implements fli
{

    final BackgroundableVideoPlayerActivity a;

    public final void a()
    {
        BackgroundableVideoPlayerActivity.b(a).a(BackgroundableVideoPlayerActivity.a(a), a.getWindowManager().getDefaultDisplay());
        BackgroundableVideoPlayerActivity.c(a).a();
    }

    public final void a(PlaybackState playbackstate)
    {
        switch (a[playbackstate.ordinal()])
        {
        default:
            a.runOnUiThread(new Runnable() {

                private BackgroundableVideoPlayerActivity._cls1 a;

                public final void run()
                {
                    BackgroundableVideoPlayerActivity.e(a.a).setVisibility(8);
                }

            
            {
                a = BackgroundableVideoPlayerActivity._cls1.this;
                super();
            }
            });
            return;

        case 1: // '\001'
            a.runOnUiThread(new Runnable() {

                private BackgroundableVideoPlayerActivity._cls1 a;

                public final void run()
                {
                    BackgroundableVideoPlayerActivity.e(a.a).setVisibility(0);
                }

            
            {
                a = BackgroundableVideoPlayerActivity._cls1.this;
                super();
            }
            });
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
            a.runOnUiThread(new Runnable() {

                private BackgroundableVideoPlayerActivity._cls1 a;

                public final void run()
                {
                    BackgroundableVideoPlayerActivity.f(a.a).setVisibility(8);
                }

            
            {
                a = BackgroundableVideoPlayerActivity._cls1.this;
                super();
            }
            });
        }
    }

    public final void b(Map map)
    {
        BackgroundableVideoPlayerActivity.d(a);
    }

    _cls3.a(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        a = backgroundablevideoplayeractivity;
        super();
    }
}
