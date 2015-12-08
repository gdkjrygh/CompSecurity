// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import com.soundcloud.android.utils.ViewUtils;

// Referenced classes of package com.soundcloud.android.view:
//            CustomFontTextView

public class SnappedTagView extends CustomFontTextView
{

    private static final int GRID_SIZE_DP = 8;
    private static final int MAX_WIDTH_PADDING_DP = 8;

    public SnappedTagView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = android.view.View.MeasureSpec.getSize(i);
        j = ViewUtils.dpToPx(getContext(), 8);
        setMeasuredDimension(roundUpWidth(getMeasuredWidth(), i - j), getMeasuredHeight());
    }

    int roundUpWidth(int i, int j)
    {
        int k = ViewUtils.dpToPx(getContext(), 8);
        return Math.min(j, (k - i % k) + i);
    }
}
