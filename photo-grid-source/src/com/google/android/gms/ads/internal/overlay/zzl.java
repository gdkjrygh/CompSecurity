// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import com.google.android.gms.internal.dk;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.wn;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzj, zzc, zzp, zzi

public class zzl
    implements zzj
{

    public zzl()
    {
    }

    public zzi zza(Context context, ry ry1, int i, dm dm, dk dk)
    {
        if (!wn.c())
        {
            return null;
        } else
        {
            return new zzc(context, new zzp(context, ry1.n(), ry1.t(), dm, dk));
        }
    }
}
