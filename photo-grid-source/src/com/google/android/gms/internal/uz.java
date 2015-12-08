// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.bl;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.internal:
//            va, ux

public final class uz extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{

    private static final b a = com.google.android.gms.common.b.a();
    private boolean b;
    private boolean c;
    private int d;
    private ConnectionResult e;
    private final Handler f = new Handler(Looper.getMainLooper());
    private ux g;
    private final SparseArray h = new SparseArray();

    public uz()
    {
        d = -1;
    }

    static int a(uz uz1, int i)
    {
        uz1.d = i;
        return i;
    }

    static ConnectionResult a(uz uz1, ConnectionResult connectionresult)
    {
        uz1.e = connectionresult;
        return connectionresult;
    }

    static b a()
    {
        return a;
    }

    static ux a(uz uz1, ux ux1)
    {
        uz1.g = ux1;
        return ux1;
    }

    public static uz a(FragmentActivity fragmentactivity)
    {
label0:
        {
            bl.b("Must be called from main thread of process");
            fragmentactivity = fragmentactivity.getSupportFragmentManager();
            uz uz1;
            try
            {
                uz1 = (uz)fragmentactivity.findFragmentByTag("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (uz1 != null)
            {
                fragmentactivity = uz1;
                if (!uz1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = null;
        }
        return fragmentactivity;
    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (va)h.get(i);
        if (obj != null)
        {
            va va1 = (va)h.get(i);
            h.remove(i);
            if (va1 != null)
            {
                va1.b.b(va1);
                va1.b.c();
            }
            obj = ((va) (obj)).c;
            if (obj != null)
            {
                ((l) (obj)).onConnectionFailed(connectionresult);
            }
        }
        b();
    }

    static void a(uz uz1, int i, ConnectionResult connectionresult)
    {
        uz1.a(i, connectionresult);
    }

    static boolean a(uz uz1)
    {
        return uz1.b;
    }

    public static uz b(FragmentActivity fragmentactivity)
    {
        uz uz1 = a(fragmentactivity);
        FragmentManager fragmentmanager = fragmentactivity.getSupportFragmentManager();
        fragmentactivity = uz1;
        if (uz1 == null)
        {
            fragmentactivity = new uz();
            fragmentmanager.beginTransaction().add(fragmentactivity, "GmsSupportLifecycleFragment").commitAllowingStateLoss();
            fragmentmanager.executePendingTransactions();
        }
        return fragmentactivity;
    }

    private void b()
    {
        c = false;
        d = -1;
        e = null;
        if (g != null)
        {
            g.b();
            g = null;
        }
        for (int i = 0; i < h.size(); i++)
        {
            ((va)h.valueAt(i)).b.b();
        }

    }

    static boolean b(uz uz1)
    {
        return uz1.c;
    }

    static boolean c(uz uz1)
    {
        uz1.c = true;
        return true;
    }

    static void d(uz uz1)
    {
        uz1.b();
    }

    static Handler e(uz uz1)
    {
        return uz1.f;
    }

    public final void a(int i, h h1, l l1)
    {
        bl.a(h1, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (h.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i).toString());
        l1 = new va(this, i, h1, l1);
        h.put(i, l1);
        if (b && !c)
        {
            h1.b();
        }
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < h.size(); i++)
        {
            va va1 = (va)h.valueAt(i);
            printwriter.append(s).append("GoogleApiClient #").print(va1.a);
            printwriter.println(":");
            va1.b.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }

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
_L4:
        if (i != 0)
        {
            b();
            return;
        } else
        {
            a(d, e);
            return;
        }
_L3:
        if (com.google.android.gms.common.b.a(getActivity()) != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = ((flag) ? 1 : 0);
          goto _L4
_L2:
        i = ((flag) ? 1 : 0);
        if (j == -1) goto _L4; else goto _L5
_L5:
        if (j == 0)
        {
            e = new ConnectionResult(13, null);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(d, new ConnectionResult(13, null));
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            c = bundle.getBoolean("resolving_error", false);
            d = bundle.getInt("failed_client_id", -1);
            if (d >= 0)
            {
                e = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", c);
        if (d >= 0)
        {
            bundle.putInt("failed_client_id", d);
            bundle.putInt("failed_status", e.c());
            bundle.putParcelable("failed_resolution", e.d());
        }
    }

    public final void onStart()
    {
        super.onStart();
        b = true;
        if (!c)
        {
            for (int i = 0; i < h.size(); i++)
            {
                ((va)h.valueAt(i)).b.b();
            }

        }
    }

    public final void onStop()
    {
        super.onStop();
        b = false;
        for (int i = 0; i < h.size(); i++)
        {
            ((va)h.valueAt(i)).b.c();
        }

    }

}
