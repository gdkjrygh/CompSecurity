// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment

static class akn extends com.google.android.gms.internal.ment.a
{

    private StateChangedListener akm;
    private final SupportWalletFragment akn;

    public void a(int i, int j, Bundle bundle)
    {
        if (akm != null)
        {
            akm.onStateChanged(akn, i, j, bundle);
        }
    }

    public void a(StateChangedListener statechangedlistener)
    {
        akm = statechangedlistener;
    }

    StateChangedListener(SupportWalletFragment supportwalletfragment)
    {
        akn = supportwalletfragment;
    }
}
