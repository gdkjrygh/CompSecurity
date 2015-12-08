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
import com.google.android.gms.common.internal.o;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class d extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static class a extends Loader
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient JG;
        private boolean JH;
        private ConnectionResult JI;

        private void a(ConnectionResult connectionresult)
        {
            JI = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public void gv()
        {
            if (JH)
            {
                JH = false;
                if (isStarted() && !isAbandoned())
                {
                    JG.connect();
                }
            }
        }

        public void onConnected(Bundle bundle)
        {
            JH = false;
            a(ConnectionResult.HE);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            JH = true;
            a(connectionresult);
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected void onReset()
        {
            JI = null;
            JH = false;
            JG.unregisterConnectionCallbacks(this);
            JG.unregisterConnectionFailedListener(this);
            JG.disconnect();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            JG.registerConnectionCallbacks(this);
            JG.registerConnectionFailedListener(this);
            if (JI != null)
            {
                deliverResult(JI);
            }
            if (!JG.isConnected() && !JG.isConnecting() && !JH)
            {
                JG.connect();
            }
        }

        protected void onStopLoading()
        {
            JG.disconnect();
        }

        public a(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            JG = googleapiclient;
        }
    }

    private static class b
    {

        public final GoogleApiClient JG;
        public final GoogleApiClient.OnConnectionFailedListener JJ;

        private b(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            JG = googleapiclient;
            JJ = onconnectionfailedlistener;
        }

    }

    private class c
        implements Runnable
    {

        private final int JK;
        private final ConnectionResult JL;
        final d JM;

        public void run()
        {
            if (JL.hasResolution())
            {
                try
                {
                    int i = JM.getActivity().getSupportFragmentManager().getFragments().indexOf(JM);
                    JL.startResolutionForResult(JM.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    d.a(JM);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(JL.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(JL.getErrorCode(), JM.getActivity(), JM, 2, JM);
                return;
            } else
            {
                d.a(JM, JK, JL);
                return;
            }
        }

        public c(int i, ConnectionResult connectionresult)
        {
            JM = d.this;
            super();
            JK = i;
            JL = connectionresult;
        }
    }


    private boolean JB;
    private int JC;
    private ConnectionResult JD;
    private final Handler JE = new Handler(Looper.getMainLooper());
    private final SparseArray JF = new SparseArray();

    public d()
    {
        JC = -1;
    }

    public static d a(FragmentActivity fragmentactivity)
    {
label0:
        {
            o.aT("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            d d1;
            try
            {
                d1 = (d)fragmentmanager.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (d1 != null)
            {
                fragmentactivity = d1;
                if (!d1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new d();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void a(int i, ConnectionResult connectionresult)
    {
        if (!JB)
        {
            JB = true;
            JC = i;
            JD = connectionresult;
            JE.post(new c(i, connectionresult));
        }
    }

    static void a(d d1)
    {
        d1.gu();
    }

    static void a(d d1, int i, ConnectionResult connectionresult)
    {
        d1.b(i, connectionresult);
    }

    private void an(int i)
    {
        if (i == JC)
        {
            gu();
        }
    }

    private void b(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (b)JF.get(i);
        if (obj != null)
        {
            al(i);
            obj = ((b) (obj)).JJ;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        gu();
    }

    private void gu()
    {
        int i = 0;
        JB = false;
        JC = -1;
        JD = null;
        LoaderManager loadermanager = getLoaderManager();
        for (; i < JF.size(); i++)
        {
            int j = JF.keyAt(i);
            a a1 = am(j);
            if (a1 != null)
            {
                a1.gv();
            }
            loadermanager.initLoader(j, null, this);
        }

    }

    public void a(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        o.b(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (JF.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        googleapiclient = new b(googleapiclient, onconnectionfailedlistener);
        JF.put(i, googleapiclient);
        if (getActivity() != null)
        {
            getLoaderManager().initLoader(i, null, this);
        }
    }

    public void a(Loader loader, ConnectionResult connectionresult)
    {
        if (connectionresult.isSuccess())
        {
            an(loader.getId());
            return;
        } else
        {
            a(loader.getId(), connectionresult);
            return;
        }
    }

    public GoogleApiClient ak(int i)
    {
        if (getActivity() != null)
        {
            a a1 = am(i);
            if (a1 != null)
            {
                return a1.JG;
            }
        }
        return null;
    }

    public void al(int i)
    {
        getLoaderManager().destroyLoader(i);
        JF.remove(i);
    }

    a am(int i)
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
            gu();
            return;
        } else
        {
            b(JC, JD);
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
        while (i < JF.size()) 
        {
            int j = JF.keyAt(i);
            activity = am(j);
            if (activity != null && ((b)JF.valueAt(i)).JG != ((a) (activity)).JG)
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
        b(JC, JD);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            JB = bundle.getBoolean("resolving_error", false);
            JC = bundle.getInt("failed_client_id", -1);
            if (JC >= 0)
            {
                JD = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new a(getActivity(), ((b)JF.get(i)).JG);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ConnectionResult)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        if (loader.getId() == JC)
        {
            gu();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", JB);
        if (JC >= 0)
        {
            bundle.putInt("failed_client_id", JC);
            bundle.putInt("failed_status", JD.getErrorCode());
            bundle.putParcelable("failed_resolution", JD.getResolution());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!JB)
        {
            for (int i = 0; i < JF.size(); i++)
            {
                getLoaderManager().initLoader(JF.keyAt(i), null, this);
            }

        }
    }
}
