// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public abstract class fba
    implements android.view.View.OnClickListener, eqf, fbd, fbo
{

    public ImageButton a;
    public ImageButton b;
    public View c;
    private ImageButton d;
    private ImageButton e;
    private ImageButton f;
    private fbc g;

    public fba()
    {
    }

    public final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver G_()
    {
        return g;
    }

    public final void a(long l)
    {
    }

    public final void a(long l, long l1, float f1)
    {
    }

    public void a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        c = layoutinflater.inflate(0x7f030110, viewgroup, false);
        viewgroup.addView(c);
        a = (ImageButton)c.findViewById(0x7f110487);
        b = (ImageButton)c.findViewById(0x7f110488);
        d = (ImageButton)c.findViewById(0x7f110484);
        e = (ImageButton)c.findViewById(0x7f110485);
        f = (ImageButton)c.findViewById(0x7f110486);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        e.setImageDrawable(fyd.a(c.getContext(), 60, 1));
        d.setImageDrawable(fyd.a(c.getContext()));
        f.setImageDrawable(fyd.c(c.getContext()));
        a.setImageDrawable(e());
        b.setImageDrawable(f());
        g = h();
    }

    public void a(ViewGroup viewgroup)
    {
        viewgroup.removeView(c);
        viewgroup = g;
        viewgroup.b = null;
        viewgroup.b();
        g = null;
    }

    public final void a(Flags flags)
    {
    }

    public final void a_(boolean flag)
    {
        Drawable drawable;
        int i;
        if (flag)
        {
            drawable = fyd.a(c.getContext(), 60, 1);
            i = 0x7f0803ec;
        } else
        {
            drawable = fyd.b(c.getContext(), 60, 1);
            i = 0x7f0803eb;
        }
        e.setImageDrawable(drawable);
        e.setContentDescription(c.getContext().getString(i));
    }

    public final eda b()
    {
        return g;
    }

    public final void b_(boolean flag)
    {
        e.setEnabled(flag);
    }

    public final void c()
    {
        a.setImageDrawable(e());
    }

    public final void c(boolean flag)
    {
        Drawable drawable;
        if (flag)
        {
            drawable = fyd.a(c.getContext());
        } else
        {
            drawable = fyd.b(c.getContext());
        }
        d.setImageDrawable(drawable);
    }

    public final void d()
    {
        b.setImageDrawable(f());
    }

    public final void d(boolean flag)
    {
        Drawable drawable;
        if (flag)
        {
            drawable = fyd.c(c.getContext());
        } else
        {
            drawable = fyd.d(c.getContext());
        }
        f.setImageDrawable(drawable);
    }

    public abstract Drawable e();

    public final void e(boolean flag)
    {
    }

    public abstract Drawable f();

    public final void f(boolean flag)
    {
    }

    public void g()
    {
    }

    public abstract fbc h();

    public void onClick(View view)
    {
        if (view == a)
        {
            g.c();
        } else
        {
            if (view == d)
            {
                view = g;
                ((fbc) (view)).a.b();
                ((fbc) (view)).b.a(false);
                return;
            }
            if (view == e)
            {
                view = g;
                ((fbc) (view)).a.a();
                ((fbc) (view)).b.b();
                return;
            }
            if (view == f)
            {
                g.a();
                return;
            }
            if (view == b)
            {
                g.d();
                return;
            }
        }
    }
}
