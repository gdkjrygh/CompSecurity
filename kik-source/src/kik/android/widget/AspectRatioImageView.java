// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package kik.android.widget:
//            a

public class AspectRatioImageView extends ImageView
    implements a
{

    private int a;
    private int b;

    public AspectRatioImageView(Context context)
    {
        this(context, null);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = -1;
        b = -1;
    }

    public final void a(int i, int j)
    {
        b = j;
        a = i;
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        if (a >= 0 && b >= 0)
        {
            float f = (float)a / (float)b;
            if ((float)k / (float)l > f)
            {
                j = (int)Math.floor((float)l * f);
                i = l;
            } else
            {
                i = (int)Math.floor((float)k / f);
                j = k;
            }
            setMeasuredDimension(j, i);
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }
}
