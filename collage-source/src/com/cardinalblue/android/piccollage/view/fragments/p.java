// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.view.a.x;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            s, ad, u

public class p extends Fragment
    implements s
{

    private x a;
    private Fragment b;

    public p()
    {
        b = null;
    }

    static x a(p p1)
    {
        return p1.a;
    }

    public void a(Fragment fragment, Intent intent, int i, Bundle bundle)
    {
        b = fragment;
        startActivityForResult(intent, i);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (b != null)
        {
            b.onActivityResult(i, j, intent);
            b = null;
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03002b, viewgroup, false);
        a = new x(getActivity(), getChildFragmentManager());
        viewgroup = new Bundle();
        viewgroup.putInt("type", 3);
        viewgroup.putString("user_list_path", "users/suggested");
        a.a(getString(0x7f07023b), com/cardinalblue/android/piccollage/view/fragments/ad.getName(), viewgroup, "find_featured_friends_fragment");
        viewgroup = new Bundle();
        viewgroup.putInt("type", 4);
        viewgroup.putString("user_list_path", "users/suggested/facebook");
        a.a(getString(0x7f070143), com/cardinalblue/android/piccollage/view/fragments/ad.getName(), viewgroup, "find_facebook_friends_fragment");
        viewgroup = new Bundle();
        viewgroup.putInt("type", 5);
        a.a(getString(0x7f0701e7), com/cardinalblue/android/piccollage/view/fragments/u.getName(), viewgroup, "invite_friends_fragment");
        viewgroup = (ViewPager)layoutinflater.findViewById(0x7f1000d1);
        viewgroup.setAdapter(a);
        bundle = (TabLayout)layoutinflater.findViewById(0x7f1000d0);
        int i = getResources().getColor(0x7f0f00fe);
        bundle.setTabTextColors(i, i);
        bundle.setupWithViewPager(viewgroup);
        viewgroup.addOnPageChangeListener(new android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener(bundle));
        viewgroup.addOnPageChangeListener(new android.support.v4.view.ViewPager.SimpleOnPageChangeListener() {

            final p a;

            public void onPageSelected(int j)
            {
                Object obj;
                super.onPageSelected(j);
                j = p.a(a).a(j);
                obj = null;
                j;
                JVM INSTR tableswitch 3 5: default 48
            //                           3 83
            //                           4 92
            //                           5 101;
                   goto _L1 _L2 _L3 _L4
_L1:
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    obj = (ad)a.getChildFragmentManager().findFragmentByTag(((String) (obj)));
                    ((ad) (obj)).e();
                    ((ad) (obj)).a(a);
                }
                return;
_L2:
                obj = "find_featured_friends_fragment";
                com.cardinalblue.android.piccollage.a.b.D();
                continue; /* Loop/switch isn't completed */
_L3:
                obj = "find_facebook_friends_fragment";
                com.cardinalblue.android.piccollage.a.b.E();
                continue; /* Loop/switch isn't completed */
_L4:
                com.cardinalblue.android.piccollage.a.b.F();
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                a = p.this;
                super();
            }
        });
        getActivity().setTitle(0x7f0701b1);
        setHasOptionsMenu(true);
        return layoutinflater;
    }
}
