// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;

// Referenced classes of package com.facebook.ads.internal.view:
//            i

public abstract class g
{

    public static LinearLayout a(Context context, NativeAd nativead, NativeAdViewAttributes nativeadviewattributes)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        com.facebook.ads.NativeAd.Rating rating = nativead.getAdStarRating();
        if (rating != null && rating.getValue() >= 3D)
        {
            context = new RatingBar(context, null, 0x101007d);
            context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            context.setStepSize(0.1F);
            context.setIsIndicator(true);
            context.setNumStars((int)rating.getScale());
            context.setRating((float)rating.getValue());
            linearlayout.addView(context);
            return linearlayout;
        } else
        {
            context = new i(context);
            context.setText(nativead.getAdSocialContext());
            b(context, nativeadviewattributes);
            linearlayout.addView(context);
            return linearlayout;
        }
    }

    public static void a(TextView textview, NativeAdViewAttributes nativeadviewattributes)
    {
        textview.setTextColor(nativeadviewattributes.getTitleTextColor());
        textview.setTextSize(nativeadviewattributes.getTitleTextSize());
        textview.setTypeface(nativeadviewattributes.getTypeface(), 1);
    }

    public static void b(TextView textview, NativeAdViewAttributes nativeadviewattributes)
    {
        textview.setTextColor(nativeadviewattributes.getDescriptionTextColor());
        textview.setTextSize(nativeadviewattributes.getDescriptionTextSize());
        textview.setTypeface(nativeadviewattributes.getTypeface());
    }
}
