// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;


// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            EditCardInfoFragment, ProgramCardInfo, ProgramCardsHandler, ProgramCardsUiProperties

public static interface 
{

    public abstract ProgramCardInfo getCardInfo();

    public abstract ProgramCardsHandler getProgramCardsHandler();

    public abstract ProgramCardsUiProperties getUiProperties();

    public abstract boolean hasImageCaptureActivity();

    public abstract void intentToImageCapture(int i);

    public abstract boolean isMerchantNameEditable();

    public abstract void onCardInfoComplete();

    public abstract void onEditMerchantNameIconClicked();

    public abstract void onSaveRequested();

    public abstract void onValidationError();
}
