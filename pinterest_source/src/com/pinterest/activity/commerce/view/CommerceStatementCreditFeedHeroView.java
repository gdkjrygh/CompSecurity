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
import com.pinterest.activity.commerce.model.StatementCreditExtraData;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.text.PTextView;

public class CommerceStatementCreditFeedHeroView extends RelativeLayout
{

    PTextView disclaimer;
    PTextView title;
    private UserActionListener userActionListener;

    public CommerceStatementCreditFeedHeroView(Context context)
    {
        super(context);
        init(context);
    }

    public CommerceStatementCreditFeedHeroView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public CommerceStatementCreditFeedHeroView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f030056, this);
        ButterKnife.a(this);
        context = Resources.string(0x7f07015c);
        String s = Resources.string(0x7f07015e, new Object[] {
            Resources.string(0x7f07015f), context
        });
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        int i = s.indexOf(context);
        spannablestringbuilder.setSpan(new _cls1(), i, context.length() + i, 33);
        disclaimer.setText(spannablestringbuilder);
        disclaimer.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void bind(StatementCreditExtraData statementcreditextradata)
    {
        title.setText(Resources.string(0x7f07015b, new Object[] {
            statementcreditextradata.getDisplayAmount(), statementcreditextradata.getIncentiveName()
        }));
    }

    public void handleCancelClicked()
    {
        if (userActionListener != null)
        {
            userActionListener.onCompleteAndDismiss();
        }
    }

    public void handleShopButtonClicked()
    {
        Events.post(new Navigation(Location.COMMERCE_SHOP_SPACE));
        if (userActionListener != null)
        {
            userActionListener.onCompleteAndDismiss();
        }
    }

    public void setUserActionListener(UserActionListener useractionlistener)
    {
        userActionListener = useractionlistener;
    }

    private class _cls1 extends ClickableSpan
    {

        final CommerceStatementCreditFeedHeroView this$0;

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
            this$0 = CommerceStatementCreditFeedHeroView.this;
            super();
        }
    }


    private class UserActionListener
    {

        public abstract void onCompleteAndDismiss();
    }

}
