// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hij
    implements dhz, nus, omb, opt, opu, opv
{

    private ekq a;
    private Context b;
    private grg c;
    private final ay d;
    private nur e;
    private hhx f;

    public hij(am am1, opd opd1)
    {
        d = am1.h();
        opd1.a(this);
    }

    public final void V_()
    {
        e.b(this);
    }

    public final void X_()
    {
        e.a(this);
    }

    public final String a()
    {
        return "OfflineRetryTagSetCover";
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = ((ejz)olm1.a(ejz)).b();
        c = (grg)olm1.a(grg);
        e = (nur)olm1.a(nur);
        f = (hhx)olm1.a(hhx);
        b = context;
    }

    public final void c()
    {
        if (!b.w(b))
        {
            ay ay = d;
            nuq nuq1 = new nuq();
            nuq1.a = nup.B;
            nuq1.c = "OfflineRetryTagSetCover";
            nuq1.e = true;
            nuo.a(ay, nuq1);
            return;
        } else
        {
            hhx hhx1 = f;
            Object obj = c.h;
            ekq ekq = a;
            hhx1.b.b.a(hhx1.a.getString(b.vY), "SetAlbumCoverTask");
            obj = new hia(hhx1.c.d(), ((ekp) (obj)), ekq);
            hhx1.b.a(((mtf) (obj)));
            return;
        }
    }

    public final void c_(Bundle bundle)
    {
        c();
    }
}
