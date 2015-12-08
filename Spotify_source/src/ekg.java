// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.automotive.NowPlayingData;
import com.spotify.mobile.android.util.logging.Logger;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class ekg
    implements ahi, eal, ekk
{

    public ahe a;
    private final eaj b;
    private final ekh c;
    private final eki d;
    private final MediaService e;
    private final ekj f = new ekj(new Handler());
    private eko g;
    private ekf h;
    private ecd i;

    public ekg(ekh ekh, eki eki, MediaService mediaservice, eaj eaj1)
    {
        i = new ecd();
        c = ekh;
        d = eki;
        e = mediaservice;
        b = eaj1;
    }

    private static String a(long l)
    {
        long l1 = TimeUnit.MILLISECONDS.toMinutes(l);
        l = TimeUnit.MILLISECONDS.toSeconds(l);
        long l2 = TimeUnit.MINUTES.toSeconds(l1);
        return String.format(Locale.getDefault(), "%02d:%02d", new Object[] {
            Long.valueOf(l1), Long.valueOf(l - l2)
        });
    }

    public final void a()
    {
        if (a == null)
        {
            Logger.a("onEnterCalled before onCreate", new Object[0]);
            return;
        } else
        {
            f.d = this;
            ekj ekj1 = f;
            ekj1.e = true;
            ekj1.a();
            b.a();
            return;
        }
    }

    public final void a(int j)
    {
        Object obj = a.a(j);
        if (((ahx) (obj)).c() != null)
        {
            obj = (MediaAction)((ahx) (obj)).c();
            e.a(((MediaAction) (obj)).name());
            return;
        } else
        {
            Logger.c("No data in toolbar action", new Object[0]);
            return;
        }
    }

    public final void a(long l, long l1)
    {
        a.f().a(a(l));
        a.g().a(a(l1));
        if (l1 > 0L)
        {
            int j = Math.max(0, Math.min(100, (int)((100D * (double)l) / (double)l1)));
            a.e().a(j);
            a.e().a(true);
            return;
        } else
        {
            a.e().a(false);
            return;
        }
    }

    public final void a(adl adl)
    {
        a = (ahe)adl;
        a.a(e.getString(0x7f08061c));
        h = new ekf(e, a);
        b.c = this;
        b.a = true;
        b.b = true;
        h.d.a(d);
        h.e.a(c);
    }

    public final void a(NowPlayingData nowplayingdata, List list)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!i.a(nowplayingdata)) goto _L4; else goto _L3
_L3:
        if (nowplayingdata.c)
        {
            a.c().a("");
            a.a().a(nowplayingdata.a);
            a.b().a(nowplayingdata.b);
            a.d().a(false);
        } else
        {
            a.b().a(nowplayingdata.f);
            a.a().a(nowplayingdata.e);
            a.c().a(nowplayingdata.d);
            obj = nowplayingdata.g;
            if (g != null)
            {
                g.c = true;
            }
            g = new eko(this, Uri.parse(((String) (obj))));
            obj = g;
            ((eko) (obj)).a.a().a(((eko) (obj)).b).b(320, 320).a(((gwi) (obj)));
        }
        if (!nowplayingdata.b()) goto _L6; else goto _L5
_L5:
        f.c = 1.0D;
        ekj ekj1 = f;
        long l = nowplayingdata.i;
        if (Math.abs(l - ekj1.b) > 2000L)
        {
            ekj1.b = l;
        }
        f.g = nowplayingdata.h;
