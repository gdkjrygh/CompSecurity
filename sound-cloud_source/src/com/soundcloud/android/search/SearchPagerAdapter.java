// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Referenced classes of package com.soundcloud.android.search:
//            SearchResultsFragment

public class SearchPagerAdapter extends FragmentPagerAdapter
{

    protected static final int TAB_ALL = 0;
    protected static final int TAB_PEOPLE = 3;
    protected static final int TAB_PLAYLISTS = 2;
    protected static final int TAB_TRACKS = 1;
    private final boolean firstTime;
    private final String query;
    private final Resources resources;

    public SearchPagerAdapter(Resources resources1, FragmentManager fragmentmanager, String s, boolean flag)
    {
        super(fragmentmanager);
        resources = resources1;
        query = s;
        firstTime = flag;
    }

    public int getCount()
    {
        return 4;
    }

    public Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected position for getItem ")).append(i).toString());

        case 0: // '\0'
            return SearchResultsFragment.create(0, query, firstTime);

        case 1: // '\001'
            return SearchResultsFragment.create(1, query, false);

        case 2: // '\002'
            return SearchResultsFragment.create(2, query, false);

        case 3: // '\003'
            return SearchResultsFragment.create(3, query, false);
        }
    }

    public CharSequence getPageTitle(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected position for getPageTitle ")).append(i).toString());

        case 0: // '\0'
            return resources.getString(0x7f0701db);

        case 1: // '\001'
            return resources.getString(0x7f0701de);

        case 2: // '\002'
            return resources.getString(0x7f0701dd);

        case 3: // '\003'
            return resources.getString(0x7f0701dc);
        }
    }
}
