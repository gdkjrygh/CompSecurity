// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import com.jcp.model.CardDetails;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            et, ev, ew, ex

class eu
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final et a;

    eu(et et1)
    {
        a = et1;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new Dialog(a.i());
        adapterview.requestWindowFeature(1);
        adapterview.setContentView(0x7f030056);
        et.a(a, (LinearLayout)adapterview.findViewById(0x7f0e0227));
        et.b(a, (LinearLayout)adapterview.findViewById(0x7f0e0225));
        if (((CardDetails)et.a(a).get(i)).isDefault())
        {
            et.b(a).setVisibility(8);
            et.d(a).setOnClickListener(new ev(this, i, adapterview));
            adapterview.show();
            return true;
        } else
        {
            et.b(a).setOnClickListener(new ew(this, i, adapterview));
            et.d(a).setOnClickListener(new ex(this, i, adapterview));
            adapterview.show();
            return true;
        }
    }
}
