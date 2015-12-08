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
import com.tinder.utils.v;

public final class z extends Fragment
{

    protected TextView a;
    protected ImageView b;
    private int c;

    public z()
    {
    }

    public static z a(int i)
    {
        z z1 = new z();
        Bundle bundle = new Bundle();
        bundle.putInt("page", i);
        z1.setArguments(bundle);
        return z1;
    }

    private void a(int i, int j)
    {
        a.setText(i);
        try
        {
            b.setImageResource(j);
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            v.b("out of memory :(");
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        c = getArguments().getInt("page");
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300a0, viewgroup, false);
        a = (TextView)layoutinflater.findViewById(0x7f0e02ec);
        b = (ImageView)layoutinflater.findViewById(0x7f0e01fe);
        switch (c)
        {
        default:
            a(0x7f0600ea, 0x7f020108);
            return layoutinflater;

        case 0: // '\0'
            a(0x7f0600ea, 0x7f020108);
            return layoutinflater;

        case 1: // '\001'
            a(0x7f0600eb, 0x7f020109);
            return layoutinflater;

        case 2: // '\002'
            a(0x7f0600ec, 0x7f02010a);
            break;
        }
        return layoutinflater;
    }
}
