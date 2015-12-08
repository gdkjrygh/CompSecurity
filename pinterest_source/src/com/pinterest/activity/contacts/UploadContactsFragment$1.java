// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsUtil, UploadContactsFragment

class val.baseActivity
    implements android.support.v4.app.ermissionsResultCallback
{

    final UploadContactsFragment this$0;
    final BaseActivity val$baseActivity;

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (PermissionUtil.checkPermission(val$baseActivity, "android.permission.READ_CONTACTS"))
        {
            AnalyticsApi.b("permissions_contact_accept");
            UploadContactsUtil.setStoreContacts(true);
        }
        Events.postSticky(new loadContactsDismissEvent());
    }

    loadContactsDismissEvent()
    {
        this$0 = final_uploadcontactsfragment;
        val$baseActivity = BaseActivity.this;
        super();
    }
}
