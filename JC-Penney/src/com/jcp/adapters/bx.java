// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import com.jcp.activities.ProductFilterSortActivity;
import com.jcp.productlistentity.ProductListFilterEntity;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            bw

class bx
    implements android.view.View.OnClickListener
{

    final int a;
    final bw b;

    bx(bw bw1, int i)
    {
        b = bw1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        bw.b(b).a((ProductListFilterEntity)bw.a(b).get(a), a);
    }
}
