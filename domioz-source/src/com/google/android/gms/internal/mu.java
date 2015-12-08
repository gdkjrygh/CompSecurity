// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.k;

// Referenced classes of package com.google.android.gms.internal:
//            mw, mr

final class mu extends k
{

    final FullWalletRequest b;
    final int c = 20;
    final mr d;

    mu(mr mr, l l, FullWalletRequest fullwalletrequest)
    {
        d = mr;
        b = fullwalletrequest;
        super(l);
    }

    protected final void b(h h)
    {
        ((mw)h).a(b, c);
        a(Status.a);
    }
}
