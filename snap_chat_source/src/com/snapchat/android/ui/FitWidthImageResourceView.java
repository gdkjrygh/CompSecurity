// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Fe;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

// Referenced classes of package com.snapchat.android.ui:
//            ImageResourceView

public class FitWidthImageResourceView extends ImageResourceView
{

    public FitWidthImageResourceView(Context context)
    {
        super(context);
    }

    public FitWidthImageResourceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FitWidthImageResourceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (c != null && c.c() == SnapchatResource.ResourceStatus.LOADED)
        {
            Drawable drawable = getDrawable();
            if (drawable != null)
            {
                i = android.view.View.MeasureSpec.getSize(i);
                j = drawable.getIntrinsicWidth();
                if (j > 0)
                {
                    setMeasuredDimension(i, (drawable.getIntrinsicHeight() * i) / j);
                }
                return;
            }
        }
        j = android.view.View.MeasureSpec.getSize(i);
        if (d != 0 && e != 0)
        {
            i = (int)(((float)j * (float)e) / (float)d);
        } else
        {
            DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
            i = (int)(((float)j * (float)displaymetrics.heightPixels) / (float)displaymetrics.widthPixels);
        }
        setMeasuredDimension(j, i);
    }
}
