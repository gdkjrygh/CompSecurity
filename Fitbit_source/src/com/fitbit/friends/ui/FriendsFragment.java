// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.core.a;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.ah;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.ui.views.ViewPagerTabIndicator;
import com.fitbit.util.z;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.friends.ui:
//            LeaderboardFragment, MessagesFragment

public class FriendsFragment extends FitbitFragment
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{
    static abstract class FriendFragmentType extends Enum
    {

        public static final FriendFragmentType a;
        public static final FriendFragmentType b;
        private static final FriendFragmentType c[];
        final int titleId;

        public static FriendFragmentType valueOf(String s)
        {
            return (FriendFragmentType)Enum.valueOf(com/fitbit/friends/ui/FriendsFragment$FriendFragmentType, s);
        }

        public static FriendFragmentType[] values()
        {
            return (FriendFragmentType[])c.clone();
        }

        abstract Fragment a();

        static 
        {
            a = new FriendFragmentType("LEADERBOARD", 0, 0x7f080233) {

                Fragment a()
                {
                    return com.fitbit.friends.ui.LeaderboardFragment.a();
                }

            };
            b = new FriendFragmentType("MESSAGES", 1, 0x7f08031f) {

                Fragment a()
                {
                    return com.fitbit.friends.ui.MessagesFragment.a();
                }

            };
            c = (new FriendFragmentType[] {
                a, b
            });
        }

        private FriendFragmentType(String s, int i, int j)
        {
            super(s, i);
            titleId = j;
        }

    }

    private class a extends FragmentPagerAdapter
    {

        final FriendsFragment a;

        public int getCount()
        {
            return FriendFragmentType.values().length;
        }

        public Fragment getItem(int i)
        {
            return FriendFragmentType.values()[i].a();
        }

        public CharSequence getPageTitle(int i)
        {
            return a.getString(FriendFragmentType.values()[i].titleId).toUpperCase();
        }

        public a(FragmentManager fragmentmanager)
        {
            a = FriendsFragment.this;
            super(fragmentmanager);
        }
    }


    static final String a = "ACTION_TAB_CHANGED";
    private static final String b = "Friends";
    private int c;
    private ViewPager d;
    private ViewPagerTabIndicator e;

    public FriendsFragment()
    {
    }

    public static FriendsFragment a()
    {
        FriendsFragment friendsfragment = new FriendsFragment();
        friendsfragment.setArguments(new Bundle());
        return friendsfragment;
    }

    private void c()
    {
        getActivity().setTitle(0x7f0802fb);
        a a1 = new a(getChildFragmentManager());
        d.setAdapter(a1);
        e.a(d);
        e.a(this);
        int i;
        if (ah.a().g() == 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        c = i;
        if (c < a1.getCount())
        {
            d.setCurrentItem(c);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        Object obj = getChildFragmentManager();
        if (obj != null)
        {
            obj = ((FragmentManager) (obj)).getFragments();
            if (obj != null && ((List) (obj)).size() != 0)
            {
                obj = ((List) (obj)).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Fragment fragment = (Fragment)((Iterator) (obj)).next();
                    if (fragment != null && !fragment.isDetached() && !fragment.isRemoving())
                    {
                        fragment.onActivityResult(i, j, intent);
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            c = bundle.getInt("selectedPage");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400a0, viewgroup, false);
        d = (ViewPager)layoutinflater.findViewById(0x7f11009e);
        e = (ViewPagerTabIndicator)layoutinflater.findViewById(0x7f1102ac);
        c();
        return layoutinflater;
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        z.a(new Intent("ACTION_TAB_CHANGED"));
    }

    public void onResume()
    {
        super.onResume();
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.y);
        FitBitApplication.a().c().a(0x7f11000a).a("Friends");
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selectedPage", c);
    }
}
