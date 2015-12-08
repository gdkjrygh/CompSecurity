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
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            c

public final class u extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{
    private final class a
        implements c.c
    {

        public final int a;
        public final c b;
        public final c.c c;
        final u d;

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            com.google.android.gms.common.api.u.e(d).post(d. new b(a, connectionresult));
        }

        public a(int i, c c1, c.c c2)
        {
            d = u.this;
            super();
            a = i;
            b = c1;
            c = c2;
            c1.a(this);
        }
    }

    private final class b
        implements Runnable
    {

        final u a;
        private final int b;
        private final ConnectionResult c;

        public final void run()
        {
            if (!u.a(a) || u.b(a))
            {
                return;
            }
            u.c(a);
            u.a(a, b);
            u.a(a, c);
            if (c.a())
            {
                try
                {
                    int i = a.getActivity().getSupportFragmentManager().f().indexOf(a);
                    c.a(a.getActivity(), (i + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    u.d(a);
                }
                return;
            }
            if (com.google.android.gms.common.e.b(c.c()))
            {
                com.google.android.gms.common.e.a(c.c(), a.getActivity(), a, a);
                return;
            } else
            {
                u.a(a, b, c);
                return;
            }
        }

        public b(int i, ConnectionResult connectionresult)
        {
            a = u.this;
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

    public u()
    {
        c = -1;
    }

    static int a(u u1, int i)
    {
        u1.c = i;
        return i;
    }

    static ConnectionResult a(u u1, ConnectionResult connectionresult)
    {
        u1.d = connectionresult;
        return connectionresult;
    }

    public static u a(FragmentActivity fragmentactivity)
    {
label0:
        {
            y.b("Must be called from main thread of process");
            fragmentactivity = fragmentactivity.getSupportFragmentManager();
            u u1;
            try
            {
                u1 = (u)fragmentactivity.a("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (u1 != null)
            {
                fragmentactivity = u1;
                if (!u1.isRemoving())
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
            a a1 = (a)f.get(i);
            f.remove(i);
            if (a1 != null)
            {
                a1.b.b(a1);
                a1.b.c();
            }
            obj = ((a) (obj)).c;
            if (obj != null)
            {
                ((c.c) (obj)).onConnectionFailed(connectionresult);
            }
        }
        a();
    }

    static void a(u u1, int i, ConnectionResult connectionresult)
    {
        u1.a(i, connectionresult);
    }

    static boolean a(u u1)
    {
        return u1.a;
    }

    public static u b(FragmentActivity fragmentactivity)
    {
        u u1 = a(fragmentactivity);
        l l1 = fragmentactivity.getSupportFragmentManager();
        fragmentactivity = u1;
        if (u1 == null)
        {
            fragmentactivity = new u();
            l1.a().a(fragmentactivity, "GmsSupportLifecycleFragment").b();
            l1.b();
        }
        return fragmentactivity;
    }

    static boolean b(u u1)
    {
        return u1.b;
    }

    static boolean c(u u1)
    {
        u1.b = true;
        return true;
    }

    static void d(u u1)
    {
        u1.a();
    }

    static Handler e(u u1)
    {
        return u1.e;
    }

    public final void a(int i, c c1, c.c c2)
    {
        y.a(c1, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (f.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i).toString());
        c2 = new a(i, c1, c2);
        f.put(i, c2);
        if (a && !b)
        {
            c1.b();
        }
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < f.size(); i++)
        {
            filedescriptor = (a)f.valueAt(i);
            printwriter.append(s).append("GoogleApiClient #").print(((a) (filedescriptor)).a);
            printwriter.println(":");
            ((a) (filedescriptor)).b.a((new StringBuilder()).append(s).append("  ").toString(), printwriter);
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

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(c, new ConnectionResult(13, null));
    }

    public final void onCreate(Bundle bundle)
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

    public final void onSaveInstanceState(Bundle bundle)
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

    public final void onStart()
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

    public final void onStop()
    {
        super.onStop();
        a = false;
        for (int i = 0; i < f.size(); i++)
        {
            ((a)f.valueAt(i)).b.c();
        }

    }
}
