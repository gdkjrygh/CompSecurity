// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.util.view.Views;

public class HowToPurchaseSynopsisActivity extends WalletActivity
{
    static final class Step
    {

        final int content;
        final int contentDescription;
        final int header;
        final int image;

        Step(int i, int j, int k)
        {
            this(i, j, k, 0);
        }

        Step(int i, int j, int k, int l)
        {
            header = i;
            content = j;
            image = k;
            contentDescription = l;
        }
    }


    private static final Step FINISHED;
    private static final Step LOOK_FOR_SYMBOL;
    private static final Step PAYMENT_TYPE_SELECTION;
    private static final Step STEPS[];
    private static final Step TAP;
    private static final Step WAKE_UP_DEVICE;
    private static final Step WALLET_PIN;
    FeatureManager featureManager;

    public HowToPurchaseSynopsisActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void createRow(ViewGroup viewgroup, int i, int j, int k, int l)
    {
        ViewGroup viewgroup1 = (ViewGroup)getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.help_topic_how_to_purchase_synopsis_row, viewgroup, false);
        ((TextView)Views.findViewById(viewgroup1, com.google.android.apps.walletnfcrel.R.id.Header)).setText(i);
        ((TextView)Views.findViewById(viewgroup1, com.google.android.apps.walletnfcrel.R.id.Content)).setText(j);
        ((ImageView)Views.findViewById(viewgroup1, com.google.android.apps.walletnfcrel.R.id.Image)).setImageResource(k);
        if (l != 0)
        {
            ((ImageView)Views.findViewById(viewgroup1, com.google.android.apps.walletnfcrel.R.id.Image)).setContentDescription(getString(l));
        }
        viewgroup.addView(viewgroup1);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.help_topic_how_to_tap_and_pay_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.help_topic_how_to_purchase_synopsis);
        bundle = (ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.HowToPurchaseNfc);
        Step astep[] = STEPS;
        int j = astep.length;
        for (int i = 0; i < j; i++)
        {
            Step step = astep[i];
            createRow(bundle, step.header, step.content, step.image, step.contentDescription);
        }

    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onUpPressed()
    {
        finish();
    }

    static 
    {
        LOOK_FOR_SYMBOL = new Step(com.google.android.apps.walletnfcrel.R.string.how_to_purchase_look_for_symbol_header, com.google.android.apps.walletnfcrel.R.string.how_to_purchase_look_for_symbol_content, com.google.android.apps.walletnfcrel.R.drawable.help_guide0_color_128dp, com.google.android.apps.walletnfcrel.R.string.how_to_purchase_look_for_symbol_content_description);
        WAKE_UP_DEVICE = new Step(com.google.android.apps.walletnfcrel.R.string.how_to_purchase_wake_up_device_header, com.google.android.apps.walletnfcrel.R.string.how_to_purchase_wake_up_device_content, com.google.android.apps.walletnfcrel.R.drawable.help_guide1_color_128dp);
        PAYMENT_TYPE_SELECTION = new Step(com.google.android.apps.walletnfcrel.R.string.how_to_purchase_payment_type_selection_header, com.google.android.apps.walletnfcrel.R.string.how_to_purchase_payment_type_selection_content, com.google.android.apps.walletnfcrel.R.drawable.help_guide2_color_128dp);
        TAP = new Step(com.google.android.apps.walletnfcrel.R.string.how_to_purchase_tap_header, com.google.android.apps.walletnfcrel.R.string.how_to_purchase_tap_content, com.google.android.apps.walletnfcrel.R.drawable.help_guide3_color_128dp);
        WALLET_PIN = new Step(com.google.android.apps.walletnfcrel.R.string.how_to_purchase_wallet_pin_header, com.google.android.apps.walletnfcrel.R.string.how_to_purchase_wallet_pin_content, com.google.android.apps.walletnfcrel.R.drawable.help_guide4_color_128dp);
        FINISHED = new Step(com.google.android.apps.walletnfcrel.R.string.how_to_purchase_finished_header, com.google.android.apps.walletnfcrel.R.string.how_to_purchase_finished_content, com.google.android.apps.walletnfcrel.R.drawable.help_guide5_color_128dp);
        STEPS = (new Step[] {
            LOOK_FOR_SYMBOL, WAKE_UP_DEVICE, TAP, PAYMENT_TYPE_SELECTION, WALLET_PIN, FINISHED
        });
    }
}
