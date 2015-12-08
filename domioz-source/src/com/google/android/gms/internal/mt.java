// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.k;

// Referenced classes of package com.google.android.gms.internal:
//            mw, mr

final class mt extends k
{

    final MaskedWalletRequest b;
    final int c = 17;
    final mr d;

    mt(mr mr, l l, MaskedWalletRequest maskedwalletrequest)
    {
        d = mr;
        b = maskedwalletrequest;
        super(l);
    }

    protected final void b(h h)
    {
        ((mw)h).a(b, c);
        a(Status.a);
    }
}
