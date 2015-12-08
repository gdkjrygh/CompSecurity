// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.pe;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzb, zzi

final class b
    implements ServiceConnection
{

    final Context a;
    final zzi b;

    b(zzi zzi, Context context)
    {
        b = zzi;
        a = context;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        boolean flag = false;
        componentname = new zzb(a.getApplicationContext(), false);
        componentname.zzN(ibinder);
        int i = componentname.zza(3, a.getPackageName(), "inapp");
        ibinder = zzp.zzby();
        if (i == 0)
        {
            flag = true;
        }
        ibinder.b(flag);
        a.unbindService(this);
        componentname.destroy();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }
}
