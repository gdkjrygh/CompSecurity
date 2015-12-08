// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznx;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzan, zzf

public class zzk extends zzd
{

    private final zznx a = new zznx();

    zzk(zzf zzf)
    {
        super(zzf);
    }

    protected void a()
    {
        r().a().a(a);
        b();
    }

    public void b()
    {
        Object obj = v();
        String s = ((zzan) (obj)).c();
        if (s != null)
        {
            a.a(s);
        }
        obj = ((zzan) (obj)).b();
        if (obj != null)
        {
            a.b(((String) (obj)));
        }
    }

    public zznx c()
    {
        D();
        return a;
    }
}
