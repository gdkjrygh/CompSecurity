// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import com.skype.android.config.ConfigUpdater;
import com.skype.android.util.permission.PermissionHandlerAdapter;

// Referenced classes of package com.skype.android.app.main:
//            AbstractHubActivity

final class erAdapter extends PermissionHandlerAdapter
{

    final AbstractHubActivity this$0;

    public final void onGranted()
    {
        (new ConfigUpdater(getApplication())).configureLogging();
    }

    erAdapter()
    {
        this$0 = AbstractHubActivity.this;
        super();
    }
}
