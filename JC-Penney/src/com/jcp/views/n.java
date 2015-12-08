// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.views:
//            HorizontalListOfRecommendedProducts

class n
    implements android.widget.AdapterView.OnItemClickListener
{

    final HorizontalListOfRecommendedProducts a;
    final HorizontalListOfRecommendedProducts..ViewInjector b;

    n(HorizontalListOfRecommendedProducts..ViewInjector viewinjector, HorizontalListOfRecommendedProducts horizontallistofrecommendedproducts)
    {
        b = viewinjector;
        a = horizontallistofrecommendedproducts;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onRecommendedProductClick(i);
    }
}
