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
//            BaseActivity, NavigationDrawerFragment, TVShowListFragment, TVShowEpisodeDetailsFragment, 
//            RemoteActivity, TVShowDetailsFragment

public class TVShowsActivity extends BaseActivity
    implements TVShowEpisodeListFragment.OnEpisodeSelectedListener, TVShowListFragment.OnTVShowSelectedListener
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/TVShowsActivity);
    private NavigationDrawerFragment navigationDrawerFragment;
    private int selectedEpisodeId;
    private int selectedTVShowId;
    private String selectedTVShowTitle;

    public TVShowsActivity()
    {
        selectedTVShowId = -1;
        selectedTVShowTitle = null;
        selectedEpisodeId = -1;
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
            actionbar.setTitle(0x7f07009f);
            return;
        }
    }

    public void onBackPressed()
    {
        if (selectedEpisodeId == -1) goto _L2; else goto _L1
_L1:
        selectedEpisodeId = -1;
_L4:
        super.onBackPressed();
        return;
_L2:
        if (selectedTVShowId != -1)
        {
            selectedTVShowId = -1;
            selectedTVShowTitle = null;
            setupActionBar(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
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
            bundle = new TVShowListFragment();
            if (Utils.isLollipopOrLater())
            {
                bundle.setExitTransition(null);
                bundle.setReenterTransition(TransitionInflater.from(this).inflateTransition(0x10f0002));
            }
            getSupportFragmentManager().beginTransaction().add(0x7f0e0053, bundle).commit();
        } else
        {
            selectedTVShowId = bundle.getInt("tvshow_id", -1);
            selectedTVShowTitle = bundle.getString("tvshow_title", null);
            selectedEpisodeId = bundle.getInt("episode_id", -1);
        }
        setupActionBar(selectedTVShowTitle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0f0003, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onEpisodeSelected(int i, int j)
    {
        selectedEpisodeId = j;
        TVShowEpisodeDetailsFragment tvshowepisodedetailsfragment = TVShowEpisodeDetailsFragment.newInstance(i, j);
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        if (Utils.isLollipopOrLater())
        {
            tvshowepisodedetailsfragment.setEnterTransition(TransitionInflater.from(this).inflateTransition(0x7f050000));
            tvshowepisodedetailsfragment.setReturnTransition(null);
        } else
        {
            fragmenttransaction.setCustomAnimations(0x7f04000e, 0, 0x7f04000f, 0);
        }
        fragmenttransaction.replace(0x7f0e0053, tvshowepisodedetailsfragment).addToBackStack(null).commit();
        setupActionBar(selectedTVShowTitle);
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
        if (selectedEpisodeId != -1)
        {
            selectedEpisodeId = -1;
            getSupportFragmentManager().popBackStack();
            return true;
        }
        if (selectedTVShowId != -1)
        {
            selectedTVShowId = -1;
            selectedTVShowTitle = null;
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
        bundle.putInt("tvshow_id", selectedTVShowId);
        bundle.putString("tvshow_title", selectedTVShowTitle);
        bundle.putInt("episode_id", selectedEpisodeId);
    }

    public void onTVShowSelected(int i, String s)
    {
        selectedTVShowId = i;
        selectedTVShowTitle = s;
        s = TVShowDetailsFragment.newInstance(i);
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
        setupActionBar(selectedTVShowTitle);
    }

}
