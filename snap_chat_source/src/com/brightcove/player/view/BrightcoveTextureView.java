// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.brightcove.player.util.LayoutUtil;

// Referenced classes of package com.brightcove.player.view:
//            RenderView

public class BrightcoveTextureView extends TextureView
    implements RenderView
{

    private int a;
    private int b;
    private int c;
    private int d;
    private Surface e;

    public BrightcoveTextureView(Context context)
    {
        super(context);
    }

    public SurfaceHolder getHolder()
    {
        return null;
    }

    public int getMeasuredVideoHeight()
    {
        return d;
    }

    public int getMeasuredVideoWidth()
    {
        return c;
    }

    public Surface getSurface()
    {
        if (e == null)
        {
            e = new Surface(getSurfaceTexture());
        }
        return e;
    }

    public int getVideoHeight()
    {
        return b;
    }

    public int getVideoWidth()
    {
        return a;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        (new StringBuilder("onLayout: changed = ")).append(flag).append(", left = ").append(i).append(", top = ").append(j).append(", right = ").append(k).append(", bottom = ").append(l);
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
        (new StringBuilder("onMeasure: width = ")).append(k).append(", height = ").append(l).append(", videoWidth = ").append(a).append(", videoHeight = ").append(b).append(", widthMode = ").append(LayoutUtil.getSpecMode(i)).append(", heightMode = ").append(LayoutUtil.getSpecMode(j));
        i = l;
        j = k;
        if (a <= 0) goto _L2; else goto _L1
_L1:
        i = l;
        j = k;
        if (b <= 0) goto _L2; else goto _L3
_L3:
        if (a * l <= b * k) goto _L5; else goto _L4
_L4:
        i = (b * k) / a;
        j = k;
_L2:
        (new StringBuilder("setMeasuredDimension: width = ")).append(j).append(", height = ").append(i);
        d = i;
        c = j;
        setMeasuredDimension(j, i);
        return;
_L5:
        i = l;
        j = k;
        if (a * l < b * k)
        {
            j = (a * l) / b;
            i = l;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        (new StringBuilder("onSizeChanged: width = ")).append(i).append(", height = ").append(j).append(", oldw = ").append(k).append(", oldh = ").append(l);
        super.onSizeChanged(i, j, k, l);
    }

    public void setVideoSize(int i, int j)
    {
        a = i;
        b = j;
        if (i != 0 && j != 0)
        {
            super.requestLayout();
            super.invalidate();
        }
    }

    static 
    {
        com/brightcove/player/view/BrightcoveTextureView.getSimpleName();
    }
}
