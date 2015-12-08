// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.QuitIntent;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            TosAcceptanceCheckFilter, NetworkAccessPrompter

final class this._cls0
    implements android.content.ener
{

    final TosAcceptanceCheckFilter this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -2 -1: default 24
    //                   -2 68
    //                   -1 25;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        TosAcceptanceCheckFilter.access$000(TosAcceptanceCheckFilter.this).sendButtonTap("AcceptTermsOfService", new AnalyticsCustomDimension[0]);
        if (TosAcceptanceCheckFilter.access$100(TosAcceptanceCheckFilter.this).checkIfNetworkAvailableAndPromptIfNot(ceptTosResult.NO_NETWORK.getTitleId()))
        {
            TosAcceptanceCheckFilter.access$200(TosAcceptanceCheckFilter.this);
            return;
        }
          goto _L1
_L2:
        TosAcceptanceCheckFilter.access$300(TosAcceptanceCheckFilter.this).startActivity(QuitIntent.create());
        return;
    }

    ceptTosResult()
    {
        this$0 = TosAcceptanceCheckFilter.this;
        super();
    }
}
