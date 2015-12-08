// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzcu, zzic, zzhx, 
//            zzel

static final class 
    implements zzcv
{

    public final void zza(zzic zzic1, Map map)
    {
        zzic1 = zzic1.zzeF();
        if (zzic1 == null)
        {
            zzhx.zzac("A GMSG tried to close something that wasn't an overlay.");
            return;
        } else
        {
            zzic1.close();
            return;
        }
    }

    ()
    {
    }
}
