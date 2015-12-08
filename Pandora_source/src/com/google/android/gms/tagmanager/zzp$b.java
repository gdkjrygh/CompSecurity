// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf, zzp

private class <init>
    implements zzbf
{

    final zzp a;

    public void a()
    {
    }

    public void a(com.google.android.gms.internal.za za)
    {
        com.google.android.gms.internal.j j;
        if (za.zzaGM != null)
        {
            j = za.zzaGM;
        } else
        {
            com.google.android.gms.internal.f f = za.zzhh;
            j = new com.google.android.gms.internal.j();
            j.zzhh = f;
            j.zzhg = null;
            j.zzhi = f.version;
        }
        zzp.zza(a, j, za.zzaGL, true);
    }

    public void a(za za)
    {
        if (!zzp.zzh(a))
        {
            zzp.zza(a, 0L);
        }
    }

    public void a(Object obj)
    {
        a((com.google.android.gms.internal.za)obj);
    }

    private za(zzp zzp1)
    {
        a = zzp1;
        super();
    }

    a(zzp zzp1, a a1)
    {
        this(zzp1);
    }
}
