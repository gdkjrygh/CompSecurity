// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.content.Context;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.tve.PlaybackDelegate;
import com.nbcsports.liveextra.ui.main.core.DefaultItemView;
import com.nbcsports.liveextra.ui.main.core.HeaderViewHolder;
import com.nbcsports.liveextra.ui.main.favorites.FavoritesListView;
import com.nbcsports.liveextra.ui.main.highlights.HighlightsListView;
import com.nbcsports.liveextra.ui.main.home.HomeListView;
import com.nbcsports.liveextra.ui.main.replay.FullEventReplayListView;
import com.nbcsports.liveextra.ui.main.schedule.ScheduleListView;
import com.nbcsports.liveextra.ui.main.showcase.ShowcasePagerView;
import com.nbcsports.liveextra.ui.tutorial.TutorialDialogFragment;
import com.phunware.nbc.sochi.fragments.DetailActionDialogFragment;
import com.phunware.nbc.sochi.fragments.EventReplayFragment;
import com.phunware.nbc.sochi.fragments.FavoritesFragment;
import com.phunware.nbc.sochi.fragments.HighlightsFragment;
import com.phunware.nbc.sochi.fragments.HomeFragment;
import com.phunware.nbc.sochi.fragments.PlayerActionDialogFragment;
import com.phunware.nbc.sochi.fragments.ScheduleFragment;
import com.phunware.nbc.sochi.fragments.ShowcaseFragment;
import com.phunware.nbc.sochi.fragments.SochiApplicationSettingsFragment;
import com.phunware.nbc.sochi.fragments.SportFilterListFragment;
import com.phunware.nbc.sochi.fragments.SportGridTabletFragment;

// Referenced classes of package com.phunware.nbc.sochi:
//            MainNavigationContentActivity

public static interface nt
{

    public abstract MainNavigationContentActivity activity();

    public abstract Configuration configuration();

    public abstract Context context();

    public abstract void inject(PlaybackDelegate playbackdelegate);

    public abstract void inject(DefaultItemView defaultitemview);

    public abstract void inject(HeaderViewHolder headerviewholder);

    public abstract void inject(FavoritesListView favoriteslistview);

    public abstract void inject(HighlightsListView highlightslistview);

    public abstract void inject(HomeListView homelistview);

    public abstract void inject(FullEventReplayListView fulleventreplaylistview);

    public abstract void inject(ScheduleListView schedulelistview);

    public abstract void inject(ShowcasePagerView showcasepagerview);

    public abstract void inject(TutorialDialogFragment tutorialdialogfragment);

    public abstract void inject(MainNavigationContentActivity mainnavigationcontentactivity);

    public abstract void inject(DetailActionDialogFragment detailactiondialogfragment);

    public abstract void inject(EventReplayFragment eventreplayfragment);

    public abstract void inject(FavoritesFragment favoritesfragment);

    public abstract void inject(HighlightsFragment highlightsfragment);

    public abstract void inject(HomeFragment homefragment);

    public abstract void inject(PlayerActionDialogFragment playeractiondialogfragment);

    public abstract void inject(ScheduleFragment schedulefragment);

    public abstract void inject(ShowcaseFragment showcasefragment);

    public abstract void inject(SochiApplicationSettingsFragment sochiapplicationsettingsfragment);

    public abstract void inject(SportFilterListFragment sportfilterlistfragment);

    public abstract void inject(SportGridTabletFragment sportgridtabletfragment);
}
