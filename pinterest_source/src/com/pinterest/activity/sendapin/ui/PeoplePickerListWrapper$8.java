// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import com.pinterest.activity.sendapin.adapter.SendPinAdapter;
import com.pinterest.base.PermissionUtil;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            PeoplePickerListWrapper

class this._cls0
    implements android.support.v4.app.rmissionsResultCallback
{

    final PeoplePickerListWrapper this$0;

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (PermissionUtil.checkPermission(getContext(), "android.permission.READ_CONTACTS"))
        {
            PeoplePickerListWrapper.access$100(PeoplePickerListWrapper.this).refresh();
        }
    }

    ultCallback()
    {
        this$0 = PeoplePickerListWrapper.this;
        super();
    }
}
