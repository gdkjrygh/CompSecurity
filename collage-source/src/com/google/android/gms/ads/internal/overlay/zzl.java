// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import com.google.android.gms.internal.bc;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.hs;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzj, zzc, zzp, zzi

public class zzl
    implements zzj
{

    public zzl()
    {
    }

    public zzi zza(Context context, hs hs1, int i, bd bd, bc bc)
    {
        return new zzc(context, new zzp(context, hs1.l(), hs1.getRequestId(), bd, bc));
    }
}
