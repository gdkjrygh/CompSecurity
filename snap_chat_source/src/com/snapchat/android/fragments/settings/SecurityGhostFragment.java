// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.util.fragment.SnapchatFragment;

public class SecurityGhostFragment extends SnapchatFragment
{

    private String a;

    public SecurityGhostFragment()
    {
    }

    public static SecurityGhostFragment a(String s)
    {
        SecurityGhostFragment securityghostfragment = new SecurityGhostFragment();
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("text_message", s);
        securityghostfragment.setArguments(bundle);
        return securityghostfragment;
    }

    public final boolean f()
    {
        if (d(LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()))
        {
            return true;
        } else
        {
            return super.f();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            a = bundle.getString("text_message");
        }
        Timber.c("SecurityGhostFragment", (new StringBuilder("onCreate - mText ")).append(a).toString(), new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400c5, viewgroup, false);
        ((TextView)d(0x7f0d041f)).setText(a);
        d(0x7f0d041c).setOnClickListener(new android.view.View.OnClickListener() {

            private SecurityGhostFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = SecurityGhostFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }
}
