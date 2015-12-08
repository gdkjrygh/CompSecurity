// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.fragment.PeopleListFragment;
import com.pinterest.ui.actionbar.MetadataBar;
import com.pinterest.ui.grid.AdapterEmptyView;

public class PinLikesFragment extends PeopleListFragment
{

    private MetadataBar _metadataBar;
    private Pin _pin;

    public PinLikesFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300f2;
        PinApi.a(_navigation.getId(), new _cls1(), getApiTag());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        _metadataBar = new MetadataBar(layoutinflater.getContext());
        _metadataBar.setModel(_navigation.getModelAsPin(), com.pinterest.ui.actionbar.MetadataBar.Mode.LIKES);
        _listView.addHeaderView(_metadataBar);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        _metadataBar = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(0x7f070336);
        _emptyView.setMessage(0x7f070254);
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null)
        {
            return;
        } else
        {
            _pin = navigation.getModelAsPin();
            return;
        }
    }


    private class _cls1 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final PinLikesFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            onLoadFailed(throwable, apiresponse);
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            onPeopleLoaded((UserFeed)feed);
        }

        _cls1()
        {
            this$0 = PinLikesFragment.this;
            super();
        }
    }

}
