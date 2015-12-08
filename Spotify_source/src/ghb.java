// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.spotify.music.internal.receiver.MediaButtonReceiver;

public final class ghb
    implements ghf
{

    final Context a;
    private final MediaSessionCompat b;
    private final fl c = new fl() {

        private ghb b;

        public final void a()
        {
            dmz.a(fos);
            fos.d(b.a);
        }

        public final boolean a(Intent intent)
        {
            intent.getAction();
            intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            MediaButtonReceiver.a(b.a, intent);
            return true;
        }

        public final void b()
        {
            dmz.a(fos);
            fos.e(b.a);
        }

        public final void c()
        {
            dmz.a(fos);
            fos.b(b.a);
        }

        public final void d()
        {
            dmz.a(fos);
            fos.a(b.a);
        }

            
            {
                b = ghb.this;
                super();
            }
    };

    public ghb(Context context, PendingIntent pendingintent)
    {
        a = context;
        context = new ComponentName(a, com/spotify/music/internal/receiver/MediaButtonReceiver);
        b = new MediaSessionCompat(a, "spotify-media-session", context, pendingintent);
        context = b;
        pendingintent = new Bundle();
        pendingintent.putBoolean("android.support.wearable.media.extra.BACKGROUND_COLOR_FROM_THEME", true);
        context.a(pendingintent);
        b.a();
        b.a(c);
        ws.a(a);
    }

    public final void a()
    {
        b.a(true);
    }

    public final void a(MediaMetadataCompat mediametadatacompat)
    {
        b.a(mediametadatacompat);
    }

    public final void a(PlaybackStateCompat playbackstatecompat)
    {
        b.a(playbackstatecompat);
    }

    public final void b()
    {
        b.a(false);
    }

    public final boolean c()
    {
        return b.e() != null;
    }

    public final void d()
    {
        b.c();
    }

    public final void e()
    {
        ws.a(null);
    }

    public final void f()
    {
        ws.a(b);
    }
}
