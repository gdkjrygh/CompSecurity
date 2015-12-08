// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.a.b;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.formats.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            bm, bl

public class bx extends c
{

    public bx()
    {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    private bl b(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
        com.google.android.gms.a.a a1 = com.google.android.gms.a.b.a(context);
        framelayout = com.google.android.gms.a.b.a(framelayout);
        framelayout1 = com.google.android.gms.a.b.a(framelayout1);
        context = bl.a.zzu(((bm)zzar(context)).a(a1, framelayout, framelayout1, 0x7877d8));
        return context;
        context;
_L2:
        zzb.zzd("Could not create remote NativeAdViewDelegate.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public bl a(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
label0:
        {
            if (zzk.zzcE().zzR(context))
            {
                bl bl = b(context, framelayout, framelayout1);
                context = bl;
                if (bl != null)
                {
                    break label0;
                }
            }
            zzb.zzaC("Using NativeAdViewDelegate from the client jar.");
            context = new zzj(framelayout, framelayout1);
        }
        return context;
    }

    protected bm a(IBinder ibinder)
    {
        return bm.a.a(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return a(ibinder);
    }
}
