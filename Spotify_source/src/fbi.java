// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SleepTimerView;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.player.views.MarqueeTextView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;

public class fbi
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, eda, fan, fbo
{

    final fae a;
    final fbj b;
    ImageButton c;
    private final ezu d;
    private final Player e;
    private final fal f;
    private eef g;
    private View h;
    private MarqueeTextView i;
    private MarqueeTextView j;
    private View k;
    private SleepTimerView l;
    private Context m;
    private Flags n;
    private ImageButton o;
    private String p;
    private ezs q;
    private eeg r;

    public fbi(fae fae, Player player, ezu ezu1, fal fal1, eef eef1, fbj fbj1)
    {
        r = new eeg() {

            private fbi a;

            public final void a(boolean flag)
            {
                boolean flag1 = false;
                Object obj = a;
                int i1;
                if (!flag)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                obj = ((fbi) (obj)).c;
                if (i1 != 0)
                {
                    i1 = ((flag1) ? 1 : 0);
                } else
                {
                    i1 = 4;
                }
                ((ImageButton) (obj)).setVisibility(i1);
            }

            
            {
                a = fbi.this;
                super();
            }
        };
        a = fae;
        e = player;
        d = ezu1;
        f = fal1;
        g = eef1;
        b = (fbj)ctz.a(fbj1);
    }

    private void a(PlayerState playerstate)
    {
        q = d.a(playerstate, p);
        k.setOnClickListener(new android.view.View.OnClickListener() {

            private fbi a;

            public final void onClick(View view)
            {
                view = fbi.d(a);
                ezs ezs1 = fbi.c(a);
                ctz.a(ezs1);
                ctz.a(((fae) (view)).c);
                if (ezs1.a() && !((fae) (view)).o)
                {
                    ((fae) (view)).c.a(ezs1.a);
                }
            }

            
            {
                a = fbi.this;
                super();
            }
        });
        if (q.a())
        {
            i.a(q.a(m), gcg.c(m, 0x7f0f018f));
            j.a(q.b(m), gcg.c(m, 0x7f0f018e));
            return;
        } else
        {
            i.a(q.a(m), gcg.b(m, 0x7f0f00bf));
            j.a(q.b(m), gcg.b(m, 0x7f0f00bf));
            return;
        }
    }

    static void a(fbi fbi1)
    {
        fbi1.b(false);
    }

    static void b(fbi fbi1)
    {
        fbi1.c(false);
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            i.setVisibility(8);
            l.setVisibility(0);
            return;
        } else
        {
            i.setVisibility(0);
            l.setVisibility(8);
            return;
        }
    }

    static ezs c(fbi fbi1)
    {
        return fbi1.q;
    }

    private void c()
    {
        boolean flag;
        boolean flag1;
        if (n != null && ((Boolean)n.a(fys.j)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1);
    }

    private void c(boolean flag)
    {
        if (flag)
        {
            dfz dfz1 = new dfz(m, SpotifyIcon.bq);
            dfz1.a(gcg.c(m, 0x7f0f0161));
            dfz1.a(dft.b(18F, m.getResources()));
            o.setImageDrawable(dfz1);
            return;
        } else
        {
            dfz dfz2 = new dfz(m, SpotifyIcon.I);
            dfz2.a(gcg.c(m, 0x7f0f0156));
            dfz2.a(dft.b(18F, m.getResources()));
            o.setImageDrawable(dfz2);
            return;
        }
    }

    static fae d(fbi fbi1)
    {
        return fbi1.a;
    }

    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver G_()
    {
        return this;
    }

    public final void a()
    {
        l.a();
        b(false);
        c(false);
    }

    public void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        m = viewgroup.getContext();
        f.b = this;
        h = layoutinflater.inflate(0x7f030112, viewgroup, false);
        k = h.findViewById(0x7f11048a);
        i = (MarqueeTextView)h.findViewById(0x7f11048c);
        j = (MarqueeTextView)h.findViewById(0x7f11048d);
        c = (ImageButton)h.findViewById(0x7f110489);
        o = (ImageButton)h.findViewById(0x7f11048b);
        l = (SleepTimerView)h.findViewById(0x7f11048e);
        layoutinflater = m.getResources();
        android.content.res.ColorStateList colorstatelist = gcg.c(m, 0x7f0f0156);
        dfz dfz1 = new dfz(m, SpotifyIcon.k);
        dfz1.a(colorstatelist);
        dfz1.a(dft.b(18F, layoutinflater));
        c.setImageDrawable(dfz1);
        c.setClickable(true);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            private fbi a;

            public final void onClick(View view)
            {
                view = a;
                ((fbi) (view)).b.l();
                ((fbi) (view)).a.b();
            }

            
            {
                a = fbi.this;
                super();
            }
        });
        dfz1 = new dfz(m, SpotifyIcon.I);
        dfz1.a(colorstatelist);
        dfz1.a(dft.b(18F, layoutinflater));
        o.setImageDrawable(dfz1);
        o.setClickable(true);
        o.setOnClickListener(new android.view.View.OnClickListener() {

            private fbi a;

            public final void onClick(View view)
            {
                view = a;
                ((fbi) (view)).b.m();
                view = ((fbi) (view)).a;
                ctz.a(((fae) (view)).c);
                ((fae) (view)).c.G();
            }

            
            {
                a = fbi.this;
                super();
            }
        });
        viewgroup.addView(h);
        g.a(r);
    }

    public final void a(ViewGroup viewgroup)
    {
        g.b(r);
        f.b = null;
        viewgroup.removeView(h);
    }

    public final void a(SessionState sessionstate)
    {
        p = sessionstate.c;
        a(e.getLastPlayerState());
    }

    public final void a(Flags flags)
    {
        n = flags;
        e.getLastPlayerState();
        c();
    }

    public final void a(faq faq1)
    {
        SleepTimerView sleeptimerview = l;
        faq1 = faq1.c();
        Assertion.a(faq.b(faq1), "Timer must be set first. Use isTimerSet() to check.");
        sleeptimerview.a((int)(faq.a(faq1) - SystemClock.elapsedRealtime()) / 1000);
        l.a(new dgq() {

            private fbi a;

            public final void a()
            {
                fbi.a(a);
                fbi.b(a);
            }

            
            {
                a = fbi.this;
                super();
            }
        });
        b(true);
        c(true);
    }

    public void a(boolean flag)
    {
        ImageButton imagebutton = o;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        imagebutton.setVisibility(i1);
    }

    public final eda b()
    {
        return this;
    }

    public final void f(boolean flag)
    {
    }

    public final void g()
    {
    }

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        a(playerstate);
        c();
    }
}
