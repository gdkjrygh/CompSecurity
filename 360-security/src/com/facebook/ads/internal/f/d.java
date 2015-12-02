// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.f;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.g;

// Referenced classes of package com.facebook.ads.internal.f:
//            e

public abstract class d
{

    public static LinearLayout a(Context context, NativeAd nativead, g g1)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        com.facebook.ads.NativeAd.b b1 = nativead.j();
        if (b1 != null && b1.a() >= 3D)
        {
            context = new RatingBar(context, null, 0x101007d);
            context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            context.setStepSize(0.1F);
            context.setIsIndicator(true);
            context.setNumStars((int)b1.b());
            context.setRating((float)b1.a());
            linearlayout.addView(context);
            return linearlayout;
        } else
        {
            context = new e(context);
            context.setText(nativead.i());
            b(context, g1);
            linearlayout.addView(context);
            return linearlayout;
        }
    }

    public static void a(TextView textview, g g1)
    {
        textview.setTextColor(g1.c());
        textview.setTextSize(g1.h());
        textview.setTypeface(g1.a(), 1);
    }

    public static void b(TextView textview, g g1)
    {
        textview.setTextColor(g1.d());
        textview.setTextSize(g1.i());
        textview.setTypeface(g1.a());
    }
}
