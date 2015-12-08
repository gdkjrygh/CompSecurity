// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.pinterest.activity.pin.adapter.CsrAdapter;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.SiteApi;
import com.pinterest.base.Events;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.PinterestGridView;

public class CsrPickerFragment extends PinterestGridFragment
    implements android.widget.AdapterView.OnItemClickListener, com.pinterest.ui.grid.PinterestGridView.OnStateSetListener
{

    private String _domain;
    View _headerVw;

    public CsrPickerFragment()
    {
    }

    protected void loadData()
    {
        if (_domain == null)
        {
            return;
        } else
        {
            SiteApi.a(_domain, new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300bc;
        _adapter = new CsrAdapter();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Pin)_adapter.getItem(i);
        if (adapterview != null && !TextUtils.isEmpty(adapterview.getClickThroughUrl()))
        {
            Events.post(new CsrSelectEvent(adapterview.getClickThroughUrl()));
            pressBackButton();
        }
    }

    public void onSet(com.pinterest.ui.grid.PinterestGridView.State state)
    {
        TextView textview = (TextView)_headerVw.findViewById(0x7f0f0077);
        if (state == com.pinterest.ui.grid.PinterestGridView.State.LOADING)
        {
            textview.setText(Resources.string(0x7f070343, new Object[] {
                _domain
            }));
            return;
        } else
        {
            textview.setText(Resources.string(0x7f0701ba, new Object[] {
                _domain
            }));
            ((ImageView)_headerVw.findViewById(0x7f0f0076)).setImageDrawable(Resources.drawable(0x7f020168));
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _gridVw.setOnItemClickListener(this);
        _gridVw.setOnStateSetListener(this);
        updateEmptyContent();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _domain = (String)navigation.getExtra("com.pinterest.EXTRA_DOMAIN");
    }

    protected void updateEmptyContent()
    {
        _emptyCenterImage = 0x7f0201eb;
        _emptyMessage = Resources.string(0x7f07040c);
    }

    private class CsrSelectEvent
    {

        private String _url;

        public String getUrl()
        {
            return _url;
        }

        public CsrSelectEvent(String s)
        {
            _url = s;
        }
    }

}
