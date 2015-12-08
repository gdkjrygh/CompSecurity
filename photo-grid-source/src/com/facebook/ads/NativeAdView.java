// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.view.b;

// Referenced classes of package com.facebook.ads:
//            NativeAdViewAttributes, NativeAd

public class NativeAdView
{

    public NativeAdView()
    {
    }

    public static View render(Context context, NativeAd nativead, Type type)
    {
        return render(context, nativead, type, null);
    }

    public static View render(Context context, NativeAd nativead, Type type, NativeAdViewAttributes nativeadviewattributes)
    {
        NativeAdViewAttributes nativeadviewattributes1 = nativeadviewattributes;
        if (nativeadviewattributes == null)
        {
            nativeadviewattributes1 = new NativeAdViewAttributes();
        }
        nativead.a(type);
        return new b(context, nativead, type, nativeadviewattributes1);
    }
}
