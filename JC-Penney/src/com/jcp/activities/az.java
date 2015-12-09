// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.widget.TextView;
import com.jcp.util.ae;
import com.jcp.views.c;
import com.jcp.views.d;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            ProductFilterSortActivity

class az
    implements d
{

    final TextView a;
    final List b;
    final TextView c;
    final ProductFilterSortActivity d;

    az(ProductFilterSortActivity productfiltersortactivity, TextView textview, List list, TextView textview1)
    {
        d = productfiltersortactivity;
        a = textview;
        b = list;
        c = textview1;
        super();
    }

    public void a(c c1, Integer integer, Integer integer1)
    {
        c1 = Integer.valueOf(integer.intValue() * 1);
        integer = Integer.valueOf(integer1.intValue() * 1);
        if (c1.intValue() != ProductFilterSortActivity.b(d))
        {
            ProductFilterSortActivity.a(d, c1.intValue());
            ProductFilterSortActivity.a(d, a, c1, b);
        }
        if (integer.intValue() != com.jcp.activities.ProductFilterSortActivity.c(d))
        {
            ProductFilterSortActivity.b(d, integer.intValue());
            ProductFilterSortActivity.b(d, c, integer, b);
        }
        ae.d(ProductFilterSortActivity.h(), (new StringBuilder()).append("maxvalue  ").append(integer).append(" minvalue   ").append(c1).toString());
    }

    public volatile void a(c c1, Object obj, Object obj1)
    {
        a(c1, (Integer)obj, (Integer)obj1);
    }
}
