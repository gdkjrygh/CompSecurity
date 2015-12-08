// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.g.i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.model.InstagramPhoto;
import com.tinder.utils.ad;
import com.tinder.views.RoundImageView;
import java.util.ArrayList;
import java.util.List;

public final class t extends android.support.v4.view.t
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(View view, int i1);
    }


    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public List f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    a l;
    public i m;
    private int n;
    private Context o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private android.view.View.OnClickListener w;

    public t(Context context, a a1)
    {
        a = 2;
        b = 3;
        c = 29;
        k = true;
        w = new android.view.View.OnClickListener() {

            final t a;

            public final void onClick(View view)
            {
                int j1 = a.f.size();
                int i1 = j1;
                if (j1 > a.c)
                {
                    i1 = a.c;
                }
                a.l.a(view, i1);
            }

            
            {
                a = t.this;
                super();
            }
        };
        o = context;
        l = a1;
        g = (int)ad.a(5F, o);
        q = (int)o.getResources().getDimension(0x7f0900ee);
        r = (int)o.getResources().getDimension(0x7f0900ed);
        s = (int)o.getResources().getDimension(0x7f0900ec);
        h = r + s;
        t = g * 2;
        p = (b - 1) * t + q * 2 + g * 2;
        f = new ArrayList();
        u = (ad.a(o) - p) / b;
        j = u;
        e = a * b;
        m = new i();
    }

    public final void destroyItem(ViewGroup viewgroup, int i1, Object obj)
    {
        viewgroup.removeView((GridLayout)obj);
    }

    public final int getCount()
    {
        return d;
    }

    public final int getItemPosition(Object obj)
    {
        return 0;
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i1)
    {
        GridLayout gridlayout;
        int k1;
        View view = LayoutInflater.from(o).inflate(0x7f03005a, viewgroup, false);
        gridlayout = (GridLayout)view.findViewById(0x7f0e0198);
        gridlayout.setUseDefaultMargins(true);
        gridlayout.setColumnCount(b);
        gridlayout.setRowCount(a);
        gridlayout.setRowOrderPreserved(true);
        int l1 = d;
        v = false;
        View view1;
        android.widget.GridLayout.LayoutParams layoutparams;
        int j1;
        if (f.size() > c)
        {
            j1 = c;
        } else
        {
            j1 = f.size();
        }
        n = j1;
        if (n <= 0) goto _L2; else goto _L1
_L1:
        k1 = i1 * e;
        j1 = e + k1;
        if (i1 + 1 == l1)
        {
            v = true;
            l1 = n % e + k1;
            j1 = l1;
            if (k)
            {
                j1 = l1 + 1;
            }
        }
_L7:
        if (k1 >= j1) goto _L2; else goto _L3
_L3:
        m.put(Integer.valueOf(k1), Integer.valueOf(i1));
        if (!v || k1 + 1 != j1 || !k) goto _L5; else goto _L4
_L4:
        view1 = LayoutInflater.from(o).inflate(0x7f03005e, gridlayout, false);
        layoutparams = new android.widget.GridLayout.LayoutParams();
        layoutparams.width = u;
        layoutparams.height = j;
        view1.setLayoutParams(layoutparams);
        view1.setOnClickListener(new android.view.View.OnClickListener() {

            final t a;

            public final void onClick(View view2)
            {
                a.l.a();
            }

            
            {
                a = t.this;
                super();
            }
        });
        gridlayout.addView(view1);
_L2:
        viewgroup.addView(view, 0);
        return view;
_L5:
        RoundImageView roundimageview = new RoundImageView(o);
        roundimageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        roundimageview.setStyle("barely_rounded");
        roundimageview.setOnClickListener(w);
        roundimageview.setTag(Integer.valueOf(k1));
        Object obj = new android.widget.GridLayout.LayoutParams();
        obj.height = j;
        obj.width = u;
        ((android.widget.GridLayout.LayoutParams) (obj)).setMargins(g, g, g, g);
        roundimageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        gridlayout.addView(roundimageview);
        gridlayout.setPadding(q, r, q, s);
        obj = ((InstagramPhoto)f.get(k1)).mUrlSmall;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Picasso.a(o).a(((String) (obj))).b(u, j).a(roundimageview);
        }
        k1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
