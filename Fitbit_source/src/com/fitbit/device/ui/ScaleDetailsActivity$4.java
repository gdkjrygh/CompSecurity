// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.fitbit.data.domain.device.Scale;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity

class a extends ArrayAdapter
{

    final ScaleDetailsActivity a;

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getDropDownView(i, view, viewgroup);
        ((TextView)view.findViewById(0x1020014)).setText(Scale.b[i]);
        return view;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        ((TextView)view.findViewById(0x1020014)).setText(Scale.b[i]);
        return view;
    }

    Units(ScaleDetailsActivity scaledetailsactivity, Context context, int i, int j, com.fitbit.data.domain.its aits[])
    {
        a = scaledetailsactivity;
        super(context, i, j, aits);
    }
}
