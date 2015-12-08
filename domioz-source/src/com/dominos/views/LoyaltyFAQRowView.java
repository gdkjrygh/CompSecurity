// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.text.Html;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.loyalty.LoyaltyFAQ;

public class LoyaltyFAQRowView extends LinearLayout
{

    TextView mAnswer;
    private Context mContext;
    ImageView mExpandableButton;
    private LoyaltyOptOutListener mListener;
    RelativeLayout mLoyaltyAnswer;
    TextView mOptOutButton;
    TextView mQuestion;

    public LoyaltyFAQRowView(Context context, LoyaltyOptOutListener loyaltyoptoutlistener)
    {
        super(context);
        mContext = context;
        mListener = loyaltyoptoutlistener;
    }

    public void bind(LoyaltyFAQ loyaltyfaq)
    {
        if (loyaltyfaq == null) goto _L2; else goto _L1
_L1:
        mQuestion.setText(loyaltyfaq.getQuestion());
        mAnswer.setText(loyaltyfaq.getAnswer());
        _cls1..SwitchMap.com.dominos.android.sdk.core.models.loyalty.LoyaltyFAQ.Control[loyaltyfaq.getEnumControl().ordinal()];
        JVM INSTR tableswitch 1 1: default 56
    //                   1 71;
           goto _L3 _L4
_L3:
        mOptOutButton.setVisibility(8);
_L6:
        setSelected(false);
_L2:
        return;
_L4:
        mOptOutButton.setText(Html.fromHtml(mContext.getString(0x7f0801f6)));
        mOptOutButton.setVisibility(0);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onOptOutButtonClick()
    {
        if (mListener != null)
        {
            mListener.onOptOutClick();
        }
    }

    public void selectRow()
    {
        mExpandableButton.setImageResource(0x7f020122);
        setSelected(true);
        mLoyaltyAnswer.setVisibility(0);
    }

    public void unSelectRow()
    {
        mExpandableButton.setImageResource(0x7f020102);
        setSelected(false);
        mLoyaltyAnswer.setVisibility(8);
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$models$loyalty$LoyaltyFAQ$Control[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$models$loyalty$LoyaltyFAQ$Control = new int[com.dominos.android.sdk.core.models.loyalty.LoyaltyFAQ.Control.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$models$loyalty$LoyaltyFAQ$Control[com.dominos.android.sdk.core.models.loyalty.LoyaltyFAQ.Control.OPT_OUT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }


    private class LoyaltyOptOutListener
    {

        public abstract void onOptOutClick();
    }

}
