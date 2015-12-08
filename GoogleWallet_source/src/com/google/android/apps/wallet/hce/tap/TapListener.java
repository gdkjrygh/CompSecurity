// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;


// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHcePaymentEvent

public interface TapListener
{

    public abstract void notifyOfTap(WalletHcePaymentEvent wallethcepaymentevent);

    public abstract void notifyTapStarted();
}
