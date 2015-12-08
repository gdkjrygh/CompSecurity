// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.video.VideoSurfaceView;

public final class fax extends fav
    implements dha
{

    View k;
    VideoSurfaceView l;
    private final gkl m = (gkl)dmz.a(gkl);
    private View n;
    private boolean o;

    public fax(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        super(layoutinflater.inflate(0x7f03006b, viewgroup, false));
        l = (VideoSurfaceView)ctz.a(a.findViewById(0x7f1102e6));
        n = (View)ctz.a(a.findViewById(0x7f110331));
        k = (View)ctz.a(a.findViewById(0x7f110332));
    }

    static View a(fax fax1)
    {
        return fax1.n;
    }

    static boolean b(fax fax1)
    {
        fax1.o = true;
        return true;
    }

    private void x()
    {
        l.d = null;
        m.b(l);
        dgz dgz1 = (dgz)a.getTag(0x7f1100e1);
        if (dgz1 != null)
        {
            dgz1.a(null);
        }
    }

    public final void F_()
    {
        m.a();
    }

    public final void a(Object obj, int i)
    {
        obj = (PlayerTrack)obj;
        VideoSurfaceView videosurfaceview;
        long l1;
        boolean flag;
        if (j != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.b(flag, "Flags was not set before calling bindHolder");
        Assertion.a(l);
        l.a(j);
        l.c = new fay(((PlayerTrack) (obj)), this);
        videosurfaceview = l;
        videosurfaceview.i = ((PlayerTrack) (obj));
        if (fbn.a(((PlayerTrack) (obj))))
        {
            l1 = fbn.b(((PlayerTrack) (obj)));
        } else
        {
            l1 = -1L;
        }
        videosurfaceview.j = l1;
        videosurfaceview.b();
        if (o)
        {
            m.a(l);
            o = false;
        }
        ((com.spotify.android.paste.widget.carousel.CarouselLayoutManager.CarouselLayoutParams)a.getLayoutParams()).a(true);
        n.setVisibility(4);
    }

    public final void u()
    {
        l.d = new gkk() {

            private fax a;

            public final void a()
            {
                ggp.c(fax.a(a));
            }

            public final void b()
            {
                fax.a(a).setVisibility(8);
            }

            public final void c()
            {
                ggp.c(fax.a(a));
            }

            public final void d()
            {
                fax.b(a);
            }

            
            {
                a = fax.this;
                super();
            }
        };
        m.a(l);
        dgz dgz1 = (dgz)a.getTag(0x7f1100e1);
        if (dgz1 != null)
        {
            dgz1.a(this);
        }
    }

    public final void v()
    {
        x();
    }

    public final void w()
    {
        x();
    }
}
