// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.IconTextView;

public class BoardHeaderInviteView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private Button _acceptBtn;
    private String _apiTag;
    private Board _board;
    private Button _ignoreBtn;
    private User _inviter;
    private IconTextView _inviterItv;
    private ApiResponseHandler onAccepted;
    private ApiResponseHandler onIgnored;

    public BoardHeaderInviteView(Context context)
    {
        this(context, null);
    }

    public BoardHeaderInviteView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onAccepted = new _cls2(0x7f070037);
        onIgnored = new _cls3(0x7f0702f3);
        init();
    }

    private void clickAccept()
    {
        if (_board == null)
        {
            return;
        } else
        {
            Pinalytics.a(ElementType.INVITE_BUTTON, null, _board.getUid());
            showAcceptDialog();
            return;
        }
    }

    private void clickIgnore()
    {
        if (_board == null)
        {
            return;
        } else
        {
            Pinalytics.a(ElementType.DECLINE_BUTTON, null, _board.getUid());
            BoardApi.i(String.valueOf(_board.getUid()), onIgnored, _apiTag);
            return;
        }
    }

    private void clickInviter()
    {
        if (_board == null || _board.getUser() == null)
        {
            return;
        } else
        {
            String s = _inviter.getUid();
            Pinalytics.a(ElementType.PROFILE_IMAGE, ComponentType.NAVIGATION, s);
            Events.post(new Navigation(Location.USER, s));
            return;
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f03012c, this);
        _inviterItv = (IconTextView)findViewById(0x7f0f02fd);
        _inviterItv.setPaddingDimen(0x7f0a015f);
        _inviterItv.setOval(true);
        _ignoreBtn = (Button)findViewById(0x7f0f02fe);
        _acceptBtn = (Button)findViewById(0x7f0f02ff);
    }

    private void showAcceptDialog()
    {
        final BaseDialog dialog = new BaseDialog();
        dialog.setTitle(0x7f070036);
        dialog.setMessage(0x7f070035);
        dialog.setPositiveButton(0x7f070033, new _cls1());
        dialog.setNegativeButton(0x7f0700af, null);
        Events.post(new DialogEvent(dialog));
    }

    public Board getBoard()
    {
        return _board;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131690237: 
            clickInviter();
            return;

        case 2131690238: 
            clickIgnore();
            return;

        case 2131690239: 
            clickAccept();
            break;
        }
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setBoard(Board board)
    {
        _board = board;
    }

    public void setInviter(User user)
    {
        _inviter = user;
        if (user == null || user.getFirstName() == null)
        {
            setVisibility(8);
            return;
        } else
        {
            android.text.Spanned spanned = ViewHelper.getBoldText(0x7f070094, user.getFirstName());
            _inviterItv.setImageUrl(user.getImageMediumUrl());
            _inviterItv.setTitleMaxLines(2);
            _inviterItv.getTitleView().setText(spanned);
            _inviterItv.setOnClickListener(this);
            _ignoreBtn.setOnClickListener(this);
            _acceptBtn.setOnClickListener(this);
            return;
        }
    }




    private class _cls2 extends InviteResponseHandler
    {
        private class InviteResponseHandler extends ApiResponseHandler
        {

            private int _toastId;
            final BoardHeaderInviteView this$0;

            public void onSuccess(ApiResponse apiresponse)
            {
                super.onSuccess(apiresponse);
                if (_board != null)
                {
                    ModelHelper.deleteBoardInvite(_board.getUid());
                }
                if (_toastId != 0)
                {
                    Application.showToast(_toastId);
                }
                ModelHelper.deleteBoardInvite(_board.getUid());
                setVisibility(8);
            }

            public InviteResponseHandler(int i)
            {
                this$0 = BoardHeaderInviteView.this;
                super();
                _toastId = i;
            }
        }


        final BoardHeaderInviteView this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Events.post(new com.pinterest.api.model.Board.RequestUpdateEvent());
            Pinalytics.a(EventType.BOARD_ACCEPT_INVITE_COLLABORATOR, _board.getUid());
        }

        _cls2(int i)
        {
            this$0 = BoardHeaderInviteView.this;
            super(i);
        }
    }


    private class _cls3 extends InviteResponseHandler
    {

        final BoardHeaderInviteView this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Pinalytics.a(EventType.BOARD_DECLINE_INVITE_COLLABORATOR, _board.getUid());
            if ((getContext() instanceof Activity) && Constants.isTrue(_board.getSecret()))
            {
                ((Activity)getContext()).onBackPressed();
            }
        }

        _cls3(int i)
        {
            this$0 = BoardHeaderInviteView.this;
            super(i);
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BoardHeaderInviteView this$0;
        final BaseDialog val$dialog;

        public void onClick(View view)
        {
            Pinalytics.a(null, ComponentType.MODAL_DIALOG, _board.getUid());
            BoardApi.h(String.valueOf(_board.getUid()), onAccepted, _apiTag);
            dialog.dismiss();
        }

        _cls1()
        {
            this$0 = BoardHeaderInviteView.this;
            dialog = basedialog;
            super();
        }
    }

}
