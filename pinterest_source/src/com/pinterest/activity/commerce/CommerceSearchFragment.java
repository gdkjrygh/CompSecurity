// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.view.PricePickerIcon;
import com.pinterest.activity.commerce.view.SearchMerchantView;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Events;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.utils.AnimationUtils;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.schemas.event.PinImpressionType;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class CommerceSearchFragment extends PinGridFragment
{

    public static final String DOMAIN = "domain";
    private String _domain;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _initLoad;
    protected String _lastQuery;
    protected PricePickerIcon _pricePicker;
    private ShopCollectionItem _shopCollectionItem;

    public CommerceSearchFragment()
    {
        _initLoad = true;
        _eventsSubscriber = new _cls3();
        _layoutId = 0x7f0300b2;
        _menuId = 0;
        setCompactCells(true);
        setImpressionType(PinImpressionType.COMMERCE_CAROUSEL_EXPANDED);
    }

    private void animatePriceTag()
    {
        AnimationUtils.getScaleAnimator(_pricePicker).start();
    }

    private void initActionbar()
    {
        View view = LayoutInflater.from(getActivity()).inflate(0x7f0301ba, null);
        _pricePicker = (PricePickerIcon)view.findViewById(0x7f0f006c);
        Toolbar toolbar = (Toolbar)view.findViewById(0x7f0f0451);
        toolbar.setNavigationIcon(DrawableUtils.tintIcon(0x7f02015c, 0x7f0e006d));
        toolbar.setNavigationOnClickListener(new _cls1());
        if (_shopCollectionItem == null)
        {
            if (StringUtils.isNotEmpty(_domain))
            {
                toolbar.setTitle(Resources.string(0x7f070121, new Object[] {
                    _lastQuery, _domain
                }));
            } else
            {
                toolbar.setTitle(_lastQuery);
            }
        }
        _gridVw.addHeaderView(view);
    }

    protected void loadData()
    {
        if (_lastQuery == null)
        {
            return;
        }
        HashMap hashmap = new HashMap();
        hashmap.put("query", _lastQuery);
        hashmap.put("commerce_only", "true");
        if (_pricePicker != null && _pricePicker.hasPrice())
        {
            hashmap.put("suggested_price", _pricePicker.getPrice());
        }
        if (StringUtils.isNotEmpty(_domain))
        {
            hashmap.put("domain", _domain);
        }
        SearchApi.a(hashmap, null, null, null, new _cls2(gridResponseHandler), getApiTag());
        if (!_initLoad)
        {
            _swipeVw.setRefreshing(true);
        }
        _initLoad = false;
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

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("_lastQuery", _lastQuery);
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        initActionbar();
        Preferences.user().remove("PRICE_BUCKET");
        if (_shopCollectionItem != null)
        {
            view = new SearchMerchantView(getContext());
            view.bind(_shopCollectionItem);
            _gridVw.addHeaderView(view);
        }
    }

    public void setLastQuery(String s)
    {
        _lastQuery = s;
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null || navigation.getId() == null)
        {
            return;
        } else
        {
            setLastQuery(navigation.getId());
            _domain = navigation.getStringParcelable("domain");
            _shopCollectionItem = (ShopCollectionItem)navigation.getParcelable("shop_collection");
            return;
        }
    }


    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final CommerceSearchFragment this$0;

        public void onEventMainThread(PriceFilterFragment.PriceUpdatedEvent priceupdatedevent)
        {
            priceupdatedevent = priceupdatedevent.getPrice();
            if (priceupdatedevent == null || !priceupdatedevent.equals(_pricePicker.getPrice()))
            {
                _pricePicker.setPrice(priceupdatedevent);
                refresh();
            }
        }

        _cls3()
        {
            this$0 = CommerceSearchFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CommerceSearchFragment this$0;

        public void onClick(View view)
        {
            getActivity().onBackPressed();
        }

        _cls1()
        {
            this$0 = CommerceSearchFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.PinApi.GuidedPinFeedApiResponse
    {

        final CommerceSearchFragment this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            animatePriceTag();
        }

        _cls2(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = CommerceSearchFragment.this;
            super(feedapiresponsehandler);
        }
    }

}
