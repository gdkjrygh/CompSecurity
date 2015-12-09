// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.view.MenuItem;
import com.netflix.mediaclient.ui.login.LogoutActivity;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

class this._cls0
    implements android.view.mClickListener
{

    final NetflixActivity this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        LogoutActivity.showLogoutDialog(NetflixActivity.this);
        return true;
    }

    ()
    {
        this$0 = NetflixActivity.this;
        super();
    }
}
