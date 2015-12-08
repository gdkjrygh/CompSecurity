// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.FeaturedAction;
import com.spotify.mobile.android.spotlets.player.views.MarqueeTextView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Map;

public final class fbw
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, eda, fbo, fbq
{

    FeaturedAction a;
    PlayerTrack b;
    private View c;
    private fae d;
    private final fbp e;
    private final ezh f;
    private Flags g;
    private LinearLayout h;
    private Button i;
    private Button j;
    private Button k;
    private MarqueeTextView l;
    private MarqueeTextView m;
    private android.view.View.OnClickListener n;

    public fbw(fae fae, fbp fbp1, ezh ezh1, Flags flags)
    {
        n = new android.view.View.OnClickListener() {

            private fbw a;

            public final void onClick(View view)
            {
                Object obj = a;
                view = view.getContext();
                if (((fbw) (obj)).a != null && ((fbw) (obj)).a.j())
                {
                    ((fbw) (obj)).a.k();
                } else
                if (((fbw) (obj)).b != null)
                {
                    obj = (String)((fbw) (obj)).b.metadata().get("click_url");
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        dmz.a(edp);
                        edp.b(view, Uri.parse(((String) (obj))));
                        return;
                    }
                }
            }

            
            {
                a = fbw.this;
                super();
            }
        };
        d = fae;
        e = fbp1;
        f = ezh1;
        g = flags;
    }

    static fae a(fbw fbw1)
    {
        return fbw1.d;
    }

    static Button b(fbw fbw1)
    {
        return fbw1.k;
    }

    private void c()
    {
        if (k != null)
        {
            h.removeView(k);
            k = null;
        }
        if (a == null || a.i() == com.spotify.mobile.android.spotlets.ads.FeaturedAction.Type.a)
        {
            i.setVisibility(8);
            j.setVisibility(8);
            if (b != null)
            {
                l.a((String)b.metadata().get("title"));
                l.setVisibility(0);
                m.a((String)b.metadata().get("advertiser"));
                m.setVisibility(0);
            } else
            {
                l.setVisibility(8);
                m.setVisibility(8);
            }
        } else
        {
label0:
            {
                if (!a.b())
                {
                    break label0;
                }
                j.setVisibility(8);
                i.setText(a.a(c.getContext()));
                i.setVisibility(0);
                l.setVisibility(8);
                m.setVisibility(8);
            }
        }
          goto _L1
        if (!a.c()) goto _L3; else goto _L2
_L2:
        i.setVisibility(8);
        j.setText(a.a(c.getContext()));
        j.setVisibility(0);
        l.setVisibility(8);
        m.setVisibility(8);
          goto _L1
_L3:
        if (!a.d()) goto _L1; else goto _L4
_L4:
        i.setVisibility(8);
        j.setVisibility(8);
        l.setVisibility(8);
        m.setVisibility(8);
        if (k != null) goto _L1; else goto _L5
_L5:
        k = a.a(c.getContext(), h);
        h.addView(k);
        a.a(new eea() {

            private fbw a;

            public final void a()
            {
                if (a.a != null)
                {
                    fbw.a(a).a(a.a.h());
                }
            }

            
            {
                a = fbw.this;
                super();
            }
        });
_L1:
        if (fdo.a(g) || a == null || a.i() != com.spotify.mobile.android.spotlets.ads.FeaturedAction.Type.b || fdo.a(g))
        {
            return;
        } else
        {
            f.a(a.h(), new eol() {

                private fbw a;

                public final void a(String s)
                {
                }

                public final void a(String s, boolean flag)
                {
                    if (a.a == null || a.a.h() == null || !cty.a(s, a.a.h()))
                    {
                        return;
                    }
                    s = fbw.b(a);
                    if (!flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    s.setEnabled(flag);
                }

            
            {
                a = fbw.this;
                super();
            }
            });
            return;
        }
    }

    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver G_()
    {
        return this;
    }

    public final void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        c = layoutinflater.inflate(0x7f03003b, viewgroup, false);
        h = (LinearLayout)c.findViewById(0x7f1102b1);
        l = (MarqueeTextView)c.findViewById(0x7f11026e);
        l.setOnClickListener(n);
        m = (MarqueeTextView)c.findViewById(0x7f1102a3);
        m.setOnClickListener(n);
        i = (Button)c.findViewById(0x7f1102ea);
        i.setOnClickListener(n);
        j = (Button)c.findViewById(0x7f1102e9);
        j.setOnClickListener(n);
        viewgroup.addView(c);
        e.a(this);
    }

    public final void a(ViewGroup viewgroup)
    {
        viewgroup.removeView(c);
        e.b(this);
    }

    public final void a(SessionState sessionstate)
    {
    }

    public final void a(FeaturedAction featuredaction)
    {
        a = featuredaction;
        c();
    }

    public final void a(Flags flags)
    {
        g = flags;
    }

    public final eda b()
    {
        return this;
    }

    public final void f(boolean flag)
    {
        if (flag)
        {
            k.setEnabled(false);
            return;
        } else
        {
            k.setEnabled(true);
            return;
        }
    }

    public final void g()
    {
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        b = playerstate.track();
        c();
    }
}
