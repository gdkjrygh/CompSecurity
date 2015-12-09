// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            gs, gl, gw, hs

public abstract class fa extends gs
{

    protected final fb.a b;
    protected final Context c;
    protected final hs d;
    protected final Object e = new Object();
    protected final Object f = new Object();
    protected final gl.a g;
    protected AdResponseParcel h;

    protected fa(Context context, gl.a a1, hs hs, fb.a a2)
    {
        c = context;
        g = a1;
        h = a1.b;
        d = hs;
        b = a2;
    }

    protected gl a(int i)
    {
        AdRequestInfoParcel adrequestinfoparcel = g.a;
        return new gl(adrequestinfoparcel.zzDy, d, h.zzyw, i, h.zzyx, h.zzDZ, h.orientation, h.zzyA, adrequestinfoparcel.zzDB, h.zzDX, null, null, null, null, null, h.zzDY, g.d, h.zzDW, g.f, h.zzEb, h.zzEc, g.h, null, adrequestinfoparcel.zzDO);
    }

    protected void a(gl gl1)
    {
        b.zzb(gl1);
    }

    protected abstract void b(long l)
        throws a;

    public void onStop()
    {
    }

    public void zzdG()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        int i;
        zzb.zzaC("AdRendererBackgroundTask started.");
        i = g.e;
        b(SystemClock.elapsedRealtime());
_L3:
        gl gl1 = a(i);
        gw.a.post(new zzfz._cls2(this, gl1));
        return;
        Object obj1;
        obj1;
    /* block-local class not found */
    class a {}

        i = ((a) (obj1)).a();
        if (i != 3 && i != -1) goto _L2; else goto _L1
_L1:
        zzb.zzaD(((a) (obj1)).getMessage());
_L4:
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        h = new AdResponseParcel(i);
_L5:
        gw.a.post(new zzfz._cls1(this));
          goto _L3
_L2:
        zzb.zzaE(((a) (obj1)).getMessage());
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        h = new AdResponseParcel(i, h.zzyA);
          goto _L5
    }
}
