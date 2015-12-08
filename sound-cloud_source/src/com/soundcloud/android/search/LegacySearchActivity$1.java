// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.support.v4.app.FragmentManager;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.search:
//            LegacySearchActivity, PlaylistResultsFragment, TabbedSearchFragment

class this._cls0
    implements com.soundcloud.android.actionbar.er.SearchCallback
{

    final LegacySearchActivity this$0;

    public void exitSearchMode()
    {
        LegacySearchActivity.access$100(LegacySearchActivity.this).publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_MAIN));
        getSupportFragmentManager().popBackStack(null, 1);
    }

    public void performTagSearch(String s)
    {
        LegacySearchActivity.access$000(LegacySearchActivity.this, PlaylistResultsFragment.create(s), "playlist_results");
    }

    public void performTextSearch(String s)
    {
        LegacySearchActivity.access$000(LegacySearchActivity.this, TabbedSearchFragment.newInstance(s), "tabbed_search");
    }

    ()
    {
        this$0 = LegacySearchActivity.this;
        super();
    }
}
