// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiFields;
import com.pinterest.api.model.AggregatedPinData;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.time.FuzzyDateFormatter;
import com.pinterest.kit.utils.AggregatedPinUtils;
import com.pinterest.kit.utils.NumberUtils;
import com.pinterest.kit.view.BoardView;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.imageview.WebImageView;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupAggregatedModule extends PinCloseupBaseModule
    implements android.view.View.OnClickListener
{

    private static final String AGGREGATED_PIN_DATA_ID = "aggregatedPinDataUid";
    private static final int COLUMNS_NUM = 3;
    private static final int COLUMNS_NUM_TABLET = 4;
    private static final String DEFAULT_NUM_SAVES = "1";
    ImageView _addCommentVw;
    private Board _board;
    TextView _boardName;
    TextView _boardStats;
    BoardView _boardVw;
    LinearLayout _commentBubbleVw;
    TextView _commentStatsVw;
    TextView _dateTv;
    private boolean _firstLoad;
    FollowBoardButton _followBoardButton;
    LinearLayout _moreActivityVw;
    TextView _pinnerComment;
    WebImageView _pinnerIv;
    TextView _pinnerName;
    LinearLayout _pinnerVw;
    TextView _statsTv;

    public PinCloseupAggregatedModule(Context context)
    {
        super(context);
        _firstLoad = true;
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_AGGREGATED;
    }

    protected boolean hasContent()
    {
        return _pin.getUser() != null;
    }

    protected void init()
    {
        _padding.top = (int)Resources.dimension(0x7f0a0186);
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        setOrientation(1);
        addView(getDividerView(), -1, Constants.HAIRLINE);
        ButterKnife.a(this, ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030041, this));
        _boardVw.setOnClickListener(this);
        _boardName.setOnClickListener(this);
        _boardStats.setOnClickListener(this);
        _boardStats.setVisibility(0);
        _pinnerName.setOnClickListener(this);
        _pinnerComment.setOnClickListener(this);
        _commentBubbleVw.setOnClickListener(this);
        _addCommentVw.setOnClickListener(this);
        _commentStatsVw.setOnClickListener(this);
        _followBoardButton.setOnClickListener(new _cls1());
        _statsTv.setOnClickListener(this);
        _moreActivityVw.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        Object obj = null;
        view.getId();
        JVM INSTR lookupswitch 11: default 104
    //                   2131689706: 223
    //                   2131689707: 254
    //                   2131690431: 179
    //                   2131690432: 179
    //                   2131690433: 179
    //                   2131690436: 129
    //                   2131690437: 129
    //                   2131690683: 201
    //                   2131690684: 201
    //                   2131690685: 154
    //                   2131690686: 154;
           goto _L1 _L2 _L3 _L4 _L4 _L4 _L5 _L5 _L6 _L6 _L7 _L7
_L1:
        Navigation navigation;
        navigation = null;
        view = obj;
_L9:
        if (view != null)
        {
            Pinalytics.a(view, getComponentType());
        }
        if (navigation != null)
        {
            Events.post(navigation);
        }
        return;
_L5:
        navigation = new Navigation(Location.USER, _pin.getUser());
        view = ElementType.PIN_USER;
        continue; /* Loop/switch isn't completed */
_L7:
        navigation = new Navigation(Location.USER, _pin.getUser());
        view = ElementType.PIN_DESCRIPTION;
        continue; /* Loop/switch isn't completed */
_L4:
        navigation = new Navigation(Location.BOARD, _board);
        view = ElementType.PIN_BOARD;
        continue; /* Loop/switch isn't completed */
_L6:
        navigation = new Navigation(Location.PIN_COMMENTS, _pin);
        view = ElementType.PIN_COMMENT_BUTTON;
        continue; /* Loop/switch isn't completed */
_L2:
        navigation = new Navigation(Location.PIN_ACTIVITY_FEED);
        navigation.putExtra("aggregatedPinDataUid", _pin.getAggregatedPinDataUid());
        view = ElementType.PIN_SAVED_BY;
        continue; /* Loop/switch isn't completed */
_L3:
        navigation = new Navigation(Location.PIN_ACTIVITY_FEED);
        navigation.putExtra("aggregatedPinDataUid", _pin.getAggregatedPinDataUid());
        view = ElementType.PIN_MORE_ACTIVITY;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        String s = _pin.getBoardUid();
        if (StringUtils.isNotEmpty(s) && _firstLoad)
        {
            _firstLoad = false;
            BoardApi.a(s, true, new _cls2(), null, ApiFields.y);
        }
        if (_pin.getUser() != null)
        {
            User user = _pin.getUser();
            _pinnerVw.setBackgroundResource(0x7f020283);
            _pinnerIv.loadUrl(user.getImageMediumUrl());
            _pinnerIv.setOval(true);
            _pinnerName.setText(Html.fromHtml((new StringBuilder("<b>")).append(user.getFullName()).append("</b>").toString()));
        }
        if (AggregatedPinUtils.showUserDescription(_pin))
        {
            _pinnerComment.setText(_pin.getDescription());
            _commentBubbleVw.setVisibility(0);
        } else
        {
            _commentBubbleVw.setVisibility(8);
        }
        if (_pin.getCommentCount() != null && _pin.getCommentCount().intValue() > 0)
        {
            _commentStatsVw.setText(String.format("%d", new Object[] {
                _pin.getCommentCount()
            }));
            _commentStatsVw.setVisibility(0);
            _addCommentVw.setVisibility(4);
        } else
        {
            _addCommentVw.setVisibility(0);
            _commentStatsVw.setVisibility(8);
        }
        if (_pin.getCreatedAt() != null)
        {
            _dateTv.setText(FuzzyDateFormatter.a(_pin.getCreatedAt(), true));
        }
        if (_pin.getAggregatedPinData() != null)
        {
            AggregatedPinData aggregatedpindata = _pin.getAggregatedPinData();
            _statsTv.setText(Resources.stringPlural(0x7f090025, Integer.valueOf(aggregatedpindata.getSaveCountDisplay()), new Object[] {
                NumberUtils.getFormattedNumber(aggregatedpindata.getSaveCountDisplay())
            }));
            _statsTv.setVisibility(0);
            return;
        } else
        {
            _statsTv.setText(Resources.stringPlural(0x7f090025, Integer.valueOf(1), new Object[] {
                "1"
            }));
            _statsTv.setVisibility(0);
            _moreActivityVw.setVisibility(8);
            return;
        }
    }



