// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.aa;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzj

public class zze extends aa
{

    final int a;

    public zze(Context context, Looper looper, k k, l l, int j)
    {
        super(context, looper, 8, (new i(context)).a(), k, l);
        a = j;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return zzj.zza.zzX(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected final String b()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public zzj zzfM()
    {
        return (zzj)super.zzpc();
    }
}
