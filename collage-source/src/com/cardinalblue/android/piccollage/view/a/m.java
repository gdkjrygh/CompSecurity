// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.model.gson.Album;
import java.util.ArrayList;

public class m extends ArrayAdapter
{

    private LayoutInflater a;

    public m(Context context, int i)
    {
        super(context, i, new ArrayList());
        a = LayoutInflater.from(context);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = a.inflate(0x7f0300e7, viewgroup, false);
        }
        ((TextView)view1.findViewById(0x7f100222)).setText(((Album)getItem(i)).getTitle());
        return view1;
    }
}
