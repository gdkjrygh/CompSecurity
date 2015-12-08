// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;

public class ErrorScreenActivity extends Activity
    implements android.view.View.OnClickListener
{

    private ActionBarHelper mActionBarHelper;

    public ErrorScreenActivity()
    {
    }

    protected void initActionBar()
    {
        mActionBarHelper = new ActionBarHelper(this, getActionBar());
        mActionBarHelper.initActionBarWithCustomView();
        mActionBarHelper.showActionBarForErrorActivity();
    }

    public void onBackPressed()
    {
        System.exit(0);
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0d0232)
        {
            System.exit(0);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030059);
        ((FrameLayout)findViewById(0x7f0d001f)).addView(getLayoutInflater().inflate(0x7f030064, null));
        initActionBar();
        ((Button)findViewById(0x7f0d0232)).setOnClickListener(this);
    }
}
