// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.widget.carousel.CarouselView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.List;

public final class eqb
{

    public Flags a;
    final CarouselView b;
    final eqc c;
    int d;
    Runnable e;
    private final eqg f;

    public eqb(Flags flags, CarouselView carouselview, eqc eqc1)
    {
        e = new Runnable() {

            private eqb a;

            public final void run()
            {
                a.b.b(false);
            }

            
            {
                a = eqb.this;
                super();
            }
        };
        a = flags;
        c = (eqc)ctz.a(eqc1);
        b = (CarouselView)ctz.a(carouselview);
        ctz.a(carouselview.c() instanceof eqg, "Carousel must have a PlayerTracksCarouselAdapter.");
        f = (eqg)carouselview.c();
        b.a(new dhj() {

            private eqb a;

            public final void a(int i)
            {
                a.b.removeCallbacks(a.e);
                a.b.b(true);
                a.b.postDelayed(a.e, 200L);
                if (i <= a.d) goto _L2; else goto _L1
_L1:
                a.c.a();
_L4:
                a.d = i;
                return;
_L2:
                if (i < a.d)
                {
                    a.c.b();
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = eqb.this;
                super();
            }
        });
    }

    public final void a(PlayerTrack aplayertrack[], PlayerTrack playertrack, PlayerTrack aplayertrack1[])
    {
        int i;
        int j;
        boolean flag;
        if (aplayertrack != null)
        {
            i = aplayertrack.length;
        } else
        {
            i = 0;
        }
        flag = f.c.isEmpty();
        j = f.a(aplayertrack, playertrack, aplayertrack1);
        if (j == 0 && d == i)
        {
            return;
        }
        eqd.a(a, new PlayerTrack[] {
            playertrack
        });
        eqd.a(a, aplayertrack1);
        eqd.a(a, aplayertrack);
        d = i;
        if (flag || j == 2)
        {
            b.a(i);
            d = i;
            return;
        } else
        {
            b.post(new Runnable() {

                private eqb a;

                public final void run()
                {
                    a.b.b(a.d);
                }

            
            {
                a = eqb.this;
                super();
            }
            });
            return;
        }
    }
}
