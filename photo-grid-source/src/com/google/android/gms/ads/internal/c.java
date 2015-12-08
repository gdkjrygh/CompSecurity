// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.ry;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzq, zzp, zze, 
//            d, e

final class c
    implements Runnable
{

    final pb a;
    final dm b;
    final zzc c;

    c(zzc zzc1, pb pb1, dm dm)
    {
        c = zzc1;
        a = pb1;
        b = dm;
        super();
    }

    public final void run()
    {
        if (a.b.zzET && c.f.o != null)
        {
            Object obj = null;
            if (a.b.zzBF != null)
            {
                zzp.zzbv();
                obj = qa.a(a.b.zzBF);
            }
            obj = new dn(c, ((String) (obj)), a.b.body);
            c.f.zzqH = 1;
            try
            {
                c.f.o.a(((com.google.android.gms.internal.dp) (obj)));
                return;
            }
            catch (RemoteException remoteexception)
            {
                zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
            }
        }
        Object obj1 = new zze();
        ry ry1 = c.a(a, ((zze) (obj1)));
        ((zze) (obj1)).zza(new zze.zzb(a, ry1));
        ry1.setOnTouchListener(new d(this, ((zze) (obj1))));
        ry1.setOnClickListener(new e(this, ((zze) (obj1))));
        c.f.zzqH = 0;
        obj1 = c.f;
        zzp.zzbu();
        obj1.zzqm = mn.a(c.f.context, c, a, c.f.b, ry1, c.j, c, b);
    }
}
