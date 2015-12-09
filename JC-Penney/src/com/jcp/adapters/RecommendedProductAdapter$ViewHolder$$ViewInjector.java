// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.widget.ProductRating;

public class I
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor, I i, Object obj)
    {
        i.I = (View)ctor.ctor(obj, 0x7f0e0406, "field 'product'");
        i.I = (ImageView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e0407, "field 'image'"), 0x7f0e0407, "field 'image'");
        i.I = (TextView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e0408, "field 'name'"), 0x7f0e0408, "field 'name'");
        i.I = (TextView)ctor.((View)ctor.(obj, 0x7f0e0409, "field 'salePrice'"), 0x7f0e0409, "field 'salePrice'");
        i.I = (TextView)ctor.rice((View)ctor.rice(obj, 0x7f0e040a, "field 'originalPrice'"), 0x7f0e040a, "field 'originalPrice'");
        i.I = (ProductRating)ctor.ting((View)ctor.ting(obj, 0x7f0e040b, "field 'productRating'"), 0x7f0e040b, "field 'productRating'");
        i.commendation = (View)ctor.zedRecommendation(obj, 0x7f0e040c, "field 'personalizedRecommendation'");
        i.commendation = (Button)ctor.zedRecommendation((View)ctor.zedRecommendation(obj, 0x7f0e04da, "field 'shopNow'"), 0x7f0e04da, "field 'shopNow'");
        i.commendation = (TextView)ctor.zedRecommendation((View)ctor.zedRecommendation(obj, 0x7f0e04d6, "field 'userName'"), 0x7f0e04d6, "field 'userName'");
        i.commendation = (TextView)ctor.zedRecommendation((View)ctor.zedRecommendation(obj, 0x7f0e04d5, "field 'tvFor'"), 0x7f0e04d5, "field 'tvFor'");
        i.commendation = (TextView)ctor.zedRecommendation((View)ctor.zedRecommendation(obj, 0x7f0e04d8, "field 'lineOne'"), 0x7f0e04d8, "field 'lineOne'");
        i.commendation = (TextView)ctor.zedRecommendation((View)ctor.zedRecommendation(obj, 0x7f0e04d9, "field 'lineTwo'"), 0x7f0e04d9, "field 'lineTwo'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
        inject1.commendation = null;
        inject1.commendation = null;
        inject1.commendation = null;
        inject1.commendation = null;
        inject1.commendation = null;
        inject1.commendation = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public I()
    {
    }
}
