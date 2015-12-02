// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public abstract class agz extends aiw
{

    protected final ahc b;
    protected final Context c;
    protected final akk d;
    protected final Object e = new Object();
    protected final Object f = new Object();
    protected final aio g;
    protected AdResponseParcel h;

    protected agz(Context context, aio aio1, akk akk, ahc ahc1)
    {
        c = context;
        g = aio1;
        h = aio1.b;
        d = akk;
        b = ahc1;
    }

    protected ain a(int i)
    {
        AdRequestInfoParcel adrequestinfoparcel = g.a;
        return new ain(adrequestinfoparcel.c, d, h.d, i, h.f, h.j, h.l, h.k, adrequestinfoparcel.i, h.h, null, null, null, null, null, h.i, g.d, h.g, g.f, h.n, h.o, g.h, null, adrequestinfoparcel.x);
    }

    public final void a()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        int i;
        of.a("AdRendererBackgroundTask started.");
        i = g.e;
        b(SystemClock.elapsedRealtime());
_L3:
        ain ain1 = a(i);
        ajc.a.post(new _cls2(ain1));
        return;
        Object obj1;
        obj1;
        i = ((aha) (obj1)).a();
        if (i != 3 && i != -1) goto _L2; else goto _L1
_L1:
        of.c(((aha) (obj1)).getMessage());
_L4:
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        h = new AdResponseParcel(i);
_L5:
        ajc.a.post(new _cls1());
          goto _L3
_L2:
        of.e(((aha) (obj1)).getMessage());
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        h = new AdResponseParcel(i, h.k);
          goto _L5
    }

    protected void a(ain ain1)
    {
        b.a(ain1);
    }

    public void b()
    {
    }

    protected abstract void b(long l);

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
