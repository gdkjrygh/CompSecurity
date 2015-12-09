// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import aav;
import abo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import com.spotify.mobile.android.ui.ActionBarManager;
import dfz;
import dgo;
import evd;
import eve;
import gcg;
import java.util.List;

public class MomentMenuView extends LinearLayout
{

    public Button a;
    RecyclerView b;
    dfz c;
    public List d;
    public int e;
    public evd f;
    TransitionDrawable g;
    public aav h = new aav() {

        final MomentMenuView c;

        public final volatile abo a(ViewGroup viewgroup, int k)
        {
            return eve.a(viewgroup);
        }

        public final void a(abo abo, int k)
        {
            Object obj = (eve)abo;
            abo = (Moment)MomentMenuView.a(c).get(k);
            obj = ((eve) (obj)).j;
            ((TextView) (obj)).setText(((Moment) (abo)).name);
            boolean flag;
            if (k == MomentMenuView.b(c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((TextView) (obj)).setSelected(flag);
            ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener(this, k) {

                private int a;
                private _cls2 b;

                public final void onClick(View view)
                {
                    if (MomentMenuView.c(b.c) != null)
                    {
                        MomentMenuView.c(b.c).a(a);
                    }
                }

            
            {
                b = _pcls2;
                a = k;
                super();
            }
            });
        }

        public final int b()
        {
            return MomentMenuView.a(c).size();
        }

            
            {
                c = MomentMenuView.this;
                super();
            }
    };
    private dfz i;
    private android.view.View.OnClickListener j = new android.view.View.OnClickListener() {

        private MomentMenuView a;

        public final void onClick(View view)
        {
            boolean flag1 = false;
            boolean flag;
            if (a.a.getAlpha() == 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (a.c())
                {
                    a.a();
                } else
                {
                    view = a;
                    ((MomentMenuView) (view)).a.setCompoundDrawablesWithIntrinsicBounds(null, null, ((MomentMenuView) (view)).c, null);
                    ((MomentMenuView) (view)).g.startTransition(200);
                    ((MomentMenuView) (view)).b.setVisibility(0);
                    for (int k = ((flag1) ? 1 : 0); k < ((MomentMenuView) (view)).h.b(); k++)
                    {
                        Object obj = ((MomentMenuView) (view)).b.c(k);
                        if (obj != null)
                        {
                            obj = ((abo) (obj)).a;
                            ((View) (obj)).animate().cancel();
                            ((View) (obj)).setAlpha(0.0F);
                            ((View) (obj)).setTranslationY(-60F);
                            ((View) (obj)).animate().alpha(1.0F).translationY(0.0F).setStartDelay((long)k * 30L).setDuration(100L).start();
                        }
                    }

                    if (((MomentMenuView) (view)).f != null)
                    {
                        ((MomentMenuView) (view)).f.b();
                        return;
                    }
                }
            }
        }

            
            {
                a = MomentMenuView.this;
                super();
            }
    };

    public MomentMenuView(Context context)
    {
        super(context);
        d = ImmutableList.d();
        e = -1;
        g = new TransitionDrawable(new ColorDrawable[] {
            new ColorDrawable(0), new ColorDrawable(gcg.b(getContext(), 0x7f0f010b))
        });
        d();
    }

    public MomentMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = ImmutableList.d();
        e = -1;
        g = new TransitionDrawable(new ColorDrawable[] {
            new ColorDrawable(0), new ColorDrawable(gcg.b(getContext(), 0x7f0f010b))
        });
        d();
    }

    static List a(MomentMenuView momentmenuview)
    {
        return momentmenuview.d;
    }

    static int b(MomentMenuView momentmenuview)
    {
        return momentmenuview.e;
    }

    static evd c(MomentMenuView momentmenuview)
    {
        return momentmenuview.f;
    }

    private void d()
    {
        inflate(getContext(), 0x7f0300de, this);
        i = new dfz(getContext(), SpotifyIcon.j, getContext().getResources().getDimensionPixelSize(0x7f0c0150));
        c = new dfz(getContext(), SpotifyIcon.m, getContext().getResources().getDimensionPixelSize(0x7f0c0150));
        a = (Button)findViewById(0x7f11025e);
        a.setCompoundDrawablesWithIntrinsicBounds(null, null, i, null);
        a.setCompoundDrawablePadding(getContext().getResources().getDimensionPixelOffset(0x7f0c002b));
        a.setOnClickListener(j);
        Object obj = (android.view.ViewGroup.MarginLayoutParams)a.getLayoutParams();
        obj.topMargin = ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin + ActionBarManager.a(getContext());
        b = (RecyclerView)findViewById(0x7f110426);
        obj = b;
        getContext();
        ((RecyclerView) (obj)).a(new LinearLayoutManager());
        b.a(h);
        b.setVisibility(4);
        setOrientation(1);
        dgo.a(this, g);
        g.resetTransition();
    }

    public final void a()
    {
        a.setCompoundDrawablesWithIntrinsicBounds(null, null, i, null);
        g.reverseTransition(200);
        b.setVisibility(4);
        if (f != null)
        {
            f.a();
        }
    }

    public final void b()
    {
        if (a.getAlpha() == 1.0F)
        {
            return;
        } else
        {
            a.animate().cancel();
            a.animate().alpha(1.0F).setDuration(400L).start();
            return;
        }
    }

    public final boolean c()
    {
        return b.getVisibility() == 0;
    }
}
