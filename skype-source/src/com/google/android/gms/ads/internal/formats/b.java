// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.gn;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            a

final class b extends RelativeLayout
{

    private static final float a[] = {
        5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
    };
    private final RelativeLayout b;

    public b(Context context, com.google.android.gms.ads.internal.formats.a a1)
    {
        super(context);
        y.a(a1);
        Object obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
        Object obj1 = new ShapeDrawable(new RoundRectShape(a, null, null));
        ((ShapeDrawable) (obj1)).getPaint().setColor(a1.c());
        b = new RelativeLayout(context);
        b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        p.g().a(b, ((android.graphics.drawable.Drawable) (obj1)));
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        obj = new TextView(context);
        ((TextView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((TextView) (obj)).setId(0x47470001);
        ((TextView) (obj)).setTypeface(Typeface.DEFAULT);
        ((TextView) (obj)).setText(a1.a());
        ((TextView) (obj)).setTextColor(a1.d());
        ((TextView) (obj)).setTextSize(a1.e());
        n.a();
        int i = com.google.android.gms.ads.internal.util.client.a.a(context, 4);
        n.a();
        ((TextView) (obj)).setPadding(i, 0, com.google.android.gms.ads.internal.util.client.a.a(context, 4), 0);
        obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(1, ((TextView) (obj)).getId());
        context = new ImageView(context);
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        context.setId(0x47470002);
        context.setImageDrawable(a1.b());
        b.addView(((android.view.View) (obj)));
        b.addView(context);
        addView(b);
    }

    public final ViewGroup a()
    {
        return b;
    }

}
