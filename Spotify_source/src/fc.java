// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;

final class fc
    implements ez
{

    private er a;
    private fe b;

    public fc(android.support.v4.media.session.MediaSessionCompat.Token token)
    {
        a = es.a((IBinder)token.a);
    }

    public final fe a()
    {
        if (b == null)
        {
            b = new fh(a);
        }
        return b;
    }

    public final void a(ev ev1)
    {
        if (ev1 == null)
        {
            throw new IllegalArgumentException("callback may not be null.");
        }
        try
        {
            a.b((eo)ev.c(ev1));
            a.asBinder().unlinkToDeath(ev1, 0);
            ev.a(ev1, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ev ev1)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in unregisterCallback. ")).append(ev1).toString());
        }
    }

    public final void a(ev ev1, Handler handler)
    {
        if (ev1 == null)
        {
            throw new IllegalArgumentException("callback may not be null.");
        }
        try
        {
            a.asBinder().linkToDeath(ev1, 0);
            a.a((eo)ev.c(ev1));
            ev.a(ev1, handler);
            ev.a(ev1, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in registerCallback. ")).append(handler).toString());
        }
        ev1.a();
    }

    public final PlaybackStateCompat b()
    {
        PlaybackStateCompat playbackstatecompat;
        try
        {
            playbackstatecompat = a.o();
        }
        catch (RemoteException remoteexception)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in getPlaybackState. ")).append(remoteexception).toString());
            return null;
        }
        return playbackstatecompat;
    }

    public final MediaMetadataCompat c()
    {
        MediaMetadataCompat mediametadatacompat;
        try
        {
            mediametadatacompat = a.n();
        }
        catch (RemoteException remoteexception)
        {
            Log.e("MediaControllerCompat", (new StringBuilder("Dead object in getMetadata. ")).append(remoteexception).toString());
            return null;
        }
        return mediametadatacompat;
    }
}