_L4:
        Object obj = h;
        boolean flag = nowplayingdata.l;
        if (((ekf) (obj)).c.a(list))
        {
            nowplayingdata = ((ekf) (obj)).b.a(0);
            nowplayingdata.b(flag);
            nowplayingdata.c(flag);
            nowplayingdata = ((ekf) (obj)).b.a(3);
            if (list.contains(MediaAction.k))
            {
                nowplayingdata.b(true);
                nowplayingdata.c(true);
            } else
            {
                nowplayingdata.b(false);
                nowplayingdata.c(false);
            }
            nowplayingdata = ((ekf) (obj)).b.a(2);
            if (list.contains(MediaAction.l))
            {
                nowplayingdata.a(1002);
                nowplayingdata.a(MediaAction.l);
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800d2));
                nowplayingdata.b(true);
                nowplayingdata.c(true);
            } else
            if (list.contains(MediaAction.m))
            {
                nowplayingdata.a(1003);
                nowplayingdata.a(MediaAction.m);
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800dc));
                nowplayingdata.b(true);
                nowplayingdata.c(true);
            } else
            {
                nowplayingdata.b(false);
                nowplayingdata.c(false);
            }
            nowplayingdata = ((ekf) (obj)).b.a(4);
            if (list.contains(MediaAction.g))
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800d7));
                nowplayingdata.a(1004);
                nowplayingdata.a(MediaAction.g);
                nowplayingdata.c(true);
                nowplayingdata.b(true);
            } else
            if (list.contains(MediaAction.h))
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800d7));
                nowplayingdata.a(1005);
                nowplayingdata.a(MediaAction.h);
                nowplayingdata.c(true);
                nowplayingdata.b(true);
            } else
            if (list.contains(MediaAction.e))
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800db));
                nowplayingdata.a(1014);
                nowplayingdata.a(MediaAction.e);
                nowplayingdata.c(true);
                nowplayingdata.b(true);
            } else
            if (list.contains(MediaAction.f))
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800da));
                nowplayingdata.a(1013);
                nowplayingdata.a(MediaAction.f);
                nowplayingdata.c(true);
                nowplayingdata.b(true);
            } else
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800db));
                nowplayingdata.a(1013);
                nowplayingdata.a(MediaAction.f);
                nowplayingdata.c(false);
                nowplayingdata.b(false);
            }
            nowplayingdata = ((ekf) (obj)).b.a(5);
            if (list.contains(MediaAction.i))
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800d6));
                nowplayingdata.a(1006);
                nowplayingdata.a(MediaAction.i);
                nowplayingdata.b(true);
                nowplayingdata.c(true);
            } else
            if (list.contains(MediaAction.n))
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800d8));
                nowplayingdata.a(1015);
                nowplayingdata.a(MediaAction.n);
                nowplayingdata.b(true);
                nowplayingdata.c(true);
            } else
            if (list.contains(MediaAction.o))
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800d9));
                nowplayingdata.a(1007);
                nowplayingdata.a(MediaAction.o);
                nowplayingdata.b(true);
                nowplayingdata.c(true);
            } else
            if (list.contains(MediaAction.p))
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800d8));
                nowplayingdata.a(1008);
                nowplayingdata.a(MediaAction.n);
                nowplayingdata.b(true);
                nowplayingdata.c(true);
            } else
            {
                nowplayingdata.a(((ekf) (obj)).a.getString(0x7f0800d8));
                nowplayingdata.a(1015);
                nowplayingdata.b(false);
                nowplayingdata.c(false);
            }
            nowplayingdata = ((ekf) (obj)).b.a(6);
            if (list.contains(MediaAction.d))
            {
                nowplayingdata.b(true);
                nowplayingdata.c(true);
            } else
            {
                nowplayingdata.b(false);
                nowplayingdata.c(false);
            }
            nowplayingdata = ((ekf) (obj)).b.a(7);
            if (list.contains(MediaAction.c))
            {
                nowplayingdata.b(true);
                nowplayingdata.c(true);
                return;
            } else
            {
                nowplayingdata.b(false);
                nowplayingdata.c(false);
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
        f.c = 0.0D;
        if (com.spotify.mobile.android.service.media.automotive.NowPlayingData.PlaybackState.c.equals(nowplayingdata.j))
        {
            a(0L, 0L);
        }
          goto _L4
    }

    public final void b()
    {
        d();
    }

    public final void c()
    {
        d();
    }

    public final void d()
    {
        ekj ekj1 = f;
        ekj1.e = false;
        ekj1.a.removeCallbacks(ekj1.f);
        f.d = null;
        b.b();
    }
}
