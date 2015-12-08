// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Br;
import Bt;
import OH;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.model.FriendManager;
import java.util.ArrayList;
import java.util.List;
import yo;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment

public class BlockedUsersFragment extends LeftSwipeSettingFragment
{

    private final android.support.v7.widget.RecyclerView.c a;
    private Br b;
    private List c;
    private View d;
    private RecyclerView e;
    private android.support.v7.widget.RecyclerView.i f;
    private yo g;
    private FriendManager h;

    public BlockedUsersFragment()
    {
        this(FriendManager.e());
    }

    private BlockedUsersFragment(FriendManager friendmanager)
    {
        a = new android.support.v7.widget.RecyclerView.c() {

            private BlockedUsersFragment a;

            public final void a()
            {
                BlockedUsersFragment.a(a);
            }

            public final void a(int i, int j)
            {
                BlockedUsersFragment.a(a);
            }

            public final void b(int i, int j)
            {
                BlockedUsersFragment.a(a);
            }

            public final void c(int i, int j)
            {
                BlockedUsersFragment.a(a);
            }

            
            {
                a = BlockedUsersFragment.this;
                super();
            }
        };
        c = new ArrayList();
        h = friendmanager;
    }

    static void a(BlockedUsersFragment blockedusersfragment)
    {
        if (blockedusersfragment.g.b() == 0)
        {
            blockedusersfragment.d.setVisibility(0);
            blockedusersfragment.e.setVisibility(8);
            return;
        } else
        {
            blockedusersfragment.d.setVisibility(8);
            blockedusersfragment.e.setVisibility(0);
            return;
        }
    }

    private void h()
    {
        if (h.f())
        {
            c.clear();
            c.addAll(h.r());
            ((android.support.v7.widget.RecyclerView.a) (g)).a.b();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f04000d, viewgroup, false);
        d(0x7f0d0039).setOnClickListener(new android.view.View.OnClickListener() {

            private BlockedUsersFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = BlockedUsersFragment.this;
                super();
            }
        });
        d = d(0x7f0d0096);
        e = (RecyclerView)d(0x7f0d0097);
        e.setHasFixedSize(true);
        getActivity();
        f = new LinearLayoutManager();
        e.setLayoutManager(f);
        layoutinflater = getActivity();
        viewgroup = c;
        Bt.a();
        g = new yo(layoutinflater, viewgroup);
        e.setAdapter(g);
        return mFragmentLayout;
    }

    public void onStart()
    {
        super.onStart();
        g.a(a);
    }

    public void onStop()
    {
        super.onStop();
        g.b(a);
    }

    public void onUserLoadedEvent(OH oh)
    {
        if (oh != null && oh.user != null && b == null)
        {
            b = oh.user;
            h();
        }
    }

    protected void onVisible()
    {
        h();
    }
}
