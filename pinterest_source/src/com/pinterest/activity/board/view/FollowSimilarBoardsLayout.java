// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowSimilarBoardButton

public class FollowSimilarBoardsLayout extends LinearLayout
{

    private static final int ANIM_SPEED_EXTRA_FAST = Resources.integer(0x7f0d000e).intValue();
    private static final int ANIM_SPEED_NORMAL = Resources.integer(0x7f0d000c).intValue();
    public static final int MAX_NUM_SIMILAR_BOARDS = 3;
    private int _currentSimilarFeedIndex;
    protected List _currentlyDisplayedBoardSuggestions;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private Feed _similarBoardsFeed;

    public FollowSimilarBoardsLayout(Context context)
    {
        super(context);
        _currentSimilarFeedIndex = 0;
        _eventsSubscriber = new _cls3();
        _currentlyDisplayedBoardSuggestions = new ArrayList();
    }

    private void animateInitialSimilarBoards()
    {
        if (getChildCount() > 0)
        {
            final View lastSimilarBoardView = getChildAt(getChildCount() - 1);
            lastSimilarBoardView.getViewTreeObserver().addOnPreDrawListener(new _cls1());
        }
    }

    private void crossfadeOldAndNewRecommendations(final View oldRecommendationView, final View newRecommendationView, final int viewPositionIndex)
    {
        newRecommendationView.setAlpha(0.0F);
        newRecommendationView.setVisibility(0);
        oldRecommendationView.animate().alpha(0.0F).setDuration(ANIM_SPEED_NORMAL).setListener(new _cls4()).start();
    }

