// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import android.app.Activity;
import com.facebook.share.model.AppInviteContent;
import com.facebook.share.widget.a;

public class FacebookInvitesDialogPresenter
{

    private static final String FACEBOOK_INVITES_APP_LINK_URL = "https://soundcloud.com/";
    private static final String FACEBOOK_INVITES_PREVIEW_IMAGE_URL = "https://soundcloud.com/app-invite-preview.png";

    FacebookInvitesDialogPresenter()
    {
    }

    public void show(Activity activity)
    {
        if (a.d())
        {
            com.facebook.share.model.AppInviteContent.a a1 = new com.facebook.share.model.AppInviteContent.a();
            a1.a = "https://soundcloud.com/";
            a1.b = "https://soundcloud.com/app-invite-preview.png";
            a.a(activity, new AppInviteContent(a1, (byte)0));
        }
    }
}
