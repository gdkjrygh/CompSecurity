// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.view.View;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsDialog, UploadFacebookFriendsDialog

class this._cls0
    implements android.view.adContactsDialog._cls1
{

    final UploadContactsDialog this$0;

    public void onClick(View view)
    {
        if (UploadContactsDialog.access$000(UploadContactsDialog.this))
        {
            Events.post(new DialogEvent(new UploadFacebookFriendsDialog()));
        }
        Events.post(new adContactsCancelledEvent());
        AnalyticsApi.b("permissions_contact_reject");
        dismiss();
    }

    adContactsCancelledEvent()
    {
        this$0 = UploadContactsDialog.this;
        super();
    }
}
