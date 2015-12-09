// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;


// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycOowFragment, KycOowDisplay

final class val.selectedIndex
    implements Runnable
{

    final KycOowFragment this$0;
    final int val$selectedIndex;

    public final void run()
    {
        display.setSelectedAnswerIndex(val$selectedIndex);
    }

    _cls9()
    {
        this$0 = final_kycoowfragment;
        val$selectedIndex = I.this;
        super();
    }
}
