// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;

public final class fch
    implements android.view.View.OnClickListener, eqf, fbo, fcl
{

    private final Player a;
    private final eqi b;
    private final fbb c;
    private fci d;
    private fco e;
    private ImageButton f;
    private ImageButton g;
    private ImageButton h;
    private ImageButton i;
    private ImageButton j;
    private TextView k;
    private View l;

    public fch(Player player, fbb fbb1, eqi eqi)
    {
        a = player;
        c = fbb1;
        b = eqi;
    }

    static ImageButton a(fch fch1)
    {
        return fch1.g;
    }

    private dfz a(ColorStateList colorstatelist, SpotifyIcon spotifyicon)
    {
        spotifyicon = new dfz(l.getContext(), spotifyicon);
        spotifyicon.a(colorstatelist);
        return spotifyicon;
    }

    static ImageButton b(fch fch1)
    {
        return fch1.f;
    }

    static fco c(fch fch1)
    {
        return fch1.e;
    }

    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver G_()
    {
        return d;
    }

    public final void a(int i1)
    {
        k.setText(String.valueOf(i1));
    }

    public final void a(long l1)
    {
    }

    public final void a(long l1, long l2, float f1)
    {
    }

    public final void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        l = layoutinflater.inflate(0x7f030111, viewgroup, false);
        viewgroup.addView(l);
        f = (ImageButton)l.findViewById(0x7f110487);
        g = (ImageButton)l.findViewById(0x7f110488);
        h = (ImageButton)l.findViewById(0x7f110484);
        i = (ImageButton)l.findViewById(0x7f110485);
        j = (ImageButton)l.findViewById(0x7f110486);
        k = (TextView)l.findViewById(0x7f11040f);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        layoutinflater = l.getContext();
        i.setImageDrawable(fyd.a(layoutinflater, 60, 1));
        h.setImageDrawable(fyd.a(layoutinflater));
        j.setImageDrawable(fyd.c(layoutinflater));
        layoutinflater = gcg.c(l.getContext(), 0x7f0f015e);
        f.setImageDrawable(a(((ColorStateList) (layoutinflater)), SpotifyIcon.bf));
        g.setImageDrawable(a(((ColorStateList) (layoutinflater)), SpotifyIcon.bh));
        layoutinflater = new android.view.View.OnTouchListener() {

            private fch a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag1;
                if (view == fch.a(a))
                {
                    flag1 = true;
                } else
                if (view == fch.b(a))
                {
                    flag1 = false;
                } else
                {
                    Assertion.b("Touch listener not attached to tempo up/down button");
                    return false;
                }
                switch (motionevent.getAction())
                {
                default:
                    return false;

                case 0: // '\0'
                    fch.c(a).a(flag1, true);
                    return true;

                case 1: // '\001'
                    fch.c(a).a(flag1, false);
                    break;
                }
                return true;
            }

            
            {
                a = fch.this;
                super();
            }
        };
        g.setOnTouchListener(layoutinflater);
        f.setOnTouchListener(layoutinflater);
        layoutinflater = new fdy();
        new fcj();
        viewgroup = l.getContext();
        Object obj = a;
        fbb fbb1 = c;
        eqe eqe1 = eqe.a(((Player) (obj)), this, b);
        obj = ((Player) (obj)).getLastPlayerState();
        ctz.a(obj);
        obj = ((PlayerState) (obj)).entityUri();
        boolean flag;
        if ((new SpotifyLink(((String) (obj)))).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aF)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "EntityUri is not running link [%s]", new Object[] {
            obj
        });
        layoutinflater.a(fds.a(((String) (obj))), true);
        d = new fci(fbb1, this, eqe1, layoutinflater, new few(viewgroup, ((String) (obj)), null), new fec(viewgroup));
        e = new fck(d, layoutinflater);
    }

    public final void a(ViewGroup viewgroup)
    {
        viewgroup.removeView(l);
        viewgroup = d;
        ((fci) (viewgroup)).b.b();
        viewgroup.c = null;
        viewgroup.d = null;
        d = null;
        e.a();
        e = null;
    }

    public final void a(Flags flags)
    {
    }

    public final void a_(boolean flag)
    {
        android.graphics.drawable.Drawable drawable;
        int i1;
        if (flag)
        {
            drawable = fyd.a(l.getContext(), 60, 1);
            i1 = 0x7f0803ec;
        } else
        {
            drawable = fyd.b(l.getContext(), 60, 1);
            i1 = 0x7f0803eb;
        }
        i.setImageDrawable(drawable);
        i.setContentDescription(l.getContext().getString(i1));
    }

    public final eda b()
    {
        return d;
    }

    public final void b_(boolean flag)
    {
        i.setEnabled(flag);
    }

    public final Context c()
    {
        return l.getContext();
    }

    public final void c(boolean flag)
    {
        android.graphics.drawable.Drawable drawable;
        if (flag)
        {
            drawable = fyd.a(l.getContext());
        } else
        {
            drawable = fyd.b(l.getContext());
        }
        h.setImageDrawable(drawable);
    }

    public final void d(boolean flag)
    {
        android.graphics.drawable.Drawable drawable;
        if (flag)
        {
            drawable = fyd.c(l.getContext());
        } else
        {
            drawable = fyd.d(l.getContext());
        }
        j.setImageDrawable(drawable);
    }

    public final void e(boolean flag)
    {
    }

    public final void f(boolean flag)
    {
    }

    public final void g()
    {
    }

    public final void g(boolean flag)
    {
        g.setEnabled(flag);
    }

    public final void h(boolean flag)
    {
        f.setEnabled(flag);
    }

    public final void onClick(View view)
    {
        if (view == h)
        {
            view = d;
            ((fci) (view)).a.b();
            ((fci) (view)).c.a(false);
        } else
        {
            if (view == i)
            {
                view = d;
                ((fci) (view)).a.a();
                ((fci) (view)).c.b();
                return;
            }
            if (view == j)
            {
                view = d;
                ((fci) (view)).a.c();
                ((fci) (view)).c.a();
                return;
            }
        }
    }
}
