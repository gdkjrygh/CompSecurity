// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadFacebookFriendsDialog

class this._cls0
    implements android.view.ookFriendsDialog._cls2
{

    final UploadFacebookFriendsDialog this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.FACEBOOK_CONNECT);
        AnalyticsApi.b("permissions_facebook_accept");
        Events.post(new com.pinterest.base.it>(com.pinterest.base.it>, true));
        dismiss();
    }

    ()
    {
        this$0 = UploadFacebookFriendsDialog.this;
        super();
    }
}
