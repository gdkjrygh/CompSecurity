// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            zzbx, zzki

static final class nit> extends zzbx
{

    public final Object zza(Bundle bundle)
    {
        return zzc(bundle);
    }

    public final zzki zzbZ()
    {
        return zzki.zza(getKey(), (Integer)zzbY());
    }

    public final Integer zzc(Bundle bundle)
    {
        return Integer.valueOf(bundle.getInt(getKey(), ((Integer)zzbY()).intValue()));
    }

    (String s, Integer integer)
    {
        super(s, integer, null);
    }
}