/*
    static Board access$002(PinCloseupAggregatedModule pincloseupaggregatedmodule, Board board)
    {
        pincloseupaggregatedmodule._board = board;
        return board;
    }

*/

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCloseupAggregatedModule this$0;

        public void onClick(View view)
        {
            _followBoardButton.onClick(view);
            Pinalytics.a(ElementType.PIN_BOARD_FOLLOW, getComponentType());
        }

        _cls1()
        {
            this$0 = PinCloseupAggregatedModule.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.BoardApi.BoardApiResponse
    {

        final PinCloseupAggregatedModule this$0;

        public void onSuccess(final ApiResponse response)
        {
            class _cls1 extends BackgroundTask
            {

                public Board board;
                final _cls2 this$1;
                final ApiResponse val$response;

                public void onFinish()
                {
                    onSuccess(board);
                }

                public void run()
                {
                    board = Board.make((PinterestJsonObject)response.getData(), false).getBoard();
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    response = apiresponse;
                    super();
                }
            }

            (new _cls1()).execute();
        }

        public void onSuccess(Board board)
        {
            super.onSuccess(board);
            _board = board;
            _followBoardButton.setBoard(_board);
            _boardName.setText(board.getName());
            int i = board.getPinCount().intValue();
            Object obj = Resources.stringPlural(0x7f090017, Integer.valueOf(i), new Object[] {
                NumberUtils.getFormattedNumber(i)
            });
            _boardStats.setText(((CharSequence) (obj)));
            obj = _boardVw;
            if (Device.isTablet())
            {
                i = 4;
            } else
            {
                i = 3;
            }
            ((BoardView) (obj)).setWeights(i, board.getLargestPinIndex().intValue());
            _boardVw.setContentUrls(board.getPinImagesList());
        }

        _cls2()
        {
            this$0 = PinCloseupAggregatedModule.this;
            super();
        }
    }

}
