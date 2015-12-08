// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterSectionInfo, Feature

public static final class zzJF
{

    private final String mName;
    private String zzJD;
    private boolean zzJE;
    private int zzJF;
    private boolean zzJG;
    private String zzJH;
    private final List zzJI = new ArrayList();
    private BitSet zzJJ;
    private String zzJK;

    public zzJF zzJ(boolean flag)
    {
        zzJE = flag;
        return this;
    }

    public zzJE zzK(boolean flag)
    {
        zzJG = flag;
        return this;
    }

    public zzJG zzaa(int i)
    {
        if (zzJJ == null)
        {
            zzJJ = new BitSet();
        }
        zzJJ.set(i);
        return this;
    }

    public zzJJ zzbd(String s)
    {
        zzJD = s;
        return this;
    }

    public zzJD zzbe(String s)
    {
        zzJK = s;
        return this;
    }

    public RegisterSectionInfo zzjG()
    {
        int i = 0;
        int ai[] = null;
        if (zzJJ != null)
        {
            int ai1[] = new int[zzJJ.cardinality()];
            int j = zzJJ.nextSetBit(0);
            do
            {
                ai = ai1;
                if (j < 0)
                {
                    break;
                }
                ai1[i] = j;
                j = zzJJ.nextSetBit(j + 1);
                i++;
            } while (true);
        }
        return new RegisterSectionInfo(mName, zzJD, zzJE, zzJF, zzJG, zzJH, (Feature[])zzJI.toArray(new Feature[zzJI.size()]), ai, zzJK);
    }

    public (String s)
    {
        mName = s;
        zzJF = 1;
    }
}
