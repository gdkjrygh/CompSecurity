// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import Jc;
import Lt;
import S;
import V;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BugReportRemoteLogListFragment extends SnapchatFragment
{
    public static interface a
    {

        public abstract void b(String s);
    }


    private final FriendManager mFriendManager;

    public BugReportRemoteLogListFragment()
    {
        this(FriendManager.e());
    }

    private BugReportRemoteLogListFragment(FriendManager friendmanager)
    {
        mFriendManager = friendmanager;
    }

    private String[] h()
    {
        if (!mFriendManager.f())
        {
            return new String[0];
        }
        Object obj = mFriendManager.mOutgoingFriendsListMap.b();
        Object obj1 = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((List) (obj1)).add(((Friend)((Iterator) (obj)).next()).g())) { }
        Collections.sort(((List) (obj1)));
        obj = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
        char c2;
        for (char c1 = '.'; ((Iterator) (obj1)).hasNext(); c1 = c2)
        {
            String s = (String)((Iterator) (obj1)).next();
            c2 = c1;
            if (c1 != s.charAt(0))
            {
                char c = s.charAt(0);
                ((List) (obj)).add((new StringBuilder()).append(Character.toUpperCase(c)).toString());
                c2 = c;
            }
            ((List) (obj)).add(s);
        }

        String as[] = new String[((List) (obj)).size()];
        ((List) (obj)).toArray(as);
        return as;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040012, viewgroup, false);
        super.mFragmentLayout = layoutinflater;
        viewgroup = (ListView)d(0x7f0d00ac);
        viewgroup.setAdapter(new Lt(getActivity(), h()));
        viewgroup.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final BugReportRemoteLogListFragment this$0;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (adapterview.getItemAtPosition(i).toString().length() == 1)
                {
                    return;
                }
                if (getActivity() instanceof a)
                {
                    adapterview = adapterview.getItemAtPosition(i).toString();
                    ((a)getActivity()).b(adapterview);
                }
                getActivity().mFragments.a().a(BugReportRemoteLogListFragment.this).a("Chosen remote recipient").a();
            }

            
            {
                this$0 = BugReportRemoteLogListFragment.this;
                super();
            }
        });
        return layoutinflater;
    }
}
