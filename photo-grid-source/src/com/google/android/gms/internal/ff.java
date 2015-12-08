// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.formats.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.d;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.internal:
//            ed, eb, ee, ea

public final class ff extends e
{

    public ff()
    {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    private ea b(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
        com.google.android.gms.b.a a1 = d.a(context);
        framelayout = d.a(framelayout);
        framelayout1 = d.a(framelayout1);
        context = eb.zzu(((ed)a(context)).a(a1, framelayout, framelayout1, 0x7bd338));
        return context;
        context;
_L2:
        zzb.zzd("Could not create remote NativeAdViewDelegate.", context);
        return null;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final ea a(Context context, FrameLayout framelayout, FrameLayout framelayout1)
    {
label0:
        {
            if (zzl.zzcF().zzR(context))
            {
                ea ea = b(context, framelayout, framelayout1);
                context = ea;
                if (ea != null)
                {
                    break label0;
                }
            }
            zzb.zzaF("Using NativeAdViewDelegate from the client jar.");
            context = new zzj(framelayout, framelayout1);
        }
        return context;
    }

    protected final Object a(IBinder ibinder)
    {
        return ee.a(ibinder);
    }
}
