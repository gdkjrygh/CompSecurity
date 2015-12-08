// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;
import com.phunware.nbc.sochi.system.NBCSystem;

// Referenced classes of package com.phunware.nbc.sochi:
//            MainNavigationContentActivity

class this._cls0 extends ActionBarDrawerToggle
{

    final MainNavigationContentActivity this$0;

    public void onDrawerClosed(View view)
    {
        supportInvalidateOptionsMenu();
        if (NBCSystem.SDK_IS_JELLY_BEAN_PLUS)
        {
            onPrepareOptionsMenu(null);
        }
    }

    public void onDrawerOpened(View view)
    {
        supportInvalidateOptionsMenu();
        if (NBCSystem.SDK_IS_JELLY_BEAN_PLUS)
        {
            onPrepareOptionsMenu(null);
        }
    }

    (Activity activity, DrawerLayout drawerlayout, int i, int j)
    {
        this$0 = MainNavigationContentActivity.this;
        super(activity, drawerlayout, i, j);
    }
}
