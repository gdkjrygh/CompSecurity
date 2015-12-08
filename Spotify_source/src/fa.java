// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.session.MediaController;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;

class fa
    implements ez
{

    protected final Object a;

    public fa(Context context, android.support.v4.media.session.MediaSessionCompat.Token token)
    {
        a = fi.a(context, token.a);
        if (a == null)
        {
            throw new RemoteException();
        } else
        {
            return;
        }
    }

    public fa(Context context, MediaSessionCompat mediasessioncompat)
    {
        a = fi.a(context, mediasessioncompat.d().a);
    }

    public fe a()
    {
        android.media.session.MediaController.TransportControls transportcontrols = ((MediaController)a).getTransportControls();
        if (transportcontrols != null)
        {
            return new ff(transportcontrols);
        } else
        {
            return null;
        }
    }

    public final void a(ev ev1)
    {
        Object obj = a;
        ev1 = ((ev) (ev.c(ev1)));
        ((MediaController)obj).unregisterCallback((android.media.session.MediaController.Callback)ev1);
    }

    public final void a(ev ev1, Handler handler)
    {
        Object obj = a;
        ev1 = ((ev) (ev.c(ev1)));
        ((MediaController)obj).registerCallback((android.media.session.MediaController.Callback)ev1, handler);
    }

    public final PlaybackStateCompat b()
    {
        android.media.session.PlaybackState playbackstate = ((MediaController)a).getPlaybackState();
        if (playbackstate != null)
        {
            return PlaybackStateCompat.a(playbackstate);
        } else
        {
            return null;
        }
    }

    public final MediaMetadataCompat c()
    {
        android.media.MediaMetadata mediametadata = ((MediaController)a).getMetadata();
        if (mediametadata != null)
        {
            return MediaMetadataCompat.a(mediametadata);
        } else
        {
            return null;
        }
    }
}
