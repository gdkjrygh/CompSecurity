// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.view.b;

// Referenced classes of package com.facebook.ads:
//            NativeAd, NativeAdViewAttributes

public class NativeAdView
{
    public static final class Type extends Enum
    {

        public static final Type HEIGHT_100;
        public static final Type HEIGHT_120;
        public static final Type HEIGHT_300;
        public static final Type HEIGHT_400;
        private static final Type c[];
        private final int a;
        private final int b;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/facebook/ads/NativeAdView$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])c.clone();
        }

        public int getHeight()
        {
            return b;
        }

        public int getValue()
        {
            switch (b)
            {
            default:
                return -1;

            case 100: // 'd'
                return 1;

            case 120: // 'x'
                return 2;

            case 300: 
                return 3;

            case 400: 
                return 4;
            }
        }

        public int getWidth()
        {
            return a;
        }

        static 
        {
            HEIGHT_100 = new Type("HEIGHT_100", 0, -1, 100);
            HEIGHT_120 = new Type("HEIGHT_120", 1, -1, 120);
            HEIGHT_300 = new Type("HEIGHT_300", 2, -1, 300);
            HEIGHT_400 = new Type("HEIGHT_400", 3, -1, 400);
            c = (new Type[] {
                HEIGHT_100, HEIGHT_120, HEIGHT_300, HEIGHT_400
            });
        }

        private Type(String s, int i, int j, int k)
        {
            super(s, i);
            a = j;
            b = k;
        }
    }


    public NativeAdView()
    {
    }

    public static View render(Context context, NativeAd nativead, Type type)
    {
        return render(context, nativead, type, null);
    }

    public static View render(Context context, NativeAd nativead, Type type, NativeAdViewAttributes nativeadviewattributes)
    {
        if (!nativead.isNativeConfigEnabled()) goto _L2; else goto _L1
_L1:
        NativeAdViewAttributes nativeadviewattributes1 = nativead.getAdViewAttributes();
_L4:
        nativead.a(type);
        return new b(context, nativead, type, nativeadviewattributes1);
_L2:
        nativeadviewattributes1 = nativeadviewattributes;
        if (nativeadviewattributes == null)
        {
            nativeadviewattributes1 = new NativeAdViewAttributes();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
