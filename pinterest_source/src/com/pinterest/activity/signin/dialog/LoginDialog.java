// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialogView

public class LoginDialog extends BaseDialog
{

    public static final String KEY = "login";
    private LoginDialogView _contentVw;

    public LoginDialog()
    {
        _key = "login";
    }

    public void make(LayoutInflater layoutinflater)
    {
        _contentVw = new LoginDialogView(getContext(), this);
        _contentVw.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        ScrollView scrollview = new ScrollView(getContext());
        scrollview.addView(_contentVw);
        setContent(scrollview, 0);
        super.make(layoutinflater);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
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
        if (_contentVw != null)
        {
            _contentVw.tryAutoLogin();
        }
    }
}
