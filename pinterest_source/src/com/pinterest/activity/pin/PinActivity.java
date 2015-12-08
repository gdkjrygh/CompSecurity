// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;
import com.pinterest.kit.activity.BaseActivity;

public class PinActivity extends BaseActivity
{

    private BaseFragment _fragment;

    public PinActivity()
    {
    }

    private void show()
    {
        Object obj = getIntent().getParcelableExtra("com.pinterest.EXTRA_PENDING_TASK");
        if (!(obj instanceof Navigation))
        {
            finish();
            return;
        }
        obj = (Navigation)obj;
        try
        {
            BaseFragment basefragment = (BaseFragment)((Navigation) (obj)).getFragmentClass().newInstance();
            basefragment.setNavigation(((Navigation) (obj)));
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            fragmenttransaction.replace(0x7f0f0085, basefragment, ((Navigation) (obj)).toString());
            fragmenttransaction.commit();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        ActivityHelper.goUnauthPage(this);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030025);
        show();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        show();
    }

    protected void onStart()
    {
        if (MyUser.hasAccessToken())
        {
            Navigation navigation = (Navigation)getIntent().getParcelableExtra("com.pinterest.EXTRA_PENDING_TASK");
            startActivity(ActivityHelper.getTaskIntent(this, new Navigation(Location.PIN, navigation.getId())));
            finish();
        }
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }
}
