// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;

public final class kan extends am
    implements android.content.DialogInterface.OnCancelListener, ca
{

    final SparseArray a = new SparseArray();
    private boolean b;
    private int c;
    private ConnectionResult d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public kan()
    {
        c = -1;
    }

    public static kan a(ar ar1)
    {
label0:
        {
            b.p("Must be called from main thread of process");
            ay ay1 = ar1.c();
            kan kan1;
            try
            {
                kan1 = (kan)ay1.a("GmsSupportLoaderLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (ar ar1)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", ar1);
            }
            if (kan1 != null)
            {
                ar1 = kan1;
                if (!((am) (kan1)).v)
                {
                    break label0;
                }
            }
            ar1 = new kan();
            ay1.a().a(ar1, "GmsSupportLoaderLifecycleFragment").b();
            ay1.b();
        }
        return ar1;
    }

    private void a(int i, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (kap)a.get(i);
        if (obj != null)
        {
            a.remove(i);
            k().a(i);
            obj = ((kap) (obj)).b;
            if (obj != null)
            {
                ((jys) (obj)).a(connectionresult);
            }
        }
        r();
    }

    static void a(kan kan1)
    {
        kan1.r();
    }

    static void a(kan kan1, int i, ConnectionResult connectionresult)
    {
        kan1.a(i, connectionresult);
    }

    private void r()
    {
        int i = 0;
        b = false;
        c = -1;
        d = null;
        bz bz1 = k();
        for (; i < a.size(); i++)
        {
            int j = a.keyAt(i);
            kao kao1 = b(j);
            if (kao1 != null && kao1.b)
            {
                bz1.a(j);
                bz1.a(j, null, this);
            }
        }

    }

    public final ei a(int i, Bundle bundle)
    {
        return new kao(O_(), ((kap)a.get(i)).a);
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
            a(c, d);
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

    public final void a(Activity activity)
    {
        super.a(activity);
        int i = 0;
        while (i < a.size()) 
        {
            int j = a.keyAt(i);
            activity = b(j);
            if (activity != null && ((kap)a.valueAt(i)).a != ((kao) (activity)).a)
            {
                k().b(j, null, this);
            } else
            {
                k().a(j, null, this);
            }
            i++;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
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

    public final void a(ei ei1, Object obj)
    {
        obj = (ConnectionResult)obj;
        if (!((ConnectionResult) (obj)).b())
        {
            int i = ei1.c;
            if (!b)
            {
                b = true;
                c = i;
                d = ((ConnectionResult) (obj));
                e.post(new kaq(this, i, ((ConnectionResult) (obj))));
            }
        }
    }

    public final void au_()
    {
        super.au_();
        if (!b)
        {
            for (int i = 0; i < a.size(); i++)
            {
                k().a(a.keyAt(i), null, this);
            }

        }
    }

    final kao b(int i)
    {
        kao kao1;
        try
        {
            kao1 = (kao)k().b(i);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", classcastexception);
        }
        return kao1;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("resolving_error", b);
        if (c >= 0)
        {
            bundle.putInt("failed_client_id", c);
            bundle.putInt("failed_status", d.c);
            bundle.putParcelable("failed_resolution", d.d);
        }
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(c, new ConnectionResult(13, null));
    }
}
