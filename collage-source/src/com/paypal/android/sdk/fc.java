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
import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk:
//            gd, dz, fb, dy

public final class fc extends ArrayAdapter
{

    private int a;

    public fc(Context context, ArrayList arraylist, int i)
    {
        super(context, 0, arraylist);
        a = i;
    }

    private static int a(Context context, RelativeLayout relativelayout, String s, int i)
    {
        if (gd.c(s))
        {
            return i;
        } else
        {
            context = new TextView(context);
            context.setId(i + 1);
            android.widget.RelativeLayout.LayoutParams layoutparams = dz.a(-2, -2, 1, 2301);
            layoutparams.addRule(0, 2302);
            layoutparams.addRule(3, i);
            context.setText(s);
            dz.d(context, 83);
            dz.b(context, "6dip", null, "6dip", null);
            relativelayout.addView(context, layoutparams);
            context.setEllipsize(android.text.TextUtils.TruncateAt.END);
            return i + 1;
        }
    }

    public final void a(int i)
    {
        a = i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (fb)getItem(i);
        Context context = viewgroup.getContext();
        LinearLayout linearlayout = new LinearLayout(viewgroup.getContext());
        RelativeLayout relativelayout = new RelativeLayout(context);
        linearlayout.addView(relativelayout);
        dz.a(relativelayout, null, "6dip", null, "6dip");
        Object obj = dz.a(viewgroup.getContext(), view.a(), "");
        ((ImageView) (obj)).setId(2301);
        Object obj1 = dz.a(context, "40dip", "40dip", 9);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        relativelayout.addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (obj1)));
        dz.a(((View) (obj)), "6dip", null, null, null);
        viewgroup = dz.a(viewgroup.getContext(), "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", "checked");
        viewgroup.setId(2302);
        obj = dz.a(context, "20dip", "20dip", 11);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
        relativelayout.addView(viewgroup, ((android.view.ViewGroup.LayoutParams) (obj)));
        viewgroup.setColorFilter(dy.b);
        dz.a(viewgroup, null, null, "8dip", null);
        if (i == a)
        {
            viewgroup.setVisibility(0);
        } else
        {
            viewgroup.setVisibility(4);
        }
        viewgroup = new TextView(context);
        viewgroup.setId(2303);
        viewgroup.setText(view.f());
        dz.b(viewgroup, 83);
        dz.b(viewgroup, "6dip", null, "6dip", null);
        relativelayout.addView(viewgroup, dz.a(-2, -2, 1, 2301));
        i = a(context, relativelayout, view.g(), 2303);
        i = a(context, relativelayout, view.h(), i);
        viewgroup = new StringBuilder();
        viewgroup.append(view.i());
        viewgroup.append(" ");
        viewgroup.append(view.j());
        if (gd.d(view.k()))
        {
            viewgroup.append("  ");
            viewgroup.append(view.k());
        }
        if (!gd.d(view.l())) goto _L2; else goto _L1
_L1:
        obj = viewgroup.append("  ");
        view = view.l();
        if (gd.c(view)) goto _L4; else goto _L3
_L3:
        obj1 = Locale.getDefault().getCountry().toLowerCase(Locale.US);
        if (!gd.c(((CharSequence) (obj1))) && ((String) (obj1)).equals(view.toLowerCase(Locale.US))) goto _L4; else goto _L5
_L5:
        view = (new StringBuilder("[")).append(view).append("]").toString();
_L7:
        ((StringBuilder) (obj)).append(view);
_L2:
        a(context, relativelayout, viewgroup.toString(), i);
        return linearlayout;
_L4:
        view = "";
        if (true) goto _L7; else goto _L6
_L6:
    }
}
