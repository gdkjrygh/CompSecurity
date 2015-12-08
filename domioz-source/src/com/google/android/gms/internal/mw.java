// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            mj, my, mi

public final class mw extends k
{

    private final Activity d;
    private final int e;
    private final String f;
    private final int g;

    public mw(Activity activity, Looper looper, n n, o o, int i, String s, int j)
    {
        super(activity, looper, 4, n, o);
        d = activity;
        e = i;
        f = s;
        g = j;
    }

    private Bundle m()
    {
        int i = e;
        String s = d.getPackageName();
        String s1 = f;
        int j = g;
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

    protected final IInterface a(IBinder ibinder)
    {
        return mj.a(ibinder);
    }

    public final void a(int i)
    {
        Bundle bundle = m();
        my my1 = new my(d, i);
        try
        {
            ((mi)l()).a(bundle, my1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", remoteexception);
        }
        my1.a(8, false, Bundle.EMPTY);
    }

    public final void a(FullWalletRequest fullwalletrequest, int i)
    {
        my my1 = new my(d, i);
        Bundle bundle = m();
        try
        {
            ((mi)l()).a(fullwalletrequest, bundle, my1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FullWalletRequest fullwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", fullwalletrequest);
        }
        my1.a(8, null, Bundle.EMPTY);
    }

    public final void a(MaskedWalletRequest maskedwalletrequest, int i)
    {
        Bundle bundle = m();
        my my1 = new my(d, i);
        try
        {
            ((mi)l()).a(maskedwalletrequest, bundle, my1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MaskedWalletRequest maskedwalletrequest)
        {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", maskedwalletrequest);
        }
        my1.a(8, null, Bundle.EMPTY);
    }

    public final void a(String s, String s1, int i)
    {
        Bundle bundle = m();
        my my1 = new my(d, i);
        try
        {
            ((mi)l()).a(s, s1, bundle, my1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", s);
        }
        my1.a(8, null, Bundle.EMPTY);
    }

    protected final String e()
    {
        return "com.google.android.gms.wallet.service.BIND";
    }

    protected final String f()
    {
        return "com.google.android.gms.wallet.internal.IOwService";
    }
}
