// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzco, zzbv

static class zzaAo
{

    private zzbv zzaAn;
    private com.google.android.gms.internal.b.zzaAo zzaAo;

    public int getSize()
    {
        int j = ((com.google.android.gms.internal.b)zzaAn.getObject()).zvX();
        int i;
        if (zzaAo == null)
        {
            i = 0;
        } else
        {
            i = zzaAo.zvX();
        }
        return i + j;
    }

    public zzbv zztJ()
    {
        return zzaAn;
    }

    public com.google.android.gms.internal.b zztK()
    {
        return zzaAo;
    }

    public (zzbv zzbv1, com.google.android.gms.internal.b b)
    {
        zzaAn = zzbv1;
        zzaAo = b;
    }
}
