// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.AnalyticsApi;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            BusinessSignupDialogView

public class BusinessSignupDialog extends BaseDialog
{

    public static final String KEY = "business";
    private String _email;
    private String _inviteCode;

    public BusinessSignupDialog()
    {
        this(null, null);
    }

    public BusinessSignupDialog(String s, String s1)
    {
        _key = "business";
        _email = s;
        _inviteCode = s1;
    }

    public void make(LayoutInflater layoutinflater)
    {
        BusinessSignupDialogView businesssignupdialogview = new BusinessSignupDialogView(getContext());
        businesssignupdialogview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        setContent(businesssignupdialogview, 0);
        super.make(layoutinflater);
        businesssignupdialogview.setEmailAddress(_email);
        businesssignupdialogview.setInviteCode(_inviteCode);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        AnalyticsApi.a("business_signup_dialog");
    }

    public void onPause()
    {
        super.onPause();
        Pinalytics.d();
    }

    public void onResume()
    {
        super.onResume();
        Pinalytics.a(this);
    }
}
