// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

// Referenced classes of package com.jcp.widget:
//            ProductRating

public class 
    implements butterknife.or
{

    public void inject(butterknife.or or, ProductRating productrating, Object obj)
    {
        productrating.starRating = (RatingBar)or.or((View)or.redView(obj, 0x7f0e04ec, "field 'starRating'"), 0x7f0e04ec, "field 'starRating'");
        productrating.numReviews = (TextView)or.redView((View)or.redView(obj, 0x7f0e04ed, "field 'numReviews'"), 0x7f0e04ed, "field 'numReviews'");
    }

    public volatile void inject(butterknife.or or, Object obj, Object obj1)
    {
        inject(or, (ProductRating)obj, obj1);
    }

    public void reset(ProductRating productrating)
    {
        productrating.starRating = null;
        productrating.numReviews = null;
    }

    public volatile void reset(Object obj)
    {
        reset((ProductRating)obj);
    }

    public ()
    {
    }
}
