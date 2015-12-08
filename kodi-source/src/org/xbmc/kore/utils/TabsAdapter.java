// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;

public class TabsAdapter extends FragmentPagerAdapter
{
    public static final class TabInfo
    {

        private final Bundle args;
        private final Class fragmentClass;
        private final long fragmentId;
        private final int titleRes;





        TabInfo(Class class1, Bundle bundle, int i, long l)
        {
            fragmentClass = class1;
            args = bundle;
            titleRes = i;
            fragmentId = l;
        }
    }


    private final Context context;
    private final ArrayList tabInfos = new ArrayList();

    public TabsAdapter(Context context1, FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        context = context1;
    }

    public TabsAdapter addTab(Class class1, Bundle bundle, int i, long l)
    {
        class1 = new TabInfo(class1, bundle, i, l);
        tabInfos.add(class1);
        return this;
    }

    public int getCount()
    {
        return tabInfos.size();
    }

    public Fragment getItem(int i)
    {
        TabInfo tabinfo = (TabInfo)tabInfos.get(i);
        return Fragment.instantiate(context, tabinfo.fragmentClass.getName(), tabinfo.args);
    }

    public long getItemId(int i)
    {
        return ((TabInfo)tabInfos.get(i)).fragmentId;
    }

    public CharSequence getPageTitle(int i)
    {
        TabInfo tabinfo = (TabInfo)tabInfos.get(i);
        if (tabinfo != null)
        {
            return context.getString(tabinfo.titleRes);
        } else
        {
            return null;
        }
    }
}
