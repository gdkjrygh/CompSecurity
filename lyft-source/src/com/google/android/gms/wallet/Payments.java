// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, MaskedWalletRequest

public interface Payments
{

    public abstract void a(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, int i);

    public abstract void a(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, int i);
}
