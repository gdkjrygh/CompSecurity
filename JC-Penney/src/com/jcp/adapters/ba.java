// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.RadioButton;
import com.jcp.activities.ProductFilterSortActivity;
import com.jcp.productlistentity.ProductListSortOptionEntity;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            az

class ba
    implements android.view.View.OnClickListener
{

    final int a;
    final az b;

    ba(az az1, int i)
    {
        b = az1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        if (a != az.a(b) && az.b(b) != null)
        {
            az.b(b).setChecked(false);
        }
        az.a(b, a);
        az.a(b, (RadioButton)view);
        az.d(b).a((ProductListSortOptionEntity)az.c(b).get(a));
        b.notifyDataSetChanged();
    }
}
