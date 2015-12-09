// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragment

static final class aUY extends com.google.android.gms.internal.ment.a
{

    private StateChangedListener aUX;
    private final WalletFragment aUY;

    public final void a(int i, int j, Bundle bundle)
    {
        if (aUX != null)
        {
            bundle = aUX;
            bundle = aUY;
        }
    }

    StateChangedListener(WalletFragment walletfragment)
    {
        aUY = walletfragment;
    }
}
