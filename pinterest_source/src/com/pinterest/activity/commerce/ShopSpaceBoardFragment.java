// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.commerce.view.PricePickerIcon;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Events;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.schemas.event.PinImpressionType;

public class ShopSpaceBoardFragment extends PinGridFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    PricePickerIcon _pricePicker;
    private ShopCollectionItem _shopCollectionItem;

    public ShopSpaceBoardFragment()
    {
        _eventsSubscriber = new _cls1();
        _layoutId = 0x7f030104;
        _menuId = 0;
        setImpressionType(PinImpressionType.SHOP_SPACE);
    }

    protected void loadData()
    {
        com.pinterest.api.remote.PinApi.PinFeedApiResponse pinfeedapiresponse = new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler);
        BoardApi.a(_shopCollectionItem.getObjectId(), _pricePicker.getPriceInt(), PricePickerIcon.DEFAULT_CURRENCY, pinfeedapiresponse, getApiTag());
    }

    public void onPause()
    {
        Events.unregister(_eventsSubscriber);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriber);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(_shopCollectionItem.getTitle());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _shopCollectionItem = (ShopCollectionItem)navigation.getParcelable("shop_collection");
        if (_shopCollectionItem == null)
        {
            throw new IllegalStateException("ShopSpaceBoardFragment requires a ShopCollectionItem");
        } else
        {
            return;
        }
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final ShopSpaceBoardFragment this$0;

        public void onEventMainThread(PriceFilterFragment.PriceUpdatedEvent priceupdatedevent)
        {
            priceupdatedevent = priceupdatedevent.getPrice();
            if (priceupdatedevent == null || !priceupdatedevent.equals(_pricePicker.getPrice()))
            {
                _pricePicker.setPrice(priceupdatedevent);
                refresh();
            }
        }

        _cls1()
        {
            this$0 = ShopSpaceBoardFragment.this;
            super();
        }
    }

}
