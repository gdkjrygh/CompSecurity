// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsUtil, UploadContactsDialog, UploadFacebookFriendsDialog

class val.baseActivity
    implements android.support.v4.app.ermissionsResultCallback
{

    final ContactsCancelledEvent this$1;
    final BaseActivity val$baseActivity;

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (PermissionUtil.checkPermission(val$baseActivity, "android.permission.READ_CONTACTS"))
        {
            AnalyticsApi.b("permissions_contact_accept");
            UploadContactsUtil.setStoreContacts(true);
            if (UploadContactsDialog.access$000(_fld0))
            {
                Events.post(new DialogEvent(new UploadFacebookFriendsDialog()));
            }
            return;
        } else
        {
            Events.post(new ContactsCancelledEvent());
            return;
        }
    }

    ContactsCancelledEvent()
    {
        this$1 = final_contactscancelledevent;
        val$baseActivity = BaseActivity.this;
        super();
    }
}
