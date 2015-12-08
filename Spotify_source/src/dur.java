// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class dur
{

    public int a;
    final boolean b;
    public com.spotify.mobile.android.core.internal.LocalFilePlayer.LocalFilePlayerListener c;
    public com.spotify.mobile.android.core.internal.SoundDriver.SoundDriverListener d;
    private Context e;

    public dur(Context context)
    {
        c = new com.spotify.mobile.android.core.internal.LocalFilePlayer.LocalFilePlayerListener() {

            private dur a;

            public final void onMediaPlayerCreated(int i)
            {
                dur.a(a, i);
            }

            public final void onMediaPlayerDestroyed(int i)
            {
                dur.b(a, i);
            }

            
            {
                a = dur.this;
                super();
            }
        };
        d = new com.spotify.mobile.android.core.internal.SoundDriver.SoundDriverListener() {

            private dur a;

            public final void onAudioTrackCreated(int i)
            {
                dur.a(a, i);
            }

            public final void onAudioTrackDestroyed(int i)
            {
                dur.b(a, i);
            }

            public final void onEqualizerShouldBeEnabled(int i)
            {
                if (!a.b)
                {
                    a.a(i);
                }
            }

            
            {
                a = dur.this;
                super();
            }
        };
        e = context;
        b = dkb.a(e).a();
    }

    static void a(dur dur1, int i)
    {
        dur1.a = i;
        if (dur1.b)
        {
            dur1.a(i);
        }
    }

    static void b(dur dur1, int i)
    {
        Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.PACKAGE_NAME", dur1.e.getPackageName());
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        dur1.e.sendBroadcast(intent);
        dur1.a = 0;
    }

    final void a(int i)
    {
        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.PACKAGE_NAME", e.getPackageName());
        intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        e.sendBroadcast(intent);
    }
}
