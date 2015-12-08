// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Jo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.LeftSwipeViewPager;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import kw;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            LeftSwipeContentFragment

public class LeftSwipeContainerFragment extends SnapchatFragment
{
    static interface a
    {

        public abstract void K();
    }


    public LeftSwipeViewPager a;
    private LeftSwipeContentFragment b;
    private Bundle c;
    private kw d;

    public LeftSwipeContainerFragment()
    {
    }

    public static LeftSwipeContainerFragment a(LeftSwipeContentFragment leftswipecontentfragment, Bundle bundle)
    {
        LeftSwipeContainerFragment leftswipecontainerfragment = new LeftSwipeContainerFragment();
        Bundle bundle1 = new Bundle();
        bundle1.putSerializable("content_fragment", leftswipecontentfragment);
        if (bundle != null)
        {
            bundle1.putBundle("content_fragment_arguments", bundle);
        }
        leftswipecontainerfragment.setArguments(bundle1);
        return leftswipecontainerfragment;
    }

    static kw a(LeftSwipeContainerFragment leftswipecontainerfragment)
    {
        return leftswipecontainerfragment.d;
    }

    static View b(LeftSwipeContainerFragment leftswipecontainerfragment)
    {
        return leftswipecontainerfragment.mFragmentLayout;
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND;
    }

    public final SnapchatFragment h()
    {
        return (SnapchatFragment)d.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            b = (LeftSwipeContentFragment)bundle.getSerializable("content_fragment");
            c = bundle.getBundle("content_fragment_arguments");
        }
        if (ReleaseManager.f() && b == null)
        {
            throw new IllegalArgumentException("Cannot create LeftSwipeContainerFragment with null ContentFragment!");
        } else
        {
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040093, viewgroup, false);
        a = (LeftSwipeViewPager)d(0x7f0d031c);
        d = new kw(getChildFragmentManager(), b, c);
        a.setAdapter(d);
        a.setCurrentItem(1);
        a.setOnPageChangeListener(new android.support.v4.view.ViewPager.e() {

            private LeftSwipeContainerFragment a;

            public final void a(int i)
            {
            }

            public final void a(int i, float f, int j)
            {
                android.support.v4.app.Fragment fragment = LeftSwipeContainerFragment.a(a).a;
                if (i == 0 && f <= 0.05F)
                {
                    Jo.a(a.getActivity(), LeftSwipeContainerFragment.b(a));
                    a.getActivity().onBackPressed();
                    if (fragment instanceof a)
                    {
                        ((a)fragment).K();
                    }
                }
            }

            public final void b(int i)
            {
            }

            
            {
                a = LeftSwipeContainerFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    protected void onVisible()
    {
        super.onVisible();
        j(false);
        SnapchatFragment snapchatfragment = h();
        if (snapchatfragment != null)
        {
            snapchatfragment.j(true);
        }
        a.setLeftSwipeEnable(true);
    }
}
