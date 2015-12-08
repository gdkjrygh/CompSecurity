// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import com.pinterest.api.RequestParams;
import com.pinterest.api.remote.MyUserApi;

// Referenced classes of package com.pinterest.activity.user.view:
//            UserAboutBioView

class this._cls0
    implements com.pinterest.activity.user.dialog.angedListener
{

    final UserAboutBioView this$0;

    public void onChanged(String s, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("about", s);
        requestparams.a("location", s1);
        MyUserApi.a(requestparams, UserAboutBioView.access$100(UserAboutBioView.this), UserAboutBioView.access$200(UserAboutBioView.this));
    }

    ChangedListener()
    {
        this$0 = UserAboutBioView.this;
        super();
    }
}
