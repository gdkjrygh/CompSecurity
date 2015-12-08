// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.kit.application.Resources;
import org.apache.commons.lang3.StringUtils;

public class SendPinTitleCell extends RelativeLayout
{

    private String _messageHint;
    private String _msg;
    private Button _msgButton;
    private TextView _titleTv;
    private android.view.View.OnClickListener onEditMessage;

    public SendPinTitleCell(Context context)
    {
        this(context, null);
    }

    public SendPinTitleCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _messageHint = Resources.string(0x7f07037a);
        _msg = "";
        onEditMessage = new _cls1();
    }

    public String getMessage()
    {
        return _msg;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        _titleTv = (TextView)findViewById(0x7f0f004f);
        _msgButton = (Button)findViewById(0x7f0f03e4);
        _msgButton.setOnClickListener(onEditMessage);
    }

    public void setMessage(String s)
    {
        if (StringUtils.isBlank(s))
        {
            s = "";
            _msgButton.setText(_messageHint);
        } else
        {
            _msgButton.setText(Resources.string(0x7f07037b));
        }
        _msg = s;
    }

    public void setTitle(int i)
    {
        _titleTv.setText(i);
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SendPinTitleCell this$0;

        public void onClick(View view)
        {
            view.requestFocusFromTouch();
            Pinalytics.a(ElementType.ADD_MESSAGE_BUTTON, ComponentType.NAVIGATION);
            Events.post(new DialogEvent(new AddMessageDialog(_messageHint, _msg)));
            Events.post(new DimMessageDialogEvent());
        }

        _cls1()
        {
            this$0 = SendPinTitleCell.this;
            super();
        }

        private class DimMessageDialogEvent
        {

            final SendPinTitleCell this$0;

            public DimMessageDialogEvent()
            {
                this$0 = SendPinTitleCell.this;
                super();
            }
        }

    }

}
