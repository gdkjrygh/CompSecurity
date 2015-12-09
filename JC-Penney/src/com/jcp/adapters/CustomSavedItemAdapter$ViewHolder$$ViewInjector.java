// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.views.HtmlTypefaceTextView;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (TextView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e0232, "field 'header'"), 0x7f0e0232, "field 'header'");
        . = (TextView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e0234, "field 'itemId'"), 0x7f0e0234, "field 'itemId'");
        . = (HtmlTypefaceTextView)ctor.ctor((View)ctor.ctor(obj, 0x7f0e0235, "field 'colourId'"), 0x7f0e0235, "field 'colourId'");
        . = (TextView)ctor.Range((View)ctor.Range(obj, 0x7f0e0236, "field 'mItemSizeRange'"), 0x7f0e0236, "field 'mItemSizeRange'");
        .Description = (TextView)ctor.RangeDescription((View)ctor.RangeDescription(obj, 0x7f0e0237, "field 'mItemSizeRangeDescription'"), 0x7f0e0237, "field 'mItemSizeRangeDescription'");
        .Description = (ImageView)ctor.emId((View)ctor.emId(obj, 0x7f0e0238, "field 'ivSavedItemId'"), 0x7f0e0238, "field 'ivSavedItemId'");
        .Description = (TextView)ctor.emId((View)ctor.emId(obj, 0x7f0e0240, "field 'saleId'"), 0x7f0e0240, "field 'saleId'");
        .Description = (TextView)ctor.d((View)ctor.d(obj, 0x7f0e0241, "field 'originalId'"), 0x7f0e0241, "field 'originalId'");
        .Description = (RelativeLayout)ctor.t((View)ctor.t(obj, 0x7f0e0231, "field 'fullLayout'"), 0x7f0e0231, "field 'fullLayout'");
        .Description = (Button)ctor.t((View)ctor.t(obj, 0x7f0e0243, "field 'addToBag'"), 0x7f0e0243, "field 'addToBag'");
        .ms = (Button)ctor.edItems((View)ctor.edItems(obj, 0x7f0e0242, "field 'removeSavedItems'"), 0x7f0e0242, "field 'removeSavedItems'");
        .ntity = (RelativeLayout)ctor.usQuantity((View)ctor.usQuantity(obj, 0x7f0e023a, "field 'rlPlusMinusQuantity'"), 0x7f0e023a, "field 'rlPlusMinusQuantity'");
        .ntity = (View)ctor.usQuantity(obj, 0x7f0e0239, "field 'prior'");
        .ntity = (View)ctor.usQuantity(obj, 0x7f0e023d, "field 'after'");
        .ntity = (TextView)ctor.Item((View)ctor.Item(obj, 0x7f0e0402, "field 'mQuantityItem'"), 0x7f0e0402, "field 'mQuantityItem'");
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
        inject1. = null;
        inject1.Description = null;
        inject1.Description = null;
        inject1.Description = null;
        inject1.Description = null;
        inject1.Description = null;
        inject1.Description = null;
        inject1.ms = null;
        inject1.ntity = null;
        inject1.ntity = null;
        inject1.ntity = null;
        inject1.ntity = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
