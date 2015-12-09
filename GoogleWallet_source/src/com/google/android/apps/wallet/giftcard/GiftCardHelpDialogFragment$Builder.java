// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.os.Bundle;
import com.google.common.collect.Lists;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardHelpDialogFragment

public static final class setPositiveButton extends com.google.android.apps.wallet.ui.dialog.alert.tiveButton
{

    public final setPositiveButton setPrompts(List list)
    {
        getArguments().putParcelableArrayList("prompt_ids", Lists.newArrayList(list));
        return this;
    }

    ()
    {
        super(com/google/android/apps/wallet/giftcard/GiftCardHelpDialogFragment);
        setTitle(com.google.android.apps.walletnfcrel.le).tiveButton(com.google.android.apps.walletnfcrel.er.setPositiveButton);
    }
}
