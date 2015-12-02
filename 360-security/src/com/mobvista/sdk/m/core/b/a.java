// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.b;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mobvista.sdk.m.a.d.a.d;
import com.mobvista.sdk.m.a.f.j;
import com.mobvista.sdk.m.core.AdMobvistaAct;
import com.mobvista.sdk.m.core.entity.CampaignEx;
import java.util.List;

// Referenced classes of package com.mobvista.sdk.m.core.b:
//            d, b, c

public final class a extends BaseAdapter
{

    private AdMobvistaAct a;
    private List b;
    private boolean c;

    public a(Context context, List list, boolean flag)
    {
        a = (AdMobvistaAct)context;
        b = list;
        c = flag;
    }

    static AdMobvistaAct a(a a1)
    {
        return a1.a;
    }

    public final int getCount()
    {
        if (c)
        {
            return b.size() - 6;
        } else
        {
            return b.size();
        }
    }

    public final Object getItem(int i)
    {
        if (c)
        {
            return b.get(i + 6);
        } else
        {
            return b.get(i);
        }
    }

    public final long getItemId(int i)
    {
        if (c)
        {
            return (long)(i + 6);
        } else
        {
            return (long)i;
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        CampaignEx campaignex;
        ImageView imageview;
        int l;
        if (view == null)
        {
            viewgroup = new com.mobvista.sdk.m.core.b.d(this, (byte)0);
            int k = j.a(a, 10F);
            Object obj = new GradientDrawable();
            ((GradientDrawable) (obj)).setColor(-1);
            ((GradientDrawable) (obj)).setCornerRadius(k);
            view = new RelativeLayout(a);
            view.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
            k = j.a(a, 8F);
            view.setPadding(k, k, k, k);
            obj = new ImageView(a);
            ((ImageView) (obj)).setId(j.a());
            int i1 = j.a(a, 64F);
            Object obj1 = new android.widget.RelativeLayout.LayoutParams(i1, i1);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(15, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(9, -1);
            view.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
            int j1 = j.a(a, 6F);
            Object obj2 = new GradientDrawable();
            ((GradientDrawable) (obj2)).setColor(0xff8361a8);
            ((GradientDrawable) (obj2)).setCornerRadius(j1);
            obj1 = new TextView(a);
            ((TextView) (obj1)).setTextColor(-1);
            ((TextView) (obj1)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj2)));
            ((TextView) (obj1)).setText("INSTALL");
            ((TextView) (obj1)).setId(j.a());
            j1 = j.a(a, 3F);
            int k1 = j.a(a, 10F);
            ((TextView) (obj1)).setPadding(k1, j1, k1, j1);
            obj2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(11, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(15, -1);
            view.addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj2)));
            obj2 = new LinearLayout(a);
            ((LinearLayout) (obj2)).setOrientation(1);
            TextView textview = new TextView(a);
            textview.setTextColor(0xff000000);
            textview.setTextSize(16F);
            textview.setSingleLine();
            ((LinearLayout) (obj2)).addView(textview);
            TextView textview1 = new TextView(a);
            textview1.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textview1.setTextColor(0xff999999);
            textview1.setTextSize(12F);
            textview1.setMaxLines(2);
            ((LinearLayout) (obj2)).addView(textview1);
            TextView textview2 = new TextView(a);
            textview2.setTextColor(0xff999999);
            textview2.setTextSize(12F);
            textview2.setSingleLine();
            Object obj3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            obj3.gravity = 80;
            ((LinearLayout) (obj2)).addView(textview2, ((android.view.ViewGroup.LayoutParams) (obj3)));
            obj3 = new android.widget.RelativeLayout.LayoutParams(-1, i1);
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).setMargins(k, 0, k, 0);
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(1, ((ImageView) (obj)).getId());
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(0, ((TextView) (obj1)).getId());
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(15, ((ImageView) (obj)).getId());
            view.addView(((View) (obj2)), ((android.view.ViewGroup.LayoutParams) (obj3)));
            viewgroup.d = ((ImageView) (obj));
            viewgroup.a = textview;
            viewgroup.b = textview1;
            viewgroup.c = textview2;
            viewgroup.e = ((TextView) (obj1));
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (com.mobvista.sdk.m.core.b.d)view.getTag();
        }
        l = i;
        if (c)
        {
            l = i + 6;
        }
        campaignex = (CampaignEx)b.get(l);
        imageview = ((com.mobvista.sdk.m.core.b.d) (viewgroup)).d;
        imageview.setImageBitmap(null);
        imageview.setTag(campaignex.getIconUrl());
        d.a().a(campaignex.getIconUrl(), new b(this, imageview));
        ((com.mobvista.sdk.m.core.b.d) (viewgroup)).a.setText(campaignex.getAppName());
        ((com.mobvista.sdk.m.core.b.d) (viewgroup)).b.setText(campaignex.getAppDesc());
        ((com.mobvista.sdk.m.core.b.d) (viewgroup)).c.setText(campaignex.getSize());
        view.setOnClickListener(new c(this, campaignex));
        return view;
    }
}
