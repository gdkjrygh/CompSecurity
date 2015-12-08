// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.content.Context;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.google.android.gms.maps.model.LatLng;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.User;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.LocationUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.WebImageView;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class BoardHeaderView extends LinearLayout
{

    private static final int MAX_COLLABORATORS = 3;
    private String _apiTag;
    private Board _board;
    private boolean _collabLoaded;
    ViewGroup _collabWrapper;
    TextView _descTv;
    TextView _infoTv;
    private LatLng _latLng;
    private boolean _showAsPlaceBoard;
    private User _user;
    LinearLayout _userContainer;
    private android.view.View.OnClickListener onUserClickListener;

    public BoardHeaderView(Context context)
    {
        this(context, null);
    }

    public BoardHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _collabLoaded = false;
        onUserClickListener = new _cls3();
        init();
    }

    private void init()
    {
        setOrientation(1);
        setBackgroundResource(0x7f0e000a);
        inflate(getContext(), 0x7f03012b, this);
        ButterKnife.a(this);
        _collabWrapper.setOnClickListener(onUserClickListener);
    }

    private void setCollaborater(final User user, WebImageView webimageview)
    {
        if (user == null)
        {
            return;
        } else
        {
            webimageview.setOval(true);
            webimageview.loadUrl(user.getImageMediumUrl());
            webimageview.setOnClickListener(new _cls2());
            return;
        }
    }

    private void showCollaboratorImages(UserFeed userfeed)
    {
        if (userfeed != null && userfeed.getCount() != 0)
        {
            _userContainer.removeAllViews();
            GrayWebImageView agraywebimageview[];
            int i;
            int l;
            int i1;
            if (userfeed.getCount() <= 3)
            {
                i = userfeed.getCount();
            } else
            {
                i = 2;
            }
            l = (int)Device.dpToPixel(6F);
            agraywebimageview = new GrayWebImageView[i];
            i1 = (int)getResources().getDimension(0x7f0a01eb);
            for (int k = 0; k < i; k++)
            {
                agraywebimageview[k] = new GrayWebImageView(getContext(), null, 0x7f0b0232);
                android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(i1, i1);
                if (k < i - 1)
                {
                    layoutparams1.setMargins(0, 0, l, 0);
                }
                setCollaborater((User)userfeed.get(k), agraywebimageview[k]);
                _userContainer.addView(agraywebimageview[k], layoutparams1);
            }

            if (_board.getCollaboratorCount().intValue() + 1 > 3)
            {
                int j = _board.getCollaboratorCount().intValue();
                userfeed = new TextView(getContext());
                userfeed.setTextAppearance(getContext(), 0x7f0b0173);
                userfeed.setText((new StringBuilder("+")).append(String.valueOf((j + 2) - 3)).toString());
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutparams.setMargins(l, 0, 0, 0);
                _userContainer.addView(userfeed, layoutparams);
                return;
            }
        }
    }

    private void updateCollaborators()
    {
        if (Constants.isTrue(_board.getCollaborative()))
        {
            _collabWrapper.setVisibility(0);
            loadCollaborators();
            ViewHelper.setLeftDrawable(_infoTv, 0x7f0201a6);
            setVisibility(0);
            return;
        }
        if (_board.isMeOwnerOrCollaborator() && _board.getPinCount().intValue() > 0)
        {
            _collabWrapper.setVisibility(0);
            _infoTv.setText(0x7f070040);
            ViewHelper.setLeftDrawable(_infoTv, 0x7f0201a6);
            setVisibility(0);
            return;
        } else
        {
            _collabWrapper.setVisibility(8);
            setVisibility(_descTv.getVisibility());
            return;
        }
    }

    private void updateDescription()
    {
        Object obj;
        Object obj1;
        obj1 = _board.getDescription();
        obj = obj1;
        if (!StringUtils.isBlank(((CharSequence) (obj1)))) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (_latLng == null) goto _L2; else goto _L3
_L3:
        obj = new Geocoder(getContext());
        Address address;
        int i;
        try
        {
            obj = ((Geocoder) (obj)).getFromLocation(_latLng.latitude, _latLng.longitude, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (((List) (obj)).size() <= 0) goto _L5; else goto _L6
_L6:
        address = (Address)((List) (obj)).get(0);
        obj = address.getFeatureName();
        if (!StringUtils.isBlank(((CharSequence) (obj)))) goto _L2; else goto _L7
_L7:
        obj1 = LocationUtils.generalDisplay(address);
        obj = obj1;
_L2:
        if (StringUtils.isNotBlank(((CharSequence) (obj))))
        {
            _descTv.setText(((CharSequence) (obj)));
            obj = _descTv;
            i = 0;
        } else
        {
            obj = _descTv;
            if (_showAsPlaceBoard)
            {
                i = 0;
            } else
            {
                i = 8;
            }
        }
        ((TextView) (obj)).setVisibility(i);
        return;
        obj1;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = obj1;
        if (true) goto _L2; else goto _L8
_L8:
    }

    protected void loadCollaborators()
    {
        if (_collabLoaded)
        {
            return;
        } else
        {
            _collabLoaded = true;
            BoardApi.a(_board.getUid(), true, new _cls1(), _apiTag);
            return;
        }
    }

    public void onMapStateChanged(com.pinterest.kit.view.MapViewGroup.MapState mapstate)
    {
        _cls4..SwitchMap.com.pinterest.kit.view.MapViewGroup.MapState[mapstate.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 57;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (StringUtils.isBlank(_board.getDescription()))
        {
            _descTv.setText(0x7f070582);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (StringUtils.isBlank(_board.getDescription()))
        {
            _descTv.setText(0x7f070584);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setBoard(Board board)
    {
        _board = board;
        if (_board != null)
        {
            boolean flag;
            if (_showAsPlaceBoard && _board.isPlaceBoard())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            updateLayout(flag);
            updateDescription();
            updateCollaborators();
        }
    }

    public void setDescOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _descTv.setOnClickListener(onclicklistener);
    }

    public void setLatLng(LatLng latlng)
    {
        _latLng = latlng;
        updateDescription();
    }

    public void setUser(User user)
    {
        _user = user;
    }

    public void updateLayout(boolean flag)
    {
        _showAsPlaceBoard = flag;
        if (_board == null || !Constants.isTrue(_board.getCollaborative()) && !_showAsPlaceBoard && !_board.hasDescription() && !_board.isMeOwnerOrCollaborator())
        {
            setVisibility(8);
        } else
        {
            setVisibility(0);
        }
        _descTv.setClickable(_showAsPlaceBoard);
    }




    private class _cls3
        implements android.view.View.OnClickListener
    {

        final BoardHeaderView this$0;

        public void onClick(View view)
        {
            if (_board != null && _user != null)
            {
                Pinalytics.a(ElementType.COLLABORATOR_TEXT, ComponentType.LIST_HEADER, _board.getUid());
                if (_board.allowToInviteOthers())
                {
                    Events.post(new Navigation(Location.INVITE_BOARD_COLLAB, _board.getUid()));
                    return;
                }
                if (Constants.isTrue(_board.getCollaborative()))
                {
                    Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardCollaboratorsDialog, _board.getUid())));
                    return;
                }
            }
        }

        _cls3()
        {
            this$0 = BoardHeaderView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final BoardHeaderView this$0;
        final User val$user;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.STORIES_FEED_RELATED_OBJECT, ComponentType.STORIES_FEED, user.getUid());
            Events.post(new Navigation(Location.USER, user));
        }

        _cls2()
        {
            this$0 = BoardHeaderView.this;
            user = user1;
            super();
        }
    }


    private class _cls1 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final BoardHeaderView this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            if (_board.getUser() != null)
            {
                feed.appendItem(_board.getUser());
            }
            TextView textview = _infoTv;
            int i;
            if (_board.allowToInviteOthers())
            {
                i = 0x7f070040;
            } else
            {
                i = 0x7f0700a3;
            }
            textview.setText(i);
            showCollaboratorImages((UserFeed)feed);
        }

        _cls1()
        {
            this$0 = BoardHeaderView.this;
            super();
        }
    }


    private class _cls4
    {

        static final int $SwitchMap$com$pinterest$kit$view$MapViewGroup$MapState[];

        static 
        {
            $SwitchMap$com$pinterest$kit$view$MapViewGroup$MapState = new int[com.pinterest.kit.view.MapViewGroup.MapState.values().length];
            try
            {
                $SwitchMap$com$pinterest$kit$view$MapViewGroup$MapState[com.pinterest.kit.view.MapViewGroup.MapState.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$kit$view$MapViewGroup$MapState[com.pinterest.kit.view.MapViewGroup.MapState.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
