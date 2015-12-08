// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.u;
import android.support.v4.b.c;
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

public final class s extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.support.v4.app.u.a
{
    static final class a extends android.support.v4.b.c
        implements d.b, d.d
    {

        public final d j;
        boolean k;
        private com.google.android.m4b.maps.g.a l;

        private void b(com.google.android.m4b.maps.g.a a1)
        {
            l = a1;
            if (super.e && !super.f)
            {
                a(a1);
            }
        }

        protected final void a()
        {
            super.a();
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

        public final void a(int i)
        {
        }

        public final void a(Bundle bundle)
        {
            k = false;
            b(com.google.android.m4b.maps.g.a.a);
        }

        public final void a(com.google.android.m4b.maps.g.a a1)
        {
            k = true;
            b(a1);
        }

        public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
        {
            super.a(s1, filedescriptor, printwriter, as);
            j.a(s1, printwriter);
        }

        protected final void b()
        {
            j.c();
        }

        protected final void c()
        {
            l = null;
            k = false;
            j.b(this);
            j.b(this);
            j.c();
        }

        public a(Context context, d d1)
        {
            super(context);
            j = d1;
        }
    }

    static final class b
    {

        public final d a;
        public final d.d b;

        private b(d d1)
        {
            a = d1;
            b = null;
        }

        b(d d1, byte byte0)
        {
            this(d1);
        }
    }

    final class c
        implements Runnable
    {

        private final int a;
        private final com.google.android.m4b.maps.g.a b;
        private s c;

        public final void run()
        {
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
                    com.google.android.m4b.maps.h.s.a(c);
                }
                return;
            }
            if (g.c(b.c))
            {
                g.a(b.c, c.getActivity(), c, c);
                return;
            } else
            {
                com.google.android.m4b.maps.h.s.a(c, a, b);
                return;
            }
        }

        public c(int j, com.google.android.m4b.maps.g.a a1)
        {
            c = s.this;
            super();
            a = j;
            b = a1;
        }
    }


    final SparseArray a = new SparseArray();
    private boolean b;
    private int c;
    private com.google.android.m4b.maps.g.a d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public s()
    {
        c = -1;
    }

    public static s a()
    {
        x.a("Must be called from main thread of process");
        throw new NullPointerException();
    }

    private void a(int i, com.google.android.m4b.maps.g.a a1)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (b)a.get(i);
        if (obj != null)
        {
            a.remove(i);
            getLoaderManager().a(i);
            obj = ((b) (obj)).b;
            if (obj != null)
            {
                ((d.d) (obj)).a(a1);
            }
        }
        b();
    }

    static void a(s s1)
    {
        s1.b();
    }

    static void a(s s1, int i, com.google.android.m4b.maps.g.a a1)
    {
        s1.a(i, a1);
    }

    private void b()
    {
        int i = 0;
        b = false;
        c = -1;
        d = null;
        u u1 = getLoaderManager();
        for (; i < a.size(); i++)
        {
            int j = a.keyAt(i);
            a a1 = b(j);
            if (a1 != null && a1.k)
            {
                u1.a(j);
                u1.a(j, this);
            }
        }

    }

    public final android.support.v4.b.c a(int i)
    {
        return new a(getActivity(), ((b)a.get(i)).a);
    }

    public final void a(android.support.v4.b.c c1, Object obj)
    {
        obj = (com.google.android.m4b.maps.g.a)obj;
        if (!((com.google.android.m4b.maps.g.a) (obj)).b())
        {
            int i = c1.a;
            if (!b)
            {
                b = true;
                c = i;
                d = ((com.google.android.m4b.maps.g.a) (obj));
                e.post(new c(i, ((com.google.android.m4b.maps.g.a) (obj))));
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
            b();
            return;
        } else
        {
            a(c, d);
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

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        int i = 0;
        while (i < a.size()) 
        {
            int j = a.keyAt(i);
            activity = b(j);
            if (activity != null && ((b)a.valueAt(i)).a != ((a) (activity)).j)
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
        a(c, new com.google.android.m4b.maps.g.a(13, null));
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
                d = new com.google.android.m4b.maps.g.a(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
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
            bundle.putInt("failed_status", d.c);
            bundle.putParcelable("failed_resolution", d.d);
        }
    }

    public final void onStart()
    {
        super.onStart();
        if (!b)
        {
            for (int i = 0; i < a.size(); i++)
            {
                getLoaderManager().a(a.keyAt(i), this);
            }

        }
    }
}
