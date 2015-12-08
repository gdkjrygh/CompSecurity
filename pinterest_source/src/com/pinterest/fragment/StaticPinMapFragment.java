// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.board.fragment.BoardMapFragment;
import com.pinterest.activity.map.GoogleServiceDialog;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.PinFeed;
import com.pinterest.base.GooglePlayServices;

public class StaticPinMapFragment extends BaseFragment
{

    private String _boardName;
    private PinFeed _feed;
    private BoardMapFragment _mapFragment;
    private MapFragment.Listener onMapReady;

    public StaticPinMapFragment()
    {
        onMapReady = new _cls1();
    }

    private void initMapFragment()
    {
        if (_mapFragment == null)
        {
            _mapFragment = new BoardMapFragment();
            _mapFragment.setMapListener(onMapReady);
            FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
            fragmenttransaction.replace(0x7f0f01e0, _mapFragment, null);
            fragmenttransaction.commit();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300dd;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (!GooglePlayServices.isAvailable())
        {
            GoogleServiceDialog.show();
        } else
        {
            initMapFragment();
        }
        if (_boardName != null)
        {
            _actionBar.setTitle(_boardName);
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _feed = (PinFeed)navigation.getExtra("com.pinterest.EXTRA_FEED");
        navigation = ((Navigation) (navigation.getExtra("com.pinterest.EXTRA_BOARD_ID")));
        if (navigation != null)
        {
            navigation = ModelHelper.getBoard((String)navigation);
            if (navigation != null)
            {
                _boardName = navigation.getName();
            }
        }
    }



    private class _cls1
        implements MapFragment.Listener
    {

        final StaticPinMapFragment this$0;

        public void onReady()
        {
            if (_mapFragment != null && _mapFragment.getMap() != null)
            {
                _mapFragment.setPinFeed(_feed);
            }
        }

        _cls1()
        {
            this$0 = StaticPinMapFragment.this;
            super();
        }
    }

}
