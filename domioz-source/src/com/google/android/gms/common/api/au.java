// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ah;
import android.support.v4.app.as;
import android.support.v4.app.at;
import android.support.v4.app.u;
import android.support.v4.content.i;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.ap;

// Referenced classes of package com.google.android.gms.common.api:
//            av, aw, o, ax, 
//            l

public final class au extends Fragment
    implements android.content.DialogInterface.OnCancelListener, at
{

    private boolean a;
    private int b;
    private ConnectionResult c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final SparseArray e = new SparseArray();

    public au()
    {
        b = -1;
    }

    public static au a(FragmentActivity fragmentactivity)
    {
label0:
        {
            ap.b("Must be called from main thread of process");
            u u1 = fragmentactivity.getSupportFragmentManager();
            au au1;
            try
            {
                au1 = (au)u1.a("GmsSupportLifecycleFragment");
            }
            // Misplaced declaration of an exception variable
            catch (FragmentActivity fragmentactivity)
            {
                throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", fragmentactivity);
            }
            if (au1 != null)
            {
                fragmentactivity = au1;
                if (!au1.isRemoving())
                {
                    break label0;
                }
            }
            fragmentactivity = new au();
            u1.a().a(fragmentactivity, "GmsSupportLifecycleFragment").a();
            u1.b();
        }
        return fragmentactivity;
    }

    private void a()
    {
        int j = 0;
        a = false;
        b = -1;
        c = null;
        as as1 = getLoaderManager();
        for (; j < e.size(); j++)
        {
            int k = e.keyAt(j);
            av av1 = b(k);
            if (av1 != null && av1.k())
            {
                as1.a(k);
                as1.a(k, this);
            }
        }

    }

    private void a(int j, ConnectionResult connectionresult)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        Object obj = (aw)e.get(j);
        if (obj != null)
        {
            e.remove(j);
            getLoaderManager().a(j);
            obj = ((aw) (obj)).b;
            if (obj != null)
            {
                ((o) (obj)).onConnectionFailed(connectionresult);
            }
        }
        a();
    }

    static void a(au au1)
    {
        au1.a();
    }

    static void a(au au1, int j, ConnectionResult connectionresult)
    {
        au1.a(j, connectionresult);
    }

    public final i a(int j)
    {
        return new av(getActivity(), ((aw)e.get(j)).a);
    }

    public final void a(int j, l l, o o1)
    {
        ap.a(l, "GoogleApiClient instance cannot be null");
        boolean flag;
        if (e.indexOfKey(j) < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(j).toString());
        l = new aw(l, o1, (byte)0);
        e.put(j, l);
        if (getActivity() != null)
        {
            as.a();
            getLoaderManager().a(j, this);
        }
    }

    public final void a(i j, Object obj)
    {
        obj = (ConnectionResult)obj;
        if (!((ConnectionResult) (obj)).b())
        {
            int k = j.a();
            if (!a)
            {
                a = true;
                b = k;
                c = ((ConnectionResult) (obj));
                d.post(new ax(this, k, ((ConnectionResult) (obj))));
            }
        }
    }

    final av b(int j)
    {
        av av1;
        try
        {
            av1 = (av)getLoaderManager().b(j);
        }
        catch (ClassCastException classcastexception)
        {
            throw new IllegalStateException("Unknown loader in SupportLifecycleFragment", classcastexception);
        }
        return av1;
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
_L5:
        if (j != 0)
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
        j = ((flag) ? 1 : 0);
          goto _L5
_L2:
        if (k != -1) goto _L1; else goto _L6
_L6:
        j = ((flag) ? 1 : 0);
          goto _L5
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        int j = 0;
        while (j < e.size()) 
        {
            int k = e.keyAt(j);
            activity = b(k);
            if (activity != null && ((aw)e.valueAt(j)).a != ((av) (activity)).i)
            {
                getLoaderManager().b(k, this);
            } else
            {
                getLoaderManager().a(k, this);
            }
            j++;
        }
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a(b, c);
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
            for (int j = 0; j < e.size(); j++)
            {
                getLoaderManager().a(e.keyAt(j), this);
            }

        }
    }
}
