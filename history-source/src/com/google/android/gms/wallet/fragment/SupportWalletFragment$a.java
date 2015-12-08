// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment

static class awk extends com.google.android.gms.internal.ment.a
{

    private StateChangedListener awj;
    private final SupportWalletFragment awk;

    public void a(int i, int j, Bundle bundle)
    {
        if (awj != null)
        {
            awj.onStateChanged(awk, i, j, bundle);
        }
    }

    public void a(StateChangedListener statechangedlistener)
    {
        awj = statechangedlistener;
    }

    StateChangedListener(SupportWalletFragment supportwalletfragment)
    {
        awk = supportwalletfragment;
    }
}
