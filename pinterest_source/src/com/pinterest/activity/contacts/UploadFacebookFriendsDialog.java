// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.view.LayoutInflater;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.kit.application.Resources;

public class UploadFacebookFriendsDialog extends BaseDialog
{

    public static final String KEY = "upload_facebook_friends";

    public UploadFacebookFriendsDialog()
    {
        _key = "upload_facebook_friends";
    }

    public void make(LayoutInflater layoutinflater)
    {
        setTitle(Resources.string(0x7f0705e2));
        setMessage(Resources.string(0x7f07038a));
        setNegativeButton(0x7f0703a9, new _cls1());
        setPositiveButton(0x7f07057c, new _cls2());
        super.make(layoutinflater);
        AnalyticsApi.b("permissions_facebook_popup");
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UploadFacebookFriendsDialog this$0;

        public void onClick(View view)
        {
            dismiss();
        }

        _cls1()
        {
            this$0 = UploadFacebookFriendsDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final UploadFacebookFriendsDialog this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.FACEBOOK_CONNECT);
            AnalyticsApi.b("permissions_facebook_accept");
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK, true));
            dismiss();
        }

        _cls2()
        {
            this$0 = UploadFacebookFriendsDialog.this;
            super();
        }
    }

}
