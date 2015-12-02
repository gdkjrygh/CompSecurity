// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.shadow;

import android.content.Context;
import com.qihoo360.mobilesafe.b.l;

public final class ZDepth extends Enum
{

    public static final ZDepth Depth0;
    public static final ZDepth Depth1;
    public static final ZDepth Depth2;
    public static final ZDepth Depth3;
    public static final ZDepth Depth4;
    public static final ZDepth Depth5;
    private static final ZDepth a[];
    public final int mAlphaBottomShadow;
    public final int mAlphaTopShadow;
    public final float mBlurBottomShadow;
    public final float mBlurTopShadow;
    public final float mOffsetYBottomShadow;
    public final float mOffsetYTopShadow;

    private ZDepth(String s, int i, int j, int k, float f, float f1, float f2, 
            float f3)
    {
        super(s, i);
        mAlphaTopShadow = j;
        mAlphaBottomShadow = k;
        mOffsetYTopShadow = f;
        mOffsetYBottomShadow = f1;
        mBlurTopShadow = f2;
        mBlurBottomShadow = f3;
    }

    public static ZDepth valueOf(String s)
    {
        return (ZDepth)Enum.valueOf(com/qihoo/security/widget/shadow/ZDepth, s);
    }

    public static ZDepth[] values()
    {
        return (ZDepth[])a.clone();
    }

    public int getAlphaBottomShadow()
    {
        return mAlphaBottomShadow;
    }

    public int getAlphaTopShadow()
    {
        return mAlphaTopShadow;
    }

    public float getBlurBottomShadowPx(Context context)
    {
        return l.a(context, mBlurBottomShadow);
    }

    public float getBlurTopShadowPx(Context context)
    {
        return l.a(context, mBlurTopShadow);
    }

    public float getOffsetYBottomShadowPx(Context context)
    {
        return l.a(context, mOffsetYBottomShadow);
    }

    public float getOffsetYTopShadowPx(Context context)
    {
        return l.a(context, mOffsetYTopShadow);
    }

    static 
    {
        Depth0 = new ZDepth("Depth0", 0, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F);
        Depth1 = new ZDepth("Depth1", 1, 10, 30, 2.0F, 3F, 2.0F, 3F);
        Depth2 = new ZDepth("Depth2", 2, 0, 33, 2.0F, 2.0F, 2.0F, 2.0F);
        Depth3 = new ZDepth("Depth3", 3, 48, 58, 10F, 6F, 10F, 3F);
        Depth4 = new ZDepth("Depth4", 4, 64, 56, 14F, 10F, 14F, 5F);
        Depth5 = new ZDepth("Depth5", 5, 0, 33, 0.0F, 2.0F, 0.0F, 3F);
        a = (new ZDepth[] {
            Depth0, Depth1, Depth2, Depth3, Depth4, Depth5
        });
    }
}
