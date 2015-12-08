// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            bj

public class bk
    implements com.google.android.gms.ads.formats.NativeAd.Image
{

    private final bj a;
    private final Drawable b;
    private final Uri c;

    public bk(bj bj1)
    {
        Object obj;
        obj = null;
        super();
        a = bj1;
        bj1 = a.zzdr();
        if (bj1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        bj1 = (Drawable)com.google.android.gms.a.b.a(bj1);
_L1:
        b = bj1;
        try
        {
            bj1 = a.getUri();
        }
        // Misplaced declaration of an exception variable
        catch (bj bj1)
        {
            zzb.zzb("Failed to get uri.", bj1);
            bj1 = obj;
        }
        c = bj1;
        return;
        bj1;
        zzb.zzb("Failed to get drawable.", bj1);
        bj1 = null;
          goto _L1
    }

    public Drawable getDrawable()
    {
        return b;
    }

    public Uri getUri()
    {
        return c;
    }
}
