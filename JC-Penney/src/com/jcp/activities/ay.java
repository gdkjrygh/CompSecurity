// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;

// Referenced classes of package com.jcp.activities:
//            ProductFilterSortActivity

class ay
    implements android.view.View.OnClickListener
{

    final ProductFilterSortActivity a;

    ay(ProductFilterSortActivity productfiltersortactivity)
    {
        a = productfiltersortactivity;
        super();
    }

    public void onClick(View view)
    {
        ProductFilterSortActivity.a(a);
    }
}
