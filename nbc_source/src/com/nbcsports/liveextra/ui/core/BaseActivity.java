// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import butterknife.ButterKnife;
import com.phunware.nbc.sochi.system.NBCSystem;

public class BaseActivity extends AppCompatActivity
{

    Toolbar toolbar;

    public BaseActivity()
    {
    }

    public void keepScreenOn(boolean flag)
    {
        getWindow().getDecorView().findViewById(0x1020002).setKeepScreenOn(flag);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setVolumeControlStream(3);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        ButterKnife.bind(this);
    }

    protected void setOrientation()
    {
        if (NBCSystem.IS_LANDSCAPE)
        {
            setRequestedOrientation(0);
            return;
        } else
        {
            setRequestedOrientation(1);
            return;
        }
    }
}
