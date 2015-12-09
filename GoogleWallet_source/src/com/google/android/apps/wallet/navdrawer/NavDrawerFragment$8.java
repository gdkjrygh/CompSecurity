// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

final class this._cls0
    implements ResultCallback
{

    final NavDrawerFragment this$0;

    private void onResult(com.google.android.gms.people.lt lt)
    {
        onOwnersLoaded(lt.getStatus(), lt.getOwners());
    }

    public final volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.people.lt)result);
    }

    ()
    {
        this$0 = NavDrawerFragment.this;
        super();
    }
}
