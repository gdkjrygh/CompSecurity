// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.adapters:
//            ProductListAdapter

class cc
    implements android.view.View.OnClickListener
{

    final View a;
    final int b;
    final ProductListAdapter c;

    cc(ProductListAdapter productlistadapter, View view, int i)
    {
        c = productlistadapter;
        a = view;
        b = i;
        super();
    }

    public void onClick(View view)
    {
        if (ProductListAdapter.h() != null && ProductListAdapter.h().get() != null)
        {
            ((android.widget.AdapterView.OnItemClickListener)ProductListAdapter.h().get()).onItemClick(null, a, b, b);
        }
    }
}
