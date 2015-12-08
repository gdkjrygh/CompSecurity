// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tinder.activities.ActivityVerification;
import com.tinder.adapters.e;
import com.tinder.e.s;
import com.tinder.views.CustomActionBar;

// Referenced classes of package com.tinder.fragments:
//            bk

public final class bj extends Fragment
    implements android.view.View.OnClickListener, s
{

    private ListView a;
    private e b;

    public bj()
    {
    }

    static e a(bj bj1)
    {
        return bj1.b;
    }

    public final void onClick(View view)
    {
        (new StringBuilder("view=")).append(view);
        getActivity().onBackPressed();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b9, viewgroup, false);
        a = (ListView)layoutinflater.findViewById(0x7f0e0377);
        return layoutinflater;
    }

    public final void onMenuItemClick(int j)
    {
        getActivity().onBackPressed();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b = new e(getActivity());
        a.setAdapter(b);
        a.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final bj a;

            public final void onItemClick(AdapterView adapterview, View view1, int j, long l)
            {
                adapterview = bj.a(a).a[j];
                view1 = bj.a(a).b[j];
                (new StringBuilder("countryName=")).append(adapterview).append(", countryCode=").append(view1);
                ActivityVerification activityverification = (ActivityVerification)a.getActivity();
                (new StringBuilder("countryName=")).append(adapterview).append(", countryCode=").append(view1);
                activityverification.e = new bk();
                Bundle bundle1 = new Bundle();
                bundle1.putString("country_name", adapterview);
                bundle1.putString("country_code", view1);
                activityverification.e.setArguments(bundle1);
                activityverification.c(activityverification.e);
            }

            
            {
                a = bj.this;
                super();
            }
        });
        ((ActivityVerification)getActivity()).H().setMenu(this);
    }
}
