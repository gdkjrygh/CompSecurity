// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinActivity;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.time.FuzzyDateFormatter;
import com.pinterest.kit.utils.AggregatedPinUtils;
import com.pinterest.kit.utils.NumberUtils;
import com.pinterest.kit.view.BoardView;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.progress.LoadingView;
import java.util.ArrayList;
import java.util.List;

public class PinActivityAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

    private static final int NUM_COLUMNS = 3;
    private static final int VIEW_LOADING = 0;
    private static final int VIEW_TYPE_CREATION = 1;
    private static final int VIEW_TYPE_LIKE = 3;
    private static final int VIEW_TYPE_REPIN = 2;
    private boolean _loadMore;
    private List _pinActivities;

    public PinActivityAdapter()
    {
        _loadMore = false;
    }

    private void onBindLikeActivityViewHolder(PinLikeActivityViewHolder pinlikeactivityviewholder, int i)
    {
        WebImageView webimageview = pinlikeactivityviewholder.pinnerIv;
        TextView textview = pinlikeactivityviewholder.pinnerName;
        TextView textview1 = pinlikeactivityviewholder.dateTv;
        pinlikeactivityviewholder = pinlikeactivityviewholder.likeActivityVw;
        PinActivity pinactivity = (PinActivity)_pinActivities.get(i);
        final User user = pinactivity.getPinner();
        pinlikeactivityviewholder.setOnClickListener(new _cls1());
        if (pinactivity.getCreatedAt() != null)
        {
            textview1.setText(FuzzyDateFormatter.a(pinactivity.getCreatedAt(), true));
        }
        webimageview.loadUrl(user.getImageMediumUrl());
        webimageview.setOval(true);
        textview.setText(Html.fromHtml(Resources.string(0x7f070335, new Object[] {
            user.getFullName()
        })));
    }

    private void onBindLoadingActivityViewHolder(PinLoadingViewHolder pinloadingviewholder, int i)
    {
        pinloadingviewholder.loadingSpinner.setState(0);
    }

    private void onBindPinActivityViewHolder(final PinActivityViewHolder followBoardButton, int i)
    {
        LinearLayout linearlayout = followBoardButton.pinnerVw;
        WebImageView webimageview = followBoardButton.pinnerIv;
        TextView textview = followBoardButton.pinnerName;
        TextView textview1 = followBoardButton.pinnerComment;
        TextView textview2 = followBoardButton.dateTv;
        LinearLayout linearlayout1 = followBoardButton.commentBubbleVw;
        BoardView boardview = followBoardButton.boardVw;
        TextView textview3 = followBoardButton.boardName;
        TextView textview4 = followBoardButton.boardStats;
        TextView textview5 = followBoardButton.commentStatsVw;
        ImageView imageview = followBoardButton.addCommentVw;
        followBoardButton = followBoardButton.followBoardButton;
        Pin pin = ((PinActivity)_pinActivities.get(i)).getPin();
        Board board = pin.getBoard();
        User user = pin.getUser();
        PinActivityListener pinactivitylistener = new PinActivityListener(pin);
        imageview.setOnClickListener(pinactivitylistener);
        linearlayout.setOnClickListener(pinactivitylistener);
        webimageview.setOnClickListener(pinactivitylistener);
        textview.setOnClickListener(pinactivitylistener);
        textview1.setOnClickListener(pinactivitylistener);
        linearlayout1.setOnClickListener(pinactivitylistener);
        boardview.setOnClickListener(pinactivitylistener);
        textview3.setOnClickListener(pinactivitylistener);
        textview4.setOnClickListener(pinactivitylistener);
        textview5.setOnClickListener(pinactivitylistener);
        imageview.setOnClickListener(pinactivitylistener);
        if (board != null && board.getPinCount() != null && board.getPinCount().intValue() != -1)
        {
            String s = NumberUtils.getFormattedNumber(board.getPinCount().intValue());
            textview4.setText(Resources.stringPlural(0x7f090017, board.getPinCount(), new Object[] {
                s
            }));
            textview3.setText(board.getName());
            if (board.getLargestPinIndex() == null)
            {
                i = 0;
            } else
            {
                i = board.getLargestPinIndex().intValue();
            }
            boardview.setWeights(3, i);
            boardview.setContentUrls(board.getPinImagesList());
            followBoardButton.setBoard(board);
            followBoardButton.setOnClickListener(new _cls2());
        }
        if (user != null)
        {
            linearlayout.setBackgroundResource(0x7f020283);
            webimageview.loadUrl(user.getImageMediumUrl());
            webimageview.setOval(true);
            textview.setText(Html.fromHtml((new StringBuilder("<b>")).append(user.getFullName()).append("</b>").toString()));
        }
        if (AggregatedPinUtils.showUserDescription(pin))
        {
            textview1.setText(pin.getDescription());
            textview1.setVisibility(0);
            linearlayout1.setVisibility(0);
        } else
        {
            linearlayout1.setVisibility(8);
        }
        if (pin.getCreatedAt() != null)
        {
            textview2.setText(FuzzyDateFormatter.a(pin.getCreatedAt(), true));
        }
        if (pin.getCommentCount() != null && pin.getCommentCount().intValue() > 0)
        {
            textview5.setText(String.format("%d", new Object[] {
                pin.getCommentCount()
            }));
            textview5.setVisibility(0);
            imageview.setVisibility(4);
            return;
        } else
        {
            imageview.setVisibility(0);
            textview5.setVisibility(8);
            return;
        }
    }

    public int getItemCount()
    {
        if (_pinActivities == null)
        {
            return 1;
        }
        if (_loadMore)
        {
            return _pinActivities.size() + 1;
        } else
        {
            return _pinActivities.size();
        }
    }

    public int getItemViewType(int i)
    {
        if (_pinActivities == null || i == _pinActivities.size())
        {
            return 0;
        }
        PinActivity pinactivity = (PinActivity)_pinActivities.get(i);
        switch (_cls3..SwitchMap.com.pinterest.api.model.PinActivity.Type[pinactivity.getType().ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;
        }
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        switch (getItemViewType(i))
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            onBindPinActivityViewHolder((PinActivityViewHolder)viewholder, i);
            return;

        case 3: // '\003'
            onBindLikeActivityViewHolder((PinLikeActivityViewHolder)viewholder, i);
            return;

        case 0: // '\0'
            onBindLoadingActivityViewHolder((PinLoadingViewHolder)viewholder, i);
            return;
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        LayoutInflater layoutinflater = LayoutInflater.from(viewgroup.getContext());
        switch (i)
        {
        default:
            return new PinActivityViewHolder(layoutinflater.inflate(0x7f030188, viewgroup, false));

        case 1: // '\001'
        case 2: // '\002'
            return new PinActivityViewHolder(layoutinflater.inflate(0x7f030188, viewgroup, false));

        case 3: // '\003'
            return new PinLikeActivityViewHolder(layoutinflater.inflate(0x7f030186, viewgroup, false));

        case 0: // '\0'
            return new PinLoadingViewHolder(layoutinflater.inflate(0x7f030187, viewgroup, false));
        }
    }

    public void setData(ArrayList arraylist)
    {
        _pinActivities = arraylist;
        notifyDataSetChanged();
    }

    public void setLoadMore(boolean flag)
    {
        _loadMore = flag;
    }

    private class PinLikeActivityViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        TextView dateTv;
        LinearLayout likeActivityVw;
        WebImageView pinnerIv;
        TextView pinnerName;

        public PinLikeActivityViewHolder(View view)
        {
            super(view);
            ButterKnife.a(this, view);
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinActivityAdapter this$0;
        final User val$user;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.USER, user));
            Pinalytics.a(ElementType.PIN_ACTIVITY_LIKE);
        }

        _cls1()
        {
            this$0 = PinActivityAdapter.this;
            user = user1;
            super();
        }
    }


    private class PinLoadingViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        LoadingView loadingSpinner;

        public PinLoadingViewHolder(View view)
        {
            super(view);
            ButterKnife.a(this, view);
        }
    }


    private class PinActivityViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        ImageView addCommentVw;
        TextView boardName;
        TextView boardStats;
        BoardView boardVw;
        LinearLayout commentBubbleVw;
        TextView commentStatsVw;
        TextView dateTv;
        FollowBoardButton followBoardButton;
        TextView pinnerComment;
        WebImageView pinnerIv;
        TextView pinnerName;
        LinearLayout pinnerVw;

        public PinActivityViewHolder(View view)
        {
            super(view);
            ButterKnife.a(this, view);
        }
    }


    private class PinActivityListener
        implements android.view.View.OnClickListener
    {

        private Pin _pin;
        final PinActivityAdapter this$0;

        public void onClick(View view)
        {
            Object obj = null;
            view.getId();
            JVM INSTR lookupswitch 9: default 88
        //                       2131690431: 159
        //                       2131690432: 159
        //                       2131690433: 159
        //                       2131690436: 109
        //                       2131690437: 109
        //                       2131690683: 184
        //                       2131690684: 184
        //                       2131690685: 134
        //                       2131690686: 134;
               goto _L1 _L2 _L2 _L2 _L3 _L3 _L4 _L4 _L5 _L5
_L1:
            Navigation navigation;
            navigation = null;
            view = obj;
_L7:
            if (view != null)
            {
                Pinalytics.a(view);
            }
            if (navigation != null)
            {
                Events.post(navigation);
            }
            return;
_L3:
            navigation = new Navigation(Location.USER, _pin.getUser());
            view = ElementType.PIN_USER;
            continue; /* Loop/switch isn't completed */
_L5:
            navigation = new Navigation(Location.USER, _pin.getUser());
            view = ElementType.PIN_DESCRIPTION;
            continue; /* Loop/switch isn't completed */
_L2:
            navigation = new Navigation(Location.BOARD, _pin.getBoard());
            view = ElementType.PIN_BOARD;
            continue; /* Loop/switch isn't completed */
_L4:
            navigation = new Navigation(Location.PIN_COMMENTS, _pin);
            view = ElementType.PIN_COMMENT_BUTTON;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public PinActivityListener(Pin pin)
        {
            this$0 = PinActivityAdapter.this;
            super();
            _pin = pin;
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinActivityAdapter this$0;
        final FollowBoardButton val$followBoardButton;

        public void onClick(View view)
        {
            followBoardButton.onClick(view);
            Pinalytics.a(ElementType.PIN_BOARD_FOLLOW);
        }

        _cls2()
        {
            this$0 = PinActivityAdapter.this;
            followBoardButton = followboardbutton;
            super();
        }
    }


    private class _cls3
    {

        static final int $SwitchMap$com$pinterest$api$model$PinActivity$Type[];

        static 
        {
            $SwitchMap$com$pinterest$api$model$PinActivity$Type = new int[com.pinterest.api.model.PinActivity.Type.values().length];
            try
            {
                $SwitchMap$com$pinterest$api$model$PinActivity$Type[com.pinterest.api.model.PinActivity.Type.PIN_CREATION_ACTIVITY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$PinActivity$Type[com.pinterest.api.model.PinActivity.Type.REPIN_ACTIVITY.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$api$model$PinActivity$Type[com.pinterest.api.model.PinActivity.Type.LIKE_ACTIVITY.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
