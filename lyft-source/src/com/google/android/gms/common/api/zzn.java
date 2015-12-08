// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
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
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzn extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private boolean a;
    private int b;
    private ConnectionResult c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final SparseArray e = new SparseArray();

    public zzn()
    {
        b = -1;
    }

    public static zzn a(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzu.b("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            zzn zzn1;
            try
            {
                zzn1 = (zzn)fragmentmanager.findFragmentByTag("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentactivity);
            }
            if (zzn1 != null)
            {
                fragmentactivity = zzn1;
                if (!zzn1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new zzn();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLoaderLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void a()
    {
        int i = 0;
        a = false;
        b = -1;
        c = null;
        LoaderManager loadermanager = getLoaderManager();
        for (; i < e.size(); i++)
        {
            int j = e.keyAt(i);
            zza zza1 = c(j);
            if (zza1 != null && zza1.n())
            {
                loadermanager.destroyLoader(j);
                loadermanager.initLoader(j, null, this);
            }
        }

    }

    private void a(int i, ConnectionResult connectionresult)
    {
        if (!a)
        {
            a = true;
            b = i;
            c = connectionresult;
            d.post(new zzc(i, connectionresult));
        }
    }

    static void a(zzn zzn1)
    {
        zzn1.a();
    }

    static void a(zzn zzn1, int i, ConnectionResult connectionresult)
    {
        zzn1.b(i, connectionresult);
    }

    private void b(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (zzb)e.get(i);
        if (obj != null)
        {
            b(i);
            obj = ((zzb) (obj)).b;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        a();
    }

    public GoogleApiClient a(int i)
    {
        if (getActivity() != null)
        {
            zza zza1 = c(i);
            if (zza1 != null)
            {
                return zza1.j;
            }
        }
        return null;
    }

    public void a(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzu.a(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (e.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        googleapiclient = new zzb(googleapiclient, onconnectionfailedlistener);
        e.put(i, googleapiclient);
        if (getActivity() != null)
        {
            LoaderManager.enableDebugLogging(false);
            getLoaderManager().initLoader(i, null, this);
        }
    }

    public void a(Loader loader, ConnectionResult connectionresult)
    {
        if (!connectionresult.b())
        {
            a(loader.a(), connectionresult);
        }
    }

    public void b(int i)
    {
        e.remove(i);
        getLoaderManager().destroyLoader(i);
    }

    zza c(int i)
    {
        zza zza1;
        try
        {
            zza1 = (zza)getLoaderManager().getLoader(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classcastexception);
        }
        return zza1;
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
            a();
            return;
        } else
        {
            b(b, c);
            return;
        }
_L3:
        if (GooglePlayServicesUtil.a(getActivity()) != 0) goto _L1; else goto _L4
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
        while (i < e.size()) 
        {
            int j = e.keyAt(i);
            activity = c(j);
            if (activity != null && ((zzb)e.valueAt(i)).a != ((zza) (activity)).j)
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
        b(b, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            a = bundle.getBoolean("resolving_error", false);
            b = bundle.getInt("failed_client_id", -1);
            if (b >= 0)
            {
                c = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new zza(getActivity(), ((zzb)e.get(i)).a);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ConnectionResult)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", a);
        if (b >= 0)
        {
            bundle.putInt("failed_client_id", b);
            bundle.putInt("failed_status", c.c());
            bundle.putParcelable("failed_resolution", c.d());
        }
    }

    public void onStart()
    {
        super.onStart();
        if (!a)
        {
            for (int i = 0; i < e.size(); i++)
            {
                getLoaderManager().initLoader(e.keyAt(i), null, this);
            }

        }
    }

    private class zza extends Loader
        implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
    {

        public final GoogleApiClient j;
        private boolean k;
        private ConnectionResult l;

        private void a(ConnectionResult connectionresult)
        {
            l = connectionresult;
            if (b() && !c())
            {
                a(connectionresult);
            }
        }

        public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            super.a(s, filedescriptor, printwriter, as);
            j.a(s, filedescriptor, printwriter, as);
        }

        protected void e()
        {
            super.e();
            j.a(this);
            j.a(this);
            if (l != null)
            {
                a(l);
            }
            if (!j.d() && !j.e() && !k)
            {
                j.b();
            }
        }

        protected void i()
        {
            j.c();
        }

        protected void m()
        {
            l = null;
            k = false;
            j.b(this);
            j.b(this);
            j.c();
        }

        public boolean n()
        {
            return k;
        }

        public void onConnected(Bundle bundle)
        {
            k = false;
            a(ConnectionResult.a);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            k = true;
            a(connectionresult);
        }

        public void onConnectionSuspended(int i1)
        {
        }

        public zza(Context context, GoogleApiClient googleapiclient)
        {
            super(context);
            j = googleapiclient;
        }
    }


    private class zzc
        implements Runnable
    {

        final zzn a;
        private final int b;
        private final ConnectionResult c;

        public void run()
        {
            if (c.a())
            {
                try
                {
                    int i = a.getActivity().getSupportFragmentManager().getFragments().indexOf(a);
                    c.a(a.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    zzn.a(a);
                }
                return;
            }
            if (GooglePlayServicesUtil.c(c.c()))
            {
                GooglePlayServicesUtil.a(c.c(), a.getActivity(), a, 2, a);
                return;
            } else
            {
                zzn.a(a, b, c);
                return;
            }
        }

        public zzc(int i, ConnectionResult connectionresult)
        {
            a = zzn.this;
            super();
            b = i;
            c = connectionresult;
        }
    }


    private class zzb
    {

        public final GoogleApiClient a;
        public final GoogleApiClient.OnConnectionFailedListener b;

        private zzb(GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            a = googleapiclient;
            b = onconnectionfailedlistener;
        }

    }

}
