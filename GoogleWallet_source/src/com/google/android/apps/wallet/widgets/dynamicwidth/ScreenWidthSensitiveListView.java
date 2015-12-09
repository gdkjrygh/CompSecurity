// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.dynamicwidth;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;

// Referenced classes of package com.google.android.apps.wallet.widgets.dynamicwidth:
//            SpaceAdder

public class ScreenWidthSensitiveListView extends ListView
{

    private boolean ignoreHeadersAndFootersForAccessibility;

    public ScreenWidthSensitiveListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ignoreHeadersAndFootersForAccessibility = false;
        SpaceAdder.padIfNecessary(this);
    }

    private int getRealPosition(int i)
    {
        int j = getCount();
        int k = getHeaderViewsCount();
        int l = getFooterViewsCount();
        if (i < k)
        {
            return 0;
        }
        if (i >= getCount() - l)
        {
            return j - k - l - 1;
        } else
        {
            return i - k;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        if (ignoreHeadersAndFootersForAccessibility)
        {
            accessibilityevent.setCurrentItemIndex(getRealPosition(getSelectedItemPosition()));
            accessibilityevent.setFromIndex(getRealPosition(getFirstVisiblePosition()));
            accessibilityevent.setToIndex(getRealPosition(getLastVisiblePosition()));
            accessibilityevent.setItemCount(getRealPosition(getCount() - 1) + 1);
        }
    }

    public final ScreenWidthSensitiveListView setIgnoreHeadersAndFootersForAccessibility(boolean flag)
    {
        ignoreHeadersAndFootersForAccessibility = flag;
        return this;
    }
}
