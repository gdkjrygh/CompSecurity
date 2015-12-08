// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.accountsalpha.AccountsAlpha;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.unauth.fragment.UnauthLoadingFragment;
import com.pinterest.activity.unauth.fragment.UnauthSignupBoardFragment;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.log.PLog;

public class UnauthWallActivity extends BaseActivity
{

    private BaseFragment _fragment;

    public UnauthWallActivity()
    {
    }

    private void setupOrientation()
    {
        if (!Device.isTablet())
        {
            setRequestedOrientation(1);
            return;
        } else
        {
            setRequestedOrientation(4);
            return;
        }
    }

    public BaseFragment getActiveFragment()
    {
        return _fragment;
    }

    public void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        setupOrientation();
        if (fragment instanceof BaseFragment)
        {
            _fragment = (BaseFragment)fragment;
        }
    }

    public void onBackPressed()
    {
        boolean flag = false;
        if (_fragment != null)
        {
            flag = _fragment.onBackPressed();
        }
        if (!flag)
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        AccountsAlpha.initialize(getApplicationContext());
        if (bundle == null)
        {
            Experiments.ac();
        }
        setupOrientation();
        setContentView(0x7f030028);
        bundle = null;
        if (getIntent().hasExtra("com.pinterest.EXTRA_BOARD_ID"))
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("com.pinterest.EXTRA_BOARD_ID", getIntent().getStringExtra("com.pinterest.EXTRA_BOARD_ID"));
            bundle = new UnauthSignupBoardFragment();
            bundle.setArguments(bundle1);
        }
        Bundle bundle2 = bundle;
        if (bundle == null)
        {
            bundle = new UnauthLoadingFragment();
            bundle2 = bundle;
            if (getIntent() != null)
            {
                String s = getIntent().getStringExtra("com.pinterest.EXTRA_SIGNUP_INVITE_URL");
                bundle2 = bundle;
                if (s != null)
                {
                    bundle.setInviteUrl(s);
                    bundle2 = bundle;
                }
            }
        }
        _fragment = bundle2;
        FragmentHelper.replaceFragment(this, _fragment, false, com.pinterest.activity.FragmentHelper.Animation.NONE);
        StopWatch.get().invalidate("ttrfp").invalidate("ttrfp_tmp_log");
    }

    protected void onDestroy()
    {
        _fragment = null;
        super.onDestroy();
    }

    protected void onResume()
    {
        boolean flag;
        if (getIntent().hasExtra("com.pinterest.EXTRA_USER_NAME") && getIntent().hasExtra("com.pinterest.EXTRA_PASSWORD"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || !MyUser.hasAccessTokenAndUser()) goto _L2; else goto _L1
_L1:
        ActivityHelper.goRoot(this);
        finish();
        super.onResume();
_L4:
        return;
_L2:
        super.onResume();
        if (!getIntent().hasExtra("com.pinterest.EXTRA_PENDING_DIALOG")) goto _L4; else goto _L3
_L3:
        Object obj = getIntent().getSerializableExtra("com.pinterest.EXTRA_PENDING_DIALOG");
        obj = ((Class)obj).newInstance();
        if (!(obj instanceof BaseDialog))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj = (BaseDialog)obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        ((BaseDialog) (obj)).setBundle(getIntent().getExtras());
        Events.post(new DialogEvent(((BaseDialog) (obj))));
_L6:
        getIntent().removeExtra("com.pinterest.EXTRA_PENDING_DIALOG");
        return;
        Object obj1;
        obj1;
        PLog.error(((Throwable) (obj1)), "exception occurred", new Object[0]);
        continue; /* Loop/switch isn't completed */
        obj1;
        PLog.error(((Throwable) (obj1)), "exception occurred", new Object[0]);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setActiveFragment(BaseFragment basefragment)
    {
        _fragment = basefragment;
    }
}
