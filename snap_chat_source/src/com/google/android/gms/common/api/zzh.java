// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import S;
import V;
import Y;
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
import android.util.SparseArray;
import ap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzh extends Fragment
    implements Y.a, android.content.DialogInterface.OnCancelListener
{
    static class zza extends ap
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        private boolean zzNA;
        private ConnectionResult zzNB;
        public final GoogleApiClient zzNz;

        private void zze(ConnectionResult connectionresult)
        {
            zzNB = connectionresult;
            if (isStarted() && !isAbandoned())
            {
                deliverResult(connectionresult);
            }
        }

        public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            super.dump(s, filedescriptor, printwriter, as);
            zzNz.dump(s, filedescriptor, printwriter, as);
        }

        public void onConnected(Bundle bundle)
        {
            zzNA = false;
            zze(ConnectionResult.zzLr);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzNA = true;
            zze(connectionresult);
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected void onReset()
        {
            zzNB = null;
            zzNA = false;
            zzNz.unregisterConnectionCallbacks(this);
            zzNz.unregisterConnectionFailedListener(this);
            zzNz.disconnect();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            zzNz.registerConnectionCallbacks(this);
            zzNz.registerConnectionFailedListener(this);
            if (zzNB != null)
            {
                deliverResult(zzNB);
            }
            if (!zzNz.isConnected() && !zzNz.isConnecting() && !zzNA)
            {
                zzNz.connect();
            }
        }

        protected void onStopLoading()
        {
            zzNz.disconnect();
        }

        public boolean zzir()
        {
            return zzNA;
        }

        public zza(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            zzNz = googleapiclient;
        }
    }

    static class zzb
    {

        public final GoogleApiClient.OnConnectionFailedListener zzNC;
        public final GoogleApiClient zzNz;

        private zzb(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            zzNz = googleapiclient;
            zzNC = onconnectionfailedlistener;
        }

    }

    class zzc
        implements Runnable
    {

        private final int zzND;
        private final ConnectionResult zzNE;
        final zzh zzNF;

        public void run()
        {
            if (zzNE.hasResolution())
            {
                try
                {
                    int i = zzNF.getActivity().mFragments.f().indexOf(zzNF);
                    zzNE.startResolutionForResult(zzNF.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzh.zza(zzNF);
                }
                return;
            }
            if (GooglePlayServicesUtil.isUserRecoverableError(zzNE.getErrorCode()))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(zzNE.getErrorCode(), zzNF.getActivity(), zzNF, 2, zzNF);
                return;
            } else
            {
                zzh.zza(zzNF, zzND, zzNE);
                return;
            }
        }

        public zzc(int i, ConnectionResult connectionresult)
        {
            zzNF = zzh.this;
            super();
            zzND = i;
            zzNE = connectionresult;
        }
    }


    private boolean zzNu;
    private int zzNv;
    private ConnectionResult zzNw;
    private final Handler zzNx = new Handler(Looper.getMainLooper());
    private final SparseArray zzNy = new SparseArray();

    public zzh()
    {
        zzNv = -1;
    }

    public static zzh zza(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzx.zzbd("Must be called from main thread of process");
            T t = fragmentactivity.mFragments;
            zzh zzh1;
            try
            {
                zzh1 = (zzh)t.a("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (zzh1 != null)
            {
                fragmentactivity = zzh1;
                if (!zzh1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new zzh();
            t.a().a(fragmentactivity, "GmsSupportLifecycleFragment").a();
            t.b();
        }
        return fragmentactivity;
    }

    private void zza(int i, ConnectionResult connectionresult)
    {
        if (!zzNu)
        {
            zzNu = true;
            zzNv = i;
            zzNw = connectionresult;
            zzNx.post(new zzc(i, connectionresult));
        }
    }

    static void zza(zzh zzh1)
    {
        zzh1.zziq();
    }

    static void zza(zzh zzh1, int i, ConnectionResult connectionresult)
    {
        zzh1.zzb(i, connectionresult);
    }

    private void zzb(int i, ConnectionResult connectionresult)
    {
        Object obj = (zzb)zzNy.get(i);
        if (obj != null)
        {
            zzas(i);
            obj = ((zzb) (obj)).zzNC;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        zziq();
    }

    private void zziq()
    {
        int i = 0;
        zzNu = false;
        zzNv = -1;
        zzNw = null;
        Y y = getLoaderManager();
        for (; i < zzNy.size(); i++)
        {
            int j = zzNy.keyAt(i);
            zza zza1 = zzat(j);
            if (zza1 != null && zza1.zzir())
            {
                y.a(j);
                y.a(j, this);
            }
        }

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
            zziq();
            return;
        } else
        {
            zzb(zzNv, zzNw);
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
        while (i < zzNy.size()) 
        {
            int j = zzNy.keyAt(i);
            activity = zzat(j);
            if (activity != null && ((zzb)zzNy.valueAt(i)).zzNz != ((zza) (activity)).zzNz)
            {
                getLoaderManager().b(j, this);
            } else
            {
                getLoaderManager().a(j, this);
            }
            i++;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        zzb(zzNv, zzNw);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            zzNu = bundle.getBoolean("resolving_error", false);
            zzNv = bundle.getInt("failed_client_id", -1);
            if (zzNv >= 0)
            {
                zzNw = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public ap onCreateLoader(int i, Bundle bundle)
    {
        return new zza(getActivity(), ((zzb)zzNy.get(i)).zzNz);
    }

    public void onLoadFinished(ap ap1, Object obj)
    {
        zza(ap1, (ConnectionResult)obj);
    }

    public void onLoaderReset(ap ap1)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", zzNu);
        if (zzNv >= 0)
        {
            bundle.putInt("failed_client_id", zzNv);
            bundle.putInt("failed_status", zzNw.getErrorCode());
            bundle.putParcelable("failed_resolution", zzNw.getResolution());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!zzNu)
        {
            for (int i = 0; i < zzNy.size(); i++)
            {
                getLoaderManager().a(zzNy.keyAt(i), this);
            }

        }
    }

    public void zza(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzx.zzb(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (zzNy.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i).toString());
        googleapiclient = new zzb(googleapiclient, onconnectionfailedlistener);
        zzNy.put(i, googleapiclient);
        if (getActivity() != null)
        {
            getLoaderManager().a(i, this);
        }
    }

    public void zza(ap ap1, ConnectionResult connectionresult)
    {
        if (!connectionresult.isSuccess())
        {
            zza(ap1.getId(), connectionresult);
        }
    }

    public GoogleApiClient zzar(int i)
    {
        if (getActivity() != null)
        {
            zza zza1 = zzat(i);
            if (zza1 != null)
            {
                return zza1.zzNz;
            }
        }
        return null;
    }

    public void zzas(int i)
    {
        zzNy.remove(i);
        getLoaderManager().a(i);
    }

    zza zzat(int i)
    {
        zza zza1;
        try
        {
            zza1 = (zza)getLoaderManager().b(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", classcastexception);
        }
        return zza1;
    }
}
