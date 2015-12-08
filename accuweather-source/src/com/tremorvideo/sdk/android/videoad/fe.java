// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ga, gd, ct, cy, 
//            ff, fg

public class fe
{
    public static interface a
    {

        public abstract void a(int i);
    }


    gd a;
    String b;
    String c;
    String d;
    int e;

    public fe(gd gd1, String s, String s1, String s2)
    {
        a = gd1;
        b = s;
        c = s1;
        d = s2;
        e = -1;
    }

    public View a(Context context, a a1)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setBackgroundDrawable(new ga(a.a(gd.b.P), a.a(gd.b.Q)));
        linearlayout.setGravity(1);
        linearlayout.setPadding(5, 5, 5, 5);
        TextView textview = new TextView(context);
        textview.setText(b);
        textview.setTextSize(ct.G());
        textview.setTypeface(Typeface.create("helvetica", 1));
        textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textview.setTextColor(a.a(gd.a.g));
        textview.setShadowLayer(1.2F, 1.0F, 1.0F, a.a(gd.a.h));
        textview.setMaxLines(2);
        textview.setPadding(0, 0, 5, 0);
        textview.setGravity(19);
        Object obj = new ga(a.a(gd.b.R), a.a(gd.b.S));
        Object obj1 = new ga(a.a(gd.b.T), a.a(gd.b.U));
        obj = new cy(context, c, 100, a, ((android.graphics.drawable.Drawable) (obj)), ((android.graphics.drawable.Drawable) (obj1)));
        ((cy) (obj)).setOnClickListener(new ff(this, a1));
        obj1 = new ga(a.a(gd.b.R), a.a(gd.b.S));
        ga ga1 = new ga(a.a(gd.b.T), a.a(gd.b.U));
        obj1 = new cy(context, d, 100, a, ((android.graphics.drawable.Drawable) (obj1)), ga1);
        ((cy) (obj1)).setOnClickListener(new fg(this, a1));
        a1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        a1.weight = 0.8F;
        linearlayout.addView(textview, a1);
        a1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        a1.gravity = 21;
        linearlayout.addView(((View) (obj)), a1);
        a1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        a1.gravity = 21;
        a1.leftMargin = 2;
        linearlayout.addView(((View) (obj1)), a1);
        context = new LinearLayout(context);
        context.setPadding(10, 0, 10, 0);
        context.addView(linearlayout, -2, -2);
        return context;
    }
}
