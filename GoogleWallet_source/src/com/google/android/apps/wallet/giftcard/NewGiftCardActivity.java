// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.support.v4.app.Fragment;
import com.google.android.apps.wallet.wobs.add.NewProgramCardActivity;
import com.google.android.apps.wallet.wobs.add.ProgramCardsAnalyticsProperties;
import com.google.android.apps.wallet.wobs.add.ProgramCardsHandler;
import com.google.android.apps.wallet.wobs.add.ProgramCardsUiProperties;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardsUiProperties, GiftCardsAnalyticsProperties, AddGiftCardWarningDialogFragment, GiftCardsHandler

public class NewGiftCardActivity extends NewProgramCardActivity
{

    private final GiftCardsAnalyticsProperties analyticsProperties = new GiftCardsAnalyticsProperties();
    GiftCardsHandler giftCardsHandler;
    private final GiftCardsUiProperties uiProperties = new GiftCardsUiProperties();

    public NewGiftCardActivity()
    {
    }

    private GiftCardsUiProperties getUiProperties()
    {
        return uiProperties;
    }

    public final ProgramCardsAnalyticsProperties getAnalyticsProperties()
    {
        return analyticsProperties;
    }

    public final ProgramCardsHandler getProgramCardsHandler()
    {
        return giftCardsHandler;
    }

    public final volatile ProgramCardsUiProperties getUiProperties()
    {
        return getUiProperties();
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (fragment instanceof AddGiftCardWarningDialogFragment)
        {
            ((AddGiftCardWarningDialogFragment)fragment).setEditCardInfoCallback(this);
        }
    }
}
