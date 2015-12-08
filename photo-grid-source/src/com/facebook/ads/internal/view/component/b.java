// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.view.g;
import com.facebook.ads.internal.view.i;

// Referenced classes of package com.facebook.ads.internal.view.component:
//            c, a

public class b extends LinearLayout
{

    private ImageView a;
    private a b;
    private TextView c;
    private LinearLayout d;
    private DisplayMetrics e;

    public b(Context context, NativeAd nativead, NativeAdViewAttributes nativeadviewattributes, boolean flag, int j)
    {
        super(context);
        e = context.getResources().getDisplayMetrics();
        setVerticalGravity(16);
        setOrientation(1);
        context = new LinearLayout(getContext());
        context.setOrientation(1);
        context.setGravity(16);
        Object obj = new android.widget.LinearLayout.LayoutParams(-1, -1);
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(Math.round(15F * e.density), Math.round(15F * e.density), Math.round(15F * e.density), Math.round(15F * e.density));
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        addView(context);
        d = new LinearLayout(getContext());
        obj = new android.widget.LinearLayout.LayoutParams(-1, 0);
        d.setOrientation(0);
        d.setGravity(16);
        obj.weight = 3F;
        d.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        context.addView(d);
        a = new c(getContext());
        j = a(flag, j);
        obj = new android.widget.LinearLayout.LayoutParams(Math.round((float)j * e.density), Math.round((float)j * e.density));
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, 0, Math.round(15F * e.density), 0);
        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        NativeAd.downloadAndDisplayImage(nativead.getAdIcon(), a);
        d.addView(a);
        obj = new LinearLayout(getContext());
        ((LinearLayout) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        ((LinearLayout) (obj)).setOrientation(0);
        ((LinearLayout) (obj)).setGravity(16);
        d.addView(((android.view.View) (obj)));
        b = new a(getContext(), nativead, nativeadviewattributes);
        Object obj1 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        ((android.widget.LinearLayout.LayoutParams) (obj1)).setMargins(0, 0, Math.round(15F * e.density), 0);
        obj1.weight = 0.5F;
        b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((LinearLayout) (obj)).addView(b);
        c = new TextView(getContext());
        c.setPadding(Math.round(6F * e.density), Math.round(6F * e.density), Math.round(6F * e.density), Math.round(6F * e.density));
        c.setText(nativead.getAdCallToAction());
        c.setTextColor(nativeadviewattributes.getButtonTextColor());
        c.setTextSize(14F);
        c.setTypeface(nativeadviewattributes.getTypeface(), 1);
        c.setMaxLines(2);
        c.setEllipsize(android.text.TextUtils.TruncateAt.END);
        c.setGravity(17);
        obj1 = new GradientDrawable();
        ((GradientDrawable) (obj1)).setColor(nativeadviewattributes.getButtonColor());
        ((GradientDrawable) (obj1)).setCornerRadius(5F * e.density);
        ((GradientDrawable) (obj1)).setStroke(1, nativeadviewattributes.getButtonBorderColor());
        c.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj1)));
        obj1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj1.weight = 0.25F;
        c.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((LinearLayout) (obj)).addView(c);
        if (flag)
        {
            i k = new i(getContext());
            k.setText(nativead.getAdBody());
            g.b(k, nativeadviewattributes);
            k.setMinTextSize(nativeadviewattributes.getDescriptionTextSize() - 1);
            nativead = new android.widget.LinearLayout.LayoutParams(-1, 0);
            nativead.weight = 1.0F;
            k.setLayoutParams(nativead);
            k.setGravity(80);
            context.addView(k);
        }
    }

    private int a(boolean flag, int j)
    {
        double d1;
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        d1 = 3D / (double)(k + 3);
        return (int)((double)(j - 30) * d1);
    }

    public TextView getCallToActionView()
    {
        return c;
    }

    public ImageView getIconView()
    {
        return a;
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        TextView textview = b.getTitleTextView();
        if (textview.getLayout().getLineEnd(textview.getLineCount() - 1) < b.getMinVisibleTitleCharacters())
        {
            d.removeView(a);
            super.onMeasure(j, k);
        }
    }
}
