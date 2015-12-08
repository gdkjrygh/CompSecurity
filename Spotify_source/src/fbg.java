// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.widget.TouchFilteringFrameLayout;
import com.spotify.android.paste.widget.carousel.CarouselLayoutManager;
import com.spotify.android.paste.widget.carousel.CarouselView;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Set;

public class fbg
    implements android.view.View.OnClickListener, fbo
{

    CarouselLayoutManager a;
    dhn b;
    boolean c;
    boolean d;
    eqb e;
    private Flags f;
    private fbh g;
    private ezn h;
    private View i;
    private CarouselView j;
    private fau k;
    private boolean l;

    public fbg(fae fae, ezn ezn, Player player, eqi eqi)
    {
        g = a(fae, player, eqi);
        h = ezn;
    }

    static fbh a(fbg fbg1)
    {
        return fbg1.g;
    }

    private void a(int i1)
    {
        Object obj = j.c(i1);
        if (obj instanceof faw)
        {
            obj = (faw)obj;
            ((faw) (obj)).k.setVisibility(4);
            ((faw) (obj)).l.setVisibility(0);
        }
    }

    static void a(fbg fbg1, int i1, int j1)
    {
        if (fbg1.a.i())
        {
            if (i1 < j1 && fbg1.d)
            {
                fbg1.a(j1);
            } else
            if (i1 > j1 && fbg1.c)
            {
                fbg1.a(j1);
                return;
            }
        }
    }

    static boolean a(fbg fbg1, boolean flag)
    {
        fbg1.l = flag;
        return flag;
    }

    static CarouselView b(fbg fbg1)
    {
        return fbg1.j;
    }

    static boolean c(fbg fbg1)
    {
        return fbg1.l;
    }

    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver G_()
    {
        return g;
    }

    public fbh a(fae fae, Player player, eqi eqi)
    {
        return new fbh(this, fae, player, eqi);
    }

    public final void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        i = layoutinflater.inflate(0x7f03010e, viewgroup, false);
        viewgroup.addView(i);
        ((TouchFilteringFrameLayout)i.findViewById(0x7f1103c5)).a(new dgy(viewgroup) {

            private ViewGroup a;

            public final boolean a(MotionEvent motionevent, int i1)
            {
                int j1 = a.getResources().getDimensionPixelSize(0x7f0c001b);
                return motionevent.getX(i1) < (float)j1;
            }

            
            {
                a = viewgroup;
                super();
            }
        });
        j = (CarouselView)i.findViewById(0x7f11047e);
        k = new fau(g, h, f);
        k.a();
        j.a(k);
        a = new CarouselLayoutManager(com.spotify.android.paste.widget.carousel.CarouselLayoutManager.MeasureMode.a);
        if (i.getContext().getResources().getConfiguration().orientation == 1)
        {
            layoutinflater = a;
            viewgroup = new dhn(i.getContext());
            b = viewgroup;
            layoutinflater.a(viewgroup);
        } else
        {
            layoutinflater = a;
            viewgroup = new dhp(i.getContext());
            b = viewgroup;
            layoutinflater.a(viewgroup);
            a.b();
        }
        j.a(a);
        j.a(new dhk());
        e = new eqb(f, j, new eqc() {

            private fbg a;

            public final void a()
            {
                fae fae1 = fbg.a(a).b;
                PlayerState playerstate = fae1.d.getLastPlayerState();
                if (playerstate != null && playerstate.restrictions().disallowSkippingNextReasons().isEmpty())
                {
                    fae1.d.skipToNextTrack();
                    fae1.l.o();
                    fae1.a(playerstate);
                }
            }

            public final void b()
            {
                fae fae1 = fbg.a(a).b;
                PlayerState playerstate = fae1.d.getLastPlayerState();
                if (playerstate != null && playerstate.restrictions().disallowSkippingPrevReasons().isEmpty())
                {
                    fae1.d.skipToPreviousTrack();
                    fae1.l.n();
                    fae1.a(playerstate);
                }
            }

            
            {
                a = fbg.this;
                super();
            }
        });
        j.a(new dhj() {

            private fbg a;

            public final void a(int i1, int j1)
            {
                fbg.a(a, true);
                fbg.a(a, i1, j1);
            }

            public final void b(int i1)
            {
                abo abo = fbg.b(a).c(i1);
                if (abo instanceof faw)
                {
                    ((faw)abo).x();
                    if (!fbg.c(a))
                    {
                        fbh fbh1 = fbg.a(a);
                        Object obj = fbh1.a.getLastPlayerState();
                        if (obj != null)
                        {
                            obj = ((PlayerState) (obj)).restrictions().disallowSkippingNextReasons();
                            if (!((Set) (obj)).isEmpty() && ((Set) (obj)).contains("mft_disallow") && fbh1.c != null)
                            {
                                fbh1.c.b();
                            }
                        }
                    }
                }
                fbg.a(a, false);
            }

            
            {
                a = fbg.this;
                super();
            }
        });
    }

    public final void a(ViewGroup viewgroup)
    {
        viewgroup.removeView(i);
    }

    public final void a(Flags flags)
    {
        f = flags;
        e.a = flags;
        fau fau1 = k;
        fau1.d = flags;
        fau1.c();
    }

    public final eda b()
    {
        return g;
    }

    public final void f(boolean flag)
    {
    }

    public void g()
    {
        k.c();
    }

    public void onClick(View view)
    {
    }
}
