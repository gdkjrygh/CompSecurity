// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.base.Application;

public class AppPermissionSettingsGuideFragment extends BaseFragment
{

    public AppPermissionSettingsGuideFragment()
    {
    }

    protected void onCancelClick(Button button)
    {
        pressBackButton();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300a5;
    }

    protected void onGoToSettingsClick(Button button)
    {
        startActivity((new Intent()).setAction("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", Application.context().getPackageName(), null)));
        pressBackButton();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
    }
}
