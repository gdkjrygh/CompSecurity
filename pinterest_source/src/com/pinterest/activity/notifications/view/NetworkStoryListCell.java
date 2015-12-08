// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.home.view.BaseNotificationListCell;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Story;
import com.pinterest.api.model.User;
import com.pinterest.base.Colors;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.BlackClickSpan;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import org.apache.commons.lang3.ObjectUtils;

public class NetworkStoryListCell extends BaseNotificationListCell
    implements android.view.View.OnClickListener
{

    private static int sMaxRelatedObjects;
    private static int sRelatedObjectsMaxCountLargeScreen = Resources.integer(0x7f0d001e).intValue();
    private static int sRelatedObjectsMaxCountSmallScreen;
    public WebImageView _leftIv;
    public TextView _leftTv;
    public LinearLayout _relatedContainer;
    private GrayWebImageView _relatedIv[];
    private Story _story;
    public View _timeBottomDivider;
    public TextView _timeTv;

    public NetworkStoryListCell(Context context)
    {
        this(context, null);
    }

    public NetworkStoryListCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NetworkStoryListCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static NetworkStoryListCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof NetworkStoryListCell)
        {
            return (NetworkStoryListCell)view;
        } else
        {
            return (NetworkStoryListCell)ViewHelper.viewById(ViewHelper.getContext(view, viewgroup), 0x7f03015f);
        }
    }

    private Calendar getCalendarFromStory()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(_story.getLastUpdateTs().longValue() * 1000L);
        return calendar;
    }

    private boolean handleFindFriend(Uri uri)
    {
        if ("find_friend".equals(uri.getAuthority()))
        {
            Events.post(new Navigation(Location.FIND_FRIENDS));
            return true;
        } else
        {
            return false;
        }
    }

    private boolean handleSearch(Uri uri)
    {
        String s = uri.getAuthority();
        uri = uri.getQueryParameter("q");
        if ("search".equals(s) && uri != null)
        {
            Events.post(new Navigation(Location.SEARCH, uri));
            return true;
        } else
        {
            return false;
        }
    }

    private void setRelatedBoard(final String board, WebImageView webimageview)
    {
        board = ModelHelper.getBoard(board);
        if (board == null)
        {
            return;
        } else
        {
            webimageview.setOval(false);
            webimageview.loadUrl(board.getImagePreviewUrl());
            webimageview.setOnClickListener(new _cls4());
            return;
        }
    }

    private void setRelatedPin(final String pin, WebImageView webimageview)
    {
        pin = ModelHelper.getPin(pin);
        if (pin == null)
        {
            return;
        } else
        {
            webimageview.setOval(false);
            webimageview.loadUrl(pin.getImageSquareUrl());
            webimageview.setOnClickListener(new _cls5());
            return;
        }
    }

    private void setRelatedUser(final String user, WebImageView webimageview)
    {
        user = ModelHelper.getUser(user);
        if (user == null)
        {
            return;
        } else
        {
            webimageview.setOval(true);
            webimageview.loadUrl(user.getImageLargeUrlByDpi());
            webimageview.setOnClickListener(new _cls3());
            return;
        }
    }

    public static void updateRelatedObjectsCount(int i)
    {
        if (i >= Resources.integer(0x7f0d001f).intValue())
        {
            i = sRelatedObjectsMaxCountLargeScreen;
        } else
        {
            i = sRelatedObjectsMaxCountSmallScreen;
        }
        sMaxRelatedObjects = i;
    }

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.STORIES_FEED_RELATED_MORE_CELL, ComponentType.STORIES_FEED, String.valueOf(_story.getId()));
        onStoryClick(view);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        _leftIv.setOval(true);
        _leftTv.setMovementMethod(LinkMovementMethod.getInstance());
        setOnClickListener(this);
        _leftTv.setOnClickListener(this);
    }

    public void onStoryClick(View view)
    {
        if (_story.getDestinationUrl() == null) goto _L2; else goto _L1
_L1:
        view = ActivityHelper.getValidUri(_story.getDestinationUrl());
        if (!handleSearch(view) && !handleFindFriend(view)) goto _L2; else goto _L3
_L3:
        return;
_L2:
        boolean flag = ObjectUtils.equals(_story.getObjectsCount(), Integer.valueOf(1));
        if (_story.isPin())
        {
            if (flag)
            {
                view = _story.getTargetPin();
                Events.post(new Navigation(Location.PIN, view));
                return;
            } else
            {
                Events.post(new Navigation(Location.STORY_PINS, _story));
                return;
            }
        }
        if (_story.isBoard())
        {
            if (flag)
            {
                view = _story.getTargetBoard();
                Events.post(new Navigation(Location.BOARD, view));
                return;
            } else
            {
                Events.post(new Navigation(Location.STORY_BOARDS, _story));
                return;
            }
        }
        if (_story.isUser())
        {
            if (flag)
            {
                view = _story.getTargetUser();
                Events.post(new Navigation(Location.USER, view));
                return;
            } else
            {
                Events.post(new Navigation(Location.STORY_USERS, _story));
                return;
            }
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    public void setStoryItem(final Story story, final com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition user)
    {
        _story = story;
        updateBackground(user, story.getHasViewed().booleanValue());
        _leftTv.setText(BlackClickSpan.getSpannable(story.getFormattedText()));
        if (TextUtils.isEmpty(story.getMainActorId())) goto _L2; else goto _L1
_L1:
        if (story.getMainActorType().intValue() == 2)
        {
            user = ModelHelper.getUser(story.getMainActorId());
            if (user != null)
            {
                _leftIv.loadUrl(user.getImageLargeUrlByDpi());
                _leftIv.setOnClickListener(new _cls1());
            }
        }
_L11:
        int i;
        int k;
        _relatedContainer.removeAllViews();
        user = story.getRelatedObjectIdsArray();
        _relatedIv = new GrayWebImageView[Math.min(user.length, sMaxRelatedObjects)];
        k = (int)getResources().getDimension(0x7f0a01eb);
        i = 0;
_L9:
        if (i >= Math.min(user.length, _relatedIv.length)) goto _L4; else goto _L3
_L3:
        android.widget.LinearLayout.LayoutParams layoutparams;
        _relatedIv[i] = new GrayWebImageView(getContext(), null, 0x7f0b0232);
        layoutparams = new android.widget.LinearLayout.LayoutParams(k, k);
        layoutparams.setMargins(0, 0, (int)getResources().getDimension(0x7f0a015b), 0);
        story.getObjectsType().intValue();
        JVM INSTR tableswitch 0 2: default 236
    //                   0 320
    //                   1 302
    //                   2 284;
           goto _L5 _L6 _L7 _L8
_L5:
        _relatedContainer.addView(_relatedIv[i], layoutparams);
        i++;
          goto _L9
_L2:
        if (!TextUtils.isEmpty(story.getImageUrl()))
        {
            _leftIv.loadUrl(story.getImageUrl());
        }
        continue; /* Loop/switch isn't completed */
_L8:
        setRelatedUser(user[i], _relatedIv[i]);
          goto _L5
_L7:
        setRelatedBoard(user[i], _relatedIv[i]);
          goto _L5
_L6:
        setRelatedPin(user[i], _relatedIv[i]);
          goto _L5
_L4:
        if (user.length > sMaxRelatedObjects && ModelHelper.isValid(_story.getTotalCount()))
        {
            user = new TextView(getContext(), null, 0x7f0b022d);
            user.setTextColor(Colors.TEXT_LIGHT);
            user.setTextSize(0, Resources.dimension(0x7f0a01d9));
            android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams1.gravity = 80;
            user.setOnClickListener(new _cls2());
            int j = _story.getTotalCount().intValue();
            int l = _relatedIv.length;
            user.setText((new StringBuilder()).append(Resources.string(0x7f070461)).append(String.valueOf(j - l)).toString());
            _relatedContainer.addView(user, layoutparams1);
        }
        ViewHelper.setVisibility(_timeTv, false);
        ViewHelper.setVisibility(_timeBottomDivider, false);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void showTimestamp(com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition cellposition)
    {
        ViewHelper.setVisibility(_timeTv, true);
        cellposition = getCalendarFromStory();
        if (ModelHelper.isSameDay(cellposition, Calendar.getInstance()))
        {
            cellposition = getContext().getString(0x7f07059b);
        } else
        {
            cellposition = (new SimpleDateFormat(getContext().getString(0x7f070574), Locale.getDefault())).format(cellposition.getTime()).toUpperCase();
        }
        _timeTv.setText(cellposition);
        ViewHelper.setVisibility(_timeBottomDivider, true);
    }

    protected void updateViewState(boolean flag)
    {
        int i = getResources().getColor(0x7f0e0019);
        int j = getResources().getColor(0x7f0e001a);
        if (ModelHelper.isSameDay(getCalendarFromStory(), Calendar.getInstance()))
        {
            i = j;
        }
        setBackgroundColor(i);
    }

    static 
    {
        int i = Resources.integer(0x7f0d0020).intValue();
        sRelatedObjectsMaxCountSmallScreen = i;
        sMaxRelatedObjects = i;
    }

    private class _cls4
        implements android.view.View.OnClickListener
    {

        final NetworkStoryListCell this$0;
        final Board val$board;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.STORIES_FEED_RELATED_OBJECT, ComponentType.STORIES_FEED, board.getUid());
            Events.post(new Navigation(Location.BOARD, board));
        }

        _cls4()
        {
            this$0 = NetworkStoryListCell.this;
            board = board1;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final NetworkStoryListCell this$0;
        final Pin val$pin;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.STORIES_FEED_RELATED_OBJECT, ComponentType.STORIES_FEED, pin.getUid());
            Events.post(new Navigation(Location.PIN, pin));
        }

        _cls5()
        {
            this$0 = NetworkStoryListCell.this;
            pin = pin1;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final NetworkStoryListCell this$0;
        final User val$user;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.STORIES_FEED_RELATED_OBJECT, ComponentType.STORIES_FEED, user.getUid());
            Events.post(new Navigation(Location.USER, user));
        }

        _cls3()
        {
            this$0 = NetworkStoryListCell.this;
            user = user1;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NetworkStoryListCell this$0;
        final User val$user;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.STORIES_FEED_ACTOR_IMAGE, ComponentType.STORIES_FEED, user.getUid());
            Events.post(new Navigation(Location.USER, user.getUid()));
        }

        _cls1()
        {
            this$0 = NetworkStoryListCell.this;
            user = user1;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final NetworkStoryListCell this$0;
        final Story val$story;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.STORIES_FEED_RELATED_MORE_CELL, ComponentType.STORIES_FEED, String.valueOf(story.getId()));
            onStoryClick(view);
        }

        _cls2()
        {
            this$0 = NetworkStoryListCell.this;
            story = story1;
            super();
        }
    }

}
