// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class g extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static class a extends Loader
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient KH;
        private boolean KI;
        private ConnectionResult KJ;

        private void a(ConnectionResult connectionresult)
        {
            KJ = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public void gS()
        {
            if (KI)
            {
                KI = false;
                if (isStarted() && !isAbandoned())
                {
                    KH.connect();
                }
            }
        }

        public void onConnected(Bundle bundle)
        {
            KI = false;
            a(ConnectionResult.Iu);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            KI = true;
            a(connectionresult);
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected void onReset()
        {
            KJ = null;
            KI = false;
            KH.unregisterConnectionCallbacks(this);
            KH.unregisterConnectionFailedListener(this);
            KH.disconnect();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            KH.registerConnectionCallbacks(this);
            KH.registerConnectionFailedListener(this);
            if (KJ != null)
            {
                deliverResult(KJ);
            }
            if (!KH.isConnected() && !KH.isConnecting() && !KI)
            {
                KH.connect();
            }
        }

        protected void onStopLoading()
        {
            KH.disconnect();
        }

        public a(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            KH = googleapiclient;
        }
    }

    private static class b
    {

        public final GoogleApiClient KH;
        public final GoogleApiClient.OnConnectionFailedListener KK;

        private b(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            KH = googleapiclient;
            KK = onconnectionfailedlistener;
        }

    }

    private class c
        implements Runnable
    {

        private final int KL;
        private final ConnectionResult KM;
        final g KN;

        public void run()
        {
            if (KM.hasResolution())
            {
                try
                {
                    int i = KN.getActivity().getSupportFragmentManager().getFragments().indexOf(KN);
                    KM.startResolutionForResult(KN.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    g.a(KN);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(KM.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(KM.getErrorCode(), KN.getActivity(), KN, 2, KN);
                return;
            } else
            {
                g.a(KN, KL, KM);
                return;
            }
        }

        public c(int i, ConnectionResult connectionresult)
        {
            KN = g.this;
            super();
            KL = i;
            KM = connectionresult;
        }
    }


    private boolean KC;
    private int KD;
    private ConnectionResult KE;
    private final Handler KF = new Handler(Looper.getMainLooper());
    private final SparseArray KG = new SparseArray();

    public g()
    {
        KD = -1;
    }

    public static g a(FragmentActivity fragmentactivity)
    {
label0:
        {
            jx.aU("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            g g1;
            try
            {
                g1 = (g)fragmentmanager.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (g1 != null)
            {
                fragmentactivity = g1;
                if (!g1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new g();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void a(int i, ConnectionResult connectionresult)
    {
        if (!KC)
        {
            KC = true;
            KD = i;
            KE = connectionresult;
            KF.post(new c(i, connectionresult));
        }
    }

    static void a(g g1)
    {
        g1.gR();
    }

    static void a(g g1, int i, ConnectionResult connectionresult)
    {
        g1.b(i, connectionresult);
    }

    private void aq(int i)
    {
        if (i == KD)
        {
            gR();
        }
    }

    private void b(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (b)KG.get(i);
        if (obj != null)
        {
            ao(i);
            obj = ((b) (obj)).KK;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        gR();
    }

    private void gR()
    {
        int i = 0;
        KC = false;
        KD = -1;
        KE = null;
        LoaderManager loadermanager = getLoaderManager();
        for (; i < KG.size(); i++)
        {
            int j = KG.keyAt(i);
            a a1 = ap(j);
            if (a1 != null)
            {
                a1.gS();
            }
            loadermanager.initLoader(j, null, this);
        }

    }

    public void a(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        jx.b(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (KG.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        googleapiclient = new b(googleapiclient, onconnectionfailedlistener);
        KG.put(i, googleapiclient);
        if (getActivity() != null)
        {
            getLoaderManager().initLoader(i, null, this);
        }
    }

    public void a(Loader loader, ConnectionResult connectionresult)
    {
        if (connectionresult.isSuccess())
        {
            aq(loader.getId());
            return;
        } else
        {
            a(loader.getId(), connectionresult);
            return;
        }
    }

    public GoogleApiClient an(int i)
    {
        if (getActivity() != null)
        {
            a a1 = ap(i);
            if (a1 != null)
            {
                return a1.KH;
            }
        }
        return null;
    }

    public void ao(int i)
    {
        getLoaderManager().destroyLoader(i);
        KG.remove(i);
    }

    a ap(int i)
    {
        a a1;
        try
        {
            a1 = (a)getLoaderManager().getLoader(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", classcastexception);
        }
        return a1;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 55
    //                   2 39;
           goto _L1 _L2 _L3
_L1:
        i = 0;
_L5:
        if (i != 0)
        {
            gR();
            return;
        } else
        {
            b(KD, KE);
            return;
        }
_L3:
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) != 0) goto _L1; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
          goto _L5
_L2:
        if (j != -1) goto _L1; else goto _L6
_L6:
        i = ((flag) ? 1 : 0);
          goto _L5
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        int i = 0;
        while (i < KG.size()) 
        {
            int j = KG.keyAt(i);
            activity = ap(j);
            if (activity != null && ((b)KG.valueAt(i)).KH != ((a) (activity)).KH)
            {
                getLoaderManager().restartLoader(j, null, this);
            } else
            {
                getLoaderManager().initLoader(j, null, this);
            }
            i++;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        b(KD, KE);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            KC = bundle.getBoolean("resolving_error", false);
            KD = bundle.getInt("failed_client_id", -1);
            if (KD >= 0)
            {
                KE = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new a(getActivity(), ((b)KG.get(i)).KH);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ConnectionResult)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        if (loader.getId() == KD)
        {
            gR();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", KC);
        if (KD >= 0)
        {
            bundle.putInt("failed_client_id", KD);
            bundle.putInt("failed_status", KE.getErrorCode());
            bundle.putParcelable("failed_resolution", KE.getResolution());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!KC)
        {
            for (int i = 0; i < KG.size(); i++)
            {
                getLoaderManager().initLoader(KG.keyAt(i), null, this);
            }

        }
    }
}
