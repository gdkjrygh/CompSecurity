// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.ui.a.c;
import java.util.Collection;

// Referenced classes of package com.fitbit.runtrack.ui:
//            PathTrackingMapFragment

public static class addAll extends c
{

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x1090003, viewgroup, false);
        }
        ((TextView)view).setText(((ActivityItem)((Pair)getItem(i)).second).a());
        return view;
    }

    public (Collection collection)
    {
        addAll(collection);
    }
}
