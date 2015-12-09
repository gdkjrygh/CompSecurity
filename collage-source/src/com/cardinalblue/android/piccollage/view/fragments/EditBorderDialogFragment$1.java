// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            EditBorderDialogFragment

class a
    implements android.widget.ener
{

    final EditBorderDialogFragment a;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = EditBorderDialogFragment.a(a).c(i);
        EditBorderDialogFragment.a(a, j);
        EditBorderDialogFragment.a(a).b(i);
        if (EditBorderDialogFragment.b(a) != null)
        {
            EditBorderDialogFragment.b(a).a(j, EditBorderDialogFragment.c(a).isChecked());
        }
        EditBorderDialogFragment.a(a).notifyDataSetChanged();
    }

    (EditBorderDialogFragment editborderdialogfragment)
    {
        a = editborderdialogfragment;
        super();
    }
}
