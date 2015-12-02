// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mobvista.sdk.m.a.d.a.d;
import com.mobvista.sdk.m.a.d.a.k;
import com.mobvista.sdk.m.a.f.j;
import com.mobvista.sdk.m.b.e;
import com.mobvista.sdk.m.core.a.b;
import com.mobvista.sdk.m.core.b.a;
import com.mobvista.sdk.m.core.c.f;
import com.mobvista.sdk.m.core.entity.Campaign;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import com.mobvista.sdk.m.core.loader.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.mobvista.sdk.m.core:
//            e, f, a, b, 
//            c, d, g, h, 
//            i, k, j

public class AdMobvistaAct extends Activity
    implements e
{

    private a A;
    private RelativeLayout B;
    private com.mobvista.sdk.m.core.c.b C;
    private com.mobvista.sdk.m.b.a D;
    private boolean E;
    private boolean F;
    private String G;
    private String H;
    private int I;
    private int J;
    int a;
    private com.mobvista.sdk.m.core.k b;
    private com.mobvista.sdk.m.core.j c;
    private CampaignEx d;
    private LinearLayout e;
    private LinearLayout f;
    private RelativeLayout g;
    private RelativeLayout h;
    private RelativeLayout i;
    private int j;
    private com.mobvista.sdk.m.b.d k;
    private a l;
    private b m;
    private LinearLayout n;
    private Campaign o;
    private List p;
    private ListView q;
    private a r;
    private LinearLayout s;
    private RelativeLayout t;
    private List u;
    private ListView v;
    private a w;
    private RelativeLayout x;
    private List y;
    private ListView z;

    public AdMobvistaAct()
    {
        J = 0;
        a = -1;
    }

    private View a(CampaignEx campaignex, int i1)
    {
        int j1 = com.mobvista.sdk.m.a.f.j.a(this, 4F);
        int k1 = com.mobvista.sdk.m.a.f.j.a(this, 10F);
        i1 -= k1 * 2;
        int l1 = com.mobvista.sdk.m.a.f.j.a(this, 10F);
        Object obj = new GradientDrawable();
        ((GradientDrawable) (obj)).setColor(-1);
        ((GradientDrawable) (obj)).setCornerRadius(l1);
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setBackgroundDrawable(((Drawable) (obj)));
        linearlayout.setOrientation(1);
        linearlayout.setPadding(k1, k1, k1, k1);
        obj = new ImageView(this);
        ((ImageView) (obj)).setTag(campaignex.getIconUrl());
        com.mobvista.sdk.m.a.d.a.d.a().a(campaignex.getIconUrl(), new com.mobvista.sdk.m.core.e(this, ((ImageView) (obj))));
        Object obj1 = new android.widget.LinearLayout.LayoutParams(i1, i1);
        obj1.gravity = 1;
        linearlayout.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj = new TextView(this);
        ((TextView) (obj)).setSingleLine();
        ((TextView) (obj)).setTextColor(0xff330066);
        ((TextView) (obj)).setTextSize(14F);
        ((TextView) (obj)).setText(campaignex.getAppName());
        obj1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj1.gravity = 1;
        obj1.topMargin = j1;
        linearlayout.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj = new RatingBar(this, null, 0x101007d);
        ((RatingBar) (obj)).setNumStars(5);
        ((RatingBar) (obj)).setRating((float)(4D + (new Random()).nextDouble()));
        obj1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj1.gravity = 1;
        obj1.topMargin = j1;
        linearlayout.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
        ((RatingBar) (obj)).setVisibility(8);
        k1 = com.mobvista.sdk.m.a.f.j.a(this, 6F);
        obj1 = new GradientDrawable();
        ((GradientDrawable) (obj1)).setColor(0xff5795e5);
        ((GradientDrawable) (obj1)).setCornerRadius(k1);
        obj = new TextView(this);
        ((TextView) (obj)).setClickable(false);
        ((TextView) (obj)).setGravity(17);
        ((TextView) (obj)).setSingleLine();
        ((TextView) (obj)).setTextColor(-1);
        ((TextView) (obj)).setBackgroundDrawable(((Drawable) (obj1)));
        ((TextView) (obj)).setText("INSTALL");
        ((TextView) (obj)).setId(com.mobvista.sdk.m.a.f.j.a());
        k1 = com.mobvista.sdk.m.a.f.j.a(this, 3F);
        ((TextView) (obj)).setPadding(0, k1, 0, k1);
        obj1 = new android.widget.LinearLayout.LayoutParams(i1, -2);
        obj1.gravity = 1;
        obj1.topMargin = j1;
        linearlayout.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
        linearlayout.setOnClickListener(new com.mobvista.sdk.m.core.f(this, campaignex));
        return linearlayout;
    }

    private ListView a(List list)
    {
        ListView listview = new ListView(this);
        listview.setCacheColorHint(0);
        listview.setDivider(new ColorDrawable(0));
        listview.setDividerHeight(com.mobvista.sdk.m.a.f.j.a(this, 10F));
        listview.setSelector(new ColorDrawable(0));
        listview.setBackgroundDrawable(new ColorDrawable(0));
        n = new LinearLayout(this);
        listview.addHeaderView(n);
        n.setVisibility(8);
        if (list != null && list.size() > 6)
        {
            l = new a(this, list, true);
            LinearLayout linearlayout1 = new LinearLayout(this);
            linearlayout1.setOrientation(1);
            int j1 = com.mobvista.sdk.m.a.f.j.a(this, 10F);
            int k1 = (int)((com.mobvista.sdk.m.a.f.j.a(this) - (float)(j * 2) - (float)(j1 * 2)) / 3F);
            LinearLayout linearlayout = null;
            int i1 = 0;
            while (i1 < 6) 
            {
                int l1 = i1 / 3;
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(k1, -2);
                if (i1 % 3 == 0)
                {
                    linearlayout = new LinearLayout(this);
                    linearlayout.setOrientation(0);
                    android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                    if (l1 > 0)
                    {
                        layoutparams1.setMargins(0, j1, 0, 0);
                    }
                    linearlayout1.addView(linearlayout, layoutparams1);
                } else
                {
                    layoutparams.setMargins(j1, 0, 0, 0);
                }
                linearlayout.addView(a((CampaignEx)list.get(i1), k1), layoutparams);
                i1++;
            }
            listview.addHeaderView(linearlayout1);
        } else
        {
            l = new a(this, list, false);
        }
        listview.setAdapter(l);
        return listview;
    }

    static Campaign a(AdMobvistaAct admobvistaact)
    {
        return admobvistaact.o;
    }

    static Campaign a(AdMobvistaAct admobvistaact, Campaign campaign)
    {
        admobvistaact.o = campaign;
        return campaign;
    }

    private void a(View view)
    {
        if (m != null)
        {
            m.a(view);
        }
    }

    static void a(AdMobvistaAct admobvistaact, String s1)
    {
        admobvistaact.a(s1);
    }

    private void a(Campaign campaign)
    {
        if (s != null)
        {
            s.setVisibility(0);
            int i1 = com.mobvista.sdk.m.a.f.j.a(this, 8F);
            s.setPadding(i1, i1, i1, i1);
            s.setOrientation(1);
            int j1 = com.mobvista.sdk.m.a.f.j.a(this, 10F);
            Object obj = new GradientDrawable();
            ((GradientDrawable) (obj)).setColor(-1);
            ((GradientDrawable) (obj)).setCornerRadius(j1);
            s.setBackgroundDrawable(((Drawable) (obj)));
            obj = new LinearLayout(this);
            ((LinearLayout) (obj)).setOrientation(0);
            Object obj1 = new ImageView(this);
            j1 = com.mobvista.sdk.m.a.f.j.a(this, 64F);
            ((LinearLayout) (obj)).addView(((View) (obj1)), new android.widget.LinearLayout.LayoutParams(j1, j1));
            com.mobvista.sdk.m.a.d.a.d.a().a(campaign.getIconUrl(), new com.mobvista.sdk.m.core.a(this, ((ImageView) (obj1))));
            obj1 = new LinearLayout(this);
            ((LinearLayout) (obj1)).setOrientation(1);
            Object obj2 = new android.widget.LinearLayout.LayoutParams(-1, j1);
            obj2.leftMargin = com.mobvista.sdk.m.a.f.j.a(this, 10F);
            ((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
            obj2 = new TextView(this);
            ((TextView) (obj2)).setText(campaign.getAppName());
            ((TextView) (obj2)).setTextSize(20F);
            ((TextView) (obj2)).setTextColor(0xff5f52a0);
            ((TextView) (obj2)).setSingleLine();
            ((LinearLayout) (obj1)).addView(((View) (obj2)), new android.widget.LinearLayout.LayoutParams(-1, -2));
            obj2 = new TextView(this);
            ((TextView) (obj2)).setText(campaign.getAppDesc());
            ((TextView) (obj2)).setTextSize(14F);
            ((TextView) (obj2)).setTextColor(0xff999999);
            ((TextView) (obj2)).setMaxLines(2);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutparams.gravity = 80;
            ((LinearLayout) (obj1)).addView(((View) (obj2)), layoutparams);
            obj1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            obj1.topMargin = com.mobvista.sdk.m.a.f.j.a(this, 5F);
            s.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
            obj = new TextView(this);
            ((TextView) (obj)).setTextColor(0xff999999);
            ((TextView) (obj)).setText("Sponsored");
            obj1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            obj1.gravity = 5;
            s.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
            obj = new RelativeLayout(this);
            obj1 = new ImageView(this);
            ((ImageView) (obj1)).setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            i1 = (int)(com.mobvista.sdk.m.a.f.j.a(this) - (float)(j * 2) - (float)(i1 * 2));
            j1 = (i1 * 416) / 796;
            obj2 = new android.widget.LinearLayout.LayoutParams(i1, j1);
            obj2.topMargin = com.mobvista.sdk.m.a.f.j.a(this, 10F);
            obj2.gravity = 1;
            ((RelativeLayout) (obj)).addView(((View) (obj1)), new android.widget.RelativeLayout.LayoutParams(i1, j1));
            com.mobvista.sdk.m.a.d.a.d.a().a(campaign.getImageUrl(), new com.mobvista.sdk.m.core.b(this, ((ImageView) (obj1))));
            s.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj2)));
            i1 = com.mobvista.sdk.m.a.f.j.a(this, 6F);
            obj1 = new GradientDrawable();
            ((GradientDrawable) (obj1)).setColor(0xff5795e5);
            ((GradientDrawable) (obj1)).setCornerRadius(i1);
            obj = new TextView(this);
            i1 = com.mobvista.sdk.m.a.f.j.a(this, 6F);
            ((TextView) (obj)).setPadding(0, i1, 0, i1);
            ((TextView) (obj)).setGravity(17);
            ((TextView) (obj)).setSingleLine();
            ((TextView) (obj)).setTextSize(16F);
            ((TextView) (obj)).setTextColor(-1);
            ((TextView) (obj)).setBackgroundDrawable(((Drawable) (obj1)));
            ((TextView) (obj)).setText(campaign.getAdCall());
            campaign = new android.widget.LinearLayout.LayoutParams(-1, -2);
            campaign.topMargin = com.mobvista.sdk.m.a.f.j.a(this, 10F);
            s.addView(((View) (obj)), campaign);
            a(((View) (s)));
        }
    }

    private void a(String s1)
    {
        if (TextUtils.isEmpty(s1) || E)
        {
            return;
        } else
        {
            E = true;
            h h1 = new h(s1);
            h1.a(1, null);
            h1.a(new c(this, s1));
            return;
        }
    }

    static com.mobvista.sdk.m.b.d b(AdMobvistaAct admobvistaact)
    {
        return admobvistaact.k;
    }

    private void b()
    {
        m = new b();
        m.a(new Object[] {
            this, H
        });
        m.a(new com.mobvista.sdk.m.core.d(this));
    }

    private void b(int i1)
    {
        Intent intent = new Intent((new StringBuilder("com.mobvista.sdk.m.ACTION_ACT_ORDER")).append(G).append(I).toString());
        intent.putExtra("ORDER", "REFRESH");
        intent.putExtra("WHICH", i1);
        sendBroadcast(intent);
    }

    static void b(AdMobvistaAct admobvistaact, Campaign campaign)
    {
        admobvistaact.a(campaign);
    }

    static RelativeLayout c(AdMobvistaAct admobvistaact)
    {
        return admobvistaact.t;
    }

    private void c()
    {
        List list = C.a(20, 0, G);
        if (list == null || list.size() == 0)
        {
            b(0);
            return;
        }
        if (p != null)
        {
            p.clear();
        } else
        {
            p = new ArrayList();
        }
        p.addAll(list);
        a(((CampaignEx)list.get(0)).getOnlyImpressionURL());
        if (q == null)
        {
            q = a(p);
            s = n;
            if (o != null)
            {
                a(o);
            }
            r = l;
            g.addView(q, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        } else
        {
            r.notifyDataSetChanged();
        }
        t.setVisibility(8);
    }

    private void d()
    {
        List list = C.a(20, 1, G);
        if (list == null || list.size() == 0)
        {
            b(1);
            return;
        }
        if (u != null)
        {
            u.clear();
        } else
        {
            u = new ArrayList();
        }
        u.addAll(list);
        a(((CampaignEx)list.get(0)).getOnlyImpressionURL());
        if (v == null)
        {
            v = a(u);
            w = l;
            h.addView(v, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        } else
        {
            w.notifyDataSetChanged();
        }
        x.setVisibility(8);
    }

    static void d(AdMobvistaAct admobvistaact)
    {
        admobvistaact.c();
    }

    static RelativeLayout e(AdMobvistaAct admobvistaact)
    {
        return admobvistaact.x;
    }

    private void e()
    {
        List list = C.a(20, 2, G);
        if (list == null || list.size() == 0)
        {
            b(2);
            return;
        }
        if (y != null)
        {
            y.clear();
        } else
        {
            y = new ArrayList();
        }
        y.addAll(list);
        a(((CampaignEx)list.get(0)).getOnlyImpressionURL());
        if (z == null)
        {
            z = a(y);
            A = l;
            i.addView(z, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        } else
        {
            A.notifyDataSetChanged();
        }
        B.setVisibility(8);
    }

    private void f()
    {
        b();
        c();
        d();
        e();
    }

    static void f(AdMobvistaAct admobvistaact)
    {
        admobvistaact.d();
    }

    static RelativeLayout g(AdMobvistaAct admobvistaact)
    {
        return admobvistaact.B;
    }

    private void g()
    {
        Intent intent = new Intent((new StringBuilder("com.mobvista.sdk.m.ACTION_ACT_ORDER")).append(G).append(I).toString());
        intent.putExtra("ORDER", "UNREGIST");
        intent.putExtra("UNREGIST_KEY", I);
        sendBroadcast(intent);
    }

    private void h()
    {
        LinearLayout linearlayout = new LinearLayout(this);
        linearlayout.setOrientation(1);
        Object obj = new RelativeLayout(this);
        ((RelativeLayout) (obj)).setBackgroundDrawable(com.mobvista.sdk.m.a.d.a.k.a(this).a("bg_titlebar.jpg"));
        linearlayout.addView(((View) (obj)), new android.widget.LinearLayout.LayoutParams(-1, (int)((com.mobvista.sdk.m.a.f.j.a(this) * 229F) / 720F)));
        Object obj1 = new LinearLayout(this);
        ((LinearLayout) (obj1)).setOrientation(0);
        ((LinearLayout) (obj1)).setGravity(16);
        Object obj2 = new TextView(this);
        ((TextView) (obj2)).setBackgroundDrawable(com.mobvista.sdk.m.a.d.a.k.a(this).a("img_back.png"));
        int i1 = com.mobvista.sdk.m.a.f.j.a(this, 24F);
        Object obj3 = new android.widget.LinearLayout.LayoutParams(i1, i1);
        obj3.leftMargin = com.mobvista.sdk.m.a.f.j.a(this, 15F);
        ((LinearLayout) (obj1)).addView(((View) (obj2)), ((android.view.ViewGroup.LayoutParams) (obj3)));
        obj2 = new ImageView(this);
        obj3 = com.mobvista.sdk.m.a.d.a.k.a(this).a("img_logo.png");
        ((ImageView) (obj2)).setBackgroundDrawable(((Drawable) (obj3)));
        i1 = com.mobvista.sdk.m.a.f.j.a(this, 20.5F);
        int l1 = ((Drawable) (obj3)).getIntrinsicHeight();
        obj3 = new android.widget.LinearLayout.LayoutParams((((Drawable) (obj3)).getIntrinsicWidth() * i1) / l1, i1);
        obj3.leftMargin = com.mobvista.sdk.m.a.f.j.a(this, 20F);
        ((LinearLayout) (obj1)).addView(((View) (obj2)), ((android.view.ViewGroup.LayoutParams) (obj3)));
        obj2 = new android.widget.RelativeLayout.LayoutParams(-2, com.mobvista.sdk.m.a.f.j.a(this, 50F));
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10, -1);
        ((RelativeLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
        ((LinearLayout) (obj1)).setOnClickListener(new g(this));
        e = new LinearLayout(this);
        e.setOrientation(0);
        obj1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12, -1);
        ((RelativeLayout) (obj)).addView(e, ((android.view.ViewGroup.LayoutParams) (obj1)));
        obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        obj.weight = 1.0F;
        for (int j1 = 0; j1 < 3; j1++)
        {
            LinearLayout linearlayout1 = new LinearLayout(this);
            linearlayout1.setOnClickListener(new com.mobvista.sdk.m.core.h(this, j1));
            e.addView(linearlayout1, ((android.view.ViewGroup.LayoutParams) (obj)));
            linearlayout1.setOrientation(1);
            TextView textview = new TextView(this);
            textview.setSingleLine();
            textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textview.setText((new String[] {
                "FEATURED", "GAMES", "APPS"
            })[j1]);
            textview.setTextColor(-1);
            textview.setTextSize(14F);
            textview.setGravity(1);
            linearlayout1.addView(textview);
            textview = new TextView(this);
            textview.setVisibility(4);
            textview.setBackgroundDrawable(com.mobvista.sdk.m.a.d.a.k.a(this).a("img_line_title.jpg"));
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, com.mobvista.sdk.m.a.f.j.a(this, 7F));
            layoutparams.topMargin = com.mobvista.sdk.m.a.f.j.a(this, 8F);
            linearlayout1.addView(textview, layoutparams);
        }

        f = new LinearLayout(this);
        linearlayout.addView(f);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        obj.weight = 1.0F;
        for (int k1 = 0; k1 < 3; k1++)
        {
            RelativeLayout relativelayout = new RelativeLayout(this);
            relativelayout.setVisibility(4);
            TextView textview1 = new TextView(this);
            textview1.setBackgroundDrawable(com.mobvista.sdk.m.a.d.a.k.a(this).a("img_sanjiao.png"));
            relativelayout.setGravity(17);
            android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(com.mobvista.sdk.m.a.f.j.a(this, 13F), com.mobvista.sdk.m.a.f.j.a(this, 6.5F));
            layoutparams1.gravity = 17;
            relativelayout.addView(textview1, layoutparams1);
            f.addView(relativelayout, ((android.view.ViewGroup.LayoutParams) (obj)));
        }

        k = new com.mobvista.sdk.m.b.d(this);
        k.a(this);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
        linearlayout.addView(k, ((android.view.ViewGroup.LayoutParams) (obj)));
        j = com.mobvista.sdk.m.a.f.j.a(this, 8F);
        g = new RelativeLayout(this);
        g.setPadding(j, 0, j, j);
        h = new RelativeLayout(this);
        h.setPadding(j, 0, j, j);
        i = new RelativeLayout(this);
        i.setPadding(j, 0, j, j);
        k.addView(g);
        k.addView(h);
        k.addView(i);
        t = new RelativeLayout(this);
        t.setGravity(17);
        t.addView(i(), new android.widget.RelativeLayout.LayoutParams(-2, -2));
        g.addView(t, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        x = new RelativeLayout(this);
        x.setGravity(17);
        x.addView(i(), new android.widget.RelativeLayout.LayoutParams(-2, -2));
        h.addView(x, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        B = new RelativeLayout(this);
        B.setGravity(17);
        B.addView(i(), new android.widget.RelativeLayout.LayoutParams(-2, -2));
        i.addView(B, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        k.a(J);
        setContentView(linearlayout);
    }

    static void h(AdMobvistaAct admobvistaact)
    {
        admobvistaact.e();
    }

    private View i()
    {
        int i1 = com.mobvista.sdk.m.a.f.j.a(this, 6F);
        Object obj = new GradientDrawable();
        ((GradientDrawable) (obj)).setColor(0xff5795e5);
        ((GradientDrawable) (obj)).setCornerRadius(i1);
        LinearLayout linearlayout = new LinearLayout(this);
        i1 = com.mobvista.sdk.m.a.f.j.a(this, 10F);
        linearlayout.setPadding(i1, i1 / 2, i1, i1 / 2);
        linearlayout.setBackgroundDrawable(((Drawable) (obj)));
        linearlayout.setOrientation(0);
        obj = new ProgressBar(this);
        ((ProgressBar) (obj)).setIndeterminate(true);
        linearlayout.addView(((View) (obj)));
        obj = new TextView(this);
        ((TextView) (obj)).setText("loading...");
        ((TextView) (obj)).setTextColor(-1);
        ((TextView) (obj)).setTextSize(14F);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        linearlayout.addView(((View) (obj)), layoutparams);
        return linearlayout;
    }

    static String i(AdMobvistaAct admobvistaact)
    {
        return admobvistaact.G;
    }

    private void j()
    {
        if (F)
        {
            return;
        }
        try
        {
            if (D == null)
            {
                if (d == null)
                {
                    break MISSING_BLOCK_LABEL_115;
                }
                D = new com.mobvista.sdk.m.b.a(this, d);
                android.view.WindowManager.LayoutParams layoutparams = D.getWindow().getAttributes();
                D.getWindow().setAttributes(layoutparams);
                D.requestWindowFeature(1);
                D.setOnDismissListener(new i(this));
            }
            D.a(d);
            D.show();
            return;
        }
        catch (Exception exception)
        {
            Log.e("", "Exception", exception);
        }
    }

    static void j(AdMobvistaAct admobvistaact)
    {
        admobvistaact.j();
    }

    private void k()
    {
        if (F)
        {
            return;
        }
        try
        {
            if (D != null && D.isShowing())
            {
                D.dismiss();
                return;
            }
        }
        catch (Exception exception)
        {
            Log.e("", "Exception", exception);
        }
        return;
    }

    static void k(AdMobvistaAct admobvistaact)
    {
        admobvistaact.k();
    }

    public final void a()
    {
        Intent intent = new Intent((new StringBuilder("com.mobvista.sdk.m.ACTION_ACT_ORDER")).append(G).append(I).toString());
        intent.putExtra("ORDER", "CLICK_CANCEL");
        sendBroadcast(intent);
    }

    public final void a(int i1)
    {
        if (i1 != a)
        {
            ((ViewGroup)e.getChildAt(i1)).getChildAt(1).setVisibility(0);
            f.getChildAt(i1).setVisibility(0);
            if (a != -1)
            {
                ((ViewGroup)e.getChildAt(a)).getChildAt(1).setVisibility(4);
                f.getChildAt(a).setVisibility(4);
            }
            a = i1;
        }
    }

    public final void a(CampaignEx campaignex)
    {
        d = campaignex;
        Intent intent = new Intent((new StringBuilder("com.mobvista.sdk.m.ACTION_ACT_ORDER")).append(G).append(I).toString());
        intent.putExtra("ORDER", "INSTALL");
        intent.putExtra("CAMPAIGN", campaignex);
        sendBroadcast(intent);
    }

    protected void finalize()
    {
        super.finalize();
        Log.e("", "finalize adact");
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            finish();
        }
        bundle = getIntent();
        G = bundle.getStringExtra("BUNDLE_UNITID");
        H = bundle.getStringExtra("BUNDLE_FBID");
        J = bundle.getIntExtra("BUNDLE_TAB", 0);
        I = bundle.getIntExtra("BUNDLE_KEY", 0);
        b = new com.mobvista.sdk.m.core.k(this);
        registerReceiver(b, new IntentFilter((new StringBuilder("com.mobvista.sdk.m.ACTION_LOAD_DATA")).append(G).toString()));
        bundle = new IntentFilter();
        bundle.addAction((new StringBuilder("LAODING_SHOW")).append(G).toString());
        bundle.addAction((new StringBuilder("LAODING_DISMISSS")).append(G).toString());
        c = new com.mobvista.sdk.m.core.j(this);
        registerReceiver(c, bundle);
        C = com.mobvista.sdk.m.core.c.b.a(com.mobvista.sdk.m.core.c.f.a(this));
        Log.e("deleted", "oncreate");
        C.b();
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0xffe5e0d7));
        h();
        f();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        F = true;
        com.mobvista.sdk.m.a.e.a.a().b();
        if (m != null)
        {
            m.a();
        }
        g();
        unregisterReceiver(b);
        unregisterReceiver(c);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }
}
