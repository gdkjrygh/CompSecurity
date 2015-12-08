// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.activities:
//            ProductFilterSortActivity

class ax
    implements android.content.DialogInterface.OnCancelListener
{

    final ProductFilterSortActivity a;

    ax(ProductFilterSortActivity productfiltersortactivity)
    {
        a = productfiltersortactivity;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ProductFilterSortActivity.a(a);
    }
}
