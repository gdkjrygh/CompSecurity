// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.view;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package kik.android.gifs.view:
//            GifView

public class AspectRatioGifView extends GifView
{

    private int h;
    private int i;

    public AspectRatioGifView(Context context)
    {
        super(context);
        h = -1;
        i = -1;
    }

    public AspectRatioGifView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        i = -1;
    }

    public final void c(int j, int k)
    {
        i = k;
        h = j;
    }

    protected void onMeasure(int j, int k)
    {
        int l = android.view.View.MeasureSpec.getSize(j);
        int i1 = android.view.View.MeasureSpec.getSize(k);
        if (h >= 0 && i >= 0)
        {
            float f = (float)h / (float)i;
            if ((float)l / (float)i1 > f)
            {
                k = (int)Math.floor((float)i1 * f);
                j = i1;
            } else
            {
                j = (int)Math.floor((float)l / f);
                k = l;
            }
            setMeasuredDimension(k, j);
            return;
        } else
        {
            super.onMeasure(j, k);
            return;
        }
    }
}
