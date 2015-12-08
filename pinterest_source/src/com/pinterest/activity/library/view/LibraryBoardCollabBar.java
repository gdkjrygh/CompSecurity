// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.User;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.imageview.WebImageView;
import me.grantland.widget.AutofitTextView;

public class LibraryBoardCollabBar extends LinearLayout
{

    private int MAX_COLLABORATORS_SHOWN;
    private String _apiTag;
    private Board _board;
    LinearLayout _collabWrapper;
    private User _owner;
    private android.view.View.OnClickListener onUserClickListener;

    public LibraryBoardCollabBar(Context context)
    {
        this(context, null);
    }

    public LibraryBoardCollabBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        MAX_COLLABORATORS_SHOWN = 3;
        onUserClickListener = new _cls2();
        LayoutInflater.from(getContext()).inflate(0x7f0301e3, this, true);
        ButterKnife.a(this);
    }

    private void addCollboratorButton(int i, int j, int k)
    {
        AutofitTextView autofittextview = new AutofitTextView(getContext());
        autofittextview.setTextAppearance(getContext(), 0x7f0b019e);
        android.widget.LinearLayout.LayoutParams layoutparams;
        if (i > 0)
        {
            autofittextview.setText((new StringBuilder("+")).append(String.valueOf(i)).toString());
        } else
        {
            autofittextview.setTextSize(0, getResources().getDimensionPixelSize(0x7f0a01da));
            autofittextview.setText("+");
        }
        autofittextview.setBackgroundResource(0x7f02006d);
        autofittextview.setGravity(17);
        autofittextview.setOnClickListener(onUserClickListener);
        layoutparams = new android.widget.LinearLayout.LayoutParams(j, j);
        layoutparams.setMargins(k, 0, 0, 0);
        _collabWrapper.addView(autofittextview, layoutparams);
    }

    private void loadCollaborators()
    {
        if (_board == null)
        {
            return;
        } else
        {
            BoardApi.a(_board.getUid(), true, new _cls3(), _apiTag);
            return;
        }
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
            webimageview.setOnClickListener(new _cls1());
            return;
        }
    }

    private void showCollaboratorImages(UserFeed userfeed)
    {
        if (userfeed != null && userfeed.getCount() != 0)
        {
            _collabWrapper.removeAllViews();
            boolean flag;
            int i;
            int j;
            int k;
            int l;
            if (_board.isMeOwnerOrCollaborator() || userfeed.getCount() > MAX_COLLABORATORS_SHOWN)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                i = MAX_COLLABORATORS_SHOWN - 1;
            } else
            {
                i = MAX_COLLABORATORS_SHOWN;
            }
            j = Math.min(i, userfeed.getCount());
            k = (int)getResources().getDimension(0x7f0a014b);
            l = (int)getResources().getDimension(0x7f0a01eb);
            for (i = 0; i < j; i++)
            {
                GrayWebImageView graywebimageview = new GrayWebImageView(getContext(), null, 0x7f0b0235);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(l, l);
                if (i < j - 1)
                {
                    layoutparams.setMargins(0, 0, k, 0);
                }
                setCollaborater((User)userfeed.get(i), graywebimageview);
                _collabWrapper.addView(graywebimageview, layoutparams);
            }

            if (flag)
            {
                addCollboratorButton((_board.getCollaboratorCount().intValue() + 1) - j, l, k);
                return;
            }
        }
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setBoard(Board board)
    {
        _board = board;
        _owner = board.getUser();
        loadCollaborators();
    }




    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LibraryBoardCollabBar this$0;

        public void onClick(View view)
        {
            if (_board != null && _owner != null)
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

        _cls2()
        {
            this$0 = LibraryBoardCollabBar.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.UserApi.UserFeedApiResponse
    {

        final LibraryBoardCollabBar this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            if (_board.getUser() != null)
            {
                feed.appendItem(_board.getUser());
            }
            showCollaboratorImages((UserFeed)feed);
        }

        _cls3()
        {
            this$0 = LibraryBoardCollabBar.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LibraryBoardCollabBar this$0;
        final User val$user;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.USER, user));
        }

        _cls1()
        {
            this$0 = LibraryBoardCollabBar.this;
            user = user1;
            super();
        }
    }

}
