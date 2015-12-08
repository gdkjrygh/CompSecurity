// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.create.helper.CreateImageHelper;
import com.pinterest.activity.place.adapter.PlaceImagePickerAdapter;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Place;
import com.pinterest.api.model.PlaceImage;
import com.pinterest.api.remote.PlaceApi;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class PlaceImagePickerFragment extends PinterestGridFragment
{

    private String _originBoardId;
    private Place _place;
    private String _placeUid;
    public List dataSource;

    public PlaceImagePickerFragment()
    {
        _layoutId = 0x7f0300fb;
        _menuId = 0x7f100002;
        _adapter = new PlaceImagePickerAdapter();
    }

    private void onPlaceImageClicked(View view, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_PLACE_ID", _placeUid);
        if (i == 0)
        {
            Pinalytics.a(ElementType.PLACE_PICKER_CREATE);
            CreateImageHelper.showImageSourceDialog(view.getContext(), bundle);
            return;
        }
        Pinalytics.a(ElementType.PLACE_PICKER_IMAGE);
        PlaceImage placeimage = ((PlaceImagePickerAdapter)_adapter).getItem(i);
        Intent intent = ActivityHelper.getCreatePinIntent(view.getContext());
        bundle.putString("com.pinterest.EXTRA_SOURCE", "com.pinterest.EXTRA_SOURCE_PLACE");
        if (placeimage != null)
        {
            bundle.putString("com.pinterest.EXTRA_IMAGE", placeimage.getOriginalUrl());
        }
        bundle.putString("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070735));
        if (_originBoardId != null)
        {
            bundle.putString("com.pinterest.EXTRA_BOARD_ID", _originBoardId);
        }
        intent.putExtras(bundle);
        view.getContext().startActivity(intent);
    }

    protected void loadData()
    {
        if (StringUtils.isBlank(_placeUid) || ((PlaceImagePickerAdapter)_adapter).isLoading())
        {
            return;
        } else
        {
            PlaceApi.g(_placeUid, new _cls2(gridResponseHandler), getApiTag());
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f0700dd);
        view = _gridVw.addHeaderView(0x7f0301f9);
        if (_place != null)
        {
            ((TextView)view.findViewById(0x7f0f01e9)).setText(_place.getName());
            ((TextView)view.findViewById(0x7f0f04c5)).setText(_place.getAddress());
        }
        _gridVw.setOnItemClickListener(new _cls1());
        if (_emptyView != null)
        {
            _emptyView.setEnabled(true);
            _emptyView.setCenterIcon(0x7f0201d3);
            _emptyView.setMessage(0x7f07026b);
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _placeUid = navigation.getId();
        _place = navigation.getModelAsPlace();
        _originBoardId = (String)navigation.getExtra("com.pinterest.EXTRA_BOARD_ID");
        loadData();
    }


    private class _cls2 extends FeedApiResponseHandler
    {

        final PlaceImagePickerFragment this$0;

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            onSuccess(((com.pinterest.api.model.Feed) (new PlaceImageFeed(pinterestjsonobject))));
        }

        _cls2(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = PlaceImagePickerFragment.this;
            super(feedapiresponsehandler);
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PlaceImagePickerFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            onPlaceImageClicked(view, i);
        }

        _cls1()
        {
            this$0 = PlaceImagePickerFragment.this;
            super();
        }
    }

}
