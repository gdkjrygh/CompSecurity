// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.ui:
//            BaseActivity, NavigationDrawerFragment, FileListFragment, RemoteActivity

public class FileActivity extends BaseActivity
{
    public static interface OnBackPressedListener
    {

        public abstract boolean currentPageAtRootDirectory();

        public abstract void onBackPressed();
    }


    OnBackPressedListener fragmentBackListener;
    private NavigationDrawerFragment navigationDrawerFragment;

    public FileActivity()
    {
    }

    private void setupActionBar(String s)
    {
        setSupportActionBar((Toolbar)findViewById(0x7f0e00d8));
        ActionBar actionbar = getSupportActionBar();
        if (actionbar == null)
        {
            return;
        } else
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            navigationDrawerFragment.setDrawerIndicatorEnabled(true);
            actionbar.setTitle(s);
            return;
        }
    }

    public void onBackPressed()
    {
label0:
        {
            if (fragmentBackListener != null)
            {
                if (fragmentBackListener.currentPageAtRootDirectory())
                {
                    break label0;
                }
                fragmentBackListener.onBackPressed();
            }
            return;
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        if (Utils.isLollipopOrLater())
        {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setContentView(0x7f03001a);
        navigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(0x7f0e0052);
        navigationDrawerFragment.setUp(0x7f0e0052, (DrawerLayout)findViewById(0x7f0e0050));
        if (bundle == null)
        {
            bundle = new FileListFragment();
            if (Utils.isLollipopOrLater())
            {
                bundle.setExitTransition(null);
                bundle.setReenterTransition(TransitionInflater.from(this).inflateTransition(0x10f0002));
            }
            getSupportFragmentManager().beginTransaction().add(0x7f0e0053, bundle).commit();
        }
        setupActionBar(getString(0x7f0700d7));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0f0003, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131624160: 
            startActivity((new Intent(this, org/xbmc/kore/ui/RemoteActivity)).addFlags(0x20000000));
            break;
        }
        return true;
    }

    public void setBackPressedListener(OnBackPressedListener onbackpressedlistener)
    {
        fragmentBackListener = onbackpressedlistener;
    }
}