    private ObjectAnimator getAlphaAnimatorForView(View view)
    {
        view = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            0.0F, 1.0F
        });
        view.setDuration(ANIM_SPEED_EXTRA_FAST);
        return view;
    }

    private ViewGroup getFollowButtonContainer(Board board, int i)
    {
        ViewGroup viewgroup = (ViewGroup)inflate(getContext(), 0x7f030200, null);
        Object obj = new android.widget.LinearLayout.LayoutParams(getResources().getDimensionPixelSize(0x7f0a0141), -2);
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(Constants.MARGIN, 0, 0, 0);
        viewgroup.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = (FollowSimilarBoardButton)viewgroup.findViewById(0x7f0f04cc);
        ((FollowSimilarBoardButton) (obj)).setStyle(com.pinterest.ui.text.PButton.ButtonStyle.RED);
        ((FollowSimilarBoardButton) (obj)).setText(getContext().getString(0x7f0702ab));
        ((FollowSimilarBoardButton) (obj)).setTag(Integer.valueOf(i));
        ((FollowSimilarBoardButton) (obj)).setBoard(board);
        return viewgroup;
    }

    private LinearLayout getSimilarBoardCell(final Board board, int i)
    {
        _currentSimilarFeedIndex = _currentSimilarFeedIndex + 1;
        LinearLayout linearlayout = (LinearLayout)inflate(getContext(), 0x7f030201, null);
        linearlayout.setOnClickListener(new _cls2());
        WebImageView webimageview = (WebImageView)linearlayout.findViewById(0x7f0f0375);
        PTextView ptextview = (PTextView)linearlayout.findViewById(0x7f0f0376);
        PTextView ptextview1 = (PTextView)linearlayout.findViewById(0x7f0f0377);
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD, ptextview);
        webimageview.loadUrl(board.getImagePreviewUrl());
        ptextview.setText(board.getName());
        if (board.getUser() != null)
        {
            ptextview1.setText(board.getUser().getFullName());
        }
        ((LinearLayout)linearlayout.findViewById(0x7f0f04cd)).addView(getFollowButtonContainer(board, i));
        return linearlayout;
    }

    private void initializeLayout()
    {
        int i = 0;
        if (_similarBoardsFeed.getCount() < 3)
        {
            return;
        }
        Object obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        setOrientation(1);
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        setBackgroundColor(-1);
        addView(inflate(getContext(), 0x7f030098, null));
        obj = (TextView)inflate(getContext(), 0x7f030202, null);
        ((TextView) (obj)).setBackgroundColor(0);
        addView(((View) (obj)));
        do
        {
            if (i >= 3)
            {
                break;
            }
            Board board = (Board)_similarBoardsFeed.get(i);
            if (board != null && !board.getFollowing().booleanValue())
            {
                LinearLayout linearlayout = getSimilarBoardCell(board, getChildCount());
                linearlayout.setAlpha(0.0F);
                addView(linearlayout);
                _currentlyDisplayedBoardSuggestions.add(board);
                i++;
            }
        } while (true);
        animateInitialSimilarBoards();
        addView(inflate(getContext(), 0x7f030098, null));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Events.register(_eventsSubscriber, com/pinterest/activity/board/view/FollowSimilarBoardButton$FollowSimilarBoardSuccessEvent, new Class[0]);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        Events.unregister(_eventsSubscriber);
    }

    public void replaceBoardRecommendation(Board board)
    {
        if (_currentSimilarFeedIndex < _similarBoardsFeed.getCount() && board != null && _currentlyDisplayedBoardSuggestions.contains(board))
        {
            int i = _currentlyDisplayedBoardSuggestions.indexOf(board);
            int j = i + 2;
            board = (Board)_similarBoardsFeed.get(_currentSimilarFeedIndex);
            _currentlyDisplayedBoardSuggestions.set(i, board);
            board = getSimilarBoardCell(board, j);
            crossfadeOldAndNewRecommendations(getChildAt(j), board, j);
        }
    }

    public void setSimilarBoardsFeed(Feed feed)
    {
        _similarBoardsFeed = feed;
        initializeLayout();
    }




    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final FollowSimilarBoardsLayout this$0;

        public void onEventMainThread(FollowSimilarBoardButton.FollowSimilarBoardSuccessEvent followsimilarboardsuccessevent)
        {
            int i = followsimilarboardsuccessevent.getViewPositionIndex();
            followsimilarboardsuccessevent = (Board)_currentlyDisplayedBoardSuggestions.get(i - 2);
            Events.post(new ToastEvent(new FollowSimilarBoardToast(followsimilarboardsuccessevent)));
            replaceBoardRecommendation(followsimilarboardsuccessevent);
        }

        _cls3()
        {
            this$0 = FollowSimilarBoardsLayout.this;
            super();
        }
    }


    private class _cls1
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final FollowSimilarBoardsLayout this$0;
        final View val$lastSimilarBoardView;

        public boolean onPreDraw()
        {
            lastSimilarBoardView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (getChildAt(2) != null && getChildAt(3) != null && getChildAt(4) != null)
            {
                AnimatorSet animatorset = new AnimatorSet();
                animatorset.playSequentially(new Animator[] {
                    getAlphaAnimatorForView(getChildAt(2)), getAlphaAnimatorForView(getChildAt(3)), getAlphaAnimatorForView(getChildAt(4))
                });
                animatorset.start();
            }
            return true;
        }

        _cls1()
        {
            this$0 = FollowSimilarBoardsLayout.this;
            lastSimilarBoardView = view;
            super();
        }
    }


    private class _cls4 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final FollowSimilarBoardsLayout this$0;
        final View val$newRecommendationView;
        final View val$oldRecommendationView;
        final int val$viewPositionIndex;

        public void onAnimationEnd(Animator animator)
        {
            oldRecommendationView.setVisibility(8);
            removeViewAt(viewPositionIndex);
            addView(newRecommendationView, viewPositionIndex);
            newRecommendationView.animate().alpha(1.0F).setDuration(FollowSimilarBoardsLayout.ANIM_SPEED_NORMAL).setListener(null);
        }

        _cls4()
        {
            this$0 = FollowSimilarBoardsLayout.this;
            oldRecommendationView = view;
            viewPositionIndex = i;
            newRecommendationView = view1;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final FollowSimilarBoardsLayout this$0;
        final Board val$board;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.SIMILAR_BOARD_OPEN_BUTTON, ComponentType.SIMILAR_BOARDS, board.getUid());
            Events.post(new Navigation(Location.BOARD, board.getUid()));
        }

        _cls2()
        {
            this$0 = FollowSimilarBoardsLayout.this;
            board = board1;
            super();
        }
    }

}
