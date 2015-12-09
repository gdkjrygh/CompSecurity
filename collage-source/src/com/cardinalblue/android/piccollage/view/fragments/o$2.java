// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            o

class a
    implements com.malinskiy.superrecyclerview.rRecyclerView.b
{

    final o a;

    public void a()
    {
        TextView textview = (TextView)o.c(a).getEmptyView();
        if (textview != null)
        {
            textview.setText(String.format(a.getActivity().getString(0x7f07020c), new Object[] {
                o.a(a)
            }));
        }
    }

    (o o1)
    {
        a = o1;
        super();
    }
}
