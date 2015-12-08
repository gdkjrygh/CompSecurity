// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.FirstPartyWallet;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResult;

// Referenced classes of package com.google.android.gms.internal:
//            xn

public final class xp
    implements FirstPartyWallet
{

    public xp()
    {
    }

    public final PendingResult getInstruments(GoogleApiClient googleapiclient, GetInstrumentsRequest getinstrumentsrequest)
    {
        return googleapiclient.a(new com.google.android.gms.wallet.Wallet.a(googleapiclient, getinstrumentsrequest) {

            final GetInstrumentsRequest aVr;
            final xp aVs;

            private void a(xn xn1)
            {
                xn1.a(aVr, this);
            }

            private static GetInstrumentsResult bW(Status status)
            {
                return new GetInstrumentsResult(status, GetInstrumentsResponse.newBuilder().setInstrumentIds(new String[0]).setPaymentInstruments(new byte[0][]).build());
            }

            protected final volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((xn)a1);
            }

            protected final Result b(Status status)
            {
                return bW(status);
            }

            
            {
                aVs = xp.this;
                aVr = getinstrumentsrequest;
                super(googleapiclient);
            }
        });
    }
}
