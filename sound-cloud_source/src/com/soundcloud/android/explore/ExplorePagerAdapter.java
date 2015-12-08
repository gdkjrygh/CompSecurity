// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.soundcloud.android.main.Screen;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreGenresFragment, ExploreGenre, ExploreTracksFragment

public class ExplorePagerAdapter extends FragmentPagerAdapter
{

    protected static final int TAB_GENRES = 0;
    protected static final int TAB_TRENDING_AUDIO = 2;
    protected static final int TAB_TRENDING_MUSIC = 1;
    private final Resources resources;

    public ExplorePagerAdapter(Resources resources1, FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        resources = resources1;
    }

    public int getCount()
    {
        return 3;
    }

    public Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected position for getItem ")).append(i).toString());

        case 0: // '\0'
            return new ExploreGenresFragment();

        case 1: // '\001'
            return ExploreTracksFragment.create(ExploreGenre.POPULAR_MUSIC_CATEGORY, Screen.EXPLORE_TRENDING_MUSIC);

        case 2: // '\002'
            return ExploreTracksFragment.create(ExploreGenre.POPULAR_AUDIO_CATEGORY, Screen.EXPLORE_TRENDING_AUDIO);
        }
    }

    public CharSequence getPageTitle(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected position for getPageTitle ")).append(i).toString());

        case 0: // '\0'
            return resources.getString(0x7f070134);

        case 1: // '\001'
            return resources.getString(0x7f070131);

        case 2: // '\002'
            return resources.getString(0x7f070130);
        }
    }

    public float getPageWidth(int i)
    {
        if (i == 0)
        {
            return resources.getDimension(0x7f0b0014);
        } else
        {
            return super.getPageWidth(i);
        }
    }
}
