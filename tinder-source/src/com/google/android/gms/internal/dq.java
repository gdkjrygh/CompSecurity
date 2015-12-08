// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.q;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            do

public final class dq extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{
    private final class a
        implements com.google.android.gms.common.api.c.c
    {

        public final int a;
        public final c b;
        public final com.google.android.gms.common.api.c.c c;
        final dq d;

        public final void a(ConnectionResult connectionresult)
        {
            dq.e(d).post(d. new b(a, connectionresult));
        }

        public a(int j, c c1, com.google.android.gms.common.api.c.c c2)
        {
            d = dq.this;
            super();
            a = j;
            b = c1;
            c = c2;
            c1.a(this);
        }
    }

    private final class b
        implements Runnable
    {

        final dq a;
        private final int b;
        private final ConnectionResult c;

        public final void run()
        {
            if (!dq.a(a) || com.google.android.gms.internal.dq.b(a))
            {
                return;
            }
            com.google.android.gms.internal.dq.c(a);
            dq.a(a, b);
            dq.a(a, c);
            if (c.a())
            {
                try
                {
                    int j = a.getActivity().getSupportFragmentManager().f().indexOf(a);
                    c.a(a.getActivity(), (j + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    dq.d(a);
                }
                return;
            }
            dq.a();
            if (com.google.android.gms.common.b.a(c.c))
            {
                GooglePlayServicesUtil.showErrorDialogFragment(c.c, a.getActivity(), a, 2, a);
                return;
            }
            if (c.c == 18)
            {
                dq.a();
                Dialog dialog = com.google.android.gms.common.b.a(a.getActivity(), a);
                dq.a(a, com.google.android.gms.internal.do.a(a.getActivity().getApplicationContext(), new do(this, dialog) {

                    final Dialog b;
                    final b c;

                    protected final void a()
                    {
                        dq.d(c.a);
                        b.dismiss();
                    }

            
            {
                c = b1;
                b = dialog;
                super();
            }
                }));
                return;
            } else
            {
                dq.a(a, b, c);
                return;
            }
        }

        public b(int j, ConnectionResult connectionresult)
        {
            a = dq.this;
            super();
            b = j;
            c = connectionresult;
        }
    }


    private static final com.google.android.gms.common.b d = com.google.android.gms.common.b.a();
    public boolean a;
    public boolean b;
    public final SparseArray c = new SparseArray();
    private int e;
    private ConnectionResult f;
    private final Handler g = new Handler(Looper.getMainLooper());
    private do h;

    public dq()
    {
        e = -1;
    }

    static int a(dq dq1, int j)
    {
        dq1.e = j;
        return j;
    }

    static ConnectionResult a(dq dq1, ConnectionResult connectionresult)
    {
        dq1.f = connectionresult;
        return connectionresult;
    }

    static com.google.android.gms.common.b a()
    {
        return d;
    }

    static do a(dq dq1, do do1)
    {
        dq1.h = do1;
        return do1;
    }

    public static dq a(i j)
    {
label0:
        {
            u.b("Must be called from main thread of process");
            j = j.getSupportFragmentManager();
            dq dq1;
            try
            {
                dq1 = (dq)j.a("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (i j)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", j);
            }
            if (dq1 != null)
            {
                j = dq1;
                if (!dq1.isRemoving())
                {
                    break label0;
                }
            }
            j = null;
        }
        return j;
    }

    private void a(int j, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (a)c.get(j);
        if (obj != null)
        {
            a a1 = (a)c.get(j);
            c.remove(j);
            if (a1 != null)
            {
                a1.b.b(a1);
                a1.b.c();
            }
            obj = ((a) (obj)).c;
            if (obj != null)
            {
                ((com.google.android.gms.common.api.c.c) (obj)).a(connectionresult);
            }
        }
        b();
    }

    static void a(dq dq1, int j, ConnectionResult connectionresult)
    {
        dq1.a(j, connectionresult);
    }

    static boolean a(dq dq1)
    {
        return dq1.a;
    }

    public static dq b(i j)
    {
        dq dq1 = a(j);
        m m1 = j.getSupportFragmentManager();
        j = dq1;
        if (dq1 == null)
        {
            j = new dq();
            m1.a().a(j, "GmsSupportLifecycleFragment").d();
            m1.b();
        }
        return j;
    }

    private void b()
    {
        b = false;
        e = -1;
        f = null;
        if (h != null)
        {
            h.b();
            h = null;
        }
        for (int j = 0; j < c.size(); j++)
        {
            ((a)c.valueAt(j)).b.b();
        }

    }

    static boolean b(dq dq1)
    {
        return dq1.b;
    }

    static boolean c(dq dq1)
    {
        dq1.b = true;
        return true;
    }

    static void d(dq dq1)
    {
        dq1.b();
    }

    static Handler e(dq dq1)
    {
        return dq1.g;
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int j = 0; j < c.size(); j++)
        {
            filedescriptor = (a)c.valueAt(j);
            printwriter.append(s).append("GoogleApiClient #").print(((a) (filedescriptor)).a);
            printwriter.println(":");
            ((a) (filedescriptor)).b.a((new StringBuilder()).append(s).append("  ").toString(), printwriter);
        }

    }

    public final void onActivityResult(int j, int k, Intent intent)
    {
        boolean flag = true;
        j;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 55
    //                   2 39;
           goto _L1 _L2 _L3
_L1:
        j = 0;
_L4:
        if (j != 0)
        {
            b();
            return;
        } else
        {
            a(e, f);
            return;
        }
_L3:
        if (com.google.android.gms.common.b.a(getActivity()) != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = ((flag) ? 1 : 0);
          goto _L4
_L2:
        j = ((flag) ? 1 : 0);
        if (k == -1) goto _L4; else goto _L5
_L5:
        if (k == 0)
        {
            f = new ConnectionResult(13, null);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(e, new ConnectionResult(13, null));
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            b = bundle.getBoolean("resolving_error", false);
            e = bundle.getInt("failed_client_id", -1);
            if (e >= 0)
            {
                f = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", b);
        if (e >= 0)
        {
            bundle.putInt("failed_client_id", e);
            bundle.putInt("failed_status", f.c);
            bundle.putParcelable("failed_resolution", f.d);
        }
    }

    public final void onStart()
    {
        super.onStart();
        a = true;
        if (!b)
        {
            for (int j = 0; j < c.size(); j++)
            {
                ((a)c.valueAt(j)).b.b();
            }

        }
    }

    public final void onStop()
    {
        super.onStop();
        a = false;
        for (int j = 0; j < c.size(); j++)
        {
            ((a)c.valueAt(j)).b.c();
        }

    }

}
