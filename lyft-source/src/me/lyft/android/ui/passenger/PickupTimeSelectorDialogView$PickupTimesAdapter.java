// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import me.lyft.android.domain.ride.PickupOffset;

class dateFormat extends ArrayAdapter
{

    private final SimpleDateFormat dateFormat;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getView(i, view, viewgroup);
        view.setText(dateFormat.format(Long.valueOf(((PickupOffset)getItem(i)).getPickupTime())));
        return view;
    }

    public (Context context, List list)
    {
        super(context, 0x1090003, list);
        dateFormat = new SimpleDateFormat("hh:mm", Locale.US);
    }
}
