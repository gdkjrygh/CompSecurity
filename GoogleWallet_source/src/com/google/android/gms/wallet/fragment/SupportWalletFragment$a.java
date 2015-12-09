// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            SupportWalletFragment

static final class aUQ extends com.google.android.gms.internal.ment.a
{

    private StateChangedListener aUP;
    private final SupportWalletFragment aUQ;

    public final void a(int i, int j, Bundle bundle)
    {
        if (aUP != null)
        {
            bundle = aUP;
            bundle = aUQ;
        }
    }

    StateChangedListener(SupportWalletFragment supportwalletfragment)
    {
        aUQ = supportwalletfragment;
    }
}
