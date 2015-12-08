// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.Hero;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.StringUtils;

public class ShopSpaceCoverView extends FrameLayout
{

    WebImageView background;
    PButton button;
    PTextView description;
    PTextView label;
    PTextView title;

    public ShopSpaceCoverView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f03019d, this);
        ButterKnife.a(this);
    }

    public void bind(Hero hero)
    {
        background.loadUrl(hero.getCoverImageUrl());
        title.setText(hero.getTitle());
        button.setText(hero.getButtonText());
        label.setVisibility(8);
        description.setVisibility(8);
    }

    public void bind(ShopCollectionItem shopcollectionitem)
    {
        background.loadUrl(shopcollectionitem.getCoverImageUrl());
        title.setText(shopcollectionitem.getTitle());
        button.setText(shopcollectionitem.getActionText());
        if (!StringUtils.isEmpty(shopcollectionitem.getLabelText()))
        {
            label.setText(shopcollectionitem.getLabelText());
        } else
        {
            label.setVisibility(8);
        }
        if (!StringUtils.isEmpty(shopcollectionitem.getDescription()))
        {
            description.setText(shopcollectionitem.getDescription());
            return;
        } else
        {
            description.setVisibility(8);
            return;
        }
    }
}
