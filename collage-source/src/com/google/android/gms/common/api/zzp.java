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
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            c

public class zzp extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{
    private class a
        implements c.c
    {

        public final int a;
        public final c b;
        public final c.c c;
        final zzp d;

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
            zzp.d(d).post(d. new zzb(a, connectionresult));
        }

        public a(int i, c c1, c.c c2)
        {
            d = zzp.this;
            super();
            a = i;
            b = c1;
            c = c2;
            c1.a(this);
        }
    }

    private class zzb
        implements Runnable
    {

        final zzp a;
        private final int b;
        private final ConnectionResult c;

        public void run()
        {
            if (!zzp.a(a) || zzp.b(a))
            {
                return;
            }
            zzp.a(a, true);
            zzp.a(a, b);
            zzp.a(a, c);
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
                    zzp.c(a);
                }
                return;
            }
            if (com.google.android.gms.common.e.c(c.c()))
            {
                com.google.android.gms.common.e.a(c.c(), a.getActivity(), a, 2, a);
                return;
            } else
            {
                zzp.a(a, b, c);
                return;
            }
        }

        public zzb(int i, ConnectionResult connectionresult)
        {
            a = zzp.this;
            super();
            b = i;
            c = connectionresult;
        }
    }


    private boolean a;
    private boolean b;
    private int c;
    private ConnectionResult d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final SparseArray f = new SparseArray();

    public zzp()
    {
        c = -1;
    }

    static int a(zzp zzp1, int i)
    {
        zzp1.c = i;
        return i;
    }

    static ConnectionResult a(zzp zzp1, ConnectionResult connectionresult)
    {
        zzp1.d = connectionresult;
        return connectionresult;
    }

    public static zzp a(FragmentActivity fragmentactivity)
    {
label0:
        {
            z.b("Must be called from main thread of process");
            fragmentactivity = fragmentactivity.getSupportFragmentManager();
            zzp zzp1;
            try
            {
                zzp1 = (zzp)fragmentactivity.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (zzp1 != null)
            {
                fragmentactivity = zzp1;
                if (!zzp1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = null;
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
            ((a)f.valueAt(i)).b.b();
        }

    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (a)f.get(i);
        if (obj != null)
        {
            a(i);
            obj = ((a) (obj)).c;
            if (obj != null)
            {
                ((c.c) (obj)).onConnectionFailed(connectionresult);
            }
        }
        a();
    }

    static void a(zzp zzp1, int i, ConnectionResult connectionresult)
    {
        zzp1.a(i, connectionresult);
    }

    static boolean a(zzp zzp1)
    {
        return zzp1.a;
    }

    static boolean a(zzp zzp1, boolean flag)
    {
        zzp1.b = flag;
        return flag;
    }

    public static zzp b(FragmentActivity fragmentactivity)
    {
        zzp zzp1 = a(fragmentactivity);
        FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
        fragmentactivity = zzp1;
        if (zzp1 == null)
        {
            fragmentactivity = new zzp();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commitAllowingStateLoss();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    static boolean b(zzp zzp1)
    {
        return zzp1.b;
    }

    static void c(zzp zzp1)
    {
        zzp1.a();
    }

    static Handler d(zzp zzp1)
    {
        return zzp1.e;
    }

    public void a(int i)
    {
        a a1 = (a)f.get(i);
        f.remove(i);
        if (a1 != null)
        {
            a1.a();
        }
    }

    public void a(int i, c c1, c.c c2)
    {
        z.a(c1, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (f.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, (new StringBuilder()).append("Already managing a GoogleApiClient with id ").append(i).toString());
        c2 = new a(i, c1, c2);
        f.put(i, c2);
        if (a && !b)
        {
            c1.b();
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < f.size(); i++)
        {
            ((a)f.valueAt(i)).a(s, filedescriptor, printwriter, as);
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
                ((a)f.valueAt(i)).b.b();
            }

        }
    }

    public void onStop()
    {
        super.onStop();
        a = false;
        for (int i = 0; i < f.size(); i++)
        {
            ((a)f.valueAt(i)).b.c();
        }

    }
}
