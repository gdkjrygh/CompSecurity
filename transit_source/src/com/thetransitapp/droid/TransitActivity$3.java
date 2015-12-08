// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.thetransitapp.droid:
//            TransitActivity, OptionScreen, RoutesScreen

class this._cls0
    implements com.actionbarsherlock.view.mClickListener
{

    final TransitActivity this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        if (getDisplayedScreen() != ansitScreen.OPTION_SCREEN)
        {
            TransitActivity.access$5(TransitActivity.this, new OptionScreen(), ansitScreen.OPTION_SCREEN, true);
            if (TransitActivity.access$2(TransitActivity.this) != null)
            {
                TransitActivity.access$2(TransitActivity.this).clearError();
            }
            return true;
        } else
        {
            return false;
        }
    }

    ansitScreen()
    {
        this$0 = TransitActivity.this;
        super();
    }
}
