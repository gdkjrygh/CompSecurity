// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostsFragment, PlaylistLikesFragment

public class PlaylistsPagerAdapter extends FragmentPagerAdapter
{

    private static final int TAB_LIKED_PLAYLISTS = 1;
    private static final int TAB_YOUR_PLAYLISTS = 0;
    private final Resources resources;

    public PlaylistsPagerAdapter(FragmentManager fragmentmanager, Resources resources1)
    {
        super(fragmentmanager);
        resources = resources1;
    }

    public int getCount()
    {
        return 2;
    }

    public Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected position for getItem ")).append(i).toString());

        case 0: // '\0'
            return new PlaylistPostsFragment();

        case 1: // '\001'
            return new PlaylistLikesFragment();
        }
    }

    public CharSequence getPageTitle(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected position for getPageTitle ")).append(i).toString());

        case 0: // '\0'
            return resources.getString(0x7f070232);

        case 1: // '\001'
            return resources.getString(0x7f070152);
        }
    }
}
