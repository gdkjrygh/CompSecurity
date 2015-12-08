// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment

static class aua extends com.google.android.gms.internal.ment.a
{

    private StateChangedListener atZ;
    private final SupportWalletFragment aua;

    public void a(int i, int j, Bundle bundle)
    {
        if (atZ != null)
        {
            atZ.onStateChanged(aua, i, j, bundle);
        }
    }

    public void a(StateChangedListener statechangedlistener)
    {
        atZ = statechangedlistener;
    }

    StateChangedListener(SupportWalletFragment supportwalletfragment)
    {
        aua = supportwalletfragment;
    }
}
