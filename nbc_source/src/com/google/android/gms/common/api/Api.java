// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope

public final class Api
{
    public static final class ClientKey
    {

        public ClientKey()
        {
        }
    }

    public static interface zza
    {
    }

    public static interface zzc
    {
    }

    public static final class zzd
    {
    }


    private final String mName;
    private final ClientKey zzVu;
    private final zza zzWi;
    private final zzc zzWj = null;
    private final zzd zzWk = null;
    private final ArrayList zzWl;

    public transient Api(String s, zza zza1, ClientKey clientkey, Scope ascope[])
    {
        zzu.zzb(zza1, "Cannot construct an Api with a null ClientBuilder");
        zzu.zzb(clientkey, "Cannot construct an Api with a null ClientKey");
        mName = s;
        zzWi = zza1;
        zzVu = clientkey;
        zzWl = new ArrayList(Arrays.asList(ascope));
    }
}
