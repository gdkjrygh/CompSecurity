// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.categorylist;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.bugreporter.activity.categorylist:
//            CategoryListFragment

class c
    implements android.widget.AdapterView.OnItemClickListener
{

    final CategoryListFragment a;

    c(CategoryListFragment categorylistfragment)
    {
        a = categorylistfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        CategoryListFragment.a(a, i);
    }
}
