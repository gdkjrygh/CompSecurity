// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.search.PlaylistResultsFragment;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.java.checks.Preconditions;

public class PlaylistDiscoveryActivity extends ScActivity
{

    public static final String EXTRA_PLAYLIST_TAG = "playlistTag";
    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;

    public PlaylistDiscoveryActivity()
    {
    }

    private void createFragmentForPlaylistDiscovery(String s)
    {
        s = PlaylistResultsFragment.create(s);
        getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, s).commit();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(0x7f07011d);
        if (bundle == null)
        {
            bundle = getIntent().getStringExtra("playlistTag");
            Preconditions.checkNotNull(bundle, "Invalid playlist discovery tag");
            setTitle((new StringBuilder("#")).append(bundle).toString());
            createFragmentForPlaylistDiscovery(bundle);
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayout(this);
    }
}
