// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.automotive.NowPlayingData;
import com.spotify.mobile.android.util.LockScreenController;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ekc
    implements ady, aeh, eal, eap
{

    private final eke a;
    private final ebb b;
    private final String c;
    private eaj d;
    private ekg e;
    private MediaService f;
    private aeg g;
    private adx h;
    private ebe i;

    public ekc(ekn ekn1, eke eke1, eak eak, ebb ebb1, String s)
    {
        ctz.a(eak);
        ctz.a(ekn1);
        a = (eke)ctz.a(eke1);
        b = (ebb)ctz.a(ebb1);
        c = (String)ctz.a(s);
    }

    private void a(NowPlayingData nowplayingdata)
    {
        adx adx1 = h;
        ArrayList arraylist = new ArrayList();
        arraylist.add(new ekd(nowplayingdata.d, nowplayingdata.e, nowplayingdata.f));
        if (nowplayingdata.l && nowplayingdata.m != null)
        {
            nowplayingdata = nowplayingdata.m;
            int k = nowplayingdata.length;
            for (int j = 0; j < k; j++)
            {
                PlayerTrack playertrack = nowplayingdata[j];
                arraylist.add(new ekd((String)playertrack.metadata().get("title"), (String)playertrack.metadata().get("artist_name"), (String)playertrack.metadata().get("album_title")));
            }

        }
        adx1.a(arraylist);
    }

    private void g()
    {
        if (f != null && g != null)
        {
            g.a(f.getString(0x7f08061c));
        }
    }

    public final void a()
    {
        a(d.d);
    }

    public final void a(int j)
    {
        fos.a(f, j);
    }

    public final void a(ado ado)
    {
        int j;
        g = (aeg)ado;
        h = (adx)g.a(this);
        Object obj = a;
        ado = f;
        ekh ekh = ((eke) (obj)).a(ado, ((MediaService) (ado)).a, "bmw.car_screen_listener");
        obj = new eaj(ado, new eam(), new ebc(), ((eke) (obj)).a.a(500L));
        e = new ekg(ekh, new eki(ado), ado, ((eaj) (obj)));
        g.a(e);
        d.a();
        i = new ebe(f, "bmw.car_screen_listener");
        f.a.a(new ebi[] {
            i
        });
        j = -1;
        if (!"mini".equalsIgnoreCase(c)) goto _L2; else goto _L1
_L1:
        j = 0x7f020224;
_L4:
        LockScreenController.a(f, "Bmw", j, true);
        ado = new eeo();
        ado.a = c;
        ado.c = "auto";
        f.a(ado.a());
        f.a(new String[] {
            "car", "Bmw"
        });
        b.a(4L, "Bmw", "Bmw");
        return;
_L2:
        if ("bmw".equalsIgnoreCase(c))
        {
            j = 0x7f020222;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(MediaService mediaservice)
    {
        f = mediaservice;
        ekn.a(mediaservice, this);
        d = new eaj(f, new eam(), new ebc());
        d.c = this;
        g();
    }

    public final void a(NowPlayingData nowplayingdata, List list)
    {
        g.a(nowplayingdata.d, nowplayingdata.e, nowplayingdata.f);
        a(nowplayingdata);
    }

    public final void b()
    {
        if (f != null)
        {
            f.f();
        }
        g();
    }

    public final void c()
    {
        if (f != null)
        {
            f.g();
        }
    }

    public final void d()
    {
        if (f != null)
        {
            f.i();
        }
    }

    public final void e()
    {
        if (f != null)
        {
            f.h();
        }
    }

    public final void f()
    {
        LockScreenController.a(f, "Bmw");
        f.b(new String[] {
            "car", "Bmw"
        });
        b.b(4L, "Bmw", "Bmw");
        if (e != null)
        {
            e.d();
        }
        if (d != null)
        {
            d.c = null;
            d.b();
        }
        if (f != null)
        {
            f.a.b(new ebi[] {
                i
            });
        }
        ekn.a();
    }
}
