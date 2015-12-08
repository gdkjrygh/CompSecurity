// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.view.MenuItem;
import com.skype.android.app.search.SearchWidget;

// Referenced classes of package com.skype.android.app.main:
//            HubMaterialActivity

final class this._cls0
    implements android.support.v4.view.._cls6
{

    final HubMaterialActivity this$0;

    public final boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        if (searchWidget.onInterceptBackButton())
        {
            return false;
        } else
        {
            HubMaterialActivity.access$300(HubMaterialActivity.this, 160);
            return true;
        }
    }

    public final boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        HubMaterialActivity.access$200(HubMaterialActivity.this, 160);
        return true;
    }

    ()
    {
        this$0 = HubMaterialActivity.this;
        super();
    }
}
