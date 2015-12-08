// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.content.Context;
import com.google.android.apps.wallet.wobs.add.LinkPromptConverter;
import com.google.android.apps.wallet.wobs.add.Program;
import com.google.common.base.Preconditions;
import java.util.List;

public final class GiftCardProgram
    implements Program
{

    private final com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard discoverable;
    private final List prompts;

    public GiftCardProgram(Context context, com.google.wallet.proto.api.NanoWalletGiftCards.GiftCardForm giftcardform)
    {
        discoverable = giftcardform.discoverable;
        prompts = LinkPromptConverter.convert(giftcardform.form.linkPrompts, context);
    }

    public final com.google.wallet.proto.api.NanoWalletGiftCards.DiscoverableGiftCard getDiscoverable()
    {
        return discoverable;
    }

    public final String getLogoImageUrl()
    {
        Preconditions.checkNotNull(discoverable);
        return discoverable.nativeRenderingInfo.logoImageUrl;
    }

    public final String getMerchantName()
    {
        Preconditions.checkNotNull(discoverable);
        return discoverable.nativeRenderingInfo.merchantName;
    }

    public final String getProgramName()
    {
        return null;
    }

    public final List getPrompts()
    {
        return prompts;
    }
}
