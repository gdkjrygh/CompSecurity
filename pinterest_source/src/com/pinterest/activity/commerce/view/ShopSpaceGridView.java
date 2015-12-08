// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ShopCollection;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.text.PTextView;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            ShopSpaceGridItemView

public class ShopSpaceGridView extends LinearLayout
{

    private static final int NUM_COLUMNS = 3;
    FrameLayout buttonContainer;
    LinearLayout container;
    Button showMoreButton;
    PTextView title;

    public ShopSpaceGridView(Context context)
    {
        super(context);
        init(context);
    }

    private HashMap getAuxData(int i, ShopCollectionItem shopcollectionitem)
    {
        HashMap hashmap = new HashMap(4);
        if (!shopcollectionitem.getTitle().isEmpty())
        {
            hashmap.put("label", shopcollectionitem.getTitle());
        }
        if (!shopcollectionitem.getObjectId().isEmpty())
        {
            hashmap.put("board_id", shopcollectionitem.getObjectId());
        }
        hashmap.put("index", String.valueOf(i));
        return hashmap;
    }

    private void logAction(String s, EventType eventtype, int i, ShopCollectionItem shopcollectionitem)
    {
        if (s.equals("circle"))
        {
            s = ComponentType.SHOP_SPACE_TOP_SHOPS;
        } else
        {
            s = ComponentType.SHOP_SPACE_BUYABLE_CATEGORY;
        }
        Pinalytics.a(eventtype, null, s, null, getAuxData(i, shopcollectionitem), null);
    }

    public void bind(final ShopCollection shopCollection, final String type)
    {
        title.setText(shopCollection.getTitle());
        int j = (int)Math.floor(shopCollection.collections.size() / 3);
        int k = (int)Resources.dimension(0x7f0a0162);
        int l = (int)Resources.dimension(0x7f0a0163);
        for (final int position = 0; position < j; position++)
        {
            LinearLayout linearlayout = new LinearLayout(getContext());
            int i = 0;
            while (i < 3) 
            {
                ShopSpaceGridItemView shopspacegriditemview = new ShopSpaceGridItemView(getContext(), shopCollection.getLayout().equals("circle"));
                android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(0, -2);
                layoutparams1.weight = 1.0F;
                final ShopCollectionItem shopCollectionItem;
                if (i == 0)
                {
                    layoutparams1.rightMargin = l;
                } else
                if (i == 2)
                {
                    layoutparams1.leftMargin = l;
                } else
                {
                    layoutparams1.leftMargin = l;
                    layoutparams1.rightMargin = l;
                }
                shopCollectionItem = (ShopCollectionItem)shopCollection.collections.get(position * 3 + i);
                shopspacegriditemview.setLayoutParams(layoutparams1);
                shopspacegriditemview.bind(shopCollectionItem);
                shopspacegriditemview.setOnClickListener(new _cls1());
                logAction(type, EventType.RENDER, position, shopCollectionItem);
                linearlayout.addView(shopspacegriditemview);
                i++;
            }
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutparams.bottomMargin = k;
            layoutparams.leftMargin = k;
            layoutparams.rightMargin = k;
            linearlayout.setLayoutParams(layoutparams);
            container.addView(linearlayout);
        }

        if (shopCollection.getDisplayCount() < shopCollection.getTotalCount() || shopCollection.getLayout().equals("circle"))
        {
            buttonContainer.setVisibility(0);
            showMoreButton.setOnClickListener(new _cls2());
        }
    }

    public void init(Context context)
    {
        inflate(context, 0x7f0301a0, this);
        ButterKnife.a(this);
        setOrientation(1);
        setBackgroundColor(-1);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ShopSpaceGridView this$0;
        final int val$position;
        final ShopCollectionItem val$shopCollectionItem;
        final String val$type;

        public void onClick(View view)
        {
            logAction(type, EventType.TAP, position, shopCollectionItem);
            ShopSpaceNavigationHelper.handleNavigation(shopCollectionItem);
        }

        _cls1()
        {
            this$0 = ShopSpaceGridView.this;
            type = s;
            position = i;
            shopCollectionItem = shopcollectionitem;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ShopSpaceGridView this$0;
        final ShopCollection val$shopCollection;

        public void onClick(View view)
        {
            view = new Navigation(Location.COMMERCE_SHOP_SPACE_SECTION);
            view.putExtra("section_id", shopCollection.getId());
            Events.post(view);
        }

        _cls2()
        {
            this$0 = ShopSpaceGridView.this;
            shopCollection = shopcollection;
            super();
        }
    }

}
