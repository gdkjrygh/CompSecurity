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
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.support.v4.app.r;
import android.support.v4.content.c;
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

public final class v extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.r.a
{
    static final class a extends android.support.v4.content.c
        implements c.b, c.c
    {

        public final com.google.android.gms.common.api.c j;
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

        public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            super.a(s, filedescriptor, printwriter, as);
            j.a(s, printwriter);
        }

        protected final void e()
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

        protected final void g()
        {
            j.c();
        }

        protected final void j()
        {
            l = null;
            k = false;
            j.b(this);
            j.b(this);
            j.c();
        }

        public final boolean k()
        {
            return k;
        }

        public final void onConnected(Bundle bundle)
        {
            k = false;
            a(ConnectionResult.a);
        }

        public final void onConnectionFailed(ConnectionResult connectionresult)
        {
            k = true;
            a(connectionresult);
        }

        public final void onConnectionSuspended(int i)
        {
        }

        public a(Context context, com.google.android.gms.common.api.c c1)
        {
            super(context);
            j = c1;
        }
    }

    private static final class b
    {

        public final com.google.android.gms.common.api.c a;
        public final c.c b;

        private b(com.google.android.gms.common.api.c c1, c.c c2)
        {
            a = c1;
            b = c2;
        }

        b(com.google.android.gms.common.api.c c1, c.c c2, byte byte0)
        {
            this(c1, c2);
        }
    }

    private final class c
        implements Runnable
    {

        final v a;
        private final int b;
        private final ConnectionResult c;

        public final void run()
        {
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
                    v.a(a);
                }
                return;
            }
            if (com.google.android.gms.common.e.b(c.c()))
            {
                com.google.android.gms.common.e.a(c.c(), a.getActivity(), a, a);
                return;
            } else
            {
                v.a(a, b, c);
                return;
            }
        }

        public c(int i, ConnectionResult connectionresult)
        {
            a = v.this;
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

    public v()
    {
        b = -1;
    }

    public static v a(FragmentActivity fragmentactivity)
    {
label0:
        {
            y.b("Must be called from main thread of process");
            l l1 = fragmentactivity.getSupportFragmentManager();
            v v1;
            try
            {
                v1 = (v)l1.a("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", fragmentactivity);
            }
            if (v1 != null)
            {
                fragmentactivity = v1;
                if (!v1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new v();
            l1.a().a(fragmentactivity, "GmsSupportLoaderLifecycleFragment").a();
            l1.b();
        }
        return fragmentactivity;
    }

    private void a()
    {
        int i = 0;
        a = false;
        b = -1;
        c = null;
        r r1 = getLoaderManager();
        for (; i < e.size(); i++)
        {
            int j = e.keyAt(i);
            a a1 = b(j);
            if (a1 != null && a1.k())
            {
                r1.a(j);
                r1.a(j, this);
            }
        }

    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (b)e.get(i);
        if (obj != null)
        {
            e.remove(i);
            getLoaderManager().a(i);
            obj = ((b) (obj)).b;
            if (obj != null)
            {
                ((c.c) (obj)).onConnectionFailed(connectionresult);
            }
        }
        a();
    }

    static void a(v v1)
    {
        v1.a();
    }

    static void a(v v1, int i, ConnectionResult connectionresult)
    {
        v1.a(i, connectionresult);
    }

    public final android.support.v4.content.c a(int i)
    {
        return new a(getActivity(), ((b)e.get(i)).a);
    }

    public final void a(int i, com.google.android.gms.common.api.c c1, c.c c2)
    {
        y.a(c1, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (e.indexOfKey(i) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i).toString());
        c1 = new b(c1, c2, (byte)0);
        e.put(i, c1);
        if (getActivity() != null)
        {
            r.a();
            getLoaderManager().a(i, this);
        }
    }

    public final void a(android.support.v4.content.c c1, Object obj)
    {
        obj = (ConnectionResult)obj;
        if (!((ConnectionResult) (obj)).b())
        {
            int i = c1.a();
            if (!a)
            {
                a = true;
                b = i;
                c = ((ConnectionResult) (obj));
                d.post(new c(i, ((ConnectionResult) (obj))));
            }
        }
    }

    final a b(int i)
    {
        a a1;
        try
        {
            a1 = (a)getLoaderManager().b(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classcastexception);
        }
        return a1;
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
            a(b, c);
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

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        int i = 0;
        while (i < e.size()) 
        {
            int j = e.keyAt(i);
            activity = b(j);
            if (activity != null && ((b)e.valueAt(i)).a != ((a) (activity)).j)
            {
                getLoaderManager().b(j, this);
            } else
            {
                getLoaderManager().a(j, this);
            }
            i++;
        }
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(b, new ConnectionResult(13, null));
    }

    public final void onCreate(Bundle bundle)
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

    public final void onSaveInstanceState(Bundle bundle)
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

    public final void onStart()
    {
        super.onStart();
        if (!a)
        {
            for (int i = 0; i < e.size(); i++)
            {
                getLoaderManager().a(e.keyAt(i), this);
            }

        }
    }
}
