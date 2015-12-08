// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            Scope

public final class Api
{

    private final zza a;
    private final zzc b = null;
    private final ClientKey c;
    private final zzd d = null;
    private final ArrayList e;
    private final String f;

    public transient Api(String s, zza zza, ClientKey clientkey, Scope ascope[])
    {
        zzu.a(zza, "Cannot construct an Api with a null ClientBuilder");
        zzu.a(clientkey, "Cannot construct an Api with a null ClientKey");
        f = s;
        a = zza;
        c = clientkey;
        e = new ArrayList(Arrays.asList(ascope));
    }

    public zza a()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return a;
    }

    public zzc b()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return b;
    }

    public List c()
    {
        return e;
    }

    public ClientKey d()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return c;
    }

    public boolean e()
    {
        return d != null;
    }

    public String f()
    {
        return f;
    }
}
