// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.activities:
//            ProductFilterSortActivity

class bb
    implements android.view.View.OnClickListener
{

    final ProductFilterSortActivity a;

    bb(ProductFilterSortActivity productfiltersortactivity)
    {
        a = productfiltersortactivity;
        super();
    }

    public void onClick(View view)
    {
        view = (List)ProductFilterSortActivity.f(a).get(ProductFilterSortActivity.e(a));
        if (view != null)
        {
            a.a(view);
            a.a(null, 2, -1);
        }
    }
}
