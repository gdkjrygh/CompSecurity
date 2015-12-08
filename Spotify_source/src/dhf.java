// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;

public class dhf extends aai
{

    private com.spotify.android.paste.widget.carousel.CarouselLayoutManager.ScrollDirection g;

    public dhf(Context context, com.spotify.android.paste.widget.carousel.CarouselLayoutManager.ScrollDirection scrolldirection)
    {
        super(context);
        g = scrolldirection;
    }

    public float a(DisplayMetrics displaymetrics)
    {
        return super.a(displaymetrics) * 2.0F;
    }

    public final PointF a(int i)
    {
        boolean flag;
        flag = true;
        i = ((flag) ? 1 : 0);
        com.spotify.android.paste.widget.carousel.CarouselLayoutManager._cls1.a[g.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 49
    //                   2 38;
           goto _L1 _L2 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        i = ((flag) ? 1 : 0);
_L5:
        return new PointF(i, 0.0F);
_L2:
        i = -1;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
