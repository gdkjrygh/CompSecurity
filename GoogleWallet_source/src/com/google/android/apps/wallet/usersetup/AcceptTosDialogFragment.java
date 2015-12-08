// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class AcceptTosDialogFragment extends AlertDialogFragment
{

    AppControl mAppControl;
    private com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument mLatestLegalDocument;

    public AcceptTosDialogFragment()
    {
        super(newBuilder().setPositiveButton(com.google.android.apps.walletnfcrel.R.string.tosv2_button_i_accept).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.tosv2_button_dismiss).setTitle(com.google.android.apps.walletnfcrel.R.string.tosv2_title).setCancelable(false));
    }

    private static String getTosText(Context context, com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestlegaldocument, AppControl appcontrol)
    {
        int i = com.google.android.apps.walletnfcrel.R.string.tosv2_detail_for_plastic_card;
        String s = latestlegaldocument.documentUrl;
        if (latestlegaldocument.privacyNoticeUrl != null)
        {
            latestlegaldocument = latestlegaldocument.privacyNoticeUrl;
        } else
        {
            latestlegaldocument = appcontrol.getString(AppControlKey.TOS_V2_LATEST_PRIVACY_URL);
        }
        return context.getString(i, new Object[] {
            s, latestlegaldocument
        });
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        super.configureAlertDialog(builder);
        TextView textview = (TextView)LayoutInflater.from(getActivity()).inflate(com.google.android.apps.walletnfcrel.R.layout.accept_tos_dialog, null);
        Views.setLink(textview, getTosText(getActivity(), mLatestLegalDocument, mAppControl));
        builder.setView(textview);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        try
        {
            if (getArguments().containsKey("latest_legal_document"))
            {
                mLatestLegalDocument = (com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument(), getArguments().getByteArray("latest_legal_document"));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new IllegalStateException("Latest legal document is not a valid proto");
        }
    }

    protected final void setLatestLegalDocument(com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestlegaldocument)
    {
        mLatestLegalDocument = latestlegaldocument;
        getArguments().putByteArray("latest_legal_document", MessageNano.toByteArray(mLatestLegalDocument));
    }
}
