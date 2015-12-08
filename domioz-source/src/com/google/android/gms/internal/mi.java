// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            mo, zzvx, ml

public interface mi
    extends IInterface
{

    public abstract void a(Bundle bundle);

    public abstract void a(Bundle bundle, mo mo);

    public abstract void a(zzvx zzvx, Bundle bundle, mo mo);

    public abstract void a(FullWalletRequest fullwalletrequest, Bundle bundle, mo mo);

    public abstract void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, ml ml);

    public abstract void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, mo mo);

    public abstract void a(NotifyTransactionStatusRequest notifytransactionstatusrequest, Bundle bundle);

    public abstract void a(zzd zzd, Bundle bundle, mo mo);

    public abstract void a(String s, String s1, Bundle bundle, mo mo);

    public abstract void b(Bundle bundle);

    public abstract void b(Bundle bundle, mo mo);
}
