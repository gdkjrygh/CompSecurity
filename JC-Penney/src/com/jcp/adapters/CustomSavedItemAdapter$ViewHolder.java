// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.views.HtmlTypefaceTextView;

// Referenced classes of package com.jcp.adapters:
//            CustomSavedItemAdapter

public class a
{

    final CustomSavedItemAdapter a;
    protected Button addToBag;
    protected View after;
    protected HtmlTypefaceTextView colourId;
    protected RelativeLayout fullLayout;
    protected TextView header;
    protected TextView itemId;
    protected ImageView ivSavedItemId;
    protected TextView mItemSizeRange;
    protected TextView mItemSizeRangeDescription;
    protected TextView mQuantityItem;
    protected TextView originalId;
    protected View prior;
    protected Button removeSavedItems;
    protected RelativeLayout rlPlusMinusQuantity;
    protected TextView saleId;

    public (CustomSavedItemAdapter customsaveditemadapter, View view)
    {
        a = customsaveditemadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
