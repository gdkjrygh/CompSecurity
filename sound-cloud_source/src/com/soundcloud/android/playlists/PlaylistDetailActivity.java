// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment

public class PlaylistDetailActivity extends ScActivity
{

    public static final String EXTRA_AUTO_PLAY = "autoplay";
    public static final String EXTRA_PROMOTED_SOURCE_INFO = "promoted_source_info";
    public static final String EXTRA_QUERY_SOURCE_INFO = "query_source_info";
    public static final String EXTRA_URN = "urn";
    static final String LOG_TAG = "PlaylistDetails";
    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;

    public PlaylistDetailActivity()
    {
    }

    private void createFragmentForPlaylist()
    {
        Object obj1 = getIntent();
        Object obj = Screen.fromIntent(((Intent) (obj1)));
        Urn urn = (Urn)((Intent) (obj1)).getParcelableExtra("urn");
        PromotedSourceInfo promotedsourceinfo = (PromotedSourceInfo)((Intent) (obj1)).getParcelableExtra("promoted_source_info");
        obj1 = (SearchQuerySourceInfo)((Intent) (obj1)).getParcelableExtra("query_source_info");
        (new StringBuilder("(Re-)creating fragment for ")).append(urn);
        obj = PlaylistDetailFragment.create(urn, ((Screen) (obj)), ((SearchQuerySourceInfo) (obj1)), promotedsourceinfo);
        getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, ((android.support.v4.app.Fragment) (obj))).commit();
    }

    public static Intent getIntent(Urn urn, Screen screen)
    {
        return getIntent(urn, screen, false);
    }

    public static Intent getIntent(Urn urn, Screen screen, boolean flag)
    {
        return getIntent(urn, screen, flag, null, null);
    }

    public static Intent getIntent(Urn urn, Screen screen, boolean flag, SearchQuerySourceInfo searchquerysourceinfo, PromotedSourceInfo promotedsourceinfo)
    {
        Intent intent = new Intent("com.soundcloud.android.action.PLAYLIST");
        screen.addToIntent(intent);
        return intent.putExtra("urn", urn).putExtra("autoplay", flag).putExtra("query_source_info", searchquerysourceinfo).putExtra("promoted_source_info", promotedsourceinfo);
    }

    public static void start(Context context, Urn urn, Screen screen)
    {
        start(context, urn, screen, false);
    }

    public static void start(Context context, Urn urn, Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        start(context, urn, screen, false, searchquerysourceinfo);
    }

    public static void start(Context context, Urn urn, Screen screen, boolean flag)
    {
        start(context, urn, screen, flag, null);
    }

    public static void start(Context context, Urn urn, Screen screen, boolean flag, SearchQuerySourceInfo searchquerysourceinfo)
    {
        context.startActivity(getIntent(urn, screen, flag, searchquerysourceinfo, null));
    }

    public void onBackPressed()
    {
        if (!playerController.handleBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(0x7f070062);
        if (bundle == null)
        {
            createFragmentForPlaylist();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.PLAYLIST_DETAILS));
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayout(this);
    }
}
