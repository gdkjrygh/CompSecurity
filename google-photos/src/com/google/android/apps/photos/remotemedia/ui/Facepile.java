// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.remotemedia.ui;

import ag;
import aly;
import amh;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b;
import c;
import diy;
import egf;
import hnz;
import java.util.List;
import olm;

public final class Facepile extends FrameLayout
{

    public List a;
    private final View b;
    private final TextView c;
    private final LinearLayout d;
    private final int e;
    private final int f;
    private final View g;
    private final TextView h;
    private final egf i;
    private boolean j;

    public Facepile(Context context)
    {
        this(context, null, 0);
    }

    public Facepile(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public Facepile(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        inflate(getContext(), b.wN, this);
        b = findViewById(ag.C);
        c = (TextView)findViewById(ag.n);
        d = (LinearLayout)findViewById(ag.x);
        e = getContext().getResources().getDimensionPixelSize(b.wz);
        f = getContext().getResources().getDimensionPixelSize(b.wA);
        g = inflate(getContext(), b.wP, null);
        h = (TextView)g.findViewById(ag.R);
        i = (egf)olm.a(getContext(), egf);
        addOnLayoutChangeListener(new hnz(this));
    }

    public static boolean a(Facepile facepile)
    {
        return facepile.j;
    }

    private int b()
    {
        return (getWidth() + f) / (e + f);
    }

    public static void b(Facepile facepile)
    {
        facepile.a();
    }

    public void a()
    {
        boolean flag = false;
        boolean flag1;
        if (b() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = flag1;
        for (int k = 0; k < d.getChildCount(); k++)
        {
            aly.c(getContext()).a(d.getChildAt(k));
        }

        d.removeView(g);
        if (a.isEmpty())
        {
            c.setText(null);
            return;
        }
        int l;
        int i1;
        if (b() != 0 && a.size() > b())
        {
            l = b() - 1;
        } else
        {
            l = a.size();
        }
        for (i1 = d.getChildCount(); i1 < l; i1++)
        {
            inflate(getContext(), b.wO, d);
        }

        for (int j1 = d.getChildCount() - 1; j1 >= l; j1--)
        {
            d.removeViewAt(j1);
        }

        Object obj = a;
        for (int k1 = 0; k1 < l; k1++)
        {
            ImageView imageview = (ImageView)d.getChildAt(k1);
            diy diy1 = (diy)((List) (obj)).get(k1);
            imageview.setContentDescription(diy1.b);
            i.a(diy1.d, imageview);
        }

        if (a.size() == 1)
        {
            c.setText(((diy)a.get(0)).b);
        } else
        if (a.size() > l)
        {
            h.setText(getResources().getString(c.eg, new Object[] {
                Integer.valueOf(a.size() - l)
            }));
            d.addView(g);
        }
        obj = b;
        if (a.size() == 1)
        {
            l = ((flag) ? 1 : 0);
        } else
        {
            l = 8;
        }
        ((View) (obj)).setVisibility(l);
    }
}
