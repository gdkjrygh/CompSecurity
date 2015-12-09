// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.Activity;
import android.app.SearchManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.controller.n;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import com.squareup.a.b;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            e

public class c extends Fragment
    implements com.cardinalblue.android.piccollage.controller.n.a, com.cardinalblue.android.piccollage.controller.n.b
{

    private n a;
    private e b;

    public c()
    {
    }

    public void a(View view, boolean flag)
    {
        if (flag)
        {
            b.c();
        }
    }

    public void a(CBYoutubeData cbyoutubedata)
    {
        if (b.a(cbyoutubedata))
        {
            a.e();
        }
    }

    public boolean b(CBYoutubeData cbyoutubedata)
    {
        return b.b(cbyoutubedata);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b = (e)activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300cb, viewgroup, false);
        viewgroup = getArguments().getString("keyword", null);
        a = new n(getActivity(), layoutinflater.findViewById(0x7f1000c1), this, this);
        if (!TextUtils.isEmpty(viewgroup))
        {
            a.b(viewgroup);
        } else
        {
            a.g();
        }
        if (!TextUtils.isEmpty(viewgroup))
        {
            b.c();
            a.b(viewgroup);
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        a.d();
        ((SearchManager)getActivity().getSystemService("search")).stopSearch();
    }

    public void onDetach()
    {
        super.onDetach();
        b = null;
    }

    public void onQuery(com.cardinalblue.android.piccollage.view.fragments.ah.b b1)
    {
        b.c();
        a.b(b1.a);
    }

    public void onSearchViewChanged(WebSearchActivity.a a1)
    {
        if (a1.a)
        {
            a.f();
        }
    }

    public void onStart()
    {
        super.onStart();
        d.a().a(this);
    }

    public void onStop()
    {
        super.onStop();
        d.a().b(this);
    }
}
