// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.p2p.api.Contact;

public class TransferApi
{

    private final UriRegistry uriRegistry;

    TransferApi(UriRegistry uriregistry)
    {
        uriRegistry = uriregistry;
    }

    public static Intent createConfirmMoneyTransferIntent(Context context, int i, long l, String s, Contact contact, String s1)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.transfer.ConfirmMoneyTransferActivity").putExtra("type", i).putExtra("amount", l).putExtra("currency", s).putExtra("contact", contact).putExtra("memo", s1);
    }

    public static Intent createConfirmMoneyTransferIntentWithRequestId(Context context, int i, long l, String s, Contact contact, String s1, String s2)
    {
        return createConfirmMoneyTransferIntent(context, i, l, s, contact, s1).putExtra("money_request_id", s2);
    }

    public static Intent createSettleRequestIntent(Context context, String s, long l, String s1, String s2, Contact contact, FeatureManager featuremanager)
    {
        return InternalIntents.forClass(context, sendMoneyActivityName(featuremanager)).putExtra("contact", contact).putExtra("money_request_id", s).putExtra("amount", l).putExtra("currency", s1).putExtra("memo", s2);
    }

    public static String sendMoneyActivityName(FeatureManager featuremanager)
    {
        return "com.google.android.apps.wallet.p2p.SendMoneyActivity";
    }

    public final Intent createIncomingMoneyRequestListIntent()
    {
        return uriRegistry.createIntent(4006, new Object[0]);
    }
}
