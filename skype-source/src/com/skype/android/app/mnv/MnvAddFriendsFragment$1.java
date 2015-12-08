// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import com.skype.android.util.PerformanceLog;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import java.util.Set;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAddFriendsFragment

final class rAdapter extends PermissionHandlerAdapter
{

    final MnvAddFriendsFragment this$0;

    public final void onDenied(Set set)
    {
        MnvAddFriendsFragment.access$100(MnvAddFriendsFragment.this, "Permission denied");
    }

    public final void onGranted()
    {
        MnvAddFriendsFragment.access$000(MnvAddFriendsFragment.this);
        PerformanceLog.e.a("USER ACTION: mnv navigate to add number screen");
    }

    rAdapter()
    {
        this$0 = MnvAddFriendsFragment.this;
        super();
    }
}
