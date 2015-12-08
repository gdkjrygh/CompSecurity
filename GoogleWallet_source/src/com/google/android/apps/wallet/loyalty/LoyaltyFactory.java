// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.wallet.wobs.add.SharedDataPromptConverter;
import com.google.android.apps.wallet.wobs.add.UserDataPrompt;
import com.google.common.collect.ImmutableList;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyProgram

public class LoyaltyFactory
{

    private final Context context;

    LoyaltyFactory(Activity activity)
    {
        context = activity;
    }

    public static UserDataPrompt createBarcodePrompt()
    {
        return createUserDataPrompt(-8, Integer.valueOf(1001), "", false);
    }

    static UserDataPrompt createLocalMemberIdPrompt(Integer integer, String s)
    {
        return createUserDataPrompt(-1, integer, s, true);
    }

    private static UserDataPrompt createUserDataPrompt(int i, Integer integer, String s, String s1, boolean flag)
    {
        com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataPrompt shareddataprompt = new com.google.wallet.proto.api.NanoWalletLoyalty.SharedDataPrompt();
        shareddataprompt.sharedDataId = Integer.valueOf(i);
        shareddataprompt.inputTypeNumber = integer;
        shareddataprompt.label = s;
        shareddataprompt.modifiableByUser = Boolean.valueOf(true);
        shareddataprompt.prefilledValue = s1;
        shareddataprompt.isRequired = Boolean.valueOf(flag);
        return SharedDataPromptConverter.convert(shareddataprompt);
    }

    private static UserDataPrompt createUserDataPrompt(int i, Integer integer, String s, boolean flag)
    {
        return createUserDataPrompt(i, integer, s, null, flag);
    }

    final LoyaltyProgram createAdhocFormProgram()
    {
        return new LoyaltyProgram(null, ImmutableList.of(createLocalMemberIdPrompt(Integer.valueOf(1001), context.getString(com.google.android.apps.walletnfcrel.R.string.loyalty_membership_id_hint)), createBarcodePrompt(), createUserDataPrompt(-7, Integer.valueOf(1001), context.getString(com.google.android.apps.walletnfcrel.R.string.loyalty_merchant_name_hint), true), createUserDataPrompt(-9, Integer.valueOf(1001), context.getString(com.google.android.apps.walletnfcrel.R.string.loyalty_program_name_hint), false), createUserDataPrompt(-6, Integer.valueOf(1001), null, true)));
    }
}
