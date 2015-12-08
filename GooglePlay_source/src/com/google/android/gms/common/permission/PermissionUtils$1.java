// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.permission;

import android.os.Process;

// Referenced classes of package com.google.android.gms.common.permission:
//            PermissionUtils

public final class this._cls0
    implements android.content.pm.ermissionsChangedListener
{

    final PermissionUtils this$0;

    public final void onPermissionsChanged(int i)
    {
        if (Process.myUid() == i)
        {
            resetMissingPermissionGroups();
        }
    }

    public ner()
    {
        this$0 = PermissionUtils.this;
        super();
    }
}
