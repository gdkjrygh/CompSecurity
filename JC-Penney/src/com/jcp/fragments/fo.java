// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.fragments:
//            SavedCardFragment, fp, fq

class fo
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final SavedCardFragment a;

    fo(SavedCardFragment savedcardfragment)
    {
        a = savedcardfragment;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new Dialog(a.i());
        adapterview.requestWindowFeature(1);
        adapterview.setContentView(0x7f030056);
        SavedCardFragment.b(a, (TextView)adapterview.findViewById(0x7f0e0226));
        SavedCardFragment.c(a, (TextView)adapterview.findViewById(0x7f0e0228));
        SavedCardFragment.b(a, (LinearLayout)adapterview.findViewById(0x7f0e0225));
        SavedCardFragment.c(a, (LinearLayout)adapterview.findViewById(0x7f0e0227));
        SavedCardFragment.d(a).setOnClickListener(new fp(this, i, adapterview));
        SavedCardFragment.e(a).setOnClickListener(new fq(this, i, adapterview));
        adapterview.show();
        return false;
    }
}
