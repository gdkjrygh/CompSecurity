// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ReportBugView extends LinearLayout
{

    private EditText _messageTv;
    private EditText _titleTv;

    public ReportBugView(Context context)
    {
        super(context);
        init();
    }

    public ReportBugView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301fb, this);
        _titleTv = (EditText)findViewById(0x7f0f0077);
        _messageTv = (EditText)findViewById(0x7f0f0173);
    }

    public String getMessageText()
    {
        return String.valueOf(_messageTv.getText());
    }

    public String getTitleText()
    {
        return String.valueOf(_titleTv.getText());
    }

    public void setScreenShot(final Bitmap b)
    {
        b = new _cls1();
        Object obj = new TextPaint();
        ((TextPaint) (obj)).setColor(0xff0000ff);
        ((TextPaint) (obj)).setUnderlineText(true);
        b.updateDrawState(((TextPaint) (obj)));
        obj = new SpannableString("* A screen shot will automatically be attached");
        ((SpannableString) (obj)).setSpan(b, 4, 15, 33);
        b = (TextView)findViewById(0x7f0f04c8);
        b.setText(((CharSequence) (obj)));
        b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private class _cls1 extends ClickableSpan
    {

        final ReportBugView this$0;
        final Bitmap val$b;

        public void onClick(View view)
        {
            view = SimpleImageDialog.newInstance();
            view.setImage(b);
            Events.post(new DialogEvent(view));
        }

        _cls1()
        {
            this$0 = ReportBugView.this;
            b = bitmap;
            super();
        }
    }

}
