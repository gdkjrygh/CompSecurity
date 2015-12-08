// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.ry;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh, a

public class zzg extends zzh
{

    private jb a;
    private je b;
    private final zzn c;
    private zzh d;
    private boolean e;
    private Object f;

    private zzg(Context context, zzn zzn1, ad ad)
    {
        super(context, zzn1, null, ad, null, null, null);
        e = false;
        f = new Object();
        c = zzn1;
    }

    public zzg(Context context, zzn zzn1, ad ad, jb jb1)
    {
        this(context, zzn1, ad);
        a = jb1;
    }

    public zzg(Context context, zzn zzn1, ad ad, je je1)
    {
        this(context, zzn1, ad);
        b = je1;
    }

    public void recordImpression()
    {
        bl.b("recordImpression must be called on the main UI thread.");
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        a();
        if (d == null) goto _L2; else goto _L1
_L1:
        d.recordImpression();
_L5:
        c.recordImpression();
        return;
_L2:
        if (a == null || a.k()) goto _L4; else goto _L3
_L3:
        a.i();
          goto _L5
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call recordImpression", ((Throwable) (obj1)));
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

    public a zza(android.view.View.OnClickListener onclicklistener)
    {
        return null;
    }

    public void zza(View view, Map map, JSONObject jsonobject, JSONObject jsonobject1)
    {
        bl.b("performClick must be called on the main UI thread.");
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        d.zza(view, map, jsonobject, jsonobject1);
_L3:
        c.onAdClicked();
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
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call performClick", view);
          goto _L3
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public void zzb(zzh zzh1)
    {
        synchronized (f)
        {
            d = zzh1;
        }
        return;
        zzh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzh1;
    }

    public boolean zzdB()
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

    public ry zzdC()
    {
        return null;
    }

    public void zzh(View view)
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
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call prepareAd", view);
          goto _L4
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }
}
