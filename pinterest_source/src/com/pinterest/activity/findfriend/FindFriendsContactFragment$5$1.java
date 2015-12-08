// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import com.pinterest.base.PermissionUtil;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsContactFragment

class this._cls1
    implements android.support.v4.app.ionsResultCallback
{

    final is._cls0 this$1;

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (PermissionUtil.checkPermission(getContext(), "android.permission.READ_CONTACTS"))
        {
            FindFriendsContactFragment.access$200(_fld0);
        }
    }

    allback()
    {
        this$1 = this._cls1.this;
        super();
    }
}
