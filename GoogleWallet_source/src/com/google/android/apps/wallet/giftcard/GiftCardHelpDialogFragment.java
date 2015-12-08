// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class GiftCardHelpDialogFragment extends AlertDialogFragment
{
    public static final class Builder extends com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder
    {

        public final Builder setPrompts(List list)
        {
            getArguments().putParcelableArrayList("prompt_ids", Lists.newArrayList(list));
            return this;
        }

        Builder()
        {
            super(com/google/android/apps/wallet/giftcard/GiftCardHelpDialogFragment);
            setTitle(com.google.android.apps.walletnfcrel.R.string.gift_cards_help_dialog_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok_got_it);
        }
    }


    public GiftCardHelpDialogFragment()
    {
    }

    private static void addSection(LayoutInflater layoutinflater, LinearLayout linearlayout, String s, int i)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.gift_cards_help_dialog_section, null);
        ((TextView)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.SectionTitle)).setText(s);
        ((TextView)layoutinflater.findViewById(com.google.android.apps.walletnfcrel.R.id.SectionDescription)).setText(i);
        linearlayout.addView(layoutinflater);
    }

    public static Builder newBuilder()
    {
        return new Builder();
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        super.configureAlertDialog(builder);
        Object obj = getArguments().getParcelableArrayList("prompt_ids");
        LayoutInflater layoutinflater = getActivity().getLayoutInflater();
        View view = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.gift_cards_help_dialog, null);
        builder.setView(view);
        builder = (LinearLayout)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.HelpSectionsContainer);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            UserDataPrompt userdataprompt = (UserDataPrompt)((Iterator) (obj)).next();
            switch (Protos.valueWithDefault(userdataprompt.getId(), 0))
            {
            case -1: 
                addSection(layoutinflater, builder, Protos.valueWithDefault(userdataprompt.getLabel(), getString(com.google.android.apps.walletnfcrel.R.string.gift_cards_help_number_heading)), com.google.android.apps.walletnfcrel.R.string.gift_cards_help_number_text);
                break;

            case 2: // '\002'
                addSection(layoutinflater, builder, Protos.valueWithDefault(userdataprompt.getLabel(), getString(com.google.android.apps.walletnfcrel.R.string.gift_cards_help_pin_heading)), com.google.android.apps.walletnfcrel.R.string.gift_cards_help_pin_text);
                break;

            case 3: // '\003'
                addSection(layoutinflater, builder, Protos.valueWithDefault(userdataprompt.getLabel(), getString(com.google.android.apps.walletnfcrel.R.string.gift_cards_help_event_number_heading)), com.google.android.apps.walletnfcrel.R.string.gift_cards_help_event_number_text);
                break;
            }
        } while (true);
    }
}
