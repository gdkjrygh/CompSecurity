// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.network.NetworkInformationProvider;
import dagger.Lazy;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            TosAcceptanceCheckFilter, TosAcceptanceOracle

final class this._cls0
    implements Callable
{

    final TosAcceptanceCheckFilter this$0;

    private ceptTosResult call()
        throws Exception
    {
        ceptTosResult cepttosresult;
        if (!TosAcceptanceCheckFilter.access$600(TosAcceptanceCheckFilter.this).hasNetworkAccess())
        {
            cepttosresult = ceptTosResult.NO_NETWORK;
        } else
        {
            ceptTosResult cepttosresult1 = TosAcceptanceCheckFilter.access$700(TosAcceptanceCheckFilter.this);
            cepttosresult = cepttosresult1;
            if (cepttosresult1 == ceptTosResult.SUCCESS)
            {
                ((TosAcceptanceOracle)TosAcceptanceCheckFilter.access$400(TosAcceptanceCheckFilter.this).get()).setLocalAcceptedTosState(TosAcceptanceCheckFilter.access$800(TosAcceptanceCheckFilter.this));
                return cepttosresult1;
            }
        }
        return cepttosresult;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ceptTosResult()
    {
        this$0 = TosAcceptanceCheckFilter.this;
        super();
    }
}
