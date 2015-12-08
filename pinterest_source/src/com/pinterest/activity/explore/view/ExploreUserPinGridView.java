// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.base.Device;
import com.pinterest.kit.view.PinCollectionBaseView;
import java.util.List;

public class ExploreUserPinGridView extends PinCollectionBaseView
{

    private static final int WEIGHT_ALL_PINS[] = {
        2, 2, 3, 2, 3, 1
    };
    private static final int WEIGHT_ALL_PINS_TABLET[] = {
        2, 3, 2, 2, 2, 3, 3, 1
    };

    public ExploreUserPinGridView(Context context)
    {
        this(context, null);
    }

    public ExploreUserPinGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void adjustPinGridHeight()
    {
        _gridContainer.getLayoutParams().height = getResources().getDimensionPixelSize(0x7f0a011f);
    }

    public void setPinList(List list)
    {
        boolean flag = Device.isTablet();
        adjustPinGridHeight();
        int ai[];
        if (flag)
        {
            ai = WEIGHT_ALL_PINS_TABLET;
        } else
        {
            ai = WEIGHT_ALL_PINS;
        }
        setWeights(ai);
        setContent(list);
    }

}
