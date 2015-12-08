// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.b.a;
import android.support.v4.view.t;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.model.CommonConnection;
import com.tinder.utils.HeightSizeSpan;
import com.tinder.utils.ad;
import com.tinder.views.RoundImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class d extends t
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public List j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private float p;
    private boolean q;
    private HeightSizeSpan r;
    private Context s;

    public d(Context context)
    {
        a = 2;
        b = 3;
        c = 29;
        s = context;
        p = context.getResources().getDisplayMetrics().density;
        j = new ArrayList();
        context = s.getResources();
        o = (int)ad.a(5F, s);
        l = context.getDimensionPixelSize(0x7f0900af);
        f = (int)ad.a(10F, s);
        m = o * 2;
        k = b * m + l * 2;
        int j1 = ad.a(s);
        int k1 = k;
        TextPaint textpaint = new TextPaint();
        textpaint.setTextSize(context.getDimensionPixelSize(0x7f0900ae));
        int i1 = (int)textpaint.measureText("TygO");
        n = (j1 - k1) / b;
        i = (int)((float)n * 0.9F);
        j1 = i;
        h = context.getDimensionPixelSize(0x7f0900ad) + (j1 + i1);
        e = a * b;
        r = new HeightSizeSpan();
    }

    private void a(GridLayout gridlayout, int i1)
    {
        int j1;
        int k1;
        if (j.size() > c)
        {
            j1 = c;
        } else
        {
            j1 = j.size();
        }
        k1 = e * i1;
        j1 = Math.min(j1 - k1, e);
        i1 = k1;
        while (i1 < k1 + j1) 
        {
            Object obj = (CommonConnection)j.get(i1);
            View view = LayoutInflater.from(s).inflate(0x7f030022, gridlayout, false);
            RoundImageView roundimageview = (RoundImageView)view.findViewById(0x7f0e00a8);
            roundimageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            ((TextView)view.findViewById(0x7f0e00aa)).setText(((CommonConnection) (obj)).name);
            Object obj1 = (TextView)view.findViewById(0x7f0e00a9);
            int l1 = ((CommonConnection) (obj)).degree;
            String s1 = s.getResources().getStringArray(0x7f070004)[l1];
            if (Locale.getDefault().getLanguage().contains("en"))
            {
                SpannableString spannablestring = new SpannableString(s1);
                spannablestring.setSpan(r, 1, s1.length(), 17);
                ((TextView) (obj1)).setText(spannablestring);
            } else
            {
                ((TextView) (obj1)).setText(s1);
            }
            obj1 = new android.widget.GridLayout.LayoutParams();
            obj1.width = n;
            ((android.widget.GridLayout.LayoutParams) (obj1)).setMargins(o, f, o, f);
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            obj1 = roundimageview.getLayoutParams();
            obj1.width = i;
            obj1.height = i;
            roundimageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            gridlayout.addView(view);
            obj = ((CommonConnection) (obj)).getImageForDensity(p);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                Picasso.a(s).a(((String) (obj))).b(i, i).a(roundimageview);
            } else
            {
                ColorDrawable colordrawable = new ColorDrawable(android.support.v4.b.a.b(s, 0x7f0d0095));
                colordrawable.setBounds(0, 0, i, i);
                roundimageview.setBackground(colordrawable);
            }
            i1++;
        }
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
        GridLayout gridlayout = new GridLayout(s);
        gridlayout.setUseDefaultMargins(false);
        gridlayout.setColumnCount(b);
        gridlayout.setRowCount(a);
        if (!q)
        {
            q = true;
            android.view.ViewGroup.LayoutParams layoutparams = viewgroup.getLayoutParams();
            layoutparams.height = g;
            viewgroup.setLayoutParams(layoutparams);
        }
        a(gridlayout, i1);
        viewgroup.addView(gridlayout);
        return gridlayout;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
