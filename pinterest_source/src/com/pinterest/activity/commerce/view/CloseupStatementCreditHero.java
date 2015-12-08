// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.text.PTextView;

public class CloseupStatementCreditHero extends RelativeLayout
{

    PTextView _statementCreditDisclaimer;
    PTextView _statementCreditMessage;
    private UserActionListener _userActionListener;

    public CloseupStatementCreditHero(Context context)
    {
        super(context);
        init(context);
    }

    public CloseupStatementCreditHero(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public CloseupStatementCreditHero(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f030042, this);
        ButterKnife.a(this);
    }

    public void bind(String s, String s1)
    {
        _statementCreditMessage.setText(Resources.string(0x7f07015d, new Object[] {
            s, s1
        }));
        s = Resources.string(0x7f07015c);
        s1 = Resources.string(0x7f07015e, new Object[] {
            Resources.string(0x7f07015f), s
        });
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s1);
        int i = s1.indexOf(s);
        spannablestringbuilder.setSpan(new _cls1(), i, s.length() + i, 33);
        _statementCreditDisclaimer.setText(spannablestringbuilder);
        _statementCreditDisclaimer.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void handleCancelClicked()
    {
        if (_userActionListener != null)
        {
            _userActionListener.onCompleteAndDismiss();
        }
    }

    public void setUserActionListener(UserActionListener useractionlistener)
    {
        _userActionListener = useractionlistener;
    }

    private class _cls1 extends ClickableSpan
    {

        final CloseupStatementCreditHero this$0;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.BROWSER, "https://help.pinterest.com/en/articles/mastercard-statement-credit"));
        }

        public void updateDrawState(TextPaint textpaint)
        {
            textpaint.setFakeBoldText(true);
        }

        _cls1()
        {
            this$0 = CloseupStatementCreditHero.this;
            super();
        }
    }


    private class UserActionListener
    {

        public abstract void onCompleteAndDismiss();
    }

}
