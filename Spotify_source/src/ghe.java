// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

public final class ghe
    implements ghf
{

    private RemoteControlClient a;
    private final AudioManager b;

    public ghe(Context context, PendingIntent pendingintent, Looper looper)
    {
        b = (AudioManager)context.getSystemService("audio");
        a = new RemoteControlClient(pendingintent, looper);
        a.setTransportControlFlags(137);
        ws.a(context);
    }

    public final void a()
    {
        b.registerRemoteControlClient(a);
        if (gcl.j)
        {
            ecl.a(a.getMediaSession());
        }
    }

    public final void a(MediaMetadataCompat mediametadatacompat)
    {
        android.media.RemoteControlClient.MetadataEditor metadataeditor = a.editMetadata(true);
        metadataeditor.putBitmap(100, mediametadatacompat.e("android.media.metadata.ALBUM_ART"));
        metadataeditor.putString(7, mediametadatacompat.b("android.media.metadata.TITLE"));
        metadataeditor.putString(1, mediametadatacompat.b("android.media.metadata.ALBUM"));
        metadataeditor.putString(2, mediametadatacompat.b("android.media.metadata.ARTIST"));
        metadataeditor.putString(13, mediametadatacompat.b("android.media.metadata.ALBUM_ARTIST"));
        metadataeditor.putLong(9, mediametadatacompat.c("android.media.metadata.DURATION"));
        metadataeditor.apply();
    }

    public final void a(PlaybackStateCompat playbackstatecompat)
    {
        char c1 = '\0';
        byte byte0;
        boolean flag;
        if ((playbackstatecompat.d() & 512L) == 512L)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        if ((playbackstatecompat.d() & 16L) == 16L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((playbackstatecompat.d() & 32L) == 32L)
        {
            c1 = '\200';
        }
        a.setTransportControlFlags(flag | (byte0 | 0) | c1);
        if (gcl.h)
        {
            a.setPlaybackState(playbackstatecompat.a(), playbackstatecompat.b(), playbackstatecompat.c());
            return;
        } else
        {
            a.setPlaybackState(playbackstatecompat.a());
            return;
        }
    }

    public final void b()
    {
        b.unregisterRemoteControlClient(a);
    }

    public final boolean c()
    {
        return true;
    }

    public final void d()
    {
    }

    public final void e()
    {
        ws.b(a);
    }

    public final void f()
    {
        ws.a(a);
    }
}
