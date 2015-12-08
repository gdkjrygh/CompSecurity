// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            gc, gt, ga, fs, 
//            fu, fx, fz, gl, 
//            fv, gd, fw, ft, 
//            gk

public abstract class fr
    implements b, gc
{

    public static final String c[] = {
        "service_esmobile", "service_googleme"
    };
    final Handler a;
    boolean b;
    private final Context d;
    private final Looper e;
    private IInterface f;
    private final ArrayList g;
    private fw h;
    private volatile int i;
    private final String j[];
    private final ga k;

    private transient fr(Context context, Looper looper, com.google.android.gms.common.api.b b1, c c1, String as[])
    {
        g = new ArrayList();
        i = 1;
        b = false;
        d = (Context)gt.a(context);
        e = (Looper)gt.a(looper, "Looper must not be null");
        k = new ga(looper, this);
        a = new fs(this, looper);
        j = as;
        context = (com.google.android.gms.common.api.b)gt.a(b1);
        k.a(context);
        context = (c)gt.a(c1);
        k.a(context);
    }

    protected transient fr(Context context, com.google.android.gms.common.c c1, d d1, String as[])
    {
        this(context, context.getMainLooper(), ((com.google.android.gms.common.api.b) (new fu(c1))), ((c) (new fx(d1))), as);
    }

    static int a(fr fr1, int l)
    {
        fr1.i = l;
        return l;
    }

    static IInterface a(fr fr1, IInterface iinterface)
    {
        fr1.f = iinterface;
        return iinterface;
    }

    static ga a(fr fr1)
    {
        return fr1.k;
    }

    static ArrayList b(fr fr1)
    {
        return fr1.g;
    }

    static IInterface c(fr fr1)
    {
        return fr1.f;
    }

    static fw d(fr fr1)
    {
        return fr1.h;
    }

    static Context e(fr fr1)
    {
        return fr1.d;
    }

    static fw f(fr fr1)
    {
        fr1.h = null;
        return null;
    }

    protected abstract IInterface a(IBinder ibinder);

    protected abstract String a();

    protected final void a(int l, IBinder ibinder, Bundle bundle)
    {
        a.sendMessage(a.obtainMessage(1, new fz(this, l, ibinder, bundle)));
    }

    protected abstract void a(gk gk, fv fv1);

    protected abstract String b();

    protected final void b(IBinder ibinder)
    {
        try
        {
            a(gl.a(ibinder), new fv(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
        }
    }

    public final void d()
    {
        b = true;
        i = 2;
        int l = com.google.android.gms.common.g.a(d);
        if (l != 0)
        {
            i = 1;
            a.sendMessage(a.obtainMessage(3, Integer.valueOf(l)));
        } else
        {
            if (h != null)
            {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                f = null;
                gd.a(d).b(a(), h);
            }
            h = new fw(this);
            if (!gd.a(d).a(a(), h))
            {
                Log.e("GmsClient", (new StringBuilder("unable to connect to service: ")).append(a()).toString());
                a.sendMessage(a.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    public final boolean e()
    {
        return i == 3;
    }

    public final boolean f()
    {
        return i == 2;
    }

    public final void g()
    {
        b = false;
        ArrayList arraylist = g;
        arraylist;
        JVM INSTR monitorenter ;
        int i1 = g.size();
        int l = 0;
_L2:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ft)g.get(l)).c();
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        g.clear();
        arraylist;
        JVM INSTR monitorexit ;
        i = 1;
        f = null;
        if (h != null)
        {
            gd.a(d).b(a(), h);
            h = null;
        }
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Context h()
    {
        return d;
    }

    protected final IInterface i()
    {
        if (!e())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return f;
        }
    }

    public final boolean j()
    {
        return b;
    }

}
