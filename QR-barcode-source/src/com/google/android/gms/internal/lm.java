// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.identity.intents.UserAddressRequest;

// Referenced classes of package com.google.android.gms.internal:
//            lo

public class lm extends e
{
    public static final class a extends ln.a
    {

        private final int Lu;
        private Activity nr;

        static void a(a a1, Activity activity)
        {
            a1.setActivity(activity);
        }

        private void setActivity(Activity activity)
        {
            nr = activity;
        }

        public void g(int i, Bundle bundle)
        {
            if (i != 1) goto _L2; else goto _L1
_L1:
            Intent intent = new Intent();
            intent.putExtras(bundle);
            bundle = nr.createPendingResult(Lu, intent, 0x40000000);
            if (bundle != null) goto _L4; else goto _L3
_L3:
            return;
_L4:
            try
            {
                bundle.send(1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.w("AddressClientImpl", "Exception settng pending result", bundle);
            }
            return;
_L2:
            PendingIntent pendingintent = null;
            if (bundle != null)
            {
                pendingintent = (PendingIntent)bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
            }
            bundle = new ConnectionResult(i, pendingintent);
            if (bundle.hasResolution())
            {
                try
                {
                    bundle.startResolutionForResult(nr, Lu);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.w("AddressClientImpl", "Exception starting pending intent", bundle);
                }
                return;
            }
            bundle = nr.createPendingResult(Lu, new Intent(), 0x40000000);
            if (bundle != null)
            {
                try
                {
                    bundle.send(1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.w("AddressClientImpl", "Exception setting pending result", bundle);
                }
                return;
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        public a(int i, Activity activity)
        {
            Lu = i;
            nr = activity;
        }
    }


    private final String Dd;
    private a adM;
    private final int mTheme;
    private Activity nr;

    public lm(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, int i)
    {
        super(activity, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        Dd = s;
        nr = activity;
        mTheme = i;
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        l1.d(e1, 0x5e2978, getContext().getPackageName());
    }

    public void a(UserAddressRequest useraddressrequest, int i)
    {
        lT();
        adM = new a(i, nr);
        try
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(Dd))
            {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(Dd, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", mTheme);
            lS().a(adM, useraddressrequest, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UserAddressRequest useraddressrequest)
        {
            Log.e("AddressClientImpl", "Exception requesting user address", useraddressrequest);
        }
        useraddressrequest = new Bundle();
        useraddressrequest.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
        adM.g(1, useraddressrequest);
    }

    protected lo aF(IBinder ibinder)
    {
        return lo.a.aH(ibinder);
    }

    public void disconnect()
    {
        super.disconnect();
        if (adM != null)
        {
            a.a(adM, null);
            adM = null;
        }
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.identity.service.BIND";
    }

    protected IInterface j(IBinder ibinder)
    {
        return aF(ibinder);
    }

    protected lo lS()
    {
        return (lo)super.gS();
    }

    protected void lT()
    {
        super.dJ();
    }
}
