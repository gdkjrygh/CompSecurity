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
import android.support.v4.app.h;
import android.support.v4.app.k;
import android.support.v4.app.n;
import android.support.v4.content.i;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzm extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.n.a
{
    static class a extends i
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient a;
        private boolean b;
        private ConnectionResult c;

        private void a(ConnectionResult connectionresult)
        {
            c = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public boolean a()
        {
            return b;
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            super.dump(s, filedescriptor, printwriter, as);
            a.dump(s, filedescriptor, printwriter, as);
        }

        public void onConnected(Bundle bundle)
        {
            b = false;
            a(ConnectionResult.zzOI);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            b = true;
            a(connectionresult);
        }

        public void onConnectionSuspended(int j)
        {
        }

        protected void onReset()
        {
            c = null;
            b = false;
            a.unregisterConnectionCallbacks(this);
            a.unregisterConnectionFailedListener(this);
            a.disconnect();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            a.registerConnectionCallbacks(this);
            a.registerConnectionFailedListener(this);
            if (c != null)
            {
                deliverResult(c);
            }
            if (!a.isConnected() && !a.isConnecting() && !b)
            {
                a.connect();
            }
        }

        protected void onStopLoading()
        {
            a.disconnect();
        }

        public a(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            a = googleapiclient;
        }
    }

    private static class b
    {

        public final GoogleApiClient a;
        public final GoogleApiClient.OnConnectionFailedListener b;

        private b(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            a = googleapiclient;
            b = onconnectionfailedlistener;
        }

    }

    private class c
        implements Runnable
    {

        final zzm a;
        private final int b;
        private final ConnectionResult c;

        public void run()
        {
            if (c.hasResolution())
            {
                try
                {
                    int j = a.getActivity().f().f().indexOf(a);
                    c.startResolutionForResult(a.getActivity(), (j + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzm.zza(a);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(c.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(c.getErrorCode(), a.getActivity(), a, 2, a);
                return;
            } else
            {
                zzm.zza(a, b, c);
                return;
            }
        }

        public c(int j, ConnectionResult connectionresult)
        {
            a = zzm.this;
            super();
            b = j;
            c = connectionresult;
        }
    }


    private boolean zzRa;
    private int zzRb;
    private ConnectionResult zzRc;
    private final Handler zzRd = new Handler(Looper.getMainLooper());
    private final SparseArray zzRe = new SparseArray();

    public zzm()
    {
        zzRb = -1;
    }

    private void zza(int j, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (b)zzRe.get(j);
        if (obj != null)
        {
            zzax(j);
            obj = ((b) (obj)).b;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        zzlg();
    }

    static void zza(zzm zzm1)
    {
        zzm1.zzlg();
    }

    static void zza(zzm zzm1, int j, ConnectionResult connectionresult)
    {
        zzm1.zza(j, connectionresult);
    }

    public static zzm zzb(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzv.zzbI("Must be called from main thread of process");
            h h1 = fragmentactivity.f();
            zzm zzm1;
            try
            {
                zzm1 = (zzm)h1.a("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentactivity);
            }
            if (zzm1 != null)
            {
                fragmentactivity = zzm1;
                if (!zzm1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new zzm();
            h1.a().a(fragmentactivity, "GmsSupportLoaderLifecycleFragment").b();
            h1.b();
        }
        return fragmentactivity;
    }

    private void zzb(int j, ConnectionResult connectionresult)
    {
        if (!zzRa)
        {
            zzRa = true;
            zzRb = j;
            zzRc = connectionresult;
            zzRd.post(new c(j, connectionresult));
        }
    }

    private void zzlg()
    {
        int j = 0;
        zzRa = false;
        zzRb = -1;
        zzRc = null;
        n n1 = getLoaderManager();
        for (; j < zzRe.size(); j++)
        {
            int l = zzRe.keyAt(j);
            a a1 = zzaz(l);
            if (a1 != null && a1.a())
            {
                n1.a(l);
                n1.a(l, null, this);
            }
        }

    }

    public void onActivityResult(int j, int l, Intent intent)
    {
        boolean flag = true;
        j;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 55
    //                   2 39;
           goto _L1 _L2 _L3
_L1:
        j = 0;
_L5:
        if (j != 0)
        {
            zzlg();
            return;
        } else
        {
            zza(zzRb, zzRc);
            return;
        }
_L3:
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(getActivity()) != 0) goto _L1; else goto _L4
_L4:
        j = ((flag) ? 1 : 0);
          goto _L5
_L2:
        if (l != -1) goto _L1; else goto _L6
_L6:
        j = ((flag) ? 1 : 0);
          goto _L5
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        int j = 0;
        while (j < zzRe.size()) 
        {
            int l = zzRe.keyAt(j);
            activity = zzaz(l);
            if (activity != null && ((b)zzRe.valueAt(j)).a != ((a) (activity)).a)
            {
                getLoaderManager().b(l, null, this);
            } else
            {
                getLoaderManager().a(l, null, this);
            }
            j++;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        zza(zzRb, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            zzRa = bundle.getBoolean("resolving_error", false);
            zzRb = bundle.getInt("failed_client_id", -1);
            if (zzRb >= 0)
            {
                zzRc = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public i onCreateLoader(int j, Bundle bundle)
    {
        return new a(getActivity(), ((b)zzRe.get(j)).a);
    }

    public void onLoadFinished(i j, Object obj)
    {
        zza(j, (ConnectionResult)obj);
    }

    public void onLoaderReset(i j)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", zzRa);
        if (zzRb >= 0)
        {
            bundle.putInt("failed_client_id", zzRb);
            bundle.putInt("failed_status", zzRc.getErrorCode());
            bundle.putParcelable("failed_resolution", zzRc.getResolution());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!zzRa)
        {
            for (int j = 0; j < zzRe.size(); j++)
            {
                getLoaderManager().a(zzRe.keyAt(j), null, this);
            }

        }
    }

    public void zza(int j, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzv.zzb(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (zzRe.indexOfKey(j) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(j).toString());
        googleapiclient = new b(googleapiclient, onconnectionfailedlistener);
        zzRe.put(j, googleapiclient);
        if (getActivity() != null)
        {
            n.a(false);
            getLoaderManager().a(j, null, this);
        }
    }

    public void zza(i j, ConnectionResult connectionresult)
    {
        if (!connectionresult.isSuccess())
        {
            zzb(j.getId(), connectionresult);
        }
    }

    public void zzax(int j)
    {
        zzRe.remove(j);
        getLoaderManager().a(j);
    }

    public GoogleApiClient zzay(int j)
    {
        if (getActivity() != null)
        {
            a a1 = zzaz(j);
            if (a1 != null)
            {
                return a1.a;
            }
        }
        return null;
    }

    a zzaz(int j)
    {
        a a1;
        try
        {
            a1 = (a)getLoaderManager().b(j);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classcastexception);
        }
        return a1;
    }
}
