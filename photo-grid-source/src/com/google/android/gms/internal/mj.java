// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            pj, pb, mo, mm, 
//            qa, ml, mk, pa

public abstract class mj extends pj
{

    protected final mo a;
    protected final Context b;
    protected final Object c = new Object();
    protected final Object d = new Object();
    protected final pb e;
    protected AdResponseParcel f;

    protected mj(Context context, pb pb1, mo mo1)
    {
        super(true);
        b = context;
        e = pb1;
        f = pb1.b;
        a = mo1;
    }

    protected abstract pa a(int i);

    protected abstract void a(long l);

    protected final void a(pa pa)
    {
        a.zzb(pa);
    }

    public void onStop()
    {
    }

    public void zzbn()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        int i;
        zzb.zzaF("AdRendererBackgroundTask started.");
        i = e.e;
        a(SystemClock.elapsedRealtime());
_L3:
        pa pa = a(i);
        qa.a.post(new ml(this, pa));
        return;
        Object obj1;
        obj1;
        i = ((mm) (obj1)).a();
        if (i != 3 && i != -1) goto _L2; else goto _L1
_L1:
        zzb.zzaG(((mm) (obj1)).getMessage());
_L4:
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        f = new AdResponseParcel(i);
_L5:
        qa.a.post(new mk(this));
          goto _L3
_L2:
        zzb.zzaH(((mm) (obj1)).getMessage());
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        f = new AdResponseParcel(i, f.zzzc);
          goto _L5
    }
}
