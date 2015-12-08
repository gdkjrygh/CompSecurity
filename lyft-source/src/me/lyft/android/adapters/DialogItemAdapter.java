// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class DialogItemAdapter extends ArrayAdapter
{

    public DialogItemAdapter(Context context, List list)
    {
        super(context, 0x7f03005a, 0x7f0d0198, list);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        ((TextView)view.findViewById(0x7f0d0198)).setText((String)getItem(i));
        return view;
    }
}
