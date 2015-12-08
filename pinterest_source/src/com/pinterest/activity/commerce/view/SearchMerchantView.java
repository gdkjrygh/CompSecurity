// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.api.model.ShopCollectionItemLayoutParams;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.StringUtils;

public class SearchMerchantView extends RelativeLayout
{

    WebImageView logo;
    View logoBorder;
    PTextView subtitle;
    PTextView title;

    public SearchMerchantView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f030190, this);
        ButterKnife.a(this);
        setBackgroundColor(-1);
    }

    public void bind(ShopCollectionItem shopcollectionitem)
    {
        int i = 0;
        title.setText(shopcollectionitem.getTitle());
        boolean flag;
        if (StringUtils.isEmpty(shopcollectionitem.getDescription()))
        {
            subtitle.setVisibility(8);
        } else
        {
            subtitle.setText(shopcollectionitem.getDescription());
        }
        logo.loadUrl(shopcollectionitem.getCoverImageUrl());
        if (shopcollectionitem.getLayoutParams() != null)
        {
            flag = shopcollectionitem.getLayoutParams().hasBorder();
        } else
        {
            flag = false;
        }
        shopcollectionitem = logoBorder;
        if (!flag)
        {
            i = 8;
        }
        shopcollectionitem.setVisibility(i);
    }
}
