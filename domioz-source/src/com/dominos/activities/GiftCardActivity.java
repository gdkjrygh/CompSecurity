// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.core.giftcard.GiftCardManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import java.util.ArrayList;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, AddGiftCardActivity_

public class GiftCardActivity extends BaseActivity
    implements android.view.View.OnClickListener
{

    Button btnAddAnother;
    Button btnDone;
    LinearLayout giftCardInfoSection1;
    LinearLayout giftCardInfoSection2;
    LinearLayout giftCardSection;
    RelativeLayout giftCardSection1;
    LinearLayout giftCardSection2;
    RelativeLayout gift_Card_Section2;
    TextView lblApplyGiftCardText1;
    TextView lblApplyGiftCardText2;
    TextView lblBalanceDue;
    TextView lblChangeAmount1;
    TextView lblChangeAmount2;
    TextView lblGiftCardAmount1;
    TextView lblGiftCardAmount2;
    TextView lblOrderTotal;
    TextView lblStartingBalanceCard1;
    TextView lblStartingBalanceCard2;
    private ArrayList mGiftCardList;
    private GiftCardManager mGiftCardManager;

    public GiftCardActivity()
    {
    }

    private void updateFirstGiftCardSection()
    {
        GiftCard giftcard = (GiftCard)mGiftCardList.get(0);
        giftCardInfoSection1.setVisibility(0);
        lblGiftCardAmount1.setText(String.valueOf(NumberUtil.formatPrice(Double.valueOf(giftcard.getAmount()))));
        lblApplyGiftCardText1.setText(giftcard.getLastThree());
        lblStartingBalanceCard1.setText(getString(0x7f08015a, new Object[] {
            NumberUtil.formatPrice(Double.valueOf(giftcard.getBalance()))
        }));
        btnDone.setVisibility(0);
        gift_Card_Section2.setOnClickListener(this);
        lblChangeAmount1.setOnClickListener(this);
        btnDone.setOnClickListener(this);
        if (Double.compare(mGiftCardManager.getRemainingTempBalance(mOrderManager.getOrder()), 0.0D) > 0)
        {
            btnAddAnother.setVisibility(0);
            btnAddAnother.setOnClickListener(this);
        }
    }

    private void updateSecondGiftCardSection()
    {
        giftCardSection2.setVisibility(0);
        GiftCard giftcard = (GiftCard)mGiftCardList.get(1);
        lblGiftCardAmount2.setText(String.valueOf(NumberUtil.formatPrice(Double.valueOf(giftcard.getAmount()))));
        lblApplyGiftCardText2.setText(giftcard.getLastThree());
        lblStartingBalanceCard2.setText(getString(0x7f08015a, new Object[] {
            NumberUtil.formatPrice(Double.valueOf(giftcard.getBalance()))
        }));
        giftCardInfoSection2.setVisibility(0);
        lblChangeAmount2.setOnClickListener(this);
        btnAddAnother.setVisibility(8);
    }

    private void updateViews()
    {
        lblBalanceDue.setText(getString(0x7f080069, new Object[] {
            NumberUtil.formatPrice(Double.valueOf(mGiftCardManager.getRemainingTempBalance(mOrderManager.getOrder()))), NumberUtil.formatPrice(Double.valueOf(mGiftCardManager.getTotalTempGiftCardAmount()))
        }));
        mGiftCardList = mGiftCardManager.getTempGiftCardList();
        if (mGiftCardList != null)
        {
            if (mGiftCardList.size() > 0)
            {
                updateFirstGiftCardSection();
                if (mGiftCardList.size() > 1)
                {
                    updateSecondGiftCardSection();
                }
            }
            return;
        } else
        {
            launchAddGiftCardActivity(4);
            return;
        }
    }

    void afterViews()
    {
        mGiftCardManager = (GiftCardManager)mMobileSession.getManager("gift_card_manager");
        mGiftCardManager.loadTempGiftCardList();
        updateViews();
        giftCardSection1.setOnClickListener(this);
        lblOrderTotal.setText(getString(0x7f080217, new Object[] {
            NumberUtil.formatPrice(Double.valueOf(mOrderManager.getOrder().getPrice()))
        }));
    }

    public Activity getActivity()
    {
        return this;
    }

    public void launchAddGiftCardActivity(int i)
    {
        GiftCard giftcard;
        int j;
        if (mGiftCardList != null)
        {
            j = mGiftCardList.size();
        } else
        {
            j = 0;
        }
        i;
        JVM INSTR tableswitch 4 5: default 40
    //                   4 71
    //                   5 90;
           goto _L1 _L2 _L3
_L1:
        giftcard = null;
_L5:
        ((AddGiftCardActivity_.IntentBuilder_)AddGiftCardActivity_.intent(this).flags(0x4000000)).editGiftCard(giftcard).startForResult(2);
        overridePendingTransition(0x7f040012, 0x7f040013);
        return;
_L2:
        if (j <= 0) goto _L1; else goto _L4
_L4:
        giftcard = (GiftCard)mGiftCardList.get(0);
          goto _L5
_L3:
        if (j <= 1) goto _L1; else goto _L6
_L6:
        giftcard = (GiftCard)mGiftCardList.get(1);
          goto _L5
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 2) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR lookupswitch 3: default 40
    //                   -1: 41
    //                   0: 46
    //                   6: 58;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        updateViews();
        return;
_L4:
        if (mGiftCardList == null)
        {
            finish();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (mGiftCardManager.getTempGiftCardList() == null)
        {
            finish();
            return;
        } else
        {
            setContentView(0x7f03006d);
            return;
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        mGiftCardManager.deleteTempGiftCardList();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131690191: 
        case 2131690198: 
            launchAddGiftCardActivity(4);
            return;

        case 2131690201: 
        case 2131690207: 
        case 2131690208: 
            launchAddGiftCardActivity(5);
            return;

        case 2131690209: 
            mGiftCardManager.saveGiftCardList();
            break;
        }
        finish();
    }
}
