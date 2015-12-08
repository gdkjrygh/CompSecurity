// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toast;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.wobs.add.NewProgramCardActivity;
import com.google.android.apps.wallet.wobs.add.ProgramCardsAnalyticsProperties;
import com.google.android.apps.wallet.wobs.add.ProgramCardsHandler;
import com.google.android.apps.wallet.wobs.add.ProgramCardsUiProperties;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyCardsUiProperties, LoyaltyCardsAnalyticsProperties, LoyaltyCardInfo, LoyaltyCardsHandler

public class NewLoyaltyCardActivity extends NewProgramCardActivity
{

    private final LoyaltyCardsAnalyticsProperties analyticsProperties = new LoyaltyCardsAnalyticsProperties();
    LoyaltyCardsHandler loyaltyCardsHandler;
    private final LoyaltyCardsUiProperties uiProperties = new LoyaltyCardsUiProperties();

    public NewLoyaltyCardActivity()
    {
    }

    private void extractBarcode(Intent intent)
    {
        intent = intent.getParcelableArrayListExtra("extra_scan_barcode_result");
        if (intent != null)
        {
            intent = com.google.android.apps.wallet.wobs.add.OcrResults.OcrResultsExtractor.extractOcrResults(intent);
            loyaltyCardsHandler.loadMemberIdAndBarcodeFromOcrResults((LoyaltyCardInfo)cardInfo, intent);
        }
    }

    private LoyaltyCardsUiProperties getUiProperties()
    {
        return uiProperties;
    }

    protected final void doOnCreate(Bundle bundle)
    {
        super.doOnCreate(bundle);
        analyticsProperties.setIsSignup(isSignup());
    }

    public final ProgramCardsAnalyticsProperties getAnalyticsProperties()
    {
        return analyticsProperties;
    }

    public final ProgramCardsHandler getProgramCardsHandler()
    {
        return loyaltyCardsHandler;
    }

    public final volatile ProgramCardsUiProperties getUiProperties()
    {
        return getUiProperties();
    }

    public final boolean isMerchantNameEditable()
    {
        return !getIntent().hasExtra("extra_discoverable_id");
    }

    final boolean isSignup()
    {
        Preconditions.checkArgument(getIntent().hasExtra("is_signup"), "Extra \"is_signup\" is required");
        return getIntent().getExtras().getBoolean("is_signup");
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1337)
        {
            switch (j)
            {
            default:
                Toast.makeText(this, com.google.android.apps.walletnfcrel.R.string.loyalty_barcode_format_unsupported_message, 0).show();
                // fall through

            case 0: // '\0'
            case 10007: 
                return;

            case -1: 
                extractBarcode(intent);
                break;
            }
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("TAG_FOR_OTHER_USER_DIALOG".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final NewLoyaltyCardActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    boolean flag;
                    if (i == -1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    loyaltyCardsHandler.setIsForOtherUser(flag, (LoyaltyCardInfo)cardInfo);
                    onCardInfoComplete();
                }

            
            {
                this$0 = NewLoyaltyCardActivity.this;
                super();
            }
            });
        }
    }
}
