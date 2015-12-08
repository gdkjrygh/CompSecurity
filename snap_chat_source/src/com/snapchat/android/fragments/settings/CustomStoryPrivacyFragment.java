// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Jc;
import OH;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Filter;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mH;
import yy;

public class CustomStoryPrivacyFragment extends SnapchatFragment
    implements yy.a
{

    private final HashSet a;
    private final ArrayList b;
    private final ArrayList c;
    private yy d;
    private View e;
    private View f;
    private EditText g;
    private View h;
    private boolean i;
    private InputMethodManager j;
    private final FriendManager k;

    public CustomStoryPrivacyFragment()
    {
        this(FriendManager.e());
    }

    private CustomStoryPrivacyFragment(FriendManager friendmanager)
    {
        a = new HashSet();
        b = new ArrayList();
        c = new ArrayList();
        i = false;
        k = friendmanager;
    }

    static boolean a(CustomStoryPrivacyFragment customstoryprivacyfragment)
    {
        return customstoryprivacyfragment.i;
    }

    static InputMethodManager b(CustomStoryPrivacyFragment customstoryprivacyfragment)
    {
        return customstoryprivacyfragment.j;
    }

    static void c(CustomStoryPrivacyFragment customstoryprivacyfragment)
    {
        customstoryprivacyfragment.e.setVisibility(4);
        customstoryprivacyfragment.f.setVisibility(4);
        customstoryprivacyfragment.g.setVisibility(0);
        customstoryprivacyfragment.g.requestFocus();
        customstoryprivacyfragment.j.showSoftInput(customstoryprivacyfragment.g, 0);
        customstoryprivacyfragment.i = true;
    }

    static EditText d(CustomStoryPrivacyFragment customstoryprivacyfragment)
    {
        return customstoryprivacyfragment.g;
    }

    static yy e(CustomStoryPrivacyFragment customstoryprivacyfragment)
    {
        return customstoryprivacyfragment.d;
    }

    static View f(CustomStoryPrivacyFragment customstoryprivacyfragment)
    {
        return customstoryprivacyfragment.h;
    }

    private void h()
    {
        if (k.f())
        {
            a.clear();
            b.clear();
            c.clear();
            a.addAll(k.mFriendsBlockedFromSeeingMyStory);
            b.addAll(k.j());
            c.addAll(k.mOutgoingFriendsListMap.b());
            d.notifyDataSetChanged();
        }
    }

    public final boolean a(Friend friend)
    {
        return a.contains(friend.g());
    }

    public final void b(Friend friend)
    {
        a.add(friend.g());
        d.notifyDataSetChanged();
    }

    public final void c(Friend friend)
    {
        a.remove(friend.g());
        d.notifyDataSetChanged();
    }

    public final boolean f()
    {
        boolean flag = false;
        if (i)
        {
            e.setVisibility(0);
            f.setVisibility(0);
            g.setText("");
            g.clearFocus();
            j.hideSoftInputFromWindow(getView().getWindowToken(), 0);
            g.setVisibility(4);
            i = false;
            flag = true;
        }
        return flag;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040050, viewgroup, false);
        j = (InputMethodManager)getActivity().getSystemService("input_method");
        layoutinflater = getActivity();
        viewgroup = b;
        bundle = c;
        new com.snapchat.android.model.Friend.a();
        d = new yy(layoutinflater, viewgroup, bundle, this);
        layoutinflater = (StickyListHeadersListView)d(0x7f0d01f0);
        layoutinflater.setAdapter(d);
        layoutinflater.setOnTouchListener(new android.view.View.OnTouchListener() {

            private CustomStoryPrivacyFragment a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (CustomStoryPrivacyFragment.a(a))
                {
                    CustomStoryPrivacyFragment.b(a).hideSoftInputFromWindow(a.getView().getWindowToken(), 0);
                }
                return false;
            }

            
            {
                a = CustomStoryPrivacyFragment.this;
                super();
            }
        });
        layoutinflater.setFastScrollAlwaysVisible(true);
        layoutinflater.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public final void onItemClick(AdapterView adapterview, View view, int l, long l1)
            {
                adapterview = (CheckBox)view.findViewById(0x7f0d01f1);
                if (adapterview == null)
                {
                    return;
                }
                boolean flag;
                if (!adapterview.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adapterview.setChecked(flag);
            }

        });
        layoutinflater.setTextFilterEnabled(true);
        d(0x7f0d01ec).setOnClickListener(new android.view.View.OnClickListener() {

            private CustomStoryPrivacyFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = CustomStoryPrivacyFragment.this;
                super();
            }
        });
        e = d(0x7f0d01ee);
        e.setOnClickListener(new android.view.View.OnClickListener() {

            private CustomStoryPrivacyFragment a;

            public final void onClick(View view)
            {
                CustomStoryPrivacyFragment.c(a);
            }

            
            {
                a = CustomStoryPrivacyFragment.this;
                super();
            }
        });
        f = d(0x7f0d0081);
        h = d(0x7f0d003d);
        h.setOnClickListener(new android.view.View.OnClickListener() {

            private CustomStoryPrivacyFragment a;

            public final void onClick(View view)
            {
                CustomStoryPrivacyFragment.d(a).setText("");
            }

            
            {
                a = CustomStoryPrivacyFragment.this;
                super();
            }
        });
        g = (EditText)d(0x7f0d01ed);
        g.addTextChangedListener(new TextWatcher(layoutinflater) {

            private StickyListHeadersListView a;
            private CustomStoryPrivacyFragment b;

            public final void afterTextChanged(Editable editable)
            {
            }

            public final void beforeTextChanged(CharSequence charsequence, int l, int i1, int j1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int l, int i1, int j1)
            {
                CustomStoryPrivacyFragment.e(b).getFilter().filter(charsequence.toString());
                if (charsequence.toString().equals("") || charsequence.toString() == null)
                {
                    a.setFastScrollAlwaysVisible(true);
                    a.setFastScrollEnabled(true);
                    CustomStoryPrivacyFragment.f(b).setVisibility(4);
                    return;
                } else
                {
                    a.setFastScrollAlwaysVisible(false);
                    a.setFastScrollEnabled(false);
                    CustomStoryPrivacyFragment.f(b).setVisibility(0);
                    return;
                }
            }

            
            {
                b = CustomStoryPrivacyFragment.this;
                a = stickylistheaderslistview;
                super();
            }
        });
        h();
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        if (k.f())
        {
            ArrayList arraylist = new ArrayList(a.size());
            arraylist.addAll(a);
            k.c(arraylist);
            (new mH(Ss.a.UPDATESTORYPRIVACY, new String[] {
                "CUSTOM"
            })).execute();
        }
    }

    public void onUserLoadedEvent(OH oh)
    {
        h();
    }
}
