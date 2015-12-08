// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            ey, hs, zzfx, gw

public class ez extends ey
{

    ez(Context context, gl.a a, hs hs1, fb.a a1)
    {
        super(context, a, hs1, a1);
    }

    protected void b(long l)
        throws fa.a
    {
        Object obj = d.h();
        int i;
        int j;
        if (((AdSizeParcel) (obj)).zzsH)
        {
            j = c.getResources().getDisplayMetrics().widthPixels;
            i = c.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            j = ((AdSizeParcel) (obj)).widthPixels;
            i = ((AdSizeParcel) (obj)).heightPixels;
        }
        obj = new zzfx(this, d, j, i);
        gw.a.post(new zzfy._cls1(this, ((zzfx) (obj))));
        a(l);
        if (((zzfx) (obj)).c())
        {
            zzb.zzaC("Ad-Network indicated no fill with passback URL.");
            throw new fa.a("AdNetwork sent passback url", 3);
        }
        if (!((zzfx) (obj)).d())
        {
            throw new fa.a("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }
}
