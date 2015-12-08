// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Bt;
import CF;
import CG;
import Jo;
import Mf;
import Mt;
import Oi;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.util.ExperimentUtils;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.Set;
import ll;
import wV;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            MyFriendsFragment, AddressBookFragment, LeftSwipeContentFragment

public class FriendsContactsToggleFragment extends SnapchatFragment
    implements LeftSwipeContainerFragment.a, wV.a
{

    private wV a;
    private View b;
    private View c;
    private View d;
    private ViewPager e;
    private final Bt f;
    private final ProfileEventAnalytics g;
    private MyFriendsFragment h;
    private AddressBookFragment i;

    public FriendsContactsToggleFragment()
    {
        Bt bt = Bt.a();
        ProfileEventAnalytics profileeventanalytics = ProfileEventAnalytics.a();
        FriendManager.e();
        this(bt, profileeventanalytics);
    }

    private FriendsContactsToggleFragment(Bt bt, ProfileEventAnalytics profileeventanalytics)
    {
        f = bt;
        g = profileeventanalytics;
    }

    static View a(FriendsContactsToggleFragment friendscontactstogglefragment)
    {
        return friendscontactstogglefragment.b;
    }

    static void a(FriendsContactsToggleFragment friendscontactstogglefragment, boolean flag)
    {
        friendscontactstogglefragment.b(flag);
    }

    static View b(FriendsContactsToggleFragment friendscontactstogglefragment)
    {
        return friendscontactstogglefragment.c;
    }

    static void b(FriendsContactsToggleFragment friendscontactstogglefragment, boolean flag)
    {
        friendscontactstogglefragment.c(flag);
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            g.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_FRIENDS_PAGE);
            return;
        } else
        {
            g.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_MY_CONTACTS_PAGE, FriendManager.w(), Bt.f(), com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.UNKNOWN);
            return;
        }
    }

    static wV c(FriendsContactsToggleFragment friendscontactstogglefragment)
    {
        return friendscontactstogglefragment.a;
    }

    private void c(boolean flag)
    {
        if (flag)
        {
            if (h != null)
            {
                h.s();
            }
        } else
        if (i != null)
        {
            i.s();
            return;
        }
    }

    static void d(FriendsContactsToggleFragment friendscontactstogglefragment)
    {
        friendscontactstogglefragment.h();
    }

    static ViewPager e(FriendsContactsToggleFragment friendscontactstogglefragment)
    {
        return friendscontactstogglefragment.e;
    }

    static Bt f(FriendsContactsToggleFragment friendscontactstogglefragment)
    {
        return friendscontactstogglefragment.f;
    }

    static View g(FriendsContactsToggleFragment friendscontactstogglefragment)
    {
        return friendscontactstogglefragment.mFragmentLayout;
    }

    private void h()
    {
        boolean flag = false;
        View view;
        int j;
        if (e.mCurItem == 0 || i.a == AddFriendsFragment.Page.ADD_FRIENDS && i.D())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        view = d;
        if (j != 0)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 8;
        }
        view.setVisibility(j);
    }

    public final void K()
    {
        boolean flag;
        if (e.mCurItem == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c(flag);
    }

    public final void a(int j, Fragment fragment)
    {
        if (j == 0 && h == null)
        {
            h = (MyFriendsFragment)fragment;
        } else
        if (j == 1 && i == null)
        {
            i = (AddressBookFragment)fragment;
            return;
        }
    }

    public final boolean f()
    {
        boolean flag;
        if (e.mCurItem == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c(flag);
        return super.f();
    }

    public final CF k()
    {
        return new CF() {

            public final boolean a(CG.a a1)
            {
                return CG.h.contains(a1.c);
            }

            public final boolean b(CG.a a1)
            {
                return false;
            }

        };
    }

    public void onContactsOnSnapchatUpdatedEvent(Mt mt)
    {
        h();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        byte byte1 = 8;
        ll.e();
        mFragmentLayout = layoutinflater.inflate(0x7f040086, viewgroup, false);
        e = (ViewPager)d(0x7f0d02f7);
        layoutinflater = getArguments();
        if (layoutinflater != null)
        {
            layoutinflater = layoutinflater.getString("ADD_FRIENDS_FRAGMENT_SELECTED_FRIEND_USERNAME");
        } else
        {
            layoutinflater = null;
        }
        a = new wV(getFragmentManager(), getString(0x7f080145), getString(0x7f0800dc), layoutinflater, super.mWindowConfiguration, this);
        e.setAdapter(a);
        layoutinflater = (TextView)d(0x7f0d02f3);
        viewgroup = (TextView)d(0x7f0d02f5);
        b = d(0x7f0d02f4);
        c = d(0x7f0d02f6);
        d = d(0x7f0d003f);
        bundle = getArguments();
        if (bundle != null)
        {
            int l = bundle.getInt("FRIENDS_CONTACTS_TOGGLE_SELECTED_PAGE");
            byte byte0;
            int j;
            if (l == 0)
            {
                byte0 = 1;
            } else
            {
                byte0 = 0;
            }
            bundle = b;
            if (byte0 != 0)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            bundle.setVisibility(j);
            bundle = c;
            if (byte0 != 0)
            {
                byte0 = byte1;
            } else
            {
                byte0 = 0;
            }
            bundle.setVisibility(byte0);
            e.setCurrentItem(l);
        }
        e.setOnPageChangeListener(new android.support.v4.view.ViewPager.h() {

            private FriendsContactsToggleFragment a;

            public final void a(int i1)
            {
                byte byte2 = 8;
                View view;
                int j1;
                boolean flag;
                if (i1 == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view = FriendsContactsToggleFragment.a(a);
                if (flag)
                {
                    j1 = 0;
                } else
                {
                    j1 = 8;
                }
                view.setVisibility(j1);
                view = FriendsContactsToggleFragment.b(a);
                if (flag)
                {
                    j1 = byte2;
                } else
                {
                    j1 = 0;
                }
                view.setVisibility(j1);
                j1 = 0;
                while (j1 < FriendsContactsToggleFragment.c(a).c()) 
                {
                    Fragment fragment = FriendsContactsToggleFragment.c(a).a(j1);
                    if (fragment instanceof SnapchatFragment)
                    {
                        boolean flag1;
                        if (j1 == i1)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        ((SnapchatFragment)fragment).j(flag1);
                        if (flag1)
                        {
                            FriendsContactsToggleFragment.a(a, flag);
                        } else
                        {
                            FriendsContactsToggleFragment friendscontactstogglefragment = a;
                            boolean flag2;
                            if (!flag)
                            {
                                flag2 = true;
                            } else
                            {
                                flag2 = false;
                            }
                            FriendsContactsToggleFragment.b(friendscontactstogglefragment, flag2);
                        }
                    }
                    j1++;
                }
                FriendsContactsToggleFragment.d(a);
            }

            
            {
                a = FriendsContactsToggleFragment.this;
                super();
            }
        });
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            private FriendsContactsToggleFragment a;

            public final void onClick(View view)
            {
                FriendsContactsToggleFragment.e(a).setCurrentItem(0);
            }

            
            {
                a = FriendsContactsToggleFragment.this;
                super();
            }
        });
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            private FriendsContactsToggleFragment a;

            public final void onClick(View view)
            {
                FriendsContactsToggleFragment.e(a).setCurrentItem(1);
                FriendsContactsToggleFragment.f(a);
                if (!Bt.f())
                {
                    ExperimentUtils.a();
                    ExperimentUtils.b();
                }
            }

            
            {
                a = FriendsContactsToggleFragment.this;
                super();
            }
        });
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private FriendsContactsToggleFragment a;

            public final void onClick(View view)
            {
                switch (FriendsContactsToggleFragment.e(a).mCurItem)
                {
                default:
                    return;

                case 0: // '\0'
                    Mf.a().a(new Oi(LeftSwipeContentFragment.MY_FRIENDS_SEARCH_VIEW_FRAGMENT));
                    return;

                case 1: // '\001'
                    view = new Bundle();
                    break;
                }
                view.putBoolean("contextIsAdressBook", false);
                Mf.a().a(new Oi(LeftSwipeContentFragment.ADDRESS_BOOK_SEARCH_VIEW_FRAGMENT, view));
            }

            
            {
                a = FriendsContactsToggleFragment.this;
                super();
            }
        });
        d(0x7f0d02f0).setOnClickListener(new android.view.View.OnClickListener() {

            private FriendsContactsToggleFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), FriendsContactsToggleFragment.g(a));
                a.getActivity().onBackPressed();
            }

            
            {
                a = FriendsContactsToggleFragment.this;
                super();
            }
        });
        ll.f();
        return mFragmentLayout;
    }

    protected void onVisible()
    {
        super.onVisible();
        boolean flag;
        if (e.mCurItem == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
    }
}
