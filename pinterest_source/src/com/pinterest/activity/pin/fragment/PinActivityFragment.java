// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.pin.adapter.PinActivityAdapter;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinActivity;
import com.pinterest.api.remote.PinApi;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.ViewType;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

public class PinActivityFragment extends BaseFragment
{

    private String _aggregatePinDataUid;
    private String _bookmark;
    private ArrayList _data;
    private LinearLayoutManager _layoutManager;
    private boolean _loadMore;
    private boolean _loading;
    private PinActivityAdapter _pinActivityAdapter;
    private int _totalActivitiesSeen;

    public PinActivityFragment()
    {
        _pinActivityAdapter = new PinActivityAdapter();
        _data = new ArrayList();
        _loading = false;
        _loadMore = false;
        _layoutId = 0x7f0300f0;
    }

    private ArrayList addPinActivities(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (pinterestjsonarray != null)
        {
            for (int i = 0; i < pinterestjsonarray.a(); i++)
            {
                PinActivity pinactivity = new PinActivity(pinterestjsonarray.c(i));
                if (!isSecretActivity(pinactivity))
                {
                    _data.add(pinactivity);
                }
            }

        }
        return arraylist;
    }

    private void getData(PinterestJsonObject pinterestjsonobject)
    {
        if (isActive())
        {
            PinterestJsonArray pinterestjsonarray = pinterestjsonobject.d("data");
            _bookmark = pinterestjsonobject.a("bookmark", null);
            _loadMore = StringUtils.isNotBlank(_bookmark);
            addPinActivities(pinterestjsonarray);
            _pinActivityAdapter.setLoadMore(_loadMore);
            _pinActivityAdapter.setData(_data);
            _pinActivityAdapter.notifyDataSetChanged();
        }
    }

    private boolean isSecretActivity(PinActivity pinactivity)
    {
        boolean flag = false;
        if (pinactivity.getType() != com.pinterest.api.model.PinActivity.Type.LIKE_ACTIVITY)
        {
            if (pinactivity.getPin() == null || pinactivity.getPin().isSecret())
            {
                flag = true;
            }
        } else
        if (pinactivity.getPinner() == null)
        {
            return true;
        }
        return flag;
    }

    protected void onActivate()
    {
        super.onActivate();
        Pinalytics.a(ViewType.AGGREGATED_PIN_FEED, null, null);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        PinApi.f(_aggregatePinDataUid, new _cls1(), getApiTag());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = (RecyclerView)layoutinflater.findViewById(0x7f0f02a2);
        viewgroup.setAdapter(_pinActivityAdapter);
        _layoutManager = new LinearLayoutManager(getContext());
        viewgroup.setLayoutManager(_layoutManager);
        viewgroup.addOnScrollListener(new _cls2());
        return layoutinflater;
    }

    protected void onDeactivate()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("cards_viewed", String.valueOf(_totalActivitiesSeen));
        Pinalytics.a(ViewType.AGGREGATED_PIN_FEED, hashmap);
        super.onDeactivate();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation.getExtra("aggregatedPinDataUid") != null)
        {
            _aggregatePinDataUid = (String)navigation.getExtra("aggregatedPinDataUid");
        }
    }





/*
    static int access$202(PinActivityFragment pinactivityfragment, int i)
    {
        pinactivityfragment._totalActivitiesSeen = i;
        return i;
    }

*/



/*
    static boolean access$302(PinActivityFragment pinactivityfragment, boolean flag)
    {
        pinactivityfragment._loading = flag;
        return flag;
    }

*/



    private class _cls1 extends BaseApiResponseHandler
    {

        final PinActivityFragment this$0;

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            super.onSuccess(pinterestjsonobject);
            getData(pinterestjsonobject);
        }

        _cls1()
        {
            this$0 = PinActivityFragment.this;
            super();
        }
    }


    private class _cls2 extends android.support.v7.widget.RecyclerView.OnScrollListener
    {

        final PinActivityFragment this$0;

        public void onScrolled(RecyclerView recyclerview, int i, int j)
        {
            i = _layoutManager.findFirstVisibleItemPosition();
            j = _layoutManager.getItemCount();
            int k = _layoutManager.getChildCount();
            _totalActivitiesSeen = i + k;
            if (_totalActivitiesSeen >= j && !_loading)
            {
                _loading = true;
                class _cls1 extends BaseApiResponseHandler
                {

                    final _cls2 this$1;

                    public void onSuccess(PinterestJsonObject pinterestjsonobject)
                    {
                        super.onSuccess(pinterestjsonobject);
                        getData(pinterestjsonobject);
                        _loading = false;
                    }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
                }

                if (StringUtils.isNotBlank(_bookmark))
                {
                    PinApi.a(_aggregatePinDataUid, new _cls1(), _bookmark, getApiTag());
                }
            }
        }

        _cls2()
        {
            this$0 = PinActivityFragment.this;
            super();
        }
    }

}
