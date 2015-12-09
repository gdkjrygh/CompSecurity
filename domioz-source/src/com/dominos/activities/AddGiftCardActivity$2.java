// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.controllers.GiftCardController;

// Referenced classes of package com.dominos.activities:
//            AddGiftCardActivity

class ctionCallback extends com.dominos.utils.lertActionCallback
{

    final AddGiftCardActivity this$0;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        AddGiftCardActivity.access$000(AddGiftCardActivity.this).deleteGiftCard(editGiftCard);
    }

    ctionCallback()
    {
        this$0 = AddGiftCardActivity.this;
        super();
    }
}
