// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.widget.AdapterView;
import com.jcp.productlistentity.ProductListProductEntity;
import com.jcp.util.ab;

// Referenced classes of package com.jcp.activities:
//            SlyceScanActivity

class bw
    implements android.widget.AdapterView.OnItemClickListener
{

    final SlyceScanActivity a;

    bw(SlyceScanActivity slycescanactivity)
    {
        a = slycescanactivity;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((ProductListProductEntity)adapterview.getItemAtPosition(i)).getId();
        a.setResult(-1, ab.a(adapterview));
        a.finish();
    }
}
