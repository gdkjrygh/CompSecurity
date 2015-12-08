// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.content.DialogInterface;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;

public class AddGiftCardWarningDialogFragment extends AlertDialogFragment
{
    public static final class Builder extends com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder
    {

        Builder()
        {
            super(com/google/android/apps/wallet/giftcard/AddGiftCardWarningDialogFragment);
            setTitle(com.google.android.apps.walletnfcrel.R.string.gift_cards_keep_physical_card_dialog_title).setMessage(com.google.android.apps.walletnfcrel.R.string.gift_cards_keep_physical_card_dialog_message);
        }
    }


    private com.google.android.apps.wallet.wobs.add.EditCardInfoFragment.EditCardInfoCallback editCardInfoCallback;

    public AddGiftCardWarningDialogFragment()
    {
    }

    public static Builder newBuilder()
    {
        return new Builder();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        editCardInfoCallback.onCardInfoComplete();
    }

    public final void setEditCardInfoCallback(com.google.android.apps.wallet.wobs.add.EditCardInfoFragment.EditCardInfoCallback editcardinfocallback)
    {
        editCardInfoCallback = editcardinfocallback;
    }
}
