// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.common.base.Optional;
import dagger.Lazy;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            TosAcceptanceCheckFilter, TosAcceptanceOracle

final class this._cls0
    implements Callable
{

    final TosAcceptanceCheckFilter this$0;

    private Optional call()
        throws Exception
    {
        return ((TosAcceptanceOracle)TosAcceptanceCheckFilter.access$400(TosAcceptanceCheckFilter.this).get()).lookupLegalDocumentToAccept();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    I()
    {
        this$0 = TosAcceptanceCheckFilter.this;
        super();
    }
}
