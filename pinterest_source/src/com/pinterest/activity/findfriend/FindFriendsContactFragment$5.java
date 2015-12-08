// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.view.View;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsContactFragment

class this._cls0
    implements android.view.ndsContactFragment._cls5
{

    final FindFriendsContactFragment this$0;

    public void onClick(View view)
    {
        class _cls1
            implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
        {

            final FindFriendsContactFragment._cls5 this$1;

            public void onRequestPermissionsResult(int i, String as[], int ai[])
            {
                if (PermissionUtil.checkPermission(getContext(), "android.permission.READ_CONTACTS"))
                {
                    FindFriendsContactFragment.access$200(this$0);
                }
            }

            _cls1()
            {
                this$1 = FindFriendsContactFragment._cls5.this;
                super();
            }
        }

        PermissionUtil.checkPermissionAsync((BaseActivity)getContext(), "android.permission.READ_CONTACTS", 0x7f070179, new _cls1());
    }

    _cls1()
    {
        this$0 = FindFriendsContactFragment.this;
        super();
    }
}
