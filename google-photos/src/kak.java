// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class kak extends am
    implements android.content.DialogInterface.OnCancelListener
{

    boolean a;
    boolean b;
    final SparseArray c = new SparseArray();
    private int d;
    private ConnectionResult e;
    private final Handler f = new Handler(Looper.getMainLooper());

    public kak()
    {
        d = -1;
    }

    static int a(kak kak1, int i)
    {
        kak1.d = i;
        return i;
    }

    static ConnectionResult a(kak kak1, ConnectionResult connectionresult)
    {
        kak1.e = connectionresult;
        return connectionresult;
    }

    public static kak a(ar ar1)
    {
label0:
        {
            b.p("Must be called from main thread of process");
            ar1 = ar1.c();
            kak kak1;
            try
            {
                kak1 = (kak)ar1.a("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (ar ar1)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", ar1);
            }
            if (kak1 != null)
            {
                ar1 = kak1;
                if (!((am) (kak1)).v)
                {
                    break label0;
                }
            }
            ar1 = null;
        }
        return ar1;
    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (kal)c.get(i);
        if (obj != null)
        {
            kal kal1 = (kal)c.get(i);
            c.remove(i);
            if (kal1 != null)
            {
                kal1.b.c(kal1);
                kal1.b.d();
            }
            obj = ((kal) (obj)).c;
            if (obj != null)
            {
                ((jys) (obj)).a(connectionresult);
            }
        }
        r();
    }

    static void a(kak kak1, int i, ConnectionResult connectionresult)
    {
        kak1.a(i, connectionresult);
    }

    static boolean a(kak kak1)
    {
        return kak1.a;
    }

    static boolean a(kak kak1, boolean flag)
    {
        kak1.b = true;
        return true;
    }

    public static kak b(ar ar1)
    {
        kak kak1 = a(ar1);
        ay ay1 = ar1.c();
        ar1 = kak1;
        if (kak1 == null)
        {
            ar1 = new kak();
            ay1.a().a(ar1, "GmsSupportLifecycleFragment").c();
            ay1.b();
        }
        return ar1;
    }

    static boolean b(kak kak1)
    {
        return kak1.b;
    }

    static void c(kak kak1)
    {
        kak1.r();
    }

    static Handler d(kak kak1)
    {
        return kak1.f;
    }

    private void r()
    {
        b = false;
        d = -1;
        e = null;
        for (int i = 0; i < c.size(); i++)
        {
            ((kal)c.valueAt(i)).b.b();
        }

    }

    public final void a(int i, int j, Intent intent)
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
            r();
            return;
        } else
        {
            a(d, e);
            return;
        }
_L3:
        if (jyc.a(O_()) != 0) goto _L1; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
          goto _L5
_L2:
        if (j != -1) goto _L1; else goto _L6
_L6:
        i = ((flag) ? 1 : 0);
          goto _L5
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            b = bundle.getBoolean("resolving_error", false);
            d = bundle.getInt("failed_client_id", -1);
            if (d >= 0)
            {
                e = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        for (int i = 0; i < c.size(); i++)
        {
            kal kal1 = (kal)c.valueAt(i);
            printwriter.append(s).append("GoogleApiClient #").print(kal1.a);
            printwriter.println(":");
            kal1.b.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }

    }

    public final void aj_()
    {
        super.aj_();
        a = false;
        for (int i = 0; i < c.size(); i++)
        {
            ((kal)c.valueAt(i)).b.d();
        }

    }

    public final void au_()
    {
        super.au_();
        a = true;
        if (!b)
        {
            for (int i = 0; i < c.size(); i++)
            {
                ((kal)c.valueAt(i)).b.b();
            }

        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("resolving_error", b);
        if (d >= 0)
        {
            bundle.putInt("failed_client_id", d);
            bundle.putInt("failed_status", e.c);
            bundle.putParcelable("failed_resolution", e.d);
        }
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(d, new ConnectionResult(13, null));
    }
}
