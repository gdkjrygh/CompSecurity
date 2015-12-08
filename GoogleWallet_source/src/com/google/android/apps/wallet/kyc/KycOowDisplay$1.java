// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.view.View;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycOowDisplay

final class val.index
    implements android.view.ener
{

    final KycOowDisplay this$0;
    final int val$index;

    public final void onClick(View view)
    {
        setSelectedAnswerIndex(val$index);
        if (KycOowDisplay.access$000(KycOowDisplay.this) != null)
        {
            KycOowDisplay.access$000(KycOowDisplay.this).onAction(Integer.valueOf(val$index));
        }
    }

    Listener()
    {
        this$0 = final_kycoowdisplay;
        val$index = I.this;
        super();
    }
}
