// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.api.model.ShopCollectionItemLayoutParams;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;

public class ShopSpaceGridItemView extends FrameLayout
{

    WebImageView background;
    View border;
    PTextView title;

    public ShopSpaceGridItemView(Context context, boolean flag)
    {
        super(context);
        int i;
        if (flag)
        {
            i = 0x7f03019e;
        } else
        {
            i = 0x7f03019f;
        }
        inflate(context, i, this);
        ButterKnife.a(this);
    }

    public void bind(ShopCollectionItem shopcollectionitem)
    {
        int i = 0;
        background.loadUrl(shopcollectionitem.getCoverImageUrl());
        title.setText(shopcollectionitem.getTitle());
        if (border != null)
        {
            boolean flag;
            if (shopcollectionitem.getLayoutParams() != null)
            {
                flag = shopcollectionitem.getLayoutParams().hasBorder();
            } else
            {
                flag = false;
            }
            shopcollectionitem = border;
            if (!flag)
            {
                i = 8;
            }
            shopcollectionitem.setVisibility(i);
        }
    }
}
