// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

// Referenced classes of package com.jcp.views:
//            HorizontalListOfRecommendedProducts, HorizontalListView, n

public class 
    implements butterknife.r
{

    public void inject(butterknife.r r, HorizontalListOfRecommendedProducts horizontallistofrecommendedproducts, Object obj)
    {
        horizontallistofrecommendedproducts.title = (TextView)r.r((View)r.r(obj, 0x7f0e033f, "field 'title'"), 0x7f0e033f, "field 'title'");
        obj = (View)r.r(obj, 0x7f0e0340, "field 'horizontalListView' and method 'onRecommendedProductClick'");
        horizontallistofrecommendedproducts.horizontalListView = (HorizontalListView)r.stView(((View) (obj)), 0x7f0e0340, "field 'horizontalListView'");
        ((AdapterView)obj).setOnItemClickListener(new n(this, horizontallistofrecommendedproducts));
    }

    public volatile void inject(butterknife.r r, Object obj, Object obj1)
    {
        inject(r, (HorizontalListOfRecommendedProducts)obj, obj1);
    }

    public void reset(HorizontalListOfRecommendedProducts horizontallistofrecommendedproducts)
    {
        horizontallistofrecommendedproducts.title = null;
        horizontallistofrecommendedproducts.horizontalListView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((HorizontalListOfRecommendedProducts)obj);
    }

    public ()
    {
    }
}
