// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.pinterest.activity.commerce.view.ShopSpaceCarouselView;
import com.pinterest.activity.commerce.view.ShopSpaceGridView;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.ShopCollection;
import com.pinterest.api.remote.CommerceApi;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.PinImpressionType;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.text.PTextView;
import java.util.Iterator;
import java.util.List;

public class ShopSpaceFragment extends PinGridFragment
{

    private View _searchBar;
    private BaseApiResponseHandler batchHandler;

    public ShopSpaceFragment()
    {
        batchHandler = new _cls2();
        _layoutId = 0x7f030103;
        _menuId = 0;
        setImpressionType(PinImpressionType.SHOP_SPACE);
    }

    private void handleBatch(PinterestJsonObject pinterestjsonobject)
    {
        while (!isActive() || pinterestjsonobject == null) 
        {
            return;
        }
        handleShopSectionResponse(pinterestjsonobject.c("GET:/v3/shop/sections/"));
        handleFeedResponse(pinterestjsonobject.c("GET:/v3/feeds/commerce/"));
    }

    private void handleFeedResponse(PinterestJsonObject pinterestjsonobject)
    {
        ApiResponse apiresponse = new ApiResponse(pinterestjsonobject);
        Object obj = new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler);
        ((com.pinterest.api.remote.PinApi.PinFeedApiResponse) (obj)).setBaseUrl(CommerceApi.a);
        if (apiresponse.getCode() != 0)
        {
            ((com.pinterest.api.remote.PinApi.PinFeedApiResponse) (obj)).onFailure(null, apiresponse);
            return;
        } else
        {
            ((com.pinterest.api.remote.PinApi.PinFeedApiResponse) (obj)).onSuccess(pinterestjsonobject);
            pinterestjsonobject = new FrameLayout(getContext());
            PTextView ptextview = new PTextView(getContext());
            ptextview.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR);
            ptextview.setText(0x7f070151);
            ptextview.setGravity(1);
            ptextview.setTextColor(Resources.color(0x7f0e0073));
            obj = new android.widget.FrameLayout.LayoutParams(-1, -2);
            ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(0, (int)Resources.dimension(0x7f0a015f), 0, 0);
            obj.gravity = 1;
            ptextview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            pinterestjsonobject.addView(ptextview);
            _gridVw.addHeaderView(pinterestjsonobject);
            return;
        }
    }

    private void handleShopSectionResponse(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = (new ApiResponse(pinterestjsonobject)).getData();
        if (!(obj instanceof PinterestJsonArray))
        {
            CrashReporting.a(new IllegalStateException("shopSection is not an array"), pinterestjsonobject.toString());
            return;
        }
        pinterestjsonobject = ShopCollection.makeAll((PinterestJsonArray)obj).iterator();
_L10:
        if (!pinterestjsonobject.hasNext()) goto _L1; else goto _L3
_L3:
        ShopCollection shopcollection;
        Object obj1;
        byte byte0;
        shopcollection = (ShopCollection)pinterestjsonobject.next();
        obj1 = shopcollection.getLayout();
        byte0 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 3: default 120
    //                   -1360216880: 209
    //                   -788885039: 194
    //                   2908512: 179;
           goto _L4 _L5 _L6 _L7
_L4:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_209;
_L8:
        switch (byte0)
        {
        case 0: // '\0'
            obj1 = new ShopSpaceCarouselView(getContext());
            ((ShopSpaceCarouselView) (obj1)).bind(shopcollection);
            _gridVw.addHeaderView(((View) (obj1)));
            break;

        case 1: // '\001'
        case 2: // '\002'
            ShopSpaceGridView shopspacegridview = new ShopSpaceGridView(getContext());
            shopspacegridview.bind(shopcollection, shopcollection.getLayout());
            _gridVw.addHeaderView(shopspacegridview);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (((String) (obj1)).equals("carousel"))
        {
            byte0 = 0;
        }
          goto _L8
_L6:
        if (((String) (obj1)).equals("square_s"))
        {
            byte0 = 1;
        }
          goto _L8
        if (((String) (obj1)).equals("circle"))
        {
            byte0 = 2;
        }
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected void loadData()
    {
        CommerceApi.a(batchHandler);
    }

    public void onDestroyView()
    {
        if (_searchBar != null)
        {
            _searchBar.setOnClickListener(null);
            _searchBar = null;
        }
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _searchBar = LayoutInflater.from(view.getContext()).inflate(0x7f0301bc, _actionBar, false);
        ((TextView)_searchBar).setText(0x7f070152);
        _actionBar.addView(_searchBar);
        _searchBar.setOnClickListener(new _cls1());
    }


    private class _cls2 extends BaseApiResponseHandler
    {

        final ShopSpaceFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            handleBatch((PinterestJsonObject)apiresponse.getData());
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            handleBatch((PinterestJsonObject)apiresponse.getData());
        }

        _cls2()
        {
            this$0 = ShopSpaceFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ShopSpaceFragment this$0;

        public void onClick(View view)
        {
            view = new Navigation(Location.SEARCH, "");
            view.putExtra("com.pinterest.EXTRA_SEARCH_MODE", "VALUE_SEARCH_BUYABLE");
            Events.post(view);
        }

        _cls1()
        {
            this$0 = ShopSpaceFragment.this;
            super();
        }
    }

}
