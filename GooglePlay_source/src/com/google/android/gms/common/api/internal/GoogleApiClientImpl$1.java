// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientImpl

final class this._cls0
    implements sultConsumedCallback
{

    final GoogleApiClientImpl this$0;

    public final void onConsumed(nner nner)
    {
        mUnconsumedRunners.remove(nner);
        nner.getResultId();
    }

    nner()
    {
        this$0 = GoogleApiClientImpl.this;
        super();
    }
}
