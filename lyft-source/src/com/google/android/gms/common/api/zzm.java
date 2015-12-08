// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

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
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzu;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient

public class zzm extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{

    private boolean a;
    private boolean b;
    private int c;
    private ConnectionResult d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final SparseArray f = new SparseArray();

    public zzm()
    {
        c = -1;
    }

    static int a(zzm zzm1, int i)
    {
        zzm1.c = i;
        return i;
    }

    static ConnectionResult a(zzm zzm1, ConnectionResult connectionresult)
    {
        zzm1.d = connectionresult;
        return connectionresult;
    }

    public static zzm a(FragmentActivity fragmentactivity)
    {
label0:
        {
            zzu.b("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            zzm zzm1;
            try
            {
                zzm1 = (zzm)fragmentmanager.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
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
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commit();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void a()
    {
        b = false;
        c = -1;
        d = null;
        for (int i = 0; i < f.size(); i++)
        {
            ((zza)f.valueAt(i)).b.b();
        }

    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (zza)f.get(i);
        if (obj != null)
        {
            a(i);
            obj = ((zza) (obj)).c;
            if (obj != null)
            {
                ((GoogleApiClient.OnConnectionFailedListener) (obj)).onConnectionFailed(connectionresult);
            }
        }
        a();
    }

    static void a(zzm zzm1, int i, ConnectionResult connectionresult)
    {
        zzm1.a(i, connectionresult);
    }

    static boolean a(zzm zzm1)
    {
        return zzm1.a;
    }

    static boolean a(zzm zzm1, boolean flag)
    {
        zzm1.b = flag;
        return flag;
    }

    static boolean b(zzm zzm1)
    {
        return zzm1.b;
    }

    static void c(zzm zzm1)
    {
        zzm1.a();
    }

    static Handler d(zzm zzm1)
    {
        return zzm1.e;
    }

    public void a(int i)
    {
        zza zza1 = (zza)f.get(i);
        f.remove(i);
        if (zza1 != null)
        {
            zza1.a();
        }
    }

    public void a(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzu.a(googleapiclient, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (f.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        onconnectionfailedlistener = new zza(i, googleapiclient, onconnectionfailedlistener);
        f.put(i, onconnectionfailedlistener);
        if (a && !b)
        {
            googleapiclient.b();
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < f.size(); i++)
        {
            ((zza)f.valueAt(i)).a(s, filedescriptor, printwriter, as);
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
            a();
            return;
        } else
        {
            a(c, d);
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

    public void onCancel(DialogInterface dialoginterface)
    {
        a(c, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            b = bundle.getBoolean("resolving_error", false);
            c = bundle.getInt("failed_client_id", -1);
            if (c >= 0)
            {
                d = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", b);
        if (c >= 0)
        {
            bundle.putInt("failed_client_id", c);
            bundle.putInt("failed_status", d.c());
            bundle.putParcelable("failed_resolution", d.d());
        }
    }

    public void onStart()
    {
        super.onStart();
        a = true;
        if (!b)
        {
            for (int i = 0; i < f.size(); i++)
            {
                ((zza)f.valueAt(i)).b.b();
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        a = false;
        for (int i = 0; i < f.size(); i++)
        {
            ((zza)f.valueAt(i)).b.c();
        }

    }

    private class zza
        implements GoogleApiClient.OnConnectionFailedListener
    {

        public final int a;
        public final GoogleApiClient b;
        public final GoogleApiClient.OnConnectionFailedListener c;
        final zzm d;

        public void a()
        {
            b.b(this);
            b.c();
        }

        public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            printwriter.append(s).append("GoogleApiClient #").print(a);
            printwriter.println(":");
            b.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            zzm.d(d).post(d. new zzb(a, connectionresult));
        }

        public zza(int i, GoogleApiClient googleapiclient, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            d = zzm.this;
            super();
            a = i;
            b = googleapiclient;
            c = onconnectionfailedlistener;
            googleapiclient.a(this);
        }

        private class zzb
            implements Runnable
        {

            final zzm a;
            private final int b;
            private final ConnectionResult c;

            public void run()
            {
                if (!zzm.a(a) || zzm.b(a))
                {
                    return;
                }
                zzm.a(a, true);
                zzm.a(a, b);
                zzm.a(a, c);
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
                        zzm.c(a);
                    }
                    return;
                }
                if (GooglePlayServicesUtil.c(c.c()))
                {
                    GooglePlayServicesUtil.a(c.c(), a.getActivity(), a, 2, a);
                    return;
                } else
                {
                    zzm.a(a, b, c);
                    return;
                }
            }

            public zzb(int i, ConnectionResult connectionresult)
            {
                a = zzm.this;
                super();
                b = i;
                c = connectionresult;
            }
        }

    }

}
