// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.l;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.e;

// Referenced classes of package com.google.android.gms.internal:
//            ms, mu, mt, mv

public final class mr
    implements e
{

    public mr()
    {
    }

    public final void a(l l1)
    {
        l1.a(new ms(this, l1));
    }

    public final void a(l l1, FullWalletRequest fullwalletrequest)
    {
        l1.a(new mu(this, l1, fullwalletrequest));
    }

    public final void a(l l1, MaskedWalletRequest maskedwalletrequest)
    {
        l1.a(new mt(this, l1, maskedwalletrequest));
    }

    public final void a(l l1, String s, String s1)
    {
        l1.a(new mv(this, l1, s, s1));
    }
}
