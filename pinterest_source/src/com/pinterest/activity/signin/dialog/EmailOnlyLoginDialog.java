// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Device;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialog

public class EmailOnlyLoginDialog extends LoginDialog
{

    public EmailOnlyLoginDialog()
    {
    }

    public void make(LayoutInflater layoutinflater)
    {
        super.make(layoutinflater);
        ViewHelper.setVisibility(_customView.findViewById(0x7f0f0171), 8);
        ViewHelper.setVisibility(_customView.findViewById(0x7f0f0172), 0);
        layoutinflater = (TextView)_customView.findViewById(0x7f0f0174);
        layoutinflater.setText(MyUser.getGPlusAccount());
        layoutinflater.setEnabled(false);
        layoutinflater = _customView.findViewById(0x7f0f0175);
        layoutinflater.requestFocus();
        Device.showSoftKeyboard(layoutinflater);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }
}
