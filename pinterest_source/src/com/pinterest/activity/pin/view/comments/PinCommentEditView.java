// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.comments;

import android.content.Context;
import android.text.TextWatcher;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.atmention.AtMentionEditTextView;

public class PinCommentEditView extends RelativeLayout
{

    private View _commentBt;
    private AtMentionEditTextView _commentEt;
    private Pin _pin;
    private boolean _sendingComment;
    private android.view.View.OnClickListener onCommentClicked;
    private TextWatcher onTextWatcher;

    public PinCommentEditView(Context context)
    {
        this(context, null);
    }

    public PinCommentEditView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinCommentEditView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _sendingComment = false;
        onCommentClicked = new _cls3();
        onTextWatcher = new _cls5();
    }

    private void init()
    {
        _commentBt = findViewById(0x7f0f037e);
        _commentBt.setOnClickListener(onCommentClicked);
        _commentEt = (AtMentionEditTextView)findViewById(0x7f0f037d);
        _commentEt.setKeyListener(TextKeyListener.getInstance(true, android.text.method.TextKeyListener.Capitalize.SENTENCES));
        _commentEt.addTextChangedListener(onTextWatcher);
        _commentEt.setOnEditorActionListener(new _cls1());
        _commentEt.setOnFocusChangeListener(new _cls2());
    }

    private void sendComment()
    {
        String s;
label0:
        {
            if (!_sendingComment)
            {
                Pinalytics.a(ElementType.PIN_COMMENT_BUTTON, ComponentType.MODAL_PIN, _pin.getUid());
                s = _commentEt.getText().toString().trim();
                if (s.length() != 0)
                {
                    break label0;
                }
                _commentEt.setText(null);
            }
            return;
        }
        if (!NetworkUtils.getInstance().hasInternet())
        {
            Application.showNoInternetToast();
            return;
        } else
        {
            _sendingComment = true;
            PinApi.a(_pin.getUid(), s, new _cls4(_pin.getUid()));
            Device.hideSoftKeyboard(_commentEt);
            return;
        }
    }

    public void activate()
    {
        _commentEt.requestFocus();
        Device.showSoftKeyboard(_commentEt);
    }

    public Pin getPin()
    {
        return _pin;
    }

    public boolean isSendingComment()
    {
        return _sendingComment;
    }

    protected void onDetachedFromWindow()
    {
        if (_commentBt != null)
        {
            _commentBt.setOnClickListener(null);
            _commentBt = null;
            onCommentClicked = null;
        }
        if (_commentEt != null)
        {
            _commentEt.setOnEditorActionListener(null);
            _commentEt.setOnFocusChangeListener(null);
            _commentEt.removeTextChangedListener(onTextWatcher);
            _commentEt = null;
            onTextWatcher = null;
        }
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        init();
    }

    public void setCurrentComment(String s)
    {
        if (_commentEt != null)
        {
            _commentEt.setText(s);
        }
    }

    public void setPin(Pin pin)
    {
        _pin = pin;
        if (pin != null)
        {
            _commentEt.setPinUid(pin.getUid());
        }
    }

    public void setText(String s)
    {
        _commentEt.setText(s);
    }



/*
    static boolean access$102(PinCommentEditView pincommenteditview, boolean flag)
    {
        pincommenteditview._sendingComment = flag;
        return flag;
    }

*/


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PinCommentEditView this$0;

        public void onClick(View view)
        {
            sendComment();
        }

        _cls3()
        {
            this$0 = PinCommentEditView.this;
            super();
        }
    }


    private class _cls5
        implements TextWatcher
    {

        final PinCommentEditView this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            Events.post(new PinCommentChangedEvent(charsequence.toString()));
        }

        _cls5()
        {
            this$0 = PinCommentEditView.this;
            super();
        }

        private class PinCommentChangedEvent
        {

            private String _commentText;

            public String getCommentText()
            {
                return _commentText;
            }

            public PinCommentChangedEvent(String s)
            {
                _commentText = s;
            }
        }

    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final PinCommentEditView this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 4 || i == 0 || keyevent != null && keyevent.getKeyCode() == 66)
            {
                sendComment();
                requestFocus();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = PinCommentEditView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnFocusChangeListener
    {

        final PinCommentEditView this$0;

        public void onFocusChange(View view, boolean flag)
        {
            if (!flag)
            {
                Device.hideSoftKeyboard(PinCommentEditView.this);
            }
        }

        _cls2()
        {
            this$0 = PinCommentEditView.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.api.remote.PinApi.CommentApiResponse
    {

        final PinCommentEditView this$0;

        public void onFinish()
        {
            super.onFinish();
            _sendingComment = false;
        }

        public void onSuccess(Comment comment)
        {
            super.onSuccess(comment);
            Application.showToast(0x7f0703fe);
            if (_commentEt != null)
            {
                _commentEt.setText("");
            }
        }

        _cls4(String s)
        {
            this$0 = PinCommentEditView.this;
            super(s);
        }
    }

}
