// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.ShopCollection;
import com.pinterest.ui.view.PeekViewPager;

public class ShopSpaceCarouselView extends FrameLayout
{

    private Adapter adapter;
    PeekViewPager peekViewPager;
    private ShopCollection shopCollection;

    public ShopSpaceCarouselView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f03019c, this);
        ButterKnife.a(this);
        adapter = new Adapter(null);
        peekViewPager.getViewPager().setAdapter(adapter);
        setBackgroundColor(-1);
    }

    public void bind(ShopCollection shopcollection)
    {
        shopCollection = shopcollection;
        adapter.notifyDataSetChanged();
    }


    private class Adapter extends PagerAdapter
    {

        final ShopSpaceCarouselView this$0;

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

        private void logAction(EventType eventtype, int i, ShopCollectionItem shopcollectionitem)
        {
            Pinalytics.a(eventtype, null, ComponentType.SHOP_SPACE_TODAYS_PICKS, null, getAuxData(i, shopcollectionitem), null);
        }

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            viewgroup.removeView((View)obj);
        }

        public int getCount()
        {
            if (shopCollection == null)
            {
                return 0;
            } else
            {
                return shopCollection.collections.size();
            }
        }

        public Object instantiateItem(ViewGroup viewgroup, final int position)
        {
            final ShopCollectionItem shopCollectionItem = (ShopCollectionItem)shopCollection.collections.get(position);
            ShopSpaceCoverView shopspacecoverview = new ShopSpaceCoverView(viewgroup.getContext());
            shopspacecoverview.bind(shopCollectionItem);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final Adapter this$1;
                final int val$position;
                final ShopCollectionItem val$shopCollectionItem;

                public void onClick(View view)
                {
                    ShopSpaceNavigationHelper.handleNavigation(shopCollectionItem);
                    logAction(EventType.TAP, position, shopCollectionItem);
                }

                _cls1()
                {
                    this$1 = Adapter.this;
                    shopCollectionItem = shopcollectionitem;
                    position = i;
                    super();
                }
            }

            shopspacecoverview.setOnClickListener(new _cls1());
            viewgroup.addView(shopspacecoverview);
            logAction(EventType.RENDER, position, shopCollectionItem);
            return shopspacecoverview;
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return view == obj;
        }


        private Adapter()
        {
            this$0 = ShopSpaceCarouselView.this;
            super();
        }

        Adapter(_cls1 _pcls1)
        {
            this();
        }
    }

}
