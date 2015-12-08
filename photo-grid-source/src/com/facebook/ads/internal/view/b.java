// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.util.k;
import com.facebook.ads.internal.view.component.d;
import java.util.Arrays;

// Referenced classes of package com.facebook.ads.internal.view:
//            j, f

public class b extends RelativeLayout
{

    private final NativeAdViewAttributes a;
    private final NativeAd b;
    private final int c;
    private final DisplayMetrics d;

    public b(Context context, NativeAd nativead, com.facebook.ads.NativeAdView.Type type, NativeAdViewAttributes nativeadviewattributes)
    {
        super(context);
        setBackgroundColor(nativeadviewattributes.getBackgroundColor());
        a = nativeadviewattributes;
        b = nativead;
        d = context.getResources().getDisplayMetrics();
        c = type.getHeight();
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, Math.round((float)c * d.density)));
        nativeadviewattributes = new j(context);
        nativeadviewattributes.setMinWidth(Math.round(280F * d.density));
        nativeadviewattributes.setMaxWidth(Math.round(375F * d.density));
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(13, -1);
        nativeadviewattributes.setLayoutParams(layoutparams);
        addView(nativeadviewattributes);
        context = new LinearLayout(context);
        context.setOrientation(1);
        context.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        nativeadviewattributes.addView(context);
        _cls1.a[type.ordinal()];
        JVM INSTR tableswitch 1 2: default 212
    //                   1 308
    //                   2 313;
           goto _L1 _L2 _L3
_L1:
        a(context, type);
        context = new AdChoicesView(getContext(), nativead);
        nativead = (android.widget.RelativeLayout.LayoutParams)context.getLayoutParams();
        nativead.addRule(11);
        nativead.setMargins(Math.round(d.density * 4F), Math.round(d.density * 4F), Math.round(d.density * 4F), Math.round(d.density * 4F));
        nativeadviewattributes.addView(context);
        return;
_L2:
        b(context);
_L3:
        a(context);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(ViewGroup viewgroup)
    {
        RelativeLayout relativelayout = new RelativeLayout(getContext());
        relativelayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, Math.round(d.density * 180F)));
        relativelayout.setBackgroundColor(a.getBackgroundColor());
        f f1 = new f(getContext());
        relativelayout.addView(f1);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, (int)(d.density * 180F));
        layoutparams.addRule(13, -1);
        f1.setLayoutParams(layoutparams);
        (new k(f1)).execute(new String[] {
            b.getAdCoverImage().getUrl()
        });
        viewgroup.addView(relativelayout);
    }

    private void a(ViewGroup viewgroup, com.facebook.ads.NativeAdView.Type type)
    {
        com.facebook.ads.internal.view.component.b b1 = new com.facebook.ads.internal.view.component.b(getContext(), b, a, a(type), b(type));
        b1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, Math.round((float)b(type) * d.density)));
        viewgroup.addView(b1);
        b.registerViewForInteraction(this, Arrays.asList(new View[] {
            b1.getIconView(), b1.getCallToActionView()
        }));
    }

    private boolean a(com.facebook.ads.NativeAdView.Type type)
    {
        return type == com.facebook.ads.NativeAdView.Type.HEIGHT_300 || type == com.facebook.ads.NativeAdView.Type.HEIGHT_120;
    }

    private int b(com.facebook.ads.NativeAdView.Type type)
    {
        switch (_cls1.a[type.ordinal()])
        {
        default:
            return 0;

        case 3: // '\003'
        case 4: // '\004'
            return type.getHeight();

        case 2: // '\002'
            return type.getHeight() - 180;

        case 1: // '\001'
            return (type.getHeight() - 180) / 2;
        }
    }

    private void b(ViewGroup viewgroup)
    {
        d d1 = new d(getContext(), b, a);
        d1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, Math.round(110F * d.density)));
        viewgroup.addView(d1);
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.facebook.ads.NativeAdView.Type.values().length];
            try
            {
                a[com.facebook.ads.NativeAdView.Type.HEIGHT_400.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.facebook.ads.NativeAdView.Type.HEIGHT_300.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.facebook.ads.NativeAdView.Type.HEIGHT_100.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.facebook.ads.NativeAdView.Type.HEIGHT_120.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
