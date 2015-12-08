// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.j.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.h:
//            d

public final class r extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{
    final class a
        implements d.d
    {

        public final int a;
        public final d b;
        public final d.d c = null;
        private r d;

        public final void a(com.google.android.m4b.maps.g.a a1)
        {
            r.e(d).post(d. new b(a, a1));
        }

        public a(int i, d d1)
        {
            d = r.this;
            super();
            a = i;
            b = d1;
            d1.a(this);
        }
    }

    final class b
        implements Runnable
    {

        private final int a;
        private final com.google.android.m4b.maps.g.a b;
        private r c;

        public final void run()
        {
            if (!com.google.android.m4b.maps.h.r.a(c) || r.b(c))
            {
                return;
            }
            r.c(c);
            com.google.android.m4b.maps.h.r.a(c, a);
            com.google.android.m4b.maps.h.r.a(c, b);
            if (b.a())
            {
                try
                {
                    int j = c.getActivity().getSupportFragmentManager().f().indexOf(c);
                    b.a(c.getActivity(), (j + 1 << 16) + 1);
                    return;
                }
                catch (android.content.IntentSender.SendIntentException sendintentexception)
                {
                    r.d(c);
                }
                return;
            }
            if (g.c(b.c))
            {
                g.a(b.c, c.getActivity(), c, c);
                return;
            } else
            {
                com.google.android.m4b.maps.h.r.a(c, a, b);
                return;
            }
        }

        public b(int j, com.google.android.m4b.maps.g.a a1)
        {
            c = r.this;
            super();
            a = j;
            b = a1;
        }
    }


    boolean a;
    boolean b;
    final SparseArray c = new SparseArray();
    private int d;
    private com.google.android.m4b.maps.g.a e;
    private final Handler f = new Handler(Looper.getMainLooper());

    public r()
    {
        d = -1;
    }

    static int a(r r1, int i)
    {
        r1.d = i;
        return i;
    }

    static com.google.android.m4b.maps.g.a a(r r1, com.google.android.m4b.maps.g.a a1)
    {
        r1.e = a1;
        return a1;
    }

    public static r a()
    {
        x.a("Must be called from main thread of process");
        throw new NullPointerException();
    }

    private void a(int i, com.google.android.m4b.maps.g.a a1)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (a)c.get(i);
        if (obj != null)
        {
            a a2 = (a)c.get(i);
            c.remove(i);
            if (a2 != null)
            {
                a2.b.b(a2);
                a2.b.c();
            }
            obj = ((a) (obj)).c;
            if (obj != null)
            {
                ((d.d) (obj)).a(a1);
            }
        }
        b();
    }

    static void a(r r1, int i, com.google.android.m4b.maps.g.a a1)
    {
        r1.a(i, a1);
    }

    static boolean a(r r1)
    {
        return r1.a;
    }

    private void b()
    {
        b = false;
        d = -1;
        e = null;
        for (int i = 0; i < c.size(); i++)
        {
            ((a)c.valueAt(i)).b.b();
        }

    }

    static boolean b(r r1)
    {
        return r1.b;
    }

    static boolean c(r r1)
    {
        r1.b = true;
        return true;
    }

    static void d(r r1)
    {
        r1.b();
    }

    static Handler e(r r1)
    {
        return r1.f;
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        for (int i = 0; i < c.size(); i++)
        {
            filedescriptor = (a)c.valueAt(i);
            printwriter.append(s).append("GoogleApiClient #").print(((a) (filedescriptor)).a);
            printwriter.println(":");
            ((a) (filedescriptor)).b.a(String.valueOf(s).concat("  "), printwriter);
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
            b();
            return;
        } else
        {
            a(d, e);
            return;
        }
_L3:
        if (g.a(getActivity()) != 0) goto _L1; else goto _L4
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
        a(d, new com.google.android.m4b.maps.g.a(13, null));
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            b = bundle.getBoolean("resolving_error", false);
            d = bundle.getInt("failed_client_id", -1);
            if (d >= 0)
            {
                e = new com.google.android.m4b.maps.g.a(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("resolving_error", b);
        if (d >= 0)
        {
            bundle.putInt("failed_client_id", d);
            bundle.putInt("failed_status", e.c);
            bundle.putParcelable("failed_resolution", e.d);
        }
    }

    public final void onStart()
    {
        super.onStart();
        a = true;
        if (!b)
        {
            for (int i = 0; i < c.size(); i++)
            {
                ((a)c.valueAt(i)).b.b();
            }

        }
    }

    public final void onStop()
    {
        super.onStop();
        a = false;
        for (int i = 0; i < c.size(); i++)
        {
            ((a)c.valueAt(i)).b.c();
        }

    }
}
