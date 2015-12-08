// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentVerticalLayoutManager;

public class evf extends aai
{

    private MomentVerticalLayoutManager g;

    public evf(MomentVerticalLayoutManager momentverticallayoutmanager, Context context)
    {
        g = momentverticallayoutmanager;
        super(context);
    }

    protected final float a(DisplayMetrics displaymetrics)
    {
        return super.a(displaymetrics) * 2.0F;
    }

    public final PointF a(int i)
    {
        return new PointF(0.0F, i - g.a);
    }
}
