// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            zzbv, zzkf

static final class nit> extends zzbv
{

    public Object zza(SharedPreferences sharedpreferences)
    {
        return zzd(sharedpreferences);
    }

    public zzkf zzcZ()
    {
        return zzkf.zza(getKey(), (Long)zzcY());
    }

    public Long zzd(SharedPreferences sharedpreferences)
    {
        return Long.valueOf(sharedpreferences.getLong(getKey(), ((Long)zzcY()).longValue()));
    }

    (String s, Long long1)
    {
        super(s, long1, null);
    }
}
