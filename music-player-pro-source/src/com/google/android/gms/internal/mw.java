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
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.identity.intents.UserAddressRequest;

// Referenced classes of package com.google.android.gms.internal:
//            jl, my, jt

public class mw extends jl
{
    public static final class a extends mx.a
    {

        private final int My;
        private Activity nB;

        static void a(a a1, Activity activity)
        {
            a1.setActivity(activity);
        }

        private void setActivity(Activity activity)
        {
            nB = activity;
        }

        public void g(int i, Bundle bundle)
        {
            if (i != 1) goto _L2; else goto _L1
_L1:
            Intent intent = new Intent();
            intent.putExtras(bundle);
            bundle = nB.createPendingResult(My, intent, 0x40000000);
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
                    bundle.startResolutionForResult(nB, My);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    Log.w("AddressClientImpl", "Exception starting pending intent", bundle);
                }
                return;
            }
            bundle = nB.createPendingResult(My, new Intent(), 0x40000000);
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
            My = i;
            nB = activity;
        }
    }


    private final String DZ;
    private a afJ;
    private final int mTheme;
    private Activity nB;

    public mw(Activity activity, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, int i)
    {
        super(activity, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        DZ = s;
        nB = activity;
        mTheme = i;
    }

    public void a(UserAddressRequest useraddressrequest, int i)
    {
        ne();
        afJ = new a(i, nB);
        try
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(DZ))
            {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(DZ, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", mTheme);
            nd().a(afJ, useraddressrequest, bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UserAddressRequest useraddressrequest)
        {
            Log.e("AddressClientImpl", "Exception requesting user address", useraddressrequest);
        }
        useraddressrequest = new Bundle();
        useraddressrequest.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
        afJ.g(1, useraddressrequest);
    }

    protected void a(jt jt1, jl.e e)
        throws RemoteException
    {
        jt1.d(e, 0x648278, getContext().getPackageName());
    }

    protected my aI(IBinder ibinder)
    {
        return my.a.aK(ibinder);
    }

    protected String bK()
    {
        return "com.google.android.gms.identity.service.BIND";
    }

    protected String bL()
    {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    public void disconnect()
    {
        super.disconnect();
        if (afJ != null)
        {
            a.a(afJ, null);
            afJ = null;
        }
    }

    protected IInterface l(IBinder ibinder)
    {
        return aI(ibinder);
    }

    protected my nd()
        throws DeadObjectException
    {
        return (my)super.hw();
    }

    protected void ne()
    {
        super.dS();
    }
}
