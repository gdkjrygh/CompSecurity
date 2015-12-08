// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.api.model.ConversationMessage;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.RoundProfileImageCell;
import com.pinterest.ui.progress.SmallLoadingView;
import com.pinterest.ui.text.BevelTitleDivider;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.conversation.view:
//            ConversationBoardListCell, ConversationPinListCell

public class ConversationListCell extends RelativeLayout
{

    private ConversationBoardListCell _boardView;
    private ViewStub _boardViewStub;
    private BevelTitleDivider _dateView;
    private SmallLoadingView _loadingSpinner;
    private FrameLayout _mediaWrapper;
    private ConversationPinListCell _pinView;
    private ViewStub _pinViewStub;
    private RoundProfileImageCell _userAvatar;
    private TextView _userMsgEt;

    public ConversationListCell(Context context)
    {
        this(context, null);
    }

    public ConversationListCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void adjustCellLayout(ConversationMessage conversationmessage)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)_userMsgEt.getLayoutParams();
        int i = (int)Resources.dimension(0x7f0a00cc);
        int j = (int)Resources.dimension(0x7f0a00cb);
        boolean flag = StringUtils.isNotBlank(conversationmessage.getText());
        if (MyUser.isUserMe(conversationmessage.getSenderId()))
        {
            setHorizontalGravity(5);
            alignParentRight(_mediaWrapper);
            alignParentRight(_userMsgEt);
            if (flag)
            {
                _userMsgEt.setBackgroundResource(0x7f0200c1);
                _userMsgEt.setTextColor(-1);
                layoutparams.setMargins(j, layoutparams.topMargin, 0, layoutparams.bottomMargin);
            }
        } else
        {
            setHorizontalGravity(3);
            alignParentLeft(_userAvatar);
            alignRightOf(_userAvatar, _userMsgEt);
            alignRightOf(_userAvatar, _mediaWrapper);
            if (flag)
            {
                _userMsgEt.setBackgroundResource(0x7f0200c0);
                _userMsgEt.setTextColor(Resources.color(0x7f0e00a9));
                layoutparams.setMargins(0, layoutparams.topMargin, j, layoutparams.bottomMargin);
            }
        }
        if (flag)
        {
            _userMsgEt.setGravity(16);
            _userMsgEt.setPadding(_userMsgEt.getPaddingLeft(), i, _userMsgEt.getPaddingRight(), i);
            i = (int)Resources.dimension(0x7f0a0159);
        } else
        {
            i = 0;
        }
        setPadding(0, i, 0, 0);
    }

    private void alignParentLeft(View view)
    {
        if (view != null)
        {
            view = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
            view.addRule(1, 0);
            view.addRule(9, 1);
            view.addRule(11, 0);
        }
    }

    private void alignParentRight(View view)
    {
        if (view != null)
        {
            view = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
            view.addRule(1, 0);
            view.addRule(9, 0);
            view.addRule(11, 1);
        }
    }

    private void alignRightOf(View view, View view1)
    {
        if (view != null && view1 != null)
        {
            view1 = (android.widget.RelativeLayout.LayoutParams)view1.getLayoutParams();
            view1.addRule(9, 0);
            view1.addRule(11, 0);
            view1.addRule(1, view.getId());
        }
    }

    private void setBoard(String s)
    {
        ViewHelper.setVisibility(_boardView, 8);
        if (ModelHelper.isValidString(s))
        {
            if (_boardView == null && _boardViewStub != null)
            {
                _boardView = (ConversationBoardListCell)_boardViewStub.inflate();
                _boardViewStub = null;
            }
            _boardView.setBoard(s);
        }
    }

    private void setPin(String s, String s1)
    {
        ViewHelper.setVisibility(_pinView, 8);
        if (ModelHelper.isValidString(s))
        {
            if (_pinView == null && _pinViewStub != null)
            {
                _pinView = (ConversationPinListCell)_pinViewStub.inflate();
                _pinViewStub = null;
            }
            _pinView.setPin(s);
        }
    }

    private void setText(final String text)
    {
        text = StringUtils.trimToNull(text);
        if (text != null)
        {
            _userMsgEt.setText(text);
            _userMsgEt.setVisibility(0);
            _userMsgEt.setOnLongClickListener(new _cls1());
            return;
        } else
        {
            _userMsgEt.setVisibility(8);
            return;
        }
    }

    private void setUserProfileImage(final ConversationMessage user)
    {
        ViewHelper.setVisibility(_userAvatar, 0);
        String s = user.getSenderId();
        user = user.getConversationId();
        if (ModelHelper.isValidString(s) && !MyUser.isUserMe(s) && ModelHelper.getConversation(user) != null)
        {
            user = ModelHelper.getUser(s);
            if (user != null)
            {
                _userAvatar.setUser(user);
                _userAvatar.setOnClickListener(new _cls2());
            }
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        _loadingSpinner = (SmallLoadingView)findViewById(0x7f0f0330);
        _dateView = (BevelTitleDivider)findViewById(0x7f0f033b);
        _userMsgEt = (TextView)findViewById(0x7f0f0341);
        _userAvatar = (RoundProfileImageCell)findViewById(0x7f0f0342);
        _pinViewStub = (ViewStub)findViewById(0x7f0f033d);
        _boardViewStub = (ViewStub)findViewById(0x7f0f033f);
        _mediaWrapper = (FrameLayout)findViewById(0x7f0f033c);
    }

    public void prepareForReuse()
    {
        _userAvatar.prepareForReuse();
    }

    public void setConversationMessage(ConversationMessage conversationmessage)
    {
        setPin(conversationmessage.getPinId(), conversationmessage.getSenderId());
        setBoard(conversationmessage.getBoardId());
        setText(conversationmessage.getText());
        setUserProfileImage(conversationmessage);
        adjustCellLayout(conversationmessage);
    }

    public void setDate(String s)
    {
        boolean flag = StringUtils.isEmpty(s);
        _dateView.setText(s);
        s = _dateView;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        s.setVisibility(byte0);
    }

    public void setLoadingSpinnerVisibility(boolean flag)
    {
        SmallLoadingView smallloadingview = _loadingSpinner;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        smallloadingview.setVisibility(i);
    }

    private class _cls1
        implements android.view.View.OnLongClickListener
    {

        final ConversationListCell this$0;
        final String val$text;

        public boolean onLongClick(View view)
        {
            Device.copyToClipboard(view.getContext(), text);
            Application.showToast(0x7f070588);
            return true;
        }

        _cls1()
        {
            this$0 = ConversationListCell.this;
            text = s;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ConversationListCell this$0;
        final User val$user;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.CONVERSATION_MESSAGES);
            Events.post(new Navigation(Location.USER, user.getUid()));
        }

        _cls2()
        {
            this$0 = ConversationListCell.this;
            user = user1;
            super();
        }
    }

}
