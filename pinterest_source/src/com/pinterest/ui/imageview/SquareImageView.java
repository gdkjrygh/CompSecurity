// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.imageview;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.pinterest.ui.imageview:
//            WebImageView

public class SquareImageView extends WebImageView
{

    public SquareImageView(Context context)
    {
        this(context, null);
    }

    public SquareImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SquareImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        i = getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(i, i);
    }
}
