// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.activities;

import android.content.res.Resources;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

public class LeanplumSherlockFragmentActivity extends SherlockFragmentActivity
{

    private LeanplumActivityHelper a;

    public LeanplumSherlockFragmentActivity()
    {
    }

    private LeanplumActivityHelper a()
    {
        if (a == null)
        {
            a = new LeanplumActivityHelper(this);
        }
        return a;
    }

    public Resources getResources()
    {
        if (Leanplum.isTestModeEnabled())
        {
            return super.getResources();
        } else
        {
            return a().getLeanplumResources(super.getResources());
        }
    }

    protected void onPause()
    {
        super.onPause();
        a().onPause();
    }

    protected void onResume()
    {
        super.onResume();
        a().onResume();
    }

    protected void onStop()
    {
        super.onStop();
        a().onStop();
    }

    public void setContentView(int i)
    {
        if (Leanplum.isTestModeEnabled())
        {
            super.setContentView(i);
        }
        a().setContentView(i);
    }
}
