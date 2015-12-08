// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.session.MediaController;
import android.os.Handler;
import android.os.RemoteException;

public class gp
    implements go, mau
{

    public final Object a;

    public gp()
    {
    }

    public gp(Context context, gz gz1)
    {
        a = b.a(context, gz1.a().a);
    }

    public gp(Context context, hq hq1)
    {
        a = b.a(context, hq1.a);
        if (a == null)
        {
            throw new RemoteException();
        } else
        {
            return;
        }
    }

    public gt a()
    {
        android.media.session.MediaController.TransportControls transportcontrols = ((MediaController)a).getTransportControls();
        if (transportcontrols != null)
        {
            return new gu(transportcontrols);
        } else
        {
            return null;
        }
    }

    public lzx a(jyw jyw)
    {
        return new lxs((j)jyw);
    }

    public final void a(gk gk1)
    {
        Object obj = a;
        gk1 = ((gk) (gk.c(gk1)));
        ((MediaController)obj).unregisterCallback((android.media.session.MediaController.Callback)gk1);
    }

    public final void a(gk gk1, Handler handler)
    {
        Object obj = a;
        gk1 = ((gk) (gk.c(gk1)));
        ((MediaController)obj).registerCallback((android.media.session.MediaController.Callback)gk1, handler);
    }

    public final ib b()
    {
        android.media.session.PlaybackState playbackstate = ((MediaController)a).getPlaybackState();
        if (playbackstate != null)
        {
            return ib.a(playbackstate);
        } else
        {
            return null;
        }
    }

    public final fw c()
    {
        android.media.MediaMetadata mediametadata = ((MediaController)a).getMetadata();
        if (mediametadata != null)
        {
            return fw.a(mediametadata);
        } else
        {
            return null;
        }
    }
}
