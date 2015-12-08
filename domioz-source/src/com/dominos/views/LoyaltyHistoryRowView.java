// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.loyalty.History;

public class LoyaltyHistoryRowView extends LinearLayout
{

    RelativeLayout mAdditionalInfo;
    TextView mDate;
    TextView mDescription;
    RelativeLayout mMainInfo;
    ImageView mMoreInfoSelector;
    TextView mOrderNumber;
    RelativeLayout mOrderNumberView;
    TextView mPointBalance;
    TextView mPoints;
    TextView mPreTipTotal;
    RelativeLayout mPreTipView;
    TextView mTransactionType;

    public LoyaltyHistoryRowView(Context context)
    {
        super(context);
    }

    private void setListenerForClicks()
    {
        mMainInfo.setOnClickListener(new _cls1());
    }

    private void toggleAdditionalInfo()
    {
        if (mAdditionalInfo.getVisibility() == 8)
        {
            selectRow();
            return;
        } else
        {
            deselectRow();
            return;
        }
    }

    public void afterViews()
    {
        FontManager.applyDominosFont(this);
    }

    public void bind(History history, boolean flag, boolean flag1)
    {
        String s = StringHelper.replace(history.getTransactionType(), "_", " ");
        mTransactionType.setText((new StringBuilder()).append(s).append(":").toString());
        mDate.setText(history.getTransactionDate());
        if (flag)
        {
            setBackgroundResource(0x7f02013a);
            setListenerForClicks();
        } else
        if (flag1)
        {
            setBackgroundResource(0x7f020138);
            setListenerForClicks();
        } else
        {
            setBackgroundResource(0x7f020141);
        }
        s = history.getPoints();
        mPoints.setText(history.getPoints());
        if (NumberUtil.isZero(s))
        {
            mTransactionType.setTextColor(getResources().getColor(0x7f0e0061));
        } else
        if (NumberUtil.isNegative(s))
        {
            mTransactionType.setTextColor(getResources().getColor(0x7f0e0070));
        } else
        {
            mTransactionType.setTextColor(getResources().getColor(0x7f0e000b));
        }
        mDescription.setText(history.getDescription());
        if (NumberUtil.isPositive(Double.valueOf(history.getTransactionTotal())))
        {
            mPreTipView.setVisibility(0);
            mPreTipTotal.setText(NumberUtil.formatPrice(Double.valueOf(history.getTransactionTotal())));
        } else
        {
            mPreTipView.setVisibility(8);
        }
        if (StringHelper.isNotEmpty(history.getOrderNumber()))
        {
            mOrderNumberView.setVisibility(0);
            mOrderNumber.setText(history.getOrderNumber());
        } else
        {
            mOrderNumberView.setVisibility(8);
        }
        mPointBalance.setText(history.getPointBalance());
    }

    public void deselectRow()
    {
        mMoreInfoSelector.setImageResource(0x7f020102);
        setSelected(false);
        mAdditionalInfo.setVisibility(8);
    }

    public void selectRow()
    {
        mMoreInfoSelector.setImageResource(0x7f020122);
        setSelected(true);
        mAdditionalInfo.setVisibility(0);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoyaltyHistoryRowView this$0;

        public void onClick(View view)
        {
            toggleAdditionalInfo();
        }

        _cls1()
        {
            this$0 = LoyaltyHistoryRowView.this;
            super();
        }
    }

}
