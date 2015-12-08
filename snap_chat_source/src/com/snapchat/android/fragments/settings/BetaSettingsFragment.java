// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment

public class BetaSettingsFragment extends LeftSwipeSettingFragment
{

    public BetaSettingsFragment()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f04000c, viewgroup, false);
        d(0x7f0d0080).setOnClickListener(new android.view.View.OnClickListener() {

            private BetaSettingsFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = BetaSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0094).setOnClickListener(new android.view.View.OnClickListener() {

            private BetaSettingsFragment a;

            public final void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse("https://plus.google.com/u/0/communities/101602008277453798645"));
                a.startActivity(view);
            }

            
            {
                a = BetaSettingsFragment.this;
                super();
            }
        });
        d(0x7f0d0095).setOnClickListener(new android.view.View.OnClickListener() {

            private BetaSettingsFragment a;

            public final void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/apps/testing/com.snapchat.android"));
                a.startActivity(view);
            }

            
            {
                a = BetaSettingsFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }
}
