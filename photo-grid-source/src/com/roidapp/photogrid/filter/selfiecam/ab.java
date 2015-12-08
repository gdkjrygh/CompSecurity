// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.photogrid.FacebookMessengerActivity;
import com.roidapp.photogrid.filter.f;

public final class ab extends Fragment
    implements android.view.View.OnClickListener
{

    private boolean a;
    private f b;

    public ab()
    {
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            b = (f)activity;
            return;
        }
        catch (Exception exception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append("must implement OnbtnSendClickListener").toString());
        }
    }

    public final void onClick(View view)
    {
        if (b != null)
        {
            b.a(Integer.valueOf(view.getId()));
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300a0, viewgroup, false);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0d003a);
        viewgroup.setOnClickListener(this);
        bundle = (TextView)layoutinflater.findViewById(0x7f0d0237);
        bundle.setOnClickListener(this);
        a = FacebookMessengerActivity.a(getActivity());
        if (a)
        {
            bundle.setVisibility(8);
            viewgroup.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            viewgroup.setBackgroundResource(0x7f020459);
            viewgroup.setText(null);
            bundle = (android.widget.RelativeLayout.LayoutParams)viewgroup.getLayoutParams();
            int i = getResources().getDimensionPixelSize(0x7f090193);
            bundle.width = i;
            bundle.height = i;
            bundle.setMargins(0, 0, getResources().getDimensionPixelSize(0x7f090187), 0);
            viewgroup.setLayoutParams(bundle);
        }
        return layoutinflater;
    }
}
