// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.AnalyticsApi;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupDialogView

public class SignupDialog extends BaseDialog
{

    public static final String KEY = "signup";

    public SignupDialog()
    {
        _key = "signup";
    }

    public void make(LayoutInflater layoutinflater)
    {
        SignupDialogView signupdialogview = new SignupDialogView(getContext());
        signupdialogview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        ScrollView scrollview = new ScrollView(getContext());
        scrollview.addView(signupdialogview);
        setContent(scrollview, 0);
        super.make(layoutinflater);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        AnalyticsApi.a("old_wall_signup_attempt");
    }

    public void onPause()
    {
        Pinalytics.d();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Pinalytics.a(this);
    }
}
