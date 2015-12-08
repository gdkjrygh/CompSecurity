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
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.ui:
//            BaseActivity, NavigationDrawerFragment, AlbumDetailsFragment, AlbumListFragment, 
//            MusicListFragment, MusicVideoDetailsFragment, RemoteActivity

public class MusicActivity extends BaseActivity
    implements AlbumListFragment.OnAlbumSelectedListener, ArtistListFragment.OnArtistSelectedListener, AudioGenresListFragment.OnAudioGenreSelectedListener, MusicVideoListFragment.OnMusicVideoSelectedListener
{

    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/MusicActivity);
    private NavigationDrawerFragment navigationDrawerFragment;
    private int selectedAlbumId;
    private String selectedAlbumTitle;
    private int selectedArtistId;
    private String selectedArtistName;
    private int selectedGenreId;
    private String selectedGenreTitle;
    private int selectedMusicVideoId;
    private String selectedMusicVideoTitle;

    public MusicActivity()
    {
        selectedAlbumId = -1;
        selectedArtistId = -1;
        selectedGenreId = -1;
        selectedMusicVideoId = -1;
        selectedAlbumTitle = null;
        selectedArtistName = null;
        selectedGenreTitle = null;
        selectedMusicVideoTitle = null;
    }

    private void setupActionBar(String s, String s1, String s2, String s3)
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
        }
        if (s1 != null)
        {
            navigationDrawerFragment.setDrawerIndicatorEnabled(false);
            actionbar.setTitle(s1);
            return;
        }
        if (s2 != null)
        {
            navigationDrawerFragment.setDrawerIndicatorEnabled(false);
            actionbar.setTitle(s2);
            return;
        }
        if (s3 != null)
        {
            navigationDrawerFragment.setDrawerIndicatorEnabled(false);
            actionbar.setTitle(s3);
            return;
        } else
        {
            navigationDrawerFragment.setDrawerIndicatorEnabled(true);
            actionbar.setTitle(0x7f070057);
            return;
        }
    }

    public void onAlbumSelected(int i, String s)
    {
        selectedAlbumId = i;
        selectedAlbumTitle = s;
        AlbumDetailsFragment albumdetailsfragment = AlbumDetailsFragment.newInstance(i);
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        if (Utils.isLollipopOrLater())
        {
            albumdetailsfragment.setEnterTransition(TransitionInflater.from(this).inflateTransition(0x7f050000));
            albumdetailsfragment.setReturnTransition(null);
        } else
        {
            fragmenttransaction.setCustomAnimations(0x7f04000e, 0, 0x7f04000f, 0);
        }
        fragmenttransaction.replace(0x7f0e0053, albumdetailsfragment).addToBackStack(null).commit();
        setupActionBar(s, null, null, null);
    }

    public void onArtistSelected(int i, String s)
    {
        selectedArtistId = i;
        selectedArtistName = s;
        AlbumListFragment albumlistfragment = AlbumListFragment.newInstanceForArtist(i);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(0x7f04000e, 0, 0x7f04000f, 0).replace(0x7f0e0053, albumlistfragment).addToBackStack(null).commit();
        setupActionBar(null, s, null, null);
    }

    public void onAudioGenreSelected(int i, String s)
    {
        selectedGenreId = i;
        selectedGenreTitle = s;
        AlbumListFragment albumlistfragment = AlbumListFragment.newInstanceForGenre(i);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(0x7f04000e, 0, 0x7f04000f, 0).replace(0x7f0e0053, albumlistfragment).addToBackStack(null).commit();
        setupActionBar(null, null, s, null);
    }

    public void onBackPressed()
    {
        if (selectedAlbumId == -1) goto _L2; else goto _L1
_L1:
        selectedAlbumId = -1;
        selectedAlbumTitle = null;
        setupActionBar(null, selectedArtistName, selectedGenreTitle, selectedMusicVideoTitle);
_L4:
        super.onBackPressed();
        return;
_L2:
        if (selectedArtistId != -1)
        {
            selectedArtistId = -1;
            selectedArtistName = null;
            setupActionBar(selectedAlbumTitle, null, selectedGenreTitle, selectedMusicVideoTitle);
        } else
        if (selectedGenreId != -1)
        {
            selectedGenreId = -1;
            selectedGenreTitle = null;
            setupActionBar(selectedAlbumTitle, selectedArtistName, null, selectedMusicVideoTitle);
        } else
        if (selectedMusicVideoId != -1)
        {
            selectedMusicVideoId = -1;
            selectedMusicVideoTitle = null;
            setupActionBar(selectedAlbumTitle, selectedArtistName, selectedGenreTitle, null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001a);
        navigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(0x7f0e0052);
        navigationDrawerFragment.setUp(0x7f0e0052, (DrawerLayout)findViewById(0x7f0e0050));
        if (bundle == null)
        {
            bundle = new MusicListFragment();
            if (Utils.isLollipopOrLater())
            {
                bundle.setExitTransition(null);
                bundle.setReenterTransition(TransitionInflater.from(this).inflateTransition(0x10f0002));
            }
            getSupportFragmentManager().beginTransaction().add(0x7f0e0053, bundle).commit();
        } else
        {
            selectedAlbumId = bundle.getInt("album_id", -1);
            selectedArtistId = bundle.getInt("artist_id", -1);
            selectedGenreId = bundle.getInt("genre_id", -1);
            selectedMusicVideoId = bundle.getInt("music_video_id", -1);
            selectedAlbumTitle = bundle.getString("album_title", null);
            selectedArtistName = bundle.getString("artist_name", null);
            selectedGenreTitle = bundle.getString("genre_title", null);
            selectedMusicVideoTitle = bundle.getString("music_video_title", null);
        }
        setupActionBar(selectedAlbumTitle, selectedArtistName, selectedGenreTitle, selectedMusicVideoTitle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0f0003, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onMusicVideoSelected(int i, String s)
    {
        selectedMusicVideoId = i;
        selectedMusicVideoTitle = s;
        MusicVideoDetailsFragment musicvideodetailsfragment = MusicVideoDetailsFragment.newInstance(i);
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        if (Utils.isLollipopOrLater())
        {
            musicvideodetailsfragment.setEnterTransition(TransitionInflater.from(this).inflateTransition(0x7f050000));
            musicvideodetailsfragment.setReturnTransition(null);
        } else
        {
            fragmenttransaction.setCustomAnimations(0x7f04000e, 0, 0x7f04000f, 0);
        }
        fragmenttransaction.replace(0x7f0e0053, musicvideodetailsfragment).addToBackStack(null).commit();
        setupActionBar(null, null, null, s);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   16908332: 61
    //                   2131624160: 38;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L3:
        startActivity((new Intent(this, org/xbmc/kore/ui/RemoteActivity)).addFlags(0x20000000));
        return true;
_L2:
        if (selectedAlbumId != -1)
        {
            selectedAlbumId = -1;
            selectedAlbumTitle = null;
            setupActionBar(null, selectedArtistName, selectedGenreTitle, selectedMusicVideoTitle);
            getSupportFragmentManager().popBackStack();
            return true;
        }
        if (selectedArtistId != -1)
        {
            selectedArtistId = -1;
            selectedArtistName = null;
            setupActionBar(selectedAlbumTitle, null, selectedGenreTitle, selectedMusicVideoTitle);
            getSupportFragmentManager().popBackStack();
            return true;
        }
        if (selectedGenreId != -1)
        {
            selectedGenreId = -1;
            selectedGenreTitle = null;
            setupActionBar(selectedAlbumTitle, selectedArtistName, null, selectedMusicVideoTitle);
            getSupportFragmentManager().popBackStack();
            return true;
        }
        if (selectedMusicVideoId != -1)
        {
            selectedMusicVideoId = -1;
            selectedMusicVideoTitle = null;
            setupActionBar(selectedAlbumTitle, selectedArtistName, selectedGenreTitle, null);
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
        bundle.putInt("album_id", selectedAlbumId);
        bundle.putInt("artist_id", selectedArtistId);
        bundle.putInt("genre_id", selectedGenreId);
        bundle.putInt("music_video_id", selectedMusicVideoId);
        bundle.putString("album_title", selectedAlbumTitle);
        bundle.putString("artist_name", selectedArtistName);
        bundle.putString("genre_title", selectedGenreTitle);
        bundle.putString("music_video_title", selectedMusicVideoTitle);
    }

}
