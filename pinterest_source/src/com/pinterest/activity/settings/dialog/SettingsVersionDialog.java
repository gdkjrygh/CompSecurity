// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.ui.text.PTextView;

public class SettingsVersionDialog extends BaseDialog
{

    private View _container;
    PTextView _settingsTv;

    public SettingsVersionDialog()
    {
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f03008a, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setTitle(0x7f0706de);
        _settingsTv.setText(Html.fromHtml(getString(0x7f0706dd)));
        setCancelable(true);
    }
}
