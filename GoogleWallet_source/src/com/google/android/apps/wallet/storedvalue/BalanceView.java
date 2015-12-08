// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Strings;

public class BalanceView extends RelativeLayout
{

    public BalanceView(Context context)
    {
        this(context, null);
    }

    public BalanceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.balance_view, this, true);
        findViewById(com.google.android.apps.walletnfcrel.R.id.LoadingSpinner).setVisibility(0);
        setAccessibilityDelegate(new android.view.View.AccessibilityDelegate() {

            final BalanceView this$0;

            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilitynodeinfo)
            {
                super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfo);
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append(((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.BalanceAmount)).getText());
                stringbuilder.append(", ");
                stringbuilder.append(((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.BalanceDescription)).getText());
                stringbuilder.append(view.getContext().getString(com.google.android.apps.walletnfcrel.R.string.button_announce_suffix));
                accessibilitynodeinfo.setContentDescription(stringbuilder.toString());
            }

            
            {
                this$0 = BalanceView.this;
                super();
            }
        });
        displaySpinner();
    }

    private void displaySpinner()
    {
        displayStoredValue(null, false);
        findViewById(com.google.android.apps.walletnfcrel.R.id.LoadingSpinner).setVisibility(0);
    }

    public final void displayStoredValue(StoredValueModel storedvaluemodel, boolean flag)
    {
label0:
        {
            TextView textview = null;
            byte byte0 = 8;
            com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue;
            int i;
            boolean flag1;
            boolean flag2;
            int j;
            if (storedvaluemodel != null)
            {
                storedvalue = storedvaluemodel.getStoredValue();
            } else
            {
                storedvalue = null;
            }
            storedvaluemodel = textview;
            if (storedvalue != null)
            {
                storedvaluemodel = storedvalue.balance.displayAmount;
            }
            if (!Strings.isNullOrEmpty(storedvaluemodel))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                storedvaluemodel = getContext().getString(com.google.android.apps.walletnfcrel.R.string.unknown_wallet_balance_amount);
            }
            flag2 = true;
            j = com.google.android.apps.walletnfcrel.R.string.balance_tile_caption;
            if (flag)
            {
                if (i != 0)
                {
                    i = com.google.android.apps.walletnfcrel.R.string.balance_tile_unreliable;
                    flag1 = flag2;
                } else
                {
                    i = com.google.android.apps.walletnfcrel.R.string.balance_tile_error;
                    flag1 = flag2;
                }
            } else
            if (storedvalue != null && Protos.valuesEqual(storedvalue.balanceState, 2))
            {
                flag1 = false;
                i = com.google.android.apps.walletnfcrel.R.string.balance_tile_negative;
            } else
            {
                flag1 = flag2;
                i = j;
                if (storedvalue != null)
                {
                    flag1 = flag2;
                    i = j;
                    if (Protos.valuesEqual(storedvalue.balanceState, 3))
                    {
                        flag1 = true;
                        i = com.google.android.apps.walletnfcrel.R.string.balance_tile_negative;
                    }
                }
            }
            textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.BalanceAmount);
            if (storedvalue == null && !flag)
            {
                textview.setText(CurrencyUtil.microsToDisplayableMoney(0L, CurrencyUtil.getLegalAddressCurrency()));
                i = com.google.android.apps.walletnfcrel.R.string.wallet_balance_no_kyc;
            } else
            {
                textview.setText(storedvaluemodel);
            }
            ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.BalanceDescription)).setText(getContext().getString(i));
            findViewById(com.google.android.apps.walletnfcrel.R.id.LoadingSpinner).setVisibility(8);
            storedvaluemodel = (ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ErrorImage);
            if (!flag1)
            {
                storedvaluemodel.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_error_color_24dp);
            } else
            {
                storedvaluemodel.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_warning_color_24dp);
            }
            if (!flag)
            {
                i = byte0;
                if (flag1)
                {
                    break label0;
                }
            }
            i = 0;
        }
        storedvaluemodel.setVisibility(i);
    }
}
