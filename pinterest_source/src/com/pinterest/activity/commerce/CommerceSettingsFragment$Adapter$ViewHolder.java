// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.graphics.Typeface;
import com.pinterest.activity.commerce.view.LoadMoreListItemView;
import com.pinterest.activity.commerce.view.ProductView;
import com.pinterest.ui.listview.ListCellText;

public class textView extends android.support.v7.widget.older
{

    public LoadMoreListItemView loadMoreListItemView;
    public ProductView productView;
    public ListCellText textView;
    final textView this$1;

    public Q(LoadMoreListItemView loadmorelistitemview)
    {
        this$1 = this._cls1.this;
        super(loadmorelistitemview);
        loadMoreListItemView = loadmorelistitemview;
    }

    public loadMoreListItemView(ProductView productview)
    {
        this$1 = this._cls1.this;
        super(productview);
        productView = productview;
    }

    public productView(ListCellText listcelltext, boolean flag)
    {
        this$1 = this._cls1.this;
        super(listcelltext);
        textView = listcelltext;
        textView.setMaxLines(0x7fffffff);
        textView.setSingleLine(false);
        if (!flag)
        {
            textView.setTypeface(Typeface.DEFAULT);
        }
    }
}
