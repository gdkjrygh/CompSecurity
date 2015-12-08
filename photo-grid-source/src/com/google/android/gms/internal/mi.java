// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            me, ry, mg, zzja, 
//            pb, mo

public final class mi extends me
{

    private mg g;

    mi(Context context, pb pb, ry ry1, mo mo)
    {
        super(context, pb, ry1, mo);
    }

    protected final void a()
    {
        Object obj = c.j();
        int i;
        int j;
        if (((AdSizeParcel) (obj)).zztf)
        {
            obj = b.getResources().getDisplayMetrics();
            i = ((DisplayMetrics) (obj)).widthPixels;
            j = ((DisplayMetrics) (obj)).heightPixels;
        } else
        {
            i = ((AdSizeParcel) (obj)).widthPixels;
            j = ((AdSizeParcel) (obj)).heightPixels;
        }
        g = new mg(this, c, i, j, (byte)0);
        c.k().zza(this);
        g.a(e);
    }

    protected final int b()
    {
        if (g.c())
        {
            zzb.zzaF("Ad-Network indicated no fill with passback URL.");
            return 3;
        }
        return g.d() ? -2 : 2;
    }
}
