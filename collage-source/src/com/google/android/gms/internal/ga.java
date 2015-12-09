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
//            gs, gc, gf, fz, 
//            dj, ix, ge

public class ga extends gs
    implements gc, gf
{

    private final gl.a a;
    private final Context b;
    private final fz c;
    private final gf d;
    private final Object e = new Object();
    private final String f;
    private final String g;
    private final String h;
    private int i;
    private int j;

    public ga(Context context, String s, String s1, String s2, gl.a a1, fz fz1, gf gf1)
    {
        i = 0;
        j = 3;
        b = context;
        f = s;
        h = s1;
        g = s2;
        a = a1;
        c = fz1;
        d = gf1;
    }

    static String a(ga ga1)
    {
        return ga1.g;
    }

    static String b(ga ga1)
    {
        return ga1.f;
    }

    private void b(long l)
    {
_L1:
label0:
        {
            synchronized (e)
            {
                if (i == 0)
                {
                    break label0;
                }
            }
            return;
        }
        if (a(l))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
          goto _L1
    }

    static Context c(ga ga1)
    {
        return ga1.b;
    }

    static String d(ga ga1)
    {
        return ga1.h;
    }

    public void a()
    {
        c.b();
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = a.a.zzDy;
        dj dj1 = c.a();
        try
        {
            dj1.a(adrequestparcel, g);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Fail to load ad from adapter.", remoteexception);
        }
        a(f, 0);
    }

    public void a(int k)
    {
        a(f, 0);
    }

    public void a(String s)
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

    public void a(String s, int k)
    {
        synchronized (e)
        {
            i = 2;
            j = k;
            e.notify();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean a(long l)
    {
        l = 20000L - (zzp.zzbB().b() - l);
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

    public void onStop()
    {
    }

    public void zzdG()
    {
        ge ge1;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel;
        dj dj1;
        if (c == null || c.b() == null || c.a() == null)
        {
            return;
        }
        ge1 = c.b();
        ge1.a(this);
        ge1.a(this);
        adrequestparcel = a.a.zzDy;
        dj1 = c.a();
        if (!dj1.g())
        {
            break MISSING_BLOCK_LABEL_135;
        }
        zza.zzIy.post(new zzgz._cls1(this, dj1, adrequestparcel));
_L1:
        b(zzp.zzbB().b());
        ge1.a(null);
        ge1.a(null);
        RemoteException remoteexception;
        if (i == 1)
        {
            d.a(f);
            return;
        } else
        {
            d.a(f, j);
            return;
        }
        try
        {
            zza.zzIy.post(new zzgz._cls2(this, dj1, adrequestparcel, ge1));
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Fail to check if adapter is initialized.", remoteexception);
            a(f, 0);
        }
          goto _L1
    }
}
