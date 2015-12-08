// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.Activity;
import android.content.Intent;
import com.hmobile.tab.Tab;
import com.hmobile.tab.TabHostProvider;
import com.hmobile.tab.TabView;

// Referenced classes of package com.hmobile.biblekjv:
//            TodayActivity, FavoritesActivity, SelectActivity, BookMarkesActivity, 
//            SettingsActivity

public class TabProvider extends TabHostProvider
{

    private Tab Bible;
    private Tab BookMarks;
    private Tab MostLikeShare;
    private Tab Settings;
    private Tab Today;
    private TabView tabView;

    public TabProvider(Activity activity)
    {
        super(activity);
    }

    public TabView getTabHost(String s)
    {
        tabView = new TabView(context);
        tabView.setOrientation(com.hmobile.tab.TabView.Orientation.BOTTOM);
        tabView.setBackgroundID(0x7f0200a3);
        tabView.setSeparatorID(0x7f020097);
        Today = new Tab(context, "Today");
        Today.setIcon(0x7f020062);
        Today.setIconSelected(0x7f020062);
        Today.setIntent(new Intent(context, com/hmobile/biblekjv/TodayActivity));
        MostLikeShare = new Tab(context, "MostLikeShare");
        MostLikeShare.setIcon(0x7f02006e);
        MostLikeShare.setIconSelected(0x7f02006e);
        MostLikeShare.setIntent(new Intent(context, com/hmobile/biblekjv/FavoritesActivity));
        Bible = new Tab(context, "Bible");
        Bible.setIcon(0x7f020065);
        Bible.setIconSelected(0x7f020065);
        Bible.setIntent(new Intent(context, com/hmobile/biblekjv/SelectActivity));
        BookMarks = new Tab(context, "Bookmarks");
        BookMarks.setIcon(0x7f02000c);
        BookMarks.setIconSelected(0x7f02000c);
        BookMarks.setIntent(new Intent(context, com/hmobile/biblekjv/BookMarkesActivity));
        Settings = new Tab(context, "Settings");
        Settings.setIcon(0x7f020099);
        Settings.setIconSelected(0x7f020099);
        Settings.setIntent(new Intent(context, com/hmobile/biblekjv/SettingsActivity));
        tabView.addTab(Today);
        tabView.addTab(MostLikeShare);
        tabView.addTab(Bible);
        tabView.addTab(BookMarks);
        tabView.addTab(Settings);
        tabView.setCurrentView(0x7f030033);
        return tabView;
    }
}
