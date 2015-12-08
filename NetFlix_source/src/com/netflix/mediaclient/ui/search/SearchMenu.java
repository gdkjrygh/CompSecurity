// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import android.view.Menu;
import android.view.MenuItem;
import com.netflix.mediaclient.android.activity.NetflixActivity;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchActivity

public class SearchMenu
{

    public SearchMenu()
    {
    }

    public static void addSearchNavigation(NetflixActivity netflixactivity, Menu menu)
    {
        menu.add(0, 0x7f070038, 0, 0x7f0c0156).setIcon(0x7f0200d6).setIntent(SearchActivity.create(netflixactivity)).setShowAsAction(1);
    }
}
