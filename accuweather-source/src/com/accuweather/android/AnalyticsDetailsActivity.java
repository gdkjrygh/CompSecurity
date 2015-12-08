// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import com.accuweather.android.utilities.AccuAnalytics;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.accuweather.android:
//            AbsDetailsActivity

public abstract class AnalyticsDetailsActivity extends AbsDetailsActivity
{

    private boolean mIsActionBarSelectionChangingProgrammatically;

    public AnalyticsDetailsActivity()
    {
        mIsActionBarSelectionChangingProgrammatically = false;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getItemId() != R.id.refresh) goto _L2; else goto _L1
_L1:
        AccuAnalytics.logUiEvent(this, "Refresh selected");
_L4:
        return super.onMenuItemSelected(i, menuitem);
_L2:
        if (menuitem.getItemId() == R.id.settings)
        {
            AccuAnalytics.logUiEvent(this, "Settings selected");
        } else
        if (menuitem.getItemId() == 0x102002c)
        {
            AccuAnalytics.logUiEvent(this, "Action bar Home pressed");
        } else
        if (menuitem.getItemId() == R.id.share)
        {
            AccuAnalytics.logUiEvent(this, "Share selected");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        if (!mIsActionBarSelectionChangingProgrammatically)
        {
            AccuAnalytics.logUiEvent(this, "Action bar location selected", i);
        }
        mIsActionBarSelectionChangingProgrammatically = false;
        return super.onNavigationItemSelected(i, l);
    }

    protected void updateActionBarSelectedIndex(int i)
    {
        mIsActionBarSelectionChangingProgrammatically = true;
        super.updateActionBarSelectedIndex(i);
    }
}
