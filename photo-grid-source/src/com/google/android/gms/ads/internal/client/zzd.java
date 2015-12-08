// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.internal.io;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzr, zzl, zzq

public final class zzd extends e
{

    private static final zzd a = new zzd();

    private zzd()
    {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    private zzq a(Context context, String s, io io)
    {
        com.google.android.gms.b.a a1 = d.a(context);
        context = zzq.zza.zzi(((zzr)a(context)).zza(a1, s, io, 0x7bd338));
        return context;
        context;
        zzb.zzd("Could not create remote builder for AdLoader.", context);
_L2:
        return null;
        context;
        zzb.zzd("Could not create remote builder for AdLoader.", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static zzq zza(Context context, String s, io io)
    {
        Object obj;
label0:
        {
            if (zzl.zzcF().zzR(context))
            {
                zzq zzq = a.a(context, s, io);
                obj = zzq;
                if (zzq != null)
                {
                    break label0;
                }
            }
            zzb.zzaF("Using AdLoader from the client jar.");
            obj = new zzj(context, s, io, new VersionInfoParcel(0x7bd338, 0x7bd338, true));
        }
        return ((zzq) (obj));
    }

    protected final Object a(IBinder ibinder)
    {
        return com.google.android.gms.ads.internal.client.zzr.zza.zzj(ibinder);
    }

}
