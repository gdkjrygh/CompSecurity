// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.Context;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.actionbarsherlock.widget:
//            ShareActionProvider, ActivityChooserModel

private class <init>
    implements com.actionbarsherlock.view.r
{

    final ShareActionProvider this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = ActivityChooserModel.get(ShareActionProvider.access$0(ShareActionProvider.this), ShareActionProvider.access$1(ShareActionProvider.this)).chooseActivity(menuitem.getItemId());
        if (menuitem != null)
        {
            ShareActionProvider.access$0(ShareActionProvider.this).startActivity(menuitem);
        }
        return true;
    }

    private ()
    {
        this$0 = ShareActionProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
