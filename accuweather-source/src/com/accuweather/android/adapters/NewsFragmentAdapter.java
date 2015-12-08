// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.accuweather.android.fragments.NewsDetailsFragment;
import com.accuweather.android.models.news.NewsModel;
import java.util.List;

// Referenced classes of package com.accuweather.android.adapters:
//            DetailsFragmentAdapter

public class NewsFragmentAdapter extends DetailsFragmentAdapter
{

    public NewsFragmentAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public Fragment getItem(int i)
    {
        return NewsDetailsFragment.newInstance((NewsModel)getContent().get(i));
    }
}
