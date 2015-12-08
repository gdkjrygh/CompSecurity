// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.model.WhatsNew;

public final class bu extends Fragment
{

    public WhatsNew a;

    public bu()
    {
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300bc, viewgroup, false);
        if (a != null)
        {
            viewgroup = (ImageView)layoutinflater.findViewById(0x7f0e0062);
            bundle = (TextView)layoutinflater.findViewById(0x7f0e037b);
            TextView textview = (TextView)layoutinflater.findViewById(0x7f0e037c);
            viewgroup.setImageResource(a.image);
            bundle.setText(a.header);
            textview.setText(a.description);
        }
        return layoutinflater;
    }
}
