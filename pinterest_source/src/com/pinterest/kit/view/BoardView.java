// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.pinterest.kit.view:
//            PinCollectionBaseView

public class BoardView extends PinCollectionBaseView
{

    private static double a = 0.66666666666666663D;

    public BoardView(Context context)
    {
        super(context);
    }

    public BoardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected int getLayoutId()
    {
        return 0x7f03002d;
    }

    protected void init()
    {
        super.init();
        _fadeInImages = true;
    }

    protected void onMeasure(int i, int j)
    {
        i = android.view.View.MeasureSpec.getSize(i);
        j = (int)((double)i * a);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
    }

}
