// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.ui.MixedSearchAdapter;

public class BaseActivity extends ActionBarActivity
{

    protected ActionBar actionBar;
    protected android.support.v7.app.ActionBar.Tab allTab;
    protected android.support.v7.app.ActionBar.Tab articlesTab;
    protected android.support.v7.app.ActionBar.Tab ideasTab;
    protected MixedSearchAdapter searchAdapter;

    public BaseActivity()
    {
    }

    public boolean hasActionBar()
    {
        return getSupportActionBar() != null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (hasActionBar())
        {
            actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        Session.getInstance().setContext(getApplicationContext());
        Babayaga.setContext(getApplicationContext());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}
