// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.d;

// Referenced classes of package com.google.android.gms.internal:
//            dw

public final class dz extends com.google.android.gms.ads.formats.NativeAd.Image
{

    private final dw a;
    private final Drawable b;
    private final Uri c;
    private final double d;

    public dz(dw dw1)
    {
        Object obj;
        obj = null;
        super();
        a = dw1;
        dw1 = a.zzdv();
        if (dw1 == null) goto _L2; else goto _L1
_L1:
        dw1 = (Drawable)com.google.android.gms.b.d.a(dw1);
_L3:
        b = dw1;
        double d1;
        double d2;
        try
        {
            dw1 = a.getUri();
        }
        // Misplaced declaration of an exception variable
        catch (dw dw1)
        {
            zzb.zzb("Failed to get uri.", dw1);
            dw1 = obj;
        }
        c = dw1;
        d1 = 1.0D;
        d2 = a.getScale();
        d1 = d2;
_L4:
        d = d1;
        return;
        dw1;
        zzb.zzb("Failed to get drawable.", dw1);
_L2:
        dw1 = null;
          goto _L3
        dw1;
        zzb.zzb("Failed to get scale.", dw1);
          goto _L4
    }

    public final Drawable getDrawable()
    {
        return b;
    }

    public final double getScale()
    {
        return d;
    }

    public final Uri getUri()
    {
        return c;
    }
}
