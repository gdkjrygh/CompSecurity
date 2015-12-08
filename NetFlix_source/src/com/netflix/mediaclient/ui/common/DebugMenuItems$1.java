// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.content.Intent;
import android.view.MenuItem;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            DebugMenuItems

class this._cls0
    implements android.view.emClickListener
{

    final DebugMenuItems this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        Log.d(DebugMenuItems.access$000(DebugMenuItems.this), "Sending home refresh: com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO");
        DebugMenuItems.access$100(DebugMenuItems.this).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO"));
        return true;
    }

    ivity()
    {
        this$0 = DebugMenuItems.this;
        super();
    }
}
