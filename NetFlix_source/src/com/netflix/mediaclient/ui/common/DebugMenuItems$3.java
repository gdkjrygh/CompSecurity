// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.view.MenuItem;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            DebugMenuItems

class this._cls0
    implements android.view.emClickListener
{

    final DebugMenuItems this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        AndroidUtils.dumpHprofToDisk();
        return true;
    }

    ()
    {
        this$0 = DebugMenuItems.this;
        super();
    }
}
