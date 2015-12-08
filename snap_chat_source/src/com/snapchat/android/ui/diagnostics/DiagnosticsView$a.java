// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.diagnostics;

import Cf;
import Cj;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.ui.diagnostics:
//            DiagnosticsView

static abstract class a extends BaseAdapter
    implements eAdapter
{

    private final LayoutInflater a;

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a.inflate(0x7f04005b, viewgroup, false);
        }
        view = (TextView)view1.findViewById(0x7f0d0249);
        viewgroup = (TextView)view1.findViewById(0x7f0d024a);
        Cj cj = (Cj)getItem(i);
        view.setText(cj.j.toString());
        viewgroup.setText(cj.b());
        return view1;
    }

    protected (LayoutInflater layoutinflater)
    {
        a = layoutinflater;
    }
}
