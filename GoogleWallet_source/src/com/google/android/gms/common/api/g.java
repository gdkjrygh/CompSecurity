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
import com.google.android.gms.internal.kn;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class g extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static final class a extends Loader
        implements com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, GoogleApiClient.ConnectionCallbacks
    {

        public final GoogleApiClient Ts;
        private boolean Tt;
        private ConnectionResult Tu;

        private void a(ConnectionResult connectionresult)
        {
            Tu = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public final void in()
        {
            if (Tt)
            {
                Tt = false;
                if (isStarted() && !isAbandoned())
                {
                    Ts.connect();
                }
            }
        }

        public final void onConnected(Bundle bundle)
        {
            Tt = false;
            a(ConnectionResult.Rj);
        }

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            Tt = true;
            a(connectionresult);
        }

        public final void onConnectionSuspended(int i)
        {
        }

        protected final void onReset()
        {
            Tu = null;
            Tt = false;
            Ts.unregisterConnectionCallbacks(this);
            Ts.unregisterConnectionFailedListener$40dd7b8f(this);
            Ts.disconnect();
        }

        protected final void onStartLoading()
        {
            super.onStartLoading();
            Ts.registerConnectionCallbacks(this);
            Ts.registerConnectionFailedListener$40dd7b8f(this);
            if (Tu != null)
            {
                deliverResult(Tu);
            }
            if (!Ts.isConnected() && !Ts.isConnecting() && !Tt)
            {
                Ts.connect();
            }
        }

        protected final void onStopLoading()
        {
            Ts.disconnect();
        }

        public a(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            Ts = googleapiclient;
        }
    }

    static final class b
    {

        public final GoogleApiClient Ts;
        public final com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener Tv$3486c49a;

        private b(GoogleApiClient googleapiclient, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            Ts = googleapiclient;
            Tv$3486c49a = onconnectionfailedlistener;
        }

    }

    final class c
        implements Runnable
    {

        private final int Tw;
        private final ConnectionResult Tx;
        final g Ty;

        public final void run()
        {
            if (Tx.hasResolution())
            {
                try
                {
                    int i = Ty.getActivity().getSupportFragmentManager().getFragments().indexOf(Ty);
                    Tx.startResolutionForResult(Ty.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    g.a(Ty);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(Tx.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(Tx.getErrorCode(), Ty.getActivity(), Ty, 2, Ty);
                return;
            } else
            {
                g.a(Ty, Tw, Tx);
                return;
            }
        }

        public c(int i, ConnectionResult connectionresult)
        {
            Ty = g.this;
            super();
            Tw = i;
            Tx = connectionresult;
        }
    }


    private boolean Tn;
    private int To;
    private ConnectionResult Tp;
    private final Handler Tq = new Handler(Looper.getMainLooper());
    private final SparseArray Tr = new SparseArray();

    public g()
    {
        To = -1;
    }

    public static g a(FragmentActivity fragmentactivity)
    {
label0:
        {
            kn.bd("Must be called from main thread of process");
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
        if (!Tn)
        {
            Tn = true;
            To = i;
            Tp = connectionresult;
            Tq.post(new c(i, connectionresult));
        }
    }

    private void a(Loader loader, ConnectionResult connectionresult)
    {
        if (connectionresult.isSuccess())
        {
            cS(loader.getId());
            return;
        } else
        {
            a(loader.getId(), connectionresult);
            return;
        }
    }

    static void a(g g1)
    {
        g1.im();
    }

    static void a(g g1, int i, ConnectionResult connectionresult)
    {
        g1.b(i, connectionresult);
    }

    private void b(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (b)Tr.get(i);
        if (obj != null)
        {
            cQ(i);
            obj = ((b) (obj))._fld3486c49a;
            if (obj != null)
            {
                ((com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        im();
    }

    private void cQ(int i)
    {
        getLoaderManager().destroyLoader(i);
        Tr.remove(i);
    }

    private a cR(int i)
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

    private void cS(int i)
    {
        if (i == To)
        {
            im();
        }
    }

    private void im()
    {
        int i = 0;
        Tn = false;
        To = -1;
        Tp = null;
        LoaderManager loadermanager = getLoaderManager();
        for (; i < Tr.size(); i++)
        {
            int j = Tr.keyAt(i);
            a a1 = cR(j);
            if (a1 != null)
            {
                a1.in();
            }
            loadermanager.initLoader(j, null, this);
        }

    }

    public final void a$4d14770(int i, GoogleApiClient googleapiclient, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        kn.b(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (Tr.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i).toString());
        googleapiclient = new b(googleapiclient, onconnectionfailedlistener);
        Tr.put(i, googleapiclient);
        if (getActivity() != null)
        {
            getLoaderManager().initLoader(i, null, this);
        }
    }

    public final GoogleApiClient cP(int i)
    {
        if (getActivity() != null)
        {
            a a1 = cR(i);
            if (a1 != null)
            {
                return a1.Ts;
            }
        }
        return null;
    }

    public final void onActivityResult(int i, int j, Intent intent)
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
            im();
            return;
        } else
        {
            b(To, Tp);
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

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        int i = 0;
        while (i < Tr.size()) 
        {
            int j = Tr.keyAt(i);
            activity = cR(j);
            if (activity != null && ((b)Tr.valueAt(i)).Ts != ((a) (activity)).Ts)
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
        b(To, Tp);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            Tn = bundle.getBoolean("resolving_error", false);
            To = bundle.getInt("failed_client_id", -1);
            if (To >= 0)
            {
                Tp = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle)
    {
        return new a(getActivity(), ((b)Tr.get(i)).Ts);
    }

    public final void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ConnectionResult)obj);
    }

    public final void onLoaderReset(Loader loader)
    {
        if (loader.getId() == To)
        {
            im();
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", Tn);
        if (To >= 0)
        {
            bundle.putInt("failed_client_id", To);
            bundle.putInt("failed_status", Tp.getErrorCode());
            bundle.putParcelable("failed_resolution", Tp.getResolution());
        }
    }

    public final void onStart()
    {
        super.onStart();
        if (!Tn)
        {
            for (int i = 0; i < Tr.size(); i++)
            {
                getLoaderManager().initLoader(Tr.keyAt(i), null, this);
            }

        }
    }
}
