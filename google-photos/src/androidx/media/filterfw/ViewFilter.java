// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterfw;

import ahn;
import aif;
import ajl;
import ajo;
import ajq;
import ajr;
import ajw;
import akc;
import android.graphics.Rect;
import android.graphics.RectF;

public abstract class ViewFilter extends ahn
{

    public static final int SCALE_FILL = 3;
    public static final int SCALE_FIT = 2;
    public static final int SCALE_STRETCH = 1;
    public float mClearColor[] = {
        0.0F, 0.0F, 0.0F, 1.0F
    };
    public boolean mFlipVertically;
    private String mRequestedScaleMode;
    public int mScaleMode;
    private ajq mScaleModeListener;

    public ViewFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mScaleMode = 2;
        mFlipVertically = true;
        mRequestedScaleMode = null;
        mScaleModeListener = new akc(this);
    }

    public static String a(ViewFilter viewfilter)
    {
        return viewfilter.mRequestedScaleMode;
    }

    public static String a(ViewFilter viewfilter, String s)
    {
        viewfilter.mRequestedScaleMode = s;
        return s;
    }

    public final RectF a(Rect rect, Rect rect1)
    {
        RectF rectf = new RectF();
        if (rect1.width() <= 0 || rect1.height() <= 0) goto _L2; else goto _L1
_L1:
        float f;
        f = (float)rect.width() / (float)rect.height();
        f = (float)rect1.width() / (float)rect1.height() / f;
        mScaleMode;
        JVM INSTR tableswitch 1 3: default 80
    //                   1 83
    //                   2 95
    //                   3 126;
           goto _L2 _L3 _L4 _L5
_L2:
        return rectf;
_L3:
        rectf.set(0.0F, 0.0F, 1.0F, 1.0F);
        return rectf;
_L4:
        if (f <= 1.0F)
        {
            float f1 = 0.5F - 0.5F * f;
            rectf.set(0.0F, f1, 1.0F, f + f1);
            return rectf;
        }
          goto _L6
_L5:
        if (f > 1.0F)
        {
            float f2 = 0.5F - 0.5F * f;
            rectf.set(0.0F, f2, 1.0F, f + f2);
            return rectf;
        }
_L6:
        float f3 = 0.5F - 0.5F / f;
        rectf.set(f3, 0.0F, 1.0F / f + f3, 1.0F);
        return rectf;
    }

    public final void a(ajl ajl1, Rect rect, Rect rect1)
    {
        ajl1.a(a(rect, rect1));
        ajl1.a = true;
        ajl1.b = mClearColor;
        if (mFlipVertically)
        {
            ajl1.a(0.0F, 1.0F, 1.0F, -1F);
        }
    }

    public ajw b()
    {
        return (new ajw()).a("scaleMode", 1, aif.a(java/lang/String)).a("flip", 1, aif.a(Boolean.TYPE));
    }

    public final void c(ajo ajo1)
    {
        if (ajo1.b.equals("scaleMode"))
        {
            ajo1.a(mScaleModeListener);
            ajo1.g = true;
        } else
        if (ajo1.b.equals("flip"))
        {
            ajo1.a("mFlipVertically");
            ajo1.g = true;
            return;
        }
    }
}
