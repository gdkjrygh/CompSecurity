// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.BoardFollowToast;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.base.FollowUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.board.BoardGridCellTitleUserView;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.BooleanUtils;

public class BoardStoryCell extends FrameLayout
{

    protected static final int IMAGE_COUNT = 4;
    protected boolean _allRoundedCorners;
    protected Board _board;
    protected int _cornerRadius;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    protected Button _followBt;
    protected ProportionalImageView _image0;
    protected ProportionalImageView _image1;
    protected ProportionalImageView _image2;
    protected ProportionalImageView _image3;
    protected List _images;
    private boolean _showUser;
    private DynamicStory _story;
    protected BoardGridCellTitleUserView _userLine;

    public BoardStoryCell(Context context)
    {
        this(context, null);
    }

    public BoardStoryCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BoardStoryCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _images = new ArrayList(4);
        _cornerRadius = Constants.CORNER_RADIUS;
        _eventsSubscriber = new _cls1();
        init();
    }

    public static BoardStoryCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof BoardStoryCell)
        {
            return (BoardStoryCell)view;
        } else
        {
            return new BoardStoryCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void initImages()
    {
        _image0.setCornerRadius(_cornerRadius, 0.0F, 0.0F, 0.0F);
        _image1.setCornerRadius(0.0F, _cornerRadius, 0.0F, 0.0F);
        if (_allRoundedCorners)
        {
            _image2.setCornerRadius(0.0F, 0.0F, _cornerRadius, 0.0F);
            _image3.setCornerRadius(0.0F, 0.0F, 0.0F, _cornerRadius);
        } else
        {
            _image2.setCornerRadius(0.0F);
            _image3.setCornerRadius(0.0F);
        }
        _images.add(_image0);
        _images.add(_image1);
        _images.add(_image2);
        _images.add(_image3);
    }

    private void loadImageUrls()
    {
        List list = getImageUrls();
        for (int i = 0; i < 4; i++)
        {
            if (list.size() > i)
            {
                ((ProportionalImageView)_images.get(i)).loadUrl((String)list.get(i));
            }
        }

    }

    protected void doFollow()
    {
        EventType eventtype;
        if (_board.getFollowing().booleanValue())
        {
            eventtype = EventType.BOARD_FOLLOW;
        } else
        {
            eventtype = EventType.BOARD_UNFOLLOW;
        }
        Pinalytics.b(eventtype, ElementType.BOARD_FOLLOW, ComponentType.DYNAMIC_GRID_STORY, _board.getUid());
        Events.post(new ToastEvent(new BoardFollowToast(_board)));
        FollowUtils.getInstance().followBoard(_board.getUid(), _board.getFollowing().booleanValue(), new _cls2(), null, true);
    }

    protected List getImageUrls()
    {
        return _board.getImageThumbnailsList();
    }

    protected void init()
    {
        inflate(getContext(), 0x7f030099, this);
        ButterKnife.a(this);
        initImages();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber);
    }

    public void onBoardCoverClicked(View view)
    {
        submitBoardClickContextLog();
        Events.post(new Navigation(Location.BOARD, _board));
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Events.unregister(_eventsSubscriber);
    }

    public void onFollowClick(View view)
    {
        if (_board == null)
        {
            return;
        }
        view = _board;
        boolean flag;
        if (!Constants.isTrue(_board.getFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setFollowing(Boolean.valueOf(flag));
        updateFollowing();
        doFollow();
    }

    public void setBoard(Board board, boolean flag)
    {
        if (board != null)
        {
            _board = board;
            _userLine.setBoard(_board, _showUser);
            if (!flag)
            {
                updateFollowing();
                loadImageUrls();
                return;
            }
        }
    }

    public void setShowUser(boolean flag)
    {
        _showUser = flag;
    }

    public void setStory(DynamicStory dynamicstory)
    {
        _story = dynamicstory;
    }

    protected void submitBoardClickContextLog()
    {
        Pinalytics.a(ElementType.STORY_FEATURED_ITEM, ComponentType.DYNAMIC_GRID_STORY, _board.getUid());
    }

    protected void updateFollowing()
    {
        ViewHelper.updateFollow(_followBt, BooleanUtils.isTrue(_board.getFollowing()));
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BoardStoryCell this$0;

        public void onEventMainThread(com.pinterest.api.model.Board.UpdateEvent updateevent)
        {
            if (_board != null && _board.equals(updateevent.getBoard()))
            {
                _board.setFollowing(updateevent.getBoard().getFollowing());
                updateFollowing();
            }
        }

        _cls1()
        {
            this$0 = BoardStoryCell.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.BoardApi.BoardFollowApiResponse
    {

        final BoardStoryCell this$0;

        public void onFailure()
        {
            Board board = _board;
            boolean flag;
            if (!_board.getFollowing().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            board.setFollowing(Boolean.valueOf(flag));
            updateFollowing();
        }

        public void onSuccess(Board board)
        {
            _board = board;
        }

        _cls2()
        {
            this$0 = BoardStoryCell.this;
            super();
        }
    }

}
