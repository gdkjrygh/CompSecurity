// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzqv, zzqu

public interface zzqs
    extends IInterface
{

    public abstract void a(Bundle bundle);

    public abstract void a(Bundle bundle, zzqv zzqv);

    public abstract void a(CreateWalletObjectsRequest createwalletobjectsrequest, Bundle bundle, zzqv zzqv);

    public abstract void a(FullWalletRequest fullwalletrequest, Bundle bundle, zzqv zzqv);

    public abstract void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, zzqu zzqu);

    public abstract void a(MaskedWalletRequest maskedwalletrequest, Bundle bundle, zzqv zzqv);

    public abstract void a(NotifyTransactionStatusRequest notifytransactionstatusrequest, Bundle bundle);

    public abstract void a(GetBuyFlowInitializationTokenRequest getbuyflowinitializationtokenrequest, Bundle bundle, zzqv zzqv);

    public abstract void a(GetInstrumentsRequest getinstrumentsrequest, Bundle bundle, zzqv zzqv);

    public abstract void a(String s, String s1, Bundle bundle, zzqv zzqv);

    public abstract void b(Bundle bundle);

    public abstract void b(Bundle bundle, zzqv zzqv);
}
