// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;

public class LoyaltyHeaderRowView extends LinearLayout
{

    TextView mHeaderText;
    TextView mPointsBalanceHeader;

    public LoyaltyHeaderRowView(Context context)
    {
        super(context);
    }

    public void afterView()
    {
        FontManager.applyDominosFont(this);
    }

    public void bind(Context context, com.dominos.android.sdk.core.models.loyalty.History.HistoryHeaderType historyheadertype)
    {
        switch (_cls1..SwitchMap.com.dominos.android.sdk.core.models.loyalty.History.HistoryHeaderType[historyheadertype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mHeaderText.setText(context.getResources().getString(0x7f080225));
            mPointsBalanceHeader.setVisibility(8);
            return;

        case 2: // '\002'
            mHeaderText.setText(context.getString(0x7f08004b));
            break;
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$models$loyalty$History$HistoryHeaderType[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$models$loyalty$History$HistoryHeaderType = new int[com.dominos.android.sdk.core.models.loyalty.History.HistoryHeaderType.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$models$loyalty$History$HistoryHeaderType[com.dominos.android.sdk.core.models.loyalty.History.HistoryHeaderType.PENDING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$models$loyalty$History$HistoryHeaderType[com.dominos.android.sdk.core.models.loyalty.History.HistoryHeaderType.ACTIVE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
