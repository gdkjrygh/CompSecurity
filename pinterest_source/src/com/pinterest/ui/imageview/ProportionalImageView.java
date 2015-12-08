// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package com.pinterest.ui.imageview:
//            WebImageView

public class ProportionalImageView extends WebImageView
{

    private boolean _disableResize;
    private float _proportion;

    public ProportionalImageView(Context context)
    {
        this(context, null);
    }

    public ProportionalImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProportionalImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _proportion = 1.0F;
        if (attributeset != null)
        {
            context = getContext().obtainStyledAttributes(attributeset, com.pinterest.R.styleable.Pinterest);
            _proportion = context.getFloat(5, 1.0F);
            context.recycle();
        }
    }

    public float getProportion()
    {
        return _proportion;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (_disableResize)
        {
            return;
        } else
        {
            i = android.view.View.MeasureSpec.getSize(i);
            setMeasuredDimension(i, (int)((float)i * _proportion));
            return;
        }
    }

    public void setDisableResize(boolean flag)
    {
        _disableResize = flag;
    }

    public void setProportion(float f)
    {
        _proportion = f;
    }
}
