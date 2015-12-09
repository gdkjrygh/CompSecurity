// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.paypal.android.sdk:
//            dz, ep, em, ek, 
//            es, er, dy

public final class eq extends ArrayAdapter
{

    private int a;

    public eq(Context context, ArrayList arraylist, int i)
    {
        super(context, 0, arraylist);
        a = i;
    }

    private static void a(Context context, RelativeLayout relativelayout, ep ep1)
    {
        Object obj1 = new LinearLayout(context);
        ((LinearLayout) (obj1)).setId(2304);
        char c = '\u0900';
        ((LinearLayout) (obj1)).setOrientation(0);
        Object obj = dz.a(-2, -2, 1, 2301);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(0, 2303);
        relativelayout.addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new TextView(context);
        ((TextView) (obj)).setId(2302);
        dz.b(((TextView) (obj)), 83);
        ((LinearLayout) (obj1)).addView(((View) (obj)));
        dz.b(((View) (obj)), "6dip", null, null, null);
        TextView textview = new TextView(context);
        dz.d(textview, 83);
        ((LinearLayout) (obj1)).addView(textview);
        dz.b(textview, "6dip", null, "6dip", null);
        if (ep1.e())
        {
            obj1 = new TextView(context);
            ((TextView) (obj1)).setId(2306);
            c = '\u0902';
            dz.c(((TextView) (obj1)), 83);
            android.widget.RelativeLayout.LayoutParams layoutparams = dz.a(-2, -2, 1, 2301);
            layoutparams.addRule(0, 2303);
            layoutparams.addRule(3, 2304);
            relativelayout.addView(((View) (obj1)), layoutparams);
            dz.b(((View) (obj1)), "6dip", null, null, null);
            ((TextView) (obj1)).setText(ek.a(em.av));
        }
        obj1 = ep1.f().iterator();
        int j = 2400;
        int i = 2500;
        while (((Iterator) (obj1)).hasNext()) 
        {
            Object obj2 = (er)((Iterator) (obj1)).next();
            TextView textview1 = new TextView(context);
            textview1.setId(j);
            textview1.setText((new StringBuilder()).append(((er) (obj2)).a()).append(" ").append(((er) (obj2)).b()).toString());
            android.widget.RelativeLayout.LayoutParams layoutparams1 = dz.a(-2, -2, 1, 2301);
            layoutparams1.addRule(0, i);
            if (textview1.getId() == 2400)
            {
                layoutparams1.addRule(3, c);
            } else
            {
                layoutparams1.addRule(3, textview1.getId() - 1);
            }
            relativelayout.addView(textview1, layoutparams1);
            dz.e(textview1, 83);
            dz.b(textview1, "6dip", null, null, null);
            textview1.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textview1 = new TextView(context);
            textview1.setId(i);
            textview1.setText(((er) (obj2)).c());
            obj2 = dz.a(-2, -2, 0, 2303);
            ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(8, j);
            relativelayout.addView(textview1, ((android.view.ViewGroup.LayoutParams) (obj2)));
            dz.d(textview1, 85);
            dz.b(textview1, "6dip", null, "6dip", null);
            j++;
            i++;
        }
        ((TextView) (obj)).setText(ep1.c());
        ((TextView) (obj)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        textview.setText(ep1.d());
        textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
    }

    public final void a(int i)
    {
        a = i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (ep)getItem(i);
        LinearLayout linearlayout = new LinearLayout(viewgroup.getContext());
        RelativeLayout relativelayout = new RelativeLayout(viewgroup.getContext());
        linearlayout.addView(relativelayout);
        dz.a(relativelayout, null, "6dip", null, "6dip");
        ImageView imageview = dz.a(viewgroup.getContext(), view.a(), "");
        imageview.setId(2301);
        android.widget.RelativeLayout.LayoutParams layoutparams = dz.a(viewgroup.getContext(), "30dip", "30dip", 9);
        layoutparams.addRule(10);
        relativelayout.addView(imageview, layoutparams);
        dz.a(imageview, "4dip", null, null, null);
        imageview = dz.a(viewgroup.getContext(), "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", "checked");
        imageview.setId(2303);
        layoutparams = dz.a(viewgroup.getContext(), "20dip", "20dip", 11);
        layoutparams.addRule(10);
        relativelayout.addView(imageview, layoutparams);
        imageview.setColorFilter(dy.b);
        dz.a(imageview, null, null, "8dip", null);
        if (i != a)
        {
            imageview.setVisibility(4);
        }
        if (view.g())
        {
            Object obj = viewgroup.getContext();
            viewgroup = new TextView(((Context) (obj)));
            viewgroup.setId(2302);
            i = 2302;
            dz.b(viewgroup, 83);
            Object obj1 = dz.a(-2, -2, 1, 2301);
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(0, 2303);
            relativelayout.addView(viewgroup, ((android.view.ViewGroup.LayoutParams) (obj1)));
            dz.b(viewgroup, "6dip", null, null, null);
            if (view.e())
            {
                obj1 = new TextView(((Context) (obj)));
                ((TextView) (obj1)).setId(2306);
                i = 2306;
                dz.c(((TextView) (obj1)), 83);
                android.widget.RelativeLayout.LayoutParams layoutparams1 = dz.a(-2, -2, 1, 2301);
                layoutparams1.addRule(0, 2303);
                layoutparams1.addRule(3, 2302);
                relativelayout.addView(((View) (obj1)), layoutparams1);
                dz.b(((View) (obj1)), "6dip", null, null, null);
                ((TextView) (obj1)).setText(ek.a(em.av));
            }
            obj1 = new TextView(((Context) (obj)));
            ((TextView) (obj1)).setId(2305);
            dz.d(((TextView) (obj1)), 83);
            android.widget.RelativeLayout.LayoutParams layoutparams2 = dz.a(-2, -2, 1, 2301);
            layoutparams2.addRule(3, i);
            relativelayout.addView(((View) (obj1)), layoutparams2);
            dz.b(((View) (obj1)), "6dip", null, null, null);
            obj = new TextView(((Context) (obj)));
            layoutparams2 = dz.a(-2, -2, 0, 2303);
            layoutparams2.addRule(8, 2305);
            relativelayout.addView(((View) (obj)), layoutparams2);
            dz.d(((TextView) (obj)), 85);
            dz.b(((View) (obj)), null, null, "6dip", null);
            viewgroup.setText(view.c());
            ((TextView) (obj1)).setText(view.d());
            ((TextView) (obj)).setText(view.f().a(0).c());
            return linearlayout;
        } else
        {
            a(viewgroup.getContext(), relativelayout, view);
            return linearlayout;
        }
    }
}
