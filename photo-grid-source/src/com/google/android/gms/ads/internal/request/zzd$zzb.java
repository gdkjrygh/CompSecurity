// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.qz;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzd, zze, AdRequestInfoParcel, zzj

public class  extends zzd
    implements k, l
{

    protected zze a;
    private Context b;
    private AdRequestInfoParcel c;
    private final tInfoParcel d;
    private final Object e = new Object();
    private boolean f;

    public void onConnected(Bundle bundle)
    {
        zzgz();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzb.zzaF("Cannot connect to remote service, fallback to local instance.");
        (new <init>(b, c, d)).zzgz();
        connectionresult = new Bundle();
        connectionresult.putString("action", "gms_connection_failed_fallback_to_local");
        zzp.zzbv();
        qa.b(b, c.zzqj.zzJu, "gmob-apps", connectionresult, true);
    }

    public void onConnectionSuspended(int i)
    {
        zzb.zzaF("Disconnected from remote ad request service.");
    }

    public void zzfH()
    {
        synchronized (e)
        {
            if (a.isConnected() || a.isConnecting())
            {
                a.disconnect();
            }
            Binder.flushPendingCommands();
            if (f)
            {
                zzp.zzbG().b();
                f = false;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzj zzfI()
    {
        obj;
        JVM INSTR monitorenter ;
        zzj zzj;
        synchronized (e)
        {
            zzj = a.zzfM();
        }
        return zzj;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public tInfoParcel(Context context, AdRequestInfoParcel adrequestinfoparcel, tInfoParcel tinfoparcel)
    {
        super(adrequestinfoparcel, tinfoparcel);
        b = context;
        c = adrequestinfoparcel;
        d = tinfoparcel;
        tinfoparcel = cy.A;
        if (((Boolean)zzp.zzbE().a(tinfoparcel)).booleanValue())
        {
            f = true;
            tinfoparcel = zzp.zzbG().a();
        } else
        {
            tinfoparcel = context.getMainLooper();
        }
        a = new zze(context, tinfoparcel, this, this, adrequestinfoparcel.zzqj.zzJw);
        a.zzoZ();
    }
}
