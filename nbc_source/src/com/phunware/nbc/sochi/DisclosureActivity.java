// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import com.phunware.nbc.sochi.fragments.DisclosureFragment;

public class DisclosureActivity extends AppCompatActivity
{

    public DisclosureActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001b);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setIcon(0x7f030000);
        if (getSupportFragmentManager().findFragmentById(0x7f0f006c) == null)
        {
            getSupportFragmentManager().beginTransaction().replace(0x7f0f006c, DisclosureFragment.getInstance()).commit();
        }
    }
}
