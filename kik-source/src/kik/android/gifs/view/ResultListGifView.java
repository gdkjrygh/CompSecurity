// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.view;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package kik.android.gifs.view:
//            GifView

public class ResultListGifView extends GifView
{

    private int h;
    private int i;

    public ResultListGifView(Context context)
    {
        super(context);
        h = -1;
        i = -1;
    }

    public ResultListGifView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        i = -1;
    }

    public final void c(int j, int k)
    {
        i = k;
        h = j;
        requestLayout();
    }

    protected void onMeasure(int j, int k)
    {
        int l = android.view.View.MeasureSpec.getSize(j);
        if (h >= 0 && i >= 0)
        {
            setMeasuredDimension(l, (int)(((float)l / (float)h) * (float)i));
            return;
        } else
        {
            super.onMeasure(j, k);
            return;
        }
    }
}
