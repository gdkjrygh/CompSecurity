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
        return zzc(sharedpreferences);
    }

    public Integer zzc(SharedPreferences sharedpreferences)
    {
        return Integer.valueOf(sharedpreferences.getInt(getKey(), ((Integer)zzcY()).intValue()));
    }

    public zzkf zzcZ()
    {
        return zzkf.zza(getKey(), (Integer)zzcY());
    }

    (String s, Integer integer)
    {
        super(s, integer, null);
    }
}
