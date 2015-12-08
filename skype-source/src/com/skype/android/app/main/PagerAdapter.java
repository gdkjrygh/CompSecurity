// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.l;
import android.support.v4.app.n;
import com.skype.android.app.contacts.ContactListFragment;
import com.skype.android.app.favorites.FavoritesFragment;
import com.skype.android.app.recents.RecentListFragment;

// Referenced classes of package com.skype.android.app.main:
//            HubSection

public class PagerAdapter extends n
{

    public PagerAdapter(l l)
    {
        super(l);
    }

    public int getCount()
    {
        return 3;
    }

    public Fragment getItem(int i)
    {
        HubSection hubsection = HubSection.forIndex(i);
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$main$HubSection[];

            static 
            {
                $SwitchMap$com$skype$android$app$main$HubSection = new int[HubSection.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSection[HubSection.RECENTS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSection[HubSection.FAVORITES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$main$HubSection[HubSection.CONTACTS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.app.main.HubSection[hubsection.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new RecentListFragment();

        case 2: // '\002'
            return new FavoritesFragment();

        case 3: // '\003'
            return new ContactListFragment();
        }
    }
}
