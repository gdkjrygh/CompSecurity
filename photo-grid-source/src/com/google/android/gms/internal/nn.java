// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            sf, pe, ry, nt, 
//            dm, nj, zzja, fo, 
//            cn, dk

final class nn
    implements Runnable
{

    final Context a;
    final AdRequestInfoParcel b;
    final nt c;
    final dm d;
    final dk e;
    final String f;
    final cn g;

    nn(Context context, AdRequestInfoParcel adrequestinfoparcel, nt nt1, dm dm1, dk dk, String s, cn cn1)
    {
        a = context;
        b = adrequestinfoparcel;
        c = nt1;
        d = dm1;
        e = dk;
        f = s;
        g = cn1;
        super();
    }

    public final void run()
    {
        zzp.zzbw();
        ry ry1 = sf.a(a, new AdSizeParcel(), false, false, null, b.zzqj);
        if (zzp.zzby().j())
        {
            ry1.clearCache(true);
        }
        ry1.a().setWillNotDraw(true);
        c.a = ry1;
        d.a(e, new String[] {
            "rwc"
        });
        Object obj = d.a();
        obj = nj.a(f, d, ((dk) (obj)));
        zzja zzja1 = ry1.k();
        zzja1.zza("/invalidRequest", c.c);
        zzja1.zza("/loadAdURL", c.d);
        zzja1.zza("/log", fo.h);
        zzja1.zza(((sb) (obj)));
        zzb.zzaF("Loading the JS library.");
        ry1.loadUrl(g.a());
    }
}
