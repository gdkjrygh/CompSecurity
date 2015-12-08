// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.view.View;
import android.widget.AdapterView;
import com.jcp.productcategories.modal.Modal;
import java.util.List;

// Referenced classes of package com.jcp.views:
//            DataListView, i

class h
    implements android.widget.AdapterView.OnItemClickListener
{

    final List a;
    final int b;
    final DataListView c;

    h(DataListView datalistview, List list, int j)
    {
        c = datalistview;
        a = list;
        b = j;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        if (a.size() == 0)
        {
            return;
        }
        if (j == b)
        {
            DataListView.e(c).a(((Modal)a.get(b - 1)).getId(), ((Modal)a.get(b - 1)).getName());
            return;
        } else
        {
            adapterview = (Modal)a.get(j);
            DataListView.e(c).a(adapterview.getId(), adapterview.getName());
            return;
        }
    }
}
