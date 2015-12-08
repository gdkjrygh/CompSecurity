// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import org.xbmc.kore.ui.BaseActivity;
import org.xbmc.kore.ui.NavigationDrawerFragment;
import org.xbmc.kore.utils.LogUtils;

public class HostManagerActivity extends BaseActivity
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/hosts/HostManagerActivity);
    private NavigationDrawerFragment navigationDrawerFragment;

    public HostManagerActivity()
    {
    }

    private void setupToolbar()
    {
        Object obj = (Toolbar)findViewById(0x7f0e00d8);
        ((Toolbar) (obj)).setTitle(0x7f0700cc);
        setSupportActionBar(((Toolbar) (obj)));
        obj = getSupportActionBar();
        if (obj == null)
        {
            return;
        } else
        {
            ((ActionBar) (obj)).setDisplayHomeAsUpEnabled(true);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        navigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(0x7f0e0052);
        navigationDrawerFragment.setUp(0x7f0e0052, (DrawerLayout)findViewById(0x7f0e0050));
        setupToolbar();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return super.onOptionsItemSelected(menuitem);
    }

}
