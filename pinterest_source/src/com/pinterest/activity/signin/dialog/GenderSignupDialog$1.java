// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import com.pinterest.api.remote.AnalyticsApi;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            GenderSignupDialog

class this._cls0
    implements android.view.og.GenderSignupDialog._cls1
{

    final GenderSignupDialog this$0;

    public void onClick(View view)
    {
        AnalyticsApi.a("email_signup_step_2_complete");
        GenderSignupDialog.access$000(GenderSignupDialog.this);
    }

    ()
    {
        this$0 = GenderSignupDialog.this;
        super();
    }
}
