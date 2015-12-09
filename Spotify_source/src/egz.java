// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

final class egz extends ehi
    implements eau, eav, eaw
{

    private com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData b;

    public egz(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
    }

    public static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData a(MediaService mediaservice)
    {
        new eam();
        java.util.List list = eam.a(mediaservice.c, mediaservice.d, mediaservice.g);
        return com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData.trackDataFor(mediaservice.g, list);
    }

    private void f()
    {
        com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData trackdata = a(a);
        boolean flag;
        if (!trackdata.equals(b))
        {
            b = trackdata;
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(trackdata);
        }
    }

    public final void a()
    {
        a.a(this);
        a.a(this);
        a.a(this);
    }

    public final void a(PlayerState playerstate)
    {
        f();
    }

    public final void a(eaz eaz)
    {
        f();
    }

    public final void a(gpg gpg)
    {
        f();
    }

    public final void b()
    {
        if (a.g == null)
        {
            a(AppProtocol.a);
            return;
        } else
        {
            a(a(a));
            return;
        }
    }
}
