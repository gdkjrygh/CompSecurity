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
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.ui:
//            BaseActivity, NavigationDrawerFragment, MovieListFragment, MovieDetailsFragment, 
//            RemoteActivity

public class MoviesActivity extends BaseActivity
    implements MovieListFragment.OnMovieSelectedListener
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/MoviesActivity);
    private NavigationDrawerFragment navigationDrawerFragment;
    private int selectedMovieId;
    private String selectedMovieTitle;

    public MoviesActivity()
    {
        selectedMovieId = -1;
    }

    private void setupActionBar(String s)
    {
        setSupportActionBar((Toolbar)findViewById(0x7f0e00d8));
        ActionBar actionbar = getSupportActionBar();
        if (actionbar == null)
        {
            return;
        }
        actionbar.setDisplayHomeAsUpEnabled(true);
        if (s != null)
        {
            navigationDrawerFragment.setDrawerIndicatorEnabled(false);
            actionbar.setTitle(s);
            return;
        } else
        {
            navigationDrawerFragment.setDrawerIndicatorEnabled(true);
            actionbar.setTitle(0x7f070056);
            return;
        }
    }

    public void onBackPressed()
    {
        if (selectedMovieId != -1)
        {
            selectedMovieId = -1;
            selectedMovieTitle = null;
            setupActionBar(null);
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
            bundle = new MovieListFragment();
            if (Utils.isLollipopOrLater())
            {
                bundle.setExitTransition(null);
                bundle.setReenterTransition(TransitionInflater.from(this).inflateTransition(0x10f0002));
            }
            getSupportFragmentManager().beginTransaction().add(0x7f0e0053, bundle).commit();
        } else
        {
            selectedMovieId = bundle.getInt("movie_id", -1);
            selectedMovieTitle = bundle.getString("movie_title", null);
        }
        setupActionBar(selectedMovieTitle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0f0003, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onMovieSelected(int i, String s)
    {
        selectedMovieId = i;
        selectedMovieTitle = s;
        s = MovieDetailsFragment.newInstance(i);
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        if (Utils.isLollipopOrLater())
        {
            s.setEnterTransition(TransitionInflater.from(this).inflateTransition(0x7f050000));
            s.setReturnTransition(null);
        } else
        {
            fragmenttransaction.setCustomAnimations(0x7f04000e, 0, 0x7f04000f, 0);
        }
        fragmenttransaction.replace(0x7f0e0053, s).addToBackStack(null).commit();
        setupActionBar(selectedMovieTitle);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   16908332: 59
    //                   2131624160: 38;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L3:
        startActivity((new Intent(this, org/xbmc/kore/ui/RemoteActivity)).addFlags(0x20000000));
        return true;
_L2:
        if (selectedMovieId != -1)
        {
            selectedMovieId = -1;
            selectedMovieTitle = null;
            setupActionBar(null);
            getSupportFragmentManager().popBackStack();
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("movie_id", selectedMovieId);
        bundle.putString("movie_title", selectedMovieTitle);
    }

}
