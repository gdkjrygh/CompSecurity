// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.jcp.b.b;
import com.jcp.d.a;
import com.jcp.e.j;
import com.jcp.fragments.ProductDetailFragment;
import com.jcp.fragments.t;
import com.jcp.pojo.SavedItems;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            CustomSavedItemAdapter

class aq
    implements android.view.View.OnClickListener
{

    final int a;
    final CustomSavedItemAdapter b;

    aq(CustomSavedItemAdapter customsaveditemadapter, int i)
    {
        b = customsaveditemadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        view = ((SavedItems)CustomSavedItemAdapter.e(b).get(a)).getPpId();
        String s = ((SavedItems)CustomSavedItemAdapter.e(b).get(a)).getProductURL();
        String s1 = ((SavedItems)CustomSavedItemAdapter.e(b).get(a)).getId();
        com.jcp.b.b.d(false);
        ProductDetailFragment productdetailfragment = new ProductDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ProductURL", s);
        bundle.putString("PPID", view);
        bundle.putBoolean("ProductDetails", false);
        bundle.putBoolean("ColorSelected", true);
        bundle.putString("idSavedItem", s1);
        bundle.putBoolean("FromSaved", true);
        productdetailfragment.g(bundle);
        if (com.jcp.adapters.CustomSavedItemAdapter.b(b) instanceof t)
        {
            ((t)com.jcp.adapters.CustomSavedItemAdapter.b(b)).b(productdetailfragment, "ProductDetailFragment");
            return;
        } else
        {
            throw new a(String.format("Cannot typecast the object of type %s to class %s", new Object[] {
                com.jcp.adapters.CustomSavedItemAdapter.b(b).getClass().getName(), com/jcp/e/j.getName()
            }));
        }
    }
}
