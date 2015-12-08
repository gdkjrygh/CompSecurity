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
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            c

public class zzq extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.LoaderManager.LoaderCallbacks
{
    static class a extends Loader
        implements c.b, c.c
    {

        public final c a;
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
            a.a(s, filedescriptor, printwriter, as);
        }

        public void onConnected(Bundle bundle)
        {
            b = false;
            a(ConnectionResult.a);
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            b = true;
            a(connectionresult);
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected void onReset()
        {
            c = null;
            b = false;
            a.b(this);
            a.b(this);
            a.c();
        }

        protected void onStartLoading()
        {
            super.onStartLoading();
            a.a(this);
            a.a(this);
            if (c != null)
            {
                deliverResult(c);
            }
            if (!a.d() && !a.e() && !b)
            {
                a.b();
            }
        }

        protected void onStopLoading()
        {
            a.c();
        }

        public a(Context context, c c1)
        {
            super(context);
            a = c1;
        }
    }

    private static class b
    {

        public final c a;
        public final c.c b;

        private b(c c1, c.c c2)
        {
            a = c1;
            b = c2;
        }

    }

    private class zzc
        implements Runnable
    {

        final zzq a;
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
                    zzq.a(a);
                }
                return;
            }
            if (com.google.android.gms.common.e.c(c.c()))
            {
                com.google.android.gms.common.e.a(c.c(), a.getActivity(), a, 2, a);
                return;
            } else
            {
                zzq.a(a, b, c);
                return;
            }
        }

        public zzc(int i, ConnectionResult connectionresult)
        {
            a = zzq.this;
            super();
            b = i;
            c = connectionresult;
        }
    }


    private boolean a;
    private int b;
    private ConnectionResult c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final SparseArray e = new SparseArray();

    public zzq()
    {
        b = -1;
    }

    public static zzq a(FragmentActivity fragmentactivity)
    {
label0:
        {
            z.b("Must be called from main thread of process");
            FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
            zzq zzq1;
            try
            {
                zzq1 = (zzq)fragmentmanager.findFragmentByTag("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentactivity);
            }
            if (zzq1 != null)
            {
                fragmentactivity = zzq1;
                if (!zzq1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new zzq();
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
            a a1 = c(j);
            if (a1 != null && a1.a())
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

    static void a(zzq zzq1)
    {
        zzq1.a();
    }

    static void a(zzq zzq1, int i, ConnectionResult connectionresult)
    {
        zzq1.b(i, connectionresult);
    }

    private void b(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (b)e.get(i);
        if (obj != null)
        {
            b(i);
            obj = ((b) (obj)).b;
            if (obj != null)
            {
                ((c.c) (obj)).onConnectionFailed(connectionresult);
            }
        }
        a();
    }

    public c a(int i)
    {
        if (getActivity() != null)
        {
            a a1 = c(i);
            if (a1 != null)
            {
                return a1.a;
            }
        }
        return null;
    }

    public void a(int i, c c1, c.c c2)
    {
        z.a(c1, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (e.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        c1 = new b(c1, c2);
        e.put(i, c1);
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
            a(loader.getId(), connectionresult);
        }
    }

    public void b(int i)
    {
        e.remove(i);
        getLoaderManager().destroyLoader(i);
    }

    a c(int i)
    {
        a a1;
        try
        {
            a1 = (a)getLoaderManager().getLoader(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classcastexception);
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
            a();
            return;
        } else
        {
            b(b, c);
            return;
        }
_L3:
        if (com.google.android.gms.common.e.a(getActivity()) != 0) goto _L1; else goto _L4
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
            if (activity != null && ((b)e.valueAt(i)).a != ((a) (activity)).a)
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
        return new a(getActivity(), ((b)e.get(i)).a);
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
}
