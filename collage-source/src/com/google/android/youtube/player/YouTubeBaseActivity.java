// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.youtube.player:
//            YouTubePlayerView

public class YouTubeBaseActivity extends Activity
{
    private final class a
        implements YouTubePlayerView.b
    {

        final YouTubeBaseActivity a;

        public final void a(YouTubePlayerView youtubeplayerview)
        {
            if (YouTubeBaseActivity.a(a) != null && YouTubeBaseActivity.a(a) != youtubeplayerview)
            {
                YouTubeBaseActivity.a(a).c(true);
            }
            YouTubeBaseActivity.a(a, youtubeplayerview);
            if (YouTubeBaseActivity.b(a) > 0)
            {
                youtubeplayerview.a();
            }
            if (YouTubeBaseActivity.b(a) >= 2)
            {
                youtubeplayerview.b();
            }
        }

        private a()
        {
            a = YouTubeBaseActivity.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private a a;
    private YouTubePlayerView b;
    private int c;
    private Bundle d;

    public YouTubeBaseActivity()
    {
    }

    static YouTubePlayerView a(YouTubeBaseActivity youtubebaseactivity)
    {
        return youtubebaseactivity.b;
    }

    static YouTubePlayerView a(YouTubeBaseActivity youtubebaseactivity, YouTubePlayerView youtubeplayerview)
    {
        youtubebaseactivity.b = youtubeplayerview;
        return youtubeplayerview;
    }

    static int b(YouTubeBaseActivity youtubebaseactivity)
    {
        return youtubebaseactivity.c;
    }

    final YouTubePlayerView.b a()
    {
        return a;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = new a((byte)0);
        if (bundle != null)
        {
            bundle = bundle.getBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE");
        } else
        {
            bundle = null;
        }
        d = bundle;
    }

    protected void onDestroy()
    {
        if (b != null)
        {
            b.b(isFinishing());
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        c = 1;
        if (b != null)
        {
            b.c();
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        c = 2;
        if (b != null)
        {
            b.b();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        Bundle bundle1;
        if (b != null)
        {
            bundle1 = b.e();
        } else
        {
            bundle1 = d;
        }
        bundle.putBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE", bundle1);
    }

    protected void onStart()
    {
        super.onStart();
        c = 1;
        if (b != null)
        {
            b.a();
        }
    }

    protected void onStop()
    {
        c = 0;
        if (b != null)
        {
            b.d();
        }
        super.onStop();
    }
}
