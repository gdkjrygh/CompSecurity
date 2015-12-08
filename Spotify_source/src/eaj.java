// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.automotive.NowPlayingData;
import com.spotify.mobile.android.service.session.SessionState;
import java.util.List;

public final class eaj
    implements eau, eav, eaw, eax
{

    public boolean a;
    public boolean b;
    public eal c;
    public NowPlayingData d;
    public List e;
    private final ech f;
    private final Handler g;
    private MediaService h;

    public eaj(MediaService mediaservice, eam eam1, ebc ebc1)
    {
        this(mediaservice, eam1, ebc1, null);
    }

    public eaj(MediaService mediaservice, eam eam1, ebc ebc1, ech ech1)
    {
        h = (MediaService)ctz.a(mediaservice);
        ctz.a(eam1);
        ctz.a(ebc1);
        g = new Handler();
        f = ech1;
    }

    private void c()
    {
        NowPlayingData nowplayingdata;
        List list;
label0:
        {
            boolean flag1 = true;
            nowplayingdata = ebc.a(h, h.b(), Optional.c(h.g), h.c);
            list = eam.a(h.c, h.d, h.g);
            boolean flag;
            if (!nowplayingdata.equals(d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (list.equals(e))
            {
                flag1 = false;
            }
            if (flag || flag1)
            {
                if (f != null)
                {
                    break label0;
                }
                a(list, nowplayingdata);
            }
            return;
        }
        f.a(new Runnable(list, nowplayingdata) {

            private List a;
            private NowPlayingData b;
            private eaj c;

            public final void run()
            {
                c.a(a, b);
            }

            
            {
                c = eaj.this;
                a = list;
                b = nowplayingdata;
                super();
            }
        });
    }

    public final void a()
    {
        h.a(this);
        h.a(this);
        h.a(this);
        h.a(this);
        Optional optional = h.b();
        d = ebc.a(h, optional, Optional.c(h.g), h.c);
        e = eam.a(h.c, h.d, h.g);
        a(d, e);
        if (optional.b() && a && ((SessionState)optional.c()).e)
        {
            MediaService mediaservice = h;
            boolean flag = b;
            mediaservice.f.fetchState(new com.spotify.mobile.android.service.media.MediaService._cls5(mediaservice, flag), 0, 0);
        }
    }

    public final void a(PlayerState playerstate)
    {
        c();
    }

    final void a(NowPlayingData nowplayingdata, List list)
    {
        if (c != null)
        {
            c.a(nowplayingdata, list);
        }
    }

    public final void a(SessionState sessionstate)
    {
        c();
    }

    public final void a(eaz eaz)
    {
        c();
    }

    public final void a(gpg gpg)
    {
        c();
    }

    final void a(List list, NowPlayingData nowplayingdata)
    {
        g.post(new Runnable(list, nowplayingdata) {

            private List a;
            private NowPlayingData b;
            private eaj c;

            public final void run()
            {
                c.e = a;
                c.d = b;
                c.a(c.d, c.e);
            }

            
            {
                c = eaj.this;
                a = list;
                b = nowplayingdata;
                super();
            }
        });
    }

    public final void b()
    {
        h.a(this);
    }
}
