// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cs, by

private static class Zq
{

    private by ZV;
    private com.google.android.gms.internal.b.ZV Zq;

    public int getSize()
    {
        int j = ((com.google.android.gms.internal.b)ZV.getObject()).F();
        int i;
        if (Zq == null)
        {
            i = 0;
        } else
        {
            i = Zq.F();
        }
        return i + j;
    }

    public com.google.android.gms.internal.b lf()
    {
        return Zq;
    }

    public by lz()
    {
        return ZV;
    }

    public (by by1, com.google.android.gms.internal.b b1)
    {
        ZV = by1;
        Zq = b1;
    }
}
