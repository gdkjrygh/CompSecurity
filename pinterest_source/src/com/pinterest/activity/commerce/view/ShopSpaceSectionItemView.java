// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.google.common.base.Strings;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.api.model.ShopCollectionItemLayoutParams;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;

public class ShopSpaceSectionItemView extends RelativeLayout
{

    WebImageView background;
    View border;
    PTextView subTitle;
    PTextView title;

    public ShopSpaceSectionItemView(Context context)
    {
        super(context);
        init(context);
    }

    public ShopSpaceSectionItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public ShopSpaceSectionItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f0301a1, this);
        ButterKnife.a(this);
    }

    public void bind(ShopCollectionItem shopcollectionitem)
    {
        int i = 0;
        background.loadUrl(shopcollectionitem.getCoverImageUrl());
        title.setText(shopcollectionitem.getTitle());
        if (Strings.isNullOrEmpty(shopcollectionitem.getDescription()))
        {
            subTitle.setVisibility(8);
        } else
        {
            subTitle.setText(shopcollectionitem.getDescription());
            subTitle.setVisibility(0);
        }
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
