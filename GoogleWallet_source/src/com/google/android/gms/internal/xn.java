// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResult;

// Referenced classes of package com.google.android.gms.internal:
//            kb, kj, xg

public final class xn extends kb
{
    static class a extends xj.a
    {

        public final void a(int i, FullWallet fullwallet, Bundle bundle)
        {
        }

        public final void a(int i, MaskedWallet maskedwallet, Bundle bundle)
        {
        }

        public final void a(int i, boolean flag, Bundle bundle)
        {
        }

        public void a(Status status, GetInstrumentsResponse getinstrumentsresponse, Bundle bundle)
        {
        }

        public final void k(int i, Bundle bundle)
        {
        }

        private a()
        {
        }

    }

    static final class b extends a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Fm;

        public final void a(Status status, GetInstrumentsResponse getinstrumentsresponse, Bundle bundle)
        {
            Fm.d(new GetInstrumentsResult(status, getinstrumentsresponse));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Fm = b1;
        }
    }


    private final String Fl;
    private final int aUz;
    private final Activity mActivity;
    private final int mTheme;

    public xn(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, int i, String s, int j)
    {
        super(activity, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        mActivity = activity;
        aUz = i;
        Fl = s;
        mTheme = j;
    }

    private static Bundle a(int i, String s, String s1, int j)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putString("androidPackageName", s);
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(s1, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", j);
        return bundle;
    }

    private static xg ep(IBinder ibinder)
    {
        return xg.a.el(ibinder);
    }

    private Bundle uX()
    {
        return a(aUz, mActivity.getPackageName(), Fl, mTheme);
    }

    protected final void a(kj kj1, kb.e e)
        throws RemoteException
    {
        kj1.k(e, 0x648278, getContext().getPackageName());
    }

    public final void a(GetInstrumentsRequest getinstrumentsrequest, com.google.android.gms.common.api.BaseImplementation.b b1)
    {
        b1 = new b(b1);
        Bundle bundle = uX();
        try
        {
            ((xg)iP()).a(getinstrumentsrequest, bundle, b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GetInstrumentsRequest getinstrumentsrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting instruments", getinstrumentsrequest);
        }
        getinstrumentsrequest = GetInstrumentsResponse.newBuilder().setInstrumentIds(new String[0]).setPaymentInstruments(new byte[0][]).build();
        b1.a(Status.Tj, getinstrumentsrequest, Bundle.EMPTY);
    }

    protected final String bK()
    {
        return "com.google.android.gms.wallet.service.BIND";
    }

    protected final String bL()
    {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    protected final IInterface p(IBinder ibinder)
    {
        return ep(ibinder);
    }
}
