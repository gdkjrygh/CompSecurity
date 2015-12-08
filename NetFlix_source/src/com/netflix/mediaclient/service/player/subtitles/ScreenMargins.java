// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

public class ScreenMargins
{

    private static final String TAG = "nf_subtitles";
    private float mHorizontalMargin;
    private float mHorizontalScale;
    private float mVerticalMargin;
    private float mVerticalScale;

    public ScreenMargins()
    {
        mHorizontalMargin = 0.0F;
        mHorizontalScale = 1.0F;
        mVerticalMargin = 0.0F;
        mVerticalScale = 1.0F;
    }

    public static ScreenMargins getScreenMargins(String s, String s1, float f)
    {
        ScreenMargins screenmargins;
label0:
        {
label1:
            {
                float f2 = 0.0F;
                float f1 = 0.0F;
                screenmargins = new ScreenMargins();
                if (StringUtils.isEmpty(s))
                {
                    break label0;
                }
                if (Log.isLoggable("nf_subtitles", 3))
                {
                    Log.d("nf_subtitles", (new StringBuilder()).append("Calculate AspectDiff using extent ").append(s).toString());
                }
                s = StringUtils.extractNumberPair(s);
                if (s != null)
                {
                    s1 = StringUtils.extractNumberPair(s1);
                    if (s1 != null)
                    {
                        int i = ((Integer)((Pair) (s)).first).intValue();
                        f2 = ((Integer)((Pair) (s1)).first).intValue() * i;
                        i = ((Integer)((Pair) (s)).second).intValue();
                        f1 = ((Integer)((Pair) (s1)).first).intValue() * i;
                    } else
                    {
                        f2 = ((Integer)((Pair) (s)).first).intValue();
                        f1 = ((Integer)((Pair) (s)).second).intValue();
                    }
                }
                if (f2 > 0.0F && f1 > 0.0F)
                {
                    f1 = f2 / f1;
                } else
                {
                    f1 = 1.0F;
                }
                if (f <= 0.0F)
                {
                    f = 1.0F;
                }
                f2 = f1 / f;
                if ((double)Math.abs(f - f1) > 0.01D)
                {
                    if (f < f1)
                    {
                        break label1;
                    }
                    screenmargins.mHorizontalMargin = (1.0F - f2) / 2.0F;
                    screenmargins.mHorizontalScale = f2;
                }
                return screenmargins;
            }
            Log.e("nf_subtitles", "not implemented when videoAspect < aspect");
            return screenmargins;
        }
        Log.d("nf_subtitles", "Default AspectDiff");
        return screenmargins;
    }

    public float getHorizontalMargin()
    {
        return mHorizontalMargin;
    }

    public float getHorizontalScale()
    {
        return mHorizontalScale;
    }

    public float getVerticalMargin()
    {
        return mVerticalMargin;
    }

    public float getVerticalScale()
    {
        return mVerticalScale;
    }
}
