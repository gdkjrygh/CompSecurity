// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            pj, op, os, wg, 
//            pb, ol, is, or, 
//            on, oo

public final class om extends pj
    implements op, os
{

    private final pb a;
    private final Context b;
    private final ol c;
    private final os d;
    private final Object e = new Object();
    private final String f;
    private final String g;
    private final String h;
    private int i;
    private int j;

    public om(Context context, String s, String s1, String s2, pb pb1, ol ol1, os os1)
    {
        i = 0;
        j = 3;
        b = context;
        f = s;
        h = s1;
        g = s2;
        a = pb1;
        c = ol1;
        d = os1;
    }

    static String a(om om1)
    {
        return om1.g;
    }

    private boolean a(long l)
    {
        l = 20000L - (zzp.zzbz().b() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            e.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    static String b(om om1)
    {
        return om1.f;
    }

    static Context c(om om1)
    {
        return om1.b;
    }

    static String d(om om1)
    {
        return om1.h;
    }

    public final void a()
    {
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = a.a.zzEn;
        is is1 = c.a();
        try
        {
            is1.a(adrequestparcel, g);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Fail to load ad from adapter.", remoteexception);
        }
        a(0);
    }

    public final void a(int k)
    {
        synchronized (e)
        {
            i = 2;
            j = k;
            e.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(String s)
    {
        synchronized (e)
        {
            i = 1;
            e.notify();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        a(0);
    }

    public final void onStop()
    {
    }

    public final void zzbn()
    {
        or or1;
        Object obj;
        is is1;
        if (c == null || c.b() == null || c.a() == null)
        {
            return;
        }
        or1 = c.b();
        or1.a(this);
        or1.a(this);
        obj = a.a.zzEn;
        is1 = c.a();
        if (!is1.g()) goto _L2; else goto _L1
_L1:
        zza.zzJt.post(new on(this, is1, ((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj))));
_L5:
        long l = zzp.zzbz().b();
_L6:
        obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (i == 0) goto _L4; else goto _L3
_L3:
        or1.a(null);
        or1.a(null);
        Exception exception;
        if (i == 1)
        {
            d.a(f);
            return;
        } else
        {
            d.a(j);
            return;
        }
_L2:
        try
        {
            zza.zzJt.post(new oo(this, is1, ((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj)), or1));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzd("Fail to check if adapter is initialized.", ((Throwable) (obj)));
            a(0);
        }
          goto _L5
_L4:
        if (a(l))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        obj;
        JVM INSTR monitorexit ;
          goto _L3
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
          goto _L6
    }
}
