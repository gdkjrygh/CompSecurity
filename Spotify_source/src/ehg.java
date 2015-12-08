// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.session.SessionState;

public final class ehg extends ehi
    implements eax
{

    private com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Status b;

    public ehg(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
    }

    protected final void a()
    {
        a.a(this);
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final void a(SessionState sessionstate)
    {
        MediaService mediaservice = a;
        if (sessionstate.e)
        {
            sessionstate = com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Status.OK;
        } else
        {
            sessionstate = com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Status.createNotLoggedIn(mediaservice);
        }
        if (b == null || !b.equals(sessionstate))
        {
            a(sessionstate);
        }
        b = sessionstate;
    }

    public final void b()
    {
        Optional optional = a.b();
        if (optional.b())
        {
            a((SessionState)optional.c());
            return;
        } else
        {
            a(com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Status.createNotLoggedIn(a));
            return;
        }
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }
}
