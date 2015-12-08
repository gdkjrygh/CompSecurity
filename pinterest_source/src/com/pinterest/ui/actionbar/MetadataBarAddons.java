// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.activity.interest.view.FollowInterestButton;
import com.pinterest.activity.user.view.FollowUserButton;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.text.PButton;

public class MetadataBarAddons
{

    public MetadataBarAddons()
    {
    }

    public static void insertAddons(LinearLayout linearlayout, Model model, MetadataBar.Mode mode)
    {
        if (linearlayout != null && model != null)
        {
            linearlayout.removeAllViews();
            if (model instanceof User)
            {
                insertUserAddons(linearlayout, (User)model, mode);
                return;
            }
            if (model instanceof Interest)
            {
                insertInterestAddons(linearlayout, (Interest)model);
                return;
            }
            if (model instanceof Board)
            {
                insertBoardAddons(linearlayout, (Board)model);
                return;
            }
        }
    }

    private static void insertBoardAddons(LinearLayout linearlayout, final Board board)
    {
        Object obj = LayoutInflater.from(linearlayout.getContext());
        if (board.getSecret() != Boolean.TRUE)
        {
            PButton pbutton = (PButton)((LayoutInflater) (obj)).inflate(0x7f0301dd, linearlayout, false);
            pbutton.setCompoundDrawablesWithIntrinsicBounds(DrawableUtils.tintIcon(0x7f0201f4, 0x7f0e006d), null, null, null);
            pbutton.setOnClickListener(new _cls1());
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, Constants.BUTTON_HEIGHT);
            layoutparams.setMargins(0, 0, (int)Resources.dimension(0x7f0a0162), 0);
            linearlayout.addView(pbutton, layoutparams);
        }
        if (!Experiments.K() && board.getSecret() != Boolean.TRUE && board.isMeOwnerOrCollaborator())
        {
            PButton pbutton1 = (PButton)((LayoutInflater) (obj)).inflate(0x7f0301dd, linearlayout, false);
            pbutton1.setCompoundDrawablesWithIntrinsicBounds(DrawableUtils.tintIcon(0x7f0201d2, 0x7f0e006d), null, null, null);
            pbutton1.setOnClickListener(new _cls2());
            android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, Constants.BUTTON_HEIGHT);
            layoutparams1.setMargins(0, 0, (int)Resources.dimension(0x7f0a0162), 0);
            linearlayout.addView(pbutton1, layoutparams1);
        }
        if (board.getFollowing() != null)
        {
            obj = (FollowBoardButton)((LayoutInflater) (obj)).inflate(0x7f0301d2, linearlayout, false);
            ((FollowBoardButton) (obj)).setBoard(board);
            linearlayout.addView(((View) (obj)), new android.widget.LinearLayout.LayoutParams(-2, Constants.BUTTON_HEIGHT));
        }
    }

    private static void insertInterestAddons(LinearLayout linearlayout, Interest interest)
    {
        FollowInterestButton followinterestbutton = (FollowInterestButton)LayoutInflater.from(linearlayout.getContext()).inflate(0x7f0301d4, linearlayout, false);
        followinterestbutton.setInterest(interest);
        linearlayout.addView(followinterestbutton, new android.widget.LinearLayout.LayoutParams(-2, Constants.BUTTON_HEIGHT));
    }

    private static void insertUserAddons(LinearLayout linearlayout, User user, MetadataBar.Mode mode)
    {
        LayoutInflater layoutinflater = LayoutInflater.from(linearlayout.getContext());
        if (!MyUser.isUserMe(user) && mode == MetadataBar.Mode.BOARDS)
        {
            mode = (FollowUserButton)layoutinflater.inflate(0x7f0301d5, linearlayout, false);
            mode.setUser(user);
            linearlayout.addView(mode, new android.widget.LinearLayout.LayoutParams(-2, Constants.BUTTON_HEIGHT));
        }
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final Board val$board;

        public final void onClick(View view)
        {
            Pinalytics.a(ElementType.SEND_BUTTON, ComponentType.BOARD_PINS_GRID, board.getUid());
            if (Experiments.K())
            {
                SendShareUtils.getInstance().postSendShareNavigation(board);
            } else
            {
                view = view.getContext();
                if (view != null)
                {
                    Intent intent = new Intent(view, com/pinterest/activity/sendapin/SendPinActivity);
                    intent.putExtra("boardId", board.getUid());
                    view.startActivity(intent);
                    return;
                }
            }
        }

        _cls1()
        {
            board = board1;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final Board val$board;

        public final void onClick(View view)
        {
            Pinalytics.a(ElementType.BOARD_SHARE_BUTTON, ComponentType.FLOWED_BOARD, board.getUid());
            Events.post(new DialogEvent(BoardShareDialog.newInstance(board.getUid())));
        }

        _cls2()
        {
            board = board1;
            super();
        }
    }

}
