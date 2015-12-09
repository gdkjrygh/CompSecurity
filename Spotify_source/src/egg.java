// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.automotive.NowPlayingData;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

final class egg
    implements ego
{

    private egd a;

    private egg(egd egd1)
    {
        a = egd1;
        super();
    }

    egg(egd egd1, byte byte0)
    {
        this(egd1);
    }

    public final void a()
    {
        egd egd1 = a;
        egd1.b.a(egd1.e);
        egd1.a.b(egd1.f);
        egd1.c.a(Boolean.valueOf(false), egd1.a.e(), egd1.a.d());
        egd1.a(com.spotify.mobile.android.spotlets.applink.service.AppLinkStateListener.AppLinkState.b);
    }

    public final void a(egb egb1, boolean flag)
    {
        egd egd1 = a;
        if (egb1 == egd1.n)
        {
            egd1.c();
            egd1.h.a(egd1.h.c, flag, egd1.g.a(), egd1.g.b());
            return;
        }
        if (egb1 == egd1.q)
        {
            egd1.c();
            egd1.h.a(egd1.h.f, flag, egd1.g.d(), egd1.g.e());
            return;
        }
        if (egb1 == egd1.o)
        {
            egd1.c();
            egd1.h.a(egd1.h.d, flag, egd1.g.f(), egd1.g.g());
            return;
        }
        if (egb1 == egd1.p)
        {
            egd1.c();
            egd1.h.a(egd1.h.e, flag, egd1.g.h(), egd1.g.i());
            return;
        }
        if (egb1 == egd1.s)
        {
            egd1.x = flag;
            egd1.b.k();
            return;
        }
        if (egb1 == egd1.m)
        {
            egd1.x = flag;
            egd1.b.j();
            return;
        }
        if (egb1 == egd1.r)
        {
            egd1.b.o();
            egd1.b.d();
            return;
        }
        if (egb1 == egd1.t)
        {
            egd1.b.a(MediaAction.l.name());
            return;
        }
        if (egb1 == egd1.u)
        {
            egd1.d();
            return;
        }
        if (egb1 == egd1.v)
        {
            egd1.b.g();
            egd1.j = false;
            return;
        } else
        {
            Logger.c("An unknown command was selected: %s", new Object[] {
                egb1
            });
            return;
        }
    }

    public final void a(egk egk1, egb egb1, boolean flag)
    {
        egd egd1;
        Object obj;
label0:
        {
            egd1 = a;
            if (egb1 instanceof egm)
            {
                obj = (egm)egb1;
                if (!com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a.equals(((egm) (obj)).f))
                {
                    break label0;
                }
                obj = ((egm) (obj)).e;
                egd1.b.a(Uri.parse(((String) (obj))));
                egk1 = egk1.a;
                egk1 = egb1.a;
                egd1.b();
            }
            return;
        }
        egd1.c();
        egd1.h.a(((egm) (obj)).e, flag, ((egb) (obj)).a, ((egb) (obj)).a);
    }

    public final void a(boolean flag)
    {
        egd egd1 = a;
        egd1.a.a(egd1.f);
        egd1.c.a(Boolean.valueOf(true), egd1.a.e(), egd1.a.d());
        egd1.b.o();
        egd1.a(com.spotify.mobile.android.spotlets.applink.service.AppLinkStateListener.AppLinkState.a);
        if (flag)
        {
            egb egb1 = new egb(egd1.g.a.getString(0x7f0800ac), egd1.g.a.getString(0x7f0800ad));
            egb1.c = 0;
            egd1.m = egb1;
            egb1 = new egb(egd1.g.a.getString(0x7f0800aa), egd1.g.a.getString(0x7f0800ab));
            egb1.c = 0;
            egd1.s = egb1;
            egb1 = new egb(egd1.g.a.getString(0x7f080098), egd1.g.a.getString(0x7f080099));
            egb1.c = 1;
            egd1.n = egb1;
            egb1 = new egb(egd1.g.a.getString(0x7f080094), egd1.g.a.getString(0x7f080095));
            egb1.c = 2;
            egd1.o = egb1;
            egb1 = new egb(egd1.g.a.getString(0x7f080090), egd1.g.a.getString(0x7f080091));
            egb1.c = 3;
            egd1.p = egb1;
            egb1 = new egb(egd1.g.a.getString(0x7f08008c), egd1.g.a.getString(0x7f08008d));
            egb1.c = 4;
            egd1.q = egb1;
            egb1 = new egb(egd1.g.a.getString(0x7f0800a4), egd1.g.a.getString(0x7f0800a5));
            egb1.c = 5;
            egd1.r = egb1;
            egb1 = new egb(null, egd1.g.a.getString(0x7f0800a7));
            egb1.c = 6;
            egd1.t = egb1;
            egb1 = new egb(null, egd1.g.a.getString(0x7f0800a2));
            egb1.c = 7;
            egd1.u = egb1;
            egb1 = new egb(null, egd1.g.a.getString(0x7f0800a3));
            egb1.c = 8;
            egd1.v = egb1;
            egd1.a.a(Arrays.asList(new egb[] {
                egd1.m, egd1.n, egd1.o, egd1.p, egd1.q, egd1.r, egd1.t, egd1.u, egd1.v
            }), egd1.d);
            egd1.a();
            egd1.k = true;
            egd1.h.a(egd1.h.c, egd1.g.a(), egd1.g.b());
            egd1.h.a(egd1.h.f, egd1.g.d(), egd1.g.e());
            egd1.h.a(egd1.h.d, egd1.g.f(), egd1.g.g());
            egd1.h.a(egd1.h.e, egd1.g.h(), egd1.g.i());
        }
        egd1.i.a();
    }

    public final void b()
    {
        a.b();
    }

    public final void b(boolean flag)
    {
        egd egd1 = a;
        NowPlayingData nowplayingdata = egd1.i.d;
        if (flag && egd1.j)
        {
            if (nowplayingdata.a())
            {
                egd1.b.f();
            }
            egd1.j = false;
        } else
        if (!flag)
        {
            if (nowplayingdata.b())
            {
                egd1.j = true;
                egd1.b.g();
                return;
            }
        } else
        {
            long l = nowplayingdata.i;
            l = TimeUnit.MILLISECONDS.toSeconds(l);
            egd1.a.a(l, nowplayingdata.a(), egd1.d);
            return;
        }
    }
}
