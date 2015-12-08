// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.filter:
//            f

public final class a extends Fragment
    implements android.view.View.OnClickListener
{

    private f a;
    private int b;

    public a()
    {
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            a = (f)activity;
            return;
        }
        catch (Exception exception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append("must implement OnbtnSendClickListener").toString());
        }
    }

    public final void onClick(View view)
    {
        if (a != null)
        {
            a.a(Integer.valueOf(b));
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = getArguments().getInt("entry_type");
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03009f, viewgroup, false);
        viewgroup = (TextView)layoutinflater.findViewById(0x7f0d0278);
        bundle = (TextView)layoutinflater.findViewById(0x7f0d0279);
        switch (b)
        {
        default:
            return layoutinflater;

        case 0: // '\0'
            viewgroup.setVisibility(0);
            viewgroup.setOnClickListener(this);
            bundle.setVisibility(8);
            return layoutinflater;

        case 1: // '\001'
            viewgroup.setVisibility(8);
            break;
        }
        bundle.setOnClickListener(this);
        bundle.setVisibility(0);
        bundle.setText(0x7f070114);
        return layoutinflater;
    }
}
