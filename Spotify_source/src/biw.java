// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public abstract class biw extends cjc
    implements biu
{

    private final AdRequestInfoParcel a;
    private final biu b;
    private final Object c = new Object();
    private AdResponseParcel d;

    public biw(AdRequestInfoParcel adrequestinfoparcel, biu biu1)
    {
        a = adrequestinfoparcel;
        b = biu1;
    }

    private boolean a(long l)
    {
        l = 60000L - (bkv.i().b() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            c.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    private boolean a(bje bje1, AdRequestInfoParcel adrequestinfoparcel)
    {
        bje1.a(adrequestinfoparcel, new bjb(this));
        return true;
        bje1;
        bka.c("Could not fetch ad response from ad request service.", bje1);
        bkv.h().a(bje1, true);
_L2:
        b.a(new AdResponseParcel(0));
        return false;
        bje1;
        bka.c("Could not fetch ad response from ad request service due to an Exception.", bje1);
        bkv.h().a(bje1, true);
        continue; /* Loop/switch isn't completed */
        bje1;
        bka.c("Could not fetch ad response from ad request service due to an Exception.", bje1);
        bkv.h().a(bje1, true);
        continue; /* Loop/switch isn't completed */
        bje1;
        bka.c("Could not fetch ad response from ad request service due to an Exception.", bje1);
        bkv.h().a(bje1, true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a()
    {
        Object obj = d();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new AdResponseParcel(0);
        b.a(((AdResponseParcel) (obj)));
_L4:
        e_();
        return;
_L2:
        if (!a(((bje) (obj)), a)) goto _L4; else goto _L3
_L3:
        long l = bkv.i().b();
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        JVM INSTR monitorenter ;
_L6:
        synchronized (c)
        {
            if (d == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            b.a(d);
        }
          goto _L4
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        obj1;
        e_();
        throw obj1;
        if (a(l)) goto _L6; else goto _L7
_L7:
        if (d == null) goto _L9; else goto _L8
_L8:
        b.a(d);
_L10:
        obj1;
        JVM INSTR monitorexit ;
          goto _L4
_L9:
        b.a(new AdResponseParcel(0));
          goto _L10
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        synchronized (c)
        {
            d = adresponseparcel;
            c.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    public final void b()
    {
        e_();
    }

    public abstract bje d();

    public abstract void e_();
}
