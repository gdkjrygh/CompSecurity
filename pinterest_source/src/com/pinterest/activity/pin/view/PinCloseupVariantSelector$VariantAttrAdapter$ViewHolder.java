// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.view.View;
import com.pinterest.activity.commerce.view.VariantAttrView;
import com.pinterest.activity.commerce.view.VariantHelpTextView;
import com.pinterest.activity.commerce.view.VariantSwatchView;

public class variantSwatchView extends android.support.v7.widget.older
{

    public VariantHelpTextView helpTextView;
    final variantSwatchView this$1;
    public VariantAttrView variantAttrView;
    public View variantDummyView;
    public VariantSwatchView variantSwatchView;

    public (View view)
    {
        this$1 = this._cls1.this;
        super(view);
        variantDummyView = view;
    }

    public variantDummyView(VariantAttrView variantattrview)
    {
        this$1 = this._cls1.this;
        super(variantattrview);
        variantAttrView = variantattrview;
    }

    public variantAttrView(VariantHelpTextView varianthelptextview)
    {
        this$1 = this._cls1.this;
        super(varianthelptextview);
        helpTextView = varianthelptextview;
    }

    public helpTextView(VariantSwatchView variantswatchview)
    {
        this$1 = this._cls1.this;
        super(variantswatchview);
        variantSwatchView = variantswatchview;
    }
}
