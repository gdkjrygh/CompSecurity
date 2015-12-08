// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.localmedia.ui;

import aa;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b;
import c;
import elj;
import fuu;
import fux;
import fwy;
import fxa;
import fxb;
import fxd;
import fxe;
import fxf;
import hyy;
import java.util.List;
import mmr;
import msj;
import msm;
import nud;
import nug;
import olm;
import pwt;

public class LocalFoldersHeaderView extends LinearLayout
{

    public fwy a;
    public fux b;
    private final hyy c;
    private final nug d;
    private final fuu e;
    private final nug f;
    private mmr g;
    private TextView h;
    private ImageView i;

    public LocalFoldersHeaderView(Context context)
    {
        super(context);
        c = (hyy)olm.a(getContext(), hyy);
        d = new fxa(this);
        e = (fuu)olm.a(getContext(), fuu);
        f = new fxb(this);
        g = (mmr)olm.a(getContext(), mmr);
    }

    public LocalFoldersHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = (hyy)olm.a(getContext(), hyy);
        d = new fxa(this);
        e = (fuu)olm.a(getContext(), fuu);
        f = new fxb(this);
        g = (mmr)olm.a(getContext(), mmr);
    }

    public LocalFoldersHeaderView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        c = (hyy)olm.a(getContext(), hyy);
        d = new fxa(this);
        e = (fuu)olm.a(getContext(), fuu);
        f = new fxb(this);
        g = (mmr)olm.a(getContext(), mmr);
    }

    private void a(int j, int k)
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), k);
        h.setText(j);
        h.setVisibility(0);
        animation.setAnimationListener(new fxe(this));
        h.startAnimation(animation);
        if (c.b(getContext()))
        {
            String s = String.valueOf(((elj)b.a(elj)).a);
            String s1 = String.valueOf(getResources().getText(j));
            announceForAccessibility((new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length())).append(s).append(s1).toString());
        }
    }

    public static void a(LocalFoldersHeaderView localfoldersheaderview)
    {
        localfoldersheaderview.a();
    }

    public static fux b(LocalFoldersHeaderView localfoldersheaderview)
    {
        return localfoldersheaderview.b;
    }

    public static fwy c(LocalFoldersHeaderView localfoldersheaderview)
    {
        return localfoldersheaderview.a;
    }

    public static TextView d(LocalFoldersHeaderView localfoldersheaderview)
    {
        return localfoldersheaderview.h;
    }

    public void a()
    {
        boolean flag1 = true;
        if (b == null)
        {
            return;
        }
        i = (ImageView)findViewById(aa.o);
        Object obj = String.valueOf(b.b.get(0));
        if (!g.e() || !b.b() && (!e.b || !e.a(((String) (obj)))))
        {
            i.setVisibility(8);
            return;
        }
        String s = (String)i.getTag(aa.C);
        int j;
        boolean flag;
        if (s == null || !s.equals(obj))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            h = (TextView)findViewById(aa.l);
            h.clearAnimation();
            h.setVisibility(8);
        }
        i.setVisibility(0);
        i.setTag(aa.C, obj);
        i.setOnClickListener(new msj(new fxd(this)));
        if (b.b())
        {
            if (e.b)
            {
                j = fxf.a;
            } else
            {
                j = fxf.b;
            }
            a(j, ((String) (null)));
        } else
        if (e.b(((String) (obj))))
        {
            b.a(i, new msm(pwt.g));
            a(fxf.a, ((String) (null)));
        } else
        {
            b.a(i, new msm(pwt.h));
            a(fxf.b, ((String) (null)));
        }
        if (!c.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setClickable(flag);
        obj = i;
        if (!c.b())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((ImageView) (obj)).setClickable(flag);
        if (c.b())
        {
            i.setAlpha(0.12F);
            return;
        } else
        {
            i.setAlpha(1.0F);
            return;
        }
    }

    public final void a(int j, String s)
    {
        String s1;
        ImageView imageview;
        String s2;
        int k;
        if (j == fxf.a)
        {
            k = b.qO;
        } else
        {
            k = b.qQ;
        }
        imageview = i;
        s1 = String.valueOf(((elj)b.a(elj)).a);
        s2 = String.valueOf(getResources().getString(k));
        if (s2.length() != 0)
        {
            s1 = s1.concat(s2);
        } else
        {
            s1 = new String(s1);
        }
        imageview.setContentDescription(s1);
        if (j == fxf.a)
        {
            i.setImageResource(b.qv);
        } else
        {
            i.setImageResource(b.qw);
        }
        if (s != null)
        {
            if (j == fxf.a)
            {
                if (s.equals(i.getTag(aa.C)))
                {
                    a(b.qG, b.qu);
                }
            } else
            if (s.equals(i.getTag(aa.C)))
            {
                a(b.qF, b.qt);
                return;
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        c.a.a(d, true);
        e.c.a(f, true);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c.a.a(d);
        e.c.a(f);
    }
}
