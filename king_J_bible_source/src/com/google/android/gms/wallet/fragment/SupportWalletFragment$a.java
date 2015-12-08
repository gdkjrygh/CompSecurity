// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment

static class acE extends com.google.android.gms.internal.ment.a
{

    private StateChangedListener acD;
    private final SupportWalletFragment acE;

    public void a(int i, int j, Bundle bundle)
    {
        if (acD != null)
        {
            acD.onStateChanged(acE, i, j, bundle);
        }
    }

    public void a(StateChangedListener statechangedlistener)
    {
        acD = statechangedlistener;
    }

    StateChangedListener(SupportWalletFragment supportwalletfragment)
    {
        acE = supportwalletfragment;
    }
}
