// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseIntArray;

public final class ioo extends mmi
{

    private static final SparseIntArray ad;

    public ioo()
    {
    }

    public final SparseIntArray r()
    {
        return ad;
    }

    static 
    {
        SparseIntArray sparseintarray = new SparseIntArray();
        ad = sparseintarray;
        sparseintarray.append(1, q.aQ);
        ad.append(2, q.aP);
        ad.append(3, q.aO);
        ad.append(16, q.aN);
        ad.append(4, q.aM);
        ad.append(17, q.aL);
    }
}
