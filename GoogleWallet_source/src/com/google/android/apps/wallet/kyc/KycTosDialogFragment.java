// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;

public class KycTosDialogFragment extends AlertDialogFragment
{

    AppControl appControl;
    private com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument esignLegalDocument;
    private com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument walletLegalDocument;

    public KycTosDialogFragment()
    {
        super(newBuilder().setPositiveButton(com.google.android.apps.walletnfcrel.R.string.tosv2_button_i_accept).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.kyc_tos_button_cancel).setTitle(com.google.android.apps.walletnfcrel.R.string.kyc_tos_title).setCancelable(false));
    }

    private String getEsignTosText()
    {
        return getActivity().getString(com.google.android.apps.walletnfcrel.R.string.kyc_esign_tos, new Object[] {
            esignLegalDocument.documentUrl
        });
    }

    private String getWalletTosText()
    {
        FragmentActivity fragmentactivity = getActivity();
        int i = com.google.android.apps.walletnfcrel.R.string.tosv2_detail_for_plastic_card;
        String s1 = walletLegalDocument.documentUrl;
        String s;
        if (walletLegalDocument.privacyNoticeUrl != null)
        {
            s = walletLegalDocument.privacyNoticeUrl;
        } else
        {
            s = appControl.getString(AppControlKey.TOS_V2_LATEST_PRIVACY_URL);
        }
        return fragmentactivity.getString(i, new Object[] {
            s1, s
        });
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        super.configureAlertDialog(builder);
        Object obj = LayoutInflater.from(getActivity()).inflate(com.google.android.apps.walletnfcrel.R.layout.kyc_accept_tos_dialog, null);
        builder.setView(((android.view.View) (obj)));
        builder = (TextView)Views.findViewById(((android.view.View) (obj)), com.google.android.apps.walletnfcrel.R.id.KycEsignTos);
        obj = (TextView)Views.findViewById(((android.view.View) (obj)), com.google.android.apps.walletnfcrel.R.id.KycWalletTos);
        Views.setLink(builder, getEsignTosText());
        Views.setLink(((TextView) (obj)), getWalletTosText());
    }

    public final void onPause()
    {
        super.onPause();
        dismiss();
    }

    public final void setLegalDocuments(com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestlegaldocument, com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestlegaldocument1)
    {
        walletLegalDocument = latestlegaldocument;
        esignLegalDocument = latestlegaldocument1;
    }
}
