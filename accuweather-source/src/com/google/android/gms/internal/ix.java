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
import com.google.android.gms.identity.intents.UserAddressRequest;

// Referenced classes of package com.google.android.gms.internal:
//            hc, iz, hj

public class ix extends hc
{
    public static final class a extends iy.a
    {

        private final int FT;
        private Activity oe;

        static void a(a a1, Activity activity)
        {
            a1.setActivity(activity);
        }

        private void setActivity(Activity activity)
        {
            oe = activity;
        }

        public void g(int i, Bundle bundle)
        {
            if (i != 1) goto _L2; else goto _L1
_L1:
            Intent intent = new Intent();
            intent.putExtras(bundle);
            bundle = oe.createPendingResult(FT, intent, 0x40000000);
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
                    bundle.startResolutionForResult(oe, FT);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.w("AddressClientImpl", "Exception starting pending intent", bundle);
                }
                return;
            }
            bundle = oe.createPendingResult(FT, new Intent(), 0x40000000);
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
            FT = i;
            oe = activity;
        }
    }


    private a UD;
    private final int mTheme;
    private Activity oe;
    private final String yN;

    public ix(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, int i)
    {
        super(activity, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        yN = s;
        oe = activity;
        mTheme = i;
    }

    public void a(UserAddressRequest useraddressrequest, int i)
    {
        iP();
        UD = new a(i, oe);
        try
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(yN))
            {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(yN, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", mTheme);
            iO().a(UD, useraddressrequest, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UserAddressRequest useraddressrequest)
        {
            Log.e("AddressClientImpl", "Exception requesting user address", useraddressrequest);
        }
        useraddressrequest = new Bundle();
        useraddressrequest.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
        UD.g(1, useraddressrequest);
    }

    protected void a(hj hj1, hc.e e)
        throws RemoteException
    {
        hj1.d(e, 0x4d7808, getContext().getPackageName());
    }

    protected iz an(IBinder ibinder)
    {
        return iz.a.ap(ibinder);
    }

    protected String bp()
    {
        return "com.google.android.gms.identity.service.BIND";
    }

    protected String bq()
    {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    public void disconnect()
    {
        super.disconnect();
        if (UD != null)
        {
            a.a(UD, null);
            UD = null;
        }
    }

    protected iz iO()
    {
        return (iz)super.fo();
    }

    protected void iP()
    {
        super.ci();
    }

    protected IInterface x(IBinder ibinder)
    {
        return an(ibinder);
    }
}
