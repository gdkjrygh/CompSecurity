// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            ct, bz

private static class asN
{

    private com.google.android.gms.internal.b.asN asN;
    private bz ats;

    public int getSize()
    {
        int j = ((com.google.android.gms.internal.b)ats.getObject()).Y();
        int i;
        if (asN == null)
        {
            i = 0;
        } else
        {
            i = asN.Y();
        }
        return i + j;
    }

    public bz qG()
    {
        return ats;
    }

    public com.google.android.gms.internal.b qm()
    {
        return asN;
    }

    public (bz bz1, com.google.android.gms.internal.b b1)
    {
        ats = bz1;
        asN = b1;
    }
}
