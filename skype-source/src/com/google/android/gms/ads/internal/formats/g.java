// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.dk;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.o;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            h, b

public final class g extends h
{

    private dk a;
    private dl b;
    private final n c;
    private h d;
    private boolean e;
    private Object f;

    private g(Context context, n n1, o o)
    {
        super(context, n1, null, o, null, null, null);
        e = false;
        f = new Object();
        c = n1;
    }

    public g(Context context, n n1, o o, dk dk1)
    {
        this(context, n1, o);
        a = dk1;
    }

    public g(Context context, n n1, o o, dl dl1)
    {
        this(context, n1, o);
        b = dl1;
    }

    public final com.google.android.gms.ads.internal.formats.b a(android.view.View.OnClickListener onclicklistener)
    {
        return null;
    }

    public final void a()
    {
        y.b("recordImpression must be called on the main UI thread.");
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        d();
        if (d == null) goto _L2; else goto _L1
_L1:
        d.a();
_L5:
        c.q();
        return;
_L2:
        if (a == null || a.k()) goto _L4; else goto _L3
_L3:
        a.i();
          goto _L5
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to call recordImpression", ((Throwable) (obj1)));
          goto _L5
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L4:
        if (b == null || b.i()) goto _L5; else goto _L6
_L6:
        b.g();
          goto _L5
    }

    public final void a(View view)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        e = true;
        if (a == null) goto _L2; else goto _L1
_L1:
        a.b(com.google.android.gms.b.d.a(view));
_L4:
        e = false;
        return;
_L2:
        if (b == null) goto _L4; else goto _L3
_L3:
        b.b(com.google.android.gms.b.d.a(view));
          goto _L4
        view;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to call prepareAd", view);
          goto _L4
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public final void a(View view, Map map)
    {
        y.b("performClick must be called on the main UI thread.");
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        d.a(view, map);
_L3:
        c.e();
        return;
_L2:
        if (a != null && !a.k())
        {
            a.a(com.google.android.gms.b.d.a(view));
        }
        if (b != null && !b.i())
        {
            a.a(com.google.android.gms.b.d.a(view));
        }
          goto _L3
        view;
        com.google.android.gms.ads.internal.util.client.b.b("Failed to call performClick", view);
          goto _L3
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public final void a(h h1)
    {
        synchronized (f)
        {
            d = h1;
        }
        return;
        h1;
        obj;
        JVM INSTR monitorexit ;
        throw h1;
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (f)
        {
            flag = e;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final hi c()
    {
        return null;
    }
}
