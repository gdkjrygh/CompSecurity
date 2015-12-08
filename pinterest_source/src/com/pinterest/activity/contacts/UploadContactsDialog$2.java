// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.view.View;
import com.pinterest.base.PermissionUtil;
import com.pinterest.kit.activity.BaseActivity;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsDialog

class this._cls0
    implements android.view.adContactsDialog._cls2
{

    final UploadContactsDialog this$0;

    public void onClick(final View baseActivity)
    {
        baseActivity = (BaseActivity)getActivity();
        class _cls1
            implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
        {

            final UploadContactsDialog._cls2 this$1;
            final BaseActivity val$baseActivity;

            public void onRequestPermissionsResult(int i, String as[], int ai[])
            {
                if (PermissionUtil.checkPermission(baseActivity, "android.permission.READ_CONTACTS"))
                {
                    AnalyticsApi.b("permissions_contact_accept");
                    UploadContactsUtil.setStoreContacts(true);
                    if (UploadContactsDialog.access$000(this$0))
                    {
                        Events.post(new DialogEvent(new UploadFacebookFriendsDialog()));
                    }
                    return;
                } else
                {
                    Events.post(new UploadContactsUtil.UploadContactsCancelledEvent());
                    return;
                }
            }

            _cls1()
            {
                this$1 = UploadContactsDialog._cls2.this;
                baseActivity = baseactivity;
                super();
            }
        }

        _cls1 _lcls1 = new _cls1();
        PermissionUtil.checkPermissionAsync(baseActivity, new String[] {
            "android.permission.READ_CONTACTS"
        }, null, _lcls1);
        dismiss();
    }

    _cls1()
    {
        this$0 = UploadContactsDialog.this;
        super();
    }
}
