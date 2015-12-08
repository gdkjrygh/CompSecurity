// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import com.jcp.activities.ProductFilterSortActivity;
import com.jcp.productlistentity.ProductListValueEntity;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.adapters:
//            ProductFilterSortListAdapter

class bz
    implements android.view.View.OnClickListener
{

    final int a;
    final ProductFilterSortListAdapter.ProductFilterSortListViewHolder b;
    final ProductFilterSortListAdapter c;

    bz(ProductFilterSortListAdapter productfiltersortlistadapter, int i, ProductFilterSortListAdapter.ProductFilterSortListViewHolder productfiltersortlistviewholder)
    {
        c = productfiltersortlistadapter;
        a = i;
        b = productfiltersortlistviewholder;
        super();
    }

    public void onClick(View view)
    {
        view = ((ProductListValueEntity)ProductFilterSortListAdapter.a(c).get(a)).getId();
        view = (ProductListValueEntity)ProductFilterSortListAdapter.b(c).get(view);
        if (view != null)
        {
            view.setSelected(Boolean.valueOf(b.mCheckBox.isChecked()));
            if (b.mCheckBox.isChecked())
            {
                b.mCheckBox.setSelected(true);
                b.mCheckBox.setChecked(true);
                ProductFilterSortListAdapter.c(c).a((ProductListValueEntity)ProductFilterSortListAdapter.a(c).get(a), 0, a);
                return;
            } else
            {
                b.mCheckBox.setSelected(false);
                b.mCheckBox.setChecked(false);
                ProductFilterSortListAdapter.c(c).a((ProductListValueEntity)ProductFilterSortListAdapter.a(c).get(a), 1, a);
                return;
            }
        } else
        {
            Toast.makeText(ProductFilterSortListAdapter.d(c), ProductFilterSortListAdapter.d(c).getResources().getString(0x7f07005d), 0).show();
            return;
        }
    }
}
