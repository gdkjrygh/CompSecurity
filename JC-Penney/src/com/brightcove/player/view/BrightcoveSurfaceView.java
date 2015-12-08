// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.brightcove.player.util.LayoutUtil;

// Referenced classes of package com.brightcove.player.view:
//            RenderView

public class BrightcoveSurfaceView extends SurfaceView
    implements RenderView
{

    private static final String a = com/brightcove/player/view/BrightcoveSurfaceView.getSimpleName();
    private int b;
    private int c;

    public BrightcoveSurfaceView(Context context)
    {
        super(context);
    }

    public Surface getSurface()
    {
        return getHolder().getSurface();
    }

    public int getVideoHeight()
    {
        return c;
    }

    public int getVideoWidth()
    {
        return b;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        Log.v(a, (new StringBuilder()).append("onLayout: changed = ").append(flag).append(", left = ").append(i).append(", top = ").append(j).append(", right = ").append(k).append(", bottom = ").append(l).toString());
        super.onLayout(flag, i, j, k, l);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        k = android.view.View.MeasureSpec.getSize(i);
        i = android.view.View.MeasureSpec.getMode(i);
        l = android.view.View.MeasureSpec.getSize(j);
        j = android.view.View.MeasureSpec.getMode(j);
        Log.v(a, (new StringBuilder()).append("onMeasure: width = ").append(k).append(", height = ").append(l).append(", videoWidth = ").append(b).append(", videoHeight = ").append(c).append(", widthMode = ").append(LayoutUtil.getSpecMode(i)).append(", heightMode = ").append(LayoutUtil.getSpecMode(j)).toString());
        i = l;
        j = k;
        if (b <= 0) goto _L2; else goto _L1
_L1:
        i = l;
        j = k;
        if (c <= 0) goto _L2; else goto _L3
_L3:
        if (b * l <= c * k) goto _L5; else goto _L4
_L4:
        i = (c * k) / b;
        j = k;
_L2:
        Log.v(a, (new StringBuilder()).append("setMeasuredDimension: width = ").append(j).append(", height = ").append(i).toString());
        setMeasuredDimension(j, i);
        return;
_L5:
        i = l;
        j = k;
        if (b * l < c * k)
        {
            j = (b * l) / c;
            i = l;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        Log.v(a, (new StringBuilder()).append("onSizeChanged: width = ").append(i).append(", height = ").append(j).append(", oldw = ").append(k).append(", oldh = ").append(l).toString());
        super.onSizeChanged(i, j, k, l);
    }

    public void setVideoSize(int i, int j)
    {
        b = i;
        c = j;
        if (i != 0 && j != 0)
        {
            super.requestLayout();
            super.invalidate();
        }
    }

}
